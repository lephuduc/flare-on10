package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r\u001a\u0016\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011\u001a'\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0007\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"DefaultBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "J", "DefaultColor", "DefaultFontSize", "Landroidx/compose/ui/unit/TextUnit;", "DefaultLetterSpacing", "DefaultLineHeight", "lerp", "Landroidx/compose/ui/text/TextStyle;", "start", "stop", "fraction", "", "resolveDefaults", "style", "direction", "Landroidx/compose/ui/unit/LayoutDirection;", "resolveTextDirection", "Landroidx/compose/ui/text/style/TextDirection;", "layoutDirection", "textDirection", "resolveTextDirection-Yj3eThk", "(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/style/TextDirection;)I", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextStyleKt {
    private static final long DefaultBackgroundColor;
    private static final long DefaultColor;
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);
    private static final long DefaultLineHeight;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Color.Companion companion = Color.Companion;
        DefaultBackgroundColor = companion.m1427getTransparent0d7_KjU();
        DefaultLineHeight = TextUnit.Companion.m3517getUnspecifiedXSAIIZE();
        DefaultColor = companion.m1418getBlack0d7_KjU();
    }

    @NotNull
    public static final TextStyle lerp(@NotNull TextStyle start, @NotNull TextStyle stop, float f2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new TextStyle(SpanStyleKt.lerp(start.toSpanStyle(), stop.toSpanStyle(), f2), ParagraphStyleKt.lerp(start.toParagraphStyle(), stop.toParagraphStyle(), f2));
    }

    @NotNull
    public static final TextStyle resolveDefaults(@NotNull TextStyle style, @NotNull LayoutDirection direction) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(direction, "direction");
        long m3087getColor0d7_KjU = style.m3087getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!(m3087getColor0d7_KjU != companion.m1428getUnspecified0d7_KjU())) {
            m3087getColor0d7_KjU = DefaultColor;
        }
        long j2 = m3087getColor0d7_KjU;
        long m3088getFontSizeXSAIIZE = TextUnitKt.m3524isUnspecifiedR2X_6o(style.m3088getFontSizeXSAIIZE()) ? DefaultFontSize : style.m3088getFontSizeXSAIIZE();
        FontWeight fontWeight = style.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle m3089getFontStyle4Lr2A7w = style.m3089getFontStyle4Lr2A7w();
        FontStyle m3109boximpl = FontStyle.m3109boximpl(m3089getFontStyle4Lr2A7w == null ? FontStyle.Companion.m3117getNormal_LCdwA() : m3089getFontStyle4Lr2A7w.m3115unboximpl());
        FontSynthesis m3090getFontSynthesisZQGJjVo = style.m3090getFontSynthesisZQGJjVo();
        FontSynthesis m3118boximpl = FontSynthesis.m3118boximpl(m3090getFontSynthesisZQGJjVo == null ? FontSynthesis.Companion.m3127getAllGVVA2EU() : m3090getFontSynthesisZQGJjVo.m3126unboximpl());
        FontFamily fontFamily = style.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.Companion.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = style.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long m3091getLetterSpacingXSAIIZE = TextUnitKt.m3524isUnspecifiedR2X_6o(style.m3091getLetterSpacingXSAIIZE()) ? DefaultLetterSpacing : style.m3091getLetterSpacingXSAIIZE();
        BaselineShift m3086getBaselineShift5SSeXJ0 = style.m3086getBaselineShift5SSeXJ0();
        BaselineShift m3225boximpl = BaselineShift.m3225boximpl(m3086getBaselineShift5SSeXJ0 == null ? BaselineShift.Companion.m3235getNoney9eOQZs() : m3086getBaselineShift5SSeXJ0.m3231unboximpl());
        TextGeometricTransform textGeometricTransform = style.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.Companion.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = style.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.Companion.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long m3085getBackground0d7_KjU = style.m3085getBackground0d7_KjU();
        if (!(m3085getBackground0d7_KjU != companion.m1428getUnspecified0d7_KjU())) {
            m3085getBackground0d7_KjU = DefaultBackgroundColor;
        }
        long j3 = m3085getBackground0d7_KjU;
        TextDecoration textDecoration = style.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.Companion.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = style.getShadow();
        if (shadow == null) {
            shadow = Shadow.Companion.getNone();
        }
        Shadow shadow2 = shadow;
        TextAlign m3093getTextAlignbuA522U = style.m3093getTextAlignbuA522U();
        TextAlign m3239boximpl = TextAlign.m3239boximpl(m3093getTextAlignbuA522U == null ? TextAlign.Companion.m3251getStarte0LSkKk() : m3093getTextAlignbuA522U.m3245unboximpl());
        TextDirection m3252boximpl = TextDirection.m3252boximpl(m3095resolveTextDirectionYj3eThk(direction, style.m3094getTextDirectionmmuk1to()));
        long m3092getLineHeightXSAIIZE = TextUnitKt.m3524isUnspecifiedR2X_6o(style.m3092getLineHeightXSAIIZE()) ? DefaultLineHeight : style.m3092getLineHeightXSAIIZE();
        TextIndent textIndent = style.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.Companion.getNone();
        }
        return new TextStyle(j2, m3088getFontSizeXSAIIZE, fontWeight2, m3109boximpl, m3118boximpl, fontFamily2, str, m3091getLetterSpacingXSAIIZE, m3225boximpl, textGeometricTransform2, localeList2, j3, textDecoration2, shadow2, m3239boximpl, m3252boximpl, m3092getLineHeightXSAIIZE, textIndent, null);
    }

    /* renamed from: resolveTextDirection-Yj3eThk  reason: not valid java name */
    public static final int m3095resolveTextDirectionYj3eThk(@NotNull LayoutDirection layoutDirection, @Nullable TextDirection textDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        TextDirection.Companion companion = TextDirection.Companion;
        if (textDirection == null ? false : TextDirection.m3255equalsimpl0(textDirection.m3258unboximpl(), companion.m3259getContents_7Xco())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return companion.m3261getContentOrRtls_7Xco();
                }
                throw new NoWhenBranchMatchedException();
            }
            return companion.m3260getContentOrLtrs_7Xco();
        } else if (textDirection == null) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    return companion.m3263getRtls_7Xco();
                }
                throw new NoWhenBranchMatchedException();
            }
            return companion.m3262getLtrs_7Xco();
        } else {
            return textDirection.m3258unboximpl();
        }
    }
}
