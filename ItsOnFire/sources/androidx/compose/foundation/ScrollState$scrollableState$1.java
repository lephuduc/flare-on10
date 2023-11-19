package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ScrollState$scrollableState$1 extends Lambda implements Function1<Float, Float> {
    public final /* synthetic */ ScrollState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollState$scrollableState$1(ScrollState scrollState) {
        super(1);
        this.this$0 = scrollState;
    }

    @NotNull
    public final Float invoke(float f2) {
        float f3;
        float coerceIn;
        int roundToInt;
        f3 = this.this$0.accumulator;
        float value = this.this$0.getValue() + f2 + f3;
        coerceIn = RangesKt___RangesKt.coerceIn(value, 0.0f, this.this$0.getMaxValue());
        boolean z = !(value == coerceIn);
        float value2 = coerceIn - this.this$0.getValue();
        roundToInt = MathKt__MathJVMKt.roundToInt(value2);
        ScrollState scrollState = this.this$0;
        scrollState.setValue(scrollState.getValue() + roundToInt);
        this.this$0.accumulator = value2 - roundToInt;
        if (z) {
            f2 = value2;
        }
        return Float.valueOf(f2);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Float invoke(Float f2) {
        return invoke(f2.floatValue());
    }
}
