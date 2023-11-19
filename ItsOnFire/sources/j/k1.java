package j;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0011\u001a \u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a.\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001a'\u0010\u0010\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0080\b\u001a\u0019\u0010\u0013\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0080\b\"\u0014\u0010\u0015\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014\"\u001a\u0010\u0019\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014\"\u0014\u0010\u001d\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014\"\u0014\u0010\u001e\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0014\"\u0018\u0010 \u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001f\"\u0018\u0010!\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001f¨\u0006\""}, d2 = {"T", "Lj/j1;", "", "mode", "", "a", "Lkotlin/coroutines/Continuation;", "delegate", "", "undispatched", "e", "f", "Lj/t1;", "eventLoop", "Lkotlin/Function0;", "block", "h", "", "exception", "g", "I", "MODE_ATOMIC", "b", "getMODE_CANCELLABLE$annotations", "()V", "MODE_CANCELLABLE", "c", "MODE_CANCELLABLE_REUSABLE", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "MODE_UNDISPATCHED", "MODE_UNINITIALIZED", "(I)Z", "isCancellableMode", "isReusableMode", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f460a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f461b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f462c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f463d = 4;

    /* renamed from: e  reason: collision with root package name */
    public static final int f464e = -1;

    public static final <T> void a(@NotNull j1<? super T> j1Var, int i2) {
        Continuation<? super T> g2 = j1Var.g();
        boolean z = i2 == 4;
        if (z || !(g2 instanceof q.l) || c(i2) != c(j1Var.f450l)) {
            e(j1Var, g2, z);
            return;
        }
        o0 o0Var = ((q.l) g2).f2023m;
        CoroutineContext context = g2.getContext();
        if (o0Var.isDispatchNeeded(context)) {
            o0Var.dispatch(context, j1Var);
        } else {
            f(j1Var);
        }
    }

    @PublishedApi
    public static /* synthetic */ void b() {
    }

    public static final boolean c(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static final boolean d(int i2) {
        return i2 == 2;
    }

    public static final <T> void e(@NotNull j1<? super T> j1Var, @NotNull Continuation<? super T> continuation, boolean z) {
        Object i2;
        Object k2 = j1Var.k();
        Throwable h2 = j1Var.h(k2);
        if (h2 != null) {
            Result.Companion companion = Result.Companion;
            i2 = ResultKt.createFailure(h2);
        } else {
            Result.Companion companion2 = Result.Companion;
            i2 = j1Var.i(k2);
        }
        Object m3581constructorimpl = Result.m3581constructorimpl(i2);
        if (!z) {
            continuation.resumeWith(m3581constructorimpl);
            return;
        }
        q.l lVar = (q.l) continuation;
        Continuation<T> continuation2 = lVar.f2024n;
        Object obj = lVar.f2026p;
        CoroutineContext context = continuation2.getContext();
        Object c2 = q.w0.c(context, obj);
        c4<?> g2 = c2 != q.w0.f2057a ? n0.g(continuation2, context, c2) : null;
        try {
            lVar.f2024n.resumeWith(m3581constructorimpl);
            Unit unit = Unit.INSTANCE;
        } finally {
            if (g2 == null || g2.y1()) {
                q.w0.a(context, c2);
            }
        }
    }

    public static final void f(j1<?> j1Var) {
        t1 b2 = u3.f529a.b();
        if (b2.B()) {
            b2.v(j1Var);
            return;
        }
        b2.y(true);
        try {
            e(j1Var, j1Var.g(), true);
            do {
            } while (b2.E());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void g(@NotNull Continuation<?> continuation, @NotNull Throwable th) {
        Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.m3581constructorimpl(ResultKt.createFailure(th)));
    }

    public static final void h(@NotNull j1<?> j1Var, @NotNull t1 t1Var, @NotNull Function0<Unit> function0) {
        t1Var.y(true);
        try {
            function0.invoke();
            do {
            } while (t1Var.E());
        } finally {
            try {
            } finally {
            }
        }
    }
}
