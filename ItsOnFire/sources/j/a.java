package j;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@i2
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u00103\u001a\u00020&\u0012\u0006\u00104\u001a\u00020\f\u0012\u0006\u00105\u001a\u00020\f¢\u0006\u0004\b6\u00107J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0004J\u001e\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\tJ\u0012\u0010\u0017\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u001b\u0010\u001cJO\u0010$\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u00012'\u0010#\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00110!¢\u0006\u0002\b\"ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u001d\u0010-\u001a\u00020&8\u0006¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0014\u00102\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Lj/a;", "T", "Lj/v2;", "Lj/n2;", "Lkotlin/coroutines/Continuation;", "Lj/u0;", "value", "", "v1", "(Ljava/lang/Object;)V", "", "cause", "", "handled", "u1", "", "o0", "", "state", "a1", "Lkotlin/Result;", "result", "resumeWith", "s1", "exception", "I0", "(Ljava/lang/Throwable;)V", "U0", "()Ljava/lang/String;", "R", "Lj/w0;", "start", "receiver", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "w1", "(Lj/w0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/coroutines/CoroutineContext;", "k", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getContext$annotations", "()V", "context", "getCoroutineContext", "coroutineContext", "b", "()Z", "isActive", "parentContext", "initParentJob", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "<init>", "(Lkotlin/coroutines/CoroutineContext;ZZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public abstract class a<T> extends v2 implements n2, Continuation<T>, u0 {
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public final CoroutineContext f386k;

    public a(@NotNull CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            J0((n2) coroutineContext.get(n2.f488b));
        }
        this.f386k = coroutineContext.plus(this);
    }

    public static /* synthetic */ void t1() {
    }

    @Override // j.v2
    public final void I0(@NotNull Throwable th) {
        r0.b(this.f386k, th);
    }

    @Override // j.v2
    @NotNull
    public String U0() {
        String b2 = n0.b(this.f386k);
        if (b2 == null) {
            return super.U0();
        }
        return Typography.quote + b2 + "\":" + super.U0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.v2
    public final void a1(@Nullable Object obj) {
        if (!(obj instanceof e0)) {
            v1(obj);
            return;
        }
        e0 e0Var = (e0) obj;
        u1(e0Var.f424a, e0Var.a());
    }

    @Override // j.v2, j.n2
    public boolean b() {
        return super.b();
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public final CoroutineContext getContext() {
        return this.f386k;
    }

    @Override // j.u0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f386k;
    }

    @Override // j.v2
    @NotNull
    public String o0() {
        return z0.a(this) + " was cancelled";
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@NotNull Object obj) {
        Object S0 = S0(k0.d(obj, null, 1, null));
        if (S0 == w2.f556b) {
            return;
        }
        s1(S0);
    }

    public void s1(@Nullable Object obj) {
        g0(obj);
    }

    public void u1(@NotNull Throwable th, boolean z) {
    }

    public void v1(T t2) {
    }

    public final <R> void w1(@NotNull w0 w0Var, R r2, @NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        w0Var.c(function2, r2, this);
    }
}
