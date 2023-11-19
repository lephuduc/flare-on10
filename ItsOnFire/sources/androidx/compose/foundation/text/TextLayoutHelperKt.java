package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001au\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u001a\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"canReuse", "", "Landroidx/compose/ui/text/TextLayoutResult;", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "maxLines", "", "softWrap", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "canReuse-7_7YC6M", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/Font$ResourceLoader;J)Z", "canReuseLayout", "other", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextLayoutHelperKt {
    /* renamed from: canReuse-7_7YC6M  reason: not valid java name */
    public static final boolean m614canReuse7_7YC6M(@NotNull TextLayoutResult canReuse, @NotNull AnnotatedString text, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, int i2, boolean z, int i3, @NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull Font.ResourceLoader resourceLoader, long j2) {
        Intrinsics.checkNotNullParameter(canReuse, "$this$canReuse");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
        TextLayoutInput layoutInput = canReuse.getLayoutInput();
        if (Intrinsics.areEqual(layoutInput.getText(), text) && canReuseLayout(layoutInput.getStyle(), style) && Intrinsics.areEqual(layoutInput.getPlaceholders(), placeholders) && layoutInput.getMaxLines() == i2 && layoutInput.getSoftWrap() == z && TextOverflow.m3271equalsimpl0(layoutInput.m3055getOverflowgIe3tQ8(), i3) && Intrinsics.areEqual(layoutInput.getDensity(), density) && layoutInput.getLayoutDirection() == layoutDirection && Intrinsics.areEqual(layoutInput.getResourceLoader(), resourceLoader) && Constraints.m3295getMinWidthimpl(j2) == Constraints.m3295getMinWidthimpl(layoutInput.m3054getConstraintsmsEJaDk())) {
            return !(z || TextOverflow.m3271equalsimpl0(i3, TextOverflow.Companion.m3279getEllipsisgIe3tQ8())) || Constraints.m3293getMaxWidthimpl(j2) == Constraints.m3293getMaxWidthimpl(layoutInput.m3054getConstraintsmsEJaDk());
        }
        return false;
    }

    public static final boolean canReuseLayout(@NotNull TextStyle textStyle, @NotNull TextStyle other) {
        Intrinsics.checkNotNullParameter(textStyle, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return textStyle == other || (TextUnit.m3503equalsimpl0(textStyle.m3088getFontSizeXSAIIZE(), other.m3088getFontSizeXSAIIZE()) && Intrinsics.areEqual(textStyle.getFontWeight(), other.getFontWeight()) && Intrinsics.areEqual(textStyle.m3089getFontStyle4Lr2A7w(), other.m3089getFontStyle4Lr2A7w()) && Intrinsics.areEqual(textStyle.m3090getFontSynthesisZQGJjVo(), other.m3090getFontSynthesisZQGJjVo()) && Intrinsics.areEqual(textStyle.getFontFamily(), other.getFontFamily()) && Intrinsics.areEqual(textStyle.getFontFeatureSettings(), other.getFontFeatureSettings()) && TextUnit.m3503equalsimpl0(textStyle.m3091getLetterSpacingXSAIIZE(), other.m3091getLetterSpacingXSAIIZE()) && Intrinsics.areEqual(textStyle.m3086getBaselineShift5SSeXJ0(), other.m3086getBaselineShift5SSeXJ0()) && Intrinsics.areEqual(textStyle.getTextGeometricTransform(), other.getTextGeometricTransform()) && Intrinsics.areEqual(textStyle.getLocaleList(), other.getLocaleList()) && Color.m1393equalsimpl0(textStyle.m3085getBackground0d7_KjU(), other.m3085getBackground0d7_KjU()) && Intrinsics.areEqual(textStyle.m3093getTextAlignbuA522U(), other.m3093getTextAlignbuA522U()) && Intrinsics.areEqual(textStyle.m3094getTextDirectionmmuk1to(), other.m3094getTextDirectionmmuk1to()) && TextUnit.m3503equalsimpl0(textStyle.m3092getLineHeightXSAIIZE(), other.m3092getLineHeightXSAIIZE()) && Intrinsics.areEqual(textStyle.getTextIndent(), other.getTextIndent()));
    }
}
