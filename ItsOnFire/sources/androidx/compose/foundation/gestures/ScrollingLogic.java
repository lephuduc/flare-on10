package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010%J\u001b\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u0006\u0010+\u001a\u00020\u0005J1\u0010,\u001a\u00020$*\u00020-2\u0006\u0010.\u001a\u00020$2\b\u0010/\u001a\u0004\u0018\u00010'2\u0006\u00100\u001a\u000201ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J\n\u00104\u001a\u00020$*\u00020$J\u0017\u00105\u001a\u00020$*\u00020'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107J\u0017\u00105\u001a\u00020$*\u00020\u001dø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00107J\u001a\u00109\u001a\u00020'*\u00020$ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010<\u001a\u00020\u001d*\u00020$ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b=\u0010;J\u001f\u0010>\u001a\u00020\u001d*\u00020\u001d2\u0006\u0010?\u001a\u00020$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010AR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "reverseDirection", "", "nestedScrollDispatcher", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "overScrollController", "Landroidx/compose/foundation/gestures/OverScrollController;", "(Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/runtime/State;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/gestures/OverScrollController;)V", "getFlingBehavior", "()Landroidx/compose/foundation/gestures/FlingBehavior;", "getNestedScrollDispatcher", "()Landroidx/compose/runtime/State;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getOverScrollController", "()Landroidx/compose/foundation/gestures/OverScrollController;", "getReverseDirection", "()Z", "getScrollableState", "()Landroidx/compose/foundation/gestures/ScrollableState;", "doFlingAnimation", "Landroidx/compose/ui/unit/Velocity;", "available", "doFlingAnimation-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDragStopped", "", "axisVelocity", "", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performRawScroll", "Landroidx/compose/ui/geometry/Offset;", "scroll", "performRawScroll-MK-Hz9U", "(J)J", "shouldScrollImmediately", "dispatchScroll", "Landroidx/compose/foundation/gestures/ScrollScope;", "scrollDelta", "pointerPosition", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "dispatchScroll-iGfEq8s", "(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/ui/geometry/Offset;I)F", "reverseIfNeeded", "toFloat", "toFloat-k-4lQ0M", "(J)F", "toFloat-TH1AsA0", "toOffset", "toOffset-tuRUvjQ", "(F)J", "toVelocity", "toVelocity-adjELrA", "update", "newValue", "update-QWom1Mo", "(JF)J", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ScrollingLogic {
    @NotNull
    private final FlingBehavior flingBehavior;
    @NotNull
    private final State<NestedScrollDispatcher> nestedScrollDispatcher;
    @NotNull
    private final Orientation orientation;
    @Nullable
    private final OverScrollController overScrollController;
    private final boolean reverseDirection;
    @NotNull
    private final ScrollableState scrollableState;

    public ScrollingLogic(@NotNull Orientation orientation, boolean z, @NotNull State<NestedScrollDispatcher> nestedScrollDispatcher, @NotNull ScrollableState scrollableState, @NotNull FlingBehavior flingBehavior, @Nullable OverScrollController overScrollController) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(nestedScrollDispatcher, "nestedScrollDispatcher");
        Intrinsics.checkNotNullParameter(scrollableState, "scrollableState");
        Intrinsics.checkNotNullParameter(flingBehavior, "flingBehavior");
        this.orientation = orientation;
        this.reverseDirection = z;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.scrollableState = scrollableState;
        this.flingBehavior = flingBehavior;
        this.overScrollController = overScrollController;
    }

    /* renamed from: dispatchScroll-iGfEq8s  reason: not valid java name */
    public final float m286dispatchScrolliGfEq8s(@NotNull ScrollScope receiver, float f2, @Nullable Offset offset, int i2) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        OverScrollController overScrollController = this.overScrollController;
        float m290toFloatk4lQ0M = f2 - (overScrollController == null ? 0.0f : m290toFloatk4lQ0M(overScrollController.mo220consumePreScrollA0NYTsA(m291toOffsettuRUvjQ(f2), offset, i2)));
        NestedScrollDispatcher value = this.nestedScrollDispatcher.getValue();
        float m290toFloatk4lQ0M2 = m290toFloatk4lQ0M - m290toFloatk4lQ0M(value.m2563dispatchPreScrollOzD1aCk(m291toOffsettuRUvjQ(m290toFloatk4lQ0M), i2));
        float reverseIfNeeded = reverseIfNeeded(receiver.scrollBy(reverseIfNeeded(m290toFloatk4lQ0M2)));
        float f3 = m290toFloatk4lQ0M2 - reverseIfNeeded;
        long m2561dispatchPostScrollDzOQY0M = value.m2561dispatchPostScrollDzOQY0M(m291toOffsettuRUvjQ(reverseIfNeeded), m291toOffsettuRUvjQ(f3), i2);
        OverScrollController overScrollController2 = this.overScrollController;
        if (overScrollController2 != null) {
            overScrollController2.mo218consumePostScrolll7mfB5k(m291toOffsettuRUvjQ(m290toFloatk4lQ0M2), m291toOffsettuRUvjQ(f3 - m290toFloatk4lQ0M(m2561dispatchPostScrollDzOQY0M)), offset, i2);
        }
        return f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: doFlingAnimation-QWom1Mo  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m287doFlingAnimationQWom1Mo(long r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r12, r15)
        L18:
            r4 = r0
            java.lang.Object r15 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r12 = r4.L$0
            kotlin.jvm.internal.Ref$LongRef r12 = (kotlin.jvm.internal.Ref.LongRef) r12
            kotlin.ResultKt.throwOnFailure(r15)
            goto L5f
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            kotlin.ResultKt.throwOnFailure(r15)
            kotlin.jvm.internal.Ref$LongRef r15 = new kotlin.jvm.internal.Ref$LongRef
            r15.<init>()
            r15.element = r13
            androidx.compose.foundation.gestures.ScrollableState r1 = r12.getScrollableState()
            r3 = 0
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r11 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r10 = 0
            r5 = r11
            r6 = r12
            r7 = r15
            r8 = r13
            r5.<init>(r6, r7, r8, r10)
            r5 = 1
            r6 = 0
            r4.L$0 = r15
            r4.label = r2
            r2 = r3
            r3 = r11
            java.lang.Object r12 = androidx.compose.foundation.gestures.ScrollableState.DefaultImpls.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto L5e
            return r0
        L5e:
            r12 = r15
        L5f:
            long r12 = r12.element
            androidx.compose.ui.unit.Velocity r12 = androidx.compose.ui.unit.Velocity.m3541boximpl(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m287doFlingAnimationQWom1Mo(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final FlingBehavior getFlingBehavior() {
        return this.flingBehavior;
    }

    @NotNull
    public final State<NestedScrollDispatcher> getNestedScrollDispatcher() {
        return this.nestedScrollDispatcher;
    }

    @NotNull
    public final Orientation getOrientation() {
        return this.orientation;
    }

    @Nullable
    public final OverScrollController getOverScrollController() {
        return this.overScrollController;
    }

    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    @NotNull
    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onDragStopped(float r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.onDragStopped(float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: performRawScroll-MK-Hz9U  reason: not valid java name */
    public final long m288performRawScrollMKHz9U(long j2) {
        return this.scrollableState.isScrollInProgress() ? Offset.Companion.m1177getZeroF1C5BW0() : m291toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m290toFloatk4lQ0M(j2)))));
    }

    public final float reverseIfNeeded(float f2) {
        return this.reverseDirection ? f2 * (-1) : f2;
    }

    public final boolean shouldScrollImmediately() {
        if (!this.scrollableState.isScrollInProgress()) {
            OverScrollController overScrollController = this.overScrollController;
            if (!(overScrollController == null ? false : overScrollController.stopOverscrollAnimation())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: toFloat-TH1AsA0  reason: not valid java name */
    public final float m289toFloatTH1AsA0(long j2) {
        return this.orientation == Orientation.Horizontal ? Velocity.m3550getXimpl(j2) : Velocity.m3551getYimpl(j2);
    }

    /* renamed from: toFloat-k-4lQ0M  reason: not valid java name */
    public final float m290toFloatk4lQ0M(long j2) {
        return this.orientation == Orientation.Horizontal ? Offset.m1161getXimpl(j2) : Offset.m1162getYimpl(j2);
    }

    /* renamed from: toOffset-tuRUvjQ  reason: not valid java name */
    public final long m291toOffsettuRUvjQ(float f2) {
        return (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) == 0 ? Offset.Companion.m1177getZeroF1C5BW0() : this.orientation == Orientation.Horizontal ? OffsetKt.Offset(f2, 0.0f) : OffsetKt.Offset(0.0f, f2);
    }

    /* renamed from: toVelocity-adjELrA  reason: not valid java name */
    public final long m292toVelocityadjELrA(float f2) {
        return this.orientation == Orientation.Horizontal ? VelocityKt.Velocity(f2, 0.0f) : VelocityKt.Velocity(0.0f, f2);
    }

    /* renamed from: update-QWom1Mo  reason: not valid java name */
    public final long m293updateQWom1Mo(long j2, float f2) {
        return this.orientation == Orientation.Horizontal ? Velocity.m3546copyOhffZ5M$default(j2, f2, 0.0f, 2, null) : Velocity.m3546copyOhffZ5M$default(j2, 0.0f, f2, 1, null);
    }
}
