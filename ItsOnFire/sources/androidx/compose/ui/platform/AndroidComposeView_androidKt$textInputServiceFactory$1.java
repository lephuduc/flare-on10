package androidx.compose.ui.platform;

import androidx.appcompat.R;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/input/TextInputService;", "it", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidComposeView_androidKt$textInputServiceFactory$1 extends Lambda implements Function1<PlatformTextInputService, TextInputService> {
    public static final AndroidComposeView_androidKt$textInputServiceFactory$1 INSTANCE = new AndroidComposeView_androidKt$textInputServiceFactory$1();

    public AndroidComposeView_androidKt$textInputServiceFactory$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final TextInputService invoke(@NotNull PlatformTextInputService it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new TextInputService(it);
    }
}
