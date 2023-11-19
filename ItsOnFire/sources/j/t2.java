package j;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.n2;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.JvmName;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u001b\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0017\u0010\n\u001a\u00020\t*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\u000f\u001a\u00020\t*\u00020\u00002\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u001a\f\u0010\u0010\u001a\u00020\t*\u00020\u0000H\u0007\u001a\u0018\u0010\u0012\u001a\u00020\t*\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0007\u001a\u001c\u0010\u0014\u001a\u00020\t*\u00020\u00132\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u001a\f\u0010\u0015\u001a\u00020\t*\u00020\u0013H\u0007\u001a\n\u0010\u0016\u001a\u00020\t*\u00020\u0000\u001a\n\u0010\u0017\u001a\u00020\t*\u00020\u0013\u001a\u001e\u0010\u001a\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011\u001a\u0018\u0010\u001c\u001a\u00020\u001b*\u00020\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0007\u001a\u001c\u0010\u001d\u001a\u00020\t*\u00020\u00132\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u001a\f\u0010\u001e\u001a\u00020\t*\u00020\u0013H\u0007\u001a\u0018\u0010\u001f\u001a\u00020\t*\u00020\u00132\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0007\u001a\u001d\u0010!\u001a\u00020\u0011*\u0004\u0018\u00010\u00112\u0006\u0010 \u001a\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"\"\u0015\u0010%\u001a\u00020\u001b*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b#\u0010$\"\u0015\u0010 \u001a\u00020\u0000*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lj/n2;", "parent", "Lj/c0;", "a", "b", "(Lj/n2;)Lj/n2;", "Lj/p1;", "handle", "w", "", "l", "(Lj/n2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "o", "m", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Lkotlin/coroutines/CoroutineContext;", "g", "f", "x", "y", "", "message", "e", "", "h", "r", "p", "q", "job", "B", "(Ljava/lang/Throwable;Lj/n2;)Ljava/lang/Throwable;", "A", "(Lkotlin/coroutines/CoroutineContext;)Z", "isActive", "z", "(Lkotlin/coroutines/CoroutineContext;)Lj/n2;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/JobKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class t2 {
    public static final boolean A(@NotNull CoroutineContext coroutineContext) {
        n2 n2Var = (n2) coroutineContext.get(n2.f488b);
        return n2Var != null && n2Var.b();
    }

    public static final Throwable B(Throwable th, n2 n2Var) {
        return th == null ? new o2("Job was cancelled", null, n2Var) : th;
    }

    @NotNull
    public static final c0 a(@Nullable n2 n2Var) {
        return new q2(n2Var);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    @JvmName(name = "Job")
    public static final /* synthetic */ n2 b(n2 n2Var) {
        return r2.a(n2Var);
    }

    public static /* synthetic */ c0 c(n2 n2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            n2Var = null;
        }
        return r2.a(n2Var);
    }

    public static /* synthetic */ n2 d(n2 n2Var, int i2, Object obj) {
        n2 b2;
        if ((i2 & 1) != 0) {
            n2Var = null;
        }
        b2 = b(n2Var);
        return b2;
    }

    public static final void e(@NotNull n2 n2Var, @NotNull String str, @Nullable Throwable th) {
        n2Var.cancel(y1.a(str, th));
    }

    public static final void g(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        n2 n2Var = (n2) coroutineContext.get(n2.f488b);
        if (n2Var != null) {
            n2Var.cancel(cancellationException);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean h(CoroutineContext coroutineContext, Throwable th) {
        CoroutineContext.Element element = coroutineContext.get(n2.f488b);
        v2 v2Var = element instanceof v2 ? (v2) element : null;
        if (v2Var == null) {
            return false;
        }
        v2Var.l0(B(th, v2Var));
        return true;
    }

    public static /* synthetic */ void i(n2 n2Var, String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        r2.e(n2Var, str, th);
    }

    public static /* synthetic */ void j(CoroutineContext coroutineContext, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        r2.g(coroutineContext, cancellationException);
    }

    public static /* synthetic */ boolean k(CoroutineContext coroutineContext, Throwable th, int i2, Object obj) {
        boolean h2;
        if ((i2 & 1) != 0) {
            th = null;
        }
        h2 = h(coroutineContext, th);
        return h2;
    }

    @Nullable
    public static final Object l(@NotNull n2 n2Var, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        n2.a.b(n2Var, null, 1, null);
        Object n2 = n2Var.n(continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return n2 == coroutine_suspended ? n2 : Unit.INSTANCE;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void n(n2 n2Var, Throwable th) {
        for (n2 n2Var2 : n2Var.k()) {
            v2 v2Var = n2Var2 instanceof v2 ? (v2) n2Var2 : null;
            if (v2Var != null) {
                v2Var.l0(B(th, n2Var));
            }
        }
    }

    public static final void o(@NotNull n2 n2Var, @Nullable CancellationException cancellationException) {
        for (n2 n2Var2 : n2Var.k()) {
            n2Var2.cancel(cancellationException);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void q(CoroutineContext coroutineContext, Throwable th) {
        n2 n2Var = (n2) coroutineContext.get(n2.f488b);
        if (n2Var == null) {
            return;
        }
        for (n2 n2Var2 : n2Var.k()) {
            v2 v2Var = n2Var2 instanceof v2 ? (v2) n2Var2 : null;
            if (v2Var != null) {
                v2Var.l0(B(th, n2Var));
            }
        }
    }

    public static final void r(@NotNull CoroutineContext coroutineContext, @Nullable CancellationException cancellationException) {
        Sequence<n2> k2;
        n2 n2Var = (n2) coroutineContext.get(n2.f488b);
        if (n2Var == null || (k2 = n2Var.k()) == null) {
            return;
        }
        for (n2 n2Var2 : k2) {
            n2Var2.cancel(cancellationException);
        }
    }

    public static /* synthetic */ void s(n2 n2Var, Throwable th, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            th = null;
        }
        n(n2Var, th);
    }

    public static /* synthetic */ void t(n2 n2Var, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        r2.o(n2Var, cancellationException);
    }

    public static /* synthetic */ void u(CoroutineContext coroutineContext, Throwable th, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            th = null;
        }
        q(coroutineContext, th);
    }

    public static /* synthetic */ void v(CoroutineContext coroutineContext, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        r2.r(coroutineContext, cancellationException);
    }

    @NotNull
    public static final p1 w(@NotNull n2 n2Var, @NotNull p1 p1Var) {
        return n2Var.H(new r1(p1Var));
    }

    public static final void x(@NotNull n2 n2Var) {
        if (!n2Var.b()) {
            throw n2Var.u();
        }
    }

    public static final void y(@NotNull CoroutineContext coroutineContext) {
        n2 n2Var = (n2) coroutineContext.get(n2.f488b);
        if (n2Var != null) {
            r2.z(n2Var);
        }
    }

    @NotNull
    public static final n2 z(@NotNull CoroutineContext coroutineContext) {
        n2 n2Var = (n2) coroutineContext.get(n2.f488b);
        if (n2Var != null) {
            return n2Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }
}
