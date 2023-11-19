package androidx.compose.ui.input.pointer;

import androidx.appcompat.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerIconService;", "", "current", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getCurrent", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "setCurrent", "(Landroidx/compose/ui/input/pointer/PointerIcon;)V", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public interface PointerIconService {
    @NotNull
    PointerIcon getCurrent();

    void setCurrent(@NotNull PointerIcon pointerIcon);
}
