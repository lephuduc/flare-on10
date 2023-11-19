package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
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
public final class CoreTextFieldKt$CoreTextField$3 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    public final /* synthetic */ ImeOptions $imeOptions;
    public final /* synthetic */ Function1<ImeAction, Unit> $onImeActionPerformedWrapper;
    public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChangeWrapper;
    public final /* synthetic */ TextFieldState $state;
    public final /* synthetic */ TextInputService $textInputService;
    public final /* synthetic */ TextFieldValue $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoreTextFieldKt$CoreTextField$3(TextInputService textInputService, TextFieldState textFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, Function1<? super TextFieldValue, Unit> function1, Function1<? super ImeAction, Unit> function12) {
        super(1);
        this.$textInputService = textInputService;
        this.$state = textFieldState;
        this.$value = textFieldValue;
        this.$imeOptions = imeOptions;
        this.$onValueChangeWrapper = function1;
        this.$onImeActionPerformedWrapper = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        if (this.$textInputService != null && this.$state.getHasFocus()) {
            TextFieldState textFieldState = this.$state;
            textFieldState.setInputSession(TextFieldDelegate.Companion.restartInput$foundation_release(this.$textInputService, this.$value, textFieldState.getProcessor(), this.$imeOptions, this.$onValueChangeWrapper, this.$onImeActionPerformedWrapper));
        }
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }
}
