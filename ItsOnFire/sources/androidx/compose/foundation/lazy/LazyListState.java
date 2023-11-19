package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchPolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutState;
import androidx.compose.foundation.lazy.list.DataIndex;
import androidx.compose.foundation.lazy.list.LazyListItemPlacementAnimator;
import androidx.compose.foundation.lazy.list.LazyListItemsProvider;
import androidx.compose.foundation.lazy.list.LazyListMeasureResult;
import androidx.compose.foundation.lazy.list.LazyListScrollPosition;
import androidx.compose.foundation.lazy.list.LazyListScrollingKt;
import androidx.compose.foundation.lazy.list.LazyMeasuredItem;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 p2\u00020\u0001:\u0001pB\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J#\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u00032\b\b\u0002\u0010S\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010TJ\u0015\u0010U\u001a\u00020Q2\u0006\u0010V\u001a\u00020WH\u0000¢\u0006\u0002\bXJ\u0010\u0010Y\u001a\u00020F2\u0006\u0010Z\u001a\u00020FH\u0016J\u0010\u0010[\u001a\u00020Q2\u0006\u0010Z\u001a\u00020FH\u0002J\u0015\u0010\\\u001a\u00020F2\u0006\u0010]\u001a\u00020FH\u0000¢\u0006\u0002\b^JB\u0010_\u001a\u00020Q2\u0006\u0010`\u001a\u00020a2'\u0010b\u001a#\b\u0001\u0012\u0004\u0012\u00020d\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0e\u0012\u0006\u0012\u0004\u0018\u00010f0c¢\u0006\u0002\bgH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010hJ#\u0010i\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u00032\b\b\u0002\u0010S\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010TJ\u001d\u0010j\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u00032\u0006\u0010S\u001a\u00020\u0003H\u0000¢\u0006\u0002\bkJ\u0015\u0010l\u001a\u00020Q2\u0006\u0010m\u001a\u00020nH\u0000¢\u0006\u0002\boR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u00020\u00158@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u000e\u0010\u001a\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020&X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u000bR\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020+0/X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u00100\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0013R/\u00103\u001a\u0004\u0018\u0001022\b\u0010\b\u001a\u0004\u0018\u0001028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u000b\"\u0004\bB\u0010CR\u000e\u0010D\u001a\u00020EX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010G\u001a\u00020F2\u0006\u0010\b\u001a\u00020F@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u000e\u0010J\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010K\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0013\"\u0004\bM\u0010NR\u000e\u0010O\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006q"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "firstVisibleItemIndex", "", "firstVisibleItemScrollOffset", "(II)V", "canScrollBackward", "", "<set-?>", "canScrollForward", "getCanScrollForward$foundation_release", "()Z", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "getFirstVisibleItemIndex", "()I", "firstVisibleItemIndexNonObservable", "Landroidx/compose/foundation/lazy/list/DataIndex;", "getFirstVisibleItemIndexNonObservable-AUyieIw$foundation_release", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffsetNonObservable", "getFirstVisibleItemScrollOffsetNonObservable$foundation_release", "indexToPrefetch", "innerState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutState;", "getInnerState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutState;", "setInnerState$foundation_release", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutState;)V", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "isScrollInProgress", "layoutInfo", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "layoutInfoState", "Landroidx/compose/runtime/MutableState;", "numMeasurePasses", "getNumMeasurePasses$foundation_release", "Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;", "placementAnimator", "getPlacementAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;", "setPlacementAnimator$foundation_release", "(Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;)V", "placementAnimator$delegate", "Landroidx/compose/runtime/MutableState;", "prefetchPolicy", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;", "getPrefetchPolicy$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;", "setPrefetchPolicy$foundation_release", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;)V", "prefetchingEnabled", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "(Z)V", "scrollPosition", "Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;", "", "scrollToBeConsumed", "getScrollToBeConsumed$foundation_release", "()F", "scrollableState", "visibleItemsCount", "getVisibleItemsCount$foundation_release", "setVisibleItemsCount$foundation_release", "(I)V", "wasScrollingForward", "animateScrollToItem", "", FirebaseAnalytics.Param.INDEX, "scrollOffset", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyMeasureResult", "result", "Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;", "applyMeasureResult$foundation_release", "dispatchRawDelta", "delta", "notifyPrefetch", "onScroll", "distance", "onScroll$foundation_release", "scroll", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollToItem", "snapToItemIndexInternal", "snapToItemIndexInternal$foundation_release", "updateScrollPositionIfTheFirstItemWasMoved", "itemsProvider", "Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyListState implements ScrollableState {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Saver<LazyListState, ?> Saver = ListSaverKt.listSaver(LazyListState$Companion$Saver$1.INSTANCE, LazyListState$Companion$Saver$2.INSTANCE);
    private boolean canScrollBackward;
    private boolean canScrollForward;
    @NotNull
    private Density density;
    private int indexToPrefetch;
    @Nullable
    private LazyLayoutState innerState;
    @NotNull
    private final MutableInteractionSource internalInteractionSource;
    @NotNull
    private final MutableState<LazyListLayoutInfo> layoutInfoState;
    private int numMeasurePasses;
    @NotNull
    private final MutableState placementAnimator$delegate;
    @Nullable
    private LazyLayoutPrefetchPolicy prefetchPolicy;
    private boolean prefetchingEnabled;
    @NotNull
    private final LazyListScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    @NotNull
    private final ScrollableState scrollableState;
    private int visibleItemsCount;
    private boolean wasScrollingForward;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/LazyListState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<LazyListState, ?> getSaver() {
            return LazyListState.Saver;
        }
    }

    public LazyListState() {
        this(0, 0, 3, null);
    }

    public LazyListState(int i2, int i3) {
        MutableState<LazyListLayoutInfo> mutableStateOf$default;
        MutableState mutableStateOf$default2;
        this.scrollPosition = new LazyListScrollPosition(i2, i3);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(EmptyLazyListLayoutInfo.INSTANCE, null, 2, null);
        this.layoutInfoState = mutableStateOf$default;
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.density = DensityKt.Density(1.0f, 1.0f);
        this.scrollableState = ScrollableStateKt.ScrollableState(new LazyListState$scrollableState$1(this));
        this.prefetchingEnabled = true;
        this.indexToPrefetch = -1;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.placementAnimator$delegate = mutableStateOf$default2;
    }

    public /* synthetic */ LazyListState(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3);
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyListState lazyListState, int i2, int i3, Continuation continuation, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return lazyListState.animateScrollToItem(i2, i3, continuation);
    }

    private final void notifyPrefetch(float f2) {
        Object first;
        int index;
        LazyLayoutPrefetchPolicy lazyLayoutPrefetchPolicy;
        Object last;
        if (this.prefetchingEnabled) {
            LazyListLayoutInfo layoutInfo = getLayoutInfo();
            boolean z = true;
            if (!layoutInfo.getVisibleItemsInfo().isEmpty()) {
                boolean z2 = f2 < 0.0f;
                List<LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
                if (z2) {
                    last = CollectionsKt___CollectionsKt.last((List<? extends Object>) visibleItemsInfo);
                    index = ((LazyListItemInfo) last).getIndex() + 1;
                } else {
                    first = CollectionsKt___CollectionsKt.first((List<? extends Object>) visibleItemsInfo);
                    index = ((LazyListItemInfo) first).getIndex() - 1;
                }
                if (index != this.indexToPrefetch) {
                    if (index < 0 || index >= layoutInfo.getTotalItemsCount()) {
                        z = false;
                    }
                    if (z) {
                        if (this.wasScrollingForward != z2 && (lazyLayoutPrefetchPolicy = this.prefetchPolicy) != null) {
                            lazyLayoutPrefetchPolicy.removeFromPrefetch(this.indexToPrefetch);
                        }
                        this.wasScrollingForward = z2;
                        this.indexToPrefetch = index;
                        LazyLayoutPrefetchPolicy lazyLayoutPrefetchPolicy2 = this.prefetchPolicy;
                        if (lazyLayoutPrefetchPolicy2 == null) {
                            return;
                        }
                        lazyLayoutPrefetchPolicy2.scheduleForPrefetch(index);
                    }
                }
            }
        }
    }

    public static /* synthetic */ Object scrollToItem$default(LazyListState lazyListState, int i2, int i3, Continuation continuation, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return lazyListState.scrollToItem(i2, i3, continuation);
    }

    @Nullable
    public final Object animateScrollToItem(int i2, int i3, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object doSmoothScrollToItem = LazyListScrollingKt.doSmoothScrollToItem(this, i2, i3, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return doSmoothScrollToItem == coroutine_suspended ? doSmoothScrollToItem : Unit.INSTANCE;
    }

    public final void applyMeasureResult$foundation_release(@NotNull LazyListMeasureResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.visibleItemsCount = result.getVisibleItemsInfo().size();
        this.scrollPosition.updateFromMeasureResult(result);
        this.scrollToBeConsumed -= result.getConsumedScroll();
        this.layoutInfoState.setValue(result);
        this.canScrollForward = result.getCanScrollForward();
        LazyMeasuredItem firstVisibleItem = result.getFirstVisibleItem();
        boolean z = false;
        if ((firstVisibleItem == null ? 0 : firstVisibleItem.getIndex()) != 0 || result.getFirstVisibleItemScrollOffset() != 0) {
            z = true;
        }
        this.canScrollBackward = z;
        this.numMeasurePasses++;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f2) {
        return this.scrollableState.dispatchRawDelta(f2);
    }

    public final boolean getCanScrollForward$foundation_release() {
        return this.canScrollForward;
    }

    @NotNull
    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.getObservableIndex();
    }

    /* renamed from: getFirstVisibleItemIndexNonObservable-AUyieIw$foundation_release  reason: not valid java name */
    public final int m435getFirstVisibleItemIndexNonObservableAUyieIw$foundation_release() {
        return this.scrollPosition.m475getIndexAUyieIw();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getObservableScrollOffset();
    }

    public final int getFirstVisibleItemScrollOffsetNonObservable$foundation_release() {
        return this.scrollPosition.getScrollOffset();
    }

    @Nullable
    public final LazyLayoutState getInnerState$foundation_release() {
        return this.innerState;
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    @NotNull
    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    @NotNull
    public final LazyListLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.numMeasurePasses;
    }

    @Nullable
    public final LazyListItemPlacementAnimator getPlacementAnimator$foundation_release() {
        return (LazyListItemPlacementAnimator) this.placementAnimator$delegate.getValue();
    }

    @Nullable
    public final LazyLayoutPrefetchPolicy getPrefetchPolicy$foundation_release() {
        return this.prefetchPolicy;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.prefetchingEnabled;
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.scrollToBeConsumed;
    }

    public final int getVisibleItemsCount$foundation_release() {
        return this.visibleItemsCount;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    public final float onScroll$foundation_release(float f2) {
        if ((f2 >= 0.0f || this.canScrollForward) && (f2 <= 0.0f || this.canScrollBackward)) {
            if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
                float f3 = this.scrollToBeConsumed + f2;
                this.scrollToBeConsumed = f3;
                if (Math.abs(f3) > 0.5f) {
                    float f4 = this.scrollToBeConsumed;
                    LazyLayoutState lazyLayoutState = this.innerState;
                    if (lazyLayoutState != null) {
                        lazyLayoutState.remeasure();
                    }
                    if (this.prefetchingEnabled && this.prefetchPolicy != null) {
                        notifyPrefetch(f4 - this.scrollToBeConsumed);
                    }
                }
                if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
                    return f2;
                }
                float f5 = f2 - this.scrollToBeConsumed;
                this.scrollToBeConsumed = 0.0f;
                return f5;
            }
            throw new IllegalStateException(Intrinsics.stringPlus("entered drag with non-zero pending scroll: ", Float.valueOf(getScrollToBeConsumed$foundation_release())).toString());
        }
        return 0.0f;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object scroll = this.scrollableState.scroll(mutatePriority, function2, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return scroll == coroutine_suspended ? scroll : Unit.INSTANCE;
    }

    @Nullable
    public final Object scrollToItem(int i2, int i3, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object scroll$default = ScrollableState.DefaultImpls.scroll$default(this.scrollableState, null, new LazyListState$scrollToItem$2(this, i2, i3, null), continuation, 1, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return scroll$default == coroutine_suspended ? scroll$default : Unit.INSTANCE;
    }

    public final void setDensity$foundation_release(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.density = density;
    }

    public final void setInnerState$foundation_release(@Nullable LazyLayoutState lazyLayoutState) {
        this.innerState = lazyLayoutState;
    }

    public final void setPlacementAnimator$foundation_release(@Nullable LazyListItemPlacementAnimator lazyListItemPlacementAnimator) {
        this.placementAnimator$delegate.setValue(lazyListItemPlacementAnimator);
    }

    public final void setPrefetchPolicy$foundation_release(@Nullable LazyLayoutPrefetchPolicy lazyLayoutPrefetchPolicy) {
        this.prefetchPolicy = lazyLayoutPrefetchPolicy;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.prefetchingEnabled = z;
    }

    public final void setVisibleItemsCount$foundation_release(int i2) {
        this.visibleItemsCount = i2;
    }

    public final void snapToItemIndexInternal$foundation_release(int i2, int i3) {
        this.scrollPosition.m476requestPositionNTjDD6g(DataIndex.m444constructorimpl(i2), i3);
        LazyListItemPlacementAnimator placementAnimator$foundation_release = getPlacementAnimator$foundation_release();
        if (placementAnimator$foundation_release != null) {
            placementAnimator$foundation_release.reset();
        }
        LazyLayoutState lazyLayoutState = this.innerState;
        if (lazyLayoutState == null) {
            return;
        }
        lazyLayoutState.remeasure();
    }

    public final void updateScrollPositionIfTheFirstItemWasMoved$foundation_release(@NotNull LazyListItemsProvider itemsProvider) {
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(itemsProvider);
    }
}
