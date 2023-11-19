package j;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0005R\u0014\u0010\n\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lj/z2;", "Lj/o0;", "", "toString", "", "parallelism", "limitedParallelism", "s", "q", "()Lj/z2;", "immediate", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public abstract class z2 extends o0 {
    @Override // j.o0
    @NotNull
    public o0 limitedParallelism(int i2) {
        q.t.a(i2);
        return this;
    }

    @NotNull
    public abstract z2 q();

    @i2
    @Nullable
    public final String s() {
        z2 z2Var;
        z2 e2 = m1.e();
        if (this == e2) {
            return "Dispatchers.Main";
        }
        try {
            z2Var = e2.q();
        } catch (UnsupportedOperationException unused) {
            z2Var = null;
        }
        if (this == z2Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // j.o0
    @NotNull
    public String toString() {
        String s2 = s();
        if (s2 == null) {
            return z0.a(this) + '@' + z0.b(this);
        }
        return s2;
    }
}
