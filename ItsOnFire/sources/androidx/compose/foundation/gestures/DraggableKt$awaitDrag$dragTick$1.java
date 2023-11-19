package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import l.m0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/pointer/PointerInputChange;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class DraggableKt$awaitDrag$dragTick$1 extends Lambda implements Function1<PointerInputChange, Unit> {
    public final /* synthetic */ m0<DragEvent> $channel;
    public final /* synthetic */ Orientation $orientation;
    public final /* synthetic */ boolean $reverseDirection;
    public final /* synthetic */ VelocityTracker $velocityTracker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DraggableKt$awaitDrag$dragTick$1(VelocityTracker velocityTracker, Orientation orientation, m0<? super DragEvent> m0Var, boolean z) {
        super(1);
        this.$velocityTracker = velocityTracker;
        this.$orientation = orientation;
        this.$channel = m0Var;
        this.$reverseDirection = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
        invoke2(pointerInputChange);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull PointerInputChange event) {
        float m250toFloat3MmeM6k;
        Intrinsics.checkNotNullParameter(event, "event");
        VelocityTrackerKt.addPointerInputChange(this.$velocityTracker, event);
        m250toFloat3MmeM6k = DraggableKt.m250toFloat3MmeM6k(PointerEventKt.positionChange(event), this.$orientation);
        PointerEventKt.consumePositionChange(event);
        m0<DragEvent> m0Var = this.$channel;
        if (this.$reverseDirection) {
            m250toFloat3MmeM6k *= -1;
        }
        m0Var.T(new DragEvent.DragDelta(m250toFloat3MmeM6k, event.m2658getPositionF1C5BW0(), null));
    }
}
