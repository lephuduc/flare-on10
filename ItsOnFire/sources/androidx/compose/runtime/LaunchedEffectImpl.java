package androidx.compose.runtime;

import j.l;
import j.n2;
import j.t2;
import j.u0;
import j.v0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R8\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/LaunchedEffectImpl;", "Landroidx/compose/runtime/RememberObserver;", "", "onRemembered", "onForgotten", "onAbandoned", "Lkotlin/Function2;", "Lj/u0;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "task", "Lkotlin/jvm/functions/Function2;", "scope", "Lj/u0;", "Lj/n2;", "job", "Lj/n2;", "Lkotlin/coroutines/CoroutineContext;", "parentCoroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class LaunchedEffectImpl implements RememberObserver {
    @Nullable
    private n2 job;
    @NotNull
    private final u0 scope;
    @NotNull
    private final Function2<u0, Continuation<? super Unit>, Object> task;

    /* JADX WARN: Multi-variable type inference failed */
    public LaunchedEffectImpl(@NotNull CoroutineContext parentCoroutineContext, @NotNull Function2<? super u0, ? super Continuation<? super Unit>, ? extends Object> task) {
        Intrinsics.checkNotNullParameter(parentCoroutineContext, "parentCoroutineContext");
        Intrinsics.checkNotNullParameter(task, "task");
        this.task = task;
        this.scope = v0.a(parentCoroutineContext);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        n2 n2Var = this.job;
        if (n2Var != null) {
            n2.a.b(n2Var, null, 1, null);
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        n2 n2Var = this.job;
        if (n2Var != null) {
            n2.a.b(n2Var, null, 1, null);
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        n2 f2;
        n2 n2Var = this.job;
        if (n2Var != null) {
            t2.i(n2Var, "Old job was still running!", null, 2, null);
        }
        f2 = l.f(this.scope, null, null, this.task, 3, null);
        this.job = f2;
    }
}
