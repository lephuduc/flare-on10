package androidx.compose.ui.util;

import kotlin.Metadata;
import kotlin.math.MathKt__MathJVMKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u001e\u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u001e\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0001¨\u0006\u0007"}, d2 = {"lerp", "", "start", "stop", "fraction", "", "", "ui-util_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class MathHelpersKt {
    public static final float lerp(float f2, float f3, float f4) {
        return ((1 - f4) * f2) + (f4 * f3);
    }

    public static final int lerp(int i2, int i3, float f2) {
        int roundToInt;
        roundToInt = MathKt__MathJVMKt.roundToInt((i3 - i2) * f2);
        return i2 + roundToInt;
    }

    public static final long lerp(long j2, long j3, float f2) {
        long roundToLong;
        roundToLong = MathKt__MathJVMKt.roundToLong((j3 - j2) * f2);
        return j2 + roundToLong;
    }
}
