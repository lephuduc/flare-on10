package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import androidx.appcompat.R;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.platform.TypefaceAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "start", "", "end", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SpannableExtensions_androidKt$setFontAttributes$1 extends Lambda implements Function3<SpanStyle, Integer, Integer, Unit> {
    public final /* synthetic */ Spannable $this_setFontAttributes;
    public final /* synthetic */ TypefaceAdapter $typefaceAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpannableExtensions_androidKt$setFontAttributes$1(Spannable spannable, TypefaceAdapter typefaceAdapter) {
        super(3);
        this.$this_setFontAttributes = spannable;
        this.$typefaceAdapter = typefaceAdapter;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(SpanStyle spanStyle, Integer num, Integer num2) {
        invoke(spanStyle, num.intValue(), num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull SpanStyle spanStyle, int i2, int i3) {
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        Spannable spannable = this.$this_setFontAttributes;
        TypefaceAdapter typefaceAdapter = this.$typefaceAdapter;
        FontFamily fontFamily = spanStyle.getFontFamily();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontStyle m3048getFontStyle4Lr2A7w = spanStyle.m3048getFontStyle4Lr2A7w();
        int m3117getNormal_LCdwA = m3048getFontStyle4Lr2A7w == null ? FontStyle.Companion.m3117getNormal_LCdwA() : m3048getFontStyle4Lr2A7w.m3115unboximpl();
        FontSynthesis m3049getFontSynthesisZQGJjVo = spanStyle.m3049getFontSynthesisZQGJjVo();
        spannable.setSpan(new TypefaceSpan(typefaceAdapter.m3206createDPcqOEQ(fontFamily, fontWeight, m3117getNormal_LCdwA, m3049getFontSynthesisZQGJjVo == null ? FontSynthesis.Companion.m3127getAllGVVA2EU() : m3049getFontSynthesisZQGJjVo.m3126unboximpl())), i2, i3, 33);
    }
}
