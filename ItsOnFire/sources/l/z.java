package l;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.e3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import l.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.r0;

@e3
@Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 %*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004\u0011DEFB\u0007¢\u0006\u0004\bB\u00107B\u0011\b\u0016\u0012\u0006\u00108\u001a\u00028\u0000¢\u0006\u0004\bB\u0010CJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\f2\u0018\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0011\u0010\nJ\u001f\u0010\u0014\u001a\u00020\f2\u000e\u0010\u0007\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00192\u0006\u0010\u0016\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0 2\u0014\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0018\u00010 2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0002¢\u0006\u0004\b\"\u0010#J?\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0018\u00010 2\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0 2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0002¢\u0006\u0004\b$\u0010#J\u0019\u0010%\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010)JX\u00102\u001a\u00020\f\"\u0004\b\u0001\u0010*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010+2\u0006\u0010\u0016\u001a\u00028\u00002(\u00101\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010/\u0012\u0006\u0012\u0004\u0018\u0001000-H\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103R\u0017\u00108\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105R\u0013\u0010:\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b9\u00105R\u0014\u0010=\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R&\u0010A\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.0>8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"Ll/z;", "E", "Ll/i;", "Ll/i0;", "J", "()Ll/i0;", "", "cause", "", "G", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/channels/Handler;", "handler", "Q", "(Lkotlin/jvm/functions/Function1;)V", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "element", "U", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/r;", "T", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ll/z$d;", "subscriber", "f", "(Ll/z$d;)V", "", "list", "e", "([Ll/z$d;Ll/z$d;)[Ll/z$d;", "m", "j", "(Ljava/lang/Throwable;)V", "Ll/z$a;", "k", "(Ljava/lang/Object;)Ll/z$a;", "R", "Lt/f;", "select", "Lkotlin/Function2;", "Ll/m0;", "Lkotlin/coroutines/Continuation;", "", "block", "l", "(Lt/f;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "g", "()Ljava/lang/Object;", "getValue$annotations", "()V", "value", "i", "valueOrNull", "V", "()Z", "isClosedForSend", "Lt/e;", "D", "()Lt/e;", "onSend", "<init>", "(Ljava/lang/Object;)V", "b", "c", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class z<E> implements i<E> {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f945k;

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f946l;

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f947m;
    @Deprecated
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public static final r0 f949o;
    @Deprecated
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    public static final c<Object> f950p;
    @NotNull
    private volatile /* synthetic */ Object _state;
    @NotNull
    private volatile /* synthetic */ int _updating;
    @NotNull
    private volatile /* synthetic */ Object onCloseHandler;
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public static final b f944j = new b(null);
    @Deprecated
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public static final a f948n = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, d2 = {"Ll/z$a;", "", "", "a", "Ljava/lang/Throwable;", "closeCause", "()Ljava/lang/Throwable;", "sendException", "b", "valueException", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        @JvmField
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f951a;

        public a(@Nullable Throwable th) {
            this.f951a = th;
        }

        @NotNull
        public final Throwable a() {
            Throwable th = this.f951a;
            return th == null ? new y(s.f728a) : th;
        }

        @NotNull
        public final Throwable b() {
            Throwable th = this.f951a;
            return th == null ? new IllegalStateException(s.f728a) : th;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Ll/z$b;", "", "Ll/z$a;", "CLOSED", "Ll/z$a;", "Ll/z$c;", "INITIAL_STATE", "Ll/z$c;", "Lq/r0;", "UNDEFINED", "Lq/r0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B'\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Ll/z$c;", "E", "", "a", "Ljava/lang/Object;", "value", "", "Ll/z$d;", "b", "[Ll/z$d;", "subscribers", "<init>", "(Ljava/lang/Object;[Ll/z$d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class c<E> {
        @JvmField
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public final Object f952a;
        @JvmField
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public final d<E>[] f953b;

        public c(@Nullable Object obj, @Nullable d<E>[] dVarArr) {
            this.f952a = obj;
            this.f953b = dVarArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Ll/z$d;", "E", "Ll/a0;", "Ll/i0;", "", "wasClosed", "", "h0", "element", "", "H", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ll/z;", "o", "Ll/z;", "broadcastChannel", "<init>", "(Ll/z;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class d<E> extends a0<E> implements i0<E> {
        @NotNull

        /* renamed from: o  reason: collision with root package name */
        public final z<E> f954o;

        public d(@NotNull z<E> zVar) {
            super(null);
            this.f954o = zVar;
        }

        @Override // l.a0, l.c
        @NotNull
        public Object H(E e2) {
            return super.H(e2);
        }

        @Override // l.a0, l.a
        public void h0(boolean z) {
            if (z) {
                this.f954o.f(this);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001JX\u0010\f\u001a\u00020\u000b\"\u0004\b\u0001\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0006\u001a\u00028\u00002(\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"l/z$e", "Lt/e;", "Ll/m0;", "R", "Lt/f;", "select", "param", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "", "S", "(Lt/f;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class e implements t.e<E, m0<? super E>> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ z<E> f955j;

        public e(z<E> zVar) {
            this.f955j = zVar;
        }

        @Override // t.e
        public <R> void S(@NotNull t.f<? super R> fVar, E e2, @NotNull Function2<? super m0<? super E>, ? super Continuation<? super R>, ? extends Object> function2) {
            this.f955j.l(fVar, e2, function2);
        }
    }

    static {
        r0 r0Var = new r0("UNDEFINED");
        f949o = r0Var;
        f950p = new c<>(r0Var, null);
        f945k = AtomicReferenceFieldUpdater.newUpdater(z.class, Object.class, "_state");
        f946l = AtomicIntegerFieldUpdater.newUpdater(z.class, "_updating");
        f947m = AtomicReferenceFieldUpdater.newUpdater(z.class, Object.class, "onCloseHandler");
    }

    public z() {
        this._state = f950p;
        this._updating = 0;
        this.onCloseHandler = null;
    }

    public z(E e2) {
        this();
        f945k.lazySet(this, new c(e2, null));
    }

    public static /* synthetic */ void h() {
    }

    @Override // l.m0
    @NotNull
    public t.e<E, m0<E>> D() {
        return new e(this);
    }

    @Override // l.i
    /* renamed from: G */
    public boolean a(@Nullable Throwable th) {
        Object obj;
        int i2;
        do {
            obj = this._state;
            if (obj instanceof a) {
                return false;
            }
            if (!(obj instanceof c)) {
                throw new IllegalStateException(("Invalid state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.a.a(f945k, this, obj, th == null ? f948n : new a(th)));
        d<E>[] dVarArr = ((c) obj).f953b;
        if (dVarArr != null) {
            for (d<E> dVar : dVarArr) {
                dVar.G(th);
            }
        }
        j(th);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.i
    @NotNull
    public i0<E> J() {
        Object obj;
        c cVar;
        d dVar = new d(this);
        do {
            obj = this._state;
            if (obj instanceof a) {
                dVar.G(((a) obj).f951a);
                return dVar;
            } else if (!(obj instanceof c)) {
                throw new IllegalStateException(("Invalid state " + obj).toString());
            } else {
                cVar = (c) obj;
                Object obj2 = cVar.f952a;
                if (obj2 != f949o) {
                    dVar.H(obj2);
                }
            }
        } while (!androidx.concurrent.futures.a.a(f945k, this, obj, new c(cVar.f952a, e(cVar.f953b, dVar))));
        return dVar;
    }

    @Override // l.m0
    public void Q(@NotNull Function1<? super Throwable, Unit> function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f947m;
        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, null, function1)) {
            Object obj = this._state;
            if ((obj instanceof a) && androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, function1, l.b.f636h)) {
                function1.invoke(((a) obj).f951a);
                return;
            }
            return;
        }
        Object obj2 = this.onCloseHandler;
        if (obj2 == l.b.f636h) {
            throw new IllegalStateException("Another handler was already registered and successfully invoked");
        }
        throw new IllegalStateException("Another handler was already registered: " + obj2);
    }

    @Override // l.m0
    @NotNull
    public Object T(E e2) {
        a k2 = k(e2);
        return k2 != null ? r.f724b.a(k2.a()) : r.f724b.c(Unit.INSTANCE);
    }

    @Override // l.m0
    @Nullable
    public Object U(E e2, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        a k2 = k(e2);
        if (k2 == null) {
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (coroutine_suspended == null) {
                return null;
            }
            return Unit.INSTANCE;
        }
        throw k2.a();
    }

    @Override // l.m0
    public boolean V() {
        return this._state instanceof a;
    }

    @Override // l.i
    public void cancel(@Nullable CancellationException cancellationException) {
        a(cancellationException);
    }

    public final d<E>[] e(d<E>[] dVarArr, d<E> dVar) {
        Object[] plus;
        if (dVarArr != null) {
            plus = ArraysKt___ArraysJvmKt.plus(dVarArr, dVar);
            return (d[]) plus;
        }
        d<E>[] dVarArr2 = new d[1];
        for (int i2 = 0; i2 < 1; i2++) {
            dVarArr2[i2] = dVar;
        }
        return dVarArr2;
    }

    public final void f(d<E> dVar) {
        Object obj;
        Object obj2;
        d<E>[] dVarArr;
        do {
            obj = this._state;
            if (obj instanceof a) {
                return;
            }
            if (!(obj instanceof c)) {
                throw new IllegalStateException(("Invalid state " + obj).toString());
            }
            c cVar = (c) obj;
            obj2 = cVar.f952a;
            dVarArr = cVar.f953b;
            Intrinsics.checkNotNull(dVarArr);
        } while (!androidx.concurrent.futures.a.a(f945k, this, obj, new c(obj2, m(dVarArr, dVar))));
    }

    public final E g() {
        Object obj = this._state;
        if (obj instanceof a) {
            throw ((a) obj).b();
        }
        if (obj instanceof c) {
            E e2 = (E) ((c) obj).f952a;
            if (e2 != f949o) {
                return e2;
            }
            throw new IllegalStateException("No value");
        }
        throw new IllegalStateException(("Invalid state " + obj).toString());
    }

    @Nullable
    public final E i() {
        Object obj = this._state;
        if (obj instanceof a) {
            return null;
        }
        if (!(obj instanceof c)) {
            throw new IllegalStateException(("Invalid state " + obj).toString());
        }
        r0 r0Var = f949o;
        E e2 = (E) ((c) obj).f952a;
        if (e2 == r0Var) {
            return null;
        }
        return e2;
    }

    public final void j(Throwable th) {
        r0 r0Var;
        Object obj = this.onCloseHandler;
        if (obj == null || obj == (r0Var = l.b.f636h) || !androidx.concurrent.futures.a.a(f947m, this, obj, r0Var)) {
            return;
        }
        ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(obj, 1)).invoke(th);
    }

    public final a k(E e2) {
        Object obj;
        if (f946l.compareAndSet(this, 0, 1)) {
            do {
                try {
                    obj = this._state;
                    if (obj instanceof a) {
                        return (a) obj;
                    }
                    if (!(obj instanceof c)) {
                        throw new IllegalStateException(("Invalid state " + obj).toString());
                    }
                } finally {
                    this._updating = 0;
                }
            } while (!androidx.concurrent.futures.a.a(f945k, this, obj, new c(e2, ((c) obj).f953b)));
            d<E>[] dVarArr = ((c) obj).f953b;
            if (dVarArr != null) {
                for (d<E> dVar : dVarArr) {
                    dVar.H(e2);
                }
            }
            return null;
        }
        return null;
    }

    public final <R> void l(t.f<? super R> fVar, E e2, Function2<? super m0<? super E>, ? super Continuation<? super R>, ? extends Object> function2) {
        if (fVar.i()) {
            a k2 = k(e2);
            if (k2 != null) {
                fVar.v(k2.a());
            } else {
                r.b.d(function2, this, fVar.o());
            }
        }
    }

    public final d<E>[] m(d<E>[] dVarArr, d<E> dVar) {
        int indexOf;
        int length = dVarArr.length;
        indexOf = ArraysKt___ArraysKt.indexOf(dVarArr, dVar);
        if (length == 1) {
            return null;
        }
        d<E>[] dVarArr2 = new d[length - 1];
        ArraysKt___ArraysJvmKt.copyInto$default(dVarArr, dVarArr2, 0, 0, indexOf, 6, (Object) null);
        ArraysKt___ArraysJvmKt.copyInto$default(dVarArr, dVarArr2, indexOf, indexOf + 1, 0, 8, (Object) null);
        return dVarArr2;
    }

    @Override // l.m0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e2) {
        return i.a.c(this, e2);
    }
}
