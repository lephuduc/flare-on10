package o;

import j.c2;
import j.d2;
import j.n2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.BuilderInference;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;
import kotlin.sequences.Sequence;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"o/l", "o/m", "o/n", "o/o", "o/p", "o/q", "o/r", "o/s", "o/t", "o/u", "o/v", "o/w", "o/x", "o/y", "o/z", "o/a0", "o/b0"}, d2 = {}, k = 4, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class k {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final String f1321a = "kotlinx.coroutines.flow.defaultConcurrency";

    @Nullable
    public static final <T> Object A(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        return n.f(iVar, function2, continuation);
    }

    @d2
    @NotNull
    public static final <T, R> i<R> A0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> function2) {
        return w.a(iVar, function2);
    }

    @d2
    @NotNull
    public static final <T> i<T> A1(@NotNull i<? extends T> iVar, long j2) {
        return r.h(iVar, j2);
    }

    @Nullable
    public static final <T> Object B(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        return v.b(iVar, function2, continuation);
    }

    @c2
    @NotNull
    public static final <T, R> i<R> B0(@NotNull i<? extends T> iVar, @BuilderInference @NotNull Function2<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> function2) {
        return w.b(iVar, function2);
    }

    @d2
    @NotNull
    public static final <T> i<T> B1(@NotNull i<? extends T> iVar, long j2) {
        return r.i(iVar, j2);
    }

    @d2
    @NotNull
    public static final <T, R> i<R> C0(@NotNull i<? extends T> iVar, int i2, @NotNull Function2<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> function2) {
        return w.c(iVar, i2, function2);
    }

    @NotNull
    public static final <T, R> i<R> C1(@NotNull i<? extends T> iVar, R r2, @BuilderInference @NotNull Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
        return a0.j(iVar, r2, function3);
    }

    @NotNull
    public static final <T1, T2, R> i<R> D(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return b0.c(iVar, iVar2, function3);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @ReplaceWith(expression = "scan(initial, operation)", imports = {}))
    @NotNull
    public static final <T, R> i<R> D1(@NotNull i<? extends T> iVar, R r2, @BuilderInference @NotNull Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
        return x.B(iVar, r2, function3);
    }

    @NotNull
    public static final <T1, T2, T3, R> i<R> E(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull i<? extends T3> iVar3, @BuilderInference @NotNull Function4<? super T1, ? super T2, ? super T3, ? super Continuation<? super R>, ? extends Object> function4) {
        return b0.d(iVar, iVar2, iVar3, function4);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @ReplaceWith(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final <T> i<T> E0(@NotNull i<? extends i<? extends T>> iVar) {
        return x.m(iVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @ReplaceWith(expression = "runningReduce(operation)", imports = {}))
    @NotNull
    public static final <T> i<T> E1(@NotNull i<? extends T> iVar, @NotNull Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3) {
        return x.C(iVar, function3);
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> i<R> F(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull i<? extends T3> iVar3, @NotNull i<? extends T4> iVar4, @NotNull Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super R>, ? extends Object> function5) {
        return b0.e(iVar, iVar2, iVar3, iVar4, function5);
    }

    @d2
    @NotNull
    public static final <T> i<T> F0(@NotNull i<? extends i<? extends T>> iVar) {
        return w.e(iVar);
    }

    @NotNull
    public static final <T> i0<T> F1(@NotNull i<? extends T> iVar, @NotNull j.u0 u0Var, @NotNull o0 o0Var, int i2) {
        return z.g(iVar, u0Var, o0Var, i2);
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> i<R> G(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull i<? extends T3> iVar3, @NotNull i<? extends T4> iVar4, @NotNull i<? extends T5> iVar5, @NotNull Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super R>, ? extends Object> function6) {
        return b0.f(iVar, iVar2, iVar3, iVar4, iVar5, function6);
    }

    @d2
    @NotNull
    public static final <T> i<T> G0(@NotNull i<? extends i<? extends T>> iVar, int i2) {
        return w.f(iVar, i2);
    }

    @Nullable
    public static final <T> Object H1(@NotNull i<? extends T> iVar, @NotNull Continuation<? super T> continuation) {
        return y.j(iVar, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @ReplaceWith(expression = "this.combine(other, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, R> i<R> I(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return x.b(iVar, iVar2, function3);
    }

    @NotNull
    public static final <T> i<T> I0(@BuilderInference @NotNull Function2<? super j<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return l.n(function2);
    }

    @Nullable
    public static final <T> Object I1(@NotNull i<? extends T> iVar, @NotNull Continuation<? super T> continuation) {
        return y.k(iVar, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @ReplaceWith(expression = "combine(this, other, other2, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, R> i<R> J(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull i<? extends T3> iVar3, @NotNull Function4<? super T1, ? super T2, ? super T3, ? super Continuation<? super R>, ? extends Object> function4) {
        return x.c(iVar, iVar2, iVar3, function4);
    }

    @JvmName(name = "flowCombine")
    @NotNull
    public static final <T1, T2, R> i<R> J0(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return b0.p(iVar, iVar2, function3);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @ReplaceWith(expression = "drop(count)", imports = {}))
    @NotNull
    public static final <T> i<T> J1(@NotNull i<? extends T> iVar, int i2) {
        return x.D(iVar, i2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, T4, R> i<R> K(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull i<? extends T3> iVar3, @NotNull i<? extends T4> iVar4, @NotNull Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super R>, ? extends Object> function5) {
        return x.d(iVar, iVar2, iVar3, iVar4, function5);
    }

    @JvmName(name = "flowCombineTransform")
    @NotNull
    public static final <T1, T2, R> i<R> K0(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @BuilderInference @NotNull Function4<? super j<? super R>, ? super T1, ? super T2, ? super Continuation<? super Unit>, ? extends Object> function4) {
        return b0.q(iVar, iVar2, function4);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @ReplaceWith(expression = "onStart { emit(value) }", imports = {}))
    @NotNull
    public static final <T> i<T> K1(@NotNull i<? extends T> iVar, T t2) {
        return x.E(iVar, t2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, T4, T5, R> i<R> L(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull i<? extends T3> iVar3, @NotNull i<? extends T4> iVar4, @NotNull i<? extends T5> iVar5, @NotNull Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super R>, ? extends Object> function6) {
        return x.e(iVar, iVar2, iVar3, iVar4, iVar5, function6);
    }

    @NotNull
    public static final <T> i<T> L0(T t2) {
        return l.o(t2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @ReplaceWith(expression = "onStart { emitAll(other) }", imports = {}))
    @NotNull
    public static final <T> i<T> L1(@NotNull i<? extends T> iVar, @NotNull i<? extends T> iVar2) {
        return x.F(iVar, iVar2);
    }

    @NotNull
    public static final <T> i<T> M0(@NotNull T... tArr) {
        return l.p(tArr);
    }

    @Nullable
    public static final <T> Object M1(@NotNull i<? extends T> iVar, @NotNull j.u0 u0Var, @NotNull Continuation<? super t0<? extends T>> continuation) {
        return z.i(iVar, u0Var, continuation);
    }

    @NotNull
    public static final <T1, T2, R> i<R> N(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @BuilderInference @NotNull Function4<? super j<? super R>, ? super T1, ? super T2, ? super Continuation<? super Unit>, ? extends Object> function4) {
        return b0.i(iVar, iVar2, function4);
    }

    @NotNull
    public static final <T> i<T> N0(@NotNull i<? extends T> iVar, @NotNull CoroutineContext coroutineContext) {
        return p.h(iVar, coroutineContext);
    }

    @NotNull
    public static final <T> t0<T> N1(@NotNull i<? extends T> iVar, @NotNull j.u0 u0Var, @NotNull o0 o0Var, T t2) {
        return z.j(iVar, u0Var, o0Var, t2);
    }

    @NotNull
    public static final <T1, T2, T3, R> i<R> O(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull i<? extends T3> iVar3, @BuilderInference @NotNull Function5<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super Continuation<? super Unit>, ? extends Object> function5) {
        return b0.j(iVar, iVar2, iVar3, function5);
    }

    @Nullable
    public static final <T, R> Object O0(@NotNull i<? extends T> iVar, R r2, @NotNull Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3, @NotNull Continuation<? super R> continuation) {
        return y.e(iVar, r2, function3, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void O1(@NotNull i<? extends T> iVar) {
        x.G(iVar);
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> i<R> P(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull i<? extends T3> iVar3, @NotNull i<? extends T4> iVar4, @BuilderInference @NotNull Function6<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super Unit>, ? extends Object> function6) {
        return b0.k(iVar, iVar2, iVar3, iVar4, function6);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @ReplaceWith(expression = "collect(action)", imports = {}))
    public static final <T> void P0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        x.n(iVar, function2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void P1(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        x.H(iVar, function2);
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> i<R> Q(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull i<? extends T3> iVar3, @NotNull i<? extends T4> iVar4, @NotNull i<? extends T5> iVar5, @BuilderInference @NotNull Function7<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super Unit>, ? extends Object> function7) {
        return b0.l(iVar, iVar2, iVar3, iVar4, iVar5, function7);
    }

    public static final int Q0() {
        return w.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void Q1(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Function2<? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function22) {
        x.I(iVar, function2, function22);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'flowOn' instead")
    @NotNull
    public static final <T> i<T> R1(@NotNull i<? extends T> iVar, @NotNull CoroutineContext coroutineContext) {
        return x.J(iVar, coroutineContext);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @ReplaceWith(expression = "let(transformer)", imports = {}))
    @NotNull
    public static final <T, R> i<R> S(@NotNull i<? extends T> iVar, @NotNull Function1<? super i<? extends T>, ? extends i<? extends R>> function1) {
        return x.f(iVar, function1);
    }

    @Nullable
    public static final <T> Object S0(@NotNull i<? extends T> iVar, @NotNull Continuation<? super T> continuation) {
        return y.g(iVar, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @ReplaceWith(expression = "this.flatMapLatest(transform)", imports = {}))
    @NotNull
    public static final <T, R> i<R> S1(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> function2) {
        return x.K(iVar, function2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final <T, R> i<R> T(@NotNull i<? extends T> iVar, @NotNull Function1<? super T, ? extends i<? extends R>> function1) {
        return x.g(iVar, function1);
    }

    @Nullable
    public static final <T> Object T0(@NotNull i<? extends T> iVar, @NotNull Continuation<? super T> continuation) {
        return y.h(iVar, continuation);
    }

    @NotNull
    public static final <T> i<T> T1(@NotNull i<? extends T> iVar, int i2) {
        return v.g(iVar, i2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @ReplaceWith(expression = "onCompletion { emit(value) }", imports = {}))
    @NotNull
    public static final <T> i<T> U(@NotNull i<? extends T> iVar, T t2) {
        return x.h(iVar, t2);
    }

    @NotNull
    public static final <T> n2 U0(@NotNull i<? extends T> iVar, @NotNull j.u0 u0Var) {
        return n.h(iVar, u0Var);
    }

    @NotNull
    public static final <T> i<T> U1(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return v.h(iVar, function2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @ReplaceWith(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @NotNull
    public static final <T> i<T> V(@NotNull i<? extends T> iVar, @NotNull i<? extends T> iVar2) {
        return x.i(iVar, iVar2);
    }

    @NotNull
    public static final <T, R> i<R> V0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return a0.e(iVar, function2);
    }

    @Nullable
    public static final <T, C extends Collection<? super T>> Object V1(@NotNull i<? extends T> iVar, @NotNull C c2, @NotNull Continuation<? super C> continuation) {
        return o.a(iVar, c2, continuation);
    }

    @NotNull
    public static final <T> i<T> W(@NotNull i<? extends T> iVar) {
        return p.g(iVar);
    }

    @c2
    @NotNull
    public static final <T, R> i<R> W0(@NotNull i<? extends T> iVar, @BuilderInference @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return w.k(iVar, function2);
    }

    @Nullable
    public static final <T> Object W1(@NotNull i<? extends T> iVar, @NotNull List<T> list, @NotNull Continuation<? super List<? extends T>> continuation) {
        return o.b(iVar, list, continuation);
    }

    @NotNull
    public static final <T> i<T> X(@NotNull l.i0<? extends T> i0Var) {
        return m.c(i0Var);
    }

    @NotNull
    public static final <T, R> i<R> X0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return a0.f(iVar, function2);
    }

    @Nullable
    public static final <T> Object Y(@NotNull i<? extends T> iVar, @NotNull Continuation<? super Integer> continuation) {
        return q.a(iVar, continuation);
    }

    @NotNull
    public static final <T> i<T> Y0(@NotNull Iterable<? extends i<? extends T>> iterable) {
        return w.l(iterable);
    }

    @Nullable
    public static final <T> Object Y1(@NotNull i<? extends T> iVar, @NotNull Set<T> set, @NotNull Continuation<? super Set<? extends T>> continuation) {
        return o.d(iVar, set, continuation);
    }

    @Nullable
    public static final <T> Object Z(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super Integer> continuation) {
        return q.b(iVar, function2, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @ReplaceWith(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final <T> i<T> Z0(@NotNull i<? extends i<? extends T>> iVar) {
        return x.o(iVar);
    }

    @NotNull
    public static final <T> i<T> a(@NotNull Iterable<? extends T> iterable) {
        return l.a(iterable);
    }

    @d2
    @NotNull
    public static final <T> i<T> a0(@NotNull i<? extends T> iVar, long j2) {
        return r.a(iVar, j2);
    }

    @NotNull
    public static final <T> i<T> a1(@NotNull i<? extends T>... iVarArr) {
        return w.m(iVarArr);
    }

    @NotNull
    public static final <T, R> i<R> a2(@NotNull i<? extends T> iVar, @BuilderInference @NotNull Function3<? super j<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return t.g(iVar, function3);
    }

    @NotNull
    public static final <T> i<T> b(@NotNull Iterator<? extends T> it) {
        return l.b(it);
    }

    @d2
    @OverloadResolutionByLambdaReturnType
    @NotNull
    public static final <T> i<T> b0(@NotNull i<? extends T> iVar, @NotNull Function1<? super T, Long> function1) {
        return r.b(iVar, function1);
    }

    @NotNull
    public static final Void b1() {
        return x.p();
    }

    @c2
    @NotNull
    public static final <T, R> i<R> b2(@NotNull i<? extends T> iVar, @BuilderInference @NotNull Function3<? super j<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return w.n(iVar, function3);
    }

    @d2
    @NotNull
    public static final <T> i<T> c(@NotNull Function0<? extends T> function0) {
        return l.c(function0);
    }

    @d2
    @NotNull
    public static final <T> i<T> c0(@NotNull i<? extends T> iVar, long j2) {
        return r.c(iVar, j2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @NotNull
    public static final <T> i<T> c1(@NotNull i<? extends T> iVar, @NotNull CoroutineContext coroutineContext) {
        return x.q(iVar, coroutineContext);
    }

    @NotNull
    public static final <T, R> i<R> c2(@NotNull i<? extends T> iVar, @BuilderInference @NotNull Function3<? super j<? super R>, ? super T, ? super Continuation<? super Boolean>, ? extends Object> function3) {
        return v.i(iVar, function3);
    }

    @d2
    @NotNull
    public static final <T> i<T> d(@NotNull Function1<? super Continuation<? super T>, ? extends Object> function1) {
        return l.d(function1);
    }

    @d2
    @JvmName(name = "debounceDuration")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T> i<T> d0(@NotNull i<? extends T> iVar, @NotNull Function1<? super T, Duration> function1) {
        return r.d(iVar, function1);
    }

    @NotNull
    public static final <T> i<T> d1(@NotNull i<? extends T> iVar, @NotNull Function3<? super j<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return t.d(iVar, function3);
    }

    @PublishedApi
    @NotNull
    public static final <T, R> i<R> d2(@NotNull i<? extends T> iVar, @BuilderInference @NotNull Function3<? super j<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return t.h(iVar, function3);
    }

    @NotNull
    public static final i<Integer> e(@NotNull IntRange intRange) {
        return l.e(intRange);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @ReplaceWith(expression = "onEach { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final <T> i<T> e0(@NotNull i<? extends T> iVar, long j2) {
        return x.j(iVar, j2);
    }

    @NotNull
    public static final <T> i<T> e1(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return a0.g(iVar, function2);
    }

    @NotNull
    public static final <T> i<IndexedValue<T>> e2(@NotNull i<? extends T> iVar) {
        return a0.k(iVar);
    }

    @NotNull
    public static final i<Long> f(@NotNull LongRange longRange) {
        return l.f(longRange);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @ReplaceWith(expression = "onStart { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final <T> i<T> f0(@NotNull i<? extends T> iVar, long j2) {
        return x.k(iVar, j2);
    }

    @NotNull
    public static final <T> i<T> f1(@NotNull i<? extends T> iVar, @NotNull Function2<? super j<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return t.e(iVar, function2);
    }

    @NotNull
    public static final <T1, T2, R> i<R> f2(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return b0.s(iVar, iVar2, function3);
    }

    @NotNull
    public static final <T> i<T> g(@NotNull Sequence<? extends T> sequence) {
        return l.g(sequence);
    }

    @NotNull
    public static final <T> i<T> g0(@NotNull i<? extends T> iVar) {
        return s.a(iVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final <T> i<T> g1(@NotNull i<? extends T> iVar, @NotNull i<? extends T> iVar2) {
        return x.r(iVar, iVar2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    @NotNull
    public static final <T> i<T> h(@NotNull l.i<T> iVar) {
        return m.b(iVar);
    }

    @NotNull
    public static final <T> i<T> h0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super T, Boolean> function2) {
        return s.b(iVar, function2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final <T> i<T> h1(@NotNull i<? extends T> iVar, @NotNull i<? extends T> iVar2) {
        return x.s(iVar, iVar2);
    }

    @NotNull
    public static final i<Integer> i(@NotNull int[] iArr) {
        return l.h(iArr);
    }

    @NotNull
    public static final <T, K> i<T> i0(@NotNull i<? extends T> iVar, @NotNull Function1<? super T, ? extends K> function1) {
        return s.c(iVar, function1);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @ReplaceWith(expression = "catch { emit(fallback) }", imports = {}))
    @NotNull
    public static final <T> i<T> i1(@NotNull i<? extends T> iVar, T t2) {
        return x.t(iVar, t2);
    }

    @NotNull
    public static final i<Long> j(@NotNull long[] jArr) {
        return l.i(jArr);
    }

    @NotNull
    public static final <T> i<T> j0(@NotNull i<? extends T> iVar, int i2) {
        return v.d(iVar, i2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @ReplaceWith(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @NotNull
    public static final <T> i<T> j1(@NotNull i<? extends T> iVar, T t2, @NotNull Function1<? super Throwable, Boolean> function1) {
        return x.u(iVar, t2, function1);
    }

    @NotNull
    public static final <T> i<T> k(@NotNull T[] tArr) {
        return l.j(tArr);
    }

    @NotNull
    public static final <T> i<T> k0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return v.e(iVar, function2);
    }

    @NotNull
    public static final <T> i0<T> l(@NotNull d0<T> d0Var) {
        return z.a(d0Var);
    }

    @Nullable
    public static final <T> Object l0(@NotNull j<? super T> jVar, @NotNull l.i0<? extends T> i0Var, @NotNull Continuation<? super Unit> continuation) {
        return m.d(jVar, i0Var, continuation);
    }

    @NotNull
    public static final <T> i<T> l1(@NotNull i<? extends T> iVar, @NotNull Function2<? super j<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return t.f(iVar, function2);
    }

    @NotNull
    public static final <T> t0<T> m(@NotNull e0<T> e0Var) {
        return z.b(e0Var);
    }

    @Nullable
    public static final <T> Object m0(@NotNull j<? super T> jVar, @NotNull i<? extends T> iVar, @NotNull Continuation<? super Unit> continuation) {
        return n.g(jVar, iVar, continuation);
    }

    @NotNull
    public static final <T> i0<T> m1(@NotNull i0<? extends T> i0Var, @NotNull Function2<? super j<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return z.f(i0Var, function2);
    }

    @NotNull
    public static final <T> i<T> n0() {
        return l.m();
    }

    @d2
    @NotNull
    public static final <T> l.i0<T> n1(@NotNull i<? extends T> iVar, @NotNull j.u0 u0Var) {
        return m.f(iVar, u0Var);
    }

    @NotNull
    public static final <T> i<T> o(@NotNull i<? extends T> iVar, int i2, @NotNull l.m mVar) {
        return p.b(iVar, i2, mVar);
    }

    public static final void o0(@NotNull j<?> jVar) {
        t.b(jVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final <T> i<T> o1(@NotNull i<? extends T> iVar) {
        return x.w(iVar);
    }

    @NotNull
    public static final <T> i<T> p0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return a0.a(iVar, function2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @ReplaceWith(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final <T> i<T> p1(@NotNull i<? extends T> iVar, int i2) {
        return x.x(iVar, i2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @NotNull
    public static final <T> i<T> q1(@NotNull i<? extends T> iVar, @NotNull CoroutineContext coroutineContext) {
        return x.y(iVar, coroutineContext);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    @NotNull
    public static final <T> i<T> r(@NotNull i<? extends T> iVar) {
        return x.a(iVar);
    }

    @NotNull
    public static final <T> i<T> r0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return a0.c(iVar, function2);
    }

    @NotNull
    public static final <T> i<T> r1(@NotNull l.i0<? extends T> i0Var) {
        return m.g(i0Var);
    }

    @NotNull
    public static final <T> i<T> s(@BuilderInference @NotNull Function2<? super l.g0<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return l.k(function2);
    }

    @NotNull
    public static final <T> i<T> s0(@NotNull i<? extends T> iVar) {
        return a0.d(iVar);
    }

    @Nullable
    public static final <S, T extends S> Object s1(@NotNull i<? extends T> iVar, @NotNull Function3<? super S, ? super T, ? super Continuation<? super S>, ? extends Object> function3, @NotNull Continuation<? super S> continuation) {
        return y.i(iVar, function3, continuation);
    }

    @NotNull
    public static final <T> i<T> t(@NotNull i<? extends T> iVar) {
        return p.e(iVar);
    }

    @Nullable
    public static final <T> Object t0(@NotNull i<? extends T> iVar, @NotNull Continuation<? super T> continuation) {
        return y.a(iVar, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @NotNull
    public static final <T> i<T> t1(@NotNull i<? extends T> iVar) {
        return x.z(iVar);
    }

    @NotNull
    public static final <T> i<T> u(@NotNull i<? extends T> iVar, @NotNull Function3<? super j<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return u.a(iVar, function3);
    }

    @Nullable
    public static final <T> Object u0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return y.b(iVar, function2, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @NotNull
    public static final <T> i<T> u1(@NotNull i<? extends T> iVar, int i2) {
        return x.A(iVar, i2);
    }

    @Nullable
    public static final <T> Object v(@NotNull i<? extends T> iVar, @NotNull j<? super T> jVar, @NotNull Continuation<? super Throwable> continuation) {
        return u.b(iVar, jVar, continuation);
    }

    @Nullable
    public static final <T> Object v0(@NotNull i<? extends T> iVar, @NotNull Continuation<? super T> continuation) {
        return y.c(iVar, continuation);
    }

    @NotNull
    public static final <T> i<T> v1(@NotNull i<? extends T> iVar, long j2, @NotNull Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return u.e(iVar, j2, function2);
    }

    @NotNull
    public static final <T> i<T> w(@BuilderInference @NotNull Function2<? super l.g0<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return l.l(function2);
    }

    @Nullable
    public static final <T> Object w0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return y.d(iVar, function2, continuation);
    }

    @Nullable
    public static final Object x(@NotNull i<?> iVar, @NotNull Continuation<? super Unit> continuation) {
        return n.a(iVar, continuation);
    }

    @NotNull
    public static final l.i0<Unit> x0(@NotNull j.u0 u0Var, long j2, long j3) {
        return r.f(u0Var, j2, j3);
    }

    @NotNull
    public static final <T> i<T> x1(@NotNull i<? extends T> iVar, @NotNull Function4<? super j<? super T>, ? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> function4) {
        return u.g(iVar, function4);
    }

    @NotNull
    public static final <T, R> i<R> y1(@NotNull i<? extends T> iVar, R r2, @BuilderInference @NotNull Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
        return a0.h(iVar, r2, function3);
    }

    @Nullable
    public static final <T> Object z(@NotNull i<? extends T> iVar, @NotNull Function3<? super Integer, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Continuation<? super Unit> continuation) {
        return n.d(iVar, function3, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final <T, R> i<R> z0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super Continuation<? super i<? extends R>>, ? extends Object> function2) {
        return x.l(iVar, function2);
    }

    @NotNull
    public static final <T> i<T> z1(@NotNull i<? extends T> iVar, @NotNull Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3) {
        return a0.i(iVar, function3);
    }
}
