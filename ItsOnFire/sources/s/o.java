package s;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import q.t0;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0016\u0010\u0013\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\n\"\u0014\u0010\u0017\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\n\"\u0014\u0010\u001b\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a\"\u0019\u0010!\u001a\u00020\u001f*\u00020\u001e8À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010 ¨\u0006\""}, d2 = {"", "a", "Ljava/lang/String;", "DEFAULT_SCHEDULER_NAME", "", "b", "J", "WORK_STEALING_TIME_RESOLUTION_NS", "", "c", "I", "CORE_POOL_SIZE", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "MAX_POOL_SIZE", "e", "IDLE_WORKER_KEEP_ALIVE_NS", "Ls/j;", "f", "Ls/j;", "schedulerTimeSource", "g", "TASK_NON_BLOCKING", "h", "TASK_PROBABLY_BLOCKING", "Ls/l;", "i", "Ls/l;", "NonBlockingContext", "j", "BlockingContext", "Ls/k;", "", "(Ls/k;)Z", "isBlocking", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class o {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final String f2141a = "DefaultDispatcher";

    /* renamed from: g  reason: collision with root package name */
    public static final int f2147g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static final int f2148h = 1;
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public static final long f2142b = t0.g("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);
    @JvmField

    /* renamed from: c  reason: collision with root package name */
    public static final int f2143c = t0.f("kotlinx.coroutines.scheduler.core.pool.size", RangesKt.coerceAtLeast(t0.a(), 2), 1, 0, 8, null);
    @JvmField

    /* renamed from: d  reason: collision with root package name */
    public static final int f2144d = t0.f("kotlinx.coroutines.scheduler.max.pool.size", a.E, 0, a.E, 4, null);
    @JvmField

    /* renamed from: e  reason: collision with root package name */
    public static final long f2145e = TimeUnit.SECONDS.toNanos(t0.g("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));
    @JvmField
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public static j f2146f = h.f2131a;
    @JvmField
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    public static final l f2149i = new m(0);
    @JvmField
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public static final l f2150j = new m(1);

    public static final boolean a(@NotNull k kVar) {
        return kVar.f2138k.f() == 1;
    }
}
