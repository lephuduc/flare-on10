package q;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.i2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@i2
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001:\u0005IJKLMB\u0007¢\u0006\u0004\bH\u00101J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\u00060\u0000j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0000j\u0002`\u0005H\u0082\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082\u0010¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0016\u001a\u00020\u00152\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0081\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u001a\u0010\fJ)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\f\b\u0000\u0010\u001b*\u00060\u0000j\u0002`\u00052\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\u001f\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0086\b¢\u0006\u0004\b\u001f\u0010 J4\u0010#\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u0016\u0010\"\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0005\u0012\u0004\u0012\u00020\u00130!H\u0086\b¢\u0006\u0004\b#\u0010$JD\u0010%\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u0016\u0010\"\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0005\u0012\u0004\u0012\u00020\u00130!2\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0086\b¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0001¢\u0006\u0004\b'\u0010(J/\u0010+\u001a\u00020*2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u00052\u0006\u0010)\u001a\u00020\u0015H\u0001¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0001¢\u0006\u0004\b/\u00100J\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u00101J\u000f\u00102\u001a\u00020\nH\u0001¢\u0006\u0004\b2\u00101J\u0015\u00103\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b3\u00100J\u0017\u00105\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u000504¢\u0006\u0004\b5\u00106J.\u00107\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001b\u0018\u00012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130!H\u0086\b¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0014¢\u0006\u0004\b9\u00100J'\u0010;\u001a\u00020\n2\n\u0010:\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0000¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010.R\u0011\u0010\t\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0015\u0010E\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\bD\u00100R\u0015\u0010G\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\bF\u00100¨\u0006N"}, d2 = {"Lq/y;", "", "Lq/l0;", "d0", "()Lq/l0;", "Lkotlinx/coroutines/internal/Node;", "current", "N", "(Lq/y;)Lq/y;", "next", "", "P", "(Lq/y;)V", "Lq/j0;", "op", "K", "(Lq/j0;)Lq/y;", "node", "Lkotlin/Function0;", "", "condition", "Lq/y$c;", "W", "(Lq/y;Lkotlin/jvm/functions/Function0;)Lq/y$c;", "J", "(Lq/y;)Z", "D", "T", "Lq/y$b;", "L", "(Lq/y;)Lq/y$b;", "F", "(Lq/y;Lkotlin/jvm/functions/Function0;)Z", "Lkotlin/Function1;", "predicate", "G", "(Lq/y;Lkotlin/jvm/functions/Function1;)Z", "H", "(Lq/y;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Z", "I", "(Lq/y;Lq/y;)Z", "condAdd", "", "e0", "(Lq/y;Lq/y;Lq/y$c;)I", "Y", "()Z", "c0", "()Lq/y;", "()V", "U", "b0", "Lq/y$e;", "M", "()Lq/y$e;", "a0", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "X", "prev", "f0", "(Lq/y;Lq/y;)V", "", "toString", "()Ljava/lang/String;", "V", "isRemoved", "Q", "()Ljava/lang/Object;", "R", "nextNode", "S", "prevNode", "<init>", "a", "b", "c", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "e", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public class y {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2072j = AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, "_next");

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2073k = AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, "_prev");

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2074l = AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, "_removedRef");
    @NotNull
    public volatile /* synthetic */ Object _next = this;
    @NotNull
    public volatile /* synthetic */ Object _prev = this;
    @NotNull
    private volatile /* synthetic */ Object _removedRef = null;

    @Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0016\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0014J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\bH\u0014J \u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H$J \u0010\u000f\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H&J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0014\u0010\u0014\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0015J\u001c\u0010\u0018\u001a\u00020\r2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\bR\u001c\u0010\u001b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006 "}, d2 = {"Lq/y$a;", "Lq/b;", "Lq/j0;", "op", "Lq/y;", "Lkotlinx/coroutines/internal/Node;", "m", "affected", "", "e", "next", "", "l", "", "f", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Lq/y$d;", "prepareOp", "g", "j", "k", "Lq/d;", "c", "failure", "a", "h", "()Lq/y;", "affectedNode", "i", "originalNext", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static abstract class a extends q.b {
        @Override // q.b
        public final void a(@NotNull q.d<?> dVar, @Nullable Object obj) {
            y i2;
            boolean z = obj == null;
            y h2 = h();
            if (h2 == null || (i2 = i()) == null) {
                return;
            }
            if (androidx.concurrent.futures.a.a(y.f2072j, h2, dVar, z ? n(h2, i2) : i2) && z) {
                f(h2, i2);
            }
        }

        @Override // q.b
        @Nullable
        public final Object c(@NotNull q.d<?> dVar) {
            while (true) {
                y m2 = m(dVar);
                if (m2 == null) {
                    return q.c.f1994b;
                }
                Object obj = m2._next;
                if (obj == dVar || dVar.h()) {
                    return null;
                }
                if (obj instanceof j0) {
                    j0 j0Var = (j0) obj;
                    if (dVar.b(j0Var)) {
                        return q.c.f1994b;
                    }
                    j0Var.c(m2);
                } else {
                    Object e2 = e(m2);
                    if (e2 != null) {
                        return e2;
                    }
                    if (l(m2, obj)) {
                        continue;
                    } else {
                        d dVar2 = new d(m2, (y) obj, this);
                        if (androidx.concurrent.futures.a.a(y.f2072j, m2, obj, dVar2)) {
                            try {
                                if (dVar2.c(m2) != z.f2088a) {
                                    return null;
                                }
                            } catch (Throwable th) {
                                androidx.concurrent.futures.a.a(y.f2072j, m2, dVar2, obj);
                                throw th;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }

        @Nullable
        public Object e(@NotNull y yVar) {
            return null;
        }

        public abstract void f(@NotNull y yVar, @NotNull y yVar2);

        public abstract void g(@NotNull d dVar);

        @Nullable
        public abstract y h();

        @Nullable
        public abstract y i();

        @Nullable
        public Object j(@NotNull d dVar) {
            g(dVar);
            return null;
        }

        public void k(@NotNull y yVar) {
        }

        public boolean l(@NotNull y yVar, @NotNull Object obj) {
            return false;
        }

        @Nullable
        public y m(@NotNull j0 j0Var) {
            y h2 = h();
            Intrinsics.checkNotNull(h2);
            return h2;
        }

        @NotNull
        public abstract Object n(@NotNull y yVar, @NotNull y yVar2);
    }

    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020\u0004B\u001b\u0012\n\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002\u0012\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010\u0017J\u001f\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00112\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u00060\u0001j\u0002`\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u00060\u0001j\u0002`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lq/y$b;", "Lq/y;", "Lkotlinx/coroutines/internal/Node;", "T", "Lq/y$a;", "Lq/j0;", "op", "m", "(Lq/j0;)Lq/y;", "affected", "", "next", "", "l", "(Lq/y;Ljava/lang/Object;)Z", "Lq/y$d;", "prepareOp", "", "g", "(Lq/y$d;)V", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "(Lq/y;Lq/y;)Ljava/lang/Object;", "f", "(Lq/y;Lq/y;)V", "b", "Lq/y;", "queue", "c", "node", "h", "()Lq/y;", "affectedNode", "i", "originalNext", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static class b<T extends y> extends a {

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f2075d = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_affectedNode");
        @NotNull
        private volatile /* synthetic */ Object _affectedNode = null;
        @JvmField
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final y f2076b;
        @JvmField
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public final T f2077c;

        public b(@NotNull y yVar, @NotNull T t2) {
            this.f2076b = yVar;
            this.f2077c = t2;
        }

        @Override // q.y.a
        public void f(@NotNull y yVar, @NotNull y yVar2) {
            this.f2077c.P(this.f2076b);
        }

        @Override // q.y.a
        public void g(@NotNull d dVar) {
            androidx.concurrent.futures.a.a(f2075d, this, null, dVar.f2080a);
        }

        @Override // q.y.a
        @Nullable
        public final y h() {
            return (y) this._affectedNode;
        }

        @Override // q.y.a
        @NotNull
        public final y i() {
            return this.f2076b;
        }

        @Override // q.y.a
        public boolean l(@NotNull y yVar, @NotNull Object obj) {
            return obj != this.f2076b;
        }

        @Override // q.y.a
        @Nullable
        public final y m(@NotNull j0 j0Var) {
            return this.f2076b.K(j0Var);
        }

        @Override // q.y.a
        @NotNull
        public Object n(@NotNull y yVar, @NotNull y yVar2) {
            T t2 = this.f2077c;
            androidx.concurrent.futures.a.a(y.f2073k, t2, t2, yVar);
            T t3 = this.f2077c;
            androidx.concurrent.futures.a.a(y.f2072j, t3, t3, this.f2076b);
            return this.f2077c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u0018\u0010\u000b\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lq/y$c;", "Lq/d;", "Lq/y;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "failure", "", "j", "b", "Lq/y;", "newNode", "c", "oldNext", "<init>", "(Lq/y;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    @PublishedApi
    /* loaded from: classes2.dex */
    public static abstract class c extends q.d<y> {
        @JvmField
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final y f2078b;
        @JvmField
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public y f2079c;

        public c(@NotNull y yVar) {
            this.f2078b = yVar;
        }

        @Override // q.d
        /* renamed from: j */
        public void d(@NotNull y yVar, @Nullable Object obj) {
            boolean z = obj == null;
            y yVar2 = z ? this.f2078b : this.f2079c;
            if (yVar2 != null && androidx.concurrent.futures.a.a(y.f2072j, yVar, this, yVar2) && z) {
                y yVar3 = this.f2078b;
                y yVar4 = this.f2079c;
                Intrinsics.checkNotNull(yVar4);
                yVar3.P(yVar4);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0003\u001a\u00060\tj\u0002`\n\u0012\n\u0010\u000e\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0018\u0010\u0003\u001a\u00060\tj\u0002`\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u00060\tj\u0002`\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0017"}, d2 = {"Lq/y$d;", "Lq/j0;", "", "affected", "c", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "", "toString", "Lq/y;", "Lkotlinx/coroutines/internal/Node;", "a", "Lq/y;", "b", "next", "Lq/y$a;", "Lq/y$a;", "desc", "Lq/d;", "()Lq/d;", "atomicOp", "<init>", "(Lq/y;Lq/y;Lq/y$a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class d extends j0 {
        @JvmField
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public final y f2080a;
        @JvmField
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final y f2081b;
        @JvmField
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public final a f2082c;

        public d(@NotNull y yVar, @NotNull y yVar2, @NotNull a aVar) {
            this.f2080a = yVar;
            this.f2081b = yVar2;
            this.f2082c = aVar;
        }

        @Override // q.j0
        @NotNull
        public q.d<?> a() {
            return this.f2082c.b();
        }

        @Override // q.j0
        @Nullable
        public Object c(@Nullable Object obj) {
            if (obj != null) {
                y yVar = (y) obj;
                Object j2 = this.f2082c.j(this);
                Object obj2 = z.f2088a;
                if (j2 != obj2) {
                    Object e2 = j2 != null ? a().e(j2) : a().f();
                    androidx.concurrent.futures.a.a(y.f2072j, yVar, this, e2 == q.c.f1993a ? a() : e2 == null ? this.f2082c.n(yVar, this.f2081b) : this.f2081b);
                    return null;
                }
                y yVar2 = this.f2081b;
                if (androidx.concurrent.futures.a.a(y.f2072j, yVar, this, yVar2.d0())) {
                    this.f2082c.k(yVar);
                    yVar2.K(null);
                }
                return obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        }

        public final void d() {
            this.f2082c.g(this);
        }

        @Override // q.j0
        @NotNull
        public String toString() {
            return "PrepareOp(op=" + a() + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\u0010\u001c\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b'\u0010(J\u001f\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u000e2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\r\u001a\u00020\nH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00132\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u00060\u0005j\u0002`\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010!\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010$\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001c\u0010&\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006)"}, d2 = {"Lq/y$e;", "T", "Lq/y$a;", "Lq/j0;", "op", "Lq/y;", "Lkotlinx/coroutines/internal/Node;", "m", "(Lq/j0;)Lq/y;", "affected", "", "e", "(Lq/y;)Ljava/lang/Object;", "next", "", "l", "(Lq/y;Ljava/lang/Object;)Z", "Lq/y$d;", "prepareOp", "", "g", "(Lq/y$d;)V", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "(Lq/y;Lq/y;)Ljava/lang/Object;", "f", "(Lq/y;Lq/y;)V", "b", "Lq/y;", "queue", "o", "()Ljava/lang/Object;", "getResult$annotations", "()V", "result", "h", "()Lq/y;", "affectedNode", "i", "originalNext", "<init>", "(Lq/y;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static class e<T> extends a {

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f2083c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_affectedNode");

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f2084d = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_originalNext");
        @NotNull
        private volatile /* synthetic */ Object _affectedNode = null;
        @NotNull
        private volatile /* synthetic */ Object _originalNext = null;
        @JvmField
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final y f2085b;

        public e(@NotNull y yVar) {
            this.f2085b = yVar;
        }

        public static /* synthetic */ void p() {
        }

        @Override // q.y.a
        @Nullable
        public Object e(@NotNull y yVar) {
            if (yVar == this.f2085b) {
                return x.d();
            }
            return null;
        }

        @Override // q.y.a
        public final void f(@NotNull y yVar, @NotNull y yVar2) {
            yVar2.K(null);
        }

        @Override // q.y.a
        public void g(@NotNull d dVar) {
            androidx.concurrent.futures.a.a(f2083c, this, null, dVar.f2080a);
            androidx.concurrent.futures.a.a(f2084d, this, null, dVar.f2081b);
        }

        @Override // q.y.a
        @Nullable
        public final y h() {
            return (y) this._affectedNode;
        }

        @Override // q.y.a
        @Nullable
        public final y i() {
            return (y) this._originalNext;
        }

        @Override // q.y.a
        public final boolean l(@NotNull y yVar, @NotNull Object obj) {
            if (obj instanceof l0) {
                ((l0) obj).f2027a.U();
                return true;
            }
            return false;
        }

        @Override // q.y.a
        @Nullable
        public final y m(@NotNull j0 j0Var) {
            y yVar = this.f2085b;
            while (true) {
                Object obj = yVar._next;
                if (!(obj instanceof j0)) {
                    return (y) obj;
                }
                j0 j0Var2 = (j0) obj;
                if (j0Var.b(j0Var2)) {
                    return null;
                }
                j0Var2.c(this.f2085b);
            }
        }

        @Override // q.y.a
        @NotNull
        public final Object n(@NotNull y yVar, @NotNull y yVar2) {
            return yVar2.d0();
        }

        public final T o() {
            T t2 = (T) h();
            Intrinsics.checkNotNull(t2);
            return t2;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, d2 = {"q/y$f", "Lq/y$c;", "Lq/y;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class f extends c {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Function0<Boolean> f2086d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(y yVar, Function0<Boolean> function0) {
            super(yVar);
            this.f2086d = function0;
        }

        @Override // q.d
        @Nullable
        /* renamed from: k */
        public Object i(@NotNull y yVar) {
            if (this.f2086d.invoke().booleanValue()) {
                return null;
            }
            return x.a();
        }
    }

    public final void D(@NotNull y yVar) {
        do {
        } while (!S().I(yVar, this));
    }

    public final boolean F(@NotNull y yVar, @NotNull Function0<Boolean> function0) {
        int e0;
        f fVar = new f(yVar, function0);
        do {
            e0 = S().e0(yVar, this, fVar);
            if (e0 == 1) {
                return true;
            }
        } while (e0 != 2);
        return false;
    }

    public final boolean G(@NotNull y yVar, @NotNull Function1<? super y, Boolean> function1) {
        y S;
        do {
            S = S();
            if (!function1.invoke(S).booleanValue()) {
                return false;
            }
        } while (!S.I(yVar, this));
        return true;
    }

    public final boolean H(@NotNull y yVar, @NotNull Function1<? super y, Boolean> function1, @NotNull Function0<Boolean> function0) {
        int e0;
        f fVar = new f(yVar, function0);
        do {
            y S = S();
            if (!function1.invoke(S).booleanValue()) {
                return false;
            }
            e0 = S.e0(yVar, this, fVar);
            if (e0 == 1) {
                return true;
            }
        } while (e0 != 2);
        return false;
    }

    @PublishedApi
    public final boolean I(@NotNull y yVar, @NotNull y yVar2) {
        f2073k.lazySet(yVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2072j;
        atomicReferenceFieldUpdater.lazySet(yVar, yVar2);
        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, yVar2, yVar)) {
            yVar.P(yVar2);
            return true;
        }
        return false;
    }

    public final boolean J(@NotNull y yVar) {
        f2073k.lazySet(yVar, this);
        f2072j.lazySet(yVar, this);
        while (Q() == this) {
            if (androidx.concurrent.futures.a.a(f2072j, this, this, yVar)) {
                yVar.P(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        if (androidx.concurrent.futures.a.a(q.y.f2072j, r3, r2, ((q.l0) r4).f2027a) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final q.y K(q.j0 r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            q.y r0 = (q.y) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = q.y.f2073k
            boolean r0 = androidx.concurrent.futures.a.a(r1, r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.V()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof q.j0
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            q.j0 r0 = (q.j0) r0
            boolean r0 = r8.b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            q.j0 r4 = (q.j0) r4
            r4.c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof q.l0
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = q.y.f2072j
            q.l0 r4 = (q.l0) r4
            q.y r4 = r4.f2027a
            boolean r2 = androidx.concurrent.futures.a.a(r5, r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            q.y r2 = (q.y) r2
            goto L7
        L52:
            r3 = r4
            q.y r3 = (q.y) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: q.y.K(q.j0):q.y");
    }

    @NotNull
    public final <T extends y> b<T> L(@NotNull T t2) {
        return new b<>(this, t2);
    }

    @NotNull
    public final e<y> M() {
        return new e<>(this);
    }

    public final y N(y yVar) {
        while (yVar.V()) {
            yVar = (y) yVar._prev;
        }
        return yVar;
    }

    public final void P(y yVar) {
        y yVar2;
        do {
            yVar2 = (y) yVar._prev;
            if (Q() != yVar) {
                return;
            }
        } while (!androidx.concurrent.futures.a.a(f2073k, yVar, yVar2, this));
        if (V()) {
            yVar.K(null);
        }
    }

    @NotNull
    public final Object Q() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof j0)) {
                return obj;
            }
            ((j0) obj).c(this);
        }
    }

    @NotNull
    public final y R() {
        return x.h(Q());
    }

    @NotNull
    public final y S() {
        y K = K(null);
        return K == null ? N((y) this._prev) : K;
    }

    public final void T() {
        ((l0) Q()).f2027a.U();
    }

    @PublishedApi
    public final void U() {
        while (true) {
            Object Q = this.Q();
            if (!(Q instanceof l0)) {
                this.K(null);
                return;
            }
            this = ((l0) Q).f2027a;
        }
    }

    public boolean V() {
        return Q() instanceof l0;
    }

    @PublishedApi
    @NotNull
    public final c W(@NotNull y yVar, @NotNull Function0<Boolean> function0) {
        return new f(yVar, function0);
    }

    @Nullable
    public y X() {
        Object Q = Q();
        l0 l0Var = Q instanceof l0 ? (l0) Q : null;
        if (l0Var != null) {
            return l0Var.f2027a;
        }
        return null;
    }

    public boolean Y() {
        return c0() == null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object, q.y] */
    public final /* synthetic */ <T> T a0(Function1<? super T, Boolean> function1) {
        y c0;
        while (true) {
            y yVar = (y) Q();
            if (yVar == this) {
                return null;
            }
            Intrinsics.reifiedOperationMarker(3, "T");
            if (!(yVar instanceof Object)) {
                return null;
            }
            if ((function1.invoke(yVar).booleanValue() && !yVar.V()) || (c0 = yVar.c0()) == null) {
                return yVar;
            }
            c0.U();
        }
    }

    @Nullable
    public final y b0() {
        while (true) {
            y yVar = (y) Q();
            if (yVar == this) {
                return null;
            }
            if (yVar.Y()) {
                return yVar;
            }
            yVar.T();
        }
    }

    @PublishedApi
    @Nullable
    public final y c0() {
        Object Q;
        y yVar;
        do {
            Q = Q();
            if (Q instanceof l0) {
                return ((l0) Q).f2027a;
            }
            if (Q == this) {
                return (y) Q;
            }
            yVar = (y) Q;
        } while (!androidx.concurrent.futures.a.a(f2072j, this, Q, yVar.d0()));
        yVar.K(null);
        return null;
    }

    public final l0 d0() {
        l0 l0Var = (l0) this._removedRef;
        if (l0Var == null) {
            l0 l0Var2 = new l0(this);
            f2074l.lazySet(this, l0Var2);
            return l0Var2;
        }
        return l0Var;
    }

    @PublishedApi
    public final int e0(@NotNull y yVar, @NotNull y yVar2, @NotNull c cVar) {
        f2073k.lazySet(yVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2072j;
        atomicReferenceFieldUpdater.lazySet(yVar, yVar2);
        cVar.f2079c = yVar2;
        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, yVar2, cVar)) {
            return cVar.c(this) == null ? 1 : 2;
        }
        return 0;
    }

    public final void f0(@NotNull y yVar, @NotNull y yVar2) {
    }

    @NotNull
    public String toString() {
        return new PropertyReference0Impl(this) { // from class: q.y.g
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            @Nullable
            public Object get() {
                return j.z0.a(this.receiver);
            }
        } + '@' + j.z0.b(this);
    }
}
