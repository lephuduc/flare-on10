package androidx.compose.ui.text.platform;

import androidx.appcompat.R;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/android/selection/WordBoundary;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidParagraph$wordBoundary$2 extends Lambda implements Function0<WordBoundary> {
    public final /* synthetic */ AndroidParagraph this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidParagraph$wordBoundary$2(AndroidParagraph androidParagraph) {
        super(0);
        this.this$0 = androidParagraph;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final WordBoundary invoke() {
        TextLayout textLayout;
        Locale textLocale$ui_text_release = this.this$0.getTextLocale$ui_text_release();
        textLayout = this.this$0.layout;
        return new WordBoundary(textLocale$ui_text_release, textLayout.getText());
    }
}
