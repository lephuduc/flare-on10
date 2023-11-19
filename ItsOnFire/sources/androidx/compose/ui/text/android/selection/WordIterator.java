package androidx.compose.ui.text.android.selection;

import androidx.appcompat.R;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0005J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0005J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator;", "", "charSequence", "", "start", "", "end", "locale", "Ljava/util/Locale;", "(Ljava/lang/CharSequence;IILjava/util/Locale;)V", "iterator", "Ljava/text/BreakIterator;", "checkOffsetIsValid", "", "offset", "getBeginning", "getPrevWordBeginningOnTwoWordsBoundary", "", "getEnd", "getNextWordEndOnTwoWordBoundary", "getPunctuationBeginning", "getPunctuationEnd", "isAfterLetterOrDigit", "isAfterPunctuation", "isOnLetterOrDigit", "isOnPunctuation", "isPunctuationEndBoundary", "isPunctuationStartBoundary", "nextBoundary", "prevBoundary", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class WordIterator {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int WINDOW_WIDTH = 50;
    @NotNull
    private final CharSequence charSequence;
    private final int end;
    @NotNull
    private final BreakIterator iterator;
    private final int start;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator$Companion;", "", "()V", "WINDOW_WIDTH", "", "isPunctuation", "", "cp", "isPunctuation$ui_text_release", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isPunctuation$ui_text_release(int i2) {
            int type = Character.getType(i2);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public WordIterator(@NotNull CharSequence charSequence, int i2, int i3, @Nullable Locale locale) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        this.charSequence = charSequence;
        boolean z = true;
        if (!(i2 >= 0 && i2 <= charSequence.length())) {
            throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
        }
        if (!((i3 < 0 || i3 > charSequence.length()) ? false : z)) {
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        Intrinsics.checkNotNullExpressionValue(wordInstance, "getWordInstance(locale)");
        this.iterator = wordInstance;
        this.start = Math.max(0, i2 - 50);
        this.end = Math.min(charSequence.length(), i3 + 50);
        wordInstance.setText(new CharSequenceCharacterIterator(charSequence, i2, i3));
    }

    private final void checkOffsetIsValid(int i2) {
        int i3 = this.start;
        boolean z = false;
        if (i2 <= this.end && i3 <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("Invalid offset: " + i2 + ". Valid range is [" + this.start + " , " + this.end + ']').toString());
    }

    private final int getBeginning(int i2, boolean z) {
        checkOffsetIsValid(i2);
        if (isOnLetterOrDigit(i2)) {
            return (!this.iterator.isBoundary(i2) || (isAfterLetterOrDigit(i2) && z)) ? this.iterator.preceding(i2) : i2;
        } else if (isAfterLetterOrDigit(i2)) {
            return this.iterator.preceding(i2);
        } else {
            return -1;
        }
    }

    private final int getEnd(int i2, boolean z) {
        checkOffsetIsValid(i2);
        if (isAfterLetterOrDigit(i2)) {
            return (!this.iterator.isBoundary(i2) || (isOnLetterOrDigit(i2) && z)) ? this.iterator.following(i2) : i2;
        } else if (isOnLetterOrDigit(i2)) {
            return this.iterator.following(i2);
        } else {
            return -1;
        }
    }

    private final boolean isAfterLetterOrDigit(int i2) {
        return (i2 <= this.end && this.start + 1 <= i2) && Character.isLetterOrDigit(Character.codePointBefore(this.charSequence, i2));
    }

    private final boolean isOnLetterOrDigit(int i2) {
        return (i2 < this.end && this.start <= i2) && Character.isLetterOrDigit(Character.codePointAt(this.charSequence, i2));
    }

    private final boolean isPunctuationEndBoundary(int i2) {
        return !isOnPunctuation(i2) && isAfterPunctuation(i2);
    }

    private final boolean isPunctuationStartBoundary(int i2) {
        return isOnPunctuation(i2) && !isAfterPunctuation(i2);
    }

    public final int getNextWordEndOnTwoWordBoundary(int i2) {
        return getEnd(i2, true);
    }

    public final int getPrevWordBeginningOnTwoWordsBoundary(int i2) {
        return getBeginning(i2, true);
    }

    public final int getPunctuationBeginning(int i2) {
        checkOffsetIsValid(i2);
        while (i2 != -1 && !isPunctuationStartBoundary(i2)) {
            i2 = prevBoundary(i2);
        }
        return i2;
    }

    public final int getPunctuationEnd(int i2) {
        checkOffsetIsValid(i2);
        while (i2 != -1 && !isPunctuationEndBoundary(i2)) {
            i2 = nextBoundary(i2);
        }
        return i2;
    }

    public final boolean isAfterPunctuation(int i2) {
        boolean z = true;
        int i3 = this.start + 1;
        if (i2 > this.end || i3 > i2) {
            z = false;
        }
        if (z) {
            return Companion.isPunctuation$ui_text_release(Character.codePointBefore(this.charSequence, i2));
        }
        return false;
    }

    public final boolean isOnPunctuation(int i2) {
        if (i2 < this.end && this.start <= i2) {
            return Companion.isPunctuation$ui_text_release(Character.codePointAt(this.charSequence, i2));
        }
        return false;
    }

    public final int nextBoundary(int i2) {
        checkOffsetIsValid(i2);
        return this.iterator.following(i2);
    }

    public final int prevBoundary(int i2) {
        checkOffsetIsValid(i2);
        return this.iterator.preceding(i2);
    }
}
