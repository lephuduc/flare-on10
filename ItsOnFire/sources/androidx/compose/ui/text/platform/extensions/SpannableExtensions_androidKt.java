package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.TypefaceAdapter;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000®\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aF\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\r2\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u0010H\u0000\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0014H\u0002\u001a\u0016\u0010\u0015\u001a\u00020\u000b*\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u000bH\u0002\u001a1\u0010\u0017\u001a\u00020\t*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a1\u0010\u001f\u001a\u00020\t*\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\"\u001a1\u0010#\u001a\u00020\t*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\u001e\u001a0\u0010%\u001a\u00020\t*\u00020\u00182\u0006\u0010&\u001a\u00020\u00142\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\r2\u0006\u0010'\u001a\u00020(H\u0002\u001a&\u0010)\u001a\u00020\t*\u00020\u00182\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0002\u001a9\u0010,\u001a\u00020\t*\u00020\u00182\u0006\u0010-\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u001a&\u00100\u001a\u00020\t*\u00020\u00182\b\u00101\u001a\u0004\u0018\u0001022\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0002\u001a1\u00103\u001a\u00020\t*\u00020\u00182\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u0002062\u0006\u0010\u0004\u001a\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108\u001a&\u00109\u001a\u00020\t*\u00020\u00182\b\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0000\u001a&\u0010<\u001a\u00020\t*\u00020\u00182\b\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0002\u001a$\u0010?\u001a\u00020\t*\u00020\u00182\u0006\u0010@\u001a\u00020A2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0000\u001a:\u0010B\u001a\u00020\t*\u00020\u00182\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010D\u001a\u0012\u0012\u0004\u0012\u00020F0Ej\b\u0012\u0004\u0012\u00020F`GH\u0002\u001a8\u0010H\u001a\u00020\t*\u00020\u00182\u0006\u0010&\u001a\u00020\u00142\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e0\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010'\u001a\u00020(H\u0000\u001a&\u0010I\u001a\u00020\t*\u00020\u00182\b\u0010J\u001a\u0004\u0018\u00010K2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0000\u001a&\u0010L\u001a\u00020\t*\u00020\u00182\b\u0010M\u001a\u0004\u0018\u00010N2\u0006\u00105\u001a\u0002062\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006O"}, d2 = {"createLetterSpacingSpan", "Landroid/text/style/MetricAffectingSpan;", "letterSpacing", "Landroidx/compose/ui/unit/TextUnit;", "density", "Landroidx/compose/ui/unit/Density;", "createLetterSpacingSpan-eAf_CNQ", "(JLandroidx/compose/ui/unit/Density;)Landroid/text/style/MetricAffectingSpan;", "flattenFontStylesAndApply", "", "contextFontSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "block", "Lkotlin/Function3;", "", "hasFontAttributes", "", "Landroidx/compose/ui/text/TextStyle;", "merge", "spanStyle", "setBackground", "Landroid/text/Spannable;", "color", "Landroidx/compose/ui/graphics/Color;", "start", "end", "setBackground-RPmYEkk", "(Landroid/text/Spannable;JII)V", "setBaselineShift", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "setBaselineShift-0ocSgnM", "setColor", "setColor-RPmYEkk", "setFontAttributes", "contextTextStyle", "typefaceAdapter", "Landroidx/compose/ui/text/platform/TypefaceAdapter;", "setFontFeatureSettings", "fontFeatureSettings", "", "setFontSize", "fontSize", "setFontSize-KmRG4DE", "(Landroid/text/Spannable;JLandroidx/compose/ui/unit/Density;II)V", "setGeometricTransform", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "setLineHeight", "lineHeight", "contextFontSize", "", "setLineHeight-r9BaKPg", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/Density;)V", "setLocaleList", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "setShadow", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "setSpan", "span", "", "setSpanStyle", "spanStyleRange", "lowPrioritySpans", "Ljava/util/ArrayList;", "Landroidx/compose/ui/text/platform/extensions/SpanRange;", "Lkotlin/collections/ArrayList;", "setSpanStyles", "setTextDecoration", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "setTextIndent", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SpannableExtensions_androidKt {
    /* renamed from: createLetterSpacingSpan-eAf_CNQ  reason: not valid java name */
    private static final MetricAffectingSpan m3219createLetterSpacingSpaneAf_CNQ(long j2, Density density) {
        long m3505getTypeUIouoOA = TextUnit.m3505getTypeUIouoOA(j2);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m3534equalsimpl0(m3505getTypeUIouoOA, companion.m3539getSpUIouoOA())) {
            return new LetterSpacingSpanPx(density.mo276toPxR2X_6o(j2));
        }
        if (TextUnitType.m3534equalsimpl0(m3505getTypeUIouoOA, companion.m3538getEmUIouoOA())) {
            return new LetterSpacingSpanEm(TextUnit.m3506getValueimpl(j2));
        }
        return null;
    }

    public static final void flattenFontStylesAndApply(@Nullable SpanStyle spanStyle, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull Function3<? super SpanStyle, ? super Integer, ? super Integer, Unit> block) {
        Object first;
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(block, "block");
        if (spanStyles.size() <= 1) {
            if (!spanStyles.isEmpty()) {
                block.invoke(merge(spanStyle, spanStyles.get(0).getItem()), Integer.valueOf(spanStyles.get(0).getStart()), Integer.valueOf(spanStyles.get(0).getEnd()));
                return;
            }
            return;
        }
        int size = spanStyles.size();
        int i2 = size * 2;
        Integer[] numArr = new Integer[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            numArr[i3] = 0;
        }
        int size2 = spanStyles.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i4);
            numArr[i4] = Integer.valueOf(range.getStart());
            numArr[i4 + size] = Integer.valueOf(range.getEnd());
        }
        ArraysKt___ArraysJvmKt.sort((Object[]) numArr);
        first = ArraysKt___ArraysKt.first(numArr);
        int intValue = ((Number) first).intValue();
        int i5 = 0;
        while (i5 < i2) {
            int intValue2 = numArr[i5].intValue();
            i5++;
            if (intValue2 != intValue) {
                int size3 = spanStyles.size();
                SpanStyle spanStyle2 = spanStyle;
                int i6 = 0;
                while (i6 < size3) {
                    int i7 = i6 + 1;
                    AnnotatedString.Range<SpanStyle> range2 = spanStyles.get(i6);
                    if (AnnotatedStringKt.intersect(intValue, intValue2, range2.getStart(), range2.getEnd())) {
                        spanStyle2 = merge(spanStyle2, range2.getItem());
                    }
                    i6 = i7;
                }
                if (spanStyle2 != null) {
                    block.invoke(spanStyle2, Integer.valueOf(intValue), Integer.valueOf(intValue2));
                }
                intValue = intValue2;
            }
        }
    }

    private static final boolean hasFontAttributes(TextStyle textStyle) {
        return TextPaintExtensions_androidKt.hasFontAttributes(textStyle.toSpanStyle()) || textStyle.m3090getFontSynthesisZQGJjVo() != null;
    }

    private static final SpanStyle merge(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.merge(spanStyle2);
    }

    /* renamed from: setBackground-RPmYEkk  reason: not valid java name */
    public static final void m3220setBackgroundRPmYEkk(@NotNull Spannable setBackground, long j2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(setBackground, "$this$setBackground");
        if (j2 != Color.Companion.m1428getUnspecified0d7_KjU()) {
            setSpan(setBackground, new BackgroundColorSpan(ColorKt.m1447toArgb8_81llA(j2)), i2, i3);
        }
    }

    /* renamed from: setBaselineShift-0ocSgnM  reason: not valid java name */
    private static final void m3221setBaselineShift0ocSgnM(Spannable spannable, BaselineShift baselineShift, int i2, int i3) {
        if (baselineShift == null) {
            return;
        }
        setSpan(spannable, new BaselineShiftSpan(baselineShift.m3231unboximpl()), i2, i3);
    }

    /* renamed from: setColor-RPmYEkk  reason: not valid java name */
    public static final void m3222setColorRPmYEkk(@NotNull Spannable setColor, long j2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(setColor, "$this$setColor");
        if (j2 != Color.Companion.m1428getUnspecified0d7_KjU()) {
            setSpan(setColor, new ForegroundColorSpan(ColorKt.m1447toArgb8_81llA(j2)), i2, i3);
        }
    }

    private static final void setFontAttributes(Spannable spannable, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, TypefaceAdapter typefaceAdapter) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            AnnotatedString.Range<SpanStyle> range = list.get(i2);
            AnnotatedString.Range<SpanStyle> range2 = range;
            if (TextPaintExtensions_androidKt.hasFontAttributes(range2.getItem()) || range2.getItem().m3049getFontSynthesisZQGJjVo() != null) {
                arrayList.add(range);
            }
            i2 = i3;
        }
        flattenFontStylesAndApply(hasFontAttributes(textStyle) ? new SpanStyle(0L, 0L, textStyle.getFontWeight(), textStyle.m3089getFontStyle4Lr2A7w(), textStyle.m3090getFontSynthesisZQGJjVo(), textStyle.getFontFamily(), null, 0L, null, null, null, 0L, null, null, 16323, null) : null, arrayList, new SpannableExtensions_androidKt$setFontAttributes$1(spannable, typefaceAdapter));
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i2, int i3) {
        if (str == null) {
            return;
        }
        setSpan(spannable, new FontFeatureSpan(str), i2, i3);
    }

    /* renamed from: setFontSize-KmRG4DE  reason: not valid java name */
    public static final void m3223setFontSizeKmRG4DE(@NotNull Spannable setFontSize, long j2, @NotNull Density density, int i2, int i3) {
        int roundToInt;
        Intrinsics.checkNotNullParameter(setFontSize, "$this$setFontSize");
        Intrinsics.checkNotNullParameter(density, "density");
        long m3505getTypeUIouoOA = TextUnit.m3505getTypeUIouoOA(j2);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m3534equalsimpl0(m3505getTypeUIouoOA, companion.m3539getSpUIouoOA())) {
            roundToInt = MathKt__MathJVMKt.roundToInt(density.mo276toPxR2X_6o(j2));
            setSpan(setFontSize, new AbsoluteSizeSpan(roundToInt, false), i2, i3);
        } else if (TextUnitType.m3534equalsimpl0(m3505getTypeUIouoOA, companion.m3538getEmUIouoOA())) {
            setSpan(setFontSize, new RelativeSizeSpan(TextUnit.m3506getValueimpl(j2)), i2, i3);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, TextGeometricTransform textGeometricTransform, int i2, int i3) {
        if (textGeometricTransform == null) {
            return;
        }
        setSpan(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i2, i3);
        setSpan(spannable, new SkewXSpan(textGeometricTransform.getSkewX()), i2, i3);
    }

    /* renamed from: setLineHeight-r9BaKPg  reason: not valid java name */
    public static final void m3224setLineHeightr9BaKPg(@NotNull Spannable setLineHeight, long j2, float f2, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(setLineHeight, "$this$setLineHeight");
        Intrinsics.checkNotNullParameter(density, "density");
        long m3505getTypeUIouoOA = TextUnit.m3505getTypeUIouoOA(j2);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m3534equalsimpl0(m3505getTypeUIouoOA, companion.m3539getSpUIouoOA())) {
            setSpan(setLineHeight, new LineHeightSpan((int) Math.ceil(density.mo276toPxR2X_6o(j2))), 0, setLineHeight.length());
        } else if (TextUnitType.m3534equalsimpl0(m3505getTypeUIouoOA, companion.m3538getEmUIouoOA())) {
            setSpan(setLineHeight, new LineHeightSpan((int) Math.ceil(TextUnit.m3506getValueimpl(j2) * f2)), 0, setLineHeight.length());
        }
    }

    public static final void setLocaleList(@NotNull Spannable spannable, @Nullable LocaleList localeList, int i2, int i3) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        if (localeList == null) {
            return;
        }
        setSpan(spannable, LocaleListHelperMethods.INSTANCE.localeSpan(localeList), i2, i3);
    }

    private static final void setShadow(Spannable spannable, Shadow shadow, int i2, int i3) {
        if (shadow == null) {
            return;
        }
        setSpan(spannable, new ShadowSpan(ColorKt.m1447toArgb8_81llA(shadow.m1649getColor0d7_KjU()), Offset.m1161getXimpl(shadow.m1650getOffsetF1C5BW0()), Offset.m1162getYimpl(shadow.m1650getOffsetF1C5BW0()), shadow.getBlurRadius()), i2, i3);
    }

    public static final void setSpan(@NotNull Spannable spannable, @NotNull Object span, int i2, int i3) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(span, "span");
        spannable.setSpan(span, i2, i3, 33);
    }

    private static final void setSpanStyle(Spannable spannable, AnnotatedString.Range<SpanStyle> range, Density density, ArrayList<SpanRange> arrayList) {
        int start = range.getStart();
        int end = range.getEnd();
        SpanStyle item = range.getItem();
        m3221setBaselineShift0ocSgnM(spannable, item.m3045getBaselineShift5SSeXJ0(), start, end);
        m3222setColorRPmYEkk(spannable, item.m3046getColor0d7_KjU(), start, end);
        setTextDecoration(spannable, item.getTextDecoration(), start, end);
        m3223setFontSizeKmRG4DE(spannable, item.m3047getFontSizeXSAIIZE(), density, start, end);
        setFontFeatureSettings(spannable, item.getFontFeatureSettings(), start, end);
        setGeometricTransform(spannable, item.getTextGeometricTransform(), start, end);
        setLocaleList(spannable, item.getLocaleList(), start, end);
        m3220setBackgroundRPmYEkk(spannable, item.m3044getBackground0d7_KjU(), start, end);
        setShadow(spannable, item.getShadow(), start, end);
        MetricAffectingSpan m3219createLetterSpacingSpaneAf_CNQ = m3219createLetterSpacingSpaneAf_CNQ(item.m3050getLetterSpacingXSAIIZE(), density);
        if (m3219createLetterSpacingSpaneAf_CNQ == null) {
            return;
        }
        arrayList.add(new SpanRange(m3219createLetterSpacingSpaneAf_CNQ, start, end));
    }

    public static final void setSpanStyles(@NotNull Spannable spannable, @NotNull TextStyle contextTextStyle, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull Density density, @NotNull TypefaceAdapter typefaceAdapter) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(contextTextStyle, "contextTextStyle");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(typefaceAdapter, "typefaceAdapter");
        setFontAttributes(spannable, contextTextStyle, spanStyles, typefaceAdapter);
        ArrayList arrayList = new ArrayList();
        int size = spanStyles.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i2);
            int start = range.getStart();
            int end = range.getEnd();
            if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                setSpanStyle(spannable, range, density, arrayList);
            }
            i2 = i3;
        }
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            SpanRange spanRange = (SpanRange) arrayList.get(i4);
            setSpan(spannable, spanRange.component1(), spanRange.component2(), spanRange.component3());
        }
    }

    public static final void setTextDecoration(@NotNull Spannable spannable, @Nullable TextDecoration textDecoration, int i2, int i3) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        if (textDecoration == null) {
            return;
        }
        TextDecoration.Companion companion = TextDecoration.Companion;
        setSpan(spannable, new TextDecorationSpan(textDecoration.contains(companion.getUnderline()), textDecoration.contains(companion.getLineThrough())), i2, i3);
    }

    public static final void setTextIndent(@NotNull Spannable spannable, @Nullable TextIndent textIndent, float f2, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
        if (textIndent == null) {
            return;
        }
        if ((TextUnit.m3503equalsimpl0(textIndent.m3266getFirstLineXSAIIZE(), TextUnitKt.getSp(0)) && TextUnit.m3503equalsimpl0(textIndent.m3267getRestLineXSAIIZE(), TextUnitKt.getSp(0))) || TextUnitKt.m3524isUnspecifiedR2X_6o(textIndent.m3266getFirstLineXSAIIZE()) || TextUnitKt.m3524isUnspecifiedR2X_6o(textIndent.m3267getRestLineXSAIIZE())) {
            return;
        }
        long m3505getTypeUIouoOA = TextUnit.m3505getTypeUIouoOA(textIndent.m3266getFirstLineXSAIIZE());
        TextUnitType.Companion companion = TextUnitType.Companion;
        float f3 = 0.0f;
        float mo276toPxR2X_6o = TextUnitType.m3534equalsimpl0(m3505getTypeUIouoOA, companion.m3539getSpUIouoOA()) ? density.mo276toPxR2X_6o(textIndent.m3266getFirstLineXSAIIZE()) : TextUnitType.m3534equalsimpl0(m3505getTypeUIouoOA, companion.m3538getEmUIouoOA()) ? TextUnit.m3506getValueimpl(textIndent.m3266getFirstLineXSAIIZE()) * f2 : 0.0f;
        long m3505getTypeUIouoOA2 = TextUnit.m3505getTypeUIouoOA(textIndent.m3267getRestLineXSAIIZE());
        if (TextUnitType.m3534equalsimpl0(m3505getTypeUIouoOA2, companion.m3539getSpUIouoOA())) {
            f3 = density.mo276toPxR2X_6o(textIndent.m3267getRestLineXSAIIZE());
        } else if (TextUnitType.m3534equalsimpl0(m3505getTypeUIouoOA2, companion.m3538getEmUIouoOA())) {
            f3 = TextUnit.m3506getValueimpl(textIndent.m3267getRestLineXSAIIZE()) * f2;
        }
        setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(mo276toPxR2X_6o), (int) Math.ceil(f3)), 0, spannable.length());
    }
}
