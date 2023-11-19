package p;

import j.n2;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.n0;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0080\u0010\u001aP\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\b2/\b\u0005\u0010\u000e\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\u0081\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lp/v;", "Lkotlin/coroutines/CoroutineContext;", "currentContext", "", "a", "Lj/n2;", "collectJob", "b", "T", "Lkotlin/Function2;", "Lo/j;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lo/i;", "c", "(Lkotlin/jvm/functions/Function2;)Lo/i;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class x {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "count", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "a", "(ILkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function2<Integer, CoroutineContext.Element, Integer> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ v<?> f1956j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v<?> vVar) {
            super(2);
            this.f1956j = vVar;
        }

        @NotNull
        public final Integer a(int i2, @NotNull CoroutineContext.Element element) {
            CoroutineContext.Key<?> key = element.getKey();
            CoroutineContext.Element element2 = this.f1956j.f1949k.get(key);
            if (key != n2.f488b) {
                return Integer.valueOf(element != element2 ? Integer.MIN_VALUE : i2 + 1);
            }
            n2 n2Var = (n2) element2;
            n2 b2 = x.b((n2) element, n2Var);
            if (b2 == n2Var) {
                if (n2Var != null) {
                    i2++;
                }
                return Integer.valueOf(i2);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b2 + ", expected child of " + n2Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, CoroutineContext.Element element) {
            return a(num.intValue(), element);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"p/x$b", "Lo/i;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class b implements o.i<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Function2<o.j<? super T>, Continuation<? super Unit>, Object> f1957j;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes2.dex */
        public static final class a extends ContinuationImpl {

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f1958j;

            /* renamed from: l  reason: collision with root package name */
            public int f1960l;

            public a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f1958j = obj;
                this.f1960l |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super o.j<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
            this.f1957j = function2;
        }

        @Override // o.i
        @Nullable
        public Object collect(@NotNull o.j<? super T> jVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object invoke = this.f1957j.invoke(jVar, continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return invoke == coroutine_suspended ? invoke : Unit.INSTANCE;
        }

        @Nullable
        public Object e(@NotNull o.j<? super T> jVar, @NotNull Continuation<? super Unit> continuation) {
            InlineMarker.mark(4);
            new a(continuation);
            InlineMarker.mark(5);
            this.f1957j.invoke(jVar, continuation);
            return Unit.INSTANCE;
        }
    }

    @JvmName(name = "checkContext")
    public static final void a(@NotNull v<?> vVar, @NotNull CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.fold(0, new a(vVar))).intValue() == vVar.f1950l) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + vVar.f1949k + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    @Nullable
    public static final n2 b(@Nullable n2 n2Var, @Nullable n2 n2Var2) {
        while (n2Var != null) {
            if (n2Var == n2Var2 || !(n2Var instanceof n0)) {
                return n2Var;
            }
            n2Var = ((n0) n2Var).x1();
        }
        return null;
    }

    @PublishedApi
    @NotNull
    public static final <T> o.i<T> c(@BuilderInference @NotNull Function2<? super o.j<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new b(function2);
    }
}
