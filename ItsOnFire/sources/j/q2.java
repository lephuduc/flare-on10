package j;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0003R\u001a\u0010\r\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00038PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0014"}, d2 = {"Lj/q2;", "Lj/v2;", "Lj/c0;", "", "complete", "", "exception", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "s1", "k", "Z", "C0", "()Z", "handlesException", "D0", "onCancelComplete", "Lj/n2;", "parent", "<init>", "(Lj/n2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@PublishedApi
/* loaded from: classes2.dex */
public class q2 extends v2 implements c0 {

    /* renamed from: k  reason: collision with root package name */
    public final boolean f499k;

    public q2(@Nullable n2 n2Var) {
        super(true);
        J0(n2Var);
        this.f499k = s1();
    }

    @Override // j.v2
    public boolean C0() {
        return this.f499k;
    }

    @Override // j.v2
    public boolean D0() {
        return true;
    }

    @Override // j.c0
    public boolean complete() {
        return R0(Unit.INSTANCE);
    }

    @Override // j.c0
    public boolean d(@NotNull Throwable th) {
        return R0(new e0(th, false, 2, null));
    }

    public final boolean s1() {
        v2 h0;
        w F0 = F0();
        x xVar = F0 instanceof x ? (x) F0 : null;
        if (xVar != null && (h0 = xVar.h0()) != null) {
            while (!h0.C0()) {
                w F02 = h0.F0();
                x xVar2 = F02 instanceof x ? (x) F02 : null;
                if (xVar2 != null) {
                    h0 = xVar2.h0();
                    if (h0 == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
