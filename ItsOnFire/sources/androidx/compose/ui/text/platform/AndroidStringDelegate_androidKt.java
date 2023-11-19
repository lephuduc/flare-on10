package androidx.compose.ui.text.platform;

import androidx.appcompat.R;
import androidx.compose.ui.text.PlatformStringDelegate;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"ActualStringDelegate", "Landroidx/compose/ui/text/PlatformStringDelegate;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidStringDelegate_androidKt {
    @NotNull
    public static final PlatformStringDelegate ActualStringDelegate() {
        return new AndroidStringDelegate();
    }
}
