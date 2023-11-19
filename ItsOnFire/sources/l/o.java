package l;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j.c2;
import j.o2;
import j.v2;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B-\u0012\u0006\u0010?\u001a\u00020>\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010@\u001a\u00020\u0007\u0012\u0006\u0010A\u001a\u00020\u0007¢\u0006\u0004\bB\u0010CJ\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0001J.\u0010\r\u001a\u00020\u00032#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00030\tH\u0097\u0001J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096\u0003J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096Aø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0097Aø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u0014J'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0003H\u0016J\u0012\u0010 \u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u0016\u0010\u001f\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R \u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010.\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b.\u0010*R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000/8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R#\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170/8\u0016X\u0096\u0005ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b3\u00101R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000/8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b5\u00101R&\u0010;\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000008078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048F¢\u0006\u0006\u001a\u0004\b<\u0010'\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"Ll/o;", "E", "Lj/a;", "", "Ll/n;", "", "cause", "", "G", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "handler", "Q", "Ll/p;", "iterator", "element", "offer", "(Ljava/lang/Object;)Z", "poll", "()Ljava/lang/Object;", "F", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/r;", "z", "w", "U", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v", "T", "(Ljava/lang/Object;)Ljava/lang/Object;", "cancel", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "l0", "l", "Ll/n;", "x1", "()Ll/n;", "_channel", "i", "()Z", "isClosedForReceive", "V", "isClosedForSend", "isEmpty", "Lt/d;", "o", "()Lt/d;", "onReceive", "p", "onReceiveCatching", "q", "onReceiveOrNull", "Lt/e;", "Ll/m0;", "D", "()Lt/e;", "onSend", "c", "channel", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "initParentJob", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "<init>", "(Lkotlin/coroutines/CoroutineContext;Ll/n;ZZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public class o<E> extends j.a<Unit> implements n<E> {
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    public final n<E> f701l;

    public o(@NotNull CoroutineContext coroutineContext, @NotNull n<E> nVar, boolean z, boolean z2) {
        super(coroutineContext, z, z2);
        this.f701l = nVar;
    }

    @NotNull
    public t.e<E, m0<E>> D() {
        return this.f701l.D();
    }

    @Override // l.i0
    @Nullable
    public Object F(@NotNull Continuation<? super E> continuation) {
        return this.f701l.F(continuation);
    }

    public boolean G(@Nullable Throwable th) {
        return this.f701l.G(th);
    }

    @Override // l.m0
    @c2
    public void Q(@NotNull Function1<? super Throwable, Unit> function1) {
        this.f701l.Q(function1);
    }

    @NotNull
    public Object T(E e2) {
        return this.f701l.T(e2);
    }

    @Nullable
    public Object U(E e2, @NotNull Continuation<? super Unit> continuation) {
        return this.f701l.U(e2, continuation);
    }

    @Override // l.m0
    public boolean V() {
        return this.f701l.V();
    }

    @Override // j.v2, j.n2
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean a(Throwable th) {
        l0(new o2(o0(), null, this));
        return true;
    }

    @NotNull
    public final n<E> c() {
        return this;
    }

    @Override // j.v2, j.n2
    public /* synthetic */ void cancel() {
        l0(new o2(o0(), null, this));
    }

    @Override // j.v2, j.n2
    public final void cancel(@Nullable CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new o2(o0(), null, this);
        }
        l0(cancellationException);
    }

    @Override // l.i0
    public boolean i() {
        return this.f701l.i();
    }

    @Override // l.i0
    public boolean isEmpty() {
        return this.f701l.isEmpty();
    }

    @Override // l.i0
    @NotNull
    public p<E> iterator() {
        return this.f701l.iterator();
    }

    @Override // j.v2
    public void l0(@NotNull Throwable th) {
        CancellationException l1 = v2.l1(this, th, null, 1, null);
        this.f701l.cancel(l1);
        j0(l1);
    }

    @Override // l.i0
    @NotNull
    public t.d<E> o() {
        return this.f701l.o();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e2) {
        return this.f701l.offer(e2);
    }

    @Override // l.i0
    @NotNull
    public t.d<r<E>> p() {
        return this.f701l.p();
    }

    @Override // l.i0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    public E poll() {
        return this.f701l.poll();
    }

    @Override // l.i0
    @NotNull
    public t.d<E> q() {
        return this.f701l.q();
    }

    @Override // l.i0
    @NotNull
    public Object v() {
        return this.f701l.v();
    }

    @Override // l.i0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @LowPriorityInOverloadResolution
    @Nullable
    public Object w(@NotNull Continuation<? super E> continuation) {
        return this.f701l.w(continuation);
    }

    @NotNull
    public final n<E> x1() {
        return this.f701l;
    }

    @Override // l.i0
    @Nullable
    public Object z(@NotNull Continuation<? super r<? extends E>> continuation) {
        Object z = this.f701l.z(continuation);
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return z;
    }
}
