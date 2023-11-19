package androidx.compose.foundation.lazy.list;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import j.j;
import j.u0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020\b¢\u0006\u0004\b>\u0010?JM\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u001c\u0010\u0017\u001a\u00020\u0006*\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J<\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0006\u0010\u001e\u001a\u00020\u001dJ;\u0010'\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J\u0006\u0010(\u001a\u00020\u0013R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\"\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u00103\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u00106\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u00107\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0001088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010=\u001a\u00020\u0002*\u00020\u00068BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b;\u0010<\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Landroidx/compose/foundation/lazy/list/LazyListItemPlacementAnimator;", "", "", FirebaseAnalytics.Param.INDEX, "sizeWithSpacings", "averageItemsSize", "Landroidx/compose/ui/unit/IntOffset;", "scrolledBy", "", "reverseLayout", "mainAxisLayoutSize", "fallback", "calculateExpectedOffset-tGxSNXI", "(IIIJZII)I", "calculateExpectedOffset", "Landroidx/compose/foundation/lazy/list/LazyListPositionedItem;", "item", "Landroidx/compose/foundation/lazy/list/ItemInfo;", "itemInfo", "", "startAnimationsIfNeeded", "toOffset-Bjo55l4", "(I)J", "toOffset", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Landroidx/compose/foundation/lazy/list/LazyMeasuredItemProvider;", "itemProvider", "onMeasured", "key", "placeableIndex", "minOffset", "maxOffset", "rawOffset", "getAnimatedOffset-YT5a7pE", "(Ljava/lang/Object;IIIJ)J", "getAnimatedOffset", "reset", "Lj/u0;", "scope", "Lj/u0;", "isVertical", "Z", "", "keyToItemInfoMap", "Ljava/util/Map;", "", "keyToIndexMap", "viewportStartItemIndex", "I", "viewportStartItemNotVisiblePartSize", "viewportEndItemIndex", "viewportEndItemNotVisiblePartSize", "", "positionedKeys", "Ljava/util/Set;", "getMainAxis--gyyYBs", "(J)I", "mainAxis", "<init>", "(Lj/u0;Z)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class LazyListItemPlacementAnimator {
    private final boolean isVertical;
    @NotNull
    private Map<Object, Integer> keyToIndexMap;
    @NotNull
    private final Map<Object, ItemInfo> keyToItemInfoMap;
    @NotNull
    private final Set<Object> positionedKeys;
    @NotNull
    private final u0 scope;
    private int viewportEndItemIndex;
    private int viewportEndItemNotVisiblePartSize;
    private int viewportStartItemIndex;
    private int viewportStartItemNotVisiblePartSize;

    public LazyListItemPlacementAnimator(@NotNull u0 scope, boolean z) {
        Map<Object, Integer> emptyMap;
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        this.isVertical = z;
        this.keyToItemInfoMap = new LinkedHashMap();
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.keyToIndexMap = emptyMap;
        this.viewportStartItemIndex = -1;
        this.viewportEndItemIndex = -1;
        this.positionedKeys = new LinkedHashSet();
    }

    /* renamed from: calculateExpectedOffset-tGxSNXI  reason: not valid java name */
    private final int m461calculateExpectedOffsettGxSNXI(int i2, int i3, int i4, long j2, boolean z, int i5, int i6) {
        boolean z2 = false;
        int i7 = this.viewportEndItemIndex;
        boolean z3 = z ? i7 > i2 : i7 < i2;
        int i8 = this.viewportStartItemIndex;
        if (z ? i8 < i2 : i8 > i2) {
            z2 = true;
        }
        if (z3) {
            return i5 + this.viewportEndItemNotVisiblePartSize + (i4 * (((i2 - this.viewportEndItemIndex) * (z ? -1 : 1)) - 1)) + m462getMainAxisgyyYBs(j2);
        } else if (z2) {
            return ((this.viewportStartItemNotVisiblePartSize - i3) - (i4 * (((this.viewportStartItemIndex - i2) * (z ? -1 : 1)) - 1))) + m462getMainAxisgyyYBs(j2);
        } else {
            return i6;
        }
    }

    /* renamed from: getMainAxis--gyyYBs  reason: not valid java name */
    private final int m462getMainAxisgyyYBs(long j2) {
        return this.isVertical ? IntOffset.m3444getYimpl(j2) : IntOffset.m3443getXimpl(j2);
    }

    private final void startAnimationsIfNeeded(LazyListPositionedItem lazyListPositionedItem, ItemInfo itemInfo) {
        while (itemInfo.getPlaceables().size() > lazyListPositionedItem.getPlaceablesCount()) {
            CollectionsKt__MutableCollectionsKt.removeLast(itemInfo.getPlaceables());
        }
        while (itemInfo.getPlaceables().size() < lazyListPositionedItem.getPlaceablesCount()) {
            int size = itemInfo.getPlaceables().size();
            long m473getOffsetBjo55l4 = lazyListPositionedItem.m473getOffsetBjo55l4(size);
            List<PlaceableInfo> placeables = itemInfo.getPlaceables();
            long m455getNotAnimatableDeltanOccac = itemInfo.m455getNotAnimatableDeltanOccac();
            placeables.add(new PlaceableInfo(IntOffsetKt.IntOffset(IntOffset.m3443getXimpl(m473getOffsetBjo55l4) - IntOffset.m3443getXimpl(m455getNotAnimatableDeltanOccac), IntOffset.m3444getYimpl(m473getOffsetBjo55l4) - IntOffset.m3444getYimpl(m455getNotAnimatableDeltanOccac)), lazyListPositionedItem.getMainAxisSize(size), null));
        }
        List<PlaceableInfo> placeables2 = itemInfo.getPlaceables();
        int i2 = 0;
        int size2 = placeables2.size();
        while (i2 < size2) {
            int i3 = i2 + 1;
            PlaceableInfo placeableInfo = placeables2.get(i2);
            long m481getTargetOffsetnOccac = placeableInfo.m481getTargetOffsetnOccac();
            long m455getNotAnimatableDeltanOccac2 = itemInfo.m455getNotAnimatableDeltanOccac();
            long IntOffset = IntOffsetKt.IntOffset(IntOffset.m3443getXimpl(m481getTargetOffsetnOccac) + IntOffset.m3443getXimpl(m455getNotAnimatableDeltanOccac2), IntOffset.m3444getYimpl(m481getTargetOffsetnOccac) + IntOffset.m3444getYimpl(m455getNotAnimatableDeltanOccac2));
            long m473getOffsetBjo55l42 = lazyListPositionedItem.m473getOffsetBjo55l4(i2);
            placeableInfo.setSize(lazyListPositionedItem.getMainAxisSize(i2));
            FiniteAnimationSpec<IntOffset> animationSpec = lazyListPositionedItem.getAnimationSpec(i2);
            if (!IntOffset.m3442equalsimpl0(IntOffset, m473getOffsetBjo55l42)) {
                long m455getNotAnimatableDeltanOccac3 = itemInfo.m455getNotAnimatableDeltanOccac();
                placeableInfo.m482setTargetOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m3443getXimpl(m473getOffsetBjo55l42) - IntOffset.m3443getXimpl(m455getNotAnimatableDeltanOccac3), IntOffset.m3444getYimpl(m473getOffsetBjo55l42) - IntOffset.m3444getYimpl(m455getNotAnimatableDeltanOccac3)));
                if (animationSpec != null) {
                    placeableInfo.setInProgress(true);
                    j.e(this.scope, null, null, new LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1(placeableInfo, animationSpec, null), 3, null);
                }
            }
            i2 = i3;
        }
    }

    /* renamed from: toOffset-Bjo55l4  reason: not valid java name */
    private final long m463toOffsetBjo55l4(int i2) {
        boolean z = this.isVertical;
        int i3 = z ? 0 : i2;
        if (!z) {
            i2 = 0;
        }
        return IntOffsetKt.IntOffset(i3, i2);
    }

    /* renamed from: getAnimatedOffset-YT5a7pE  reason: not valid java name */
    public final long m464getAnimatedOffsetYT5a7pE(@NotNull Object key, int i2, int i3, int i4, long j2) {
        Intrinsics.checkNotNullParameter(key, "key");
        ItemInfo itemInfo = this.keyToItemInfoMap.get(key);
        if (itemInfo == null) {
            return j2;
        }
        PlaceableInfo placeableInfo = itemInfo.getPlaceables().get(i2);
        long m3452unboximpl = placeableInfo.getAnimatedOffset().getValue().m3452unboximpl();
        long m455getNotAnimatableDeltanOccac = itemInfo.m455getNotAnimatableDeltanOccac();
        long IntOffset = IntOffsetKt.IntOffset(IntOffset.m3443getXimpl(m3452unboximpl) + IntOffset.m3443getXimpl(m455getNotAnimatableDeltanOccac), IntOffset.m3444getYimpl(m3452unboximpl) + IntOffset.m3444getYimpl(m455getNotAnimatableDeltanOccac));
        long m481getTargetOffsetnOccac = placeableInfo.m481getTargetOffsetnOccac();
        long m455getNotAnimatableDeltanOccac2 = itemInfo.m455getNotAnimatableDeltanOccac();
        long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m3443getXimpl(m481getTargetOffsetnOccac) + IntOffset.m3443getXimpl(m455getNotAnimatableDeltanOccac2), IntOffset.m3444getYimpl(m481getTargetOffsetnOccac) + IntOffset.m3444getYimpl(m455getNotAnimatableDeltanOccac2));
        if (placeableInfo.getInProgress() && ((m462getMainAxisgyyYBs(IntOffset2) < i3 && m462getMainAxisgyyYBs(IntOffset) < i3) || (m462getMainAxisgyyYBs(IntOffset2) > i4 && m462getMainAxisgyyYBs(IntOffset) > i4))) {
            j.e(this.scope, null, null, new LazyListItemPlacementAnimator$getAnimatedOffset$1(placeableInfo, null), 3, null);
        }
        return IntOffset;
    }

    public final void onMeasured(int i2, int i3, int i4, boolean z, @NotNull List<LazyListPositionedItem> positionedItems, @NotNull LazyMeasuredItemProvider itemProvider) {
        boolean z2;
        Object first;
        Object last;
        int sizeWithSpacings;
        boolean z3;
        boolean z4;
        int i5;
        long j2;
        ItemInfo itemInfo;
        LazyListPositionedItem lazyListPositionedItem;
        int m461calculateExpectedOffsettGxSNXI;
        int i6;
        int i7;
        Object obj;
        long j3;
        int i8;
        Intrinsics.checkNotNullParameter(positionedItems, "positionedItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        int size = positionedItems.size();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z2 = false;
                break;
            }
            int i11 = i10 + 1;
            if (positionedItems.get(i10).getHasAnimations()) {
                z2 = true;
                break;
            }
            i10 = i11;
        }
        if (!z2) {
            reset();
            return;
        }
        int i12 = this.isVertical ? i4 : i3;
        int i13 = i2;
        if (z) {
            i13 = -i13;
        }
        long m463toOffsetBjo55l4 = m463toOffsetBjo55l4(i13);
        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) positionedItems);
        LazyListPositionedItem lazyListPositionedItem2 = (LazyListPositionedItem) first;
        last = CollectionsKt___CollectionsKt.last((List<? extends Object>) positionedItems);
        LazyListPositionedItem lazyListPositionedItem3 = (LazyListPositionedItem) last;
        int size2 = positionedItems.size();
        int i14 = 0;
        int i15 = 0;
        while (i14 < size2) {
            int i16 = i14 + 1;
            LazyListPositionedItem lazyListPositionedItem4 = positionedItems.get(i14);
            ItemInfo itemInfo2 = this.keyToItemInfoMap.get(lazyListPositionedItem4.getKey());
            if (itemInfo2 != null) {
                itemInfo2.setIndex(lazyListPositionedItem4.getIndex());
            }
            i15 += lazyListPositionedItem4.getSizeWithSpacings();
            i14 = i16;
        }
        int size3 = i15 / positionedItems.size();
        this.positionedKeys.clear();
        int size4 = positionedItems.size();
        int i17 = 0;
        while (i17 < size4) {
            int i18 = i17 + 1;
            LazyListPositionedItem lazyListPositionedItem5 = positionedItems.get(i17);
            this.positionedKeys.add(lazyListPositionedItem5.getKey());
            ItemInfo itemInfo3 = this.keyToItemInfoMap.get(lazyListPositionedItem5.getKey());
            if (itemInfo3 != null) {
                i5 = size4;
                if (lazyListPositionedItem5.getHasAnimations()) {
                    long m455getNotAnimatableDeltanOccac = itemInfo3.m455getNotAnimatableDeltanOccac();
                    itemInfo3.m456setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m3443getXimpl(m455getNotAnimatableDeltanOccac) + IntOffset.m3443getXimpl(m463toOffsetBjo55l4), IntOffset.m3444getYimpl(m455getNotAnimatableDeltanOccac) + IntOffset.m3444getYimpl(m463toOffsetBjo55l4)));
                    startAnimationsIfNeeded(lazyListPositionedItem5, itemInfo3);
                } else {
                    this.keyToItemInfoMap.remove(lazyListPositionedItem5.getKey());
                }
            } else if (lazyListPositionedItem5.getHasAnimations()) {
                ItemInfo itemInfo4 = new ItemInfo(lazyListPositionedItem5.getIndex());
                Integer num = this.keyToIndexMap.get(lazyListPositionedItem5.getKey());
                long m473getOffsetBjo55l4 = lazyListPositionedItem5.m473getOffsetBjo55l4(i9);
                int mainAxisSize = lazyListPositionedItem5.getMainAxisSize(i9);
                if (num == null) {
                    m461calculateExpectedOffsettGxSNXI = m462getMainAxisgyyYBs(m473getOffsetBjo55l4);
                    j2 = m473getOffsetBjo55l4;
                    itemInfo = itemInfo4;
                    lazyListPositionedItem = lazyListPositionedItem5;
                    i5 = size4;
                } else {
                    int m462getMainAxisgyyYBs = m462getMainAxisgyyYBs(m473getOffsetBjo55l4);
                    if (z) {
                        m462getMainAxisgyyYBs = (m462getMainAxisgyyYBs - lazyListPositionedItem5.getSizeWithSpacings()) + mainAxisSize;
                    }
                    j2 = m473getOffsetBjo55l4;
                    itemInfo = itemInfo4;
                    lazyListPositionedItem = lazyListPositionedItem5;
                    i5 = size4;
                    m461calculateExpectedOffsettGxSNXI = m461calculateExpectedOffsettGxSNXI(num.intValue(), lazyListPositionedItem5.getSizeWithSpacings(), size3, m463toOffsetBjo55l4, z, i12, m462getMainAxisgyyYBs) + (z ? lazyListPositionedItem.getSize() - mainAxisSize : i9);
                }
                if (this.isVertical) {
                    i8 = 0;
                    i7 = 1;
                    obj = null;
                    j3 = j2;
                    i6 = m461calculateExpectedOffsettGxSNXI;
                } else {
                    i6 = 0;
                    i7 = 2;
                    obj = null;
                    j3 = j2;
                    i8 = m461calculateExpectedOffsettGxSNXI;
                }
                long m3439copyiSbpLlY$default = IntOffset.m3439copyiSbpLlY$default(j3, i8, i6, i7, obj);
                int placeablesCount = lazyListPositionedItem.getPlaceablesCount();
                int i19 = i9;
                while (i19 < placeablesCount) {
                    int i20 = i19 + 1;
                    LazyListPositionedItem lazyListPositionedItem6 = lazyListPositionedItem;
                    long m473getOffsetBjo55l42 = lazyListPositionedItem6.m473getOffsetBjo55l4(i19);
                    long IntOffset = IntOffsetKt.IntOffset(IntOffset.m3443getXimpl(m473getOffsetBjo55l42) - IntOffset.m3443getXimpl(j2), IntOffset.m3444getYimpl(m473getOffsetBjo55l42) - IntOffset.m3444getYimpl(j2));
                    itemInfo.getPlaceables().add(new PlaceableInfo(IntOffsetKt.IntOffset(IntOffset.m3443getXimpl(m3439copyiSbpLlY$default) + IntOffset.m3443getXimpl(IntOffset), IntOffset.m3444getYimpl(m3439copyiSbpLlY$default) + IntOffset.m3444getYimpl(IntOffset)), lazyListPositionedItem6.getMainAxisSize(i19), null));
                    Unit unit = Unit.INSTANCE;
                    i19 = i20;
                }
                LazyListPositionedItem lazyListPositionedItem7 = lazyListPositionedItem;
                ItemInfo itemInfo5 = itemInfo;
                this.keyToItemInfoMap.put(lazyListPositionedItem7.getKey(), itemInfo5);
                startAnimationsIfNeeded(lazyListPositionedItem7, itemInfo5);
            } else {
                i5 = size4;
            }
            i17 = i18;
            size4 = i5;
            i9 = 0;
        }
        if (z) {
            this.viewportStartItemIndex = lazyListPositionedItem3.getIndex();
            this.viewportStartItemNotVisiblePartSize = (i12 - lazyListPositionedItem3.getOffset()) - lazyListPositionedItem3.getSize();
            this.viewportEndItemIndex = lazyListPositionedItem2.getIndex();
            sizeWithSpacings = (-lazyListPositionedItem2.getOffset()) + (lazyListPositionedItem2.getSizeWithSpacings() - lazyListPositionedItem2.getSize());
        } else {
            this.viewportStartItemIndex = lazyListPositionedItem2.getIndex();
            this.viewportStartItemNotVisiblePartSize = lazyListPositionedItem2.getOffset();
            this.viewportEndItemIndex = lazyListPositionedItem3.getIndex();
            sizeWithSpacings = (lazyListPositionedItem3.getOffset() + lazyListPositionedItem3.getSizeWithSpacings()) - i12;
        }
        this.viewportEndItemNotVisiblePartSize = sizeWithSpacings;
        Iterator<Map.Entry<Object, ItemInfo>> it = this.keyToItemInfoMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, ItemInfo> next = it.next();
            if (!this.positionedKeys.contains(next.getKey())) {
                ItemInfo value = next.getValue();
                long m455getNotAnimatableDeltanOccac2 = value.m455getNotAnimatableDeltanOccac();
                value.m456setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m3443getXimpl(m455getNotAnimatableDeltanOccac2) + IntOffset.m3443getXimpl(m463toOffsetBjo55l4), IntOffset.m3444getYimpl(m455getNotAnimatableDeltanOccac2) + IntOffset.m3444getYimpl(m463toOffsetBjo55l4)));
                Integer num2 = itemProvider.getKeyToIndexMap().get(next.getKey());
                List<PlaceableInfo> placeables = value.getPlaceables();
                int size5 = placeables.size();
                int i21 = 0;
                while (true) {
                    if (i21 >= size5) {
                        z3 = false;
                        break;
                    }
                    int i22 = i21 + 1;
                    PlaceableInfo placeableInfo = placeables.get(i21);
                    long m481getTargetOffsetnOccac = placeableInfo.m481getTargetOffsetnOccac();
                    long m455getNotAnimatableDeltanOccac3 = value.m455getNotAnimatableDeltanOccac();
                    List<PlaceableInfo> list = placeables;
                    long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m3443getXimpl(m481getTargetOffsetnOccac) + IntOffset.m3443getXimpl(m455getNotAnimatableDeltanOccac3), IntOffset.m3444getYimpl(m481getTargetOffsetnOccac) + IntOffset.m3444getYimpl(m455getNotAnimatableDeltanOccac3));
                    if (m462getMainAxisgyyYBs(IntOffset2) + placeableInfo.getSize() > 0 && m462getMainAxisgyyYBs(IntOffset2) < i12) {
                        z3 = true;
                        break;
                    } else {
                        placeables = list;
                        i21 = i22;
                    }
                }
                List<PlaceableInfo> placeables2 = value.getPlaceables();
                int size6 = placeables2.size();
                int i23 = 0;
                while (true) {
                    if (i23 >= size6) {
                        z4 = false;
                        break;
                    }
                    int i24 = i23 + 1;
                    if (placeables2.get(i23).getInProgress()) {
                        z4 = true;
                        break;
                    }
                    i23 = i24;
                }
                boolean z5 = !z4;
                if ((!z3 && z5) || num2 == null || value.getPlaceables().isEmpty()) {
                    it.remove();
                } else {
                    LazyMeasuredItem m479getAndMeasureoA9DU0 = itemProvider.m479getAndMeasureoA9DU0(DataIndex.m444constructorimpl(num2.intValue()));
                    int m461calculateExpectedOffsettGxSNXI2 = m461calculateExpectedOffsettGxSNXI(num2.intValue(), m479getAndMeasureoA9DU0.getSizeWithSpacings(), size3, m463toOffsetBjo55l4, z, i12, i12);
                    if (z) {
                        m461calculateExpectedOffsettGxSNXI2 = (i12 - m461calculateExpectedOffsettGxSNXI2) - m479getAndMeasureoA9DU0.getSize();
                    }
                    LazyListPositionedItem position = m479getAndMeasureoA9DU0.position(m461calculateExpectedOffsettGxSNXI2, i3, i4);
                    positionedItems.add(position);
                    startAnimationsIfNeeded(position, value);
                }
            }
        }
        this.keyToIndexMap = itemProvider.getKeyToIndexMap();
    }

    public final void reset() {
        Map<Object, Integer> emptyMap;
        this.keyToItemInfoMap.clear();
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.keyToIndexMap = emptyMap;
        this.viewportStartItemIndex = -1;
        this.viewportStartItemNotVisiblePartSize = 0;
        this.viewportEndItemIndex = -1;
        this.viewportEndItemNotVisiblePartSize = 0;
    }
}
