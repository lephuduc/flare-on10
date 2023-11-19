package j;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aV\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function2;", "Lj/u0;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/BuildersKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class k {
    public static final <T> T a(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super u0, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        t1 a2;
        e2 e2Var;
        Thread currentThread = Thread.currentThread();
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.Key);
        if (continuationInterceptor == null) {
            a2 = u3.f529a.b();
            e2Var = e2.f425j;
            coroutineContext = coroutineContext.plus(a2);
        } else {
            t1 t1Var = continuationInterceptor instanceof t1 ? (t1) continuationInterceptor : null;
            if (t1Var != null) {
                t1 t1Var2 = t1Var.F() ? t1Var : null;
                if (t1Var2 != null) {
                    a2 = t1Var2;
                    e2Var = e2.f425j;
                }
            }
            a2 = u3.f529a.a();
            e2Var = e2.f425j;
        }
        h hVar = new h(n0.d(e2Var, coroutineContext), currentThread, a2);
        hVar.w1(w0.DEFAULT, hVar, function2);
        return (T) hVar.x1();
    }

    public static /* synthetic */ Object b(CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) throws InterruptedException {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return j.f(coroutineContext, function2);
    }
}
