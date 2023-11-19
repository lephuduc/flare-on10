package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ax\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001aØ\u0001\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010\f\u001a\u00020\r2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(2/\u0010)\u001a+\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+¢\u0006\u0002\b.\u0012\u0004\u0012\u00020/0*H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"calculateItemsOffsets", "", "Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;", FirebaseAnalytics.Param.ITEMS, "", "Landroidx/compose/foundation/lazy/list/LazyMeasuredItem;", "layoutWidth", "", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "isVertical", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "reverseLayout", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "measureLazyList", "Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;", "itemsCount", "itemProvider", "Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "firstVisibleItemIndex", "Landroidx/compose/foundation/lazy/list/DataIndex;", "firstVisibleItemScrollOffset", "scrollToBeConsumed", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "headerIndexes", "placementAnimator", "Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;", "layout", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", "measureLazyList-wroFCeY", "(ILandroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;IIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyListMeasureKt {
    private static final List<LazyListPositionedItem> calculateItemsOffsets(List<LazyMeasuredItem> list, int i2, int i3, int i4, int i5, int i6, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z2, Density density, LayoutDirection layoutDirection) {
        int i7 = z ? i3 : i2;
        boolean z3 = i4 < Math.min(i7, i5);
        if (z3) {
            if (!(i6 == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        ArrayList arrayList = new ArrayList(list.size());
        if (z3) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i8 = 0; i8 < size; i8++) {
                iArr[i8] = list.get(!z2 ? i8 : (size - i8) - 1).getSize();
            }
            int[] iArr2 = new int[size];
            for (int i9 = 0; i9 < size; i9++) {
                iArr2[i9] = 0;
            }
            if (z) {
                if (vertical == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                vertical.arrange(density, i7, iArr, iArr2);
            } else if (horizontal == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            } else {
                horizontal.arrange(density, i7, iArr, layoutDirection, iArr2);
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                int i12 = iArr2[i10];
                i10++;
                int i13 = i11 + 1;
                if (z2) {
                    i11 = (size - i11) - 1;
                }
                LazyMeasuredItem lazyMeasuredItem = list.get(i11);
                if (z2) {
                    i12 = (i7 - i12) - lazyMeasuredItem.getSize();
                }
                arrayList.add(z2 ? 0 : arrayList.size(), lazyMeasuredItem.position(i12, i2, i3));
                i11 = i13;
            }
        } else {
            int size2 = list.size();
            int i14 = i6;
            for (int i15 = 0; i15 < size2; i15++) {
                LazyMeasuredItem lazyMeasuredItem2 = list.get(i15);
                arrayList.add(lazyMeasuredItem2.position(i14, i2, i3));
                i14 += lazyMeasuredItem2.getSizeWithSpacings();
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0279  */
    @org.jetbrains.annotations.NotNull
    /* renamed from: measureLazyList-wroFCeY  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.foundation.lazy.list.LazyListMeasureResult m470measureLazyListwroFCeY(int r23, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.list.LazyMeasuredItemProvider r24, int r25, int r26, int r27, int r28, int r29, float r30, long r31, boolean r33, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> r34, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Vertical r35, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.Arrangement.Horizontal r36, boolean r37, @org.jetbrains.annotations.NotNull androidx.compose.ui.unit.Density r38, @org.jetbrains.annotations.NotNull androidx.compose.ui.unit.LayoutDirection r39, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.list.LazyListItemPlacementAnimator r40, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>, ? extends androidx.compose.ui.layout.MeasureResult> r41) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.list.LazyListMeasureKt.m470measureLazyListwroFCeY(int, androidx.compose.foundation.lazy.list.LazyMeasuredItemProvider, int, int, int, int, int, float, long, boolean, java.util.List, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, boolean, androidx.compose.ui.unit.Density, androidx.compose.ui.unit.LayoutDirection, androidx.compose.foundation.lazy.list.LazyListItemPlacementAnimator, kotlin.jvm.functions.Function3):androidx.compose.foundation.lazy.list.LazyListMeasureResult");
    }
}
