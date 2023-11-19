package s;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.z1;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019\u0012\b\b\u0002\u0010!\u001a\u00020\u0012\u0012\b\b\u0002\u0010%\u001a\u00020\"¢\u0006\u0004\b-\u0010.J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u001c\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016J+\u0010\r\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0007H\u0016J\u000f\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0016\u0010\u0011J\b\u0010\u0018\u001a\u00020\u0017H\u0002R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010!\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Ls/i;", "Lj/z1;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatch", "dispatchYield", "Ls/l;", "", "tailDispatch", "t", "(Ljava/lang/Runnable;Ls/l;Z)V", "close", "y", "()V", "", "timeout", "w", "(J)V", "v", "Ls/a;", "s", "", "k", "I", "corePoolSize", "l", "maxPoolSize", "m", "J", "idleWorkerKeepAliveNs", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Ljava/lang/String;", "schedulerName", "o", "Ls/a;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "q", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(IIJLjava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public class i extends z1 {

    /* renamed from: k  reason: collision with root package name */
    public final int f2132k;

    /* renamed from: l  reason: collision with root package name */
    public final int f2133l;

    /* renamed from: m  reason: collision with root package name */
    public final long f2134m;
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public final String f2135n;
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public a f2136o;

    public i() {
        this(0, 0, 0L, null, 15, null);
    }

    public i(int i2, int i3, long j2, @NotNull String str) {
        this.f2132k = i2;
        this.f2133l = i3;
        this.f2134m = j2;
        this.f2135n = str;
        this.f2136o = s();
    }

    public /* synthetic */ i(int i2, int i3, long j2, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? o.f2143c : i2, (i4 & 2) != 0 ? o.f2144d : i3, (i4 & 4) != 0 ? o.f2145e : j2, (i4 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    @Override // j.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2136o.close();
    }

    @Override // j.o0
    public void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        a.k(this.f2136o, runnable, null, false, 6, null);
    }

    @Override // j.o0
    public void dispatchYield(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        a.k(this.f2136o, runnable, null, true, 2, null);
    }

    @Override // j.z1
    @NotNull
    public Executor q() {
        return this.f2136o;
    }

    public final a s() {
        return new a(this.f2132k, this.f2133l, this.f2134m, this.f2135n);
    }

    public final void t(@NotNull Runnable runnable, @NotNull l lVar, boolean z) {
        this.f2136o.j(runnable, lVar, z);
    }

    public final void v() {
        y();
    }

    public final synchronized void w(long j2) {
        this.f2136o.v(j2);
    }

    public final synchronized void y() {
        this.f2136o.v(1000L);
        this.f2136o = s();
    }
}
