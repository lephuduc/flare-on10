package androidx.compose.ui.window;

import androidx.appcompat.R;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidDialog_androidKt$DialogLayout$1 implements MeasurePolicy {
    public static final AndroidDialog_androidKt$DialogLayout$1 INSTANCE = new AndroidDialog_androidKt$DialogLayout$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i2) {
        return MeasurePolicy.DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i2) {
        return MeasurePolicy.DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo6measure3p2s80s(@NotNull MeasureScope Layout, @NotNull List<? extends Measurable> measurables, long j2) {
        Object obj;
        int lastIndex;
        Object obj2;
        int lastIndex2;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(measurables.get(i2).mo2758measureBRTryo0(j2));
        }
        int i3 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int width = ((Placeable) obj).getWidth();
            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            if (1 <= lastIndex) {
                int i4 = 1;
                while (true) {
                    int i5 = i4 + 1;
                    Object obj3 = arrayList.get(i4);
                    int width2 = ((Placeable) obj3).getWidth();
                    if (width < width2) {
                        obj = obj3;
                        width = width2;
                    }
                    if (i4 == lastIndex) {
                        break;
                    }
                    i4 = i5;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        Integer valueOf = placeable == null ? null : Integer.valueOf(placeable.getWidth());
        int m3295getMinWidthimpl = valueOf == null ? Constraints.m3295getMinWidthimpl(j2) : valueOf.intValue();
        if (arrayList.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList.get(0);
            int height = ((Placeable) obj2).getHeight();
            lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            if (1 <= lastIndex2) {
                while (true) {
                    int i6 = i3 + 1;
                    Object obj4 = arrayList.get(i3);
                    int height2 = ((Placeable) obj4).getHeight();
                    if (height < height2) {
                        obj2 = obj4;
                        height = height2;
                    }
                    if (i3 == lastIndex2) {
                        break;
                    }
                    i3 = i6;
                }
            }
        }
        Placeable placeable2 = (Placeable) obj2;
        Integer valueOf2 = placeable2 != null ? Integer.valueOf(placeable2.getHeight()) : null;
        return MeasureScope.DefaultImpls.layout$default(Layout, m3295getMinWidthimpl, valueOf2 == null ? Constraints.m3294getMinHeightimpl(j2) : valueOf2.intValue(), null, new AndroidDialog_androidKt$DialogLayout$1$measure$1(arrayList), 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i2) {
        return MeasurePolicy.DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i2) {
        return MeasurePolicy.DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
    }
}
