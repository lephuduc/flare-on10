package androidx.compose.foundation.relocation;

import android.view.View;
import androidx.appcompat.R;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;", "", "()V", "view", "Landroid/view/View;", "getView$foundation_release", "()Landroid/view/View;", "setView$foundation_release", "(Landroid/view/View;)V", "bringRectangleOnScreen", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BringRectangleOnScreenRequester {
    @Nullable
    private View view;

    public final void bringRectangleOnScreen(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        View view = this.view;
        if (view == null) {
            return;
        }
        view.requestRectangleOnScreen(BringRectangleOnScreen_androidKt.toRect(rect), false);
    }

    @Nullable
    public final View getView$foundation_release() {
        return this.view;
    }

    public final void setView$foundation_release(@Nullable View view) {
        this.view = view;
    }
}
