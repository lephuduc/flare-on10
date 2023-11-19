package q;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0013\b\u0000\u0018\u0000 \u0017*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\b#B\u0017\u0012\u0006\u0010%\u001a\u00020\u0007\u0012\u0006\u0010'\u001a\u00020\u0003¢\u0006\u0004\b.\u0010/J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011\"\u0004\b\u0001\u0010\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0005J3\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00162\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00162\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00162\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00162\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b#\u0010\"R\u0014\u0010%\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010'\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010&R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010$R\u0011\u0010*\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b)\u0010\u0005R\u0011\u0010-\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lq/b0;", "", "E", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "()Z", "element", "", "a", "(Ljava/lang/Object;)I", "l", "()Ljava/lang/Object;", "k", "()Lq/b0;", "R", "Lkotlin/Function1;", "transform", "", "i", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "g", FirebaseAnalytics.Param.INDEX, "Lkotlinx/coroutines/internal/Core;", "e", "(ILjava/lang/Object;)Lq/b0;", "oldHead", "newHead", "m", "(II)Lq/b0;", "", "j", "()J", "state", "c", "(J)Lq/b0;", "b", "I", "capacity", "Z", "singleConsumer", "mask", "h", "isEmpty", "f", "()I", "size", "<init>", "(IZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class b0<E> {

    /* renamed from: h  reason: collision with root package name */
    public static final int f1973h = 8;

    /* renamed from: i  reason: collision with root package name */
    public static final int f1974i = 30;

    /* renamed from: j  reason: collision with root package name */
    public static final int f1975j = 1073741823;

    /* renamed from: k  reason: collision with root package name */
    public static final int f1976k = 0;

    /* renamed from: l  reason: collision with root package name */
    public static final long f1977l = 1073741823;

    /* renamed from: m  reason: collision with root package name */
    public static final int f1978m = 30;

    /* renamed from: n  reason: collision with root package name */
    public static final long f1979n = 1152921503533105152L;

    /* renamed from: o  reason: collision with root package name */
    public static final int f1980o = 60;

    /* renamed from: p  reason: collision with root package name */
    public static final long f1981p = 1152921504606846976L;

    /* renamed from: q  reason: collision with root package name */
    public static final int f1982q = 61;

    /* renamed from: r  reason: collision with root package name */
    public static final long f1983r = 2305843009213693952L;

    /* renamed from: s  reason: collision with root package name */
    public static final int f1984s = 1024;

    /* renamed from: u  reason: collision with root package name */
    public static final int f1986u = 0;

    /* renamed from: v  reason: collision with root package name */
    public static final int f1987v = 1;
    public static final int w = 2;
    @NotNull
    private volatile /* synthetic */ Object _next = null;
    @NotNull
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f1988a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1989b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1990c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ AtomicReferenceArray f1991d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public static final a f1970e = new a(null);
    @JvmField
    @NotNull

    /* renamed from: t  reason: collision with root package name */
    public static final r0 f1985t = new r0("REMOVE_FROZEN");

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1971f = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_next");

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1972g = AtomicLongFieldUpdater.newUpdater(b0.class, "_state");

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0004J\u0012\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005JR\u0010\u0011\u001a\u00028\u0001\"\u0004\b\u0001\u0010\n*\u00020\u000226\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00010\u000bH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J\n\u0010\u0013\u001a\u00020\u0005*\u00020\u0002R\u0014\u0010\u0014\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0014\u0010 \u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0014\u0010!\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0014\u0010\"\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0015R\u0014\u0010$\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0015¨\u0006*"}, d2 = {"Lq/b0$a;", "", "", "other", "e", "", "newHead", "b", "newTail", "c", "T", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "head", "tail", "block", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "a", "ADD_CLOSED", "I", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "J", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "Lq/r0;", "REMOVE_FROZEN", "Lq/r0;", "TAIL_MASK", "TAIL_SHIFT", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(long j2) {
            return (j2 & b0.f1983r) != 0 ? 2 : 1;
        }

        public final long b(long j2, int i2) {
            return e(j2, b0.f1977l) | (i2 << 0);
        }

        public final long c(long j2, int i2) {
            return e(j2, b0.f1979n) | (i2 << 30);
        }

        public final <T> T d(long j2, @NotNull Function2<? super Integer, ? super Integer, ? extends T> function2) {
            return function2.invoke(Integer.valueOf((int) ((b0.f1977l & j2) >> 0)), Integer.valueOf((int) ((j2 & b0.f1979n) >> 30)));
        }

        public final long e(long j2, long j3) {
            return j2 & (~j3);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lq/b0$b;", "", "", "a", "I", FirebaseAnalytics.Param.INDEX, "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class b {
        @JvmField

        /* renamed from: a  reason: collision with root package name */
        public final int f1992a;

        public b(int i2) {
            this.f1992a = i2;
        }
    }

    public b0(int i2, boolean z) {
        this.f1988a = i2;
        this.f1989b = z;
        int i3 = i2 - 1;
        this.f1990c = i3;
        this.f1991d = new AtomicReferenceArray(i2);
        if (!(i3 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i2 & i3) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(@org.jetbrains.annotations.NotNull E r13) {
        /*
            r12 = this;
        L0:
            long r2 = r12._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L12
            q.b0$a r12 = q.b0.f1970e
            int r12 = r12.a(r2)
            return r12
        L12:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r8 = 0
            long r0 = r0 >> r8
            int r0 = (int) r0
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r1 = 30
            long r4 = r4 >> r1
            int r9 = (int) r4
            int r10 = r12.f1990c
            int r1 = r9 + 2
            r1 = r1 & r10
            r4 = r0 & r10
            r5 = 1
            if (r1 != r4) goto L2e
            return r5
        L2e:
            boolean r1 = r12.f1989b
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 != 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r12.f1991d
            r11 = r9 & r10
            java.lang.Object r1 = r1.get(r11)
            if (r1 == 0) goto L4d
            int r1 = r12.f1988a
            r2 = 1024(0x400, float:1.435E-42)
            if (r1 < r2) goto L4c
            int r9 = r9 - r0
            r0 = r9 & r4
            int r1 = r1 >> 1
            if (r0 <= r1) goto L0
        L4c:
            return r5
        L4d:
            int r0 = r9 + 1
            r0 = r0 & r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = q.b0.f1972g
            q.b0$a r4 = q.b0.f1970e
            long r4 = r4.c(r2, r0)
            r0 = r1
            r1 = r12
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f1991d
            r1 = r9 & r10
            r0.set(r1, r13)
        L67:
            long r0 = r12._state
            r2 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r0 = r0 & r2
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L7a
            q.b0 r12 = r12.k()
            q.b0 r12 = r12.e(r9, r13)
            if (r12 != 0) goto L67
        L7a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q.b0.a(java.lang.Object):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b0<E> b(long j2) {
        b0<E> b0Var = new b0<>(this.f1988a * 2, this.f1989b);
        int i2 = (int) ((f1977l & j2) >> 0);
        int i3 = (int) ((f1979n & j2) >> 30);
        while (true) {
            int i4 = this.f1990c;
            if ((i2 & i4) == (i3 & i4)) {
                b0Var._state = f1970e.e(j2, f1981p);
                return b0Var;
            }
            Object obj = this.f1991d.get(i4 & i2);
            if (obj == null) {
                obj = new b(i2);
            }
            b0Var.f1991d.set(b0Var.f1990c & i2, obj);
            i2++;
        }
    }

    public final b0<E> c(long j2) {
        while (true) {
            b0<E> b0Var = (b0) this._next;
            if (b0Var != null) {
                return b0Var;
            }
            androidx.concurrent.futures.a.a(f1971f, this, null, b(j2));
        }
    }

    public final boolean d() {
        long j2;
        do {
            j2 = this._state;
            if ((j2 & f1983r) != 0) {
                return true;
            }
            if ((f1981p & j2) != 0) {
                return false;
            }
        } while (!f1972g.compareAndSet(this, j2, j2 | f1983r));
        return true;
    }

    public final b0<E> e(int i2, E e2) {
        Object obj = this.f1991d.get(this.f1990c & i2);
        if ((obj instanceof b) && ((b) obj).f1992a == i2) {
            this.f1991d.set(i2 & this.f1990c, e2);
            return this;
        }
        return null;
    }

    public final int f() {
        long j2 = this._state;
        return 1073741823 & (((int) ((j2 & f1979n) >> 30)) - ((int) ((f1977l & j2) >> 0)));
    }

    public final boolean g() {
        return (this._state & f1983r) != 0;
    }

    public final boolean h() {
        long j2 = this._state;
        return ((int) ((f1977l & j2) >> 0)) == ((int) ((j2 & f1979n) >> 30));
    }

    @NotNull
    public final <R> List<R> i(@NotNull Function1<? super E, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(this.f1988a);
        long j2 = this._state;
        int i2 = (int) ((f1977l & j2) >> 0);
        int i3 = (int) ((j2 & f1979n) >> 30);
        while (true) {
            int i4 = this.f1990c;
            if ((i2 & i4) == (i3 & i4)) {
                return arrayList;
            }
            Object obj = (Object) this.f1991d.get(i4 & i2);
            if (obj != 0 && !(obj instanceof b)) {
                arrayList.add(function1.invoke(obj));
            }
            i2++;
        }
    }

    public final long j() {
        long j2;
        long j3;
        do {
            j2 = this._state;
            if ((j2 & f1981p) != 0) {
                return j2;
            }
            j3 = j2 | f1981p;
        } while (!f1972g.compareAndSet(this, j2, j3));
        return j3;
    }

    @NotNull
    public final b0<E> k() {
        return c(j());
    }

    @Nullable
    public final Object l() {
        while (true) {
            long j2 = this._state;
            if ((f1981p & j2) != 0) {
                return f1985t;
            }
            int i2 = (int) ((f1977l & j2) >> 0);
            int i3 = this.f1990c;
            if ((((int) ((f1979n & j2) >> 30)) & i3) == (i2 & i3)) {
                return null;
            }
            Object obj = this.f1991d.get(i3 & i2);
            if (obj == null) {
                if (this.f1989b) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                int i4 = (i2 + 1) & f1975j;
                if (f1972g.compareAndSet(this, j2, f1970e.b(j2, i4))) {
                    this.f1991d.set(this.f1990c & i2, null);
                    return obj;
                } else if (this.f1989b) {
                    do {
                        this = this.m(i2, i4);
                    } while (this != null);
                    return obj;
                }
            }
        }
    }

    public final b0<E> m(int i2, int i3) {
        long j2;
        int i4;
        do {
            j2 = this._state;
            i4 = (int) ((f1977l & j2) >> 0);
            if ((f1981p & j2) != 0) {
                return k();
            }
        } while (!f1972g.compareAndSet(this, j2, f1970e.b(j2, i3)));
        this.f1991d.set(this.f1990c & i4, null);
        return null;
    }
}
