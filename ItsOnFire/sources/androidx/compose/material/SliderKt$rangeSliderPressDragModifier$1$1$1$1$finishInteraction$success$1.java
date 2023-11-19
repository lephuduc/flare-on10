package androidx.compose.material;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1 extends Lambda implements Function1<PointerInputChange, Unit> {
    public final /* synthetic */ Ref.BooleanRef $draggingStart;
    public final /* synthetic */ boolean $isRtl;
    public final /* synthetic */ Function2<Boolean, Float, Unit> $onDrag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$rangeSliderPressDragModifier$1$1$1$1$finishInteraction$success$1(Function2<? super Boolean, ? super Float, Unit> function2, Ref.BooleanRef booleanRef, boolean z) {
        super(1);
        this.$onDrag = function2;
        this.$draggingStart = booleanRef;
        this.$isRtl = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
        invoke2(pointerInputChange);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull PointerInputChange it) {
        Intrinsics.checkNotNullParameter(it, "it");
        float m1161getXimpl = Offset.m1161getXimpl(PointerEventKt.positionChange(it));
        Function2<Boolean, Float, Unit> function2 = this.$onDrag;
        Boolean valueOf = Boolean.valueOf(this.$draggingStart.element);
        if (this.$isRtl) {
            m1161getXimpl = -m1161getXimpl;
        }
        function2.invoke(valueOf, Float.valueOf(m1161getXimpl));
    }
}
