package androidx.compose.ui.text.platform;

import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TtsAnnotation;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.TtsAnnotationExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u001c\u0010\f\u001a\u00020\u0002*\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"setSpanStyle", "", "Landroid/text/SpannableString;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "start", "", "end", "density", "Landroidx/compose/ui/unit/Density;", "typefaceAdapter", "Landroidx/compose/ui/text/platform/TypefaceAdapter;", "toAccessibilitySpannableString", "Landroidx/compose/ui/text/AnnotatedString;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidAccessibilitySpannableString_androidKt {
    private static final void setSpanStyle(SpannableString spannableString, SpanStyle spanStyle, int i2, int i3, Density density, TypefaceAdapter typefaceAdapter) {
        TypefaceSpan createTypefaceSpan;
        SpannableExtensions_androidKt.m3222setColorRPmYEkk(spannableString, spanStyle.m3046getColor0d7_KjU(), i2, i3);
        SpannableExtensions_androidKt.m3223setFontSizeKmRG4DE(spannableString, spanStyle.m3047getFontSizeXSAIIZE(), density, i2, i3);
        if (spanStyle.getFontWeight() != null || spanStyle.m3048getFontStyle4Lr2A7w() != null) {
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle m3048getFontStyle4Lr2A7w = spanStyle.m3048getFontStyle4Lr2A7w();
            spannableString.setSpan(new StyleSpan(TypefaceAdapter.Companion.m3213getTypefaceStyleFO1MlWM(fontWeight, m3048getFontStyle4Lr2A7w == null ? FontStyle.Companion.m3117getNormal_LCdwA() : m3048getFontStyle4Lr2A7w.m3115unboximpl())), i2, i3, 33);
        }
        if (spanStyle.getFontFamily() != null) {
            if (spanStyle.getFontFamily() instanceof GenericFontFamily) {
                createTypefaceSpan = new TypefaceSpan(((GenericFontFamily) spanStyle.getFontFamily()).getName());
            } else {
                FontFamily fontFamily = spanStyle.getFontFamily();
                FontSynthesis m3049getFontSynthesisZQGJjVo = spanStyle.m3049getFontSynthesisZQGJjVo();
                createTypefaceSpan = Api28Impl.INSTANCE.createTypefaceSpan(TypefaceAdapter.m3201createDPcqOEQ$default(typefaceAdapter, fontFamily, null, 0, m3049getFontSynthesisZQGJjVo == null ? FontSynthesis.Companion.m3127getAllGVVA2EU() : m3049getFontSynthesisZQGJjVo.m3126unboximpl(), 6, null));
            }
            spannableString.setSpan(createTypefaceSpan, i2, i3, 33);
        }
        if (spanStyle.getTextDecoration() != null) {
            TextDecoration textDecoration = spanStyle.getTextDecoration();
            TextDecoration.Companion companion = TextDecoration.Companion;
            if (textDecoration.contains(companion.getUnderline())) {
                spannableString.setSpan(new UnderlineSpan(), i2, i3, 33);
            }
            if (spanStyle.getTextDecoration().contains(companion.getLineThrough())) {
                spannableString.setSpan(new StrikethroughSpan(), i2, i3, 33);
            }
        }
        if (spanStyle.getTextGeometricTransform() != null) {
            spannableString.setSpan(new ScaleXSpan(spanStyle.getTextGeometricTransform().getScaleX()), i2, i3, 33);
        }
        SpannableExtensions_androidKt.setLocaleList(spannableString, spanStyle.getLocaleList(), i2, i3);
        SpannableExtensions_androidKt.m3220setBackgroundRPmYEkk(spannableString, spanStyle.m3044getBackground0d7_KjU(), i2, i3);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalTextApi
    @NotNull
    public static final SpannableString toAccessibilitySpannableString(@NotNull AnnotatedString annotatedString, @NotNull Density density, @NotNull Font.ResourceLoader resourceLoader) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        TypefaceAdapter typefaceAdapter = new TypefaceAdapter(null, resourceLoader, 1, null);
        List<AnnotatedString.Range<SpanStyle>> spanStyles = annotatedString.getSpanStyles();
        int size = spanStyles.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i2);
            setSpanStyle(spannableString, range.component1(), range.component2(), range.component3(), density, typefaceAdapter);
            i2 = i3;
        }
        List<AnnotatedString.Range<TtsAnnotation>> ttsAnnotations = annotatedString.getTtsAnnotations(0, annotatedString.length());
        int size2 = ttsAnnotations.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AnnotatedString.Range<TtsAnnotation> range2 = ttsAnnotations.get(i4);
            spannableString.setSpan(TtsAnnotationExtensions_androidKt.toSpan(range2.component1()), range2.component2(), range2.component3(), 33);
        }
        return spannableString;
    }
}
