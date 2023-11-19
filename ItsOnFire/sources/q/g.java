package q;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ao\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u000228\u0010\b\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00028\u00000\u0004H\u0082\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u000e\u001a\u00028\u0000\"\u000e\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\f*\u00028\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0018\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u0012\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lq/o0;", "S", "", "id", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "prev", "createNewSegment", "Lq/p0;", "c", "(Lq/o0;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lq/h;", "N", "b", "(Lq/h;)Lq/h;", "", "a", "I", "POINTERS_SHIFT", "Lq/r0;", "Lq/r0;", "getCLOSED$annotations", "()V", "CLOSED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a */
    public static final int f2011a = 16;
    @NotNull

    /* renamed from: b */
    public static final r0 f2012b = new r0("CLOSED");

    public static final /* synthetic */ r0 a() {
        return f2012b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [q.h] */
    @NotNull
    public static final <N extends h<N>> N b(@NotNull N n2) {
        while (true) {
            Object e2 = n2.e();
            if (e2 == f2012b) {
                return n2;
            }
            ?? r0 = (h) e2;
            if (r0 != 0) {
                n2 = r0;
            } else if (n2.j()) {
                return n2;
            }
        }
    }

    public static final <S extends o0<S>> Object c(S s2, long j2, Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s2.o() >= j2 && !s2.g()) {
                return p0.b(s2);
            }
            Object e2 = s2.e();
            if (e2 == f2012b) {
                return p0.b(f2012b);
            }
            S s3 = (S) ((h) e2);
            if (s3 == null) {
                s3 = function2.invoke(Long.valueOf(s2.o() + 1), s2);
                if (s2.m(s3)) {
                    if (s2.g()) {
                        s2.l();
                    }
                }
            }
            s2 = s3;
        }
    }

    public static /* synthetic */ void d() {
    }
}
