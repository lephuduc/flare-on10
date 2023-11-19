package l;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\fB\u000f\u0012\u0006\u0010,\u001a\u00020(¢\u0006\u0004\bQ\u0010OJ\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\b\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u00002\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010 \u001a\u00020\u000f2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001dH\u0082\u0010¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\"H\u0002¢\u0006\u0004\b&\u0010'R\u0017\u0010,\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010\u0018\u001a\u0004\b*\u0010+R\u0018\u00101\u001a\u00060-j\u0002`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R6\u0010;\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d06j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d`78\u0002X\u0082\u0004¢\u0006\f\n\u0004\b8\u00109\u0012\u0004\b:\u0010\u001cR\u0014\u0010>\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0014\u0010D\u001a\u00020A8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR$\u0010I\u001a\u00020\"2\u0006\u0010E\u001a\u00020\"8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bF\u0010$\"\u0004\bG\u0010HR$\u0010L\u001a\u00020\"2\u0006\u0010E\u001a\u00020\"8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bJ\u0010$\"\u0004\bK\u0010HR$\u0010P\u001a\u00020(2\u0006\u0010E\u001a\u00020(8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bM\u0010+\"\u0004\bN\u0010O¨\u0006R"}, d2 = {"Ll/g;", "E", "Ll/c;", "Ll/i;", "Ll/i0;", "J", "()Ll/i0;", "", "cause", "", "G", "(Ljava/lang/Throwable;)Z", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "element", "", "H", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lt/f;", "select", "I", "(Ljava/lang/Object;Lt/f;)Ljava/lang/Object;", "W", "X", "()V", "Ll/g$a;", "addSub", "removeSub", "i0", "(Ll/g$a;Ll/g$a;)V", "", "Y", "()J", FirebaseAnalytics.Param.INDEX, "Z", "(J)Ljava/lang/Object;", "", "m", "a0", "()I", "capacity", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Ljava/util/concurrent/locks/ReentrantLock;", "bufferLock", "", "o", "[Ljava/lang/Object;", "buffer", "", "Lkotlinx/coroutines/internal/SubscribersList;", "p", "Ljava/util/List;", "getSubscribers$annotations", "subscribers", "B", "()Z", "isBufferAlwaysFull", "C", "isBufferFull", "", "l", "()Ljava/lang/String;", "bufferDebugString", "value", "b0", "f0", "(J)V", "head", "e0", "h0", "tail", "c0", "g0", "(I)V", "size", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class g<E> extends c<E> implements i<E> {
    @NotNull
    private volatile /* synthetic */ long _head;
    @NotNull
    private volatile /* synthetic */ int _size;
    @NotNull
    private volatile /* synthetic */ long _tail;

    /* renamed from: m  reason: collision with root package name */
    public final int f656m;
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public final ReentrantLock f657n;
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public final Object[] f658o;
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    public final List<a<E>> f659p;

    @Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b,\u0010-J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\rR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\nR\u0014\u0010'\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\nR\u0014\u0010)\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\nR\u0014\u0010+\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\n¨\u0006."}, d2 = {"Ll/g$a;", "E", "Ll/a;", "Ll/i0;", "", "cause", "", "G", "(Ljava/lang/Throwable;)Z", "r0", "()Z", "", "l0", "()Ljava/lang/Object;", "Lt/f;", "select", "m0", "(Lt/f;)Ljava/lang/Object;", "t0", "u0", "Ll/g;", "m", "Ll/g;", "broadcastChannel", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Ljava/util/concurrent/locks/ReentrantLock;", "subLock", "", "value", "s0", "()J", "v0", "(J)V", "subHead", "e0", "isBufferAlwaysEmpty", "f0", "isBufferEmpty", "B", "isBufferAlwaysFull", "C", "isBufferFull", "<init>", "(Ll/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class a<E> extends l.a<E> implements i0<E> {
        @NotNull
        private volatile /* synthetic */ long _subHead;
        @NotNull

        /* renamed from: m  reason: collision with root package name */
        public final g<E> f660m;
        @NotNull

        /* renamed from: n  reason: collision with root package name */
        public final ReentrantLock f661n;

        public a(@NotNull g<E> gVar) {
            super(null);
            this.f660m = gVar;
            this.f661n = new ReentrantLock();
            this._subHead = 0L;
        }

        @Override // l.c
        public boolean B() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // l.c
        public boolean C() {
            throw new IllegalStateException("Should not be used".toString());
        }

        @Override // l.c, l.m0
        public boolean G(@Nullable Throwable th) {
            boolean G = super.G(th);
            if (G) {
                g.j0(this.f660m, null, this, 1, null);
                ReentrantLock reentrantLock = this.f661n;
                reentrantLock.lock();
                try {
                    v0(this.f660m.e0());
                    Unit unit = Unit.INSTANCE;
                } finally {
                    reentrantLock.unlock();
                }
            }
            return G;
        }

        @Override // l.a
        public boolean e0() {
            return false;
        }

        @Override // l.a
        public boolean f0() {
            return s0() >= this.f660m.e0();
        }

        @Override // l.a
        @Nullable
        public Object l0() {
            boolean z;
            ReentrantLock reentrantLock = this.f661n;
            reentrantLock.lock();
            try {
                Object u0 = u0();
                if ((u0 instanceof w) || u0 == b.f634f) {
                    z = false;
                } else {
                    v0(s0() + 1);
                    z = true;
                }
                reentrantLock.unlock();
                w wVar = u0 instanceof w ? (w) u0 : null;
                if (wVar != null) {
                    G(wVar.f943m);
                }
                if (r0() ? true : z) {
                    g.j0(this.f660m, null, null, 3, null);
                }
                return u0;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @Override // l.a
        @Nullable
        public Object m0(@NotNull t.f<?> fVar) {
            ReentrantLock reentrantLock = this.f661n;
            reentrantLock.lock();
            try {
                Object u0 = u0();
                boolean z = false;
                if (!(u0 instanceof w) && u0 != b.f634f) {
                    if (fVar.i()) {
                        v0(s0() + 1);
                        z = true;
                    } else {
                        u0 = t.g.d();
                    }
                }
                reentrantLock.unlock();
                w wVar = u0 instanceof w ? (w) u0 : null;
                if (wVar != null) {
                    G(wVar.f943m);
                }
                if (r0() ? true : z) {
                    g.j0(this.f660m, null, null, 3, null);
                }
                return u0;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
            r2 = (l.w) r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean r0() {
            /*
                r8 = this;
                r0 = 0
            L1:
                boolean r1 = r8.t0()
                r2 = 0
                if (r1 == 0) goto L59
                java.util.concurrent.locks.ReentrantLock r1 = r8.f661n
                boolean r1 = r1.tryLock()
                if (r1 == 0) goto L59
                java.lang.Object r1 = r8.u0()     // Catch: java.lang.Throwable -> L52
                q.r0 r3 = l.b.f634f     // Catch: java.lang.Throwable -> L52
                if (r1 != r3) goto L1e
            L18:
                java.util.concurrent.locks.ReentrantLock r1 = r8.f661n
                r1.unlock()
                goto L1
            L1e:
                boolean r3 = r1 instanceof l.w     // Catch: java.lang.Throwable -> L52
                if (r3 == 0) goto L2b
                r2 = r1
                l.w r2 = (l.w) r2     // Catch: java.lang.Throwable -> L52
            L25:
                java.util.concurrent.locks.ReentrantLock r1 = r8.f661n
                r1.unlock()
                goto L59
            L2b:
                l.j0 r3 = r8.O()     // Catch: java.lang.Throwable -> L52
                if (r3 != 0) goto L32
                goto L25
            L32:
                boolean r4 = r3 instanceof l.w     // Catch: java.lang.Throwable -> L52
                if (r4 == 0) goto L37
                goto L25
            L37:
                q.r0 r2 = r3.c(r1, r2)     // Catch: java.lang.Throwable -> L52
                if (r2 != 0) goto L3e
                goto L18
            L3e:
                long r4 = r8.s0()     // Catch: java.lang.Throwable -> L52
                r6 = 1
                long r4 = r4 + r6
                r8.v0(r4)     // Catch: java.lang.Throwable -> L52
                r0 = 1
                java.util.concurrent.locks.ReentrantLock r2 = r8.f661n
                r2.unlock()
                r3.q(r1)
                goto L1
            L52:
                r0 = move-exception
                java.util.concurrent.locks.ReentrantLock r8 = r8.f661n
                r8.unlock()
                throw r0
            L59:
                if (r2 == 0) goto L60
                java.lang.Throwable r1 = r2.f943m
                r8.G(r1)
            L60:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: l.g.a.r0():boolean");
        }

        public final long s0() {
            return this._subHead;
        }

        public final boolean t0() {
            if (m() != null) {
                return false;
            }
            return (f0() && this.f660m.m() == null) ? false : true;
        }

        public final Object u0() {
            long s0 = s0();
            w<?> m2 = this.f660m.m();
            if (s0 < this.f660m.e0()) {
                Object Z = this.f660m.Z(s0);
                w<?> m3 = m();
                return m3 != null ? m3 : Z;
            } else if (m2 == null) {
                w<?> m4 = m();
                return m4 == null ? b.f634f : m4;
            } else {
                return m2;
            }
        }

        public final void v0(long j2) {
            this._subHead = j2;
        }
    }

    public g(int i2) {
        super(null);
        this.f656m = i2;
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(("ArrayBroadcastChannel capacity must be at least 1, but " + i2 + " was specified").toString());
        }
        this.f657n = new ReentrantLock();
        this.f658o = new Object[i2];
        this._head = 0L;
        this._tail = 0L;
        this._size = 0;
        this.f659p = q.f.d();
    }

    public static /* synthetic */ void d0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j0(g gVar, a aVar, a aVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = null;
        }
        if ((i2 & 2) != 0) {
            aVar2 = null;
        }
        gVar.i0(aVar, aVar2);
    }

    @Override // l.c
    public boolean B() {
        return false;
    }

    @Override // l.c
    public boolean C() {
        return c0() >= this.f656m;
    }

    @Override // l.c, l.m0
    public boolean G(@Nullable Throwable th) {
        if (super.G(th)) {
            X();
            return true;
        }
        return false;
    }

    @Override // l.c
    @NotNull
    public Object H(E e2) {
        ReentrantLock reentrantLock = this.f657n;
        reentrantLock.lock();
        try {
            w<?> n2 = n();
            if (n2 != null) {
                return n2;
            }
            int c0 = c0();
            if (c0 >= this.f656m) {
                return b.f633e;
            }
            long e0 = e0();
            this.f658o[(int) (e0 % this.f656m)] = e2;
            g0(c0 + 1);
            h0(e0 + 1);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            X();
            return b.f632d;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.c
    @NotNull
    public Object I(E e2, @NotNull t.f<?> fVar) {
        ReentrantLock reentrantLock = this.f657n;
        reentrantLock.lock();
        try {
            w<?> n2 = n();
            if (n2 != null) {
                return n2;
            }
            int c0 = c0();
            if (c0 >= this.f656m) {
                return b.f633e;
            }
            if (fVar.i()) {
                long e0 = e0();
                this.f658o[(int) (e0 % this.f656m)] = e2;
                g0(c0 + 1);
                h0(e0 + 1);
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                X();
                return b.f632d;
            }
            return t.g.d();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.i
    @NotNull
    public i0<E> J() {
        a aVar = new a(this);
        j0(this, aVar, null, 2, null);
        return aVar;
    }

    @Override // l.i
    /* renamed from: W */
    public final boolean a(Throwable th) {
        boolean G = G(th);
        for (a<E> aVar : this.f659p) {
            aVar.a(th);
        }
        return G;
    }

    public final void X() {
        boolean z;
        boolean z2 = false;
        loop0: while (true) {
            z = z2;
            for (a<E> aVar : this.f659p) {
                if (aVar.r0()) {
                    break;
                }
                z = true;
            }
            z2 = true;
        }
        if (z2 || !z) {
            j0(this, null, null, 3, null);
        }
    }

    public final long Y() {
        long j2 = Long.MAX_VALUE;
        for (a<E> aVar : this.f659p) {
            j2 = RangesKt___RangesKt.coerceAtMost(j2, aVar.s0());
        }
        return j2;
    }

    public final E Z(long j2) {
        return (E) this.f658o[(int) (j2 % this.f656m)];
    }

    public final int a0() {
        return this.f656m;
    }

    public final long b0() {
        return this._head;
    }

    public final int c0() {
        return this._size;
    }

    @Override // l.i
    public void cancel(@Nullable CancellationException cancellationException) {
        a(cancellationException);
    }

    public final long e0() {
        return this._tail;
    }

    public final void f0(long j2) {
        this._head = j2;
    }

    public final void g0(int i2) {
        this._size = i2;
    }

    public final void h0(long j2) {
        this._tail = j2;
    }

    public final void i0(a<E> aVar, a<E> aVar2) {
        long coerceAtMost;
        l0 P;
        while (true) {
            ReentrantLock reentrantLock = this.f657n;
            reentrantLock.lock();
            if (aVar != null) {
                try {
                    aVar.v0(e0());
                    boolean isEmpty = this.f659p.isEmpty();
                    this.f659p.add(aVar);
                    if (!isEmpty) {
                        return;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (aVar2 != null) {
                this.f659p.remove(aVar2);
                if (b0() != aVar2.s0()) {
                    return;
                }
            }
            long Y = Y();
            long e0 = e0();
            long b0 = b0();
            coerceAtMost = RangesKt___RangesKt.coerceAtMost(Y, e0);
            if (coerceAtMost <= b0) {
                return;
            }
            int c0 = c0();
            while (b0 < coerceAtMost) {
                Object[] objArr = this.f658o;
                int i2 = this.f656m;
                objArr[(int) (b0 % i2)] = null;
                boolean z = c0 >= i2;
                b0++;
                f0(b0);
                c0--;
                g0(c0);
                if (z) {
                    do {
                        P = P();
                        if (P != null && !(P instanceof w)) {
                            Intrinsics.checkNotNull(P);
                        }
                    } while (P.j0(null) == null);
                    this.f658o[(int) (e0 % this.f656m)] = P.h0();
                    g0(c0 + 1);
                    h0(e0 + 1);
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    P.g0();
                    X();
                    aVar = null;
                    aVar2 = null;
                }
            }
            return;
        }
    }

    @Override // l.c
    @NotNull
    public String l() {
        return "(buffer:capacity=" + this.f658o.length + ",size=" + c0() + ')';
    }
}
