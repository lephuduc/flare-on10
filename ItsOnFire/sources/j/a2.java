package j;

import j.e1;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010%\u001a\u00020 ¢\u0006\u0004\b&\u0010'J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016J$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J.\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b*\u00020\u001a2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0002R\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lj/a2;", "Lj/z1;", "Lj/e1;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatch", "", "timeMillis", "Lj/q;", "continuation", "i", "Lj/p1;", "o", "close", "", "toString", "", "other", "", "equals", "", "hashCode", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ScheduledFuture;", "t", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "s", "Ljava/util/concurrent/Executor;", "k", "Ljava/util/concurrent/Executor;", "q", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class a2 extends z1 implements e1 {
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public final Executor f395k;

    public a2(@NotNull Executor executor) {
        this.f395k = executor;
        q.f.c(q());
    }

    @Override // j.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor q2 = q();
        ExecutorService executorService = q2 instanceof ExecutorService ? (ExecutorService) q2 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // j.o0
    public void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        Runnable runnable2;
        try {
            Executor q2 = q();
            b b2 = c.b();
            if (b2 == null || (runnable2 = b2.i(runnable)) == null) {
                runnable2 = runnable;
            }
            q2.execute(runnable2);
        } catch (RejectedExecutionException e2) {
            b b3 = c.b();
            if (b3 != null) {
                b3.f();
            }
            s(coroutineContext, e2);
            m1.c().dispatch(coroutineContext, runnable);
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof a2) && ((a2) obj).q() == q();
    }

    public int hashCode() {
        return System.identityHashCode(q());
    }

    @Override // j.e1
    public void i(long j2, @NotNull q<? super Unit> qVar) {
        Executor q2 = q();
        ScheduledExecutorService scheduledExecutorService = q2 instanceof ScheduledExecutorService ? (ScheduledExecutorService) q2 : null;
        ScheduledFuture<?> t2 = scheduledExecutorService != null ? t(scheduledExecutorService, new j3(this, qVar), qVar.getContext(), j2) : null;
        if (t2 != null) {
            r2.w(qVar, t2);
        } else {
            a1.f387o.i(j2, qVar);
        }
    }

    @Override // j.e1
    @NotNull
    public p1 o(long j2, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        Executor q2 = q();
        ScheduledExecutorService scheduledExecutorService = q2 instanceof ScheduledExecutorService ? (ScheduledExecutorService) q2 : null;
        ScheduledFuture<?> t2 = scheduledExecutorService != null ? t(scheduledExecutorService, runnable, coroutineContext, j2) : null;
        return t2 != null ? new o1(t2) : a1.f387o.o(j2, runnable, coroutineContext);
    }

    @Override // j.e1
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object p(long j2, @NotNull Continuation<? super Unit> continuation) {
        return e1.a.a(this, j2, continuation);
    }

    @Override // j.z1
    @NotNull
    public Executor q() {
        return this.f395k;
    }

    public final void s(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        r2.g(coroutineContext, y1.a("The task was rejected", rejectedExecutionException));
    }

    public final ScheduledFuture<?> t(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j2) {
        try {
            return scheduledExecutorService.schedule(runnable, j2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            this.s(coroutineContext, e2);
            return null;
        }
    }

    @Override // j.o0
    @NotNull
    public String toString() {
        return q().toString();
    }
}
