package o;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR>\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lo/x0;", "T", "Lo/j;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "Lo/j;", "collector", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "k", "Lkotlin/jvm/functions/Function2;", "action", "<init>", "(Lo/j;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class x0<T> implements j<T> {
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public final j<T> f1711j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public final Function2<j<? super T>, Continuation<? super Unit>, Object> f1712k;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {419, 423}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class a extends ContinuationImpl {

        /* renamed from: j  reason: collision with root package name */
        public Object f1713j;

        /* renamed from: k  reason: collision with root package name */
        public Object f1714k;

        /* renamed from: l  reason: collision with root package name */
        public /* synthetic */ Object f1715l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ x0<T> f1716m;

        /* renamed from: n  reason: collision with root package name */
        public int f1717n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0<T> x0Var, Continuation<? super a> continuation) {
            super(continuation);
            this.f1716m = x0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1715l = obj;
            this.f1717n |= Integer.MIN_VALUE;
            return this.f1716m.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x0(@NotNull j<? super T> jVar, @NotNull Function2<? super j<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.f1711j = jVar;
        this.f1712k = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof o.x0.a
            if (r0 == 0) goto L13
            r0 = r8
            o.x0$a r0 = (o.x0.a) r0
            int r1 = r0.f1717n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1717n = r1
            goto L18
        L13:
            o.x0$a r0 = new o.x0$a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f1715l
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1717n
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r8)
            goto L7a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f1714k
            p.v r7 = (p.v) r7
            java.lang.Object r2 = r0.f1713j
            o.x0 r2 = (o.x0) r2
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L40
            goto L61
        L40:
            r8 = move-exception
            goto L84
        L42:
            kotlin.ResultKt.throwOnFailure(r8)
            p.v r8 = new p.v
            o.j<T> r2 = r7.f1711j
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            r8.<init>(r2, r5)
            kotlin.jvm.functions.Function2<o.j<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r2 = r7.f1712k     // Catch: java.lang.Throwable -> L80
            r0.f1713j = r7     // Catch: java.lang.Throwable -> L80
            r0.f1714k = r8     // Catch: java.lang.Throwable -> L80
            r0.f1717n = r4     // Catch: java.lang.Throwable -> L80
            java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L80
            if (r2 != r1) goto L5f
            return r1
        L5f:
            r2 = r7
            r7 = r8
        L61:
            r7.releaseIntercepted()
            o.j<T> r7 = r2.f1711j
            boolean r8 = r7 instanceof o.x0
            if (r8 == 0) goto L7d
            o.x0 r7 = (o.x0) r7
            r8 = 0
            r0.f1713j = r8
            r0.f1714k = r8
            r0.f1717n = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L7a
            return r1
        L7a:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L7d:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L80:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L84:
            r7.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.x0.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // o.j
    @Nullable
    public Object emit(T t2, @NotNull Continuation<? super Unit> continuation) {
        return this.f1711j.emit(t2, continuation);
    }
}
