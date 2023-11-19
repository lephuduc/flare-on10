package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$focusModifier$1 extends Lambda implements Function1<FocusState, Unit> {
    public final /* synthetic */ ImeOptions $imeOptions;
    public final /* synthetic */ TextFieldSelectionManager $manager;
    public final /* synthetic */ OffsetMapping $offsetMapping;
    public final /* synthetic */ Function1<ImeAction, Unit> $onImeActionPerformedWrapper;
    public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChangeWrapper;
    public final /* synthetic */ TextFieldState $state;
    public final /* synthetic */ TextInputService $textInputService;
    public final /* synthetic */ TextFieldValue $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoreTextFieldKt$CoreTextField$focusModifier$1(TextFieldState textFieldState, TextInputService textInputService, TextFieldValue textFieldValue, ImeOptions imeOptions, Function1<? super TextFieldValue, Unit> function1, Function1<? super ImeAction, Unit> function12, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager) {
        super(1);
        this.$state = textFieldState;
        this.$textInputService = textInputService;
        this.$value = textFieldValue;
        this.$imeOptions = imeOptions;
        this.$onValueChangeWrapper = function1;
        this.$onImeActionPerformedWrapper = function12;
        this.$offsetMapping = offsetMapping;
        this.$manager = textFieldSelectionManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
        invoke2(focusState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (this.$state.getHasFocus() == it.isFocused()) {
            return;
        }
        this.$state.setHasFocus(it.isFocused());
        TextInputService textInputService = this.$textInputService;
        if (textInputService != null) {
            CoreTextFieldKt.notifyTextInputServiceOnFocusChange(textInputService, this.$state, this.$value, this.$imeOptions, this.$onValueChangeWrapper, this.$onImeActionPerformedWrapper, this.$offsetMapping);
        }
        if (it.isFocused()) {
            return;
        }
        TextFieldSelectionManager.m677deselect_kEHs6E$foundation_release$default(this.$manager, null, 1, null);
    }
}
