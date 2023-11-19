package androidx.compose.material;

import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AlertDialogKt$AlertDialogBaselineLayout$2$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public final /* synthetic */ Placeable $textPlaceable;
    public final /* synthetic */ int $textPositionY;
    public final /* synthetic */ Placeable $titlePlaceable;
    public final /* synthetic */ int $titlePositionY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogBaselineLayout$2$measure$1(Placeable placeable, int i2, Placeable placeable2, int i3) {
        super(1);
        this.$titlePlaceable = placeable;
        this.$titlePositionY = i2;
        this.$textPlaceable = placeable2;
        this.$textPositionY = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable placeable = this.$titlePlaceable;
        if (placeable != null) {
            Placeable.PlacementScope.place$default(layout, placeable, 0, this.$titlePositionY, 0.0f, 4, null);
        }
        Placeable placeable2 = this.$textPlaceable;
        if (placeable2 == null) {
            return;
        }
        Placeable.PlacementScope.place$default(layout, placeable2, 0, this.$textPositionY, 0.0f, 4, null);
    }
}
