package j;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\nJ\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bR\u0016\u0010\u0019\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lj/j1;", "T", "Ls/k;", "Lkotlinx/coroutines/SchedulerTask;", "", "k", "()Ljava/lang/Object;", "takenState", "", "cause", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "i", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "exception", "finallyException", "j", "", "l", "I", "resumeMode", "Lkotlin/coroutines/Continuation;", "g", "()Lkotlin/coroutines/Continuation;", "delegate", "<init>", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public abstract class j1<T> extends s.k {
    @JvmField

    /* renamed from: l  reason: collision with root package name */
    public int f450l;

    public j1(int i2) {
        this.f450l = i2;
    }

    public void d(@Nullable Object obj, @NotNull Throwable th) {
    }

    @NotNull
    public abstract Continuation<T> g();

    @Nullable
    public Throwable h(@Nullable Object obj) {
        e0 e0Var = obj instanceof e0 ? (e0) obj : null;
        if (e0Var != null) {
            return e0Var.f424a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T i(@Nullable Object obj) {
        return obj;
    }

    public final void j(@Nullable Throwable th, @Nullable Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            ExceptionsKt__ExceptionsKt.addSuppressed(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        Intrinsics.checkNotNull(th);
        r0.b(g().getContext(), new x0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    @Nullable
    public abstract Object k();

    @Override // java.lang.Runnable
    public final void run() {
        Object m3581constructorimpl;
        Object m3581constructorimpl2;
        Object m3581constructorimpl3;
        s.l lVar = this.f2138k;
        try {
            q.l lVar2 = (q.l) g();
            Continuation<T> continuation = lVar2.f2024n;
            Object obj = lVar2.f2026p;
            CoroutineContext context = continuation.getContext();
            Object c2 = q.w0.c(context, obj);
            c4<?> g2 = c2 != q.w0.f2057a ? n0.g(continuation, context, c2) : null;
            CoroutineContext context2 = continuation.getContext();
            Object k2 = k();
            Throwable h2 = h(k2);
            n2 n2Var = (h2 == null && k1.c(this.f450l)) ? (n2) context2.get(n2.f488b) : null;
            if (n2Var != null && !n2Var.b()) {
                CancellationException u2 = n2Var.u();
                d(k2, u2);
                Result.Companion companion = Result.Companion;
                m3581constructorimpl2 = Result.m3581constructorimpl(ResultKt.createFailure(u2));
            } else if (h2 != null) {
                Result.Companion companion2 = Result.Companion;
                m3581constructorimpl2 = Result.m3581constructorimpl(ResultKt.createFailure(h2));
            } else {
                Result.Companion companion3 = Result.Companion;
                m3581constructorimpl2 = Result.m3581constructorimpl(i(k2));
            }
            continuation.resumeWith(m3581constructorimpl2);
            Unit unit = Unit.INSTANCE;
            if (g2 == null || g2.y1()) {
                q.w0.a(context, c2);
            }
            try {
                Result.Companion companion4 = Result.Companion;
                lVar.c();
                m3581constructorimpl3 = Result.m3581constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion5 = Result.Companion;
                m3581constructorimpl3 = Result.m3581constructorimpl(ResultKt.createFailure(th));
            }
            j(null, Result.m3584exceptionOrNullimpl(m3581constructorimpl3));
        } catch (Throwable th2) {
            try {
                Result.Companion companion6 = Result.Companion;
                lVar.c();
                m3581constructorimpl = Result.m3581constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion7 = Result.Companion;
                m3581constructorimpl = Result.m3581constructorimpl(ResultKt.createFailure(th3));
            }
            j(th2, Result.m3584exceptionOrNullimpl(m3581constructorimpl));
        }
    }
}
