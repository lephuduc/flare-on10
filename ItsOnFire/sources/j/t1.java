package j;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007J\u0010\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0002R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b#\u0010\u001eR\u0011\u0010&\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b%\u0010\u001eR\u0011\u0010(\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b'\u0010\u001e¨\u0006+"}, d2 = {"Lj/t1;", "Lj/o0;", "", "D", "", "E", "F", "Lj/j1;", "task", "", "v", "unconfined", "y", "q", "", "parallelism", "limitedParallelism", "shutdown", "t", "j", "J", "useCount", "k", "Z", "shared", "Lq/a;", "l", "Lq/a;", "unconfinedQueue", "A", "()Z", "isEmpty", "w", "()J", "nextTime", "b", "isActive", "B", "isUnconfinedLoopActive", "C", "isUnconfinedQueueEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public abstract class t1 extends o0 {

    /* renamed from: j  reason: collision with root package name */
    public long f516j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f517k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public q.a<j1<?>> f518l;

    public static /* synthetic */ void s(t1 t1Var, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i2 & 1) != 0) {
            z = false;
        }
        t1Var.q(z);
    }

    public static /* synthetic */ void z(t1 t1Var, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i2 & 1) != 0) {
            z = false;
        }
        t1Var.y(z);
    }

    public boolean A() {
        return C();
    }

    public final boolean B() {
        return this.f516j >= t(true);
    }

    public final boolean C() {
        q.a<j1<?>> aVar = this.f518l;
        if (aVar != null) {
            return aVar.d();
        }
        return true;
    }

    public long D() {
        return !E() ? Long.MAX_VALUE : 0L;
    }

    public final boolean E() {
        j1<?> e2;
        q.a<j1<?>> aVar = this.f518l;
        if (aVar == null || (e2 = aVar.e()) == null) {
            return false;
        }
        e2.run();
        return true;
    }

    public boolean F() {
        return false;
    }

    public final boolean b() {
        return this.f516j > 0;
    }

    @Override // j.o0
    @NotNull
    public final o0 limitedParallelism(int i2) {
        q.t.a(i2);
        return this;
    }

    public final void q(boolean z) {
        long t2 = this.f516j - t(z);
        this.f516j = t2;
        if (t2 <= 0 && this.f517k) {
            shutdown();
        }
    }

    public void shutdown() {
    }

    public final long t(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public final void v(@NotNull j1<?> j1Var) {
        q.a<j1<?>> aVar = this.f518l;
        if (aVar == null) {
            aVar = new q.a<>();
            this.f518l = aVar;
        }
        aVar.a(j1Var);
    }

    public long w() {
        q.a<j1<?>> aVar = this.f518l;
        return (aVar == null || aVar.d()) ? Long.MAX_VALUE : 0L;
    }

    public final void y(boolean z) {
        this.f516j += t(z);
        if (z) {
            return;
        }
        this.f517k = true;
    }
}
