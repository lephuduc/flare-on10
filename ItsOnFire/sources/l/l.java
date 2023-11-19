package l;

import androidx.appcompat.R;
import j.e2;
import j.e3;
import j.m1;
import j.p0;
import j.u0;
import j.v0;
import j.v2;
import j.w0;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u001a \u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042-\b\u0002\u0010\u0012\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bj\u0004\u0018\u0001`\u00112/\b\u0001\u0010\u0018\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"E", "Ll/i0;", "", "capacity", "Lj/w0;", "start", "Ll/i;", "b", "Lj/u0;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Ll/g0;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Lj/u0;Lkotlin/coroutines/CoroutineContext;ILj/w0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Ll/i;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class l {

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"j/r0$a", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lj/p0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "W", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class a extends AbstractCoroutineContextElement implements j.p0 {
        public a(p0.b bVar) {
            super(bVar);
        }

        @Override // j.p0
        public void W(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "E", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ i0<E> f675j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(i0<? extends E> i0Var) {
            super(1);
            this.f675j = i0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th) {
            s.b(this.f675j, th);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Ll/g0;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", i = {0, 1}, l = {R.styleable.AppCompatTheme_colorControlActivated, R.styleable.AppCompatTheme_colorControlHighlight}, m = "invokeSuspend", n = {"$this$broadcast", "$this$broadcast"}, s = {"L$0", "L$0"})
    /* loaded from: classes2.dex */
    public static final class c extends SuspendLambda implements Function2<g0<? super E>, Continuation<? super Unit>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public Object f676j;

        /* renamed from: k  reason: collision with root package name */
        public int f677k;

        /* renamed from: l  reason: collision with root package name */
        public /* synthetic */ Object f678l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ i0<E> f679m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(i0<? extends E> i0Var, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f679m = i0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = new c(this.f679m, continuation);
            cVar.f678l = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull g0<? super E> g0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(g0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0062 -> B:7:0x0019). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f677k
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2f
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r6.f676j
                l.p r1 = (l.p) r1
                java.lang.Object r4 = r6.f678l
                l.g0 r4 = (l.g0) r4
                kotlin.ResultKt.throwOnFailure(r7)
            L19:
                r7 = r4
                goto L3c
            L1b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L23:
                java.lang.Object r1 = r6.f676j
                l.p r1 = (l.p) r1
                java.lang.Object r4 = r6.f678l
                l.g0 r4 = (l.g0) r4
                kotlin.ResultKt.throwOnFailure(r7)
                goto L4c
            L2f:
                kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Object r7 = r6.f678l
                l.g0 r7 = (l.g0) r7
                l.i0<E> r1 = r6.f679m
                l.p r1 = r1.iterator()
            L3c:
                r6.f678l = r7
                r6.f676j = r1
                r6.f677k = r3
                java.lang.Object r4 = r1.a(r6)
                if (r4 != r0) goto L49
                return r0
            L49:
                r5 = r4
                r4 = r7
                r7 = r5
            L4c:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L65
                java.lang.Object r7 = r1.next()
                r6.f678l = r4
                r6.f676j = r1
                r6.f677k = r2
                java.lang.Object r7 = r4.U(r7, r6)
                if (r7 != r0) goto L19
                return r0
            L65:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l.l.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @e3
    @NotNull
    public static final <E> i<E> a(@NotNull u0 u0Var, @NotNull CoroutineContext coroutineContext, int i2, @NotNull w0 w0Var, @Nullable Function1<? super Throwable, Unit> function1, @BuilderInference @NotNull Function2<? super g0<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        CoroutineContext d2 = j.n0.d(u0Var, coroutineContext);
        i a2 = j.a(i2);
        k c0Var = w0Var.d() ? new c0(d2, a2, function2) : new k(d2, a2, true);
        if (function1 != null) {
            ((v2) c0Var).H(function1);
        }
        ((j.a) c0Var).w1(w0Var, c0Var, function2);
        return c0Var;
    }

    @e3
    @NotNull
    public static final <E> i<E> b(@NotNull i0<? extends E> i0Var, int i2, @NotNull w0 w0Var) {
        return c(v0.m(v0.m(e2.f425j, m1.g()), new a(j.p0.f495a)), null, i2, w0Var, new b(i0Var), new c(i0Var, null), 1, null);
    }

    public static /* synthetic */ i c(u0 u0Var, CoroutineContext coroutineContext, int i2, w0 w0Var, Function1 function1, Function2 function2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            w0Var = w0.LAZY;
        }
        w0 w0Var2 = w0Var;
        if ((i3 & 8) != 0) {
            function1 = null;
        }
        return a(u0Var, coroutineContext2, i4, w0Var2, function1, function2);
    }

    public static /* synthetic */ i d(i0 i0Var, int i2, w0 w0Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 1;
        }
        if ((i3 & 2) != 0) {
            w0Var = w0.LAZY;
        }
        return b(i0Var, i2, w0Var);
    }
}
