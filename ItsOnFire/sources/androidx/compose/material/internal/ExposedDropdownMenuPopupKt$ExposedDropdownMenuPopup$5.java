package androidx.compose.material.internal;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRectKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$5 extends Lambda implements Function1<LayoutCoordinates, Unit> {
    public final /* synthetic */ PopupLayout $popupLayout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$5(PopupLayout popupLayout) {
        super(1);
        this.$popupLayout = popupLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull LayoutCoordinates childCoordinates) {
        int roundToInt;
        int roundToInt2;
        Intrinsics.checkNotNullParameter(childCoordinates, "childCoordinates");
        LayoutCoordinates parentLayoutCoordinates = childCoordinates.getParentLayoutCoordinates();
        Intrinsics.checkNotNull(parentLayoutCoordinates);
        long mo2772getSizeYbymL2g = parentLayoutCoordinates.mo2772getSizeYbymL2g();
        long positionInWindow = LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
        roundToInt = MathKt__MathJVMKt.roundToInt(Offset.m1161getXimpl(positionInWindow));
        roundToInt2 = MathKt__MathJVMKt.roundToInt(Offset.m1162getYimpl(positionInWindow));
        this.$popupLayout.setParentBounds(IntRectKt.m3475IntRectVbeCjmY(IntOffsetKt.IntOffset(roundToInt, roundToInt2), mo2772getSizeYbymL2g));
        this.$popupLayout.updatePosition();
    }
}
