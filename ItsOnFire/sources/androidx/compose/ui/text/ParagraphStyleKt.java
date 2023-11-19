package androidx.compose.ui.text;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextIndentKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"lerp", "Landroidx/compose/ui/text/ParagraphStyle;", "start", "stop", "fraction", "", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ParagraphStyleKt {
    @Stable
    @NotNull
    public static final ParagraphStyle lerp(@NotNull ParagraphStyle start, @NotNull ParagraphStyle stop, float f2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        TextAlign textAlign = (TextAlign) SpanStyleKt.lerpDiscrete(start.m3011getTextAlignbuA522U(), stop.m3011getTextAlignbuA522U(), f2);
        TextDirection textDirection = (TextDirection) SpanStyleKt.lerpDiscrete(start.m3012getTextDirectionmmuk1to(), stop.m3012getTextDirectionmmuk1to(), f2);
        long m3051lerpTextUnitInheritableC3pnCVY = SpanStyleKt.m3051lerpTextUnitInheritableC3pnCVY(start.m3010getLineHeightXSAIIZE(), stop.m3010getLineHeightXSAIIZE(), f2);
        TextIndent textIndent = start.getTextIndent();
        if (textIndent == null) {
            textIndent = new TextIndent(0L, 0L, 3, null);
        }
        TextIndent textIndent2 = stop.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = new TextIndent(0L, 0L, 3, null);
        }
        return new ParagraphStyle(textAlign, textDirection, m3051lerpTextUnitInheritableC3pnCVY, TextIndentKt.lerp(textIndent, textIndent2, f2), null);
    }
}
