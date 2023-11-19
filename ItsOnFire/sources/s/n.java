package s;

import j.z0;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Ls/n;", "Ls/k;", "", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "l", "Ljava/lang/Runnable;", "block", "", "submissionTime", "Ls/l;", "taskContext", "<init>", "(Ljava/lang/Runnable;JLs/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class n extends k {
    @JvmField
    @NotNull

    /* renamed from: l  reason: collision with root package name */
    public final Runnable f2140l;

    public n(@NotNull Runnable runnable, long j2, @NotNull l lVar) {
        super(j2, lVar);
        this.f2140l = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f2140l.run();
        } finally {
            this.f2138k.c();
        }
    }

    @NotNull
    public String toString() {
        return "Task[" + z0.a(this.f2140l) + '@' + z0.b(this.f2140l) + ", " + this.f2137j + ", " + this.f2138k + ']';
    }
}
