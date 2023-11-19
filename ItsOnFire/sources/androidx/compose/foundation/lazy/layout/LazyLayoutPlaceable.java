package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.R;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;", "", "placeable", "Landroidx/compose/ui/layout/Placeable;", "parentData", "(Landroidx/compose/ui/layout/Placeable;Ljava/lang/Object;)V", "getParentData", "()Ljava/lang/Object;", "getPlaceable", "()Landroidx/compose/ui/layout/Placeable;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyLayoutPlaceable {
    @Nullable
    private final Object parentData;
    @NotNull
    private final Placeable placeable;

    public LazyLayoutPlaceable(@NotNull Placeable placeable, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(placeable, "placeable");
        this.placeable = placeable;
        this.parentData = obj;
    }

    @Nullable
    public final Object getParentData() {
        return this.parentData;
    }

    @NotNull
    public final Placeable getPlaceable() {
        return this.placeable;
    }
}
