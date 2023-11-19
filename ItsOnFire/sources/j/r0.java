package j;

import j.p0;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a%\u0010\f\u001a\u00020\u000b2\u001a\b\u0004\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\tH\u0086\b¨\u0006\r"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "b", "originalException", "thrownException", "c", "Lkotlin/Function2;", "handler", "Lj/p0;", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class r0 {

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"j/r0$a", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lj/p0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "W", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class a extends AbstractCoroutineContextElement implements p0 {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Function2<CoroutineContext, Throwable, Unit> f505j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super CoroutineContext, ? super Throwable, Unit> function2, p0.b bVar) {
            super(bVar);
            this.f505j = function2;
        }

        @Override // j.p0
        public void W(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
            this.f505j.invoke(coroutineContext, th);
        }
    }

    @NotNull
    public static final p0 a(@NotNull Function2<? super CoroutineContext, ? super Throwable, Unit> function2) {
        return new a(function2, p0.f495a);
    }

    @i2
    public static final void b(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
        try {
            p0 p0Var = (p0) coroutineContext.get(p0.f495a);
            if (p0Var != null) {
                p0Var.W(coroutineContext, th);
            } else {
                q0.a(coroutineContext, th);
            }
        } catch (Throwable th2) {
            q0.a(coroutineContext, c(th, th2));
        }
    }

    @NotNull
    public static final Throwable c(@NotNull Throwable th, @NotNull Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        ExceptionsKt__ExceptionsKt.addSuppressed(runtimeException, th);
        return runtimeException;
    }
}
