package androidx.compose.ui.graphics.colorspace;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "x", "invoke", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class Rgb$eotf$1 extends Lambda implements Function1<Double, Double> {
    public final /* synthetic */ Rgb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rgb$eotf$1(Rgb rgb) {
        super(1);
        this.this$0 = rgb;
    }

    @NotNull
    public final Double invoke(double d2) {
        float f2;
        float f3;
        double coerceIn;
        Function1<Double, Double> eotfOrig$ui_graphics_release = this.this$0.getEotfOrig$ui_graphics_release();
        f2 = this.this$0.min;
        f3 = this.this$0.max;
        coerceIn = RangesKt___RangesKt.coerceIn(d2, f2, f3);
        return eotfOrig$ui_graphics_release.invoke(Double.valueOf(coerceIn));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Double invoke(Double d2) {
        return invoke(d2.doubleValue());
    }
}
