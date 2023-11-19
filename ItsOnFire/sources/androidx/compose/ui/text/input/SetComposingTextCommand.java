package androidx.compose.ui.text.input;

import androidx.appcompat.R;
import androidx.compose.ui.text.AnnotatedString;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0015\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/input/SetComposingTextCommand;", "Landroidx/compose/ui/text/input/EditCommand;", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "", "newCursorPosition", "", "(Ljava/lang/String;I)V", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;I)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "getNewCursorPosition", "()I", "getText", "()Ljava/lang/String;", "applyTo", "", "buffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "equals", "", "other", "", "hashCode", "toString", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SetComposingTextCommand implements EditCommand {
    @NotNull
    private final AnnotatedString annotatedString;
    private final int newCursorPosition;

    public SetComposingTextCommand(@NotNull AnnotatedString annotatedString, int i2) {
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        this.annotatedString = annotatedString;
        this.newCursorPosition = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SetComposingTextCommand(@NotNull String text, int i2) {
        this(new AnnotatedString(text, null, null, 6, null), i2);
        Intrinsics.checkNotNullParameter(text, "text");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        if ((getText().length() > 0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
        r7.setComposition$ui_text_release(r0, getText().length() + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        if ((getText().length() > 0) != false) goto L14;
     */
    @Override // androidx.compose.ui.text.input.EditCommand
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void applyTo(@org.jetbrains.annotations.NotNull androidx.compose.ui.text.input.EditingBuffer r7) {
        /*
            r6 = this;
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = r7.hasComposition$ui_text_release()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L30
            int r0 = r7.getCompositionStart$ui_text_release()
            int r3 = r7.getCompositionStart$ui_text_release()
            int r4 = r7.getCompositionEnd$ui_text_release()
            java.lang.String r5 = r6.getText()
            r7.replace$ui_text_release(r3, r4, r5)
            java.lang.String r3 = r6.getText()
            int r3 = r3.length()
            if (r3 <= 0) goto L2c
            r3 = r1
            goto L2d
        L2c:
            r3 = r2
        L2d:
            if (r3 == 0) goto L5e
            goto L52
        L30:
            int r0 = r7.getSelectionStart$ui_text_release()
            int r3 = r7.getSelectionStart$ui_text_release()
            int r4 = r7.getSelectionEnd$ui_text_release()
            java.lang.String r5 = r6.getText()
            r7.replace$ui_text_release(r3, r4, r5)
            java.lang.String r3 = r6.getText()
            int r3 = r3.length()
            if (r3 <= 0) goto L4f
            r3 = r1
            goto L50
        L4f:
            r3 = r2
        L50:
            if (r3 == 0) goto L5e
        L52:
            java.lang.String r3 = r6.getText()
            int r3 = r3.length()
            int r3 = r3 + r0
            r7.setComposition$ui_text_release(r0, r3)
        L5e:
            int r0 = r7.getCursor$ui_text_release()
            int r3 = r6.newCursorPosition
            int r0 = r0 + r3
            if (r3 <= 0) goto L69
            int r0 = r0 - r1
            goto L72
        L69:
            java.lang.String r6 = r6.getText()
            int r6 = r6.length()
            int r0 = r0 - r6
        L72:
            int r6 = r7.getLength$ui_text_release()
            int r6 = kotlin.ranges.RangesKt.coerceIn(r0, r2, r6)
            r7.setCursor$ui_text_release(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.SetComposingTextCommand.applyTo(androidx.compose.ui.text.input.EditingBuffer):void");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetComposingTextCommand) {
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) obj;
            return Intrinsics.areEqual(getText(), setComposingTextCommand.getText()) && this.newCursorPosition == setComposingTextCommand.newCursorPosition;
        }
        return false;
    }

    @NotNull
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    @NotNull
    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        return (getText().hashCode() * 31) + this.newCursorPosition;
    }

    @NotNull
    public String toString() {
        return "SetComposingTextCommand(text='" + getText() + "', newCursorPosition=" + this.newCursorPosition + ')';
    }
}
