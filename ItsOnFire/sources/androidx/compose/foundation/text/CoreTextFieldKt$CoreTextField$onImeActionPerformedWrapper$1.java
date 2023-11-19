package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$onImeActionPerformedWrapper$1 extends Lambda implements Function1<ImeAction, Unit> {
    public final /* synthetic */ TextFieldState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$onImeActionPerformedWrapper$1(TextFieldState textFieldState) {
        super(1);
        this.$state = textFieldState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ImeAction imeAction) {
        m532invokeKlQnJC8(imeAction.m3140unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-KlQnJC8  reason: not valid java name */
    public final void m532invokeKlQnJC8(int i2) {
        this.$state.getKeyboardActionRunner().m542runActionKlQnJC8(i2);
    }
}
