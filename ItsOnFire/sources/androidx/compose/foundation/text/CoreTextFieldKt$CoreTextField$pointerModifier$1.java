package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$pointerModifier$1 extends Lambda implements Function1<Offset, Unit> {
    public final /* synthetic */ FocusRequester $focusRequester;
    public final /* synthetic */ TextFieldSelectionManager $manager;
    public final /* synthetic */ OffsetMapping $offsetMapping;
    public final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChangeWrapper;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ TextFieldState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoreTextFieldKt$CoreTextField$pointerModifier$1(TextFieldState textFieldState, FocusRequester focusRequester, boolean z, TextFieldSelectionManager textFieldSelectionManager, OffsetMapping offsetMapping, Function1<? super TextFieldValue, Unit> function1) {
        super(1);
        this.$state = textFieldState;
        this.$focusRequester = focusRequester;
        this.$readOnly = z;
        this.$manager = textFieldSelectionManager;
        this.$offsetMapping = offsetMapping;
        this.$onValueChangeWrapper = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
        m533invokek4lQ0M(offset.m1171unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
    public final void m533invokek4lQ0M(long j2) {
        CoreTextFieldKt.tapToFocus(this.$state, this.$focusRequester, !this.$readOnly);
        if (this.$state.getHasFocus()) {
            if (this.$state.getHandleState() == HandleState.Selection) {
                this.$manager.m678deselect_kEHs6E$foundation_release(Offset.m1150boximpl(j2));
                return;
            }
            TextLayoutResultProxy layoutResult = this.$state.getLayoutResult();
            if (layoutResult == null) {
                return;
            }
            TextFieldState textFieldState = this.$state;
            TextFieldDelegate.Companion.m591setCursorOffsetULxng0E$foundation_release(j2, layoutResult, textFieldState.getProcessor(), this.$offsetMapping, this.$onValueChangeWrapper);
            if (textFieldState.getTextDelegate().getText().length() > 0) {
                textFieldState.setHandleState(HandleState.Cursor);
            }
        }
    }
}
