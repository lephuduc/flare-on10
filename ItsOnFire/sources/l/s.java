package l;

import j.e3;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"l/t", "l/u", "l/v"}, d2 = {}, k = 4, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class s {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final String f728a = "Channel was closed";

    @PublishedApi
    @NotNull
    public static final <E, R> i0<R> J(@NotNull i0<? extends E> i0Var, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2) {
        return v.E(i0Var, coroutineContext, function2);
    }

    @PublishedApi
    @NotNull
    public static final <E, R> i0<R> L(@NotNull i0<? extends E> i0Var, @NotNull CoroutineContext coroutineContext, @NotNull Function3<? super Integer, ? super E, ? super Continuation<? super R>, ? extends Object> function3) {
        return v.G(i0Var, coroutineContext, function3);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'onReceiveCatching'")
    @NotNull
    public static final <E> t.d<E> U(@NotNull i0<? extends E> i0Var) {
        return u.h(i0Var);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @Nullable
    public static final <E> Object V(@NotNull i0<? extends E> i0Var, @NotNull Continuation<? super E> continuation) {
        return u.i(i0Var, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @ReplaceWith(expression = "trySendBlocking(element)", imports = {}))
    public static final <E> void X(@NotNull m0<? super E> m0Var, E e2) {
        t.a(m0Var, e2);
    }

    @PublishedApi
    public static final void b(@NotNull i0<?> i0Var, @Nullable Throwable th) {
        u.a(i0Var, th);
    }

    @e3
    public static final <E, R> R c(@NotNull i<E> iVar, @NotNull Function1<? super i0<? extends E>, ? extends R> function1) {
        return (R) u.b(iVar, function1);
    }

    public static final <E, R> R d(@NotNull i0<? extends E> i0Var, @NotNull Function1<? super i0<? extends E>, ? extends R> function1) {
        return (R) u.c(i0Var, function1);
    }

    @e3
    @Nullable
    public static final <E> Object e(@NotNull i<E> iVar, @NotNull Function1<? super E, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        return u.d(iVar, function1, continuation);
    }

    @PublishedApi
    @Nullable
    public static final <E, C extends m0<? super E>> Object e0(@NotNull i0<? extends E> i0Var, @NotNull C c2, @NotNull Continuation<? super C> continuation) {
        return v.W(i0Var, c2, continuation);
    }

    @Nullable
    public static final <E> Object f(@NotNull i0<? extends E> i0Var, @NotNull Function1<? super E, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        return u.e(i0Var, function1, continuation);
    }

    @PublishedApi
    @Nullable
    public static final <E, C extends Collection<? super E>> Object f0(@NotNull i0<? extends E> i0Var, @NotNull C c2, @NotNull Continuation<? super C> continuation) {
        return v.X(i0Var, c2, continuation);
    }

    @PublishedApi
    @NotNull
    public static final Function1<Throwable, Unit> g(@NotNull i0<?> i0Var) {
        return v.b(i0Var);
    }

    @Nullable
    public static final <E> Object g0(@NotNull i0<? extends E> i0Var, @NotNull Continuation<? super List<? extends E>> continuation) {
        return u.j(i0Var, continuation);
    }

    @PublishedApi
    @NotNull
    public static final Function1<Throwable, Unit> h(@NotNull i0<?>... i0VarArr) {
        return v.c(i0VarArr);
    }

    @PublishedApi
    @Nullable
    public static final <K, V, M extends Map<? super K, ? super V>> Object h0(@NotNull i0<? extends Pair<? extends K, ? extends V>> i0Var, @NotNull M m2, @NotNull Continuation<? super M> continuation) {
        return v.Y(i0Var, m2, continuation);
    }

    @PublishedApi
    @NotNull
    public static final <E, K> i0<E> k(@NotNull i0<? extends E> i0Var, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super E, ? super Continuation<? super K>, ? extends Object> function2) {
        return v.f(i0Var, coroutineContext, function2);
    }

    @PublishedApi
    @Nullable
    public static final <E> Object k0(@NotNull i0<? extends E> i0Var, @NotNull Continuation<? super Set<E>> continuation) {
        return v.b0(i0Var, continuation);
    }

    @NotNull
    public static final <E> Object m0(@NotNull m0<? super E> m0Var, E e2) {
        return t.b(m0Var, e2);
    }

    @PublishedApi
    @NotNull
    public static final <E, R, V> i0<V> q0(@NotNull i0<? extends E> i0Var, @NotNull i0<? extends R> i0Var2, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super E, ? super R, ? extends V> function2) {
        return v.g0(i0Var, i0Var2, coroutineContext, function2);
    }

    @PublishedApi
    @NotNull
    public static final <E> i0<E> s(@NotNull i0<? extends E> i0Var, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return v.n(i0Var, coroutineContext, function2);
    }

    @PublishedApi
    @NotNull
    public static final <E> i0<E> y(@NotNull i0<? extends E> i0Var) {
        return v.t(i0Var);
    }
}
