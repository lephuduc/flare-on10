package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AlertDialogKt$AlertDialogFlowRow$1$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    public final /* synthetic */ List<Integer> $crossAxisPositions;
    public final /* synthetic */ int $mainAxisLayoutSize;
    public final /* synthetic */ float $mainAxisSpacing;
    public final /* synthetic */ List<List<Placeable>> $sequences;
    public final /* synthetic */ MeasureScope $this_Layout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogFlowRow$1$measure$1(List<List<Placeable>> list, MeasureScope measureScope, float f2, int i2, List<Integer> list2) {
        super(1);
        this.$sequences = list;
        this.$this_Layout = measureScope;
        this.$mainAxisSpacing = f2;
        this.$mainAxisLayoutSize = i2;
        this.$crossAxisPositions = list2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        int lastIndex;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        List<List<Placeable>> list = this.$sequences;
        MeasureScope measureScope = this.$this_Layout;
        float f2 = this.$mainAxisSpacing;
        int i2 = this.$mainAxisLayoutSize;
        List<Integer> list2 = this.$crossAxisPositions;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            List<Placeable> list3 = list.get(i3);
            int size2 = list3.size();
            int[] iArr = new int[size2];
            int i5 = 0;
            while (i5 < size2) {
                int width = list3.get(i5).getWidth();
                lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list3);
                iArr[i5] = width + (i5 < lastIndex ? measureScope.mo271roundToPx0680j_4(f2) : 0);
                i5++;
            }
            Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
            int[] iArr2 = new int[size2];
            for (int i6 = 0; i6 < size2; i6++) {
                iArr2[i6] = 0;
            }
            bottom.arrange(measureScope, i2, iArr, iArr2);
            int i7 = 0;
            for (int size3 = list3.size(); i7 < size3; size3 = size3) {
                Placeable.PlacementScope.place$default(layout, list3.get(i7), iArr2[i7], list2.get(i3).intValue(), 0.0f, 4, null);
                i7++;
                iArr2 = iArr2;
                list3 = list3;
            }
            i3 = i4;
        }
    }
}
