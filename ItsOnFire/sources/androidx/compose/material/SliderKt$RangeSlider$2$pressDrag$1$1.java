package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt__RangesKt;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$2$pressDrag$1$1 extends Lambda implements Function2<Boolean, Float, Unit> {
    public final /* synthetic */ float $maxPx;
    public final /* synthetic */ float $minPx;
    public final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
    public final /* synthetic */ MutableState<Float> $rawOffsetEnd;
    public final /* synthetic */ MutableState<Float> $rawOffsetStart;
    public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2$pressDrag$1$1(MutableState<Float> mutableState, float f2, MutableState<Float> mutableState2, float f3, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        super(2);
        this.$rawOffsetStart = mutableState;
        this.$minPx = f2;
        this.$rawOffsetEnd = mutableState2;
        this.$maxPx = f3;
        this.$onValueChangeState = state;
        this.$valueRange = closedFloatingPointRange;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Float f2) {
        invoke(bool.booleanValue(), f2.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, float f2) {
        MutableState<Float> mutableState;
        float floatValue;
        float floatValue2;
        float f3;
        float coerceIn;
        ClosedFloatingPointRange rangeTo;
        ClosedFloatingPointRange<Float> invoke$scaleToUserValue;
        if (z) {
            mutableState = this.$rawOffsetStart;
            floatValue = mutableState.getValue().floatValue() + f2;
            floatValue2 = this.$minPx;
            f3 = this.$rawOffsetEnd.getValue().floatValue();
        } else {
            mutableState = this.$rawOffsetEnd;
            floatValue = mutableState.getValue().floatValue() + f2;
            floatValue2 = this.$rawOffsetStart.getValue().floatValue();
            f3 = this.$maxPx;
        }
        coerceIn = RangesKt___RangesKt.coerceIn(floatValue, floatValue2, f3);
        mutableState.setValue(Float.valueOf(coerceIn));
        float f4 = this.$minPx;
        float f5 = this.$maxPx;
        ClosedFloatingPointRange<Float> closedFloatingPointRange = this.$valueRange;
        rangeTo = RangesKt__RangesKt.rangeTo(this.$rawOffsetStart.getValue().floatValue(), this.$rawOffsetEnd.getValue().floatValue());
        invoke$scaleToUserValue = SliderKt$RangeSlider$2.invoke$scaleToUserValue(f4, f5, closedFloatingPointRange, rangeTo);
        this.$onValueChangeState.getValue().invoke(invoke$scaleToUserValue);
    }
}
