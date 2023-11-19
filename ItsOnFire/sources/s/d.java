package s;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Ls/d;", "Ls/i;", "", "z", "()V", "close", "", "toString", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class d extends i {
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    public static final d f2119p = new d();

    public d() {
        super(o.f2143c, o.f2144d, o.f2145e, o.f2141a);
    }

    @Override // s.i, j.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // j.o0
    @NotNull
    public String toString() {
        return "Dispatchers.Default";
    }

    public final void z() {
        super.close();
    }
}
