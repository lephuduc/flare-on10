package androidx.compose.ui.text.android.selection;

import androidx.appcompat.R;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import androidx.core.app.NotificationCompat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InternalPlatformTextApi
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordBoundary;", "", "locale", "Ljava/util/Locale;", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "", "(Ljava/util/Locale;Ljava/lang/CharSequence;)V", "wordIterator", "Landroidx/compose/ui/text/android/selection/WordIterator;", "getWordEnd", "", "offset", "getWordStart", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class WordBoundary {
    @NotNull
    private final WordIterator wordIterator;

    public WordBoundary(@NotNull Locale locale, @NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(text, "text");
        this.wordIterator = new WordIterator(text, 0, text.length(), locale);
    }

    public final int getWordEnd(int i2) {
        boolean isAfterPunctuation = this.wordIterator.isAfterPunctuation(this.wordIterator.nextBoundary(i2));
        WordIterator wordIterator = this.wordIterator;
        int punctuationEnd = isAfterPunctuation ? wordIterator.getPunctuationEnd(i2) : wordIterator.getNextWordEndOnTwoWordBoundary(i2);
        return punctuationEnd == -1 ? i2 : punctuationEnd;
    }

    public final int getWordStart(int i2) {
        boolean isOnPunctuation = this.wordIterator.isOnPunctuation(this.wordIterator.prevBoundary(i2));
        WordIterator wordIterator = this.wordIterator;
        int punctuationBeginning = isOnPunctuation ? wordIterator.getPunctuationBeginning(i2) : wordIterator.getPrevWordBeginningOnTwoWordsBoundary(i2);
        return punctuationBeginning == -1 ? i2 : punctuationBeginning;
    }
}
