package l;

import j.z0;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.r0;
import q.y;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0010\u001a\u00020\b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006#"}, d2 = {"Ll/w;", "E", "Ll/l0;", "Ll/j0;", "Lq/y$d;", "otherOp", "Lq/r0;", "j0", "", "g0", "value", "c", "(Ljava/lang/Object;Lq/y$d;)Lq/r0;", "q", "(Ljava/lang/Object;)V", "closed", "i0", "", "toString", "", "m", "Ljava/lang/Throwable;", "closeCause", "o0", "()Ljava/lang/Throwable;", "sendException", "n0", "receiveException", "l0", "()Ll/w;", "offerResult", "m0", "pollResult", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class w<E> extends l0 implements j0<E> {
    @JvmField
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public final Throwable f943m;

    public w(@Nullable Throwable th) {
        this.f943m = th;
    }

    @Override // l.j0
    @NotNull
    public r0 c(E e2, @Nullable y.d dVar) {
        r0 r0Var = j.s.f510d;
        if (dVar != null) {
            dVar.d();
        }
        return r0Var;
    }

    @Override // l.l0
    public void g0() {
    }

    @Override // l.l0
    public void i0(@NotNull w<?> wVar) {
    }

    @Override // l.l0
    @NotNull
    public r0 j0(@Nullable y.d dVar) {
        r0 r0Var = j.s.f510d;
        if (dVar != null) {
            dVar.d();
        }
        return r0Var;
    }

    @Override // l.j0
    @NotNull
    /* renamed from: l0 */
    public w<E> h() {
        return this;
    }

    @Override // l.l0
    @NotNull
    /* renamed from: m0 */
    public w<E> h0() {
        return this;
    }

    @NotNull
    public final Throwable n0() {
        Throwable th = this.f943m;
        return th == null ? new x(s.f728a) : th;
    }

    @NotNull
    public final Throwable o0() {
        Throwable th = this.f943m;
        return th == null ? new y(s.f728a) : th;
    }

    @Override // l.j0
    public void q(E e2) {
    }

    @Override // q.y
    @NotNull
    public String toString() {
        return "Closed@" + z0.b(this) + '[' + this.f943m + ']';
    }
}
