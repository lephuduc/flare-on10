package j;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"j/k", "j/l"}, d2 = {}, k = 4, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class j {
    @NotNull
    public static final <T> c1<T> a(@NotNull u0 u0Var, @NotNull CoroutineContext coroutineContext, @NotNull w0 w0Var, @NotNull Function2<? super u0, ? super Continuation<? super T>, ? extends Object> function2) {
        return l.a(u0Var, coroutineContext, w0Var, function2);
    }

    @Nullable
    public static final <T> Object c(@NotNull o0 o0Var, @NotNull Function2<? super u0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return l.c(o0Var, function2, continuation);
    }

    @NotNull
    public static final n2 d(@NotNull u0 u0Var, @NotNull CoroutineContext coroutineContext, @NotNull w0 w0Var, @NotNull Function2<? super u0, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return l.e(u0Var, coroutineContext, w0Var, function2);
    }

    public static /* synthetic */ n2 e(u0 u0Var, CoroutineContext coroutineContext, w0 w0Var, Function2 function2, int i2, Object obj) {
        return l.f(u0Var, coroutineContext, w0Var, function2, i2, obj);
    }

    public static final <T> T f(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super u0, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        return (T) k.a(coroutineContext, function2);
    }

    @Nullable
    public static final <T> Object h(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super u0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return l.g(coroutineContext, function2, continuation);
    }
}
