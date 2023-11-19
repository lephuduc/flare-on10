package j;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lj/x;", "Lj/p2;", "Lj/w;", "", "cause", "", "g0", "", "j", "Lj/y;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Lj/y;", "childJob", "Lj/n2;", "getParent", "()Lj/n2;", "parent", "<init>", "(Lj/y;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class x extends p2 implements w {
    @JvmField
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public final y f565n;

    public x(@NotNull y yVar) {
        this.f565n = yVar;
    }

    @Override // j.g0
    public void g0(@Nullable Throwable th) {
        this.f565n.m(h0());
    }

    @Override // j.w
    @NotNull
    public n2 getParent() {
        return h0();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        g0(th);
        return Unit.INSTANCE;
    }

    @Override // j.w
    public boolean j(@NotNull Throwable th) {
        return h0().p0(th);
    }
}
