package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SliderKt$Track$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ SliderColors $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ float $positionFractionEnd;
    public final /* synthetic */ float $positionFractionStart;
    public final /* synthetic */ float $thumbPx;
    public final /* synthetic */ List<Float> $tickFractions;
    public final /* synthetic */ float $trackStrokeWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Track$2(Modifier modifier, SliderColors sliderColors, boolean z, float f2, float f3, List<Float> list, float f4, float f5, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$colors = sliderColors;
        this.$enabled = z;
        this.$positionFractionStart = f2;
        this.$positionFractionEnd = f3;
        this.$tickFractions = list;
        this.$thumbPx = f4;
        this.$trackStrokeWidth = f5;
        this.$$changed = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        SliderKt.Track(this.$modifier, this.$colors, this.$enabled, this.$positionFractionStart, this.$positionFractionEnd, this.$tickFractions, this.$thumbPx, this.$trackStrokeWidth, composer, this.$$changed | 1);
    }
}
