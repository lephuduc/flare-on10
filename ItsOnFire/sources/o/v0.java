package o;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a4\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a4\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b\u001a6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000\"\u001a\u0010\u0019\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u0012\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001c\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u0012\u0004\b\u001b\u0010\u0018¨\u0006\u001d"}, d2 = {"T", "value", "Lo/e0;", "a", "(Ljava/lang/Object;)Lo/e0;", "Lkotlin/Function1;", "function", "i", "(Lo/e0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "e", "", "h", "Lo/t0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Ll/m;", "onBufferOverflow", "Lo/i;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "Lq/r0;", "Lq/r0;", "getNONE$annotations", "()V", "NONE", "b", "getPENDING$annotations", "PENDING", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class v0 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final q.r0 f1664a = new q.r0("NONE");
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final q.r0 f1665b = new q.r0("PENDING");

    @NotNull
    public static final <T> e0<T> a(T t2) {
        if (t2 == null) {
            t2 = (T) p.u.f1945a;
        }
        return new u0(t2);
    }

    @NotNull
    public static final <T> i<T> d(@NotNull t0<? extends T> t0Var, @NotNull CoroutineContext coroutineContext, int i2, @NotNull l.m mVar) {
        boolean z = false;
        if (i2 >= 0 && i2 < 2) {
            z = true;
        }
        return ((z || i2 == -2) && mVar == l.m.DROP_OLDEST) ? t0Var : k0.e(t0Var, coroutineContext, i2, mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    public static final <T> T e(@NotNull e0<T> e0Var, @NotNull Function1<? super T, ? extends T> function1) {
        ?? r0;
        do {
            r0 = (Object) e0Var.getValue();
        } while (!e0Var.c(r0, function1.invoke(r0)));
        return r0;
    }

    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ void g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void h(@NotNull e0<T> e0Var, @NotNull Function1<? super T, ? extends T> function1) {
        Object obj;
        do {
            obj = (Object) e0Var.getValue();
        } while (!e0Var.c(obj, function1.invoke(obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T i(@NotNull e0<T> e0Var, @NotNull Function1<? super T, ? extends T> function1) {
        Object obj;
        T invoke;
        do {
            obj = (Object) e0Var.getValue();
            invoke = function1.invoke(obj);
        } while (!e0Var.c(obj, invoke));
        return invoke;
    }
}
