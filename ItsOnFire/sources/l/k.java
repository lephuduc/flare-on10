package l;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j.c2;
import j.n2;
import j.o2;
import j.r0;
import j.v2;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import l.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B%\u0012\u0006\u00106\u001a\u000205\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u00107\u001a\u00020\u000e¢\u0006\u0004\b8\u00109J.\u0010\f\u001a\u00020\u00032#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0006H\u0097\u0001J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096\u0001J\u001b\u0010\u0013\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007J\u0016\u0010\u001b\u001a\u00020\u00032\u000e\u0010\n\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aJ\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u000eH\u0014J\u0012\u0010\"\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016R \u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u000e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R&\u0010/\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0+8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010)R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Ll/k;", "E", "Lj/a;", "", "Ll/g0;", "Ll/i;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "handler", "Q", "element", "", "offer", "(Ljava/lang/Object;)Z", "Ll/i0;", "J", "U", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/r;", "T", "(Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancel", "l0", "value", "y1", "(Lkotlin/Unit;)V", "handled", "u1", "G", "l", "Ll/i;", "x1", "()Ll/i;", "_channel", "V", "()Z", "isClosedForSend", "Lt/e;", "Ll/m0;", "D", "()Lt/e;", "onSend", "b", "isActive", "c", "()Ll/m0;", "channel", "Lkotlin/coroutines/CoroutineContext;", "parentContext", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "<init>", "(Lkotlin/coroutines/CoroutineContext;Ll/i;Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public class k<E> extends j.a<Unit> implements g0<E>, i<E> {
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    public final i<E> f674l;

    public k(@NotNull CoroutineContext coroutineContext, @NotNull i<E> iVar, boolean z) {
        super(coroutineContext, false, z);
        this.f674l = iVar;
        J0((n2) coroutineContext.get(n2.f488b));
    }

    @Override // l.m0
    @NotNull
    public t.e<E, m0<E>> D() {
        return this.f674l.D();
    }

    @Override // l.m0
    public boolean G(@Nullable Throwable th) {
        boolean G = this.f674l.G(th);
        start();
        return G;
    }

    @NotNull
    public i0<E> J() {
        return this.f674l.J();
    }

    @Override // l.m0
    @c2
    public void Q(@NotNull Function1<? super Throwable, Unit> function1) {
        this.f674l.Q(function1);
    }

    @Override // l.m0
    @NotNull
    public Object T(E e2) {
        return this.f674l.T(e2);
    }

    @Override // l.m0
    @Nullable
    public Object U(E e2, @NotNull Continuation<? super Unit> continuation) {
        return this.f674l.U(e2, continuation);
    }

    @Override // l.m0
    public boolean V() {
        return this.f674l.V();
    }

    @Override // j.v2, j.n2
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean a(Throwable th) {
        if (th == null) {
            th = new o2(o0(), null, this);
        }
        l0(th);
        return true;
    }

    @Override // j.a, j.v2, j.n2
    public boolean b() {
        return super.b();
    }

    @Override // l.g0
    @NotNull
    public m0<E> c() {
        return this;
    }

    @Override // j.v2, j.n2
    public final void cancel(@Nullable CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new o2(o0(), null, this);
        }
        l0(cancellationException);
    }

    @Override // j.v2
    public void l0(@NotNull Throwable th) {
        CancellationException l1 = v2.l1(this, th, null, 1, null);
        this.f674l.cancel(l1);
        j0(l1);
    }

    @Override // l.m0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e2) {
        return this.f674l.offer(e2);
    }

    @Override // j.a
    public void u1(@NotNull Throwable th, boolean z) {
        if (this.f674l.G(th) || z) {
            return;
        }
        r0.b(getContext(), th);
    }

    @NotNull
    public final i<E> x1() {
        return this.f674l;
    }

    @Override // j.a
    /* renamed from: y1 */
    public void v1(@NotNull Unit unit) {
        m0.a.a(this.f674l, null, 1, null);
    }
}
