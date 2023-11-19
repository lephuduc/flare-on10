package j;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0011\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJJ\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0001\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u001c\u001a\u00020\u00148PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lj/a0;", "T", "Lj/v2;", "Lj/z;", "Lt/d;", "g", "()Ljava/lang/Object;", "x", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "Lt/f;", "select", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "", "L", "(Lt/f;Lkotlin/jvm/functions/Function2;)V", "value", "", "P", "(Ljava/lang/Object;)Z", "", "exception", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "D0", "()Z", "onCancelComplete", "j", "()Lt/d;", "onAwait", "Lj/n2;", "parent", "<init>", "(Lj/n2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class a0<T> extends v2 implements z<T>, t.d<T> {
    public a0(@Nullable n2 n2Var) {
        super(true);
        J0(n2Var);
    }

    @Override // j.v2
    public boolean D0() {
        return true;
    }

    @Override // t.d
    public <R> void L(@NotNull t.f<? super R> fVar, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        e1(fVar, function2);
    }

    @Override // j.z
    public boolean P(T t2) {
        return R0(t2);
    }

    @Override // j.z
    public boolean d(@NotNull Throwable th) {
        return R0(new e0(th, false, 2, null));
    }

    @Override // j.c1
    public T g() {
        return (T) x0();
    }

    @Override // j.c1
    @NotNull
    public t.d<T> j() {
        return this;
    }

    @Override // j.c1
    @Nullable
    public Object x(@NotNull Continuation<? super T> continuation) {
        Object h0 = h0(continuation);
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return h0;
    }
}
