package j;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lj/i;", "Lj/u1;", "Ljava/lang/Thread;", "o", "Ljava/lang/Thread;", "G", "()Ljava/lang/Thread;", "thread", "<init>", "(Ljava/lang/Thread;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class i extends u1 {
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public final Thread f447o;

    public i(@NotNull Thread thread) {
        this.f447o = thread;
    }

    @Override // j.v1
    @NotNull
    public Thread G() {
        return this.f447o;
    }
}
