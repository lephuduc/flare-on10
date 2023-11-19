package j;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001b\b\u0000\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\rJ\b\u0010\u0004\u001a\u00020\u0000H\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lj/y3;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lj/m0;", "b", "Lj/n2;", "j", "Lj/n2;", "coroutine", "", "message", "<init>", "(Ljava/lang/String;Lj/n2;)V", "(Ljava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class y3 extends CancellationException implements m0<y3> {
    @JvmField
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final transient n2 f589j;

    public y3(@NotNull String str) {
        this(str, null);
    }

    public y3(@NotNull String str, @Nullable n2 n2Var) {
        super(str);
        this.f589j = n2Var;
    }

    @Override // j.m0
    @NotNull
    /* renamed from: b */
    public y3 a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        y3 y3Var = new y3(message, this.f589j);
        y3Var.initCause(this);
        return y3Var;
    }
}
