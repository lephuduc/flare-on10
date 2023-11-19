package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public final /* synthetic */ MeasureScope $$receiver;
    public final /* synthetic */ Function5<Integer, int[], LayoutDirection, Density, int[], Unit> $arrangement;
    public final /* synthetic */ Ref.IntRef $beforeCrossAxisAlignmentLine;
    public final /* synthetic */ CrossAxisAlignment $crossAxisAlignment;
    public final /* synthetic */ int $crossAxisLayoutSize;
    public final /* synthetic */ int $mainAxisLayoutSize;
    public final /* synthetic */ int[] $mainAxisPositions;
    public final /* synthetic */ List<Measurable> $measurables;
    public final /* synthetic */ LayoutOrientation $orientation;
    public final /* synthetic */ Placeable[] $placeables;
    public final /* synthetic */ RowColumnParentData[] $rowColumnParentData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4(List<? extends Measurable> list, Placeable[] placeableArr, Function5<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], Unit> function5, int i2, MeasureScope measureScope, int[] iArr, LayoutOrientation layoutOrientation, RowColumnParentData[] rowColumnParentDataArr, CrossAxisAlignment crossAxisAlignment, int i3, Ref.IntRef intRef) {
        super(1);
        this.$measurables = list;
        this.$placeables = placeableArr;
        this.$arrangement = function5;
        this.$mainAxisLayoutSize = i2;
        this.$$receiver = measureScope;
        this.$mainAxisPositions = iArr;
        this.$orientation = layoutOrientation;
        this.$rowColumnParentData = rowColumnParentDataArr;
        this.$crossAxisAlignment = crossAxisAlignment;
        this.$crossAxisLayoutSize = i3;
        this.$beforeCrossAxisAlignmentLine = intRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        CrossAxisAlignment crossAxisAlignment;
        int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize;
        int i2;
        int i3;
        float f2;
        int i4;
        Object obj;
        Placeable.PlacementScope placementScope;
        int i5;
        int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        int size = this.$measurables.size();
        int[] iArr = new int[size];
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Placeable placeable = this.$placeables[i7];
            Intrinsics.checkNotNull(placeable);
            rowColumnMeasurePolicy_TDGSqEk$mainAxisSize = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(placeable, this.$orientation);
            iArr[i7] = rowColumnMeasurePolicy_TDGSqEk$mainAxisSize;
        }
        this.$arrangement.invoke(Integer.valueOf(this.$mainAxisLayoutSize), iArr, this.$$receiver.getLayoutDirection(), this.$$receiver, this.$mainAxisPositions);
        Placeable[] placeableArr = this.$placeables;
        RowColumnParentData[] rowColumnParentDataArr = this.$rowColumnParentData;
        CrossAxisAlignment crossAxisAlignment2 = this.$crossAxisAlignment;
        int i8 = this.$crossAxisLayoutSize;
        LayoutOrientation layoutOrientation = this.$orientation;
        MeasureScope measureScope = this.$$receiver;
        Ref.IntRef intRef = this.$beforeCrossAxisAlignmentLine;
        int[] iArr2 = this.$mainAxisPositions;
        int length = placeableArr.length;
        int i9 = 0;
        while (i6 < length) {
            Placeable placeable2 = placeableArr[i6];
            int i10 = i6 + 1;
            int i11 = i9 + 1;
            Intrinsics.checkNotNull(placeable2);
            crossAxisAlignment = RowColumnImplKt.getCrossAxisAlignment(rowColumnParentDataArr[i9]);
            if (crossAxisAlignment == null) {
                crossAxisAlignment = crossAxisAlignment2;
            }
            rowColumnMeasurePolicy_TDGSqEk$crossAxisSize = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeable2, layoutOrientation);
            int i12 = i8 - rowColumnMeasurePolicy_TDGSqEk$crossAxisSize;
            LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
            Placeable[] placeableArr2 = placeableArr;
            int align$foundation_layout_release = crossAxisAlignment.align$foundation_layout_release(i12, layoutOrientation == layoutOrientation2 ? LayoutDirection.Ltr : measureScope.getLayoutDirection(), placeable2, intRef.element);
            if (layoutOrientation == layoutOrientation2) {
                i5 = iArr2[i9];
                f2 = 0.0f;
                placementScope = layout;
                i3 = align$foundation_layout_release;
                i2 = length;
                i4 = 4;
                obj = null;
            } else {
                i2 = length;
                i3 = iArr2[i9];
                f2 = 0.0f;
                i4 = 4;
                obj = null;
                placementScope = layout;
                i5 = align$foundation_layout_release;
            }
            Placeable.PlacementScope.place$default(placementScope, placeable2, i5, i3, f2, i4, obj);
            i6 = i10;
            i9 = i11;
            placeableArr = placeableArr2;
            length = i2;
        }
    }
}
