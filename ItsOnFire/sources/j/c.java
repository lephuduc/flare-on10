package j;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\t\u0010\u0001\u001a\u00020\u0000H\u0081\b\u001a\t\u0010\u0002\u001a\u00020\u0000H\u0081\b\u001a\u0019\u0010\u0006\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0081\b\u001a\t\u0010\b\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\t\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\n\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\u000b\u001a\u00020\u0007H\u0081\b\u001a\u0019\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0000H\u0081\b\u001a\u0011\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0081\b\"$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0001\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"", "a", "c", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "k", "", "g", "h", "e", "j", "", "blocker", "nanos", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "Ljava/lang/Thread;", "thread", "i", "Lj/b;", "Lj/b;", "b", "()Lj/b;", "f", "(Lj/b;)V", "timeSource", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class c {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public static b f406a;

    @InlineOnly
    public static final long a() {
        b b2 = b();
        return b2 != null ? b2.a() : System.currentTimeMillis();
    }

    @Nullable
    public static final b b() {
        return f406a;
    }

    @InlineOnly
    public static final long c() {
        b b2 = b();
        return b2 != null ? b2.b() : System.nanoTime();
    }

    @InlineOnly
    public static final void d(Object obj, long j2) {
        Unit unit;
        b b2 = b();
        if (b2 != null) {
            b2.c(obj, j2);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            LockSupport.parkNanos(obj, j2);
        }
    }

    @InlineOnly
    public static final void e() {
        b b2 = b();
        if (b2 != null) {
            b2.d();
        }
    }

    public static final void f(@Nullable b bVar) {
        f406a = bVar;
    }

    @InlineOnly
    public static final void g() {
        b b2 = b();
        if (b2 != null) {
            b2.e();
        }
    }

    @InlineOnly
    public static final void h() {
        b b2 = b();
        if (b2 != null) {
            b2.f();
        }
    }

    @InlineOnly
    public static final void i(Thread thread) {
        Unit unit;
        b b2 = b();
        if (b2 != null) {
            b2.g(thread);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            LockSupport.unpark(thread);
        }
    }

    @InlineOnly
    public static final void j() {
        b b2 = b();
        if (b2 != null) {
            b2.h();
        }
    }

    @InlineOnly
    public static final Runnable k(Runnable runnable) {
        Runnable i2;
        b b2 = b();
        return (b2 == null || (i2 = b2.i(runnable)) == null) ? runnable : i2;
    }
}
