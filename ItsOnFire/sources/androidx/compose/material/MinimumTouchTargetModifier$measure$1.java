package androidx.compose.material;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class MinimumTouchTargetModifier$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public final /* synthetic */ int $height;
    public final /* synthetic */ Placeable $placeable;
    public final /* synthetic */ int $width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinimumTouchTargetModifier$measure$1(int i2, Placeable placeable, int i3) {
        super(1);
        this.$width = i2;
        this.$placeable = placeable;
        this.$height = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        int roundToInt;
        int roundToInt2;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        roundToInt = MathKt__MathJVMKt.roundToInt((this.$width - this.$placeable.getWidth()) / 2.0f);
        roundToInt2 = MathKt__MathJVMKt.roundToInt((this.$height - this.$placeable.getHeight()) / 2.0f);
        Placeable.PlacementScope.place$default(layout, this.$placeable, roundToInt, roundToInt2, 0.0f, 4, null);
    }
}
