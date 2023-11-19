package j;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"T", "Lj/z;", "Lkotlin/Result;", "result", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Lj/z;Ljava/lang/Object;)Z", "Lj/n2;", "parent", "a", "value", "b", "(Ljava/lang/Object;)Lj/z;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class b0 {
    @NotNull
    public static final <T> z<T> a(@Nullable n2 n2Var) {
        return new a0(n2Var);
    }

    @NotNull
    public static final <T> z<T> b(T t2) {
        a0 a0Var = new a0(null);
        a0Var.P(t2);
        return a0Var;
    }

    public static /* synthetic */ z c(n2 n2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            n2Var = null;
        }
        return a(n2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean d(@NotNull z<T> zVar, @NotNull Object obj) {
        Throwable m3584exceptionOrNullimpl = Result.m3584exceptionOrNullimpl(obj);
        return m3584exceptionOrNullimpl == null ? zVar.P(obj) : zVar.d(m3584exceptionOrNullimpl);
    }
}
