package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AlignmentLineKt$alignmentLineOffsetMeasure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public final /* synthetic */ AlignmentLine $alignmentLine;
    public final /* synthetic */ float $before;
    public final /* synthetic */ int $height;
    public final /* synthetic */ int $paddingAfter;
    public final /* synthetic */ int $paddingBefore;
    public final /* synthetic */ Placeable $placeable;
    public final /* synthetic */ int $width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlignmentLineKt$alignmentLineOffsetMeasure$1(AlignmentLine alignmentLine, float f2, int i2, int i3, int i4, Placeable placeable, int i5) {
        super(1);
        this.$alignmentLine = alignmentLine;
        this.$before = f2;
        this.$paddingBefore = i2;
        this.$width = i3;
        this.$paddingAfter = i4;
        this.$placeable = placeable;
        this.$height = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        boolean horizontal;
        int width;
        boolean horizontal2;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        horizontal = AlignmentLineKt.getHorizontal(this.$alignmentLine);
        if (horizontal) {
            width = 0;
        } else {
            width = !Dp.m3330equalsimpl0(this.$before, Dp.Companion.m3345getUnspecifiedD9Ej5fM()) ? this.$paddingBefore : (this.$width - this.$paddingAfter) - this.$placeable.getWidth();
        }
        horizontal2 = AlignmentLineKt.getHorizontal(this.$alignmentLine);
        Placeable.PlacementScope.placeRelative$default(layout, this.$placeable, width, horizontal2 ? !Dp.m3330equalsimpl0(this.$before, Dp.Companion.m3345getUnspecifiedD9Ej5fM()) ? this.$paddingBefore : (this.$height - this.$paddingAfter) - this.$placeable.getHeight() : 0, 0.0f, 4, null);
    }
}
