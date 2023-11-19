package androidx.compose.ui.text;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\b\u0004\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u001a)\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"TextRange", "Landroidx/compose/ui/text/TextRange;", FirebaseAnalytics.Param.INDEX, "", "(I)J", "start", "end", "(II)J", "packWithCheck", "", "constrain", "minimumValue", "maximumValue", "constrain-8ffj60Q", "(JII)J", "substring", "", "", "range", "substring-FDrldGo", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextRangeKt {
    public static final long TextRange(int i2) {
        return TextRange(i2, i2);
    }

    public static final long TextRange(int i2, int i3) {
        return TextRange.m3064constructorimpl(packWithCheck(i2, i3));
    }

    /* renamed from: constrain-8ffj60Q  reason: not valid java name */
    public static final long m3081constrain8ffj60Q(long j2, int i2, int i3) {
        int coerceIn;
        int coerceIn2;
        coerceIn = RangesKt___RangesKt.coerceIn(TextRange.m3075getStartimpl(j2), i2, i3);
        coerceIn2 = RangesKt___RangesKt.coerceIn(TextRange.m3070getEndimpl(j2), i2, i3);
        return (coerceIn == TextRange.m3075getStartimpl(j2) && coerceIn2 == TextRange.m3070getEndimpl(j2)) ? j2 : TextRange(coerceIn, coerceIn2);
    }

    private static final long packWithCheck(int i2, int i3) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i2 + ']').toString());
        }
        if (i3 >= 0) {
            return (i3 & 4294967295L) | (i2 << 32);
        }
        throw new IllegalArgumentException(("end cannot negative. [end: " + i3 + ']').toString());
    }

    @NotNull
    /* renamed from: substring-FDrldGo  reason: not valid java name */
    public static final String m3082substringFDrldGo(@NotNull CharSequence substring, long j2) {
        Intrinsics.checkNotNullParameter(substring, "$this$substring");
        return substring.subSequence(TextRange.m3073getMinimpl(j2), TextRange.m3072getMaximpl(j2)).toString();
    }
}
