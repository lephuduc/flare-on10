package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ SliderColors $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function1<ClosedFloatingPointRange<Float>, Unit> $onValueChange;
    public final /* synthetic */ Function0<Unit> $onValueChangeFinished;
    public final /* synthetic */ int $steps;
    public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;
    public final /* synthetic */ ClosedFloatingPointRange<Float> $values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$3(ClosedFloatingPointRange<Float> closedFloatingPointRange, Function1<? super ClosedFloatingPointRange<Float>, Unit> function1, Modifier modifier, boolean z, ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i2, Function0<Unit> function0, SliderColors sliderColors, int i3, int i4) {
        super(2);
        this.$values = closedFloatingPointRange;
        this.$onValueChange = function1;
        this.$modifier = modifier;
        this.$enabled = z;
        this.$valueRange = closedFloatingPointRange2;
        this.$steps = i2;
        this.$onValueChangeFinished = function0;
        this.$colors = sliderColors;
        this.$$changed = i3;
        this.$$default = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        SliderKt.RangeSlider(this.$values, this.$onValueChange, this.$modifier, this.$enabled, this.$valueRange, this.$steps, this.$onValueChangeFinished, this.$colors, composer, this.$$changed | 1, this.$$default);
    }
}
