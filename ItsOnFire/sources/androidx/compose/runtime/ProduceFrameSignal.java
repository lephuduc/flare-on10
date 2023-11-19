package androidx.compose.runtime;

import j.r;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tJ\u0006\u0010\n\u001a\u00020\u0005R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/ProduceFrameSignal;", "", "()V", "pendingFrameContinuation", "awaitFrameRequest", "", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestFrameLocked", "Lkotlin/coroutines/Continuation;", "takeFrameRequestLocked", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ProduceFrameSignal {
    @Nullable
    private Object pendingFrameContinuation;

    @Nullable
    public final Object awaitFrameRequest(@NotNull Object obj, @NotNull Continuation<? super Unit> continuation) {
        Object obj2;
        Continuation intercepted;
        Object obj3;
        r rVar;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Object obj4;
        Object obj5;
        synchronized (obj) {
            Object obj6 = this.pendingFrameContinuation;
            obj2 = RecomposerKt.ProduceAnotherFrame;
            if (obj6 == obj2) {
                obj5 = RecomposerKt.FramePending;
                this.pendingFrameContinuation = obj5;
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
            r rVar2 = new r(intercepted, 1);
            rVar2.E();
            synchronized (obj) {
                Object obj7 = this.pendingFrameContinuation;
                obj3 = RecomposerKt.ProduceAnotherFrame;
                if (obj7 == obj3) {
                    obj4 = RecomposerKt.FramePending;
                    this.pendingFrameContinuation = obj4;
                    rVar = rVar2;
                } else {
                    this.pendingFrameContinuation = rVar2;
                    rVar = null;
                }
            }
            if (rVar != null) {
                Result.Companion companion = Result.Companion;
                rVar.resumeWith(Result.m3581constructorimpl(unit));
            }
            Object x = rVar2.x();
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (x == coroutine_suspended) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return x == coroutine_suspended2 ? x : unit;
        }
    }

    @Nullable
    public final Continuation<Unit> requestFrameLocked() {
        Object obj;
        Object obj2;
        boolean areEqual;
        Object obj3;
        Object obj4;
        Object obj5 = this.pendingFrameContinuation;
        if (obj5 instanceof Continuation) {
            obj4 = RecomposerKt.FramePending;
            this.pendingFrameContinuation = obj4;
            return (Continuation) obj5;
        }
        obj = RecomposerKt.ProduceAnotherFrame;
        if (Intrinsics.areEqual(obj5, obj)) {
            areEqual = true;
        } else {
            obj2 = RecomposerKt.FramePending;
            areEqual = Intrinsics.areEqual(obj5, obj2);
        }
        if (areEqual) {
            return null;
        }
        if (obj5 == null) {
            obj3 = RecomposerKt.ProduceAnotherFrame;
            this.pendingFrameContinuation = obj3;
            return null;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("invalid pendingFrameContinuation ", obj5).toString());
    }

    public final void takeFrameRequestLocked() {
        Object obj;
        Object obj2 = this.pendingFrameContinuation;
        obj = RecomposerKt.FramePending;
        if (!(obj2 == obj)) {
            throw new IllegalStateException("frame not pending".toString());
        }
        this.pendingFrameContinuation = null;
    }
}
