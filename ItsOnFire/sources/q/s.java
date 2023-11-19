package q;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.c2;
import j.i2;
import j.p1;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0017\u0012\u0006\u0010 \u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b-\u0010.J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0097Aø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\r\u001a\u00020\fH\u0096\u0001J\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0096\u0001J\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0017J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\u001c\u0010\u0017\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0016J\u001c\u0010\u0018\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0017J#\u0010\u001a\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0082\bJ\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u0014\u0010\u001d\u001a\u00020\u001b2\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003H\u0002R\u0014\u0010 \u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u001e\u0010'\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010,\u001a\u00060(j\u0002`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lq/s;", "Lj/o0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lj/e1;", "", "time", "", "p", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Lj/p1;", "o", "Lj/q;", "continuation", "i", "", "parallelism", "limitedParallelism", "run", "dispatch", "dispatchYield", "Lkotlin/Function0;", "s", "", "t", "q", "j", "Lj/o0;", "dispatcher", "k", "I", "runningWorkers", "Lq/a0;", "m", "Lq/a0;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Ljava/lang/Object;", "workerAllocationLock", "<init>", "(Lj/o0;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class s extends j.o0 implements Runnable, j.e1 {
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public final j.o0 f2051j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2052k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ j.e1 f2053l;
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public final a0<Runnable> f2054m;
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public final Object f2055n;
    private volatile int runningWorkers;

    public s(@NotNull j.o0 o0Var, int i2) {
        this.f2051j = o0Var;
        this.f2052k = i2;
        j.e1 e1Var = o0Var instanceof j.e1 ? (j.e1) o0Var : null;
        this.f2053l = e1Var == null ? j.b1.a() : e1Var;
        this.f2054m = new a0<>(false);
        this.f2055n = new Object();
    }

    @Override // j.o0
    public void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        if (q(runnable) || !t()) {
            return;
        }
        this.f2051j.dispatch(this, this);
    }

    @Override // j.o0
    @i2
    public void dispatchYield(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        if (q(runnable) || !t()) {
            return;
        }
        this.f2051j.dispatchYield(this, this);
    }

    @Override // j.e1
    public void i(long j2, @NotNull j.q<? super Unit> qVar) {
        this.f2053l.i(j2, qVar);
    }

    @Override // j.o0
    @c2
    @NotNull
    public j.o0 limitedParallelism(int i2) {
        t.a(i2);
        return i2 >= this.f2052k ? this : super.limitedParallelism(i2);
    }

    @Override // j.e1
    @NotNull
    public p1 o(long j2, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return this.f2053l.o(j2, runnable, coroutineContext);
    }

    @Override // j.e1
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object p(long j2, @NotNull Continuation<? super Unit> continuation) {
        return this.f2053l.p(j2, continuation);
    }

    public final boolean q(Runnable runnable) {
        this.f2054m.a(runnable);
        return this.runningWorkers >= this.f2052k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        r1 = r4.f2055n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r4.f2054m.c() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        r4.runningWorkers++;
        r2 = kotlin.Unit.INSTANCE;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            q.a0<java.lang.Runnable> r2 = r4.f2054m
            java.lang.Object r2 = r2.g()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            j.r0.b(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            j.o0 r2 = r4.f2051j
            boolean r2 = r2.isDispatchNeeded(r4)
            if (r2 == 0) goto L2
            j.o0 r0 = r4.f2051j
            r0.dispatch(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.f2055n
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            q.a0<java.lang.Runnable> r2 = r4.f2054m     // Catch: java.lang.Throwable -> L47
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            goto L1
        L47:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q.s.run():void");
    }

    public final void s(Runnable runnable, Function0<Unit> function0) {
        if (!q(runnable) && t()) {
            function0.invoke();
        }
    }

    public final boolean t() {
        synchronized (this.f2055n) {
            if (this.runningWorkers >= this.f2052k) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }
}
