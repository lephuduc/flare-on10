package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import androidx.appcompat.R;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.platform.TypefaceAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a$\u0010\u0006\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\u0003H\u0000¨\u0006\f"}, d2 = {"createTypeface", "Landroid/graphics/Typeface;", "style", "Landroidx/compose/ui/text/SpanStyle;", "typefaceAdapter", "Landroidx/compose/ui/text/platform/TypefaceAdapter;", "applySpanStyle", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "density", "Landroidx/compose/ui/unit/Density;", "hasFontAttributes", "", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextPaintExtensions_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016f  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.text.SpanStyle applySpanStyle(@org.jetbrains.annotations.NotNull androidx.compose.ui.text.platform.AndroidTextPaint r27, @org.jetbrains.annotations.NotNull androidx.compose.ui.text.SpanStyle r28, @org.jetbrains.annotations.NotNull androidx.compose.ui.text.platform.TypefaceAdapter r29, @org.jetbrains.annotations.NotNull androidx.compose.ui.unit.Density r30) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt.applySpanStyle(androidx.compose.ui.text.platform.AndroidTextPaint, androidx.compose.ui.text.SpanStyle, androidx.compose.ui.text.platform.TypefaceAdapter, androidx.compose.ui.unit.Density):androidx.compose.ui.text.SpanStyle");
    }

    private static final Typeface createTypeface(SpanStyle spanStyle, TypefaceAdapter typefaceAdapter) {
        FontFamily fontFamily = spanStyle.getFontFamily();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontStyle m3048getFontStyle4Lr2A7w = spanStyle.m3048getFontStyle4Lr2A7w();
        int m3117getNormal_LCdwA = m3048getFontStyle4Lr2A7w == null ? FontStyle.Companion.m3117getNormal_LCdwA() : m3048getFontStyle4Lr2A7w.m3115unboximpl();
        FontSynthesis m3049getFontSynthesisZQGJjVo = spanStyle.m3049getFontSynthesisZQGJjVo();
        return typefaceAdapter.m3206createDPcqOEQ(fontFamily, fontWeight, m3117getNormal_LCdwA, m3049getFontSynthesisZQGJjVo == null ? FontSynthesis.Companion.m3127getAllGVVA2EU() : m3049getFontSynthesisZQGJjVo.m3126unboximpl());
    }

    public static final boolean hasFontAttributes(@NotNull SpanStyle spanStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "<this>");
        return (spanStyle.getFontFamily() == null && spanStyle.m3048getFontStyle4Lr2A7w() == null && spanStyle.getFontWeight() == null) ? false : true;
    }
}
