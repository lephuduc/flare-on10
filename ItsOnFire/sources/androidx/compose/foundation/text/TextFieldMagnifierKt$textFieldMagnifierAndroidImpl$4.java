package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Rect;", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$4 extends Lambda implements Function1<Integer, Rect> {
    public final /* synthetic */ TextFieldState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldMagnifierKt$textFieldMagnifierAndroidImpl$4(TextFieldState textFieldState) {
        super(1);
        this.$state = textFieldState;
    }

    @Nullable
    public final Rect invoke(int i2) {
        TextLayoutResult value;
        TextLayoutResultProxy layoutResult = this.$state.getLayoutResult();
        if (layoutResult == null || (value = layoutResult.getValue()) == null) {
            return null;
        }
        return value.getCursorRect(i2);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Rect invoke(Integer num) {
        return invoke(num.intValue());
    }
}
