package j;

import j.u1;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0018\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b@\u0010\u0015J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014J\b\u0010\f\u001a\u00020\u0005H\u0016J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00072\n\u0010\u000e\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\u000f\u0010\u0014\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0007J\b\u0010\u0018\u001a\u00020\u0005H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u0005H\u0002R\u0014\u0010!\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u000bR\u0014\u0010%\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u000bR\u001e\u0010&\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b&\u0010'\u0012\u0004\b(\u0010\u0015R\u0014\u0010,\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u00100\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010+R\u0014\u00102\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010+R\u0014\u00104\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010+R\u0016\u00105\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010+R\u0014\u00108\u001a\u00020\u00198TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010;\u001a\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0014\u0010?\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010:¨\u0006A"}, d2 = {"Lj/a1;", "Lj/u1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "task", "", "T", "", "now", "Lj/u1$c;", "delayedTask", "J", "shutdown", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Lj/p1;", "o", "run", "h0", "()V", "timeout", "o0", "n0", "Ljava/lang/Thread;", "g0", "", "m0", "f0", "", "p", "Ljava/lang/String;", "THREAD_NAME", "q", "DEFAULT_KEEP_ALIVE_MS", "r", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "s", "I", "FRESH", "t", "ACTIVE", "u", "SHUTDOWN_REQ", "v", "SHUTDOWN_ACK", "w", "SHUTDOWN", "debugStatus", "G", "()Ljava/lang/Thread;", "thread", "l0", "()Z", "isThreadPresent", "j0", "isShutDown", "k0", "isShutdownRequested", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class a1 extends u1 implements Runnable {
    @Nullable
    private static volatile Thread _thread = null;
    private static volatile int debugStatus = 0;
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public static final a1 f387o;
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    public static final String f388p = "kotlinx.coroutines.DefaultExecutor";

    /* renamed from: q  reason: collision with root package name */
    public static final long f389q = 1000;

    /* renamed from: r  reason: collision with root package name */
    public static final long f390r;

    /* renamed from: s  reason: collision with root package name */
    public static final int f391s = 0;

    /* renamed from: t  reason: collision with root package name */
    public static final int f392t = 1;

    /* renamed from: u  reason: collision with root package name */
    public static final int f393u = 2;

    /* renamed from: v  reason: collision with root package name */
    public static final int f394v = 3;
    public static final int w = 4;

    static {
        Long l2;
        a1 a1Var = new a1();
        f387o = a1Var;
        t1.z(a1Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f390r = timeUnit.toNanos(l2.longValue());
    }

    public static /* synthetic */ void i0() {
    }

    @Override // j.v1
    @NotNull
    public Thread G() {
        Thread thread = _thread;
        return thread == null ? g0() : thread;
    }

    @Override // j.v1
    public void J(long j2, @NotNull u1.c cVar) {
        n0();
    }

    @Override // j.u1
    public void T(@NotNull Runnable runnable) {
        if (j0()) {
            n0();
        }
        super.T(runnable);
    }

    public final synchronized void f0() {
        if (k0()) {
            debugStatus = 3;
            Z();
            notifyAll();
        }
    }

    public final synchronized Thread g0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, f388p);
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final synchronized void h0() {
        debugStatus = 0;
        g0();
        while (debugStatus == 0) {
            wait();
        }
    }

    public final boolean j0() {
        return debugStatus == 4;
    }

    public final boolean k0() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }

    public final boolean l0() {
        return _thread != null;
    }

    public final synchronized boolean m0() {
        if (k0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    public final void n0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // j.u1, j.e1
    @NotNull
    public p1 o(long j2, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return c0(j2, runnable);
    }

    public final synchronized void o0(long j2) {
        Unit unit;
        long currentTimeMillis = System.currentTimeMillis() + j2;
        if (!k0()) {
            debugStatus = 2;
        }
        while (debugStatus != 3 && _thread != null) {
            Thread thread = _thread;
            if (thread != null) {
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
            if (currentTimeMillis - System.currentTimeMillis() <= 0) {
                break;
            }
            wait(j2);
        }
        debugStatus = 0;
    }

    @Override // java.lang.Runnable
    public void run() {
        Unit unit;
        boolean A;
        u3.f529a.d(this);
        b b2 = c.b();
        if (b2 != null) {
            b2.d();
        }
        try {
            if (!m0()) {
                if (A) {
                    return;
                }
                return;
            }
            long j2 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long D = D();
                if (D == Long.MAX_VALUE) {
                    b b3 = c.b();
                    long b4 = b3 != null ? b3.b() : System.nanoTime();
                    if (j2 == Long.MAX_VALUE) {
                        j2 = f390r + b4;
                    }
                    long j3 = j2 - b4;
                    if (j3 <= 0) {
                        _thread = null;
                        f0();
                        b b5 = c.b();
                        if (b5 != null) {
                            b5.h();
                        }
                        if (A()) {
                            return;
                        }
                        G();
                        return;
                    }
                    D = RangesKt___RangesKt.coerceAtMost(D, j3);
                } else {
                    j2 = Long.MAX_VALUE;
                }
                if (D > 0) {
                    if (k0()) {
                        _thread = null;
                        f0();
                        b b6 = c.b();
                        if (b6 != null) {
                            b6.h();
                        }
                        if (A()) {
                            return;
                        }
                        G();
                        return;
                    }
                    b b7 = c.b();
                    if (b7 != null) {
                        b7.c(this, D);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        LockSupport.parkNanos(this, D);
                    }
                }
            }
        } finally {
            _thread = null;
            f0();
            b b8 = c.b();
            if (b8 != null) {
                b8.h();
            }
            if (!A()) {
                G();
            }
        }
    }

    @Override // j.u1, j.t1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
