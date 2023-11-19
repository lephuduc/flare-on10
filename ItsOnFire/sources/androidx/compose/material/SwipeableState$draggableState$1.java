package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SwipeableState$draggableState$1 extends Lambda implements Function1<Float, Unit> {
    public final /* synthetic */ SwipeableState<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$draggableState$1(SwipeableState<T> swipeableState) {
        super(1);
        this.this$0 = swipeableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
        invoke(f2.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(float f2) {
        MutableState mutableState;
        float coerceIn;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        mutableState = ((SwipeableState) this.this$0).absoluteOffset;
        float floatValue = ((Number) mutableState.getValue()).floatValue() + f2;
        coerceIn = RangesKt___RangesKt.coerceIn(floatValue, this.this$0.getMinBound$material_release(), this.this$0.getMaxBound$material_release());
        float f3 = floatValue - coerceIn;
        ResistanceConfig resistance$material_release = this.this$0.getResistance$material_release();
        float computeResistance = resistance$material_release == null ? 0.0f : resistance$material_release.computeResistance(f3);
        mutableState2 = ((SwipeableState) this.this$0).offsetState;
        mutableState2.setValue(Float.valueOf(coerceIn + computeResistance));
        mutableState3 = ((SwipeableState) this.this$0).overflowState;
        mutableState3.setValue(Float.valueOf(f3));
        mutableState4 = ((SwipeableState) this.this$0).absoluteOffset;
        mutableState4.setValue(Float.valueOf(floatValue));
    }
}
