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
public final class SnackbarKt$OneRowSnackbar$2$measure$4 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public final /* synthetic */ int $buttonPlaceX;
    public final /* synthetic */ int $buttonPlaceY;
    public final /* synthetic */ Placeable $buttonPlaceable;
    public final /* synthetic */ int $textPlaceY;
    public final /* synthetic */ Placeable $textPlaceable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$OneRowSnackbar$2$measure$4(Placeable placeable, int i2, Placeable placeable2, int i3, int i4) {
        super(1);
        this.$textPlaceable = placeable;
        this.$textPlaceY = i2;
        this.$buttonPlaceable = placeable2;
        this.$buttonPlaceX = i3;
        this.$buttonPlaceY = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, this.$textPlaceable, 0, this.$textPlaceY, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(layout, this.$buttonPlaceable, this.$buttonPlaceX, this.$buttonPlaceY, 0.0f, 4, null);
    }
}
