package u;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.p1;
import j.q;
import j.s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.j0;
import q.r0;
import q.w;
import q.y;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0006\u0006\u001a\t\u0014\u0013\u001fB\u000f\u0012\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJT\u0010\u0011\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0007J\u0019\u0010\u0014\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\nR\u0014\u0010\u001c\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\"\u0010!\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lu/d;", "Lu/c;", "Lt/e;", "", "owner", "", "a", "(Ljava/lang/Object;)Z", "", "c", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "Lt/f;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "S", "(Lt/f;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "e", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "i", "b", "()Z", "isLocked", "h", "isLockedEmptyQueueState", "f", "()Lt/e;", "onLock", "locked", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class d implements u.c, t.e<Object, u.c> {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2200j = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_state");
    @NotNull
    public volatile /* synthetic */ Object _state;

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lu/d$a;", "Lu/d$c;", "Lu/d;", "", "i0", "", "g0", "", "toString", "Lj/q;", "p", "Lj/q;", "cont", "", "owner", "<init>", "(Lu/d;Ljava/lang/Object;Lj/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public final class a extends c {
        @NotNull

        /* renamed from: p  reason: collision with root package name */
        public final q<Unit> f2201p;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* renamed from: u.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0099a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ d f2203j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ a f2204k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0099a(d dVar, a aVar) {
                super(1);
                this.f2203j = dVar;
                this.f2204k = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable th) {
                this.f2203j.d(this.f2204k.f2211m);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Nullable Object obj, @NotNull q<? super Unit> qVar) {
            super(obj);
            this.f2201p = qVar;
        }

        @Override // u.d.c
        public void g0() {
            this.f2201p.Z(s.f510d);
        }

        @Override // u.d.c
        public boolean i0() {
            return h0() && this.f2201p.C(Unit.INSTANCE, null, new C0099a(d.this, this)) != null;
        }

        @Override // q.y
        @NotNull
        public String toString() {
            return "LockCont[" + this.f2211m + ", " + this.f2201p + "] for " + d.this;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002R\u00020\u0003BF\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR3\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lu/d$b;", "R", "Lu/d$c;", "Lu/d;", "", "i0", "", "g0", "", "toString", "Lt/f;", "p", "Lt/f;", "select", "Lkotlin/Function2;", "Lu/c;", "Lkotlin/coroutines/Continuation;", "", "q", "Lkotlin/jvm/functions/Function2;", "block", "owner", "<init>", "(Lu/d;Ljava/lang/Object;Lt/f;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public final class b<R> extends c {
        @JvmField
        @NotNull

        /* renamed from: p  reason: collision with root package name */
        public final t.f<R> f2205p;
        @JvmField
        @NotNull

        /* renamed from: q  reason: collision with root package name */
        public final Function2<u.c, Continuation<? super R>, Object> f2206q;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "R", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* loaded from: classes2.dex */
        public static final class a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ d f2208j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ b<R> f2209k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, b<R> bVar) {
                super(1);
                this.f2208j = dVar;
                this.f2209k = bVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable th) {
                this.f2208j.d(this.f2209k.f2211m);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Nullable Object obj, @NotNull t.f<? super R> fVar, @NotNull Function2<? super u.c, ? super Continuation<? super R>, ? extends Object> function2) {
            super(obj);
            this.f2205p = fVar;
            this.f2206q = function2;
        }

        @Override // u.d.c
        public void g0() {
            r.a.e(this.f2206q, d.this, this.f2205p.o(), new a(d.this, this));
        }

        @Override // u.d.c
        public boolean i0() {
            return h0() && this.f2205p.i();
        }

        @Override // q.y
        @NotNull
        public String toString() {
            return "LockSelect[" + this.f2211m + ", " + this.f2205p + "] for " + d.this;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b¢\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lu/d$c;", "Lq/y;", "Lj/p1;", "", "h0", "()Z", "", "dispose", "()V", "i0", "g0", "", "m", "Ljava/lang/Object;", "owner", "<init>", "(Lu/d;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public abstract class c extends y implements p1 {

        /* renamed from: o  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f2210o = AtomicIntegerFieldUpdater.newUpdater(c.class, "isTaken");
        @NotNull
        private volatile /* synthetic */ int isTaken = 0;
        @JvmField
        @Nullable

        /* renamed from: m  reason: collision with root package name */
        public final Object f2211m;

        public c(@Nullable Object obj) {
            this.f2211m = obj;
        }

        @Override // j.p1
        public final void dispose() {
            Y();
        }

        public abstract void g0();

        public final boolean h0() {
            return f2210o.compareAndSet(this, 0, 1);
        }

        public abstract boolean i0();
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lu/d$d;", "Lq/w;", "", "toString", "", "owner", "Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: u.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0100d extends w {
        @JvmField
        @NotNull
        public volatile Object owner;

        public C0100d(@NotNull Object obj) {
            this.owner = obj;
        }

        @Override // q.y
        @NotNull
        public String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u0011"}, d2 = {"Lu/d$e;", "Lq/b;", "Lq/d;", "op", "", "c", "failure", "", "a", "Lu/d;", "b", "Lu/d;", "mutex", "Ljava/lang/Object;", "owner", "<init>", "(Lu/d;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class e extends q.b {
        @JvmField
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final d f2213b;
        @JvmField
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public final Object f2214c;

        @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001e\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Lu/d$e$a;", "Lq/j0;", "", "affected", "c", "Lq/d;", "a", "Lq/d;", "()Lq/d;", "atomicOp", "<init>", "(Lu/d$e;Lq/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes2.dex */
        public final class a extends j0 {
            @NotNull

            /* renamed from: a  reason: collision with root package name */
            public final q.d<?> f2215a;

            public a(@NotNull q.d<?> dVar) {
                this.f2215a = dVar;
            }

            @Override // q.j0
            @NotNull
            public q.d<?> a() {
                return this.f2215a;
            }

            @Override // q.j0
            @Nullable
            public Object c(@Nullable Object obj) {
                Object a2 = a().h() ? u.e.f2225f : a();
                if (obj != null) {
                    androidx.concurrent.futures.a.a(d.f2200j, (d) obj, this, a2);
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl");
            }
        }

        public e(@NotNull d dVar, @Nullable Object obj) {
            this.f2213b = dVar;
            this.f2214c = obj;
        }

        @Override // q.b
        public void a(@NotNull q.d<?> dVar, @Nullable Object obj) {
            u.b bVar;
            if (obj != null) {
                bVar = u.e.f2225f;
            } else {
                Object obj2 = this.f2214c;
                bVar = obj2 == null ? u.e.f2224e : new u.b(obj2);
            }
            androidx.concurrent.futures.a.a(d.f2200j, this.f2213b, dVar, bVar);
        }

        @Override // q.b
        @Nullable
        public Object c(@NotNull q.d<?> dVar) {
            u.b bVar;
            r0 r0Var;
            a aVar = new a(dVar);
            d dVar2 = this.f2213b;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f2200j;
            bVar = u.e.f2225f;
            if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, dVar2, bVar, aVar)) {
                return aVar.c(this.f2213b);
            }
            r0Var = u.e.f2220a;
            return r0Var;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lu/d$f;", "Lq/d;", "Lu/d;", "affected", "", "k", "failure", "", "j", "Lu/d$d;", "b", "Lu/d$d;", "queue", "<init>", "(Lu/d$d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class f extends q.d<d> {
        @JvmField
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final C0100d f2217b;

        public f(@NotNull C0100d c0100d) {
            this.f2217b = c0100d;
        }

        @Override // q.d
        /* renamed from: j */
        public void d(@NotNull d dVar, @Nullable Object obj) {
            androidx.concurrent.futures.a.a(d.f2200j, dVar, this, obj == null ? u.e.f2225f : this.f2217b);
        }

        @Override // q.d
        @Nullable
        /* renamed from: k */
        public Object i(@NotNull d dVar) {
            r0 r0Var;
            if (this.f2217b.h0()) {
                return null;
            }
            r0Var = u.e.f2221b;
            return r0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class g extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ Object f2219k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Object obj) {
            super(1);
            this.f2219k = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Throwable th) {
            d.this.d(this.f2219k);
        }
    }

    public d(boolean z) {
        this._state = z ? u.e.f2224e : u.e.f2225f;
    }

    @Override // t.e
    public <R> void S(@NotNull t.f<? super R> fVar, @Nullable Object obj, @NotNull Function2<? super u.c, ? super Continuation<? super R>, ? extends Object> function2) {
        r0 r0Var;
        r0 r0Var2;
        while (!fVar.l()) {
            Object obj2 = this._state;
            if (obj2 instanceof u.b) {
                u.b bVar = (u.b) obj2;
                Object obj3 = bVar.f2199a;
                r0Var = u.e.f2223d;
                if (obj3 != r0Var) {
                    androidx.concurrent.futures.a.a(f2200j, this, obj2, new C0100d(bVar.f2199a));
                } else {
                    Object r2 = fVar.r(new e(this, obj));
                    if (r2 == null) {
                        r.b.d(function2, this, fVar.o());
                        return;
                    } else if (r2 == t.g.d()) {
                        return;
                    } else {
                        r0Var2 = u.e.f2220a;
                        if (r2 != r0Var2 && r2 != q.c.f1994b) {
                            throw new IllegalStateException(("performAtomicTrySelect(TryLockDesc) returned " + r2).toString());
                        }
                    }
                }
            } else if (obj2 instanceof C0100d) {
                C0100d c0100d = (C0100d) obj2;
                if (!(c0100d.owner != obj)) {
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
                b bVar2 = new b(obj, fVar, function2);
                c0100d.D(bVar2);
                if (this._state == obj2 || !bVar2.h0()) {
                    fVar.m(bVar2);
                    return;
                }
            } else if (!(obj2 instanceof j0)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                ((j0) obj2).c(this);
            }
        }
    }

    @Override // u.c
    public boolean a(@Nullable Object obj) {
        r0 r0Var;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof u.b) {
                Object obj3 = ((u.b) obj2).f2199a;
                r0Var = u.e.f2223d;
                if (obj3 != r0Var) {
                    return false;
                }
                if (androidx.concurrent.futures.a.a(f2200j, this, obj2, obj == null ? u.e.f2224e : new u.b(obj))) {
                    return true;
                }
            } else if (obj2 instanceof C0100d) {
                if (((C0100d) obj2).owner != obj) {
                    return false;
                }
                throw new IllegalStateException(("Already locked by " + obj).toString());
            } else if (!(obj2 instanceof j0)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                ((j0) obj2).c(this);
            }
        }
    }

    @Override // u.c
    public boolean b() {
        r0 r0Var;
        while (true) {
            Object obj = this._state;
            if (obj instanceof u.b) {
                Object obj2 = ((u.b) obj).f2199a;
                r0Var = u.e.f2223d;
                return obj2 != r0Var;
            } else if (obj instanceof C0100d) {
                return true;
            } else {
                if (!(obj instanceof j0)) {
                    throw new IllegalStateException(("Illegal state " + obj).toString());
                }
                ((j0) obj).c(this);
            }
        }
    }

    @Override // u.c
    @Nullable
    public Object c(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        if (a(obj)) {
            return Unit.INSTANCE;
        }
        Object i2 = i(obj, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return i2 == coroutine_suspended ? i2 : Unit.INSTANCE;
    }

    @Override // u.c
    public void d(@Nullable Object obj) {
        u.b bVar;
        r0 r0Var;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof u.b) {
                u.b bVar2 = (u.b) obj2;
                if (obj == null) {
                    Object obj3 = bVar2.f2199a;
                    r0Var = u.e.f2223d;
                    if (!(obj3 != r0Var)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    if (!(bVar2.f2199a == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + bVar2.f2199a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2200j;
                bVar = u.e.f2225f;
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj2, bVar)) {
                    return;
                }
            } else if (obj2 instanceof j0) {
                ((j0) obj2).c(this);
            } else if (!(obj2 instanceof C0100d)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                if (obj != null) {
                    C0100d c0100d = (C0100d) obj2;
                    if (!(c0100d.owner == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + c0100d.owner + " but expected " + obj).toString());
                    }
                }
                C0100d c0100d2 = (C0100d) obj2;
                y b0 = c0100d2.b0();
                if (b0 == null) {
                    f fVar = new f(c0100d2);
                    if (androidx.concurrent.futures.a.a(f2200j, this, obj2, fVar) && fVar.c(this) == null) {
                        return;
                    }
                } else {
                    c cVar = (c) b0;
                    if (cVar.i0()) {
                        Object obj4 = cVar.f2211m;
                        if (obj4 == null) {
                            obj4 = u.e.f2222c;
                        }
                        c0100d2.owner = obj4;
                        cVar.g0();
                        return;
                    }
                }
            }
        }
    }

    @Override // u.c
    public boolean e(@NotNull Object obj) {
        Object obj2 = this._state;
        if (obj2 instanceof u.b) {
            if (((u.b) obj2).f2199a == obj) {
                return true;
            }
        } else if ((obj2 instanceof C0100d) && ((C0100d) obj2).owner == obj) {
            return true;
        }
        return false;
    }

    @Override // u.c
    @NotNull
    public t.e<Object, u.c> f() {
        return this;
    }

    public final boolean h() {
        Object obj = this._state;
        return (obj instanceof C0100d) && ((C0100d) obj).h0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        j.t.c(r0, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.Object r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r8)
            j.r r0 = j.t.b(r0)
            u.d$a r1 = new u.d$a
            r1.<init>(r7, r0)
        Ld:
            java.lang.Object r2 = r6._state
            boolean r3 = r2 instanceof u.b
            if (r3 == 0) goto L4a
            r3 = r2
            u.b r3 = (u.b) r3
            java.lang.Object r4 = r3.f2199a
            q.r0 r5 = u.e.g()
            if (r4 == r5) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = u.d.f2200j
            u.d$d r5 = new u.d$d
            java.lang.Object r3 = r3.f2199a
            r5.<init>(r3)
            androidx.concurrent.futures.a.a(r4, r6, r2, r5)
            goto Ld
        L2b:
            if (r7 != 0) goto L32
            u.b r3 = u.e.c()
            goto L37
        L32:
            u.b r3 = new u.b
            r3.<init>(r7)
        L37:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = u.d.f2200j
            boolean r2 = androidx.concurrent.futures.a.a(r4, r6, r2, r3)
            if (r2 == 0) goto Ld
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            u.d$g r2 = new u.d$g
            r2.<init>(r7)
            r0.O(r1, r2)
            goto L71
        L4a:
            boolean r3 = r2 instanceof u.d.C0100d
            if (r3 == 0) goto La3
            r3 = r2
            u.d$d r3 = (u.d.C0100d) r3
            java.lang.Object r4 = r3.owner
            if (r4 == r7) goto L57
            r4 = 1
            goto L58
        L57:
            r4 = 0
        L58:
            if (r4 == 0) goto L88
            r3.D(r1)
            java.lang.Object r3 = r6._state
            if (r3 == r2) goto L6e
            boolean r2 = r1.h0()
            if (r2 != 0) goto L68
            goto L6e
        L68:
            u.d$a r1 = new u.d$a
            r1.<init>(r7, r0)
            goto Ld
        L6e:
            j.t.c(r0, r1)
        L71:
            java.lang.Object r6 = r0.x()
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r6 != r7) goto L7e
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r8)
        L7e:
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r6 != r7) goto L85
            return r6
        L85:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L88:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Already locked by "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        La3:
            boolean r3 = r2 instanceof q.j0
            if (r3 == 0) goto Lae
            q.j0 r2 = (q.j0) r2
            r2.c(r6)
            goto Ld
        Lae:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Illegal state "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u.d.i(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        Object obj;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof u.b) {
                sb = new StringBuilder();
                sb.append("Mutex[");
                obj = ((u.b) obj2).f2199a;
                break;
            } else if (obj2 instanceof j0) {
                ((j0) obj2).c(this);
            } else if (!(obj2 instanceof C0100d)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                sb = new StringBuilder();
                sb.append("Mutex[");
                obj = ((C0100d) obj2).owner;
            }
        }
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
