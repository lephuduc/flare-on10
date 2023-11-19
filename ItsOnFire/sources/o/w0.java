package o;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
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

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lo/w0;", "Lp/d;", "Lo/u0;", "flow", "", "c", "(Lo/u0;)Z", "", "Lkotlin/coroutines/Continuation;", "", "e", "(Lo/u0;)[Lkotlin/coroutines/Continuation;", "f", "()V", "g", "()Z", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class w0 extends p.d<u0<?>> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1696a = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_state");
    @NotNull
    public volatile /* synthetic */ Object _state = null;

    @Override // p.d
    /* renamed from: c */
    public boolean a(@NotNull u0<?> u0Var) {
        q.r0 r0Var;
        if (this._state != null) {
            return false;
        }
        r0Var = v0.f1664a;
        this._state = r0Var;
        return true;
    }

    @Nullable
    public final Object d(@NotNull Continuation<? super Unit> continuation) {
        Continuation intercepted;
        q.r0 r0Var;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        j.r rVar = new j.r(intercepted, 1);
        rVar.E();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1696a;
        r0Var = v0.f1664a;
        if (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, r0Var, rVar)) {
            Result.Companion companion = Result.Companion;
            rVar.resumeWith(Result.m3581constructorimpl(Unit.INSTANCE));
        }
        Object x = rVar.x();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (x == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return x == coroutine_suspended2 ? x : Unit.INSTANCE;
    }

    @Override // p.d
    @NotNull
    /* renamed from: e */
    public Continuation<Unit>[] b(@NotNull u0<?> u0Var) {
        this._state = null;
        return p.c.f1823a;
    }

    public final void f() {
        q.r0 r0Var;
        q.r0 r0Var2;
        q.r0 r0Var3;
        q.r0 r0Var4;
        while (true) {
            Object obj = this._state;
            if (obj == null) {
                return;
            }
            r0Var = v0.f1665b;
            if (obj == r0Var) {
                return;
            }
            r0Var2 = v0.f1664a;
            if (obj == r0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1696a;
                r0Var3 = v0.f1665b;
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, r0Var3)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1696a;
                r0Var4 = v0.f1664a;
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, obj, r0Var4)) {
                    Result.Companion companion = Result.Companion;
                    ((j.r) obj).resumeWith(Result.m3581constructorimpl(Unit.INSTANCE));
                    return;
                }
            }
        }
    }

    public final boolean g() {
        q.r0 r0Var;
        q.r0 r0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1696a;
        r0Var = v0.f1664a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, r0Var);
        Intrinsics.checkNotNull(andSet);
        r0Var2 = v0.f1665b;
        return andSet == r0Var2;
    }
}
