package androidx.compose.material;

import androidx.compose.runtime.RecomposeScope;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/material/FadeInFadeOutState;", "T", "", "()V", "current", "getCurrent", "()Ljava/lang/Object;", "setCurrent", "(Ljava/lang/Object;)V", FirebaseAnalytics.Param.ITEMS, "", "Landroidx/compose/material/FadeInFadeOutAnimationItem;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "scope", "Landroidx/compose/runtime/RecomposeScope;", "getScope", "()Landroidx/compose/runtime/RecomposeScope;", "setScope", "(Landroidx/compose/runtime/RecomposeScope;)V", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
final class FadeInFadeOutState<T> {
    @Nullable
    private Object current = new Object();
    @NotNull
    private List<FadeInFadeOutAnimationItem<T>> items = new ArrayList();
    @Nullable
    private RecomposeScope scope;

    @Nullable
    public final Object getCurrent() {
        return this.current;
    }

    @NotNull
    public final List<FadeInFadeOutAnimationItem<T>> getItems() {
        return this.items;
    }

    @Nullable
    public final RecomposeScope getScope() {
        return this.scope;
    }

    public final void setCurrent(@Nullable Object obj) {
        this.current = obj;
    }

    public final void setItems(@NotNull List<FadeInFadeOutAnimationItem<T>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.items = list;
    }

    public final void setScope(@Nullable RecomposeScope recomposeScope) {
        this.scope = recomposeScope;
    }
}
