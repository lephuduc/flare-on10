package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$BottomSheetScaffoldStack$2$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public final /* synthetic */ State<Float> $bottomSheetOffset;
    public final /* synthetic */ long $constraints;
    public final /* synthetic */ int $floatingActionButtonPosition;
    public final /* synthetic */ List<Measurable> $measurables;
    public final /* synthetic */ Placeable $placeable;
    public final /* synthetic */ MeasureScope $this_Layout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScaffoldKt$BottomSheetScaffoldStack$2$measure$1(Placeable placeable, List<? extends Measurable> list, State<Float> state, int i2, MeasureScope measureScope, long j2) {
        super(1);
        this.$placeable = placeable;
        this.$measurables = list;
        this.$bottomSheetOffset = state;
        this.$floatingActionButtonPosition = i2;
        this.$this_Layout = measureScope;
        this.$constraints = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        List<Measurable> drop;
        int collectionSizeOrDefault;
        int roundToInt;
        float f2;
        int mo271roundToPx0680j_4;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.placeRelative$default(layout, this.$placeable, 0, 0, 0.0f, 4, null);
        drop = CollectionsKt___CollectionsKt.drop(this.$measurables, 1);
        long j2 = this.$constraints;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(drop, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Measurable measurable : drop) {
            arrayList.add(measurable.mo2758measureBRTryo0(Constraints.m3284copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null)));
        }
        Placeable placeable = (Placeable) arrayList.get(0);
        Placeable placeable2 = (Placeable) arrayList.get(1);
        Placeable placeable3 = (Placeable) arrayList.get(2);
        roundToInt = MathKt__MathJVMKt.roundToInt(this.$bottomSheetOffset.getValue().floatValue());
        Placeable.PlacementScope.placeRelative$default(layout, placeable, 0, roundToInt, 0.0f, 4, null);
        if (FabPosition.m850equalsimpl0(this.$floatingActionButtonPosition, FabPosition.Companion.m854getCenter5ygKITE())) {
            mo271roundToPx0680j_4 = (this.$placeable.getWidth() - placeable2.getWidth()) / 2;
        } else {
            int width = this.$placeable.getWidth() - placeable2.getWidth();
            MeasureScope measureScope = this.$this_Layout;
            f2 = BottomSheetScaffoldKt.FabEndSpacing;
            mo271roundToPx0680j_4 = width - measureScope.mo271roundToPx0680j_4(f2);
        }
        Placeable.PlacementScope.placeRelative$default(layout, placeable2, mo271roundToPx0680j_4, roundToInt - (placeable2.getHeight() / 2), 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(layout, placeable3, (this.$placeable.getWidth() - placeable3.getWidth()) / 2, this.$placeable.getHeight() - placeable3.getHeight(), 0.0f, 4, null);
    }
}
