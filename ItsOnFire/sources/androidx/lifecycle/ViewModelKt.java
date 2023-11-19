package androidx.lifecycle;

import j.m1;
import j.r3;
import j.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0004*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"", "JOB_KEY", "Ljava/lang/String;", "Landroidx/lifecycle/ViewModel;", "Lj/u0;", "getViewModelScope", "(Landroidx/lifecycle/ViewModel;)Lj/u0;", "viewModelScope", "lifecycle-viewmodel-ktx_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class ViewModelKt {
    private static final String JOB_KEY = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    @NotNull
    public static final u0 getViewModelScope(@NotNull ViewModel viewModelScope) {
        Intrinsics.checkNotNullParameter(viewModelScope, "$this$viewModelScope");
        u0 u0Var = (u0) viewModelScope.getTag(JOB_KEY);
        if (u0Var != null) {
            return u0Var;
        }
        Object tagIfAbsent = viewModelScope.setTagIfAbsent(JOB_KEY, new CloseableCoroutineScope(r3.c(null, 1, null).plus(m1.e().q())));
        Intrinsics.checkNotNullExpressionValue(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (u0) tagIfAbsent;
    }
}
