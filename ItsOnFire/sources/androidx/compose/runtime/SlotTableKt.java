package androidx.compose.runtime;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u001c\n\u0002\b\u0007\u001a\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0018\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0019\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b*\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u0001H\u0002\u001a;\u0010\u001d\u001a\u00020\u001e*\u0012\u0012\u0004\u0012\u00020\u001e0\u001fj\b\u0012\u0004\u0012\u00020\u001e` 2\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0$H\u0082\b\u001a\u0014\u0010%\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001H\u0002\u001a\u0014\u0010&\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001H\u0002\u001a\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b*\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u0001H\u0002\u001a\u0014\u0010(\u001a\u00020)*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001H\u0002\u001a\u0014\u0010*\u001a\u00020)*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001H\u0002\u001aD\u0010+\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u00012\u0006\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020)2\u0006\u00100\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0001H\u0002\u001a\u0014\u0010-\u001a\u00020)*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001H\u0002\u001a\u0014\u0010,\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001H\u0002\u001a\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b*\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u0001H\u0002\u001a,\u00102\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020\u001e0\u001fj\b\u0012\u0004\u0012\u00020\u001e` 2\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001H\u0002\u001a\u0014\u00103\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001H\u0002\u001a\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b*\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u0001H\u0002\u001a\u0014\u00105\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001H\u0002\u001a\u0014\u00106\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001H\u0002\u001a\u0014\u00100\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001H\u0002\u001a\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b*\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u0001H\u0002\u001a,\u00108\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020\u001e0\u001fj\b\u0012\u0004\u0012\u00020\u001e` 2\u0006\u00109\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001H\u0002\u001a \u0010:\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b*\u00020\u00162\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00010<H\u0002\u001a\u0014\u0010=\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0001H\u0002\u001a\u001c\u0010>\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u0001H\u0002\u001a\u001c\u0010@\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001H\u0002\u001a\u001c\u0010A\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001H\u0002\u001a\u001c\u0010B\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Aux_Mask", "", "Aux_Shift", "DataAnchor_Offset", "GroupInfo_Offset", "Group_Fields_Size", "Key_Offset", "MinGroupGrowthSize", "MinSlotsGrowthSize", "NodeBit_Mask", "NodeCount_Mask", "NodeKey", "ObjectKey_Mask", "ObjectKey_Shift", "ParentAnchor_Offset", "Size_Offset", "Slots_Shift", "parentAnchorPivot", "countOneBits", "value", "addAux", "", "", "address", "auxIndex", "dataAnchor", "dataAnchors", "", "len", "getOrAdd", "Landroidx/compose/runtime/Anchor;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", FirebaseAnalytics.Param.INDEX, "effectiveSize", "block", "Lkotlin/Function0;", "groupInfo", "groupSize", "groupSizes", "hasAux", "", "hasObjectKey", "initGroup", "key", "isNode", "hasDataKey", "hasData", "parentAnchor", "keys", "locationOf", "nodeCount", "nodeCounts", "nodeIndex", "objectKeyIndex", "parentAnchors", FirebaseAnalytics.Event.SEARCH, FirebaseAnalytics.Param.LOCATION, "slice", "indices", "", "slotAnchor", "updateDataAnchor", "anchor", "updateGroupSize", "updateNodeCount", "updateParentAnchor", "runtime_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SlotTableKt {
    private static final int Aux_Mask = 268435456;
    private static final int Aux_Shift = 28;
    private static final int DataAnchor_Offset = 4;
    private static final int GroupInfo_Offset = 1;
    private static final int Group_Fields_Size = 5;
    private static final int Key_Offset = 0;
    private static final int MinGroupGrowthSize = 32;
    private static final int MinSlotsGrowthSize = 32;
    private static final int NodeBit_Mask = 1073741824;
    private static final int NodeCount_Mask = 134217727;
    private static final int NodeKey = 125;
    private static final int ObjectKey_Mask = 536870912;
    private static final int ObjectKey_Shift = 29;
    private static final int ParentAnchor_Offset = 2;
    private static final int Size_Offset = 3;
    private static final int Slots_Shift = 28;
    private static final int parentAnchorPivot = -2;

    public static final /* synthetic */ int access$auxIndex(int[] iArr, int i2) {
        return auxIndex(iArr, i2);
    }

    public static final /* synthetic */ int access$dataAnchor(int[] iArr, int i2) {
        return dataAnchor(iArr, i2);
    }

    public static final /* synthetic */ List access$dataAnchors(int[] iArr, int i2) {
        return dataAnchors(iArr, i2);
    }

    public static final /* synthetic */ int access$groupSize(int[] iArr, int i2) {
        return groupSize(iArr, i2);
    }

    public static final /* synthetic */ List access$groupSizes(int[] iArr, int i2) {
        return groupSizes(iArr, i2);
    }

    public static final /* synthetic */ boolean access$hasAux(int[] iArr, int i2) {
        return hasAux(iArr, i2);
    }

    public static final /* synthetic */ boolean access$hasObjectKey(int[] iArr, int i2) {
        return hasObjectKey(iArr, i2);
    }

    public static final /* synthetic */ boolean access$isNode(int[] iArr, int i2) {
        return isNode(iArr, i2);
    }

    public static final /* synthetic */ int access$key(int[] iArr, int i2) {
        return key(iArr, i2);
    }

    public static final /* synthetic */ List access$keys(int[] iArr, int i2) {
        return keys(iArr, i2);
    }

    public static final /* synthetic */ int access$nodeCount(int[] iArr, int i2) {
        return nodeCount(iArr, i2);
    }

    public static final /* synthetic */ List access$nodeCounts(int[] iArr, int i2) {
        return nodeCounts(iArr, i2);
    }

    public static final /* synthetic */ int access$nodeIndex(int[] iArr, int i2) {
        return nodeIndex(iArr, i2);
    }

    public static final /* synthetic */ int access$objectKeyIndex(int[] iArr, int i2) {
        return objectKeyIndex(iArr, i2);
    }

    public static final /* synthetic */ int access$parentAnchor(int[] iArr, int i2) {
        return parentAnchor(iArr, i2);
    }

    public static final /* synthetic */ List access$parentAnchors(int[] iArr, int i2) {
        return parentAnchors(iArr, i2);
    }

    public static final /* synthetic */ int access$search(ArrayList arrayList, int i2, int i3) {
        return search(arrayList, i2, i3);
    }

    public static final /* synthetic */ int access$slotAnchor(int[] iArr, int i2) {
        return slotAnchor(iArr, i2);
    }

    public static final void addAux(int[] iArr, int i2) {
        int i3 = (i2 * 5) + 1;
        iArr[i3] = iArr[i3] | Aux_Mask;
    }

    public static final int auxIndex(int[] iArr, int i2) {
        int i3 = i2 * 5;
        if (i3 >= iArr.length) {
            return iArr.length;
        }
        return countOneBits(iArr[i3 + 1] >> 29) + iArr[i3 + 4];
    }

    public static final int countOneBits(int i2) {
        switch (i2) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static final int dataAnchor(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 4];
    }

    public static final List<Integer> dataAnchors(int[] iArr, int i2) {
        IntRange until;
        IntProgression step;
        until = RangesKt___RangesKt.until(4, i2);
        step = RangesKt___RangesKt.step(until, 5);
        return slice(iArr, step);
    }

    public static /* synthetic */ List dataAnchors$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return dataAnchors(iArr, i2);
    }

    private static final Anchor getOrAdd(ArrayList<Anchor> arrayList, int i2, int i3, Function0<Anchor> function0) {
        int search = search(arrayList, i2, i3);
        if (search < 0) {
            Anchor invoke = function0.invoke();
            arrayList.add(-(search + 1), invoke);
            return invoke;
        }
        Anchor anchor = arrayList.get(search);
        Intrinsics.checkNotNullExpressionValue(anchor, "get(location)");
        return anchor;
    }

    public static final int groupInfo(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 1];
    }

    public static final int groupSize(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 3];
    }

    public static final List<Integer> groupSizes(int[] iArr, int i2) {
        IntRange until;
        IntProgression step;
        until = RangesKt___RangesKt.until(3, i2);
        step = RangesKt___RangesKt.step(until, 5);
        return slice(iArr, step);
    }

    public static /* synthetic */ List groupSizes$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return groupSizes(iArr, i2);
    }

    public static final boolean hasAux(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & Aux_Mask) != 0;
    }

    public static final boolean hasObjectKey(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & ObjectKey_Mask) != 0;
    }

    public static final void initGroup(int[] iArr, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, int i5) {
        int i6 = z ? NodeBit_Mask : 0;
        int i7 = z2 ? ObjectKey_Mask : 0;
        int i8 = z3 ? Aux_Mask : 0;
        int i9 = i2 * 5;
        iArr[i9 + 0] = i3;
        iArr[i9 + 1] = i6 | i7 | i8;
        iArr[i9 + 2] = i4;
        iArr[i9 + 3] = 0;
        iArr[i9 + 4] = i5;
    }

    public static final boolean isNode(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & NodeBit_Mask) != 0;
    }

    public static final int key(int[] iArr, int i2) {
        return iArr[i2 * 5];
    }

    public static final List<Integer> keys(int[] iArr, int i2) {
        IntRange until;
        IntProgression step;
        until = RangesKt___RangesKt.until(0, i2);
        step = RangesKt___RangesKt.step(until, 5);
        return slice(iArr, step);
    }

    public static /* synthetic */ List keys$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return keys(iArr, i2);
    }

    public static final int locationOf(ArrayList<Anchor> arrayList, int i2, int i3) {
        int search = search(arrayList, i2, i3);
        return search >= 0 ? search : -(search + 1);
    }

    public static final int nodeCount(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 1] & NodeCount_Mask;
    }

    public static final List<Integer> nodeCounts(int[] iArr, int i2) {
        IntRange until;
        IntProgression step;
        until = RangesKt___RangesKt.until(1, i2);
        step = RangesKt___RangesKt.step(until, 5);
        List<Integer> slice = slice(iArr, step);
        ArrayList arrayList = new ArrayList(slice.size());
        int size = slice.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(Integer.valueOf(slice.get(i3).intValue() & NodeCount_Mask));
        }
        return arrayList;
    }

    public static /* synthetic */ List nodeCounts$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return nodeCounts(iArr, i2);
    }

    public static final int nodeIndex(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 4];
    }

    public static final int objectKeyIndex(int[] iArr, int i2) {
        int i3 = i2 * 5;
        return iArr[i3 + 4] + countOneBits(iArr[i3 + 1] >> 30);
    }

    public static final int parentAnchor(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 2];
    }

    public static final List<Integer> parentAnchors(int[] iArr, int i2) {
        IntRange until;
        IntProgression step;
        until = RangesKt___RangesKt.until(2, i2);
        step = RangesKt___RangesKt.step(until, 5);
        return slice(iArr, step);
    }

    public static /* synthetic */ List parentAnchors$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = iArr.length;
        }
        return parentAnchors(iArr, i2);
    }

    public static final int search(ArrayList<Anchor> arrayList, int i2, int i3) {
        int size = arrayList.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            int location$runtime_release = arrayList.get(i5).getLocation$runtime_release();
            if (location$runtime_release < 0) {
                location$runtime_release += i3;
            }
            int compare = Intrinsics.compare(location$runtime_release, i2);
            if (compare < 0) {
                i4 = i5 + 1;
            } else if (compare <= 0) {
                return i5;
            } else {
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    private static final List<Integer> slice(int[] iArr, Iterable<Integer> iterable) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : iterable) {
            arrayList.add(Integer.valueOf(iArr[num.intValue()]));
        }
        return arrayList;
    }

    public static final int slotAnchor(int[] iArr, int i2) {
        int i3 = i2 * 5;
        return iArr[i3 + 4] + countOneBits(iArr[i3 + 1] >> 28);
    }

    public static final void updateDataAnchor(int[] iArr, int i2, int i3) {
        iArr[(i2 * 5) + 4] = i3;
    }

    public static final void updateGroupSize(int[] iArr, int i2, int i3) {
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        iArr[(i2 * 5) + 3] = i3;
    }

    public static final void updateNodeCount(int[] iArr, int i2, int i3) {
        if (!(i3 >= 0 && i3 < NodeCount_Mask)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i4 = (i2 * 5) + 1;
        iArr[i4] = i3 | (iArr[i4] & (-134217728));
    }

    public static final void updateParentAnchor(int[] iArr, int i2, int i3) {
        iArr[(i2 * 5) + 2] = i3;
    }
}
