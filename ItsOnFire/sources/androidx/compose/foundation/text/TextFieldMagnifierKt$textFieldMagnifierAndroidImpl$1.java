package androidx.compose.foundation.text;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/text/Handle;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$1 extends Lambda implements Function0<Handle> {
    public final /* synthetic */ TextFieldState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$1(TextFieldState textFieldState) {
        super(0);
        this.$state = textFieldState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Handle invoke() {
        return this.$state.getDraggingHandle();
    }
}
