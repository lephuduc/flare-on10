package j;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lj/h;", "T", "Lj/a;", "", "state", "", "g0", "x1", "()Ljava/lang/Object;", "Ljava/lang/Thread;", "l", "Ljava/lang/Thread;", "blockedThread", "Lj/t1;", "m", "Lj/t1;", "eventLoop", "", "M0", "()Z", "isScopedCoroutine", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lj/t1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class h<T> extends a<T> {
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    public final Thread f442l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public final t1 f443m;

    public h(@NotNull CoroutineContext coroutineContext, @NotNull Thread thread, @Nullable t1 t1Var) {
        super(coroutineContext, true, true);
        this.f442l = thread;
        this.f443m = t1Var;
    }

    @Override // j.v2
    public boolean M0() {
        return true;
    }

    @Override // j.v2
    public void g0(@Nullable Object obj) {
        Unit unit;
        if (Intrinsics.areEqual(Thread.currentThread(), this.f442l)) {
            return;
        }
        Thread thread = this.f442l;
        b b2 = c.b();
        if (b2 != null) {
            b2.g(thread);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            LockSupport.unpark(thread);
        }
    }

    public final T x1() {
        Unit unit;
        b b2 = c.b();
        if (b2 != null) {
            b2.d();
        }
        try {
            t1 t1Var = this.f443m;
            if (t1Var != null) {
                t1.z(t1Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                t1 t1Var2 = this.f443m;
                long D = t1Var2 != null ? t1Var2.D() : Long.MAX_VALUE;
                if (e()) {
                    t1 t1Var3 = this.f443m;
                    if (t1Var3 != null) {
                        t1.s(t1Var3, false, 1, null);
                    }
                    T t2 = (T) w2.o(G0());
                    e0 e0Var = t2 instanceof e0 ? (e0) t2 : null;
                    if (e0Var == null) {
                        return t2;
                    }
                    throw e0Var.f424a;
                }
                b b3 = c.b();
                if (b3 != null) {
                    b3.c(this, D);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    LockSupport.parkNanos(this, D);
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            j0(interruptedException);
            throw interruptedException;
        } finally {
            b b4 = c.b();
            if (b4 != null) {
                b4.h();
            }
        }
    }
}
