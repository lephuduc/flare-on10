package androidx.compose.ui.text.input;

import androidx.appcompat.R;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 52\u00020\u0001:\u00015B\u001a\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\bJ\r\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b\u001eJ\r\u0010\u001f\u001a\u00020\u001dH\u0000¢\u0006\u0002\b J\u001d\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nH\u0000¢\u0006\u0002\b$J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\nH\u0080\u0002¢\u0006\u0002\b(J\r\u0010)\u001a\u00020*H\u0000¢\u0006\u0002\b+J%\u0010,\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0007H\u0000¢\u0006\u0002\b-J%\u0010,\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0002\b-J\u001d\u0010.\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nH\u0000¢\u0006\u0002\b/J\u001d\u00100\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nH\u0000¢\u0006\u0002\b1J\r\u00102\u001a\u00020\u0007H\u0000¢\u0006\u0002\b3J\b\u00104\u001a\u00020\u0003H\u0016R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u001e\u0010\u0018\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\rR\u001e\u0010\u001a\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer;", "", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "", "selection", "Landroidx/compose/ui/text/TextRange;", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "", "compositionEnd", "getCompositionEnd$ui_text_release", "()I", "compositionStart", "getCompositionStart$ui_text_release", "cursor", "getCursor$ui_text_release", "setCursor$ui_text_release", "(I)V", "gapBuffer", "Landroidx/compose/ui/text/input/PartialGapBuffer;", "length", "getLength$ui_text_release", "selectionEnd", "getSelectionEnd$ui_text_release", "selectionStart", "getSelectionStart$ui_text_release", "cancelComposition", "", "cancelComposition$ui_text_release", "commitComposition", "commitComposition$ui_text_release", "delete", "start", "end", "delete$ui_text_release", "get", "", FirebaseAnalytics.Param.INDEX, "get$ui_text_release", "hasComposition", "", "hasComposition$ui_text_release", "replace", "replace$ui_text_release", "setComposition", "setComposition$ui_text_release", "setSelection", "setSelection$ui_text_release", "toAnnotatedString", "toAnnotatedString$ui_text_release", "toString", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class EditingBuffer {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int NOWHERE = -1;
    private int compositionEnd;
    private int compositionStart;
    @NotNull
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer$Companion;", "", "()V", "NOWHERE", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private EditingBuffer(AnnotatedString annotatedString, long j2) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.selectionStart = TextRange.m3073getMinimpl(j2);
        this.selectionEnd = TextRange.m3072getMaximpl(j2);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int m3073getMinimpl = TextRange.m3073getMinimpl(j2);
        int m3072getMaximpl = TextRange.m3072getMaximpl(j2);
        if (m3073getMinimpl < 0 || m3073getMinimpl > annotatedString.length()) {
            throw new IndexOutOfBoundsException("start (" + m3073getMinimpl + ") offset is outside of text region " + annotatedString.length());
        } else if (m3072getMaximpl < 0 || m3072getMaximpl > annotatedString.length()) {
            throw new IndexOutOfBoundsException("end (" + m3072getMaximpl + ") offset is outside of text region " + annotatedString.length());
        } else if (m3073getMinimpl <= m3072getMaximpl) {
        } else {
            throw new IllegalArgumentException("Do not set reversed range: " + m3073getMinimpl + " > " + m3072getMaximpl);
        }
    }

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j2);
    }

    private EditingBuffer(String str, long j2) {
        this(new AnnotatedString(str, null, null, 6, null), j2, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ EditingBuffer(String str, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2);
    }

    public final void cancelComposition$ui_text_release() {
        replace$ui_text_release(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void commitComposition$ui_text_release() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete$ui_text_release(int i2, int i3) {
        long TextRange = TextRangeKt.TextRange(i2, i3);
        this.gapBuffer.replace(i2, i3, "");
        long m3133updateRangeAfterDeletepWDy79M = EditingBufferKt.m3133updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), TextRange);
        this.selectionStart = TextRange.m3073getMinimpl(m3133updateRangeAfterDeletepWDy79M);
        this.selectionEnd = TextRange.m3072getMaximpl(m3133updateRangeAfterDeletepWDy79M);
        if (hasComposition$ui_text_release()) {
            long m3133updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m3133updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), TextRange);
            if (TextRange.m3069getCollapsedimpl(m3133updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text_release();
                return;
            }
            this.compositionStart = TextRange.m3073getMinimpl(m3133updateRangeAfterDeletepWDy79M2);
            this.compositionEnd = TextRange.m3072getMaximpl(m3133updateRangeAfterDeletepWDy79M2);
        }
    }

    public final char get$ui_text_release(int i2) {
        return this.gapBuffer.get(i2);
    }

    public final int getCompositionEnd$ui_text_release() {
        return this.compositionEnd;
    }

    public final int getCompositionStart$ui_text_release() {
        return this.compositionStart;
    }

    public final int getCursor$ui_text_release() {
        int i2 = this.selectionStart;
        int i3 = this.selectionEnd;
        if (i2 == i3) {
            return i3;
        }
        return -1;
    }

    public final int getLength$ui_text_release() {
        return this.gapBuffer.getLength();
    }

    public final int getSelectionEnd$ui_text_release() {
        return this.selectionEnd;
    }

    public final int getSelectionStart$ui_text_release() {
        return this.selectionStart;
    }

    public final boolean hasComposition$ui_text_release() {
        return this.compositionStart != -1;
    }

    public final void replace$ui_text_release(int i2, int i3, @NotNull AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        replace$ui_text_release(i2, i3, text.getText());
    }

    public final void replace$ui_text_release(int i2, int i3, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i2 + ") offset is outside of text region " + this.gapBuffer.getLength());
        } else if (i3 < 0 || i3 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i3 + ") offset is outside of text region " + this.gapBuffer.getLength());
        } else if (i2 <= i3) {
            this.gapBuffer.replace(i2, i3, text);
            this.selectionStart = text.length() + i2;
            this.selectionEnd = i2 + text.length();
            this.compositionStart = -1;
            this.compositionEnd = -1;
        } else {
            throw new IllegalArgumentException("Do not set reversed range: " + i2 + " > " + i3);
        }
    }

    public final void setComposition$ui_text_release(int i2, int i3) {
        if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i2 + ") offset is outside of text region " + this.gapBuffer.getLength());
        } else if (i3 < 0 || i3 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i3 + ") offset is outside of text region " + this.gapBuffer.getLength());
        } else if (i2 < i3) {
            this.compositionStart = i2;
            this.compositionEnd = i3;
        } else {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i2 + " > " + i3);
        }
    }

    public final void setCursor$ui_text_release(int i2) {
        setSelection$ui_text_release(i2, i2);
    }

    public final void setSelection$ui_text_release(int i2, int i3) {
        if (i2 < 0 || i2 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + i2 + ") offset is outside of text region " + this.gapBuffer.getLength());
        } else if (i3 < 0 || i3 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + i3 + ") offset is outside of text region " + this.gapBuffer.getLength());
        } else if (i2 <= i3) {
            this.selectionStart = i2;
            this.selectionEnd = i3;
        } else {
            throw new IllegalArgumentException("Do not set reversed range: " + i2 + " > " + i3);
        }
    }

    @NotNull
    public final AnnotatedString toAnnotatedString$ui_text_release() {
        return new AnnotatedString(toString(), null, null, 6, null);
    }

    @NotNull
    public String toString() {
        return this.gapBuffer.toString();
    }
}
