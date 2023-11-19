package androidx.compose.runtime;

import j.u0;
import j.v0;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;", "Landroidx/compose/runtime/RememberObserver;", "", "onRemembered", "onForgotten", "onAbandoned", "Lj/u0;", "coroutineScope", "Lj/u0;", "getCoroutineScope", "()Lj/u0;", "<init>", "(Lj/u0;)V", "runtime_release"}, k = 1, mv = {1, 6, 0})
@PublishedApi
/* loaded from: classes.dex */
public final class CompositionScopedCoroutineScopeCanceller implements RememberObserver {
    @NotNull
    private final u0 coroutineScope;

    public CompositionScopedCoroutineScopeCanceller(@NotNull u0 coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
    }

    @NotNull
    public final u0 getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        v0.f(this.coroutineScope, null, 1, null);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        v0.f(this.coroutineScope, null, 1, null);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
