package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.OverScrollController;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureResult;
import androidx.compose.foundation.lazy.layout.LazyLayoutPlaceable;
import androidx.compose.foundation.lazy.layout.LazyLayoutPlaceablesProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchPolicy;
import androidx.compose.foundation.lazy.layout.LazyMeasurePolicy;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffsetKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0001¢\u0006\u0002\u0010\u0019\u001a=\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a\u0089\u0001\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010.\u001a\u00020/H\u0003¢\u0006\u0002\u00100\u001a/\u00101\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020-0,2\u0006\u00102\u001a\u0002032\u0006\u0010\u001f\u001a\u00020 H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"LazyList", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "refreshOverScrollInfo", "overScrollController", "Landroidx/compose/foundation/gestures/OverScrollController;", "result", "Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "totalHorizontalPadding", "", "totalVerticalPadding", "refreshOverScrollInfo-L1NQ6kE", "(Landroidx/compose/foundation/gestures/OverScrollController;Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;JII)V", "rememberLazyListMeasurePolicy", "Landroidx/compose/foundation/lazy/layout/LazyMeasurePolicy;", "stateOfItemsProvider", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;", "itemScope", "Landroidx/compose/ui/node/Ref;", "Landroidx/compose/foundation/lazy/list/LazyItemScopeImpl;", "placementAnimator", "Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;", "(Landroidx/compose/runtime/State;Landroidx/compose/ui/node/Ref;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/gestures/OverScrollController;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;Landroidx/compose/runtime/Composer;III)Landroidx/compose/foundation/lazy/layout/LazyMeasurePolicy;", "update", "density", "Landroidx/compose/ui/unit/Density;", "update-3p2s80s", "(Landroidx/compose/ui/node/Ref;Landroidx/compose/ui/unit/Density;J)V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0131  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LazyList(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r31, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.LazyListState r32, @org.jetbrains.annotations.NotNull androidx.compose.foundation.layout.PaddingValues r33, boolean r34, boolean r35, @org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.FlingBehavior r36, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Horizontal r37, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r38, @org.jetbrains.annotations.Nullable androidx.compose.ui.Alignment.Vertical r39, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r40, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit> r41, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r42, int r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 863
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.list.LazyListKt.LazyList(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, boolean, androidx.compose.foundation.gestures.FlingBehavior, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: refreshOverScrollInfo-L1NQ6kE  reason: not valid java name */
    public static final void m467refreshOverScrollInfoL1NQ6kE(OverScrollController overScrollController, LazyListMeasureResult lazyListMeasureResult, long j2, int i2, int i3) {
        boolean canScrollForward = lazyListMeasureResult.getCanScrollForward();
        LazyMeasuredItem firstVisibleItem = lazyListMeasureResult.getFirstVisibleItem();
        boolean z = false;
        boolean z2 = ((firstVisibleItem == null ? 0 : firstVisibleItem.getIndex()) == 0 && lazyListMeasureResult.getFirstVisibleItemScrollOffset() == 0) ? false : true;
        long Size = SizeKt.Size(ConstraintsKt.m3307constrainWidthK40F9xA(j2, lazyListMeasureResult.getWidth() + i2), ConstraintsKt.m3306constrainHeightK40F9xA(j2, lazyListMeasureResult.getHeight() + i3));
        if (canScrollForward || z2) {
            z = true;
        }
        overScrollController.mo221refreshContainerInfoTmRCtEA(Size, z);
    }

    @Composable
    private static final LazyMeasurePolicy rememberLazyListMeasurePolicy(final State<? extends LazyListItemsProvider> state, final Ref<LazyItemScopeImpl> ref, final LazyListState lazyListState, final OverScrollController overScrollController, final PaddingValues paddingValues, final boolean z, final boolean z2, Alignment.Horizontal horizontal, Alignment.Vertical vertical, Arrangement.Horizontal horizontal2, Arrangement.Vertical vertical2, final LazyListItemPlacementAnimator lazyListItemPlacementAnimator, Composer composer, int i2, int i3, int i4) {
        composer.startReplaceableGroup(208079303);
        final Alignment.Horizontal horizontal3 = (i4 & 128) != 0 ? null : horizontal;
        final Alignment.Vertical vertical3 = (i4 & 256) != 0 ? null : vertical;
        final Arrangement.Horizontal horizontal4 = (i4 & 512) != 0 ? null : horizontal2;
        final Arrangement.Vertical vertical4 = (i4 & 1024) != 0 ? null : vertical2;
        int i5 = 0;
        Object[] objArr = {lazyListState, overScrollController, paddingValues, Boolean.valueOf(z), Boolean.valueOf(z2), horizontal3, vertical3, horizontal4, vertical4, lazyListItemPlacementAnimator};
        composer.startReplaceableGroup(-3685570);
        boolean z3 = false;
        while (i5 < 10) {
            Object obj = objArr[i5];
            i5++;
            z3 |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyMeasurePolicy() { // from class: androidx.compose.foundation.lazy.list.LazyListKt$rememberLazyListMeasurePolicy$1$1
                @Override // androidx.compose.foundation.lazy.layout.LazyMeasurePolicy
                @NotNull
                /* renamed from: measure-3p2s80s */
                public final LazyLayoutMeasureResult mo441measure3p2s80s(@NotNull final MeasureScope LazyMeasurePolicy, @NotNull LazyLayoutPlaceablesProvider placeablesProvider, long j2) {
                    float mo322getSpacingD9Ej5fM;
                    Intrinsics.checkNotNullParameter(LazyMeasurePolicy, "$this$LazyMeasurePolicy");
                    Intrinsics.checkNotNullParameter(placeablesProvider, "placeablesProvider");
                    ScrollKt.m208assertNotNestingScrollableContainersK40F9xA(j2, z2);
                    final int mo271roundToPx0680j_4 = LazyMeasurePolicy.mo271roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, LazyMeasurePolicy.getLayoutDirection()));
                    int mo271roundToPx0680j_42 = LazyMeasurePolicy.mo271roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, LazyMeasurePolicy.getLayoutDirection()));
                    final int mo271roundToPx0680j_43 = LazyMeasurePolicy.mo271roundToPx0680j_4(paddingValues.mo376calculateTopPaddingD9Ej5fM());
                    int mo271roundToPx0680j_44 = LazyMeasurePolicy.mo271roundToPx0680j_4(paddingValues.mo373calculateBottomPaddingD9Ej5fM());
                    int i6 = mo271roundToPx0680j_43 + mo271roundToPx0680j_44;
                    int i7 = mo271roundToPx0680j_4 + mo271roundToPx0680j_42;
                    boolean z4 = z2;
                    int i8 = z4 ? i6 : i7;
                    int i9 = (!z4 || z) ? (z4 && z) ? mo271roundToPx0680j_44 : (z4 || z) ? mo271roundToPx0680j_42 : mo271roundToPx0680j_4 : mo271roundToPx0680j_43;
                    final int i10 = i8 - i9;
                    long m3309offsetNN6EwU = ConstraintsKt.m3309offsetNN6EwU(j2, -i7, -i6);
                    LazyListItemsProvider value = state.getValue();
                    lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(value);
                    lazyListState.setDensity$foundation_release(LazyMeasurePolicy);
                    LazyListKt.m468update3p2s80s(ref, LazyMeasurePolicy, m3309offsetNN6EwU);
                    if (z2) {
                        Arrangement.Vertical vertical5 = vertical4;
                        if (vertical5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        mo322getSpacingD9Ej5fM = vertical5.mo322getSpacingD9Ej5fM();
                    } else {
                        Arrangement.Horizontal horizontal5 = horizontal4;
                        if (horizontal5 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        mo322getSpacingD9Ej5fM = horizontal5.mo322getSpacingD9Ej5fM();
                    }
                    final int mo271roundToPx0680j_45 = LazyMeasurePolicy.mo271roundToPx0680j_4(mo322getSpacingD9Ej5fM);
                    final int itemsCount = value.getItemsCount();
                    final boolean z5 = z2;
                    final Alignment.Horizontal horizontal6 = horizontal3;
                    final Alignment.Vertical vertical6 = vertical3;
                    final boolean z6 = z;
                    final LazyListItemPlacementAnimator lazyListItemPlacementAnimator2 = lazyListItemPlacementAnimator;
                    final int i11 = i9;
                    LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(m3309offsetNN6EwU, z5, value, placeablesProvider, new MeasuredItemFactory() { // from class: androidx.compose.foundation.lazy.list.LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$itemProvider$1
                        @Override // androidx.compose.foundation.lazy.list.MeasuredItemFactory
                        @NotNull
                        /* renamed from: createItem-8xJyyfI  reason: not valid java name */
                        public final LazyMeasuredItem mo469createItem8xJyyfI(int i12, @NotNull Object key, @NotNull LazyLayoutPlaceable[] placeables) {
                            Intrinsics.checkNotNullParameter(key, "key");
                            Intrinsics.checkNotNullParameter(placeables, "placeables");
                            return new LazyMeasuredItem(i12, placeables, z5, horizontal6, vertical6, LazyMeasurePolicy.getLayoutDirection(), z6, i11, i10, lazyListItemPlacementAnimator2, i12 == itemsCount + (-1) ? 0 : mo271roundToPx0680j_45, IntOffsetKt.IntOffset(mo271roundToPx0680j_4, mo271roundToPx0680j_43), key, null);
                        }
                    }, null);
                    LazyLayoutPrefetchPolicy prefetchPolicy$foundation_release = lazyListState.getPrefetchPolicy$foundation_release();
                    if (prefetchPolicy$foundation_release != null) {
                        prefetchPolicy$foundation_release.m440setConstraintsBRTryo0(lazyMeasuredItemProvider.m480getChildConstraintsmsEJaDk());
                    }
                    LazyListMeasureResult m470measureLazyListwroFCeY = LazyListMeasureKt.m470measureLazyListwroFCeY(itemsCount, lazyMeasuredItemProvider, z2 ? Constraints.m3292getMaxHeightimpl(j2) - i6 : Constraints.m3293getMaxWidthimpl(j2) - i7, i9, i10, lazyListState.m435getFirstVisibleItemIndexNonObservableAUyieIw$foundation_release(), lazyListState.getFirstVisibleItemScrollOffsetNonObservable$foundation_release(), lazyListState.getScrollToBeConsumed$foundation_release(), m3309offsetNN6EwU, z2, value.getHeaderIndexes(), vertical4, horizontal4, z, LazyMeasurePolicy, LazyMeasurePolicy.getLayoutDirection(), lazyListItemPlacementAnimator, new LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$1(LazyMeasurePolicy, j2, i7, i6));
                    LazyListState lazyListState2 = lazyListState;
                    OverScrollController overScrollController2 = overScrollController;
                    lazyListState2.applyMeasureResult$foundation_release(m470measureLazyListwroFCeY);
                    LazyListKt.m467refreshOverScrollInfoL1NQ6kE(overScrollController2, m470measureLazyListwroFCeY, j2, i7, i6);
                    return m470measureLazyListwroFCeY.getLazyLayoutMeasureResult();
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyMeasurePolicy lazyMeasurePolicy = (LazyMeasurePolicy) rememberedValue;
        composer.endReplaceableGroup();
        return lazyMeasurePolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: update-3p2s80s  reason: not valid java name */
    public static final void m468update3p2s80s(Ref<LazyItemScopeImpl> ref, Density density, long j2) {
        LazyItemScopeImpl value = ref.getValue();
        if (value != null && Intrinsics.areEqual(value.getDensity(), density) && Constraints.m3286equalsimpl0(value.m460getConstraintsmsEJaDk(), j2)) {
            return;
        }
        ref.setValue(new LazyItemScopeImpl(density, j2, null));
    }
}
