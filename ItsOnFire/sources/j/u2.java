package j;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lj/u2;", "Lj/g0;", "Lj/p1;", "Lj/g2;", "", "dispose", "", "toString", "Lj/v2;", "m", "Lj/v2;", "h0", "()Lj/v2;", "i0", "(Lj/v2;)V", "job", "", "b", "()Z", "isActive", "Lj/a3;", "k", "()Lj/a3;", "list", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public abstract class u2 extends g0 implements p1, g2 {

    /* renamed from: m  reason: collision with root package name */
    public v2 f528m;

    @Override // j.g2
    public boolean b() {
        return true;
    }

    @Override // j.p1
    public void dispose() {
        h0().f1(this);
    }

    @NotNull
    public final v2 h0() {
        v2 v2Var = this.f528m;
        if (v2Var != null) {
            return v2Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    public final void i0(@NotNull v2 v2Var) {
        this.f528m = v2Var;
    }

    @Override // j.g2
    @Nullable
    public a3 k() {
        return null;
    }

    @Override // q.y
    @NotNull
    public String toString() {
        return z0.a(this) + '@' + z0.b(this) + "[job@" + z0.b(h0()) + ']';
    }
}
