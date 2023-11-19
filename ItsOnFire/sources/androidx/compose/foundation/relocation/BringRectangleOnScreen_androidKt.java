package androidx.compose.foundation.relocation;

import android.graphics.Rect;
import androidx.appcompat.R;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"bringRectangleOnScreenRequester", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;", "toRect", "Landroid/graphics/Rect;", "Landroidx/compose/ui/geometry/Rect;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BringRectangleOnScreen_androidKt {
    @NotNull
    public static final Modifier bringRectangleOnScreenRequester(@NotNull Modifier modifier, @NotNull BringRectangleOnScreenRequester bringRectangleOnScreenRequester) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(bringRectangleOnScreenRequester, "bringRectangleOnScreenRequester");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new BringRectangleOnScreen_androidKt$bringRectangleOnScreenRequester$$inlined$debugInspectorInfo$1(bringRectangleOnScreenRequester) : InspectableValueKt.getNoInspectorInfo(), new BringRectangleOnScreen_androidKt$bringRectangleOnScreenRequester$2(bringRectangleOnScreenRequester));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect toRect(androidx.compose.ui.geometry.Rect rect) {
        return new Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
    }
}
