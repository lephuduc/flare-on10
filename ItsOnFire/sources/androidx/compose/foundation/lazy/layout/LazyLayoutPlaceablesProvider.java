package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\t\u001a*\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\nj\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;", "", "itemsProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemsProvider;", "itemContentFactory", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "subcomposeMeasureScope", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemsProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeMeasureScope;)V", "placeablesCache", "Ljava/util/HashMap;", "", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;", "Lkotlin/collections/HashMap;", "getAndMeasure", FirebaseAnalytics.Param.INDEX, "constraints", "Landroidx/compose/ui/unit/Constraints;", "getAndMeasure-0kLqBqw", "(IJ)[Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyLayoutPlaceablesProvider {
    @NotNull
    private final LazyLayoutItemContentFactory itemContentFactory;
    @NotNull
    private final LazyLayoutItemsProvider itemsProvider;
    @NotNull
    private final HashMap<Integer, LazyLayoutPlaceable[]> placeablesCache;
    @NotNull
    private final SubcomposeMeasureScope subcomposeMeasureScope;

    public LazyLayoutPlaceablesProvider(@NotNull LazyLayoutItemsProvider itemsProvider, @NotNull LazyLayoutItemContentFactory itemContentFactory, @NotNull SubcomposeMeasureScope subcomposeMeasureScope) {
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        Intrinsics.checkNotNullParameter(itemContentFactory, "itemContentFactory");
        Intrinsics.checkNotNullParameter(subcomposeMeasureScope, "subcomposeMeasureScope");
        this.itemsProvider = itemsProvider;
        this.itemContentFactory = itemContentFactory;
        this.subcomposeMeasureScope = subcomposeMeasureScope;
        this.placeablesCache = new HashMap<>();
    }

    @NotNull
    /* renamed from: getAndMeasure-0kLqBqw  reason: not valid java name */
    public final LazyLayoutPlaceable[] m438getAndMeasure0kLqBqw(int i2, long j2) {
        LazyLayoutPlaceable[] lazyLayoutPlaceableArr = this.placeablesCache.get(Integer.valueOf(i2));
        if (lazyLayoutPlaceableArr != null) {
            return lazyLayoutPlaceableArr;
        }
        Object key = this.itemsProvider.getKey(i2);
        List<Measurable> subcompose = this.subcomposeMeasureScope.subcompose(key, this.itemContentFactory.getContent(i2, key));
        int size = subcompose.size();
        LazyLayoutPlaceable[] lazyLayoutPlaceableArr2 = new LazyLayoutPlaceable[size];
        for (int i3 = 0; i3 < size; i3++) {
            Measurable measurable = subcompose.get(i3);
            lazyLayoutPlaceableArr2[i3] = new LazyLayoutPlaceable(measurable.mo2758measureBRTryo0(j2), measurable.getParentData());
        }
        this.placeablesCache.put(Integer.valueOf(i2), lazyLayoutPlaceableArr2);
        return lazyLayoutPlaceableArr2;
    }
}
