package androidx.compose.material;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BottomNavigationKt$placeLabelAndIcon$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public final /* synthetic */ Placeable $iconPlaceable;
    public final /* synthetic */ float $iconPositionAnimationProgress;
    public final /* synthetic */ int $iconX;
    public final /* synthetic */ Placeable $labelPlaceable;
    public final /* synthetic */ int $labelX;
    public final /* synthetic */ int $labelY;
    public final /* synthetic */ int $offset;
    public final /* synthetic */ int $selectedIconY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$placeLabelAndIcon$1(float f2, Placeable placeable, int i2, int i3, int i4, Placeable placeable2, int i5, int i6) {
        super(1);
        this.$iconPositionAnimationProgress = f2;
        this.$labelPlaceable = placeable;
        this.$labelX = i2;
        this.$labelY = i3;
        this.$offset = i4;
        this.$iconPlaceable = placeable2;
        this.$iconX = i5;
        this.$selectedIconY = i6;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        if (!(this.$iconPositionAnimationProgress == 0.0f)) {
            Placeable.PlacementScope.placeRelative$default(layout, this.$labelPlaceable, this.$labelX, this.$labelY + this.$offset, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(layout, this.$iconPlaceable, this.$iconX, this.$selectedIconY + this.$offset, 0.0f, 4, null);
    }
}
