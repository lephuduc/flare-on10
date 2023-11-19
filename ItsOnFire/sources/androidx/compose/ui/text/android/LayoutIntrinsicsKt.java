package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import androidx.appcompat.R;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.core.app.NotificationCompat;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H\u0002¨\u0006\u000b"}, d2 = {"minIntrinsicWidth", "", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "", "paint", "Landroid/text/TextPaint;", "shouldIncreaseMaxIntrinsic", "", "desiredWidth", "charSequence", "textPaint", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LayoutIntrinsicsKt {
    public static final float minIntrinsicWidth(@NotNull CharSequence text, @NotNull TextPaint paint) {
        Pair pair;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        BreakIterator lineInstance = BreakIterator.getLineInstance(paint.getTextLocale());
        int i2 = 0;
        lineInstance.setText(new CharSequenceCharacterIterator(text, 0, text.length()));
        PriorityQueue<Pair> priorityQueue = new PriorityQueue(10, new Comparator() { // from class: androidx.compose.ui.text.android.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m3096minIntrinsicWidth$lambda0;
                m3096minIntrinsicWidth$lambda0 = LayoutIntrinsicsKt.m3096minIntrinsicWidth$lambda0((Pair) obj, (Pair) obj2);
                return m3096minIntrinsicWidth$lambda0;
            }
        });
        while (true) {
            int i3 = i2;
            i2 = lineInstance.next();
            if (i2 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                pair = new Pair(Integer.valueOf(i3), Integer.valueOf(i2));
            } else {
                Pair pair2 = (Pair) priorityQueue.peek();
                if (pair2 != null && ((Number) pair2.getSecond()).intValue() - ((Number) pair2.getFirst()).intValue() < i2 - i3) {
                    priorityQueue.poll();
                    pair = new Pair(Integer.valueOf(i3), Integer.valueOf(i2));
                }
            }
            priorityQueue.add(pair);
        }
        float f2 = 0.0f;
        for (Pair pair3 : priorityQueue) {
            f2 = Math.max(f2, Layout.getDesiredWidth(text, ((Number) pair3.component1()).intValue(), ((Number) pair3.component2()).intValue(), paint));
        }
        return f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: minIntrinsicWidth$lambda-0  reason: not valid java name */
    public static final int m3096minIntrinsicWidth$lambda0(Pair pair, Pair pair2) {
        return (((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue()) - (((Number) pair2.getSecond()).intValue() - ((Number) pair2.getFirst()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldIncreaseMaxIntrinsic(float f2, CharSequence charSequence, TextPaint textPaint) {
        if (!(f2 == 0.0f) && (charSequence instanceof Spanned)) {
            if (!(textPaint.getLetterSpacing() == 0.0f)) {
                return true;
            }
            Spanned spanned = (Spanned) charSequence;
            if (SpannedExtensionsKt.hasSpan(spanned, LetterSpacingSpanPx.class) || SpannedExtensionsKt.hasSpan(spanned, LetterSpacingSpanEm.class)) {
                return true;
            }
        }
        return false;
    }
}
