package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/layout/RootMeasurePolicy;", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "()V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class RootMeasurePolicy extends LayoutNode.NoIntrinsicsMeasurePolicy {
    @NotNull
    public static final RootMeasurePolicy INSTANCE = new RootMeasurePolicy();

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope receiver, @NotNull List<? extends Measurable> measurables, long j2) {
        int m3307constrainWidthK40F9xA;
        int m3306constrainHeightK40F9xA;
        Map map;
        Function1 rootMeasurePolicy$measure$2;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        if (measurables.isEmpty()) {
            m3307constrainWidthK40F9xA = Constraints.m3295getMinWidthimpl(j2);
            m3306constrainHeightK40F9xA = Constraints.m3294getMinHeightimpl(j2);
            map = null;
            rootMeasurePolicy$measure$2 = RootMeasurePolicy$measure$1.INSTANCE;
        } else {
            int i2 = 0;
            if (measurables.size() != 1) {
                ArrayList arrayList = new ArrayList(measurables.size());
                int size = measurables.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList.add(measurables.get(i3).mo2758measureBRTryo0(j2));
                }
                int size2 = arrayList.size();
                int i4 = 0;
                int i5 = 0;
                while (i2 < size2) {
                    int i6 = i2 + 1;
                    Placeable placeable = (Placeable) arrayList.get(i2);
                    i4 = Math.max(placeable.getWidth(), i4);
                    i5 = Math.max(placeable.getHeight(), i5);
                    i2 = i6;
                }
                return MeasureScope.DefaultImpls.layout$default(receiver, ConstraintsKt.m3307constrainWidthK40F9xA(j2, i4), ConstraintsKt.m3306constrainHeightK40F9xA(j2, i5), null, new RootMeasurePolicy$measure$4(arrayList), 4, null);
            }
            Placeable mo2758measureBRTryo0 = measurables.get(0).mo2758measureBRTryo0(j2);
            m3307constrainWidthK40F9xA = ConstraintsKt.m3307constrainWidthK40F9xA(j2, mo2758measureBRTryo0.getWidth());
            m3306constrainHeightK40F9xA = ConstraintsKt.m3306constrainHeightK40F9xA(j2, mo2758measureBRTryo0.getHeight());
            map = null;
            rootMeasurePolicy$measure$2 = new RootMeasurePolicy$measure$2(mo2758measureBRTryo0);
        }
        return MeasureScope.DefaultImpls.layout$default(receiver, m3307constrainWidthK40F9xA, m3306constrainHeightK40F9xA, map, rootMeasurePolicy$measure$2, 4, null);
    }
}
