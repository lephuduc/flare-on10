package o;

import j.n2;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096Aø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lo/f0;", "T", "Lo/i0;", "Lo/c;", "Lp/r;", "Lo/j;", "collector", "", "collect", "(Lo/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Ll/m;", "onBufferOverflow", "Lo/i;", "b", "Lj/n2;", "j", "Lj/n2;", "job", "", "a", "()Ljava/util/List;", "replayCache", "flow", "<init>", "(Lo/i0;Lj/n2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class f0<T> implements i0<T>, c<T>, p.r<T> {
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final n2 f1286j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ i0<T> f1287k;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(@NotNull i0<? extends T> i0Var, @Nullable n2 n2Var) {
        this.f1286j = n2Var;
        this.f1287k = i0Var;
    }

    @Override // o.i0
    @NotNull
    public List<T> a() {
        return this.f1287k.a();
    }

    @Override // p.r
    @NotNull
    public i<T> b(@NotNull CoroutineContext coroutineContext, int i2, @NotNull l.m mVar) {
        return k0.e(this, coroutineContext, i2, mVar);
    }

    @Override // o.i0, o.i
    @Nullable
    public Object collect(@NotNull j<? super T> jVar, @NotNull Continuation<?> continuation) {
        return this.f1287k.collect(jVar, continuation);
    }
}
