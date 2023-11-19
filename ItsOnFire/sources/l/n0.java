package l;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.z0;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.r0;
import q.y;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0012\u001a\u00028\u0000\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0012\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Ll/n0;", "E", "Ll/l0;", "Lq/y$d;", "otherOp", "Lq/r0;", "j0", "", "g0", "Ll/w;", "closed", "i0", "", "toString", "m", "Ljava/lang/Object;", "h0", "()Ljava/lang/Object;", "pollResult", "Lj/q;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Lj/q;", "cont", "<init>", "(Ljava/lang/Object;Lj/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public class n0<E> extends l0 {

    /* renamed from: m  reason: collision with root package name */
    public final E f699m;
    @JvmField
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public final j.q<Unit> f700n;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(E e2, @NotNull j.q<? super Unit> qVar) {
        this.f699m = e2;
        this.f700n = qVar;
    }

    @Override // l.l0
    public void g0() {
        this.f700n.Z(j.s.f510d);
    }

    @Override // l.l0
    public E h0() {
        return this.f699m;
    }

    @Override // l.l0
    public void i0(@NotNull w<?> wVar) {
        j.q<Unit> qVar = this.f700n;
        Result.Companion companion = Result.Companion;
        qVar.resumeWith(Result.m3581constructorimpl(ResultKt.createFailure(wVar.o0())));
    }

    @Override // l.l0
    @Nullable
    public r0 j0(@Nullable y.d dVar) {
        if (this.f700n.f(Unit.INSTANCE, dVar != null ? dVar.f2082c : null) == null) {
            return null;
        }
        if (dVar != null) {
            dVar.d();
        }
        return j.s.f510d;
    }

    @Override // q.y
    @NotNull
    public String toString() {
        return z0.a(this) + '@' + z0.b(this) + '(' + h0() + ')';
    }
}
