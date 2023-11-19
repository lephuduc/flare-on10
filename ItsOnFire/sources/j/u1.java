package j;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import j.e1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b \u0018\u00002\u00020\u00012\u00020\u0002:\u000489:;B\u0007¢\u0006\u0004\b7\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00032\n\u0010\u0018\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0004¢\u0006\u0004\b \u0010\u0005J\u001b\u0010\"\u001a\u00020!2\n\u0010\u0018\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0003H\u0002¢\u0006\u0004\b&\u0010\u0005J\u0017\u0010'\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0003H\u0002¢\u0006\u0004\b,\u0010\u0005R$\u00102\u001a\u00020!2\u0006\u0010-\u001a\u00020!8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00104\u001a\u00020!8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0014\u00106\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0013¨\u0006<"}, d2 = {"Lj/u1;", "Lj/v1;", "Lj/e1;", "", "shutdown", "()V", "", "timeMillis", "Lj/q;", "continuation", "i", "(JLj/q;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lj/p1;", "c0", "(JLjava/lang/Runnable;)Lj/p1;", "D", "()J", "Lkotlin/coroutines/CoroutineContext;", "context", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "task", "T", "(Ljava/lang/Runnable;)V", "now", "Lj/u1$c;", "delayedTask", "a0", "(JLj/u1$c;)V", "Z", "", "U", "(Ljava/lang/Runnable;)Z", "S", "()Ljava/lang/Runnable;", "Q", "e0", "(Lj/u1$c;)Z", "", "b0", "(JLj/u1$c;)I", "V", "value", "e", "()Z", "d0", "(Z)V", "isCompleted", "A", "isEmpty", "w", "nextTime", "<init>", "a", "b", "c", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public abstract class u1 extends v1 implements e1 {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f520m = AtomicReferenceFieldUpdater.newUpdater(u1.class, Object.class, "_queue");

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f521n = AtomicReferenceFieldUpdater.newUpdater(u1.class, Object.class, "_delayed");
    @NotNull
    private volatile /* synthetic */ Object _queue = null;
    @NotNull
    private volatile /* synthetic */ Object _delayed = null;
    @NotNull
    private volatile /* synthetic */ int _isCompleted = 0;

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lj/u1$a;", "Lj/u1$c;", "", "run", "", "toString", "Lj/q;", "l", "Lj/q;", "cont", "", "nanoTime", "<init>", "(Lj/u1;JLj/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public final class a extends c {
        @NotNull

        /* renamed from: l  reason: collision with root package name */
        public final q<Unit> f522l;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j2, @NotNull q<? super Unit> qVar) {
            super(j2);
            this.f522l = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f522l.t(u1.this, Unit.INSTANCE);
        }

        @Override // j.u1.c
        @NotNull
        public String toString() {
            return super.toString() + this.f522l;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lj/u1$b;", "Lj/u1$c;", "", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "l", "Ljava/lang/Runnable;", "block", "", "nanoTime", "<init>", "(JLjava/lang/Runnable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class b extends c {
        @NotNull

        /* renamed from: l  reason: collision with root package name */
        public final Runnable f524l;

        public b(long j2, @NotNull Runnable runnable) {
            super(j2);
            this.f524l = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f524l.run();
        }

        @Override // j.u1.c
        @NotNull
        public String toString() {
            return super.toString() + this.f524l;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b*\u0010+J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0016\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R0\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010#2\f\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010#8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lj/u1$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lj/p1;", "Lq/b1;", "other", "", "c", "", "now", "", "e", "Lj/u1$d;", "delayed", "Lj/u1;", "eventLoop", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "", "dispose", "", "toString", "j", "J", "nanoTime", "", "_heap", "Ljava/lang/Object;", "k", "I", "getIndex", "()I", "setIndex", "(I)V", FirebaseAnalytics.Param.INDEX, "Lq/a1;", "value", "a", "()Lq/a1;", "b", "(Lq/a1;)V", "heap", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static abstract class c implements Runnable, Comparable<c>, p1, q.b1 {
        @Nullable
        private volatile Object _heap;
        @JvmField

        /* renamed from: j  reason: collision with root package name */
        public long f525j;

        /* renamed from: k  reason: collision with root package name */
        public int f526k = -1;

        public c(long j2) {
            this.f525j = j2;
        }

        @Override // q.b1
        @Nullable
        public q.a1<?> a() {
            Object obj = this._heap;
            if (obj instanceof q.a1) {
                return (q.a1) obj;
            }
            return null;
        }

        @Override // q.b1
        public void b(@Nullable q.a1<?> a1Var) {
            q.r0 r0Var;
            Object obj = this._heap;
            r0Var = x1.f566a;
            if (!(obj != r0Var)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = a1Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: c */
        public int compareTo(@NotNull c cVar) {
            int i2 = ((this.f525j - cVar.f525j) > 0L ? 1 : ((this.f525j - cVar.f525j) == 0L ? 0 : -1));
            if (i2 > 0) {
                return 1;
            }
            return i2 < 0 ? -1 : 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0040 A[Catch: all -> 0x0048, TryCatch #1 {, blocks: (B:3:0x0001, B:8:0x000c, B:12:0x001a, B:29:0x0045, B:9:0x000d, B:17:0x0021, B:25:0x0037, B:27:0x0040, B:28:0x0042, B:18:0x0024, B:22:0x002e), top: B:37:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final synchronized int d(long r8, @org.jetbrains.annotations.NotNull j.u1.d r10, @org.jetbrains.annotations.NotNull j.u1 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7._heap     // Catch: java.lang.Throwable -> L4b
                q.r0 r1 = j.x1.b()     // Catch: java.lang.Throwable -> L4b
                if (r0 != r1) goto Lc
                r8 = 2
            La:
                monitor-exit(r7)
                return r8
            Lc:
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L4b
                q.b1 r0 = r10.f()     // Catch: java.lang.Throwable -> L48
                j.u1$c r0 = (j.u1.c) r0     // Catch: java.lang.Throwable -> L48
                boolean r11 = j.u1.O(r11)     // Catch: java.lang.Throwable -> L48
                if (r11 == 0) goto L1d
                r8 = 1
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                monitor-exit(r7)
                return r8
            L1d:
                r1 = 0
                if (r0 != 0) goto L24
            L21:
                r10.f527b = r8     // Catch: java.lang.Throwable -> L48
                goto L37
            L24:
                long r3 = r0.f525j     // Catch: java.lang.Throwable -> L48
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L2d
                goto L2e
            L2d:
                r8 = r3
            L2e:
                long r3 = r10.f527b     // Catch: java.lang.Throwable -> L48
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L37
                goto L21
            L37:
                long r8 = r7.f525j     // Catch: java.lang.Throwable -> L48
                long r3 = r10.f527b     // Catch: java.lang.Throwable -> L48
                long r8 = r8 - r3
                int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r8 >= 0) goto L42
                r7.f525j = r3     // Catch: java.lang.Throwable -> L48
            L42:
                r10.a(r7)     // Catch: java.lang.Throwable -> L48
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                r8 = 0
                goto La
            L48:
                r8 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                throw r8     // Catch: java.lang.Throwable -> L4b
            L4b:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: j.u1.c.d(long, j.u1$d, j.u1):int");
        }

        @Override // j.p1
        public final synchronized void dispose() {
            q.r0 r0Var;
            q.r0 r0Var2;
            Object obj = this._heap;
            r0Var = x1.f566a;
            if (obj == r0Var) {
                return;
            }
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                dVar.k(this);
            }
            r0Var2 = x1.f566a;
            this._heap = r0Var2;
        }

        public final boolean e(long j2) {
            return j2 - this.f525j >= 0;
        }

        @Override // q.b1
        public int getIndex() {
            return this.f526k;
        }

        @Override // q.b1
        public void setIndex(int i2) {
            this.f526k = i2;
        }

        @NotNull
        public String toString() {
            return "Delayed[nanos=" + this.f525j + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lj/u1$d;", "Lq/a1;", "Lj/u1$c;", "", "b", "J", "timeNow", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class d extends q.a1<c> {
        @JvmField

        /* renamed from: b  reason: collision with root package name */
        public long f527b;

        public d(long j2) {
            this.f527b = j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    public final boolean e() {
        return this._isCompleted;
    }

    @Override // j.t1
    public boolean A() {
        q.r0 r0Var;
        if (C()) {
            d dVar = (d) this._delayed;
            if (dVar == null || dVar.h()) {
                Object obj = this._queue;
                if (obj != null) {
                    if (obj instanceof q.b0) {
                        return ((q.b0) obj).h();
                    }
                    r0Var = x1.f573h;
                    if (obj != r0Var) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0057  */
    @Override // j.t1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long D() {
        /*
            r9 = this;
            boolean r0 = r9.E()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = r9._delayed
            j.u1$d r0 = (j.u1.d) r0
            if (r0 == 0) goto L4d
            boolean r3 = r0.h()
            if (r3 != 0) goto L4d
            j.b r3 = j.c.b()
            if (r3 == 0) goto L20
            long r3 = r3.b()
            goto L24
        L20:
            long r3 = java.lang.System.nanoTime()
        L24:
            monitor-enter(r0)
            q.b1 r5 = r0.f()     // Catch: java.lang.Throwable -> L4a
            r6 = 0
            if (r5 != 0) goto L2e
        L2c:
            monitor-exit(r0)
            goto L45
        L2e:
            j.u1$c r5 = (j.u1.c) r5     // Catch: java.lang.Throwable -> L4a
            boolean r7 = r5.e(r3)     // Catch: java.lang.Throwable -> L4a
            r8 = 0
            if (r7 == 0) goto L3c
            boolean r5 = r9.U(r5)     // Catch: java.lang.Throwable -> L4a
            goto L3d
        L3c:
            r5 = r8
        L3d:
            if (r5 == 0) goto L2c
            q.b1 r5 = r0.l(r8)     // Catch: java.lang.Throwable -> L4a
            r6 = r5
            goto L2c
        L45:
            j.u1$c r6 = (j.u1.c) r6
            if (r6 != 0) goto L24
            goto L4d
        L4a:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        L4d:
            java.lang.Runnable r0 = r9.S()
            if (r0 == 0) goto L57
            r0.run()
            return r1
        L57:
            long r0 = r9.w()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.u1.D():long");
    }

    public final void Q() {
        q.r0 r0Var;
        q.r0 r0Var2;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f520m;
                r0Var = x1.f573h;
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, null, r0Var)) {
                    return;
                }
            } else if (obj instanceof q.b0) {
                ((q.b0) obj).d();
                return;
            } else {
                r0Var2 = x1.f573h;
                if (obj == r0Var2) {
                    return;
                }
                q.b0 b0Var = new q.b0(8, true);
                b0Var.a((Runnable) obj);
                if (androidx.concurrent.futures.a.a(f520m, this, obj, b0Var)) {
                    return;
                }
            }
        }
    }

    public final Runnable S() {
        q.r0 r0Var;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof q.b0) {
                q.b0 b0Var = (q.b0) obj;
                Object l2 = b0Var.l();
                if (l2 != q.b0.f1985t) {
                    return (Runnable) l2;
                }
                androidx.concurrent.futures.a.a(f520m, this, obj, b0Var.k());
            } else {
                r0Var = x1.f573h;
                if (obj == r0Var) {
                    return null;
                }
                if (androidx.concurrent.futures.a.a(f520m, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    public void T(@NotNull Runnable runnable) {
        if (U(runnable)) {
            L();
        } else {
            a1.f387o.T(runnable);
        }
    }

    public final boolean U(Runnable runnable) {
        q.r0 r0Var;
        while (true) {
            Object obj = this._queue;
            if (e()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.a.a(f520m, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof q.b0) {
                q.b0 b0Var = (q.b0) obj;
                int a2 = b0Var.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    androidx.concurrent.futures.a.a(f520m, this, obj, b0Var.k());
                } else if (a2 == 2) {
                    return false;
                }
            } else {
                r0Var = x1.f573h;
                if (obj == r0Var) {
                    return false;
                }
                q.b0 b0Var2 = new q.b0(8, true);
                b0Var2.a((Runnable) obj);
                b0Var2.a(runnable);
                if (androidx.concurrent.futures.a.a(f520m, this, obj, b0Var2)) {
                    return true;
                }
            }
        }
    }

    public final void V() {
        c n2;
        j.b b2 = j.c.b();
        long b3 = b2 != null ? b2.b() : System.nanoTime();
        while (true) {
            d dVar = (d) this._delayed;
            if (dVar == null || (n2 = dVar.n()) == null) {
                return;
            }
            J(b3, n2);
        }
    }

    public final void Z() {
        this._queue = null;
        this._delayed = null;
    }

    public final void a0(long j2, @NotNull c cVar) {
        int b0 = b0(j2, cVar);
        if (b0 == 0) {
            if (e0(cVar)) {
                L();
            }
        } else if (b0 == 1) {
            J(j2, cVar);
        } else if (b0 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    public final int b0(long j2, c cVar) {
        if (e()) {
            return 1;
        }
        d dVar = (d) this._delayed;
        if (dVar == null) {
            androidx.concurrent.futures.a.a(f521n, this, null, new d(j2));
            Object obj = this._delayed;
            Intrinsics.checkNotNull(obj);
            dVar = (d) obj;
        }
        return cVar.d(j2, dVar, this);
    }

    @NotNull
    public final p1 c0(long j2, @NotNull Runnable runnable) {
        long d2 = x1.d(j2);
        if (d2 < 4611686018427387903L) {
            j.b b2 = j.c.b();
            long b3 = b2 != null ? b2.b() : System.nanoTime();
            b bVar = new b(d2 + b3, runnable);
            a0(b3, bVar);
            return bVar;
        }
        return c3.f407j;
    }

    public final void d0(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    @Override // j.o0
    public final void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        T(runnable);
    }

    public final boolean e0(c cVar) {
        d dVar = (d) this._delayed;
        return (dVar != null ? dVar.i() : null) == cVar;
    }

    @Override // j.e1
    public void i(long j2, @NotNull q<? super Unit> qVar) {
        long d2 = x1.d(j2);
        if (d2 < 4611686018427387903L) {
            j.b b2 = j.c.b();
            long b3 = b2 != null ? b2.b() : System.nanoTime();
            a aVar = new a(d2 + b3, qVar);
            a0(b3, aVar);
            t.a(qVar, aVar);
        }
    }

    @NotNull
    public p1 o(long j2, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return e1.a.b(this, j2, runnable, coroutineContext);
    }

    @Override // j.e1
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object p(long j2, @NotNull Continuation<? super Unit> continuation) {
        return e1.a.a(this, j2, continuation);
    }

    @Override // j.t1
    public void shutdown() {
        u3.f529a.c();
        d0(true);
        Q();
        do {
        } while (D() <= 0);
        V();
    }

    @Override // j.t1
    public long w() {
        c i2;
        long coerceAtLeast;
        q.r0 r0Var;
        if (super.w() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof q.b0)) {
                r0Var = x1.f573h;
                return obj == r0Var ? Long.MAX_VALUE : 0L;
            } else if (!((q.b0) obj).h()) {
                return 0L;
            }
        }
        d dVar = (d) this._delayed;
        if (dVar == null || (i2 = dVar.i()) == null) {
            return Long.MAX_VALUE;
        }
        long j2 = i2.f525j;
        j.b b2 = j.c.b();
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(j2 - (b2 != null ? b2.b() : System.nanoTime()), 0L);
        return coerceAtLeast;
    }
}
