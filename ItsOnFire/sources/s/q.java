package s;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u0004J\u0015\u0010\u001d\u001a\u00020\u0011*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0014\u0010%\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006*"}, d2 = {"Ls/q;", "", "Ls/k;", "h", "()Ls/k;", "task", "", "fair", "a", "(Ls/k;Z)Ls/k;", "victim", "", "l", "(Ls/q;)J", "k", "Ls/f;", "globalQueue", "", "g", "(Ls/f;)V", "c", "(Ls/k;)Ls/k;", "blockingOnly", "m", "(Ls/q;Z)J", "queue", "j", "(Ls/f;)Z", "i", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Ls/k;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "", "e", "()I", "bufferSize", "f", "size", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2152b = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "lastScheduledTask");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2153c = AtomicIntegerFieldUpdater.newUpdater(q.class, "producerIndex");

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2154d = AtomicIntegerFieldUpdater.newUpdater(q.class, "consumerIndex");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2155e = AtomicIntegerFieldUpdater.newUpdater(q.class, "blockingTasksInBuffer");
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray<k> f2156a = new AtomicReferenceArray<>(128);
    @NotNull
    private volatile /* synthetic */ Object lastScheduledTask = null;
    @NotNull
    private volatile /* synthetic */ int producerIndex = 0;
    @NotNull
    private volatile /* synthetic */ int consumerIndex = 0;
    @NotNull
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public static /* synthetic */ k b(q qVar, k kVar, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return qVar.a(kVar, z);
    }

    @Nullable
    public final k a(@NotNull k kVar, boolean z) {
        if (z) {
            return c(kVar);
        }
        k kVar2 = (k) f2152b.getAndSet(this, kVar);
        if (kVar2 == null) {
            return null;
        }
        return c(kVar2);
    }

    public final k c(k kVar) {
        if (kVar.f2138k.f() == 1) {
            f2155e.incrementAndGet(this);
        }
        if (e() == 127) {
            return kVar;
        }
        int i2 = this.producerIndex & r.f2159c;
        while (this.f2156a.get(i2) != null) {
            Thread.yield();
        }
        this.f2156a.lazySet(i2, kVar);
        f2153c.incrementAndGet(this);
        return null;
    }

    public final void d(k kVar) {
        if (kVar != null) {
            if (kVar.f2138k.f() == 1) {
                f2155e.decrementAndGet(this);
            }
        }
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        Object obj = this.lastScheduledTask;
        int e2 = e();
        return obj != null ? e2 + 1 : e2;
    }

    public final void g(@NotNull f fVar) {
        k kVar = (k) f2152b.getAndSet(this, null);
        if (kVar != null) {
            fVar.a(kVar);
        }
        do {
        } while (j(fVar));
    }

    @Nullable
    public final k h() {
        k kVar = (k) f2152b.getAndSet(this, null);
        return kVar == null ? i() : kVar;
    }

    public final k i() {
        k andSet;
        while (true) {
            int i2 = this.consumerIndex;
            if (i2 - this.producerIndex == 0) {
                return null;
            }
            int i3 = i2 & r.f2159c;
            if (f2154d.compareAndSet(this, i2, i2 + 1) && (andSet = this.f2156a.getAndSet(i3, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    public final boolean j(f fVar) {
        k i2 = i();
        if (i2 == null) {
            return false;
        }
        fVar.a(i2);
        return true;
    }

    public final long k(@NotNull q qVar) {
        int i2 = qVar.consumerIndex;
        int i3 = qVar.producerIndex;
        AtomicReferenceArray<k> atomicReferenceArray = qVar.f2156a;
        while (true) {
            if (i2 == i3) {
                break;
            }
            int i4 = i2 & r.f2159c;
            if (qVar.blockingTasksInBuffer == 0) {
                break;
            }
            k kVar = atomicReferenceArray.get(i4);
            if (kVar != null) {
                if ((kVar.f2138k.f() == 1) && n.b.a(atomicReferenceArray, i4, kVar, null)) {
                    f2155e.decrementAndGet(qVar);
                    b(this, kVar, false, 2, null);
                    return -1L;
                }
            }
            i2++;
        }
        return m(qVar, true);
    }

    public final long l(@NotNull q qVar) {
        k i2 = qVar.i();
        if (i2 != null) {
            b(this, i2, false, 2, null);
            return -1L;
        }
        return m(qVar, false);
    }

    public final long m(q qVar, boolean z) {
        k kVar;
        do {
            kVar = (k) qVar.lastScheduledTask;
            if (kVar == null) {
                return -2L;
            }
            if (z) {
                if (!(kVar.f2138k.f() == 1)) {
                    return -2L;
                }
            }
            long a2 = o.f2146f.a() - kVar.f2137j;
            long j2 = o.f2142b;
            if (a2 < j2) {
                return j2 - a2;
            }
        } while (!androidx.concurrent.futures.a.a(f2152b, qVar, kVar, null));
        b(this, kVar, false, 2, null);
        return -1L;
    }
}
