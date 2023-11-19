package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$onValueChangeWrapper$1 extends Lambda implements Function1<TextFieldValue, Unit> {
    public final /* synthetic */ RecomposeScope $scope;
    public final /* synthetic */ TextFieldState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$onValueChangeWrapper$1(TextFieldState textFieldState, RecomposeScope recomposeScope) {
        super(1);
        this.$state = textFieldState;
        this.$scope = recomposeScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
        invoke2(textFieldValue);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull TextFieldValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Intrinsics.areEqual(it.getText(), this.$state.getTextDelegate().getText().getText())) {
            this.$state.setHandleState(HandleState.None);
        }
        this.$state.getOnValueChange().invoke(it);
        this.$scope.invalidate();
    }
}
