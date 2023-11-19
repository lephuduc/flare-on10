package l;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.d1;
import q.r0;

@Metadata(bv = {}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0006\u0010&\u001a\u00020\u001c\u0012\u0006\u0010*\u001a\u00020'\u0012 \u0010H\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0019\u0018\u00010Fj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`G¢\u0006\u0004\bI\u0010JJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\tR\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010/\u001a\u00060+j\u0002`,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\tR\u0014\u00108\u001a\u00020\u00158DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00158DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b9\u00107R\u0014\u0010<\u001a\u00020\u00158DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b;\u00107R\u0014\u0010>\u001a\u00020\u00158DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b=\u00107R\u0014\u0010?\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u00107R\u0014\u0010A\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u00107R\u0014\u0010E\u001a\u00020B8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006K"}, d2 = {"Ll/h;", "E", "Ll/a;", "element", "", "H", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lt/f;", "select", "I", "(Ljava/lang/Object;Lt/f;)Ljava/lang/Object;", "Ll/l0;", "send", "k", "(Ll/l0;)Ljava/lang/Object;", "l0", "()Ljava/lang/Object;", "m0", "(Lt/f;)Ljava/lang/Object;", "Ll/h0;", "receive", "", "b0", "(Ll/h0;)Z", "wasClosed", "", "h0", "(Z)V", "", "currentSize", "Lq/r0;", "t0", "(I)Lq/r0;", "r0", "(ILjava/lang/Object;)V", "s0", "(I)V", "m", "capacity", "Ll/m;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Ll/m;", "onBufferOverflow", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "o", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "p", "[Ljava/lang/Object;", "buffer", "q", "head", "e0", "()Z", "isBufferAlwaysEmpty", "f0", "isBufferEmpty", "B", "isBufferAlwaysFull", "C", "isBufferFull", "isEmpty", "i", "isClosedForReceive", "", "l", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILl/m;Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public class h<E> extends l.a<E> {

    /* renamed from: m  reason: collision with root package name */
    public final int f662m;
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public final m f663n;
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public final ReentrantLock f664o;
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    public Object[] f665p;

    /* renamed from: q  reason: collision with root package name */
    public int f666q;
    @NotNull
    private volatile /* synthetic */ int size;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f667a;

        static {
            int[] iArr = new int[m.values().length];
            iArr[m.SUSPEND.ordinal()] = 1;
            iArr[m.DROP_LATEST.ordinal()] = 2;
            iArr[m.DROP_OLDEST.ordinal()] = 3;
            f667a = iArr;
        }
    }

    public h(int i2, @NotNull m mVar, @Nullable Function1<? super E, Unit> function1) {
        super(function1);
        this.f662m = i2;
        this.f663n = mVar;
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i2 + " was specified").toString());
        }
        this.f664o = new ReentrantLock();
        Object[] objArr = new Object[Math.min(i2, 8)];
        ArraysKt___ArraysJvmKt.fill$default(objArr, b.f631c, 0, 0, 6, (Object) null);
        this.f665p = objArr;
        this.size = 0;
    }

    @Override // l.c
    public final boolean B() {
        return false;
    }

    @Override // l.c
    public final boolean C() {
        return this.size == this.f662m && this.f663n == m.SUSPEND;
    }

    @Override // l.c
    @NotNull
    public Object H(E e2) {
        j0<E> O;
        ReentrantLock reentrantLock = this.f664o;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            w<?> n2 = n();
            if (n2 != null) {
                return n2;
            }
            r0 t0 = t0(i2);
            if (t0 != null) {
                return t0;
            }
            if (i2 == 0) {
                do {
                    O = O();
                    if (O != null) {
                        if (O instanceof w) {
                            this.size = i2;
                            return O;
                        }
                        Intrinsics.checkNotNull(O);
                    }
                } while (O.c(e2, null) == null);
                this.size = i2;
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                O.q(e2);
                return O.h();
            }
            r0(i2, e2);
            return b.f632d;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.c
    @NotNull
    public Object I(E e2, @NotNull t.f<?> fVar) {
        Object r2;
        ReentrantLock reentrantLock = this.f664o;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            w<?> n2 = n();
            if (n2 != null) {
                return n2;
            }
            r0 t0 = t0(i2);
            if (t0 != null) {
                return t0;
            }
            if (i2 == 0) {
                do {
                    c.d<E> j2 = j(e2);
                    r2 = fVar.r(j2);
                    if (r2 == null) {
                        this.size = i2;
                        j0<? super E> o2 = j2.o();
                        Unit unit = Unit.INSTANCE;
                        reentrantLock.unlock();
                        Intrinsics.checkNotNull(o2);
                        j0<? super E> j0Var = o2;
                        j0Var.q(e2);
                        return j0Var.h();
                    } else if (r2 != b.f633e) {
                    }
                } while (r2 == q.c.f1994b);
                if (r2 != t.g.d() && !(r2 instanceof w)) {
                    throw new IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + r2).toString());
                }
                this.size = i2;
                return r2;
            }
            if (fVar.i()) {
                r0(i2, e2);
                return b.f632d;
            }
            this.size = i2;
            return t.g.d();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.a
    public boolean b0(@NotNull h0<? super E> h0Var) {
        ReentrantLock reentrantLock = this.f664o;
        reentrantLock.lock();
        try {
            return super.b0(h0Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.a
    public final boolean e0() {
        return false;
    }

    @Override // l.a
    public final boolean f0() {
        return this.size == 0;
    }

    @Override // l.a
    public void h0(boolean z) {
        Function1<E, Unit> function1 = this.f639j;
        ReentrantLock reentrantLock = this.f664o;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            d1 d1Var = null;
            for (int i3 = 0; i3 < i2; i3++) {
                Object obj = this.f665p[this.f666q];
                if (function1 != null && obj != b.f631c) {
                    d1Var = q.i0.c(function1, obj, d1Var);
                }
                Object[] objArr = this.f665p;
                int i4 = this.f666q;
                objArr[i4] = b.f631c;
                this.f666q = (i4 + 1) % objArr.length;
            }
            this.size = 0;
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            super.h0(z);
            if (d1Var != null) {
                throw d1Var;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // l.a, l.i0
    public boolean i() {
        ReentrantLock reentrantLock = this.f664o;
        reentrantLock.lock();
        try {
            return super.i();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.a, l.i0
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.f664o;
        reentrantLock.lock();
        try {
            return g0();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.c
    @Nullable
    public Object k(@NotNull l0 l0Var) {
        ReentrantLock reentrantLock = this.f664o;
        reentrantLock.lock();
        try {
            return super.k(l0Var);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l.c
    @NotNull
    public String l() {
        return "(buffer:capacity=" + this.f662m + ",size=" + this.size + ')';
    }

    @Override // l.a
    @Nullable
    public Object l0() {
        ReentrantLock reentrantLock = this.f664o;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            if (i2 == 0) {
                Object n2 = n();
                if (n2 == null) {
                    n2 = b.f634f;
                }
                return n2;
            }
            Object[] objArr = this.f665p;
            int i3 = this.f666q;
            Object obj = objArr[i3];
            l0 l0Var = null;
            objArr[i3] = null;
            this.size = i2 - 1;
            Object obj2 = b.f634f;
            boolean z = false;
            if (i2 == this.f662m) {
                l0 l0Var2 = null;
                while (true) {
                    l0 P = P();
                    if (P == null) {
                        l0Var = l0Var2;
                        break;
                    }
                    Intrinsics.checkNotNull(P);
                    if (P.j0(null) != null) {
                        obj2 = P.h0();
                        z = true;
                        l0Var = P;
                        break;
                    }
                    P.k0();
                    l0Var2 = P;
                }
            }
            if (obj2 != b.f634f && !(obj2 instanceof w)) {
                this.size = i2;
                Object[] objArr2 = this.f665p;
                objArr2[(this.f666q + i2) % objArr2.length] = obj2;
            }
            this.f666q = (this.f666q + 1) % this.f665p.length;
            Unit unit = Unit.INSTANCE;
            if (z) {
                Intrinsics.checkNotNull(l0Var);
                l0Var.g0();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009b A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #0 {all -> 0x00c4, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x000f, B:10:0x0015, B:12:0x0029, B:14:0x0033, B:30:0x0081, B:32:0x0085, B:34:0x0089, B:40:0x00ab, B:35:0x0095, B:37:0x009b, B:15:0x0043, B:17:0x0047, B:19:0x004b, B:21:0x0051, B:24:0x005d, B:27:0x0065, B:28:0x007f), top: B:48:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    @Override // l.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m0(@org.jetbrains.annotations.NotNull t.f<?> r9) {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.f664o
            r0.lock()
            int r1 = r8.size     // Catch: java.lang.Throwable -> Lc4
            if (r1 != 0) goto L15
            l.w r8 = r8.n()     // Catch: java.lang.Throwable -> Lc4
            if (r8 != 0) goto L11
            q.r0 r8 = l.b.f634f     // Catch: java.lang.Throwable -> Lc4
        L11:
            r0.unlock()
            return r8
        L15:
            java.lang.Object[] r2 = r8.f665p     // Catch: java.lang.Throwable -> Lc4
            int r3 = r8.f666q     // Catch: java.lang.Throwable -> Lc4
            r4 = r2[r3]     // Catch: java.lang.Throwable -> Lc4
            r5 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> Lc4
            int r2 = r1 + (-1)
            r8.size = r2     // Catch: java.lang.Throwable -> Lc4
            q.r0 r2 = l.b.f634f     // Catch: java.lang.Throwable -> Lc4
            int r3 = r8.f662m     // Catch: java.lang.Throwable -> Lc4
            r6 = 1
            if (r1 != r3) goto L80
        L29:
            l.a$g r3 = r8.Z()     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r7 = r9.r(r3)     // Catch: java.lang.Throwable -> Lc4
            if (r7 != 0) goto L43
            java.lang.Object r5 = r3.o()     // Catch: java.lang.Throwable -> Lc4
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)     // Catch: java.lang.Throwable -> Lc4
            r2 = r5
            l.l0 r2 = (l.l0) r2     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r2 = r2.h0()     // Catch: java.lang.Throwable -> Lc4
            r3 = r6
            goto L81
        L43:
            q.r0 r3 = l.b.f634f     // Catch: java.lang.Throwable -> Lc4
            if (r7 == r3) goto L80
            java.lang.Object r3 = q.c.f1994b     // Catch: java.lang.Throwable -> Lc4
            if (r7 == r3) goto L29
            java.lang.Object r2 = t.g.d()     // Catch: java.lang.Throwable -> Lc4
            if (r7 != r2) goto L5d
            r8.size = r1     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object[] r9 = r8.f665p     // Catch: java.lang.Throwable -> Lc4
            int r8 = r8.f666q     // Catch: java.lang.Throwable -> Lc4
            r9[r8] = r4     // Catch: java.lang.Throwable -> Lc4
            r0.unlock()
            return r7
        L5d:
            boolean r2 = r7 instanceof l.w     // Catch: java.lang.Throwable -> Lc4
            if (r2 == 0) goto L65
            r3 = r6
            r2 = r7
            r5 = r2
            goto L81
        L65:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc4
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            r9.<init>()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = "performAtomicTrySelect(describeTryOffer) returned "
            r9.append(r1)     // Catch: java.lang.Throwable -> Lc4
            r9.append(r7)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lc4
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lc4
            throw r8     // Catch: java.lang.Throwable -> Lc4
        L80:
            r3 = 0
        L81:
            q.r0 r7 = l.b.f634f     // Catch: java.lang.Throwable -> Lc4
            if (r2 == r7) goto L95
            boolean r7 = r2 instanceof l.w     // Catch: java.lang.Throwable -> Lc4
            if (r7 != 0) goto L95
            r8.size = r1     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object[] r9 = r8.f665p     // Catch: java.lang.Throwable -> Lc4
            int r7 = r8.f666q     // Catch: java.lang.Throwable -> Lc4
            int r7 = r7 + r1
            int r1 = r9.length     // Catch: java.lang.Throwable -> Lc4
            int r7 = r7 % r1
            r9[r7] = r2     // Catch: java.lang.Throwable -> Lc4
            goto Lab
        L95:
            boolean r9 = r9.i()     // Catch: java.lang.Throwable -> Lc4
            if (r9 != 0) goto Lab
            r8.size = r1     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object[] r9 = r8.f665p     // Catch: java.lang.Throwable -> Lc4
            int r8 = r8.f666q     // Catch: java.lang.Throwable -> Lc4
            r9[r8] = r4     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r8 = t.g.d()     // Catch: java.lang.Throwable -> Lc4
            r0.unlock()
            return r8
        Lab:
            int r9 = r8.f666q     // Catch: java.lang.Throwable -> Lc4
            int r9 = r9 + r6
            java.lang.Object[] r1 = r8.f665p     // Catch: java.lang.Throwable -> Lc4
            int r1 = r1.length     // Catch: java.lang.Throwable -> Lc4
            int r9 = r9 % r1
            r8.f666q = r9     // Catch: java.lang.Throwable -> Lc4
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lc4
            r0.unlock()
            if (r3 == 0) goto Lc3
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            l.l0 r5 = (l.l0) r5
            r5.g0()
        Lc3:
            return r4
        Lc4:
            r8 = move-exception
            r0.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.h.m0(t.f):java.lang.Object");
    }

    public final void r0(int i2, E e2) {
        if (i2 < this.f662m) {
            s0(i2);
            Object[] objArr = this.f665p;
            objArr[(this.f666q + i2) % objArr.length] = e2;
            return;
        }
        Object[] objArr2 = this.f665p;
        int i3 = this.f666q;
        objArr2[i3 % objArr2.length] = null;
        objArr2[(i2 + i3) % objArr2.length] = e2;
        this.f666q = (i3 + 1) % objArr2.length;
    }

    public final void s0(int i2) {
        Object[] objArr = this.f665p;
        if (i2 >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f662m);
            Object[] objArr2 = new Object[min];
            for (int i3 = 0; i3 < i2; i3++) {
                Object[] objArr3 = this.f665p;
                objArr2[i3] = objArr3[(this.f666q + i3) % objArr3.length];
            }
            ArraysKt___ArraysJvmKt.fill((r0[]) objArr2, b.f631c, i2, min);
            this.f665p = objArr2;
            this.f666q = 0;
        }
    }

    public final r0 t0(int i2) {
        if (i2 < this.f662m) {
            this.size = i2 + 1;
            return null;
        }
        int i3 = a.f667a[this.f663n.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            return b.f632d;
        }
        return b.f633e;
    }
}
