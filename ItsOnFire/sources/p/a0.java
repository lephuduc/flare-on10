package p;

import kotlin.Metadata;
import o.j0;
import o.t0;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lp/a0;", "Lo/t0;", "", "Lo/j0;", "delta", "", "f0", "e0", "()Ljava/lang/Integer;", "value", "initialValue", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class a0 extends j0<Integer> implements t0<Integer> {
    public a0(int i2) {
        super(1, Integer.MAX_VALUE, l.m.DROP_OLDEST);
        g(Integer.valueOf(i2));
    }

    @Override // o.t0
    @NotNull
    /* renamed from: e0 */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(Q().intValue());
        }
        return valueOf;
    }

    public final boolean f0(int i2) {
        boolean g2;
        synchronized (this) {
            g2 = g(Integer.valueOf(Q().intValue() + i2));
        }
        return g2;
    }
}
