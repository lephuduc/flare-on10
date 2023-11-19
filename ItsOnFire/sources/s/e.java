package s;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.a1;
import j.o0;
import j.z1;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0011\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\u0006\u0010\u001d\u001a\u00020\r\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\b\b\u0002\u0010$\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-B'\b\u0016\u0012\b\b\u0002\u0010\u001b\u001a\u00020\r\u0012\b\b\u0002\u0010\u001d\u001a\u00020\r\u0012\b\b\u0002\u0010$\u001a\u00020\u000b¢\u0006\u0004\b,\u0010.B\u001d\b\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\r\u0012\b\b\u0002\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b,\u0010/J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001c\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rJ+\u0010\u0015\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0002R\u0014\u0010\u001b\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00060"}, d2 = {"Ls/e;", "Lj/z1;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatch", "dispatchYield", "close", "", "toString", "", "parallelism", "Lj/o0;", "s", "y", "Ls/l;", "", "tailDispatch", "w", "(Ljava/lang/Runnable;Ls/l;Z)V", "Ls/a;", "v", "k", "I", "corePoolSize", "l", "maxPoolSize", "", "m", "J", "idleWorkerKeepAliveNs", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Ljava/lang/String;", "schedulerName", "o", "Ls/a;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "q", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(IIJLjava/lang/String;)V", "(IILjava/lang/String;)V", "(II)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@PublishedApi
/* loaded from: classes2.dex */
public class e extends z1 {

    /* renamed from: k  reason: collision with root package name */
    public final int f2120k;

    /* renamed from: l  reason: collision with root package name */
    public final int f2121l;

    /* renamed from: m  reason: collision with root package name */
    public final long f2122m;
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public final String f2123n;
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public a f2124o;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility for Ktor 1.0-beta")
    public /* synthetic */ e(int i2, int i3) {
        this(i2, i3, o.f2145e, null, 8, null);
    }

    public /* synthetic */ e(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? o.f2143c : i2, (i4 & 2) != 0 ? o.f2144d : i3);
    }

    public e(int i2, int i3, long j2, @NotNull String str) {
        this.f2120k = i2;
        this.f2121l = i3;
        this.f2122m = j2;
        this.f2123n = str;
        this.f2124o = v();
    }

    public /* synthetic */ e(int i2, int i3, long j2, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, j2, (i4 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public e(int i2, int i3, @NotNull String str) {
        this(i2, i3, o.f2145e, str);
    }

    public /* synthetic */ e(int i2, int i3, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? o.f2143c : i2, (i4 & 2) != 0 ? o.f2144d : i3, (i4 & 4) != 0 ? o.f2141a : str);
    }

    public static /* synthetic */ o0 t(e eVar, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i2 = 16;
            }
            return eVar.s(i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: blocking");
    }

    @Override // j.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2124o.close();
    }

    @Override // j.o0
    public void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        try {
            a.k(this.f2124o, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            a1.f387o.dispatch(coroutineContext, runnable);
        }
    }

    @Override // j.o0
    public void dispatchYield(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        try {
            a.k(this.f2124o, runnable, null, true, 2, null);
        } catch (RejectedExecutionException unused) {
            a1.f387o.dispatchYield(coroutineContext, runnable);
        }
    }

    @Override // j.z1
    @NotNull
    public Executor q() {
        return this.f2124o;
    }

    @NotNull
    public final o0 s(int i2) {
        if (i2 > 0) {
            return new g(this, i2, null, 1);
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i2).toString());
    }

    @Override // j.o0
    @NotNull
    public String toString() {
        return super.toString() + "[scheduler = " + this.f2124o + ']';
    }

    public final a v() {
        return new a(this.f2120k, this.f2121l, this.f2122m, this.f2123n);
    }

    public final void w(@NotNull Runnable runnable, @NotNull l lVar, boolean z) {
        try {
            this.f2124o.j(runnable, lVar, z);
        } catch (RejectedExecutionException unused) {
            a1.f387o.T(this.f2124o.e(runnable, lVar));
        }
    }

    @NotNull
    public final o0 y(int i2) {
        if (!(i2 > 0)) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but have " + i2).toString());
        }
        if (i2 <= this.f2120k) {
            return new g(this, i2, null, 0);
        }
        throw new IllegalArgumentException(("Expected parallelism level lesser than core pool size (" + this.f2120k + "), but have " + i2).toString());
    }
}
