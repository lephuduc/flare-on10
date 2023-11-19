package j;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001aQ\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a]\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aW\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aH\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e*\u00020\u00142)\b\b\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086Jø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lj/u0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lj/w0;", "start", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lj/n2;", "e", "(Lj/u0;Lkotlin/coroutines/CoroutineContext;Lj/w0;Lkotlin/jvm/functions/Function2;)Lj/n2;", "T", "Lj/c1;", "a", "(Lj/u0;Lkotlin/coroutines/CoroutineContext;Lj/w0;Lkotlin/jvm/functions/Function2;)Lj/c1;", "g", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj/o0;", "c", "(Lj/o0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "I", "UNDECIDED", "b", n.g.f1012c, "RESUMED", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/BuildersKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class l {

    /* renamed from: a */
    public static final int f467a = 0;

    /* renamed from: b */
    public static final int f468b = 1;

    /* renamed from: c */
    public static final int f469c = 2;

    @NotNull
    public static final <T> c1<T> a(@NotNull u0 u0Var, @NotNull CoroutineContext coroutineContext, @NotNull w0 w0Var, @NotNull Function2<? super u0, ? super Continuation<? super T>, ? extends Object> function2) {
        CoroutineContext d2 = n0.d(u0Var, coroutineContext);
        d1 x2Var = w0Var.d() ? new x2(d2, function2) : new d1(d2, true);
        ((a) x2Var).w1(w0Var, x2Var, function2);
        return x2Var;
    }

    public static /* synthetic */ c1 b(u0 u0Var, CoroutineContext coroutineContext, w0 w0Var, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            w0Var = w0.DEFAULT;
        }
        return j.a(u0Var, coroutineContext, w0Var, function2);
    }

    @Nullable
    public static final <T> Object c(@NotNull o0 o0Var, @NotNull Function2<? super u0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return j.h(o0Var, function2, continuation);
    }

    public static final <T> Object d(o0 o0Var, Function2<? super u0, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        InlineMarker.mark(0);
        Object h2 = j.h(o0Var, function2, continuation);
        InlineMarker.mark(1);
        return h2;
    }

    @NotNull
    public static final n2 e(@NotNull u0 u0Var, @NotNull CoroutineContext coroutineContext, @NotNull w0 w0Var, @NotNull Function2<? super u0, ? super Continuation<? super Unit>, ? extends Object> function2) {
        CoroutineContext d2 = n0.d(u0Var, coroutineContext);
        a y2Var = w0Var.d() ? new y2(d2, function2) : new o3(d2, true);
        y2Var.w1(w0Var, y2Var, function2);
        return y2Var;
    }

    public static /* synthetic */ n2 f(u0 u0Var, CoroutineContext coroutineContext, w0 w0Var, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            w0Var = w0.DEFAULT;
        }
        return j.d(u0Var, coroutineContext, w0Var, function2);
    }

    @Nullable
    public static final <T> Object g(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super u0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        Object y1;
        Object coroutine_suspended;
        CoroutineContext context = continuation.getContext();
        CoroutineContext e2 = n0.e(context, coroutineContext);
        r2.A(e2);
        if (e2 == context) {
            q.n0 n0Var = new q.n0(e2, continuation);
            y1 = r.b.f(n0Var, n0Var, function2);
        } else {
            ContinuationInterceptor.Key key = ContinuationInterceptor.Key;
            if (Intrinsics.areEqual(e2.get(key), context.get(key))) {
                c4 c4Var = new c4(e2, continuation);
                Object c2 = q.w0.c(e2, null);
                try {
                    Object f2 = r.b.f(c4Var, c4Var, function2);
                    q.w0.a(e2, c2);
                    y1 = f2;
                } catch (Throwable th) {
                    q.w0.a(e2, c2);
                    throw th;
                }
            } else {
                i1 i1Var = new i1(e2, continuation);
                r.a.f(function2, i1Var, i1Var, null, 4, null);
                y1 = i1Var.y1();
            }
        }
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (y1 == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return y1;
    }
}
