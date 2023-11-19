package o;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0006\u0010%\u001a\u00020#\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b&\u0010'J-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u000f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lo/e;", "T", "Lp/e;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Ll/m;", "onBufferOverflow", "j", "(Lkotlin/coroutines/CoroutineContext;ILl/m;)Lp/e;", "Lo/i;", "k", "()Lo/i;", "Ll/g0;", "scope", "", "i", "(Ll/g0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj/u0;", "Ll/i0;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "(Lj/u0;)Ll/i0;", "Lo/j;", "collector", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "e", "()Ljava/lang/String;", "o", "()V", "m", "Ll/i0;", "channel", "", "Z", "consume", "<init>", "(Ll/i0;ZLkotlin/coroutines/CoroutineContext;ILl/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class e<T> extends p.e<T> {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1282o = AtomicIntegerFieldUpdater.newUpdater(e.class, "consumed");
    @NotNull
    private volatile /* synthetic */ int consumed;
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public final l.i0<T> f1283m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f1284n;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull l.i0<? extends T> i0Var, boolean z, @NotNull CoroutineContext coroutineContext, int i2, @NotNull l.m mVar) {
        super(coroutineContext, i2, mVar);
        this.f1283m = i0Var;
        this.f1284n = z;
        this.consumed = 0;
    }

    public /* synthetic */ e(l.i0 i0Var, boolean z, CoroutineContext coroutineContext, int i2, l.m mVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i0Var, z, (i3 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i3 & 8) != 0 ? -3 : i2, (i3 & 16) != 0 ? l.m.SUSPEND : mVar);
    }

    @Override // p.e, o.i
    @Nullable
    public Object collect(@NotNull j<? super T> jVar, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        if (this.f1825k != -3) {
            Object collect = super.collect(jVar, continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return collect == coroutine_suspended ? collect : Unit.INSTANCE;
        }
        o();
        Object e2 = m.e(jVar, this.f1283m, this.f1284n, continuation);
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return e2 == coroutine_suspended2 ? e2 : Unit.INSTANCE;
    }

    @Override // p.e
    @NotNull
    public String e() {
        return "channel=" + this.f1283m;
    }

    @Override // p.e
    @Nullable
    public Object i(@NotNull l.g0<? super T> g0Var, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object e2 = m.e(new p.y(g0Var), this.f1283m, this.f1284n, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return e2 == coroutine_suspended ? e2 : Unit.INSTANCE;
    }

    @Override // p.e
    @NotNull
    public p.e<T> j(@NotNull CoroutineContext coroutineContext, int i2, @NotNull l.m mVar) {
        return new e(this.f1283m, this.f1284n, coroutineContext, i2, mVar);
    }

    @Override // p.e
    @NotNull
    public i<T> k() {
        return new e(this.f1283m, this.f1284n, null, 0, null, 28, null);
    }

    @Override // p.e
    @NotNull
    public l.i0<T> n(@NotNull j.u0 u0Var) {
        o();
        return this.f1825k == -3 ? this.f1283m : super.n(u0Var);
    }

    public final void o() {
        if (this.f1284n) {
            if (!(f1282o.getAndSet(this, 1) == 0)) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }
}
