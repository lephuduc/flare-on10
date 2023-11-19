package l;

import j.r0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import l.m0;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014R\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Ll/f0;", "E", "Ll/o;", "Ll/g0;", "", "value", "y1", "(Lkotlin/Unit;)V", "", "cause", "", "handled", "u1", "b", "()Z", "isActive", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Ll/n;", "channel", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ll/n;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class f0<E> extends o<E> implements g0<E> {
    public f0(@NotNull CoroutineContext coroutineContext, @NotNull n<E> nVar) {
        super(coroutineContext, nVar, true, true);
    }

    @Override // j.a, j.v2, j.n2
    public boolean b() {
        return super.b();
    }

    @Override // l.o, l.g0
    public /* bridge */ /* synthetic */ m0 c() {
        return c();
    }

    @Override // j.a
    public void u1(@NotNull Throwable th, boolean z) {
        if (x1().G(th) || z) {
            return;
        }
        r0.b(getContext(), th);
    }

    @Override // j.a
    /* renamed from: y1 */
    public void v1(@NotNull Unit unit) {
        m0.a.a(x1(), null, 1, null);
    }
}
