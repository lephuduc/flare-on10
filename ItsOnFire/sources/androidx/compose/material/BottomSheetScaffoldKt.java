package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aá\u0002\u0010\u0003\u001a\u00020\u00042\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0002\b\b2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\b2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00012 \b\u0002\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0002\b\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\u001f\u001a\u00020\u00162\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\u001b2\b\b\u0002\u0010#\u001a\u00020\u001b2\b\b\u0002\u0010$\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020\u001b2\b\b\u0002\u0010&\u001a\u00020\u001b2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\b\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001aw\u0010+\u001a\u00020\u00042\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\b2\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\b2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\b2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\b\b2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u0010\u0013\u001a\u00020\u0014H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102\u001a+\u00103\u001a\u00020\r2\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u00020\u0011H\u0007¢\u0006\u0002\u00109\u001a;\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020<2\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u0002000>2\u0014\b\u0002\u0010?\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u00160\u0006H\u0007¢\u0006\u0002\u0010@\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"FabEndSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "BottomSheetScaffold", "", "sheetContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/BottomSheetScaffoldState;", "topBar", "Lkotlin/Function0;", "snackbarHost", "Landroidx/compose/material/SnackbarHostState;", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", "sheetGesturesEnabled", "", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "sheetPeekHeight", "drawerContent", "drawerGesturesEnabled", "drawerShape", "drawerElevation", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/foundation/layout/PaddingValues;", "BottomSheetScaffold-bGncdBI", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomSheetScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLandroidx/compose/ui/graphics/Shape;FJJFLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;IIII)V", "BottomSheetScaffoldStack", "body", "bottomSheet", "bottomSheetOffset", "Landroidx/compose/runtime/State;", "", "BottomSheetScaffoldStack-SlNgfk0", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/State;ILandroidx/compose/runtime/Composer;I)V", "rememberBottomSheetScaffoldState", "drawerState", "Landroidx/compose/material/DrawerState;", "bottomSheetState", "Landroidx/compose/material/BottomSheetState;", "snackbarHostState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetScaffoldState;", "rememberBottomSheetState", "initialValue", "Landroidx/compose/material/BottomSheetValue;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmStateChange", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetState;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt {
    private static final float FabEndSpacing = Dp.m3325constructorimpl(16);

    /* JADX WARN: Removed duplicated region for block: B:398:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:681:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:724:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:743:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: BottomSheetScaffold-bGncdBI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m722BottomSheetScaffoldbGncdBI(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r69, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r70, @org.jetbrains.annotations.Nullable androidx.compose.material.BottomSheetScaffoldState r71, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r72, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r73, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r74, int r75, boolean r76, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r77, float r78, long r79, long r81, float r83, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r84, boolean r85, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Shape r86, float r87, long r88, long r90, long r92, long r94, long r96, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r98, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r99, int r100, int r101, int r102, int r103) {
        /*
            Method dump skipped, instructions count: 1676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.m722BottomSheetScaffoldbGncdBI(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, androidx.compose.material.BottomSheetScaffoldState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, int, boolean, androidx.compose.ui.graphics.Shape, float, long, long, float, kotlin.jvm.functions.Function3, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    @Composable
    /* renamed from: BottomSheetScaffoldStack-SlNgfk0 */
    public static final void m723BottomSheetScaffoldStackSlNgfk0(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, final State<Float> state, final int i2, Composer composer, int i3) {
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(1491542599);
        if ((i3 & 14) == 0) {
            i4 = (startRestartGroup.changed(function2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i4 |= startRestartGroup.changed(function22) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i4 |= startRestartGroup.changed(function23) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i4 |= startRestartGroup.changed(function24) ? 2048 : 1024;
        }
        if ((57344 & i3) == 0) {
            i4 |= startRestartGroup.changed(state) ? 16384 : 8192;
        }
        if ((458752 & i3) == 0) {
            i4 |= startRestartGroup.changed(i2) ? 131072 : 65536;
        }
        if (((374491 & i4) ^ 74898) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldStack$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i5) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i5);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i5) {
                    return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i5);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                @NotNull
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo6measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j2) {
                    Object first;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    first = CollectionsKt___CollectionsKt.first((List<? extends Object>) measurables);
                    Placeable mo2758measureBRTryo0 = ((Measurable) first).mo2758measureBRTryo0(j2);
                    return MeasureScope.DefaultImpls.layout$default(Layout, mo2758measureBRTryo0.getWidth(), mo2758measureBRTryo0.getHeight(), null, new BottomSheetScaffoldKt$BottomSheetScaffoldStack$2$measure$1(mo2758measureBRTryo0, measurables, state, i2, Layout, j2), 4, null);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i5) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i5);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i5) {
                    return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i5);
                }
            };
            startRestartGroup.startReplaceableGroup(1376089394);
            Modifier.Companion companion = Modifier.Companion;
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1065constructorimpl = Updater.m1065constructorimpl(startRestartGroup);
            Updater.m1072setimpl(m1065constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1072setimpl(m1065constructorimpl, density, companion2.getSetDensity());
            Updater.m1072setimpl(m1065constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1072setimpl(m1065constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1056boximpl(SkippableUpdater.m1057constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-526644304);
            function2.invoke(startRestartGroup, Integer.valueOf(i4 & 14));
            function22.invoke(startRestartGroup, Integer.valueOf((i4 >> 3) & 14));
            function23.invoke(startRestartGroup, Integer.valueOf((i4 >> 6) & 14));
            function24.invoke(startRestartGroup, Integer.valueOf((i4 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new BottomSheetScaffoldKt$BottomSheetScaffoldStack$3(function2, function22, function23, function24, state, i2, i3));
    }

    /* renamed from: access$BottomSheetScaffoldStack-SlNgfk0 */
    public static final /* synthetic */ void m724access$BottomSheetScaffoldStackSlNgfk0(Function2 function2, Function2 function22, Function2 function23, Function2 function24, State state, int i2, Composer composer, int i3) {
        m723BottomSheetScaffoldStackSlNgfk0(function2, function22, function23, function24, state, i2, composer, i3);
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(@Nullable DrawerState drawerState, @Nullable BottomSheetState bottomSheetState, @Nullable SnackbarHostState snackbarHostState, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(1807566285);
        if ((i3 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i3 & 2) != 0) {
            bottomSheetState = rememberBottomSheetState(BottomSheetValue.Collapsed, null, null, composer, 6, 6);
        }
        if ((i3 & 4) != 0) {
            composer.startReplaceableGroup(-3687241);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) rememberedValue;
        }
        composer.startReplaceableGroup(-3686095);
        boolean changed = composer.changed(drawerState) | composer.changed(bottomSheetState) | composer.changed(snackbarHostState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new BottomSheetScaffoldState(drawerState, bottomSheetState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) rememberedValue2;
        composer.endReplaceableGroup();
        return bottomSheetScaffoldState;
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final BottomSheetState rememberBottomSheetState(@NotNull BottomSheetValue initialValue, @Nullable AnimationSpec<Float> animationSpec, @Nullable Function1<? super BottomSheetValue, Boolean> function1, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(1877845424);
        if ((i3 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i3 & 4) != 0) {
            function1 = BottomSheetScaffoldKt$rememberBottomSheetState$1.INSTANCE;
        }
        BottomSheetState bottomSheetState = (BottomSheetState) RememberSaveableKt.m1078rememberSaveable(new Object[]{animationSpec}, BottomSheetState.Companion.Saver(animationSpec, function1), (String) null, (Function0<? extends Object>) new BottomSheetScaffoldKt$rememberBottomSheetState$2(initialValue, animationSpec, function1), composer, 72, 4);
        composer.endReplaceableGroup();
        return bottomSheetState;
    }
}
