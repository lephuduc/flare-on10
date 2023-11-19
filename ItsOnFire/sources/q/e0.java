package q;

import j.z2;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lq/e0;", "", "Lj/z2;", "a", "", "b", "Z", "FAST_SERVICE_LOADER_ENABLED", "c", "Lj/z2;", "dispatcher", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class e0 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final e0 f2002a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f2003b;
    @JvmField
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final z2 f2004c;

    static {
        e0 e0Var = new e0();
        f2002a = e0Var;
        f2003b = t0.e(f0.f2009a, true);
        f2004c = e0Var.a();
    }

    public final z2 a() {
        Sequence asSequence;
        List<d0> list;
        Object next;
        z2 f2;
        try {
            if (f2003b) {
                list = o.f2039a.d();
            } else {
                asSequence = SequencesKt__SequencesKt.asSequence(ServiceLoader.load(d0.class, d0.class.getClassLoader()).iterator());
                list = SequencesKt___SequencesKt.toList(asSequence);
            }
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int c2 = ((d0) next).c();
                    do {
                        Object next2 = it.next();
                        int c3 = ((d0) next2).c();
                        if (c2 < c3) {
                            next = next2;
                            c2 = c3;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            d0 d0Var = (d0) next;
            return (d0Var == null || (f2 = f0.f(d0Var, list)) == null) ? f0.b(null, null, 3, null) : f2;
        } catch (Throwable th) {
            return f0.b(th, null, 2, null);
        }
    }
}
