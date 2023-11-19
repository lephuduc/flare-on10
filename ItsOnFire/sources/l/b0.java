package l;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003BO\u0012\u0006\u0010$\u001a\u00020#\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\u0012-\u0010\u001a\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017¢\u0006\u0002\b(ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016JX\u0010\u001b\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0016\u001a\u00028\u00002(\u0010\u001a\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR&\u0010\"\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Ll/b0;", "E", "Ll/d;", "Lt/e;", "Ll/m0;", "", "b1", "element", "U", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "offer", "(Ljava/lang/Object;)Z", "Ll/r;", "T", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "G", "R", "Lt/f;", "select", "param", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "S", "(Lt/f;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "m", "Lkotlin/coroutines/Continuation;", "continuation", "D", "()Lt/e;", "onSend", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Ll/n;", "channel", "Ll/f;", "Lkotlin/ExtensionFunctionType;", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ll/n;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class b0<E> extends d<E> implements t.e<E, m0<? super E>> {
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public Continuation<? super Unit> f637m;

    public b0(@NotNull CoroutineContext coroutineContext, @NotNull n<E> nVar, @NotNull Function2<? super f<E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        super(coroutineContext, nVar, false);
        Continuation<? super Unit> createCoroutineUnintercepted;
        createCoroutineUnintercepted = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(function2, this, this);
        this.f637m = createCoroutineUnintercepted;
    }

    @Override // l.o, l.m0
    @NotNull
    public t.e<E, m0<E>> D() {
        return this;
    }

    @Override // l.o, l.m0
    public boolean G(@Nullable Throwable th) {
        boolean G = super.G(th);
        start();
        return G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t.e
    public <R> void S(@NotNull t.f<? super R> fVar, E e2, @NotNull Function2<? super m0<? super E>, ? super Continuation<? super R>, ? extends Object> function2) {
        start();
        super.D().S(fVar, e2, function2);
    }

    @Override // l.o, l.m0
    @NotNull
    public Object T(E e2) {
        start();
        return super.T(e2);
    }

    @Override // l.o, l.m0
    @Nullable
    public Object U(E e2, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        start();
        Object U = super.U(e2, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return U == coroutine_suspended ? U : Unit.INSTANCE;
    }

    @Override // j.v2
    public void b1() {
        r.a.c(this.f637m, this);
    }

    @Override // l.o, l.m0
    public boolean offer(E e2) {
        start();
        return super.offer(e2);
    }
}
