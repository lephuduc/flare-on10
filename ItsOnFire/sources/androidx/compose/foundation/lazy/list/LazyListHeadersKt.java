package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\u001aF\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0000¨\u0006\f"}, d2 = {"findOrComposeLazyListHeader", "Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;", "composedVisibleItems", "", "itemProvider", "Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;", "headerIndexes", "", "", "beforeContentPadding", "layoutWidth", "layoutHeight", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyListHeadersKt {
    @Nullable
    public static final LazyListPositionedItem findOrComposeLazyListHeader(@NotNull List<LazyListPositionedItem> composedVisibleItems, @NotNull LazyMeasuredItemProvider itemProvider, @NotNull List<Integer> headerIndexes, int i2, int i3, int i4) {
        Object first;
        int i5;
        int lastIndex;
        Intrinsics.checkNotNullParameter(composedVisibleItems, "composedVisibleItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(headerIndexes, "headerIndexes");
        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) composedVisibleItems);
        int index = ((LazyListPositionedItem) first).getIndex();
        int size = headerIndexes.size();
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (i6 < size) {
            int i9 = i6 + 1;
            if (headerIndexes.get(i6).intValue() > index) {
                break;
            }
            i7 = headerIndexes.get(i6).intValue();
            if (i9 >= 0) {
                lastIndex = CollectionsKt__CollectionsKt.getLastIndex(headerIndexes);
                if (i9 <= lastIndex) {
                    i5 = headerIndexes.get(i9);
                    i8 = i5.intValue();
                    i6 = i9;
                }
            }
            i5 = -1;
            i8 = i5.intValue();
            i6 = i9;
        }
        int size2 = composedVisibleItems.size();
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = 0;
        int i13 = -1;
        while (i12 < size2) {
            int i14 = i12 + 1;
            LazyListPositionedItem lazyListPositionedItem = composedVisibleItems.get(i12);
            if (lazyListPositionedItem.getIndex() == i7) {
                i10 = lazyListPositionedItem.getOffset();
                i13 = i12;
            } else if (lazyListPositionedItem.getIndex() == i8) {
                i11 = lazyListPositionedItem.getOffset();
            }
            i12 = i14;
        }
        if (i7 == -1) {
            return null;
        }
        LazyMeasuredItem m479getAndMeasureoA9DU0 = itemProvider.m479getAndMeasureoA9DU0(DataIndex.m444constructorimpl(i7));
        int i15 = -i2;
        if (i10 != Integer.MIN_VALUE) {
            i15 = Math.max(i15, i10);
        }
        if (i11 != Integer.MIN_VALUE) {
            i15 = Math.min(i15, i11 - m479getAndMeasureoA9DU0.getSize());
        }
        LazyListPositionedItem position = m479getAndMeasureoA9DU0.position(i15, i3, i4);
        if (i13 != -1) {
            composedVisibleItems.set(i13, position);
        } else {
            composedVisibleItems.add(0, position);
        }
        return position;
    }
}
