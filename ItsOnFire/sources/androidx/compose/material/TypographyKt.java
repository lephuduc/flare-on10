package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"LocalTypography", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Typography;", "getLocalTypography", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "withDefaultFontFamily", "Landroidx/compose/ui/text/TextStyle;", "default", "Landroidx/compose/ui/text/font/FontFamily;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TypographyKt {
    @NotNull
    private static final ProvidableCompositionLocal<Typography> LocalTypography = CompositionLocalKt.staticCompositionLocalOf(TypographyKt$LocalTypography$1.INSTANCE);

    @NotNull
    public static final ProvidableCompositionLocal<Typography> getLocalTypography() {
        return LocalTypography;
    }

    public static final TextStyle withDefaultFontFamily(TextStyle textStyle, FontFamily fontFamily) {
        TextStyle m3084copyHL5avdY;
        if (textStyle.getFontFamily() != null) {
            return textStyle;
        }
        m3084copyHL5avdY = textStyle.m3084copyHL5avdY((r44 & 1) != 0 ? textStyle.m3087getColor0d7_KjU() : 0L, (r44 & 2) != 0 ? textStyle.m3088getFontSizeXSAIIZE() : 0L, (r44 & 4) != 0 ? textStyle.fontWeight : null, (r44 & 8) != 0 ? textStyle.m3089getFontStyle4Lr2A7w() : null, (r44 & 16) != 0 ? textStyle.m3090getFontSynthesisZQGJjVo() : null, (r44 & 32) != 0 ? textStyle.fontFamily : fontFamily, (r44 & 64) != 0 ? textStyle.fontFeatureSettings : null, (r44 & 128) != 0 ? textStyle.m3091getLetterSpacingXSAIIZE() : 0L, (r44 & 256) != 0 ? textStyle.m3086getBaselineShift5SSeXJ0() : null, (r44 & 512) != 0 ? textStyle.textGeometricTransform : null, (r44 & 1024) != 0 ? textStyle.localeList : null, (r44 & 2048) != 0 ? textStyle.m3085getBackground0d7_KjU() : 0L, (r44 & 4096) != 0 ? textStyle.textDecoration : null, (r44 & 8192) != 0 ? textStyle.shadow : null, (r44 & 16384) != 0 ? textStyle.m3093getTextAlignbuA522U() : null, (r44 & 32768) != 0 ? textStyle.m3094getTextDirectionmmuk1to() : null, (r44 & 65536) != 0 ? textStyle.m3092getLineHeightXSAIIZE() : 0L, (r44 & 131072) != 0 ? textStyle.textIndent : null);
        return m3084copyHL5avdY;
    }
}
