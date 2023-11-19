package q;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.h;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\"\u0010#J \u0010\u0006\u001a\u0004\u0018\u00018\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0014\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\u0018\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0010R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013R\u0014\u0010!\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0013¨\u0006$"}, d2 = {"Lq/h;", "N", "", "Lkotlin/Function0;", "", "onClosedAction", "k", "(Lkotlin/jvm/functions/Function0;)Lq/h;", "value", "", "m", "(Lq/h;)Z", "", "b", "()V", "j", "()Z", "l", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "()Lq/h;", "next", "i", "isTail", "f", "prev", "g", "removed", "e", "()Ljava/lang/Object;", "nextOrClosed", "c", "leftmostAliveNode", "h", "rightmostAliveNode", "<init>", "(Lq/h;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public abstract class h<N extends h<N>> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2015a = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_next");

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2016b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_prev");
    @NotNull
    private volatile /* synthetic */ Object _next = null;
    @NotNull
    private volatile /* synthetic */ Object _prev;

    public h(@Nullable N n2) {
        this._prev = n2;
    }

    public final void b() {
        f2016b.lazySet(this, null);
    }

    public final N c() {
        N f2 = f();
        while (f2 != null && f2.g()) {
            f2 = (N) f2._prev;
        }
        return f2;
    }

    @Nullable
    public final N d() {
        Object e2 = e();
        if (e2 == g.a()) {
            return null;
        }
        return (N) e2;
    }

    public final Object e() {
        return this._next;
    }

    @Nullable
    public final N f() {
        return (N) this._prev;
    }

    public abstract boolean g();

    public final N h() {
        do {
            this = this.d();
            Intrinsics.checkNotNull(this);
        } while (this.g());
        return this;
    }

    public final boolean i() {
        return d() == null;
    }

    public final boolean j() {
        return androidx.concurrent.futures.a.a(f2015a, this, null, g.a());
    }

    @Nullable
    public final N k(@NotNull Function0 function0) {
        Object e2 = e();
        if (e2 != g.a()) {
            return (N) e2;
        }
        function0.invoke();
        throw new KotlinNothingValueException();
    }

    public final void l() {
        while (true) {
            N c2 = c();
            N h2 = h();
            h2._prev = c2;
            if (c2 != null) {
                c2._next = h2;
            }
            if (!h2.g() && (c2 == null || !c2.g())) {
                return;
            }
        }
    }

    public final boolean m(@NotNull N n2) {
        return androidx.concurrent.futures.a.a(f2015a, this, null, n2);
    }
}
