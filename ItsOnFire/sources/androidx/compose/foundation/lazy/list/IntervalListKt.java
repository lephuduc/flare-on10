package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0000\u001a \u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\u0006\u0010\t\u001a\u00020\u0001H\u0000¨\u0006\u000b"}, d2 = {"findIndexOfHighestValueLesserThan", "", "T", "list", "", "Landroidx/compose/foundation/lazy/list/IntervalHolder;", "value", "intervalForIndex", "Landroidx/compose/foundation/lazy/list/IntervalList;", FirebaseAnalytics.Param.INDEX, "intervalIndexForItemIndex", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class IntervalListKt {
    private static final <T> int findIndexOfHighestValueLesserThan(List<IntervalHolder<T>> list, int i2) {
        int lastIndex;
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list);
        int i3 = 0;
        while (i3 < lastIndex) {
            int i4 = ((lastIndex - i3) / 2) + i3;
            int startIndex = list.get(i4).getStartIndex();
            if (startIndex == i2) {
                return i4;
            }
            if (startIndex < i2) {
                i3 = i4 + 1;
                if (i2 < list.get(i3).getStartIndex()) {
                    return i4;
                }
            } else {
                lastIndex = i4 - 1;
            }
        }
        return i3;
    }

    @NotNull
    public static final <T> IntervalHolder<T> intervalForIndex(@NotNull IntervalList<T> intervalList, int i2) {
        Intrinsics.checkNotNullParameter(intervalList, "<this>");
        return intervalList.getIntervals().get(intervalIndexForItemIndex(intervalList, i2));
    }

    public static final <T> int intervalIndexForItemIndex(@NotNull IntervalList<T> intervalList, int i2) {
        Intrinsics.checkNotNullParameter(intervalList, "<this>");
        if (i2 < 0 || i2 >= intervalList.getTotalSize()) {
            throw new IndexOutOfBoundsException("Index " + i2 + ", size " + intervalList.getTotalSize());
        }
        return findIndexOfHighestValueLesserThan(intervalList.getIntervals(), i2);
    }
}
