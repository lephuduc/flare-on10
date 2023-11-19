package androidx.compose.ui.text.android;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\u0004"}, d2 = {"getTextDirectionHeuristic", "Landroid/text/TextDirectionHeuristic;", "textDirectionHeuristic", "", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextLayoutKt {
    @RequiresApi(api = 18)
    @NotNull
    public static final TextDirectionHeuristic getTextDirectionHeuristic(int i2) {
        TextDirectionHeuristic textDirectionHeuristic;
        String str;
        if (i2 == 0) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
            str = "LTR";
        } else if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    str = "FIRSTSTRONG_RTL";
                } else if (i2 == 4) {
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    str = "ANYRTL_LTR";
                } else if (i2 == 5) {
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    str = "LOCALE";
                }
            }
            TextDirectionHeuristic FIRSTSTRONG_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            Intrinsics.checkNotNullExpressionValue(FIRSTSTRONG_LTR, "FIRSTSTRONG_LTR");
            return FIRSTSTRONG_LTR;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
            str = "RTL";
        }
        Intrinsics.checkNotNullExpressionValue(textDirectionHeuristic, str);
        return textDirectionHeuristic;
    }
}
