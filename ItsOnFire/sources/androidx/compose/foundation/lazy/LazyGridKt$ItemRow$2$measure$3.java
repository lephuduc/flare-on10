package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyGridKt$ItemRow$2$measure$3 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public final /* synthetic */ List<Placeable> $placeables;
    public final /* synthetic */ int $spacing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridKt$ItemRow$2$measure$3(List<? extends Placeable> list, int i2) {
        super(1);
        this.$placeables = list;
        this.$spacing = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        List<Placeable> list = this.$placeables;
        int i2 = this.$spacing;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            int i5 = i3 + 1;
            Placeable placeable = list.get(i3);
            Placeable.PlacementScope.placeRelative$default(layout, placeable, i4, 0, 0.0f, 4, null);
            i4 += placeable.getWidth() + i2;
            i3 = i5;
        }
    }
}
