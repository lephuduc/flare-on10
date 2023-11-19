package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SliderKt$CorrectValueSideEffect$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ Function1<Float, Float> $scaleToOffset;
    public final /* synthetic */ float $value;
    public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;
    public final /* synthetic */ MutableState<Float> $valueState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$CorrectValueSideEffect$2(Function1<? super Float, Float> function1, ClosedFloatingPointRange<Float> closedFloatingPointRange, MutableState<Float> mutableState, float f2, int i2) {
        super(2);
        this.$scaleToOffset = function1;
        this.$valueRange = closedFloatingPointRange;
        this.$valueState = mutableState;
        this.$value = f2;
        this.$$changed = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        SliderKt.CorrectValueSideEffect(this.$scaleToOffset, this.$valueRange, this.$valueState, this.$value, composer, this.$$changed | 1);
    }
}
