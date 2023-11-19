package androidx.compose.ui.text.input;

import androidx.appcompat.R;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\b\u0010\u0014\u001a\u00020\u0005H\u0002J\u0011\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0086\u0002J\u0006\u0010\u0018\u001a\u00020\u0005J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J\u001e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/input/GapBuffer;", "", "initBuffer", "", "initGapStart", "", "initGapEnd", "([CII)V", "buffer", "capacity", "gapEnd", "gapStart", "append", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "delete", "start", "end", "gapLength", "get", "", FirebaseAnalytics.Param.INDEX, "length", "makeSureAvailableSpace", "requestSize", "replace", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "", "toString", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class GapBuffer {
    @NotNull
    private char[] buffer;
    private int capacity;
    private int gapEnd;
    private int gapStart;

    public GapBuffer(@NotNull char[] initBuffer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(initBuffer, "initBuffer");
        this.capacity = initBuffer.length;
        this.buffer = initBuffer;
        this.gapStart = i2;
        this.gapEnd = i3;
    }

    private final void delete(int i2, int i3) {
        int i4 = this.gapStart;
        if (i2 < i4 && i3 <= i4) {
            int i5 = i4 - i3;
            char[] cArr = this.buffer;
            ArraysKt___ArraysJvmKt.copyInto(cArr, cArr, this.gapEnd - i5, i3, i4);
            this.gapStart = i2;
            this.gapEnd -= i5;
        } else if (i2 < i4 && i3 >= i4) {
            this.gapEnd = i3 + gapLength();
            this.gapStart = i2;
        } else {
            int gapLength = i2 + gapLength();
            int gapLength2 = i3 + gapLength();
            int i6 = this.gapEnd;
            int i7 = gapLength - i6;
            char[] cArr2 = this.buffer;
            ArraysKt___ArraysJvmKt.copyInto(cArr2, cArr2, this.gapStart, i6, gapLength);
            this.gapStart += i7;
            this.gapEnd = gapLength2;
        }
    }

    private final int gapLength() {
        return this.gapEnd - this.gapStart;
    }

    private final void makeSureAvailableSpace(int i2) {
        if (i2 <= gapLength()) {
            return;
        }
        int gapLength = i2 - gapLength();
        int i3 = this.capacity;
        do {
            i3 *= 2;
        } while (i3 - this.capacity < gapLength);
        char[] cArr = new char[i3];
        ArraysKt___ArraysJvmKt.copyInto(this.buffer, cArr, 0, 0, this.gapStart);
        int i4 = this.capacity;
        int i5 = this.gapEnd;
        int i6 = i4 - i5;
        int i7 = i3 - i6;
        ArraysKt___ArraysJvmKt.copyInto(this.buffer, cArr, i7, i5, i6 + i5);
        this.buffer = cArr;
        this.capacity = i3;
        this.gapEnd = i7;
    }

    public final void append(@NotNull StringBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.append(this.buffer, 0, this.gapStart);
        char[] cArr = this.buffer;
        int i2 = this.gapEnd;
        builder.append(cArr, i2, this.capacity - i2);
    }

    public final char get(int i2) {
        int i3 = this.gapStart;
        return i2 < i3 ? this.buffer[i2] : this.buffer[(i2 - i3) + this.gapEnd];
    }

    public final int length() {
        return this.capacity - gapLength();
    }

    public final void replace(int i2, int i3, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        makeSureAvailableSpace(text.length() - (i3 - i2));
        delete(i2, i3);
        GapBufferKt.toCharArray$default(text, this.buffer, this.gapStart, 0, 0, 12, null);
        this.gapStart += text.length();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) sb);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply { append(this) }.toString()");
        return sb2;
    }
}
