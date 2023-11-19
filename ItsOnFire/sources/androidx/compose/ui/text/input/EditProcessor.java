package androidx.compose.ui.text.input;

import androidx.appcompat.R;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\f\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0006\u0010\u0015\u001a\u00020\bR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/input/EditProcessor;", "", "()V", "<set-?>", "Landroidx/compose/ui/text/input/EditingBuffer;", "mBuffer", "getMBuffer$ui_text_release", "()Landroidx/compose/ui/text/input/EditingBuffer;", "Landroidx/compose/ui/text/input/TextFieldValue;", "mBufferState", "getMBufferState$ui_text_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "apply", "editCommands", "", "Landroidx/compose/ui/text/input/EditCommand;", "reset", "", "value", "textInputSession", "Landroidx/compose/ui/text/input/TextInputSession;", "toTextFieldValue", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class EditProcessor {
    @NotNull
    private TextFieldValue mBufferState = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), TextRange.Companion.m3080getZerod9O1mEE(), (TextRange) null, (DefaultConstructorMarker) null);
    @NotNull
    private EditingBuffer mBuffer = new EditingBuffer(this.mBufferState.getAnnotatedString(), this.mBufferState.m3187getSelectiond9O1mEE(), (DefaultConstructorMarker) null);

    @NotNull
    public final TextFieldValue apply(@NotNull List<? extends EditCommand> editCommands) {
        Intrinsics.checkNotNullParameter(editCommands, "editCommands");
        int size = editCommands.size();
        for (int i2 = 0; i2 < size; i2++) {
            editCommands.get(i2).applyTo(getMBuffer$ui_text_release());
        }
        TextFieldValue textFieldValue = new TextFieldValue(this.mBuffer.toAnnotatedString$ui_text_release(), TextRangeKt.TextRange(this.mBuffer.getSelectionStart$ui_text_release(), this.mBuffer.getSelectionEnd$ui_text_release()), this.mBuffer.hasComposition$ui_text_release() ? TextRange.m3063boximpl(TextRangeKt.TextRange(this.mBuffer.getCompositionStart$ui_text_release(), this.mBuffer.getCompositionEnd$ui_text_release())) : null, (DefaultConstructorMarker) null);
        this.mBufferState = textFieldValue;
        return textFieldValue;
    }

    @NotNull
    public final EditingBuffer getMBuffer$ui_text_release() {
        return this.mBuffer;
    }

    @NotNull
    public final TextFieldValue getMBufferState$ui_text_release() {
        return this.mBufferState;
    }

    public final void reset(@NotNull TextFieldValue value, @Nullable TextInputSession textInputSession) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(this.mBufferState.getAnnotatedString(), value.getAnnotatedString())) {
            this.mBuffer = new EditingBuffer(value.getAnnotatedString(), value.m3187getSelectiond9O1mEE(), (DefaultConstructorMarker) null);
        } else if (!TextRange.m3068equalsimpl0(this.mBufferState.m3187getSelectiond9O1mEE(), value.m3187getSelectiond9O1mEE())) {
            this.mBuffer.setSelection$ui_text_release(TextRange.m3073getMinimpl(value.m3187getSelectiond9O1mEE()), TextRange.m3072getMaximpl(value.m3187getSelectiond9O1mEE()));
        }
        if (value.m3186getCompositionMzsxiRA() == null) {
            this.mBuffer.commitComposition$ui_text_release();
        } else if (!TextRange.m3069getCollapsedimpl(value.m3186getCompositionMzsxiRA().m3079unboximpl())) {
            this.mBuffer.setComposition$ui_text_release(TextRange.m3073getMinimpl(value.m3186getCompositionMzsxiRA().m3079unboximpl()), TextRange.m3072getMaximpl(value.m3186getCompositionMzsxiRA().m3079unboximpl()));
        }
        TextFieldValue textFieldValue = this.mBufferState;
        this.mBufferState = value;
        if (textInputSession == null) {
            return;
        }
        textInputSession.updateState(textFieldValue, value);
    }

    @NotNull
    public final TextFieldValue toTextFieldValue() {
        return this.mBufferState;
    }
}
