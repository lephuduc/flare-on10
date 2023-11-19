package androidx.compose.foundation.lazy.list;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import j.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a:\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000¨\u0006\f"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;", "stateOfItemsProvider", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Lj/u0;", "coroutineScope", "", "isVertical", "reverseScrolling", "lazyListSemantics", "foundation_release"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class LazySemanticsKt {
    @NotNull
    public static final Modifier lazyListSemantics(@NotNull Modifier modifier, @NotNull State<? extends LazyListItemsProvider> stateOfItemsProvider, @NotNull LazyListState state, @NotNull u0 coroutineScope, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(stateOfItemsProvider, "stateOfItemsProvider");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return SemanticsModifierKt.semantics$default(modifier, false, new LazySemanticsKt$lazyListSemantics$1(z2, z, stateOfItemsProvider, state, coroutineScope), 1, null);
    }
}
