package androidx.compose.ui.window;

import androidx.appcompat.R;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidPopup_androidKt$SimpleStack$1 implements MeasurePolicy {
    public static final AndroidPopup_androidKt$SimpleStack$1 INSTANCE = new AndroidPopup_androidKt$SimpleStack$1();

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
        int i2;
        int i3;
        Map map;
        Function1 function1;
        int lastIndex;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int size = measurables.size();
        if (size != 0) {
            int i6 = 0;
            if (size != 1) {
                ArrayList arrayList = new ArrayList(measurables.size());
                int size2 = measurables.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    arrayList.add(measurables.get(i7).mo2758measureBRTryo0(j2));
                }
                lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                if (lastIndex >= 0) {
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        int i10 = i6 + 1;
                        Placeable placeable = (Placeable) arrayList.get(i6);
                        i8 = Math.max(i8, placeable.getWidth());
                        i9 = Math.max(i9, placeable.getHeight());
                        if (i6 == lastIndex) {
                            break;
                        }
                        i6 = i10;
                    }
                    i4 = i8;
                    i5 = i9;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                return MeasureScope.DefaultImpls.layout$default(Layout, i4, i5, null, new AndroidPopup_androidKt$SimpleStack$1$measure$3(arrayList), 4, null);
            }
            Placeable mo2758measureBRTryo0 = measurables.get(0).mo2758measureBRTryo0(j2);
            i2 = mo2758measureBRTryo0.getWidth();
            i3 = mo2758measureBRTryo0.getHeight();
            map = null;
            function1 = new AndroidPopup_androidKt$SimpleStack$1$measure$2(mo2758measureBRTryo0);
        } else {
            i2 = 0;
            i3 = 0;
            map = null;
            function1 = AndroidPopup_androidKt$SimpleStack$1$measure$1.INSTANCE;
        }
        return MeasureScope.DefaultImpls.layout$default(Layout, i2, i3, map, function1, 4, null);
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
