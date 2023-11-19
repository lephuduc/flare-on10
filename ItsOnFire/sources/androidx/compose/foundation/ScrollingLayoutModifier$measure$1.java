package androidx.compose.foundation;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ScrollingLayoutModifier$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public final /* synthetic */ Placeable $placeable;
    public final /* synthetic */ int $side;
    public final /* synthetic */ ScrollingLayoutModifier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLayoutModifier$measure$1(ScrollingLayoutModifier scrollingLayoutModifier, int i2, Placeable placeable) {
        super(1);
        this.this$0 = scrollingLayoutModifier;
        this.$side = i2;
        this.$placeable = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        int coerceIn;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        this.this$0.getScrollerState().setMaxValue$foundation_release(this.$side);
        coerceIn = RangesKt___RangesKt.coerceIn(this.this$0.getScrollerState().getValue(), 0, this.$side);
        int i2 = this.this$0.isReversed() ? coerceIn - this.$side : -coerceIn;
        Placeable.PlacementScope.placeRelativeWithLayer$default(layout, this.$placeable, this.this$0.isVertical() ? 0 : i2, this.this$0.isVertical() ? i2 : 0, 0.0f, null, 12, null);
    }
}
