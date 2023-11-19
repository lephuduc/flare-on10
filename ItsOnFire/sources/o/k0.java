package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000H\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a%\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0010\u001a\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\"\u001a\u0010\u001c\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u0012\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"T", "", "replay", "extraBufferCapacity", "Ll/m;", "onBufferOverflow", "Lo/d0;", "a", "", "", "", FirebaseAnalytics.Param.INDEX, "f", "([Ljava/lang/Object;J)Ljava/lang/Object;", "item", "", "h", "([Ljava/lang/Object;JLjava/lang/Object;)V", "Lo/i0;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lo/i;", "e", "Lq/r0;", "Lq/r0;", "getNO_VALUE$annotations", "()V", "NO_VALUE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class k0 {
    @JvmField
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final q.r0 f1322a = new q.r0("NO_VALUE");

    @NotNull
    public static final <T> d0<T> a(int i2, int i3, @NotNull l.m mVar) {
        boolean z = true;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i2).toString());
        }
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i3).toString());
        }
        if (i2 <= 0 && i3 <= 0 && mVar != l.m.SUSPEND) {
            z = false;
        }
        if (z) {
            int i4 = i3 + i2;
            if (i4 < 0) {
                i4 = Integer.MAX_VALUE;
            }
            return new j0(i2, i4, mVar);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + mVar).toString());
    }

    public static /* synthetic */ d0 b(int i2, int i3, l.m mVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            mVar = l.m.SUSPEND;
        }
        return a(i2, i3, mVar);
    }

    @NotNull
    public static final <T> i<T> e(@NotNull i0<? extends T> i0Var, @NotNull CoroutineContext coroutineContext, int i2, @NotNull l.m mVar) {
        return ((i2 == 0 || i2 == -3) && mVar == l.m.SUSPEND) ? i0Var : new p.i(i0Var, coroutineContext, i2, mVar);
    }

    public static final Object f(Object[] objArr, long j2) {
        return objArr[((int) j2) & (objArr.length - 1)];
    }

    public static /* synthetic */ void g() {
    }

    public static final void h(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }
}
