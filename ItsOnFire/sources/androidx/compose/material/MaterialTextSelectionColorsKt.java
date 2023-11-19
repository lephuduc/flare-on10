package androidx.compose.material;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"DefaultSelectionBackgroundAlpha", "", "DesiredContrastRatio", "MinimumSelectionBackgroundAlpha", "binarySearchForAccessibleSelectionColorAlpha", "selectionColor", "Landroidx/compose/ui/graphics/Color;", "textColor", "backgroundColor", "binarySearchForAccessibleSelectionColorAlpha-ysEtTa8", "(JJJ)F", "calculateContrastRatio", "foreground", "background", "calculateContrastRatio--OWjLjI", "(JJ)F", "selectionColorAlpha", "calculateContrastRatio-nb2GgbA", "(JFJJ)F", "calculateSelectionBackgroundColor", "calculateSelectionBackgroundColor-ysEtTa8", "(JJJ)J", "rememberTextSelectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "colors", "Landroidx/compose/material/Colors;", "(Landroidx/compose/material/Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class MaterialTextSelectionColorsKt {
    private static final float DefaultSelectionBackgroundAlpha = 0.4f;
    private static final float DesiredContrastRatio = 4.5f;
    private static final float MinimumSelectionBackgroundAlpha = 0.2f;

    /* renamed from: binarySearchForAccessibleSelectionColorAlpha-ysEtTa8  reason: not valid java name */
    private static final float m870binarySearchForAccessibleSelectionColorAlphaysEtTa8(long j2, long j3, long j4) {
        float f2 = DefaultSelectionBackgroundAlpha;
        float f3 = 0.2f;
        float f4 = 0.4f;
        for (int i2 = 0; i2 < 7; i2++) {
            float m872calculateContrastRationb2GgbA = (m872calculateContrastRationb2GgbA(j2, f2, j3, j4) / DesiredContrastRatio) - 1.0f;
            if (0.0f <= m872calculateContrastRationb2GgbA && m872calculateContrastRationb2GgbA <= 0.01f) {
                break;
            }
            if (m872calculateContrastRationb2GgbA < 0.0f) {
                f4 = f2;
            } else {
                f3 = f2;
            }
            f2 = (f4 + f3) / 2.0f;
        }
        return f2;
    }

    /* renamed from: calculateContrastRatio--OWjLjI  reason: not valid java name */
    public static final float m871calculateContrastRatioOWjLjI(long j2, long j3) {
        float m1445luminance8_81llA = ColorKt.m1445luminance8_81llA(j2) + 0.05f;
        float m1445luminance8_81llA2 = ColorKt.m1445luminance8_81llA(j3) + 0.05f;
        return Math.max(m1445luminance8_81llA, m1445luminance8_81llA2) / Math.min(m1445luminance8_81llA, m1445luminance8_81llA2);
    }

    /* renamed from: calculateContrastRatio-nb2GgbA  reason: not valid java name */
    private static final float m872calculateContrastRationb2GgbA(long j2, float f2, long j3, long j4) {
        long m1438compositeOverOWjLjI = ColorKt.m1438compositeOverOWjLjI(Color.m1391copywmQWz5c$default(j2, f2, 0.0f, 0.0f, 0.0f, 14, null), j4);
        return m871calculateContrastRatioOWjLjI(ColorKt.m1438compositeOverOWjLjI(j3, m1438compositeOverOWjLjI), m1438compositeOverOWjLjI);
    }

    /* renamed from: calculateSelectionBackgroundColor-ysEtTa8  reason: not valid java name */
    public static final long m873calculateSelectionBackgroundColorysEtTa8(long j2, long j3, long j4) {
        return Color.m1391copywmQWz5c$default(j2, m872calculateContrastRationb2GgbA(j2, DefaultSelectionBackgroundAlpha, j3, j4) >= DesiredContrastRatio ? DefaultSelectionBackgroundAlpha : m872calculateContrastRationb2GgbA(j2, 0.2f, j3, j4) < DesiredContrastRatio ? 0.2f : m870binarySearchForAccessibleSelectionColorAlphaysEtTa8(j2, j3, j4), 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Composable
    @NotNull
    public static final TextSelectionColors rememberTextSelectionColors(@NotNull Colors colors, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        composer.startReplaceableGroup(35572393);
        long m767getPrimary0d7_KjU = colors.m767getPrimary0d7_KjU();
        long m760getBackground0d7_KjU = colors.m760getBackground0d7_KjU();
        composer.startReplaceableGroup(35572910);
        long m784contentColorFor4WTKRHQ = ColorsKt.m784contentColorFor4WTKRHQ(colors, m760getBackground0d7_KjU);
        if (!(m784contentColorFor4WTKRHQ != Color.Companion.m1428getUnspecified0d7_KjU())) {
            m784contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m1402unboximpl();
        }
        composer.endReplaceableGroup();
        long m1391copywmQWz5c$default = Color.m1391copywmQWz5c$default(m784contentColorFor4WTKRHQ, ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        Color m1382boximpl = Color.m1382boximpl(m767getPrimary0d7_KjU);
        Color m1382boximpl2 = Color.m1382boximpl(m760getBackground0d7_KjU);
        Color m1382boximpl3 = Color.m1382boximpl(m1391copywmQWz5c$default);
        composer.startReplaceableGroup(-3686095);
        boolean changed = composer.changed(m1382boximpl) | composer.changed(m1382boximpl2) | composer.changed(m1382boximpl3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextSelectionColors(colors.m767getPrimary0d7_KjU(), m873calculateSelectionBackgroundColorysEtTa8(m767getPrimary0d7_KjU, m1391copywmQWz5c$default, m760getBackground0d7_KjU), null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TextSelectionColors textSelectionColors = (TextSelectionColors) rememberedValue;
        composer.endReplaceableGroup();
        return textSelectionColors;
    }
}
