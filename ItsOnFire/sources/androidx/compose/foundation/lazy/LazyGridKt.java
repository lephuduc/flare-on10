package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
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
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aX\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011H\u0003¢\u0006\u0002\u0010\u0012\u001aB\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2#\u0010\u0014\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\u0018\u0012\u0004\u0012\u00020\u00030\u00160\u0015H\u0003¢\u0006\u0002\u0010\u0019\u001a`\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u001d\u001a\u0093\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 20\b\n\u0010!\u001a*\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'\u0018\u00010\"¢\u0006\u0002\b\u001123\b\u0004\u0010(\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0011H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010*\u001a\u0093\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0\u001520\b\n\u0010!\u001a*\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'\u0018\u00010\"¢\u0006\u0002\b\u001123\b\u0004\u0010(\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0011H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010+\u001a½\u0001\u0010,\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2E\b\n\u0010!\u001a?\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(.\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'\u0018\u00010-¢\u0006\u0002\b\u00112H\b\u0004\u0010(\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(.\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00010-¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0011H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010/\u001a½\u0001\u0010,\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0\u00152E\b\n\u0010!\u001a?\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(.\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020'\u0018\u00010-¢\u0006\u0002\b\u00112H\b\u0004\u0010(\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(.\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\u00010-¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0011H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u00100\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u00061"}, d2 = {"FixedLazyGrid", "", "nColumns", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyGridScope;", "Lkotlin/ExtensionFunctionType;", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ItemRow", "rowContent", "", "Lkotlin/Pair;", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(ILandroidx/compose/foundation/layout/Arrangement$Horizontal;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "LazyVerticalGrid", "cells", "Landroidx/compose/foundation/lazy/GridCells;", "(Landroidx/compose/foundation/lazy/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", FirebaseAnalytics.Param.ITEMS, "T", "", "spans", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyGridItemSpanScope;", "Lkotlin/ParameterName;", "name", "item", "Landroidx/compose/foundation/lazy/GridItemSpan;", "itemContent", "Landroidx/compose/foundation/lazy/LazyItemScope;", "(Landroidx/compose/foundation/lazy/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "Lkotlin/Function3;", FirebaseAnalytics.Param.INDEX, "(Landroidx/compose/foundation/lazy/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyGridKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FixedLazyGrid(int r20, androidx.compose.ui.Modifier r21, androidx.compose.foundation.lazy.LazyListState r22, androidx.compose.foundation.layout.PaddingValues r23, androidx.compose.foundation.layout.Arrangement.Vertical r24, androidx.compose.foundation.layout.Arrangement.Horizontal r25, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyGridScope, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyGridKt.FixedLazyGrid(int, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void ItemRow(final int i2, final Arrangement.Horizontal horizontal, final List<? extends Pair<? extends Function2<? super Composer, ? super Integer, Unit>, Integer>> list, Composer composer, int i3) {
        Composer startRestartGroup = composer.startRestartGroup(-506699774);
        MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.lazy.LazyGridKt$ItemRow$2
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list2, int i4) {
                return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list2, i4);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list2, int i4) {
                return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list2, i4);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo6measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j2) {
                Integer valueOf;
                int lastIndex;
                MeasureScope measureScope;
                int i4;
                int i5;
                Map map;
                Function1 function1;
                int i6;
                Object obj;
                Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                int i7 = 1;
                if (measurables.size() == list.size()) {
                    if (measurables.isEmpty()) {
                        measureScope = Layout;
                        i4 = Constraints.m3295getMinWidthimpl(j2);
                        i5 = Constraints.m3294getMinHeightimpl(j2);
                        map = null;
                        function1 = LazyGridKt$ItemRow$2$measure$1.INSTANCE;
                        i6 = 4;
                        obj = null;
                    } else {
                        int mo271roundToPx0680j_4 = Layout.mo271roundToPx0680j_4(horizontal.mo322getSpacingD9Ej5fM());
                        int max = Math.max(Constraints.m3293getMaxWidthimpl(j2) - ((i2 - 1) * mo271roundToPx0680j_4), 0) / i2;
                        int m3293getMaxWidthimpl = Constraints.m3293getMaxWidthimpl(j2);
                        int i8 = i2;
                        int max2 = Math.max((m3293getMaxWidthimpl - (max * i8)) - ((i8 - 1) * mo271roundToPx0680j_4), 0);
                        List<Pair<Function2<Composer, Integer, Unit>, Integer>> list2 = list;
                        ArrayList arrayList = new ArrayList(measurables.size());
                        int size = measurables.size();
                        int i9 = 0;
                        while (i9 < size) {
                            int i10 = i9 + 1;
                            int intValue = list2.get(i9).getSecond().intValue();
                            int min = Math.min(max2, intValue);
                            max2 -= min;
                            Placeable mo2758measureBRTryo0 = measurables.get(i9).mo2758measureBRTryo0(Constraints.Companion.m3303fixedWidthOenEA2s((intValue * max) + min + ((intValue - 1) * mo271roundToPx0680j_4)));
                            if (mo2758measureBRTryo0 != null) {
                                arrayList.add(mo2758measureBRTryo0);
                            }
                            i9 = i10;
                        }
                        int m3293getMaxWidthimpl2 = Constraints.m3293getMaxWidthimpl(j2);
                        if (arrayList.isEmpty()) {
                            valueOf = null;
                        } else {
                            valueOf = Integer.valueOf(((Placeable) arrayList.get(0)).getHeight());
                            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                            if (1 <= lastIndex) {
                                while (true) {
                                    int i11 = i7 + 1;
                                    Integer valueOf2 = Integer.valueOf(((Placeable) arrayList.get(i7)).getHeight());
                                    if (valueOf2.compareTo(valueOf) > 0) {
                                        valueOf = valueOf2;
                                    }
                                    if (i7 == lastIndex) {
                                        break;
                                    }
                                    i7 = i11;
                                }
                            }
                        }
                        Intrinsics.checkNotNull(valueOf);
                        int intValue2 = valueOf.intValue();
                        Function1 lazyGridKt$ItemRow$2$measure$3 = new LazyGridKt$ItemRow$2$measure$3(arrayList, mo271roundToPx0680j_4);
                        measureScope = Layout;
                        i4 = m3293getMaxWidthimpl2;
                        i5 = intValue2;
                        map = null;
                        function1 = lazyGridKt$ItemRow$2$measure$3;
                        i6 = 4;
                        obj = null;
                    }
                    return MeasureScope.DefaultImpls.layout$default(measureScope, i4, i5, map, function1, i6, obj);
                }
                throw new IllegalStateException("Check failed.".toString());
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list2, int i4) {
                return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list2, i4);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list2, int i4) {
                return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list2, i4);
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
        startRestartGroup.startReplaceableGroup(-97970863);
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            list.get(i4).getFirst().invoke(startRestartGroup, 0);
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new LazyGridKt$ItemRow$3(i2, horizontal, list, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LazyVerticalGrid(@org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.GridCells r24, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r25, @org.jetbrains.annotations.Nullable androidx.compose.foundation.lazy.LazyListState r26, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.PaddingValues r27, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r28, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r29, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyGridScope, kotlin.Unit> r30, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyGridKt.LazyVerticalGrid(androidx.compose.foundation.lazy.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    @ExperimentalFoundationApi
    public static final <T> void items(@NotNull LazyGridScope lazyGridScope, @NotNull List<? extends T> items, @Nullable Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, @NotNull Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function2 == null ? null : new LazyGridKt$items$1$1(function2, items), ComposableLambdaKt.composableLambdaInstance(-985536268, true, new LazyGridKt$items$2(itemContent, items)));
    }

    @ExperimentalFoundationApi
    public static final <T> void items(@NotNull LazyGridScope lazyGridScope, @NotNull T[] items, @Nullable Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, @NotNull Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function2 == null ? null : new LazyGridKt$items$3$1(function2, items), ComposableLambdaKt.composableLambdaInstance(-985534956, true, new LazyGridKt$items$4(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, List items, Function2 function2, Function4 itemContent, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function2 = null;
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function2 != null ? new LazyGridKt$items$1$1(function2, items) : null, ComposableLambdaKt.composableLambdaInstance(-985536268, true, new LazyGridKt$items$2(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, Object[] items, Function2 function2, Function4 itemContent, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function2 = null;
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function2 != null ? new LazyGridKt$items$3$1(function2, items) : null, ComposableLambdaKt.composableLambdaInstance(-985534956, true, new LazyGridKt$items$4(itemContent, items)));
    }

    @ExperimentalFoundationApi
    public static final <T> void itemsIndexed(@NotNull LazyGridScope lazyGridScope, @NotNull List<? extends T> items, @Nullable Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, @NotNull Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function3 == null ? null : new LazyGridKt$itemsIndexed$1$1(function3, items), ComposableLambdaKt.composableLambdaInstance(-985534995, true, new LazyGridKt$itemsIndexed$2(itemContent, items)));
    }

    @ExperimentalFoundationApi
    public static final <T> void itemsIndexed(@NotNull LazyGridScope lazyGridScope, @NotNull T[] items, @Nullable Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, @NotNull Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function3 == null ? null : new LazyGridKt$itemsIndexed$3$1(function3, items), ComposableLambdaKt.composableLambdaInstance(-985541871, true, new LazyGridKt$itemsIndexed$4(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, List items, Function3 function3, Function5 itemContent, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function3 = null;
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function3 != null ? new LazyGridKt$itemsIndexed$1$1(function3, items) : null, ComposableLambdaKt.composableLambdaInstance(-985534995, true, new LazyGridKt$itemsIndexed$2(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, Object[] items, Function3 function3, Function5 itemContent, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function3 = null;
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function3 != null ? new LazyGridKt$itemsIndexed$3$1(function3, items) : null, ComposableLambdaKt.composableLambdaInstance(-985541871, true, new LazyGridKt$itemsIndexed$4(itemContent, items)));
    }
}
