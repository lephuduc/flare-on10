package l;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.d1;
import q.r0;

@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u001f\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001dj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Ll/d0;", "E", "Ll/a;", "element", "", "H", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lt/f;", "select", "I", "(Ljava/lang/Object;Lt/f;)Ljava/lang/Object;", "Lq/q;", "Ll/l0;", "list", "Ll/w;", "closed", "", "i0", "(Ljava/lang/Object;Ll/w;)V", "", "e0", "()Z", "isBufferAlwaysEmpty", "f0", "isBufferEmpty", "B", "isBufferAlwaysFull", "C", "isBufferFull", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public class d0<E> extends a<E> {
    public d0(@Nullable Function1<? super E, Unit> function1) {
        super(function1);
    }

    @Override // l.c
    public final boolean B() {
        return false;
    }

    @Override // l.c
    public final boolean C() {
        return false;
    }

    @Override // l.c
    @NotNull
    public Object H(E e2) {
        j0<?> M;
        do {
            Object H = super.H(e2);
            r0 r0Var = b.f632d;
            if (H == r0Var) {
                return r0Var;
            }
            if (H != b.f633e) {
                if (H instanceof w) {
                    return H;
                }
                throw new IllegalStateException(("Invalid offerInternal result " + H).toString());
            }
            M = M(e2);
            if (M == null) {
                return r0Var;
            }
        } while (!(M instanceof w));
        return M;
    }

    @Override // l.c
    @NotNull
    public Object I(E e2, @NotNull t.f<?> fVar) {
        Object r2;
        while (true) {
            if (d0()) {
                r2 = super.I(e2, fVar);
            } else {
                r2 = fVar.r(h(e2));
                if (r2 == null) {
                    r2 = b.f632d;
                }
            }
            if (r2 == t.g.d()) {
                return t.g.d();
            }
            r0 r0Var = b.f632d;
            if (r2 == r0Var) {
                return r0Var;
            }
            if (r2 != b.f633e && r2 != q.c.f1994b) {
                if (r2 instanceof w) {
                    return r2;
                }
                throw new IllegalStateException(("Invalid result " + r2).toString());
            }
        }
    }

    @Override // l.a
    public final boolean e0() {
        return true;
    }

    @Override // l.a
    public final boolean f0() {
        return true;
    }

    @Override // l.a
    public void i0(@NotNull Object obj, @NotNull w<?> wVar) {
        d1 d1Var = null;
        if (obj != null) {
            if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                d1 d1Var2 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    l0 l0Var = (l0) arrayList.get(size);
                    if (l0Var instanceof c.a) {
                        Function1<E, Unit> function1 = this.f639j;
                        d1Var2 = function1 != null ? q.i0.c(function1, ((c.a) l0Var).f641m, d1Var2) : null;
                    } else {
                        l0Var.i0(wVar);
                    }
                }
                d1Var = d1Var2;
            } else {
                l0 l0Var2 = (l0) obj;
                if (l0Var2 instanceof c.a) {
                    Function1<E, Unit> function12 = this.f639j;
                    if (function12 != null) {
                        d1Var = q.i0.c(function12, ((c.a) l0Var2).f641m, null);
                    }
                } else {
                    l0Var2.i0(wVar);
                }
            }
        }
        if (d1Var != null) {
            throw d1Var;
        }
    }
}
