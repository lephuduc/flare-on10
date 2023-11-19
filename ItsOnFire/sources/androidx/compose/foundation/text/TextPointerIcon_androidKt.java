package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIcon_androidKt;
import androidx.core.view.PointerIconCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"textPointerIcon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getTextPointerIcon", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextPointerIcon_androidKt {
    @NotNull
    private static final PointerIcon textPointerIcon = PointerIcon_androidKt.PointerIcon((int) PointerIconCompat.TYPE_TEXT);

    @NotNull
    public static final PointerIcon getTextPointerIcon() {
        return textPointerIcon;
    }
}
