package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "t", "invoke", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SpringEstimationKt$estimateOverDamped$fn$1 extends Lambda implements Function1<Double, Double> {
    public final /* synthetic */ double $c1;
    public final /* synthetic */ double $c2;
    public final /* synthetic */ double $r1;
    public final /* synthetic */ double $r2;
    public final /* synthetic */ double $signedDelta;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpringEstimationKt$estimateOverDamped$fn$1(double d2, double d3, double d4, double d5, double d6) {
        super(1);
        this.$c1 = d2;
        this.$r1 = d3;
        this.$c2 = d4;
        this.$r2 = d5;
        this.$signedDelta = d6;
    }

    @NotNull
    public final Double invoke(double d2) {
        return Double.valueOf((this.$c1 * Math.exp(this.$r1 * d2)) + (this.$c2 * Math.exp(this.$r2 * d2)) + this.$signedDelta);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Double invoke(Double d2) {
        return invoke(d2.doubleValue());
    }
}
