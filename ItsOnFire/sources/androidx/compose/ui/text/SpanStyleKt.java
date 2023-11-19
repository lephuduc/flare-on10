package androidx.compose.ui.text;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a+\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0006\u0010\t\u001a\u0002H\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0002\u0010\n\u001a-\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"lerp", "Landroidx/compose/ui/text/SpanStyle;", "start", "stop", "fraction", "", "lerpDiscrete", "T", "a", "b", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "lerpTextUnitInheritable", "Landroidx/compose/ui/unit/TextUnit;", "t", "lerpTextUnitInheritable-C3pnCVY", "(JJF)J", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SpanStyleKt {
    @NotNull
    public static final SpanStyle lerp(@NotNull SpanStyle start, @NotNull SpanStyle stop, float f2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        long m1444lerpjxsXWHM = ColorKt.m1444lerpjxsXWHM(start.m3046getColor0d7_KjU(), stop.m3046getColor0d7_KjU(), f2);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(start.getFontFamily(), stop.getFontFamily(), f2);
        long m3051lerpTextUnitInheritableC3pnCVY = m3051lerpTextUnitInheritableC3pnCVY(start.m3047getFontSizeXSAIIZE(), stop.m3047getFontSizeXSAIIZE(), f2);
        FontWeight fontWeight = start.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = stop.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.Companion.getNormal();
        }
        FontWeight lerp = FontWeightKt.lerp(fontWeight, fontWeight2, f2);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(start.m3048getFontStyle4Lr2A7w(), stop.m3048getFontStyle4Lr2A7w(), f2);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(start.m3049getFontSynthesisZQGJjVo(), stop.m3049getFontSynthesisZQGJjVo(), f2);
        String str = (String) lerpDiscrete(start.getFontFeatureSettings(), stop.getFontFeatureSettings(), f2);
        long m3051lerpTextUnitInheritableC3pnCVY2 = m3051lerpTextUnitInheritableC3pnCVY(start.m3050getLetterSpacingXSAIIZE(), stop.m3050getLetterSpacingXSAIIZE(), f2);
        BaselineShift m3045getBaselineShift5SSeXJ0 = start.m3045getBaselineShift5SSeXJ0();
        float m3226constructorimpl = m3045getBaselineShift5SSeXJ0 == null ? BaselineShift.m3226constructorimpl(0.0f) : m3045getBaselineShift5SSeXJ0.m3231unboximpl();
        BaselineShift m3045getBaselineShift5SSeXJ02 = stop.m3045getBaselineShift5SSeXJ0();
        float m3238lerpjWV1Mfo = BaselineShiftKt.m3238lerpjWV1Mfo(m3226constructorimpl, m3045getBaselineShift5SSeXJ02 == null ? BaselineShift.m3226constructorimpl(0.0f) : m3045getBaselineShift5SSeXJ02.m3231unboximpl(), f2);
        TextGeometricTransform textGeometricTransform = start.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = stop.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform lerp2 = TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f2);
        LocaleList localeList = (LocaleList) lerpDiscrete(start.getLocaleList(), stop.getLocaleList(), f2);
        long m1444lerpjxsXWHM2 = ColorKt.m1444lerpjxsXWHM(start.m3044getBackground0d7_KjU(), stop.m3044getBackground0d7_KjU(), f2);
        TextDecoration textDecoration = (TextDecoration) lerpDiscrete(start.getTextDecoration(), stop.getTextDecoration(), f2);
        Shadow shadow = start.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadow2 = stop.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        return new SpanStyle(m1444lerpjxsXWHM, m3051lerpTextUnitInheritableC3pnCVY, lerp, fontStyle, fontSynthesis, fontFamily, str, m3051lerpTextUnitInheritableC3pnCVY2, BaselineShift.m3225boximpl(m3238lerpjWV1Mfo), lerp2, localeList, m1444lerpjxsXWHM2, textDecoration, ShadowKt.lerp(shadow, shadow2, f2), null);
    }

    public static final <T> T lerpDiscrete(T t2, T t3, float f2) {
        return ((double) f2) < 0.5d ? t2 : t3;
    }

    /* renamed from: lerpTextUnitInheritable-C3pnCVY  reason: not valid java name */
    public static final long m3051lerpTextUnitInheritableC3pnCVY(long j2, long j3, float f2) {
        return (TextUnitKt.m3524isUnspecifiedR2X_6o(j2) || TextUnitKt.m3524isUnspecifiedR2X_6o(j3)) ? ((TextUnit) lerpDiscrete(TextUnit.m3496boximpl(j2), TextUnit.m3496boximpl(j3), f2)).m3515unboximpl() : TextUnitKt.m3526lerpC3pnCVY(j2, j3, f2);
    }
}
