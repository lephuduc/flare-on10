package o;

import j.n2;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.r;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\n\u001a\u00020\t\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Lo/i;", "", "capacity", "Ll/m;", "onBufferOverflow", "b", "a", "g", "Lkotlin/coroutines/CoroutineContext;", "context", "h", "e", "", "f", "(Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class p {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ i a(i iVar, int i2) {
        i d2;
        d2 = d(iVar, i2, null, 2, null);
        return d2;
    }

    @NotNull
    public static final <T> i<T> b(@NotNull i<? extends T> iVar, int i2, @NotNull l.m mVar) {
        int i3;
        l.m mVar2;
        boolean z = true;
        if (!(i2 >= 0 || i2 == -2 || i2 == -1)) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i2).toString());
        }
        if (i2 == -1 && mVar != l.m.SUSPEND) {
            z = false;
        }
        if (z) {
            if (i2 == -1) {
                mVar2 = l.m.DROP_OLDEST;
                i3 = 0;
            } else {
                i3 = i2;
                mVar2 = mVar;
            }
            return iVar instanceof p.r ? r.a.a((p.r) iVar, null, i3, mVar2, 1, null) : new p.i(iVar, null, i3, mVar2, 2, null);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
    }

    public static /* synthetic */ i c(i iVar, int i2, int i3, Object obj) {
        i a2;
        if ((i3 & 1) != 0) {
            i2 = -2;
        }
        a2 = a(iVar, i2);
        return a2;
    }

    public static /* synthetic */ i d(i iVar, int i2, l.m mVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = -2;
        }
        if ((i3 & 2) != 0) {
            mVar = l.m.SUSPEND;
        }
        return k.o(iVar, i2, mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> i<T> e(@NotNull i<? extends T> iVar) {
        return iVar instanceof c ? iVar : new d(iVar);
    }

    public static final void f(CoroutineContext coroutineContext) {
        if (coroutineContext.get(n2.f488b) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    @NotNull
    public static final <T> i<T> g(@NotNull i<? extends T> iVar) {
        i<T> d2;
        d2 = d(iVar, -1, null, 2, null);
        return d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> i<T> h(@NotNull i<? extends T> iVar, @NotNull CoroutineContext coroutineContext) {
        f(coroutineContext);
        return Intrinsics.areEqual(coroutineContext, EmptyCoroutineContext.INSTANCE) ? iVar : iVar instanceof p.r ? r.a.a((p.r) iVar, coroutineContext, 0, null, 6, null) : new p.i(iVar, coroutineContext, 0, null, 12, null);
    }
}
