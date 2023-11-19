package androidx.compose.material;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TabKt$TabBaselineLayout$2$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public final /* synthetic */ Integer $firstBaseline;
    public final /* synthetic */ Placeable $iconPlaceable;
    public final /* synthetic */ Integer $lastBaseline;
    public final /* synthetic */ int $tabHeight;
    public final /* synthetic */ int $tabWidth;
    public final /* synthetic */ Placeable $textPlaceable;
    public final /* synthetic */ MeasureScope $this_Layout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabKt$TabBaselineLayout$2$measure$1(Placeable placeable, Placeable placeable2, MeasureScope measureScope, int i2, int i3, Integer num, Integer num2) {
        super(1);
        this.$textPlaceable = placeable;
        this.$iconPlaceable = placeable2;
        this.$this_Layout = measureScope;
        this.$tabWidth = i2;
        this.$tabHeight = i3;
        this.$firstBaseline = num;
        this.$lastBaseline = num2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        Placeable placeable;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable placeable2 = this.$textPlaceable;
        if (placeable2 == null || (placeable = this.$iconPlaceable) == null) {
            if (placeable2 != null) {
                TabKt.placeTextOrIcon(layout, placeable2, this.$tabHeight);
                return;
            }
            Placeable placeable3 = this.$iconPlaceable;
            if (placeable3 != null) {
                TabKt.placeTextOrIcon(layout, placeable3, this.$tabHeight);
                return;
            }
            return;
        }
        MeasureScope measureScope = this.$this_Layout;
        int i2 = this.$tabWidth;
        int i3 = this.$tabHeight;
        Integer num = this.$firstBaseline;
        Intrinsics.checkNotNull(num);
        int intValue = num.intValue();
        Integer num2 = this.$lastBaseline;
        Intrinsics.checkNotNull(num2);
        TabKt.placeTextAndIcon(layout, measureScope, placeable2, placeable, i2, i3, intValue, num2.intValue());
    }
}
