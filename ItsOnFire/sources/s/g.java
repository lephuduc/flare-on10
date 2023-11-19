package s;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.z1;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010(\u001a\u00020\u001e¢\u0006\u0004\b0\u00101J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000e\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000e\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u000bJ#\u0010\u0018\u001a\u00020\u00072\n\u0010\u000e\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u001e\u0010,\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Ls/g;", "Lj/z1;", "Ls/l;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "close", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "block", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "", "toString", "()Ljava/lang/String;", "c", "", "tailDispatch", "s", "(Ljava/lang/Runnable;Z)V", "Ls/e;", "k", "Ls/e;", "dispatcher", "", "l", "I", "parallelism", "m", "Ljava/lang/String;", "name", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "f", "()I", "taskMode", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "o", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "queue", "q", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ls/e;ILjava/lang/String;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class g extends z1 implements l, Executor {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2125p = AtomicIntegerFieldUpdater.newUpdater(g.class, "inFlightTasks");
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public final e f2126k;

    /* renamed from: l  reason: collision with root package name */
    public final int f2127l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public final String f2128m;

    /* renamed from: n  reason: collision with root package name */
    public final int f2129n;
    @NotNull

    /* renamed from: o  reason: collision with root package name */
    public final ConcurrentLinkedQueue<Runnable> f2130o = new ConcurrentLinkedQueue<>();
    @NotNull
    private volatile /* synthetic */ int inFlightTasks = 0;

    public g(@NotNull e eVar, int i2, @Nullable String str, int i3) {
        this.f2126k = eVar;
        this.f2127l = i2;
        this.f2128m = str;
        this.f2129n = i3;
    }

    @Override // s.l
    public void c() {
        Runnable poll = this.f2130o.poll();
        if (poll != null) {
            this.f2126k.w(poll, this, true);
            return;
        }
        f2125p.decrementAndGet(this);
        Runnable poll2 = this.f2130o.poll();
        if (poll2 == null) {
            return;
        }
        s(poll2, true);
    }

    @Override // j.z1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // j.o0
    public void dispatch(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        s(runnable, false);
    }

    @Override // j.o0
    public void dispatchYield(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        s(runnable, true);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        s(runnable, false);
    }

    @Override // s.l
    public int f() {
        return this.f2129n;
    }

    @Override // j.z1
    @NotNull
    public Executor q() {
        return this;
    }

    public final void s(Runnable runnable, boolean z) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2125p;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f2127l) {
                this.f2126k.w(runnable, this, z);
                return;
            }
            this.f2130o.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f2127l) {
                return;
            }
            runnable = this.f2130o.poll();
        } while (runnable != null);
    }

    @Override // j.o0
    @NotNull
    public String toString() {
        String str = this.f2128m;
        if (str == null) {
            return super.toString() + "[dispatcher = " + this.f2126k + ']';
        }
        return str;
    }
}
