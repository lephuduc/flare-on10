package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$drawModifier$1 extends Lambda implements Function1<DrawScope, Unit> {
    public final /* synthetic */ OffsetMapping $offsetMapping;
    public final /* synthetic */ TextFieldState $state;
    public final /* synthetic */ TextFieldValue $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$drawModifier$1(TextFieldState textFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        super(1);
        this.$state = textFieldState;
        this.$value = textFieldValue;
        this.$offsetMapping = offsetMapping;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        TextLayoutResultProxy layoutResult = this.$state.getLayoutResult();
        if (layoutResult == null) {
            return;
        }
        TextFieldValue textFieldValue = this.$value;
        OffsetMapping offsetMapping = this.$offsetMapping;
        TextFieldState textFieldState = this.$state;
        TextFieldDelegate.Companion.draw$foundation_release(drawBehind.getDrawContext().getCanvas(), textFieldValue, offsetMapping, layoutResult.getValue(), textFieldState.getSelectionPaint());
    }
}
