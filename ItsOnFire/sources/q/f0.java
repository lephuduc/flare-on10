package q;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.i2;
import j.z2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\t\u001a\u001a\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0003H\u0007\u001a \u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u001a\b\u0010\u000e\u001a\u00020\rH\u0000\"\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000f\"\u001a\u0010\u0015\u001a\u00020\u00058\u0002X\u0082D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lq/d0;", "", "factories", "Lj/z2;", "f", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "", "cause", "", "errorHint", "Lq/g0;", "a", "", "e", "Ljava/lang/String;", "FAST_SERVICE_LOADER_PROPERTY_NAME", "b", "Z", "getSUPPORT_MISSING$annotations", "()V", "SUPPORT_MISSING", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class f0 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final String f2009a = "kotlinx.coroutines.fast.service.loader";

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f2010b = true;

    public static final g0 a(Throwable th, String str) {
        if (f2010b) {
            return new g0(th, str);
        }
        if (th != null) {
            throw th;
        }
        e();
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ g0 b(Throwable th, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            th = null;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static /* synthetic */ void c() {
    }

    @i2
    public static final boolean d(@NotNull z2 z2Var) {
        return z2Var.q() instanceof g0;
    }

    @NotNull
    public static final Void e() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @i2
    @NotNull
    public static final z2 f(@NotNull d0 d0Var, @NotNull List<? extends d0> list) {
        try {
            return d0Var.b(list);
        } catch (Throwable th) {
            return a(th, d0Var.a());
        }
    }
}
