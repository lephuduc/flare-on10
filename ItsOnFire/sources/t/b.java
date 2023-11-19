package t;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.e0;
import j.f1;
import j.k0;
import j.n2;
import j.p1;
import j.p2;
import j.r0;
import j.s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.j0;
import q.w;
import q.y;
import t.a;

@Metadata(bv = {}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0004Z[\\#B\u0015\u0012\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bX\u0010YJ\u0017\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010#\u001a\u0004\u0018\u00010\u00152\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u0004\u0018\u00010\u00152\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J5\u0010/\u001a\u00020\u000e*\u00020,2\u001c\u0010.\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00150-H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100JG\u00104\u001a\u00020\u000e\"\u0004\b\u0001\u00101*\b\u0012\u0004\u0012\u00028\u0001022\"\u0010.\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001503H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105J[\u00109\u001a\u00020\u000e\"\u0004\b\u0001\u00106\"\u0004\b\u0002\u00101*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002072\u0006\u00108\u001a\u00028\u00012\"\u0010.\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001503H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:J8\u0010=\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020;2\u001c\u0010.\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00150-H\u0016ø\u0001\u0000¢\u0006\u0004\b=\u0010>J.\u0010A\u001a\u00020\u000e2\u000e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150?2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0?H\u0082\b¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u000eH\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u000eH\u0002¢\u0006\u0004\bE\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010FR\u001c\u0010J\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010 R(\u0010W\u001a\u0004\u0018\u00010\u001a2\b\u0010@\u001a\u0004\u0018\u00010\u001a8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"Lt/b;", "R", "Lq/w;", "Lt/a;", "Lt/f;", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "", "exception", "v", "(Ljava/lang/Throwable;)V", "", "o0", "()Ljava/lang/Object;", "e", "p0", "Lj/p1;", "handle", "m", "(Lj/p1;)V", "", "i", "()Z", "Lq/y$d;", "otherOp", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Lq/y$d;)Ljava/lang/Object;", "Lq/b;", "desc", "r", "(Lq/b;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lt/c;", "Lkotlin/Function1;", "block", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "(Lt/c;Lkotlin/jvm/functions/Function1;)V", "Q", "Lt/d;", "Lkotlin/Function2;", "g", "(Lt/d;Lkotlin/jvm/functions/Function2;)V", "P", "Lt/e;", "param", "u", "(Lt/e;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "", "timeMillis", "p", "(JLkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "value", "m0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "E", "()V", "l0", "Lkotlin/coroutines/Continuation;", "uCont", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "o", "()Lkotlin/coroutines/Continuation;", "completion", "l", "isSelected", "n0", "()Lj/p1;", "q0", "parentHandle", "<init>", "(Lkotlin/coroutines/Continuation;)V", "a", "b", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@PublishedApi
/* loaded from: classes2.dex */
public final class b<R> extends w implements t.a<R>, f<R>, Continuation<R>, CoroutineStackFrame {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2162n = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_state");

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2163o = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_result");
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public final Continuation<R> f2164m;
    @NotNull
    public volatile /* synthetic */ Object _state = g.f();
    @NotNull
    private volatile /* synthetic */ Object _result = g.c();
    @NotNull
    private volatile /* synthetic */ Object _parentHandle = null;

    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002R\u0018\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lt/b$a;", "Lq/d;", "", "affected", "i", "failure", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "", "toString", "k", "l", "j", "Lt/b;", "b", "Lt/b;", "impl", "Lq/b;", "c", "Lq/b;", "desc", "", "J", "g", "()J", "opSequence", "<init>", "(Lt/b;Lq/b;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class a extends q.d<Object> {
        @JvmField
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final b<?> f2165b;
        @JvmField
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public final q.b f2166c;

        /* renamed from: d  reason: collision with root package name */
        public final long f2167d = g.b().a();

        public a(@NotNull b<?> bVar, @NotNull q.b bVar2) {
            this.f2165b = bVar;
            this.f2166c = bVar2;
            bVar2.d(this);
        }

        @Override // q.d
        public void d(@Nullable Object obj, @Nullable Object obj2) {
            j(obj2);
            this.f2166c.a(this, obj2);
        }

        @Override // q.d
        public long g() {
            return this.f2167d;
        }

        @Override // q.d
        @Nullable
        public Object i(@Nullable Object obj) {
            Object k2;
            if (obj != null || (k2 = k()) == null) {
                try {
                    return this.f2166c.c(this);
                } catch (Throwable th) {
                    if (obj == null) {
                        this.l();
                    }
                    throw th;
                }
            }
            return k2;
        }

        public final void j(Object obj) {
            boolean z = obj == null;
            if (androidx.concurrent.futures.a.a(b.f2162n, this.f2165b, this, z ? null : g.f()) && z) {
                this.f2165b.l0();
            }
        }

        public final Object k() {
            b<?> bVar = this.f2165b;
            while (true) {
                Object obj = bVar._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof j0) {
                    ((j0) obj).c(this.f2165b);
                } else if (obj != g.f()) {
                    return g.d();
                } else {
                    if (androidx.concurrent.futures.a.a(b.f2162n, this.f2165b, g.f(), this)) {
                        return null;
                    }
                }
            }
        }

        public final void l() {
            androidx.concurrent.futures.a.a(b.f2162n, this.f2165b, this, g.f());
        }

        @Override // q.j0
        @NotNull
        public String toString() {
            return "AtomicSelectOp(sequence=" + g() + ')';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lt/b$b;", "Lq/y;", "Lj/p1;", "m", "Lj/p1;", "handle", "<init>", "(Lj/p1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: t.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0098b extends y {
        @JvmField
        @NotNull

        /* renamed from: m  reason: collision with root package name */
        public final p1 f2168m;

        public C0098b(@NotNull p1 p1Var) {
            this.f2168m = p1Var;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n¨\u0006\u000e"}, d2 = {"Lt/b$c;", "Lq/j0;", "", "affected", "c", "Lq/y$d;", "a", "Lq/y$d;", "otherOp", "Lq/d;", "()Lq/d;", "atomicOp", "<init>", "(Lq/y$d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class c extends j0 {
        @JvmField
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public final y.d f2169a;

        public c(@NotNull y.d dVar) {
            this.f2169a = dVar;
        }

        @Override // q.j0
        @NotNull
        public q.d<?> a() {
            return this.f2169a.a();
        }

        @Override // q.j0
        @Nullable
        public Object c(@Nullable Object obj) {
            if (obj != null) {
                b bVar = (b) obj;
                this.f2169a.d();
                Object e2 = this.f2169a.a().e(null);
                androidx.concurrent.futures.a.a(b.f2162n, bVar, this, e2 == null ? this.f2169a.f2082c : g.f());
                return e2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¨\u0006\b"}, d2 = {"Lt/b$d;", "Lj/p2;", "", "cause", "", "g0", "<init>", "(Lt/b;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public final class d extends p2 {
        public d() {
        }

        @Override // j.g0
        public void g0(@Nullable Throwable th) {
            if (b.this.i()) {
                b.this.v(h0().u());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            g0(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "run", "()V", "j/k3$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class e implements Runnable {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Function1 f2172k;

        public e(Function1 function1) {
            this.f2172k = function1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.i()) {
                r.a.d(this.f2172k, b.this.o());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Continuation<? super R> continuation) {
        this.f2164m = continuation;
    }

    public final void E() {
        n2 n2Var = (n2) getContext().get(n2.f488b);
        if (n2Var == null) {
            return;
        }
        p1 f2 = n2.a.f(n2Var, true, false, new d(), 2, null);
        q0(f2);
        if (l()) {
            f2.dispose();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        l0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        return j.s.f510d;
     */
    @Override // t.f
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(@org.jetbrains.annotations.Nullable q.y.d r4) {
        /*
            r3 = this;
        L0:
            java.lang.Object r0 = r3._state
            java.lang.Object r1 = t.g.f()
            r2 = 0
            if (r0 != r1) goto L36
            if (r4 != 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = t.b.f2162n
            java.lang.Object r1 = t.g.f()
            boolean r0 = androidx.concurrent.futures.a.a(r0, r3, r1, r2)
            if (r0 != 0) goto L30
            goto L0
        L18:
            t.b$c r0 = new t.b$c
            r0.<init>(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = t.b.f2162n
            java.lang.Object r2 = t.g.f()
            boolean r1 = androidx.concurrent.futures.a.a(r1, r3, r2, r0)
            if (r1 == 0) goto L0
            java.lang.Object r4 = r0.c(r3)
            if (r4 == 0) goto L30
            return r4
        L30:
            r3.l0()
            q.r0 r3 = j.s.f510d
            return r3
        L36:
            boolean r1 = r0 instanceof q.j0
            if (r1 == 0) goto L6a
            if (r4 == 0) goto L64
            q.d r1 = r4.a()
            boolean r2 = r1 instanceof t.b.a
            if (r2 == 0) goto L58
            r2 = r1
            t.b$a r2 = (t.b.a) r2
            t.b<?> r2 = r2.f2165b
            if (r2 == r3) goto L4c
            goto L58
        L4c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Cannot use matching select clauses on the same object"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L58:
            r2 = r0
            q.j0 r2 = (q.j0) r2
            boolean r1 = r1.b(r2)
            if (r1 == 0) goto L64
            java.lang.Object r3 = q.c.f1994b
            return r3
        L64:
            q.j0 r0 = (q.j0) r0
            r0.c(r3)
            goto L0
        L6a:
            if (r4 != 0) goto L6d
            return r2
        L6d:
            q.y$a r3 = r4.f2082c
            if (r0 != r3) goto L74
            q.r0 r3 = j.s.f510d
            return r3
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t.b.d(q.y$d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t.a
    public <Q> void g(@NotNull t.d<? extends Q> dVar, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        dVar.L(this, function2);
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<R> continuation = this.f2164m;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.f2164m.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // t.f
    public boolean i() {
        Object d2 = d(null);
        if (d2 == s.f510d) {
            return true;
        }
        if (d2 == null) {
            return false;
        }
        throw new IllegalStateException(("Unexpected trySelectIdempotent result " + d2).toString());
    }

    @Override // t.f
    public boolean l() {
        while (true) {
            Object obj = this._state;
            if (obj == g.f()) {
                return false;
            }
            if (!(obj instanceof j0)) {
                return true;
            }
            ((j0) obj).c(this);
        }
    }

    public final void l0() {
        p1 n0 = n0();
        if (n0 != null) {
            n0.dispose();
        }
        for (y yVar = (y) Q(); !Intrinsics.areEqual(yVar, this); yVar = yVar.R()) {
            if (yVar instanceof C0098b) {
                ((C0098b) yVar).f2168m.dispose();
            }
        }
    }

    @Override // t.f
    public void m(@NotNull p1 p1Var) {
        C0098b c0098b = new C0098b(p1Var);
        if (!l()) {
            D(c0098b);
            if (!l()) {
                return;
            }
        }
        p1Var.dispose();
    }

    public final void m0(Function0<? extends Object> function0, Function0<Unit> function02) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        while (true) {
            Object obj = this._result;
            if (obj == g.c()) {
                if (androidx.concurrent.futures.a.a(f2163o, this, g.c(), function0.invoke())) {
                    return;
                }
            } else {
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (obj != coroutine_suspended) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2163o;
                coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, coroutine_suspended2, g.a())) {
                    function02.invoke();
                    return;
                }
            }
        }
    }

    @Override // t.a
    public void n(@NotNull t.c cVar, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        cVar.y(this, function1);
    }

    public final p1 n0() {
        return (p1) this._parentHandle;
    }

    @Override // t.f
    @NotNull
    public Continuation<R> o() {
        return this;
    }

    @PublishedApi
    @Nullable
    public final Object o0() {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        if (!l()) {
            E();
        }
        Object obj = this._result;
        if (obj == g.c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2163o;
            Object c2 = g.c();
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, c2, coroutine_suspended)) {
                coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return coroutine_suspended2;
            }
            obj = this._result;
        }
        if (obj != g.a()) {
            if (obj instanceof e0) {
                throw ((e0) obj).f424a;
            }
            return obj;
        }
        throw new IllegalStateException("Already resumed");
    }

    @Override // t.a
    public void p(long j2, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        if (j2 > 0) {
            m(f1.d(getContext()).o(j2, new e(function1), getContext()));
        } else if (i()) {
            r.b.c(function1, o());
        }
    }

    @PublishedApi
    public final void p0(@NotNull Throwable th) {
        if (i()) {
            Result.Companion companion = Result.Companion;
            resumeWith(Result.m3581constructorimpl(ResultKt.createFailure(th)));
        } else if (th instanceof CancellationException) {
        } else {
            Object o0 = o0();
            if ((o0 instanceof e0) && ((e0) o0).f424a == th) {
                return;
            }
            r0.b(getContext(), th);
        }
    }

    public final void q0(p1 p1Var) {
        this._parentHandle = p1Var;
    }

    @Override // t.f
    @Nullable
    public Object r(@NotNull q.b bVar) {
        return new a(this, bVar).c(null);
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        while (true) {
            Object obj2 = this._result;
            if (obj2 == g.c()) {
                if (androidx.concurrent.futures.a.a(f2163o, this, g.c(), k0.d(obj, null, 1, null))) {
                    return;
                }
            } else {
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (obj2 != coroutine_suspended) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2163o;
                coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, coroutine_suspended2, g.a())) {
                    boolean m3587isFailureimpl = Result.m3587isFailureimpl(obj);
                    Continuation<R> continuation = this.f2164m;
                    if (m3587isFailureimpl) {
                        Throwable m3584exceptionOrNullimpl = Result.m3584exceptionOrNullimpl(obj);
                        Intrinsics.checkNotNull(m3584exceptionOrNullimpl);
                        Result.Companion companion = Result.Companion;
                        obj = Result.m3581constructorimpl(ResultKt.createFailure(m3584exceptionOrNullimpl));
                    }
                    continuation.resumeWith(obj);
                    return;
                }
            }
        }
    }

    @Override // q.y
    @NotNull
    public String toString() {
        return "SelectInstance(state=" + this._state + ", result=" + this._result + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t.a
    public <P, Q> void u(@NotNull t.e<? super P, ? extends Q> eVar, P p2, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        eVar.S(this, p2, function2);
    }

    @Override // t.f
    public void v(@NotNull Throwable th) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Continuation intercepted;
        while (true) {
            Object obj = this._result;
            if (obj == g.c()) {
                if (androidx.concurrent.futures.a.a(f2163o, this, g.c(), new e0(th, false, 2, null))) {
                    return;
                }
            } else {
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (obj != coroutine_suspended) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2163o;
                coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, coroutine_suspended2, g.a())) {
                    intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(this.f2164m);
                    Result.Companion companion = Result.Companion;
                    intercepted.resumeWith(Result.m3581constructorimpl(ResultKt.createFailure(th)));
                    return;
                }
            }
        }
    }

    @Override // t.a
    public <P, Q> void w(@NotNull t.e<? super P, ? extends Q> eVar, @NotNull Function2<? super Q, ? super Continuation<? super R>, ? extends Object> function2) {
        a.C0097a.a(this, eVar, function2);
    }
}
