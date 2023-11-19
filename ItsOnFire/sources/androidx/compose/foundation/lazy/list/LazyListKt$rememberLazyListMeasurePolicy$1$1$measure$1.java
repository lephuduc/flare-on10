package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$1 extends Lambda implements Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult> {
    public final /* synthetic */ long $containerConstraints;
    public final /* synthetic */ MeasureScope $this_LazyMeasurePolicy;
    public final /* synthetic */ int $totalHorizontalPadding;
    public final /* synthetic */ int $totalVerticalPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListKt$rememberLazyListMeasurePolicy$1$1$measure$1(MeasureScope measureScope, long j2, int i2, int i3) {
        super(3);
        this.$this_LazyMeasurePolicy = measureScope;
        this.$containerConstraints = j2;
        this.$totalHorizontalPadding = i2;
        this.$totalVerticalPadding = i3;
    }

    @NotNull
    public final MeasureResult invoke(int i2, int i3, @NotNull Function1<? super Placeable.PlacementScope, Unit> placement) {
        Map<AlignmentLine, Integer> emptyMap;
        Intrinsics.checkNotNullParameter(placement, "placement");
        MeasureScope measureScope = this.$this_LazyMeasurePolicy;
        int m3307constrainWidthK40F9xA = ConstraintsKt.m3307constrainWidthK40F9xA(this.$containerConstraints, i2 + this.$totalHorizontalPadding);
        int m3306constrainHeightK40F9xA = ConstraintsKt.m3306constrainHeightK40F9xA(this.$containerConstraints, i3 + this.$totalVerticalPadding);
        emptyMap = MapsKt__MapsKt.emptyMap();
        return measureScope.layout(m3307constrainWidthK40F9xA, m3306constrainHeightK40F9xA, emptyMap, placement);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
        return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
    }
}
