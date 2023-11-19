package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bç\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\"\u0010\t\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0016J/\u0010\u000b\u001a\u00020\f*\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u000f\u001a\u00020\u0010H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\"\u0010\u0014\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0016\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/layout/MeasurePolicy;", "", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public interface MeasurePolicy {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static int maxIntrinsicHeight(@NotNull MeasurePolicy measurePolicy, @NotNull IntrinsicMeasureScope receiver, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
            Intrinsics.checkNotNullParameter(measurePolicy, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            ArrayList arrayList = new ArrayList(measurables.size());
            int size = measurables.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(new DefaultIntrinsicMeasurable(measurables.get(i3), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
            }
            return measurePolicy.mo6measure3p2s80s(new IntrinsicsMeasureScope(receiver, receiver.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null)).getHeight();
        }

        public static int maxIntrinsicWidth(@NotNull MeasurePolicy measurePolicy, @NotNull IntrinsicMeasureScope receiver, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
            Intrinsics.checkNotNullParameter(measurePolicy, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            ArrayList arrayList = new ArrayList(measurables.size());
            int size = measurables.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(new DefaultIntrinsicMeasurable(measurables.get(i3), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
            }
            return measurePolicy.mo6measure3p2s80s(new IntrinsicsMeasureScope(receiver, receiver.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null)).getWidth();
        }

        public static int minIntrinsicHeight(@NotNull MeasurePolicy measurePolicy, @NotNull IntrinsicMeasureScope receiver, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
            Intrinsics.checkNotNullParameter(measurePolicy, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            ArrayList arrayList = new ArrayList(measurables.size());
            int size = measurables.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(new DefaultIntrinsicMeasurable(measurables.get(i3), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
            }
            return measurePolicy.mo6measure3p2s80s(new IntrinsicsMeasureScope(receiver, receiver.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null)).getHeight();
        }

        public static int minIntrinsicWidth(@NotNull MeasurePolicy measurePolicy, @NotNull IntrinsicMeasureScope receiver, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
            Intrinsics.checkNotNullParameter(measurePolicy, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Intrinsics.checkNotNullParameter(measurables, "measurables");
            ArrayList arrayList = new ArrayList(measurables.size());
            int size = measurables.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(new DefaultIntrinsicMeasurable(measurables.get(i3), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
            }
            return measurePolicy.mo6measure3p2s80s(new IntrinsicsMeasureScope(receiver, receiver.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null)).getWidth();
        }
    }

    int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i2);

    int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i2);

    @NotNull
    /* renamed from: measure-3p2s80s */
    MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j2);

    int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i2);

    int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i2);
}
