package j;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0000\u001aO\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\tH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u001a\u001e\u0010\u0016\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0015\u001a\n\u0010\u0017\u001a\u00020\u0011*\u00020\u0000\u001a\u0013\u0010\u0018\u001a\u00020\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u001b\u0010\u001f\u001a\u00020\u001a*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lj/u0;", "Lkotlin/coroutines/CoroutineContext;", "context", "m", "b", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "g", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "", "message", "", "c", "j", "h", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "k", "(Lj/u0;)Z", "isActive$annotations", "(Lj/u0;)V", "isActive", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class v0 {
    @NotNull
    public static final u0 a(@NotNull CoroutineContext coroutineContext) {
        c0 c2;
        if (coroutineContext.get(n2.f488b) == null) {
            c2 = t2.c(null, 1, null);
            coroutineContext = coroutineContext.plus(c2);
        }
        return new q.j(coroutineContext);
    }

    @NotNull
    public static final u0 b() {
        return new q.j(r3.c(null, 1, null).plus(m1.e()));
    }

    public static final void c(@NotNull u0 u0Var, @NotNull String str, @Nullable Throwable th) {
        d(u0Var, y1.a(str, th));
    }

    public static final void d(@NotNull u0 u0Var, @Nullable CancellationException cancellationException) {
        n2 n2Var = (n2) u0Var.getCoroutineContext().get(n2.f488b);
        if (n2Var != null) {
            n2Var.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + u0Var).toString());
    }

    public static /* synthetic */ void e(u0 u0Var, String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        c(u0Var, str, th);
    }

    public static /* synthetic */ void f(u0 u0Var, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        d(u0Var, cancellationException);
    }

    @Nullable
    public static final <R> Object g(@NotNull Function2<? super u0, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        Object coroutine_suspended;
        q.n0 n0Var = new q.n0(continuation.getContext(), continuation);
        Object f2 = r.b.f(n0Var, n0Var, function2);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (f2 == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return f2;
    }

    @Nullable
    public static final Object h(@NotNull Continuation<? super CoroutineContext> continuation) {
        return continuation.getContext();
    }

    public static final Object i(Continuation<? super CoroutineContext> continuation) {
        InlineMarker.mark(3);
        throw null;
    }

    public static final void j(@NotNull u0 u0Var) {
        r2.A(u0Var.getCoroutineContext());
    }

    public static final boolean k(@NotNull u0 u0Var) {
        n2 n2Var = (n2) u0Var.getCoroutineContext().get(n2.f488b);
        if (n2Var != null) {
            return n2Var.b();
        }
        return true;
    }

    public static /* synthetic */ void l(u0 u0Var) {
    }

    @NotNull
    public static final u0 m(@NotNull u0 u0Var, @NotNull CoroutineContext coroutineContext) {
        return new q.j(u0Var.getCoroutineContext().plus(coroutineContext));
    }
}
