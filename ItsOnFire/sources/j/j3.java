package j;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lj/j3;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "run", "Lj/o0;", "j", "Lj/o0;", "dispatcher", "Lj/q;", "k", "Lj/q;", "continuation", "<init>", "(Lj/o0;Lj/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class j3 implements Runnable {
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public final o0 f458j;
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public final q<Unit> f459k;

    /* JADX WARN: Multi-variable type inference failed */
    public j3(@NotNull o0 o0Var, @NotNull q<? super Unit> qVar) {
        this.f458j = o0Var;
        this.f459k = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f459k.t(this.f458j, Unit.INSTANCE);
    }
}
