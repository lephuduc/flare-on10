package j;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"j/s2", "j/t2"}, d2 = {}, k = 4, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class r2 {
    public static final void A(@NotNull CoroutineContext coroutineContext) {
        t2.y(coroutineContext);
    }

    @NotNull
    public static final n2 B(@NotNull CoroutineContext coroutineContext) {
        return t2.z(coroutineContext);
    }

    public static final boolean C(@NotNull CoroutineContext coroutineContext) {
        return t2.A(coroutineContext);
    }

    @NotNull
    public static final c0 a(@Nullable n2 n2Var) {
        return t2.a(n2Var);
    }

    public static /* synthetic */ c0 c(n2 n2Var, int i2, Object obj) {
        return t2.c(n2Var, i2, obj);
    }

    public static final void e(@NotNull n2 n2Var, @NotNull String str, @Nullable Throwable th) {
        t2.e(n2Var, str, th);
    }

    public static final void g(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        t2.g(coroutineContext, cancellationException);
    }

    @Nullable
    public static final Object l(@NotNull n2 n2Var, @NotNull Continuation<? super Unit> continuation) {
        return t2.l(n2Var, continuation);
    }

    public static final void o(@NotNull n2 n2Var, @Nullable CancellationException cancellationException) {
        t2.o(n2Var, cancellationException);
    }

    public static final void r(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        t2.r(coroutineContext, cancellationException);
    }

    public static final void w(@NotNull q<?> qVar, @NotNull Future<?> future) {
        s2.a(qVar, future);
    }

    @i2
    @NotNull
    public static final p1 x(@NotNull n2 n2Var, @NotNull Future<?> future) {
        return s2.b(n2Var, future);
    }

    @NotNull
    public static final p1 y(@NotNull n2 n2Var, @NotNull p1 p1Var) {
        return t2.w(n2Var, p1Var);
    }

    public static final void z(@NotNull n2 n2Var) {
        t2.x(n2Var);
    }
}
