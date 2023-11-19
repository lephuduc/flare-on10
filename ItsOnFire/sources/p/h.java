package p;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H¤@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\bJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J)\u0010\u0012\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lp/h;", "S", "T", "Lp/e;", "Lo/j;", "collector", "", "s", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/g0;", "scope", "i", "(Ll/g0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collect", "", "toString", "Lkotlin/coroutines/CoroutineContext;", "newContext", "r", "(Lo/j;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo/i;", "m", "Lo/i;", "flow", "context", "", "capacity", "Ll/m;", "onBufferOverflow", "<init>", "(Lo/i;Lkotlin/coroutines/CoroutineContext;ILl/m;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public abstract class h<S, T> extends e<T> {
    @JvmField
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public final o.i<S> f1849m;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"S", "T", "Lo/j;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class a extends SuspendLambda implements Function2<o.j<? super T>, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f1850j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f1851k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ h<S, T> f1852l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h<S, T> hVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f1852l = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f1852l, continuation);
            aVar.f1851k = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return invoke((o.j) ((o.j) obj), continuation);
        }

        @Nullable
        public final Object invoke(@NotNull o.j<? super T> jVar, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f1850j;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                h<S, T> hVar = this.f1852l;
                this.f1850j = 1;
                if (hVar.s((o.j) this.f1851k, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@NotNull o.i<? extends S> iVar, @NotNull CoroutineContext coroutineContext, int i2, @NotNull l.m mVar) {
        super(coroutineContext, i2, mVar);
        this.f1849m = iVar;
    }

    public static /* synthetic */ Object p(h hVar, o.j jVar, Continuation continuation) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Object coroutine_suspended3;
        if (hVar.f1825k == -3) {
            CoroutineContext context = continuation.getContext();
            CoroutineContext plus = context.plus(hVar.f1824j);
            if (Intrinsics.areEqual(plus, context)) {
                Object s2 = hVar.s(jVar, continuation);
                coroutine_suspended3 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return s2 == coroutine_suspended3 ? s2 : Unit.INSTANCE;
            }
            ContinuationInterceptor.Key key = ContinuationInterceptor.Key;
            if (Intrinsics.areEqual(plus.get(key), context.get(key))) {
                Object r2 = hVar.r(jVar, plus, continuation);
                coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return r2 == coroutine_suspended2 ? r2 : Unit.INSTANCE;
            }
        }
        Object collect = super.collect(jVar, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return collect == coroutine_suspended ? collect : Unit.INSTANCE;
    }

    public static /* synthetic */ Object q(h hVar, g0 g0Var, Continuation continuation) {
        Object coroutine_suspended;
        Object s2 = hVar.s(new y(g0Var), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return s2 == coroutine_suspended ? s2 : Unit.INSTANCE;
    }

    @Override // p.e, o.i
    @Nullable
    public Object collect(@NotNull o.j<? super T> jVar, @NotNull Continuation<? super Unit> continuation) {
        return p(this, jVar, continuation);
    }

    @Override // p.e
    @Nullable
    public Object i(@NotNull g0<? super T> g0Var, @NotNull Continuation<? super Unit> continuation) {
        return q(this, g0Var, continuation);
    }

    public final Object r(o.j<? super T> jVar, CoroutineContext coroutineContext, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object d2 = f.d(coroutineContext, f.a(jVar, continuation.getContext()), null, new a(this, null), continuation, 4, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return d2 == coroutine_suspended ? d2 : Unit.INSTANCE;
    }

    @Nullable
    public abstract Object s(@NotNull o.j<? super T> jVar, @NotNull Continuation<? super Unit> continuation);

    @Override // p.e
    @NotNull
    public String toString() {
        return this.f1849m + " -> " + super.toString();
    }
}
