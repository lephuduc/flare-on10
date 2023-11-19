package q;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.c4;
import j.j1;
import j.n2;
import j.t1;
import j.u3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010:\u001a\u000208\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bK\u0010LJ\u0017\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"JH\u0010'\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2%\b\b\u0010&\u001a\u001f\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\r\u0018\u00010#H\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u0016H\u0010¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\u001cH\u0086\b¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\b/\u0010\"J\u001f\u00103\u001a\u00020\r2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00028\u0000H\u0000¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107R\u0014\u0010:\u001a\u0002088\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u00109R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010;R\u001e\u0010?\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b<\u0010=\u0012\u0004\b>\u0010\u000fR\u0014\u0010A\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b@\u0010=R\u0014\u00101\u001a\u0002008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010CR\u001c\u0010F\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u001a\u0010J\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006M"}, d2 = {"Lq/l;", "T", "Lj/j1;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "q", "()Z", "", "l", "()V", "u", "Lj/r;", "m", "()Lj/r;", "Lj/q;", "continuation", "", "y", "(Lj/q;)Ljava/lang/Throwable;", "cause", "r", "(Ljava/lang/Throwable;)Z", "", "k", "()Ljava/lang/Object;", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onCancellation", "v", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "takenState", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "w", "(Ljava/lang/Object;)Z", "x", "Lkotlin/coroutines/CoroutineContext;", "context", "value", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lj/o0;", "Lj/o0;", "dispatcher", "Lkotlin/coroutines/Continuation;", "o", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "p", "countOrElement", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "g", "()Lkotlin/coroutines/Continuation;", "delegate", "reusableCancellableContinuation", "<init>", "(Lj/o0;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class l<T> extends j1<T> implements CoroutineStackFrame, Continuation<T> {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2022q = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_reusableCancellableContinuation");
    @NotNull
    private volatile /* synthetic */ Object _reusableCancellableContinuation;
    @JvmField
    @NotNull

    /* renamed from: m  reason: collision with root package name */
    public final j.o0 f2023m;
    @JvmField
    @NotNull

    /* renamed from: n  reason: collision with root package name */
    public final Continuation<T> f2024n;
    @JvmField
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    public Object f2025o;
    @JvmField
    @NotNull

    /* renamed from: p  reason: collision with root package name */
    public final Object f2026p;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull j.o0 o0Var, @NotNull Continuation<? super T> continuation) {
        super(-1);
        this.f2023m = o0Var;
        this.f2024n = continuation;
        this.f2025o = m.a();
        this.f2026p = w0.b(getContext());
        this._reusableCancellableContinuation = null;
    }

    public static /* synthetic */ void p() {
    }

    @Override // j.j1
    public void d(@Nullable Object obj, @NotNull Throwable th) {
        if (obj instanceof j.f0) {
            ((j.f0) obj).f437b.invoke(th);
        }
    }

    @Override // j.j1
    @NotNull
    public Continuation<T> g() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f2024n;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.f2024n.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // j.j1
    @Nullable
    public Object k() {
        Object obj = this.f2025o;
        this.f2025o = m.a();
        return obj;
    }

    public final void l() {
        do {
        } while (this._reusableCancellableContinuation == m.f2029b);
    }

    @Nullable
    public final j.r<T> m() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = m.f2029b;
                return null;
            } else if (obj instanceof j.r) {
                if (androidx.concurrent.futures.a.a(f2022q, this, obj, m.f2029b)) {
                    return (j.r) obj;
                }
            } else if (obj != m.f2029b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void n(@NotNull CoroutineContext coroutineContext, T t2) {
        this.f2025o = t2;
        this.f450l = 1;
        this.f2023m.dispatchYield(coroutineContext, this);
    }

    public final j.r<?> o() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof j.r) {
            return (j.r) obj;
        }
        return null;
    }

    public final boolean q() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean r(@NotNull Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            r0 r0Var = m.f2029b;
            if (Intrinsics.areEqual(obj, r0Var)) {
                if (androidx.concurrent.futures.a.a(f2022q, this, r0Var, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (androidx.concurrent.futures.a.a(f2022q, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        CoroutineContext context = this.f2024n.getContext();
        Object d2 = j.k0.d(obj, null, 1, null);
        if (this.f2023m.isDispatchNeeded(context)) {
            this.f2025o = d2;
            this.f450l = 0;
            this.f2023m.dispatch(context, this);
            return;
        }
        t1 b2 = u3.f529a.b();
        if (b2.B()) {
            this.f2025o = d2;
            this.f450l = 0;
            b2.v(this);
            return;
        }
        b2.y(true);
        try {
            CoroutineContext context2 = getContext();
            Object c2 = w0.c(context2, this.f2026p);
            this.f2024n.resumeWith(obj);
            Unit unit = Unit.INSTANCE;
            w0.a(context2, c2);
            do {
            } while (b2.E());
        } finally {
            try {
            } finally {
            }
        }
    }

    @NotNull
    public String toString() {
        return "DispatchedContinuation[" + this.f2023m + ", " + j.z0.c(this.f2024n) + ']';
    }

    public final void u() {
        l();
        j.r<?> o2 = o();
        if (o2 != null) {
            o2.r();
        }
    }

    public final void v(@NotNull Object obj, @Nullable Function1<? super Throwable, Unit> function1) {
        boolean z;
        Object c2 = j.k0.c(obj, function1);
        if (this.f2023m.isDispatchNeeded(getContext())) {
            this.f2025o = c2;
            this.f450l = 1;
            this.f2023m.dispatch(getContext(), this);
            return;
        }
        t1 b2 = u3.f529a.b();
        if (b2.B()) {
            this.f2025o = c2;
            this.f450l = 1;
            b2.v(this);
            return;
        }
        b2.y(true);
        try {
            n2 n2Var = (n2) getContext().get(n2.f488b);
            if (n2Var == null || n2Var.b()) {
                z = false;
            } else {
                CancellationException u2 = n2Var.u();
                d(c2, u2);
                Result.Companion companion = Result.Companion;
                resumeWith(Result.m3581constructorimpl(ResultKt.createFailure(u2)));
                z = true;
            }
            if (!z) {
                Continuation<T> continuation = this.f2024n;
                Object obj2 = this.f2026p;
                CoroutineContext context = continuation.getContext();
                Object c3 = w0.c(context, obj2);
                c4<?> g2 = c3 != w0.f2057a ? j.n0.g(continuation, context, c3) : null;
                this.f2024n.resumeWith(obj);
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
                if (g2 == null || g2.y1()) {
                    w0.a(context, c3);
                }
                InlineMarker.finallyEnd(1);
            }
            do {
            } while (b2.E());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean w(@Nullable Object obj) {
        n2 n2Var = (n2) getContext().get(n2.f488b);
        if (n2Var == null || n2Var.b()) {
            return false;
        }
        CancellationException u2 = n2Var.u();
        d(obj, u2);
        Result.Companion companion = Result.Companion;
        resumeWith(Result.m3581constructorimpl(ResultKt.createFailure(u2)));
        return true;
    }

    public final void x(@NotNull Object obj) {
        Continuation<T> continuation = this.f2024n;
        Object obj2 = this.f2026p;
        CoroutineContext context = continuation.getContext();
        Object c2 = w0.c(context, obj2);
        c4<?> g2 = c2 != w0.f2057a ? j.n0.g(continuation, context, c2) : null;
        try {
            this.f2024n.resumeWith(obj);
            Unit unit = Unit.INSTANCE;
        } finally {
            InlineMarker.finallyStart(1);
            if (g2 == null || g2.y1()) {
                w0.a(context, c2);
            }
            InlineMarker.finallyEnd(1);
        }
    }

    @Nullable
    public final Throwable y(@NotNull j.q<?> qVar) {
        r0 r0Var;
        do {
            Object obj = this._reusableCancellableContinuation;
            r0Var = m.f2029b;
            if (obj != r0Var) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.a.a(f2022q, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.a.a(f2022q, this, r0Var, qVar));
        return null;
    }
}
