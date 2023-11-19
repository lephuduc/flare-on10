package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import androidx.compose.foundation.lazy.layout.LazyLayoutPlaceable;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/lazy/list/MeasuredItemFactory;", "", "createItem", "Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;", FirebaseAnalytics.Param.INDEX, "Landroidx/compose/foundation/lazy/list/DataIndex;", "key", "placeables", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;", "createItem-8xJyyfI", "(ILjava/lang/Object;[Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceable;)Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public interface MeasuredItemFactory {
    @NotNull
    /* renamed from: createItem-8xJyyfI */
    LazyMeasuredItem mo469createItem8xJyyfI(int i2, @NotNull Object obj, @NotNull LazyLayoutPlaceable[] lazyLayoutPlaceableArr);
}
