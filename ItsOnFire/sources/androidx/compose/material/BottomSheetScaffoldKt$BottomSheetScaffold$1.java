package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import j.u0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffold$1 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ int $$dirty2;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
    public final /* synthetic */ long $contentColor;
    public final /* synthetic */ long $drawerBackgroundColor;
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $drawerContent;
    public final /* synthetic */ long $drawerContentColor;
    public final /* synthetic */ float $drawerElevation;
    public final /* synthetic */ boolean $drawerGesturesEnabled;
    public final /* synthetic */ long $drawerScrimColor;
    public final /* synthetic */ Shape $drawerShape;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $floatingActionButton;
    public final /* synthetic */ int $floatingActionButtonPosition;
    public final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
    public final /* synthetic */ u0 $scope;
    public final /* synthetic */ long $sheetBackgroundColor;
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $sheetContent;
    public final /* synthetic */ long $sheetContentColor;
    public final /* synthetic */ float $sheetElevation;
    public final /* synthetic */ boolean $sheetGesturesEnabled;
    public final /* synthetic */ float $sheetPeekHeight;
    public final /* synthetic */ Shape $sheetShape;
    public final /* synthetic */ Function3<SnackbarHostState, Composer, Integer, Unit> $snackbarHost;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheetScaffold$1(BottomSheetScaffoldState bottomSheetScaffoldState, boolean z, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, boolean z2, Shape shape, float f2, long j2, long j3, long j4, int i2, float f3, u0 u0Var, int i3, int i4, long j5, long j6, int i5, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function32, Shape shape2, long j7, long j8, float f4, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function34) {
        super(3);
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$sheetGesturesEnabled = z;
        this.$drawerContent = function3;
        this.$drawerGesturesEnabled = z2;
        this.$drawerShape = shape;
        this.$drawerElevation = f2;
        this.$drawerBackgroundColor = j2;
        this.$drawerContentColor = j3;
        this.$drawerScrimColor = j4;
        this.$$dirty1 = i2;
        this.$sheetPeekHeight = f3;
        this.$scope = u0Var;
        this.$floatingActionButtonPosition = i3;
        this.$$dirty = i4;
        this.$backgroundColor = j5;
        this.$contentColor = j6;
        this.$$dirty2 = i5;
        this.$topBar = function2;
        this.$content = function32;
        this.$sheetShape = shape2;
        this.$sheetBackgroundColor = j7;
        this.$sheetContentColor = j8;
        this.$sheetElevation = f4;
        this.$sheetContent = function33;
        this.$floatingActionButton = function22;
        this.$snackbarHost = function34;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-2  reason: not valid java name */
    public static final float m727invoke$lambda2(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-3  reason: not valid java name */
    public static final void m728invoke$lambda3(MutableState<Float> mutableState, float f2) {
        mutableState.setValue(Float.valueOf(f2));
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer, int i2) {
        int i3;
        Map mapOf;
        Modifier m973swipeablepPrIpRY;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i2 & 14) == 0) {
            i3 = i2 | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (((i3 & 91) ^ 18) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        float m3292getMaxHeightimpl = Constraints.m3292getMaxHeightimpl(BoxWithConstraints.mo340getConstraintsmsEJaDk());
        float mo277toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo277toPx0680j_4(this.$sheetPeekHeight);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(m3292getMaxHeightimpl), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        Modifier nestedScroll$default = NestedScrollModifierKt.nestedScroll$default(Modifier.Companion, this.$scaffoldState.getBottomSheetState().getNestedScrollConnection$material_release(), null, 2, null);
        BottomSheetState bottomSheetState = this.$scaffoldState.getBottomSheetState();
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.to(Float.valueOf(m3292getMaxHeightimpl - mo277toPx0680j_4), BottomSheetValue.Collapsed), TuplesKt.to(Float.valueOf(m3292getMaxHeightimpl - m727invoke$lambda2(mutableState)), BottomSheetValue.Expanded));
        m973swipeablepPrIpRY = SwipeableKt.m973swipeablepPrIpRY(nestedScroll$default, bottomSheetState, mapOf, Orientation.Vertical, (r26 & 8) != 0 ? true : this.$sheetGesturesEnabled, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? SwipeableKt$swipeable$1.INSTANCE : null, (r26 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapOf.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? SwipeableDefaults.INSTANCE.m972getVelocityThresholdD9Ej5fM() : 0.0f);
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -819899396, true, new BottomSheetScaffoldKt$BottomSheetScaffold$1$child$1(this.$scaffoldState, this.$floatingActionButtonPosition, this.$$dirty, this.$backgroundColor, this.$contentColor, this.$$dirty2, this.$topBar, this.$content, this.$sheetPeekHeight, SemanticsModifierKt.semantics$default(m973swipeablepPrIpRY, false, new BottomSheetScaffoldKt$BottomSheetScaffold$1$swipeable$1(mo277toPx0680j_4, this.$scaffoldState, mutableState, this.$scope), 1, null), mutableState, this.$sheetShape, this.$sheetBackgroundColor, this.$sheetContentColor, this.$sheetElevation, this.$$dirty1, this.$sheetContent, this.$floatingActionButton, this.$snackbarHost));
        if (this.$drawerContent == null) {
            composer.startReplaceableGroup(-249545651);
            composableLambda.invoke(composer, 6);
            composer.endReplaceableGroup();
            return;
        }
        composer.startReplaceableGroup(-249545614);
        Function3<ColumnScope, Composer, Integer, Unit> function3 = this.$drawerContent;
        DrawerState drawerState = this.$scaffoldState.getDrawerState();
        boolean z = this.$drawerGesturesEnabled;
        Shape shape = this.$drawerShape;
        float f2 = this.$drawerElevation;
        long j2 = this.$drawerBackgroundColor;
        long j3 = this.$drawerContentColor;
        long j4 = this.$drawerScrimColor;
        int i4 = this.$$dirty1;
        DrawerKt.m816ModalDrawerGs3lGvM(function3, null, drawerState, z, shape, f2, j2, j3, j4, composableLambda, composer, ((i4 >> 3) & 7168) | ((i4 >> 9) & 14) | 805306368 | ((i4 >> 3) & 57344) | ((i4 >> 3) & 458752) | ((i4 >> 3) & 3670016) | ((i4 >> 3) & 29360128) | ((i4 >> 3) & 234881024), 2);
        composer.endReplaceableGroup();
    }
}
