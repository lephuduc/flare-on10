package j;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0014R*\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lj/c4;", "T", "Lq/n0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "oldValue", "", "z1", "", "y1", "state", "s1", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "m", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class c4<T> extends q.n0<T> {
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public ThreadLocal<Pair<CoroutineContext, Object>> f408m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c4(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r4) {
        /*
            r2 = this;
            j.d4 r0 = j.d4.f415j
            kotlin.coroutines.CoroutineContext$Element r1 = r3.get(r0)
            if (r1 != 0) goto Ld
            kotlin.coroutines.CoroutineContext r0 = r3.plus(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f408m = r0
            kotlin.coroutines.CoroutineContext r4 = r4.getContext()
            kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Element r4 = r4.get(r0)
            boolean r4 = r4 instanceof j.o0
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = q.w0.c(r3, r4)
            q.w0.a(r3, r4)
            r2.z1(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.c4.<init>(kotlin.coroutines.CoroutineContext, kotlin.coroutines.Continuation):void");
    }

    @Override // q.n0, j.a
    public void s1(@Nullable Object obj) {
        Pair<CoroutineContext, Object> pair = this.f408m.get();
        if (pair != null) {
            q.w0.a(pair.component1(), pair.component2());
            this.f408m.set(null);
        }
        Object a2 = k0.a(obj, this.f2038l);
        Continuation<T> continuation = this.f2038l;
        CoroutineContext context = continuation.getContext();
        Object c2 = q.w0.c(context, null);
        c4<?> g2 = c2 != q.w0.f2057a ? n0.g(continuation, context, c2) : null;
        try {
            this.f2038l.resumeWith(a2);
            Unit unit = Unit.INSTANCE;
        } finally {
            if (g2 == null || g2.y1()) {
                q.w0.a(context, c2);
            }
        }
    }

    public final boolean y1() {
        if (this.f408m.get() == null) {
            return false;
        }
        this.f408m.set(null);
        return true;
    }

    public final void z1(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        this.f408m.set(TuplesKt.to(coroutineContext, obj));
    }
}
