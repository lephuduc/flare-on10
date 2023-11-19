package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "androidx.compose.foundation.lazy.list.LazyListScrollingKt$doSmoothScrollToItem$3", f = "LazyListScrolling.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {R.styleable.AppCompatTheme_viewInflaterClass, ComposerKt.reuseKey}, m = "invokeSuspend", n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "forward"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "I$0"})
/* loaded from: classes.dex */
public final class LazyListScrollingKt$doSmoothScrollToItem$3 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ int $scrollOffset;
    public final /* synthetic */ LazyListState $this_doSmoothScrollToItem;
    public float F$0;
    public float F$1;
    public int I$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.lazy.list.LazyListScrollingKt$doSmoothScrollToItem$3$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
        public final /* synthetic */ ScrollScope $$this$scroll;
        public final /* synthetic */ Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> $anim;
        public final /* synthetic */ float $boundDistancePx;
        public final /* synthetic */ boolean $forward;
        public final /* synthetic */ int $index;
        public final /* synthetic */ Ref.BooleanRef $loop;
        public final /* synthetic */ Ref.IntRef $loops;
        public final /* synthetic */ Ref.FloatRef $prevValue;
        public final /* synthetic */ int $scrollOffset;
        public final /* synthetic */ float $target;
        public final /* synthetic */ LazyListState $this_doSmoothScrollToItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(float f2, Ref.FloatRef floatRef, ScrollScope scrollScope, Ref.BooleanRef booleanRef, boolean z, float f3, Ref.IntRef intRef, int i2, LazyListState lazyListState, int i3, Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> objectRef) {
            super(1);
            this.$target = f2;
            this.$prevValue = floatRef;
            this.$$this$scroll = scrollScope;
            this.$loop = booleanRef;
            this.$forward = z;
            this.$boundDistancePx = f3;
            this.$loops = intRef;
            this.$index = i2;
            this.$this_doSmoothScrollToItem = lazyListState;
            this.$scrollOffset = i3;
            this.$anim = objectRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            invoke2(animationScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animateTo) {
            LazyListItemInfo doSmoothScrollToItem$getTargetItem;
            LazyListItemInfo doSmoothScrollToItem$getTargetItem2;
            Object first;
            LazyListState lazyListState;
            int i2;
            Object last;
            Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
            doSmoothScrollToItem$getTargetItem = LazyListScrollingKt.doSmoothScrollToItem$getTargetItem(this.$this_doSmoothScrollToItem, this.$index);
            if (doSmoothScrollToItem$getTargetItem == null) {
                float coerceAtMost = (this.$target > 0.0f ? RangesKt___RangesKt.coerceAtMost(animateTo.getValue().floatValue(), this.$target) : RangesKt___RangesKt.coerceAtLeast(animateTo.getValue().floatValue(), this.$target)) - this.$prevValue.element;
                float scrollBy = this.$$this$scroll.scrollBy(coerceAtMost);
                doSmoothScrollToItem$getTargetItem2 = LazyListScrollingKt.doSmoothScrollToItem$getTargetItem(this.$this_doSmoothScrollToItem, this.$index);
                if (doSmoothScrollToItem$getTargetItem2 == null && !LazyListScrollingKt$doSmoothScrollToItem$3.invokeSuspend$isOvershot(this.$forward, this.$this_doSmoothScrollToItem, this.$index, this.$scrollOffset)) {
                    if (!(coerceAtMost == scrollBy)) {
                        animateTo.cancelAnimation();
                        this.$loop.element = false;
                        return;
                    }
                    this.$prevValue.element += coerceAtMost;
                    if (!this.$forward ? animateTo.getValue().floatValue() < (-this.$boundDistancePx) : animateTo.getValue().floatValue() > this.$boundDistancePx) {
                        animateTo.cancelAnimation();
                    }
                    if (this.$forward) {
                        if (this.$loops.element >= 2) {
                            int i3 = this.$index;
                            last = CollectionsKt___CollectionsKt.last((List<? extends Object>) this.$this_doSmoothScrollToItem.getLayoutInfo().getVisibleItemsInfo());
                            if (i3 - ((LazyListItemInfo) last).getIndex() > 100) {
                                lazyListState = this.$this_doSmoothScrollToItem;
                                i2 = this.$index - 100;
                                lazyListState.snapToItemIndexInternal$foundation_release(i2, 0);
                            }
                        }
                    } else if (this.$loops.element >= 2) {
                        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) this.$this_doSmoothScrollToItem.getLayoutInfo().getVisibleItemsInfo());
                        int index = ((LazyListItemInfo) first).getIndex();
                        int i4 = this.$index;
                        if (index - i4 > 100) {
                            lazyListState = this.$this_doSmoothScrollToItem;
                            i2 = i4 + 100;
                            lazyListState.snapToItemIndexInternal$foundation_release(i2, 0);
                        }
                    }
                }
                doSmoothScrollToItem$getTargetItem = doSmoothScrollToItem$getTargetItem2;
            }
            if (!LazyListScrollingKt$doSmoothScrollToItem$3.invokeSuspend$isOvershot(this.$forward, this.$this_doSmoothScrollToItem, this.$index, this.$scrollOffset)) {
                if (doSmoothScrollToItem$getTargetItem != null) {
                    throw new ItemFoundInScroll(doSmoothScrollToItem$getTargetItem, this.$anim.element);
                }
                return;
            }
            this.$this_doSmoothScrollToItem.snapToItemIndexInternal$foundation_release(this.$index, this.$scrollOffset);
            this.$loop.element = false;
            animateTo.cancelAnimation();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.lazy.list.LazyListScrollingKt$doSmoothScrollToItem$3$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
        public final /* synthetic */ ScrollScope $$this$scroll;
        public final /* synthetic */ Ref.FloatRef $prevValue;
        public final /* synthetic */ float $target;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(float f2, Ref.FloatRef floatRef, ScrollScope scrollScope) {
            super(1);
            this.$target = f2;
            this.$prevValue = floatRef;
            this.$$this$scroll = scrollScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            invoke2(animationScope);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
            if ((r1 == r6.getValue().floatValue()) == false) goto L15;
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void invoke2(@org.jetbrains.annotations.NotNull androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r6) {
            /*
                r5 = this;
                java.lang.String r0 = "$this$animateTo"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                float r0 = r5.$target
                r1 = 0
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 <= 0) goto L1d
                java.lang.Object r0 = r6.getValue()
                java.lang.Number r0 = (java.lang.Number) r0
                float r0 = r0.floatValue()
                float r1 = r5.$target
                float r1 = kotlin.ranges.RangesKt.coerceAtMost(r0, r1)
                goto L31
            L1d:
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L31
                java.lang.Object r0 = r6.getValue()
                java.lang.Number r0 = (java.lang.Number) r0
                float r0 = r0.floatValue()
                float r1 = r5.$target
                float r1 = kotlin.ranges.RangesKt.coerceAtLeast(r0, r1)
            L31:
                kotlin.jvm.internal.Ref$FloatRef r0 = r5.$prevValue
                float r0 = r0.element
                float r0 = r1 - r0
                androidx.compose.foundation.gestures.ScrollScope r2 = r5.$$this$scroll
                float r2 = r2.scrollBy(r0)
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                r3 = 1
                r4 = 0
                if (r2 != 0) goto L45
                r2 = r3
                goto L46
            L45:
                r2 = r4
            L46:
                if (r2 == 0) goto L5a
                java.lang.Object r2 = r6.getValue()
                java.lang.Number r2 = (java.lang.Number) r2
                float r2 = r2.floatValue()
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 != 0) goto L57
                goto L58
            L57:
                r3 = r4
            L58:
                if (r3 != 0) goto L5d
            L5a:
                r6.cancelAnimation()
            L5d:
                kotlin.jvm.internal.Ref$FloatRef r5 = r5.$prevValue
                float r6 = r5.element
                float r6 = r6 + r0
                r5.element = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.list.LazyListScrollingKt$doSmoothScrollToItem$3.AnonymousClass4.invoke2(androidx.compose.animation.core.AnimationScope):void");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListScrollingKt$doSmoothScrollToItem$3(LazyListState lazyListState, int i2, int i3, Continuation<? super LazyListScrollingKt$doSmoothScrollToItem$3> continuation) {
        super(2, continuation);
        this.$this_doSmoothScrollToItem = lazyListState;
        this.$index = i2;
        this.$scrollOffset = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$isOvershot(boolean z, LazyListState lazyListState, int i2, int i3) {
        if (z) {
            if (lazyListState.getFirstVisibleItemIndex() <= i2 && (lazyListState.getFirstVisibleItemIndex() != i2 || lazyListState.getFirstVisibleItemScrollOffset() <= i3)) {
                return false;
            }
        } else if (lazyListState.getFirstVisibleItemIndex() >= i2 && (lazyListState.getFirstVisibleItemIndex() != i2 || lazyListState.getFirstVisibleItemScrollOffset() >= i3)) {
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        LazyListScrollingKt$doSmoothScrollToItem$3 lazyListScrollingKt$doSmoothScrollToItem$3 = new LazyListScrollingKt$doSmoothScrollToItem$3(this.$this_doSmoothScrollToItem, this.$index, this.$scrollOffset, continuation);
        lazyListScrollingKt$doSmoothScrollToItem$3.L$0 = obj;
        return lazyListScrollingKt$doSmoothScrollToItem$3;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation<? super Unit> continuation) {
        return ((LazyListScrollingKt$doSmoothScrollToItem$3) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac A[Catch: ItemFoundInScroll -> 0x01c7, TryCatch #1 {ItemFoundInScroll -> 0x01c7, blocks: (B:53:0x01bc, B:21:0x00a8, B:23:0x00ac, B:25:0x00b8, B:27:0x00cb, B:28:0x00dc, B:34:0x010a, B:41:0x0151, B:45:0x015a), top: B:73:0x01bc }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb A[Catch: ItemFoundInScroll -> 0x01c7, LOOP:0: B:26:0x00c9->B:27:0x00cb, LOOP_END, TryCatch #1 {ItemFoundInScroll -> 0x01c7, blocks: (B:53:0x01bc, B:21:0x00a8, B:23:0x00ac, B:25:0x00b8, B:27:0x00cb, B:28:0x00dc, B:34:0x010a, B:41:0x0151, B:45:0x015a), top: B:73:0x01bc }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0237 A[RETURN] */
    /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.animation.core.AnimationState, T] */
    /* JADX WARN: Type inference failed for: r7v20, types: [androidx.compose.animation.core.AnimationState, T] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01b3 -> B:73:0x01bc). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.list.LazyListScrollingKt$doSmoothScrollToItem$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
