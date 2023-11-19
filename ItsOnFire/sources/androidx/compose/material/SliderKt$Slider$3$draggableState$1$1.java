package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SliderKt$Slider$3$draggableState$1$1 extends Lambda implements Function1<Float, Unit> {
    public final /* synthetic */ float $maxPx;
    public final /* synthetic */ float $minPx;
    public final /* synthetic */ State<Function1<Float, Unit>> $onValueChangeState;
    public final /* synthetic */ MutableState<Float> $rawOffset;
    public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$3$draggableState$1$1(MutableState<Float> mutableState, float f2, float f3, State<? extends Function1<? super Float, Unit>> state, ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        super(1);
        this.$rawOffset = mutableState;
        this.$minPx = f2;
        this.$maxPx = f3;
        this.$onValueChangeState = state;
        this.$valueRange = closedFloatingPointRange;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
        invoke(f2.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(float f2) {
        float coerceIn;
        float invoke$scaleToUserValue;
        MutableState<Float> mutableState = this.$rawOffset;
        coerceIn = RangesKt___RangesKt.coerceIn(mutableState.getValue().floatValue() + f2, this.$minPx, this.$maxPx);
        mutableState.setValue(Float.valueOf(coerceIn));
        invoke$scaleToUserValue = SliderKt$Slider$3.invoke$scaleToUserValue(this.$minPx, this.$maxPx, this.$valueRange, this.$rawOffset.getValue().floatValue());
        this.$onValueChangeState.getValue().invoke(Float.valueOf(invoke$scaleToUserValue));
    }
}
