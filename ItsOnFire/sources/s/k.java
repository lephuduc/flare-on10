package s;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b \u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0012\u0010\u000e\u001a\u00020\u000b8Æ\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Ls/k;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "j", "J", "submissionTime", "Ls/l;", "k", "Ls/l;", "taskContext", "", "c", "()I", "mode", "<init>", "(JLs/l;)V", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public abstract class k implements Runnable {
    @JvmField

    /* renamed from: j  reason: collision with root package name */
    public long f2137j;
    @JvmField
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public l f2138k;

    public k() {
        this(0L, o.f2149i);
    }

    public k(long j2, @NotNull l lVar) {
        this.f2137j = j2;
        this.f2138k = lVar;
    }

    public final int c() {
        return this.f2138k.f();
    }
}
