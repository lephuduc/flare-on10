package u;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.o0;
import q.r0;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\t\u0010\nJ,\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lu/i;", "Lq/o0;", "", FirebaseAnalytics.Param.INDEX, "", "u", "(I)Ljava/lang/Object;", "value", "", "w", "(ILjava/lang/Object;)V", "expected", "", "t", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "v", "(ILjava/lang/Object;)Ljava/lang/Object;", "s", "(I)V", "", "toString", "()Ljava/lang/String;", "p", "()I", "maxSlots", "", "id", "prev", "pointers", "<init>", "(JLu/i;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class i extends o0<i> {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public /* synthetic */ AtomicReferenceArray f2249e;

    public i(long j2, @Nullable i iVar, int i2) {
        super(j2, iVar, i2);
        int i3;
        i3 = h.f2244f;
        this.f2249e = new AtomicReferenceArray(i3);
    }

    @Override // q.o0
    public int p() {
        int i2;
        i2 = h.f2244f;
        return i2;
    }

    public final void s(int i2) {
        r0 r0Var;
        r0Var = h.f2243e;
        this.f2249e.set(i2, r0Var);
        q();
    }

    public final boolean t(int i2, @Nullable Object obj, @Nullable Object obj2) {
        return n.b.a(this.f2249e, i2, obj, obj2);
    }

    @NotNull
    public String toString() {
        return "SemaphoreSegment[id=" + o() + ", hashCode=" + hashCode() + ']';
    }

    @Nullable
    public final Object u(int i2) {
        return this.f2249e.get(i2);
    }

    @Nullable
    public final Object v(int i2, @Nullable Object obj) {
        return this.f2249e.getAndSet(i2, obj);
    }

    public final void w(int i2, @Nullable Object obj) {
        this.f2249e.set(i2, obj);
    }
}
