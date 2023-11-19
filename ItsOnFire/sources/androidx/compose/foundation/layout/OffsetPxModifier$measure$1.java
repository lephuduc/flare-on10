package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class OffsetPxModifier$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public final /* synthetic */ MeasureScope $$receiver;
    public final /* synthetic */ Placeable $placeable;
    public final /* synthetic */ OffsetPxModifier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffsetPxModifier$measure$1(OffsetPxModifier offsetPxModifier, MeasureScope measureScope, Placeable placeable) {
        super(1);
        this.this$0 = offsetPxModifier;
        this.$$receiver = measureScope;
        this.$placeable = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        long m3452unboximpl = this.this$0.getOffset().invoke(this.$$receiver).m3452unboximpl();
        boolean rtlAware = this.this$0.getRtlAware();
        Placeable placeable = this.$placeable;
        if (rtlAware) {
            Placeable.PlacementScope.placeRelativeWithLayer$default(layout, placeable, IntOffset.m3443getXimpl(m3452unboximpl), IntOffset.m3444getYimpl(m3452unboximpl), 0.0f, null, 12, null);
        } else {
            Placeable.PlacementScope.placeWithLayer$default(layout, placeable, IntOffset.m3443getXimpl(m3452unboximpl), IntOffset.m3444getYimpl(m3452unboximpl), 0.0f, null, 12, null);
        }
    }
}
