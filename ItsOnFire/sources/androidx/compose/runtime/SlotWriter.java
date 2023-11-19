package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b0\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\nJ\u0010\u00102\u001a\u00020\u00072\b\b\u0002\u00103\u001a\u00020\nJ\u000e\u00104\u001a\u00020\n2\u0006\u00102\u001a\u00020\u0007J\u0006\u00105\u001a\u000200J\u0006\u00106\u001a\u000200J \u00107\u001a\u00020\n2\u0006\u00102\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u00109\u001a\u00020\n2\u0006\u00103\u001a\u00020\nH\u0002J\u0010\u0010:\u001a\u00020\n2\u0006\u00109\u001a\u00020\nH\u0002J(\u0010;\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u0010<\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010=\u001a\u00020\nJ\u0006\u0010>\u001a\u000200J\u000e\u0010?\u001a\u0002002\u0006\u00102\u001a\u00020\u0007J\u000e\u0010?\u001a\u0002002\u0006\u00103\u001a\u00020\nJ \u0010@\u001a\u0002002\u0006\u0010\"\u001a\u00020\n2\u0006\u0010=\u001a\u00020\n2\u0006\u0010A\u001a\u00020\nH\u0002J\u0010\u0010B\u001a\u0004\u0018\u00010\u00012\u0006\u00103\u001a\u00020\nJ\u0010\u0010C\u001a\u00020\n2\u0006\u00103\u001a\u00020\nH\u0002J\u000e\u0010D\u001a\u00020\n2\u0006\u00103\u001a\u00020\nJ\u0010\u0010E\u001a\u0004\u0018\u00010\u00012\u0006\u00103\u001a\u00020\nJ\u000e\u0010F\u001a\u00020\n2\u0006\u00103\u001a\u00020\nJ\u000e\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010HJ\u0006\u0010I\u001a\u00020JJ\u0010\u0010K\u001a\u0002002\b\u0010L\u001a\u0004\u0018\u00010\u0001J\u0010\u0010M\u001a\u0002002\u0006\u0010$\u001a\u00020\nH\u0002J\u0018\u0010N\u001a\u0002002\u0006\u0010$\u001a\u00020\n2\u0006\u0010O\u001a\u00020\nH\u0002J\u000e\u0010P\u001a\b\u0012\u0004\u0012\u00020\n0QH\u0002J \u0010R\u001a\u0002002\u0006\u0010S\u001a\u00020\n2\u0006\u0010T\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nH\u0002J\u001c\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00070Q2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00103\u001a\u00020\nJ\u000e\u0010V\u001a\u0002002\u0006\u0010W\u001a\u00020\nJ\u0010\u0010X\u001a\u0002002\u0006\u00103\u001a\u00020\nH\u0002J\u0018\u0010Y\u001a\u0002002\u0006\u00103\u001a\u00020\n2\u0006\u0010O\u001a\u00020\nH\u0002J\u0010\u0010Z\u001a\u0004\u0018\u00010\u00012\u0006\u00102\u001a\u00020\u0007J\u0010\u0010Z\u001a\u0004\u0018\u00010\u00012\u0006\u00103\u001a\u00020\nJ\u000e\u0010\"\u001a\u00020\n2\u0006\u00102\u001a\u00020\u0007J\u000e\u0010\"\u001a\u00020\n2\u0006\u00103\u001a\u00020\nJ\u0010\u0010[\u001a\u00020\n2\u0006\u00103\u001a\u00020\nH\u0002J\u0018\u0010\\\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u0010<\u001a\u00020\nH\u0002J\u0018\u0010]\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nH\u0002J\u0006\u0010^\u001a\u00020\u000eJ\u0018\u0010_\u001a\u00020\u000e2\u0006\u0010`\u001a\u00020\n2\u0006\u0010a\u001a\u00020\nH\u0002J \u0010b\u001a\u0002002\u0006\u0010`\u001a\u00020\n2\u0006\u0010a\u001a\u00020\n2\u0006\u0010O\u001a\u00020\nH\u0002J\b\u0010c\u001a\u00020\nH\u0002J\b\u0010d\u001a\u000200H\u0002J\u000e\u0010e\u001a\u0002002\u0006\u00102\u001a\u00020\u0007J\u0010\u0010f\u001a\u0002002\b\u0010L\u001a\u0004\u0018\u00010\u0001J\u001a\u0010f\u001a\u0004\u0018\u00010\u00012\u0006\u00103\u001a\u00020\n2\b\u0010L\u001a\u0004\u0018\u00010\u0001J\b\u0010g\u001a\u0004\u0018\u00010\u0001J\u0006\u0010h\u001a\u00020\nJ\u0006\u0010i\u001a\u000200J\u0018\u0010j\u001a\u0002002\u0006\u0010k\u001a\u00020\n2\b\u0010l\u001a\u0004\u0018\u00010\u0001J\"\u0010j\u001a\u0002002\u0006\u0010k\u001a\u00020\n2\b\u0010m\u001a\u0004\u0018\u00010\u00012\b\u0010l\u001a\u0004\u0018\u00010\u0001J\u0006\u0010n\u001a\u000200J\u000e\u0010n\u001a\u0002002\u0006\u0010k\u001a\u00020\nJ\u0018\u0010n\u001a\u0002002\u0006\u0010k\u001a\u00020\n2\b\u0010o\u001a\u0004\u0018\u00010\u0001J,\u0010n\u001a\u0002002\u0006\u0010k\u001a\u00020\n2\b\u0010m\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001f\u001a\u00020\u000e2\b\u0010l\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010p\u001a\u0002002\b\u0010k\u001a\u0004\u0018\u00010\u0001J\u001a\u0010p\u001a\u0002002\b\u0010k\u001a\u0004\u0018\u00010\u00012\b\u0010Z\u001a\u0004\u0018\u00010\u0001J\b\u0010q\u001a\u00020JH\u0016J\u0012\u0010r\u001a\u0004\u0018\u00010\u00012\b\u0010L\u001a\u0004\u0018\u00010\u0001J\u0018\u0010s\u001a\u0002002\u0006\u0010t\u001a\u00020\n2\u0006\u0010u\u001a\u00020\nH\u0002J\u0010\u0010v\u001a\u0002002\b\u0010L\u001a\u0004\u0018\u00010\u0001J\u0018\u0010w\u001a\u0002002\u0006\u00102\u001a\u00020\u00072\b\u0010L\u001a\u0004\u0018\u00010\u0001J\u0010\u0010w\u001a\u0002002\b\u0010L\u001a\u0004\u0018\u00010\u0001J\u001a\u0010x\u001a\u0002002\u0006\u00103\u001a\u00020\n2\b\u0010L\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010y\u001a\u0002002\b\u0010L\u001a\u0004\u0018\u00010\u0001J\r\u0010z\u001a\u000200H\u0000¢\u0006\u0002\b{J\r\u0010|\u001a\u000200H\u0000¢\u0006\u0002\b}J\u0014\u0010~\u001a\u00020\n*\u00020\u001c2\u0006\u0010\u007f\u001a\u00020\nH\u0002J\u0014\u00109\u001a\u00020\n*\u00020\u001c2\u0006\u0010\u007f\u001a\u00020\nH\u0002J\u0013\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\n0Q*\u00020\u001cH\u0002J\u001b\u0010\u0081\u0001\u001a\u000200*\b0\u0082\u0001j\u0003`\u0083\u00012\u0006\u00103\u001a\u00020\nH\u0002J\u0015\u0010\u0084\u0001\u001a\u00020\n*\u00020\u001c2\u0006\u0010\u007f\u001a\u00020\nH\u0002J\u0014\u0010\"\u001a\u00020\n*\u00020\u001c2\u0006\u00103\u001a\u00020\nH\u0002J\u0015\u0010\u0085\u0001\u001a\u00020\n*\u00020\u001c2\u0006\u0010\u007f\u001a\u00020\nH\u0002J\u001d\u0010\u0086\u0001\u001a\u000200*\u00020\u001c2\u0006\u0010\u007f\u001a\u00020\n2\u0006\u00109\u001a\u00020\nH\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0011R\u0011\u0010\u001f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0011R\u000e\u0010 \u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\fR\u0014\u0010$\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\fR\u0018\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010'X\u0082\u000e¢\u0006\u0004\n\u0002\u0010(R\u000e\u0010)\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006\u0087\u0001"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "table", "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "anchors", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "capacity", "", "getCapacity", "()I", "<set-?>", "", "closed", "getClosed", "()Z", "currentGroup", "getCurrentGroup", "currentGroupEnd", "currentSlot", "currentSlotEnd", "endStack", "Landroidx/compose/runtime/IntStack;", "groupGapLen", "groupGapStart", "groups", "", "insertCount", "isGroupEnd", "isNode", "nodeCount", "nodeCountStack", "parent", "getParent", "size", "getSize$runtime_release", "slots", "", "[Ljava/lang/Object;", "slotsGapLen", "slotsGapOwner", "slotsGapStart", "startStack", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "advanceBy", "", "amount", "anchor", FirebaseAnalytics.Param.INDEX, "anchorIndex", "beginInsert", "close", "dataAnchorToDataIndex", "gapLen", "dataIndex", "dataIndexToDataAddress", "dataIndexToDataAnchor", "gapStart", "endGroup", "endInsert", "ensureStarted", "fixParentAnchorsFor", "firstChild", "groupAux", "groupIndexToAddress", "groupKey", "groupObjectKey", "groupSize", "groupSlots", "", "groupsAsString", "", "insertAux", "value", "insertGroups", "insertSlots", "group", "keys", "", "moveAnchors", "originalLocation", "newLocation", "moveFrom", "moveGroup", "offset", "moveGroupGapTo", "moveSlotGapTo", "node", "parentAnchorToIndex", "parentIndexToAnchor", "removeAnchors", "removeGroup", "removeGroups", "start", "len", "removeSlots", "restoreCurrentGroupEnd", "saveCurrentGroupEnd", "seek", "set", "skip", "skipGroup", "skipToGroupEnd", "startData", "key", "aux", "objectKey", "startGroup", "dataKey", "startNode", "toString", "update", "updateAnchors", "previousGapStart", "newGapStart", "updateAux", "updateNode", "updateNodeOfGroup", "updateParentNode", "verifyDataAnchors", "verifyDataAnchors$runtime_release", "verifyParentAnchors", "verifyParentAnchors$runtime_release", "auxIndex", "address", "dataIndexes", "groupAsString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "nodeIndex", "slotIndex", "updateDataIndex", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SlotWriter {
    @NotNull
    private ArrayList<Anchor> anchors;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    @NotNull
    private final IntStack endStack;
    private int groupGapLen;
    private int groupGapStart;
    @NotNull
    private int[] groups;
    private int insertCount;
    private int nodeCount;
    @NotNull
    private final IntStack nodeCountStack;
    private int parent;
    @NotNull
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;
    @NotNull
    private final IntStack startStack;
    @NotNull
    private final SlotTable table;

    public SlotWriter(@NotNull SlotTable table) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.table = table;
        this.groups = table.getGroups();
        this.slots = table.getSlots();
        this.anchors = table.getAnchors$runtime_release();
        this.groupGapStart = table.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - table.getGroupsSize();
        this.currentGroupEnd = table.getGroupsSize();
        this.slotsGapStart = table.getSlotsSize();
        this.slotsGapLen = this.slots.length - table.getSlotsSize();
        this.slotsGapOwner = table.getGroupsSize();
        this.startStack = new IntStack();
        this.endStack = new IntStack();
        this.nodeCountStack = new IntStack();
        this.parent = -1;
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter slotWriter, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i2);
    }

    private final int auxIndex(int[] iArr, int i2) {
        int groupInfo;
        int countOneBits;
        int dataIndex = dataIndex(iArr, i2);
        groupInfo = SlotTableKt.groupInfo(iArr, i2);
        countOneBits = SlotTableKt.countOneBits(groupInfo >> 29);
        return dataIndex + countOneBits;
    }

    private final int dataAnchorToDataIndex(int i2, int i3, int i4) {
        return i2 < 0 ? (i4 - i3) + i2 + 1 : i2;
    }

    private final int dataIndex(int i2) {
        return dataIndex(this.groups, groupIndexToAddress(i2));
    }

    private final int dataIndex(int[] iArr, int i2) {
        int dataAnchor;
        if (i2 >= getCapacity()) {
            return this.slots.length - this.slotsGapLen;
        }
        dataAnchor = SlotTableKt.dataAnchor(iArr, i2);
        return dataAnchorToDataIndex(dataAnchor, this.slotsGapLen, this.slots.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAddress(int i2) {
        return i2 < this.slotsGapStart ? i2 : i2 + this.slotsGapLen;
    }

    private final int dataIndexToDataAnchor(int i2, int i3, int i4, int i5) {
        return i2 > i3 ? -(((i5 - i4) - i2) + 1) : i2;
    }

    private final List<Integer> dataIndexes(int[] iArr) {
        IntRange until;
        List slice;
        IntRange until2;
        List slice2;
        List plus;
        List dataAnchors$default = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        until = RangesKt___RangesKt.until(0, this.groupGapStart);
        slice = CollectionsKt___CollectionsKt.slice(dataAnchors$default, until);
        until2 = RangesKt___RangesKt.until(this.groupGapStart + this.groupGapLen, iArr.length / 5);
        slice2 = CollectionsKt___CollectionsKt.slice(dataAnchors$default, until2);
        plus = CollectionsKt___CollectionsKt.plus((Collection) slice, (Iterable) slice2);
        ArrayList arrayList = new ArrayList(plus.size());
        int size = plus.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(Integer.valueOf(dataAnchorToDataIndex(((Number) plus.get(i2)).intValue(), this.slotsGapLen, this.slots.length)));
        }
        return arrayList;
    }

    private final void fixParentAnchorsFor(int i2, int i3, int i4) {
        int groupSize;
        int parentIndexToAnchor = parentIndexToAnchor(i2, this.groupGapStart);
        while (i4 < i3) {
            SlotTableKt.updateParentAnchor(this.groups, groupIndexToAddress(i4), parentIndexToAnchor);
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i4));
            int i5 = groupSize + i4;
            fixParentAnchorsFor(i4, i5, i4 + 1);
            i4 = i5;
        }
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    private final void groupAsString(StringBuilder sb, int i2) {
        int groupSize;
        int parentAnchor;
        int key;
        int nodeCount;
        int dataAnchor;
        int parentAnchor2;
        int groupIndexToAddress = groupIndexToAddress(i2);
        sb.append("Group(");
        if (i2 < 10) {
            sb.append(' ');
        }
        if (i2 < 100) {
            sb.append(' ');
        }
        if (i2 < 1000) {
            sb.append(' ');
        }
        sb.append(i2);
        sb.append('#');
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        sb.append(groupSize);
        sb.append('^');
        parentAnchor = SlotTableKt.parentAnchor(this.groups, groupIndexToAddress);
        sb.append(parentAnchorToIndex(parentAnchor));
        sb.append(": key=");
        key = SlotTableKt.key(this.groups, groupIndexToAddress);
        sb.append(key);
        sb.append(", nodes=");
        nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
        sb.append(nodeCount);
        sb.append(", dataAnchor=");
        dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
        sb.append(dataAnchor);
        sb.append(", parentAnchor=");
        parentAnchor2 = SlotTableKt.parentAnchor(this.groups, groupIndexToAddress);
        sb.append(parentAnchor2);
        sb.append(")");
    }

    private final int groupIndexToAddress(int i2) {
        return i2 < this.groupGapStart ? i2 : i2 + this.groupGapLen;
    }

    private final void insertGroups(int i2) {
        if (i2 > 0) {
            int i3 = this.currentGroup;
            moveGroupGapTo(i3);
            int i4 = this.groupGapStart;
            int i5 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i6 = length - i5;
            if (i5 < i2) {
                int max = Math.max(Math.max(length * 2, i6 + i2), 32);
                int[] iArr2 = new int[max * 5];
                int i7 = max - i6;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, 0, i4 * 5);
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, (i4 + i7) * 5, (i5 + i4) * 5, length * 5);
                this.groups = iArr2;
                i5 = i7;
            }
            int i8 = this.currentGroupEnd;
            if (i8 >= i4) {
                this.currentGroupEnd = i8 + i2;
            }
            int i9 = i4 + i2;
            this.groupGapStart = i9;
            this.groupGapLen = i5 - i2;
            int dataIndexToDataAnchor = dataIndexToDataAnchor(i6 > 0 ? dataIndex(i3 + i2) : 0, this.slotsGapOwner >= i4 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i10 = i4; i10 < i9; i10++) {
                SlotTableKt.updateDataAnchor(this.groups, i10, dataIndexToDataAnchor);
            }
            int i11 = this.slotsGapOwner;
            if (i11 >= i4) {
                this.slotsGapOwner = i11 + i2;
            }
        }
    }

    private final void insertSlots(int i2, int i3) {
        if (i2 > 0) {
            moveSlotGapTo(this.currentSlot, i3);
            int i4 = this.slotsGapStart;
            int i5 = this.slotsGapLen;
            if (i5 < i2) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i6 = length - i5;
                int max = Math.max(Math.max(length * 2, i6 + i2), 32);
                Object[] objArr2 = new Object[max];
                for (int i7 = 0; i7 < max; i7++) {
                    objArr2[i7] = null;
                }
                int i8 = max - i6;
                int i9 = i5 + i4;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, 0, 0, i4);
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i4 + i8, i9, length);
                this.slots = objArr2;
                i5 = i8;
            }
            int i10 = this.currentSlotEnd;
            if (i10 >= i4) {
                this.currentSlotEnd = i10 + i2;
            }
            this.slotsGapStart = i4 + i2;
            this.slotsGapLen = i5 - i2;
        }
    }

    private final List<Integer> keys() {
        List keys$default = SlotTableKt.keys$default(this.groups, 0, 1, null);
        ArrayList arrayList = new ArrayList(keys$default.size());
        int size = keys$default.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            Object obj = keys$default.get(i2);
            ((Number) obj).intValue();
            int i4 = this.groupGapStart;
            if (i2 < i4 || i2 >= i4 + this.groupGapLen) {
                arrayList.add(obj);
            }
            i2 = i3;
        }
        return arrayList;
    }

    private final void moveAnchors(int i2, int i3, int i4) {
        int locationOf;
        int locationOf2;
        int i5 = i4 + i2;
        int size$runtime_release = getSize$runtime_release();
        locationOf = SlotTableKt.locationOf(this.anchors, i2, size$runtime_release);
        ArrayList arrayList = new ArrayList();
        if (locationOf >= 0) {
            while (locationOf < this.anchors.size()) {
                Anchor anchor = this.anchors.get(locationOf);
                Intrinsics.checkNotNullExpressionValue(anchor, "anchors[index]");
                Anchor anchor2 = anchor;
                int anchorIndex = anchorIndex(anchor2);
                if (anchorIndex < i2 || anchorIndex >= i5) {
                    break;
                }
                arrayList.add(anchor2);
                this.anchors.remove(locationOf);
            }
        }
        int i6 = i3 - i2;
        int i7 = 0;
        int size = arrayList.size();
        while (i7 < size) {
            int i8 = i7 + 1;
            Anchor anchor3 = (Anchor) arrayList.get(i7);
            int anchorIndex2 = anchorIndex(anchor3) + i6;
            if (anchorIndex2 >= this.groupGapStart) {
                anchor3.setLocation$runtime_release(-(size$runtime_release - anchorIndex2));
            } else {
                anchor3.setLocation$runtime_release(anchorIndex2);
            }
            locationOf2 = SlotTableKt.locationOf(this.anchors, anchorIndex2, size$runtime_release);
            this.anchors.add(locationOf2, anchor3);
            i7 = i8;
        }
    }

    private final void moveGroupGapTo(int i2) {
        int parentAnchor;
        int i3 = this.groupGapLen;
        int i4 = this.groupGapStart;
        if (i4 != i2) {
            if (!this.anchors.isEmpty()) {
                updateAnchors(i4, i2);
            }
            if (i3 > 0) {
                int[] iArr = this.groups;
                int i5 = i2 * 5;
                int i6 = i3 * 5;
                int i7 = i4 * 5;
                if (i2 < i4) {
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i6 + i5, i5, i7);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i7, i7 + i6, i5 + i6);
                }
            }
            if (i2 < i4) {
                i4 = i2 + i3;
            }
            int capacity = getCapacity();
            ComposerKt.runtimeCheck(i4 < capacity);
            while (i4 < capacity) {
                parentAnchor = SlotTableKt.parentAnchor(this.groups, i4);
                int parentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(parentAnchor), i2);
                if (parentIndexToAnchor != parentAnchor) {
                    SlotTableKt.updateParentAnchor(this.groups, i4, parentIndexToAnchor);
                }
                i4++;
                if (i4 == i2) {
                    i4 += i3;
                }
            }
        }
        this.groupGapStart = i2;
    }

    private final void moveSlotGapTo(int i2, int i3) {
        int dataAnchor;
        int dataAnchor2;
        int i4 = this.slotsGapLen;
        int i5 = this.slotsGapStart;
        int i6 = this.slotsGapOwner;
        if (i5 != i2) {
            Object[] objArr = this.slots;
            if (i2 < i5) {
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i2 + i4, i2, i5);
            } else {
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i5, i5 + i4, i2 + i4);
            }
            ArraysKt___ArraysJvmKt.fill(objArr, (Object) null, i2, i2 + i4);
        }
        int min = Math.min(i3 + 1, getSize$runtime_release());
        if (i6 != min) {
            int length = this.slots.length - i4;
            if (min < i6) {
                int groupIndexToAddress = groupIndexToAddress(min);
                int groupIndexToAddress2 = groupIndexToAddress(i6);
                int i7 = this.groupGapStart;
                while (groupIndexToAddress < groupIndexToAddress2) {
                    dataAnchor2 = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
                    if (!(dataAnchor2 >= 0)) {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a positive anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                    SlotTableKt.updateDataAnchor(this.groups, groupIndexToAddress, -((length - dataAnchor2) + 1));
                    groupIndexToAddress++;
                    if (groupIndexToAddress == i7) {
                        groupIndexToAddress += this.groupGapLen;
                    }
                }
            } else {
                int groupIndexToAddress3 = groupIndexToAddress(i6);
                int groupIndexToAddress4 = groupIndexToAddress(min);
                while (groupIndexToAddress3 < groupIndexToAddress4) {
                    dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress3);
                    if (!(dataAnchor < 0)) {
                        ComposerKt.composeRuntimeError("Unexpected anchor value, expected a negative anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                    SlotTableKt.updateDataAnchor(this.groups, groupIndexToAddress3, dataAnchor + length + 1);
                    groupIndexToAddress3++;
                    if (groupIndexToAddress3 == this.groupGapStart) {
                        groupIndexToAddress3 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = min;
        }
        this.slotsGapStart = i2;
    }

    private final int nodeIndex(int[] iArr, int i2) {
        return dataIndex(iArr, i2);
    }

    private final int parent(int[] iArr, int i2) {
        int parentAnchor;
        parentAnchor = SlotTableKt.parentAnchor(iArr, groupIndexToAddress(i2));
        return parentAnchorToIndex(parentAnchor);
    }

    private final int parentAnchorToIndex(int i2) {
        return i2 > -2 ? i2 : getSize$runtime_release() + i2 + 2;
    }

    private final int parentIndexToAnchor(int i2, int i3) {
        return i2 < i3 ? i2 : -((getSize$runtime_release() - i2) + 2);
    }

    private final boolean removeAnchors(int i2, int i3) {
        int locationOf;
        int i4 = i3 + i2;
        locationOf = SlotTableKt.locationOf(this.anchors, i4, getCapacity() - this.groupGapLen);
        if (locationOf >= this.anchors.size()) {
            locationOf--;
        }
        int i5 = locationOf + 1;
        int i6 = 0;
        while (locationOf >= 0) {
            Anchor anchor = this.anchors.get(locationOf);
            Intrinsics.checkNotNullExpressionValue(anchor, "anchors[index]");
            Anchor anchor2 = anchor;
            int anchorIndex = anchorIndex(anchor2);
            if (anchorIndex < i2) {
                break;
            }
            if (anchorIndex < i4) {
                anchor2.setLocation$runtime_release(Integer.MIN_VALUE);
                if (i6 == 0) {
                    i6 = locationOf + 1;
                }
                i5 = locationOf;
            }
            locationOf--;
        }
        boolean z = i5 < i6;
        if (z) {
            this.anchors.subList(i5, i6).clear();
        }
        return z;
    }

    private final boolean removeGroups(int i2, int i3) {
        if (i3 > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            moveGroupGapTo(i2);
            r0 = arrayList.isEmpty() ^ true ? removeAnchors(i2, i3) : false;
            this.groupGapStart = i2;
            this.groupGapLen += i3;
            int i4 = this.slotsGapOwner;
            if (i4 > i2) {
                this.slotsGapOwner = i4 - i3;
            }
            int i5 = this.currentGroupEnd;
            if (i5 >= i2) {
                this.currentGroupEnd = i5 - i3;
            }
        }
        return r0;
    }

    private final void removeSlots(int i2, int i3, int i4) {
        if (i3 > 0) {
            int i5 = this.slotsGapLen;
            int i6 = i2 + i3;
            moveSlotGapTo(i6, i4);
            this.slotsGapStart = i2;
            this.slotsGapLen = i5 + i3;
            ArraysKt___ArraysJvmKt.fill(this.slots, (Object) null, i2, i6);
            int i7 = this.currentSlotEnd;
            if (i7 >= i2) {
                this.currentSlotEnd = i7 - i3;
            }
        }
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int slotIndex(int[] iArr, int i2) {
        int slotAnchor;
        if (i2 >= getCapacity()) {
            return this.slots.length - this.slotsGapLen;
        }
        slotAnchor = SlotTableKt.slotAnchor(iArr, i2);
        return dataAnchorToDataIndex(slotAnchor, this.slotsGapLen, this.slots.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startGroup(int i2, Object obj, boolean z, Object obj2) {
        int nodeCount;
        int groupSize;
        int i3;
        byte b2 = this.insertCount > 0 ? (byte) 1 : (byte) 0;
        this.nodeCountStack.push(this.nodeCount);
        if (b2 != 0) {
            insertGroups(1);
            int i4 = this.currentGroup;
            int groupIndexToAddress = groupIndexToAddress(i4);
            Composer.Companion companion = Composer.Companion;
            int i5 = obj != companion.getEmpty() ? 1 : 0;
            int i6 = (z || obj2 == companion.getEmpty()) ? 0 : 1;
            SlotTableKt.initGroup(this.groups, groupIndexToAddress, i2, z, i5, i6, this.parent, this.currentSlot);
            this.currentSlotEnd = this.currentSlot;
            int i7 = (z ? 1 : 0) + i5 + i6;
            if (i7 > 0) {
                insertSlots(i7, i4);
                Object[] objArr = this.slots;
                int i8 = this.currentSlot;
                if (z) {
                    objArr[i8] = obj2;
                    i8++;
                }
                if (i5 != 0) {
                    objArr[i8] = obj;
                    i8++;
                }
                if (i6 != 0) {
                    objArr[i8] = obj2;
                    i8++;
                }
                this.currentSlot = i8;
            }
            this.nodeCount = 0;
            i3 = i4 + 1;
            this.parent = i4;
            this.currentGroup = i3;
        } else {
            this.startStack.push(this.parent);
            saveCurrentGroupEnd();
            int i9 = this.currentGroup;
            int groupIndexToAddress2 = groupIndexToAddress(i9);
            if (!Intrinsics.areEqual(obj2, Composer.Companion.getEmpty())) {
                if (z) {
                    updateNode(obj2);
                } else {
                    updateAux(obj2);
                }
            }
            this.currentSlot = slotIndex(this.groups, groupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress2);
            this.nodeCount = nodeCount;
            this.parent = i9;
            this.currentGroup = i9 + 1;
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress2);
            i3 = i9 + groupSize;
        }
        this.currentGroupEnd = i3;
    }

    private final void updateAnchors(int i2, int i3) {
        int locationOf;
        int locationOf2;
        int i4;
        int capacity = getCapacity() - this.groupGapLen;
        if (i2 >= i3) {
            for (locationOf = SlotTableKt.locationOf(this.anchors, i3, capacity); locationOf < this.anchors.size(); locationOf++) {
                Anchor anchor = this.anchors.get(locationOf);
                Intrinsics.checkNotNullExpressionValue(anchor, "anchors[index]");
                Anchor anchor2 = anchor;
                int location$runtime_release = anchor2.getLocation$runtime_release();
                if (location$runtime_release < 0) {
                    return;
                }
                anchor2.setLocation$runtime_release(-(capacity - location$runtime_release));
            }
            return;
        }
        for (locationOf2 = SlotTableKt.locationOf(this.anchors, i2, capacity); locationOf2 < this.anchors.size(); locationOf2++) {
            Anchor anchor3 = this.anchors.get(locationOf2);
            Intrinsics.checkNotNullExpressionValue(anchor3, "anchors[index]");
            Anchor anchor4 = anchor3;
            int location$runtime_release2 = anchor4.getLocation$runtime_release();
            if (location$runtime_release2 >= 0 || (i4 = location$runtime_release2 + capacity) >= i3) {
                return;
            }
            anchor4.setLocation$runtime_release(i4);
        }
    }

    private final void updateDataIndex(int[] iArr, int i2, int i3) {
        SlotTableKt.updateDataAnchor(iArr, i2, dataIndexToDataAnchor(i3, this.slotsGapStart, this.slotsGapLen, this.slots.length));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void updateNodeOfGroup(int r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.groupIndexToAddress(r4)
            int[] r1 = r3.groups
            int r2 = r1.length
            if (r0 >= r2) goto L11
            boolean r1 = androidx.compose.runtime.SlotTableKt.access$isNode(r1, r0)
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L23
            java.lang.Object[] r4 = r3.slots
            int[] r1 = r3.groups
            int r0 = r3.nodeIndex(r1, r0)
            int r3 = r3.dataIndexToDataAddress(r0)
            r4[r3] = r5
            return
        L23:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Updating the node of a group at "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r4 = " that was not created with as a node group"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.toString()
            androidx.compose.runtime.ComposerKt.composeRuntimeError(r3)
            kotlin.KotlinNothingValueException r3 = new kotlin.KotlinNothingValueException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.updateNodeOfGroup(int, java.lang.Object):void");
    }

    public final void advanceBy(int i2) {
        boolean z = true;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException("Cannot seek backwards".toString());
        }
        if (!(this.insertCount <= 0)) {
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        int i3 = this.currentGroup + i2;
        if (i3 < this.parent || i3 > this.currentGroupEnd) {
            z = false;
        }
        if (z) {
            this.currentGroup = i3;
            int dataIndex = dataIndex(this.groups, groupIndexToAddress(i3));
            this.currentSlot = dataIndex;
            this.currentSlotEnd = dataIndex;
            return;
        }
        ComposerKt.composeRuntimeError(("Cannot seek outside the current group (" + getParent() + '-' + this.currentGroupEnd + ')').toString());
        throw new KotlinNothingValueException();
    }

    @NotNull
    public final Anchor anchor(int i2) {
        ArrayList<Anchor> arrayList = this.anchors;
        int search = SlotTableKt.search(arrayList, i2, getSize$runtime_release());
        if (search >= 0) {
            Anchor anchor = arrayList.get(search);
            Intrinsics.checkNotNullExpressionValue(anchor, "get(location)");
            return anchor;
        }
        if (i2 > this.groupGapStart) {
            i2 = -(getSize$runtime_release() - i2);
        }
        Anchor anchor2 = new Anchor(i2);
        arrayList.add(-(search + 1), anchor2);
        return anchor2;
    }

    public final int anchorIndex(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        int location$runtime_release = anchor.getLocation$runtime_release();
        return location$runtime_release < 0 ? location$runtime_release + getSize$runtime_release() : location$runtime_release;
    }

    public final void beginInsert() {
        int i2 = this.insertCount;
        this.insertCount = i2 + 1;
        if (i2 == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final void close() {
        this.closed = true;
        moveGroupGapTo(getSize$runtime_release());
        moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors);
    }

    public final int endGroup() {
        boolean isNode;
        int groupSize;
        int nodeCount;
        boolean isNode2;
        int nodeCount2;
        int groupSize2;
        boolean z = this.insertCount > 0;
        int i2 = this.currentGroup;
        int i3 = this.currentGroupEnd;
        int i4 = this.parent;
        int groupIndexToAddress = groupIndexToAddress(i4);
        int i5 = this.nodeCount;
        int i6 = i2 - i4;
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (z) {
            SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress, i6);
            SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i5);
            this.nodeCount = this.nodeCountStack.pop() + (isNode ? 1 : i5);
            this.parent = parent(this.groups, i4);
        } else {
            if ((i2 != i3 ? 0 : 1) == 0) {
                throw new IllegalArgumentException("Expected to be at the end of a group".toString());
            }
            groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
            nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
            SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress, i6);
            SlotTableKt.updateNodeCount(this.groups, groupIndexToAddress, i5);
            int pop = this.startStack.pop();
            restoreCurrentGroupEnd();
            this.parent = pop;
            int parent = parent(this.groups, i4);
            int pop2 = this.nodeCountStack.pop();
            this.nodeCount = pop2;
            if (parent == pop) {
                this.nodeCount = pop2 + (isNode ? 0 : i5 - nodeCount);
            } else {
                int i7 = i6 - groupSize;
                int i8 = isNode ? 0 : i5 - nodeCount;
                if (i7 != 0 || i8 != 0) {
                    while (parent != 0 && parent != pop && (i8 != 0 || i7 != 0)) {
                        int groupIndexToAddress2 = groupIndexToAddress(parent);
                        if (i7 != 0) {
                            groupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress2);
                            SlotTableKt.updateGroupSize(this.groups, groupIndexToAddress2, groupSize2 + i7);
                        }
                        if (i8 != 0) {
                            int[] iArr = this.groups;
                            nodeCount2 = SlotTableKt.nodeCount(iArr, groupIndexToAddress2);
                            SlotTableKt.updateNodeCount(iArr, groupIndexToAddress2, nodeCount2 + i8);
                        }
                        isNode2 = SlotTableKt.isNode(this.groups, groupIndexToAddress2);
                        if (isNode2) {
                            i8 = 0;
                        }
                        parent = parent(this.groups, parent);
                    }
                }
                this.nodeCount += i8;
            }
        }
        return i5;
    }

    public final void endInsert() {
        int i2 = this.insertCount;
        if (!(i2 > 0)) {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
        int i3 = i2 - 1;
        this.insertCount = i3;
        if (i3 == 0) {
            if (this.nodeCountStack.getSize() == this.startStack.getSize()) {
                restoreCurrentGroupEnd();
            } else {
                ComposerKt.composeRuntimeError("startGroup/endGroup mismatch while inserting".toString());
                throw new KotlinNothingValueException();
            }
        }
    }

    public final void ensureStarted(int i2) {
        boolean z = true;
        if (!(this.insertCount <= 0)) {
            throw new IllegalArgumentException("Cannot call ensureStarted() while inserting".toString());
        }
        int i3 = this.parent;
        if (i3 != i2) {
            if (i2 < i3 || i2 >= this.currentGroupEnd) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Started group must be a subgroup of the group at ", Integer.valueOf(i3)).toString());
            }
            int i4 = this.currentGroup;
            int i5 = this.currentSlot;
            int i6 = this.currentSlotEnd;
            this.currentGroup = i2;
            startGroup();
            this.currentGroup = i4;
            this.currentSlot = i5;
            this.currentSlotEnd = i6;
        }
    }

    public final void ensureStarted(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        ensureStarted(anchor.toIndexFor(this));
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize$runtime_release() {
        return getCapacity() - this.groupGapLen;
    }

    @NotNull
    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    @Nullable
    public final Object groupAux(int i2) {
        boolean hasAux;
        int groupIndexToAddress = groupIndexToAddress(i2);
        hasAux = SlotTableKt.hasAux(this.groups, groupIndexToAddress);
        return hasAux ? this.slots[auxIndex(this.groups, groupIndexToAddress)] : Composer.Companion.getEmpty();
    }

    public final int groupKey(int i2) {
        int key;
        key = SlotTableKt.key(this.groups, groupIndexToAddress(i2));
        return key;
    }

    @Nullable
    public final Object groupObjectKey(int i2) {
        boolean hasObjectKey;
        int objectKeyIndex;
        int groupIndexToAddress = groupIndexToAddress(i2);
        hasObjectKey = SlotTableKt.hasObjectKey(this.groups, groupIndexToAddress);
        if (hasObjectKey) {
            Object[] objArr = this.slots;
            objectKeyIndex = SlotTableKt.objectKeyIndex(this.groups, groupIndexToAddress);
            return objArr[objectKeyIndex];
        }
        return null;
    }

    public final int groupSize(int i2) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i2));
        return groupSize;
    }

    @NotNull
    public final Iterator<Object> groupSlots() {
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int[] iArr = this.groups;
        int i2 = this.currentGroup;
        return new SlotWriter$groupSlots$1(dataIndex, dataIndex(iArr, groupIndexToAddress(i2 + groupSize(i2))), this);
    }

    @NotNull
    public final String groupsAsString() {
        StringBuilder sb = new StringBuilder();
        int size$runtime_release = getSize$runtime_release();
        for (int i2 = 0; i2 < size$runtime_release; i2++) {
            groupAsString(sb, i2);
            sb.append('\n');
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void insertAux(@Nullable Object obj) {
        boolean hasAux;
        if (!(this.insertCount >= 0)) {
            ComposerKt.composeRuntimeError("Cannot insert auxiliary data when not inserting".toString());
            throw new KotlinNothingValueException();
        }
        int i2 = this.parent;
        int groupIndexToAddress = groupIndexToAddress(i2);
        hasAux = SlotTableKt.hasAux(this.groups, groupIndexToAddress);
        if (!(!hasAux)) {
            ComposerKt.composeRuntimeError("Group already has auxiliary data".toString());
            throw new KotlinNothingValueException();
        }
        insertSlots(1, i2);
        int auxIndex = auxIndex(this.groups, groupIndexToAddress);
        int dataIndexToDataAddress = dataIndexToDataAddress(auxIndex);
        int i3 = this.currentSlot;
        if (i3 > auxIndex) {
            int i4 = i3 - auxIndex;
            if (!(i4 < 3)) {
                throw new IllegalStateException("Moving more than two slot not supported".toString());
            }
            if (i4 > 1) {
                Object[] objArr = this.slots;
                objArr[dataIndexToDataAddress + 2] = objArr[dataIndexToDataAddress + 1];
            }
            Object[] objArr2 = this.slots;
            objArr2[dataIndexToDataAddress + 1] = objArr2[dataIndexToDataAddress];
        }
        SlotTableKt.addAux(this.groups, groupIndexToAddress);
        this.slots[dataIndexToDataAddress] = obj;
        this.currentSlot++;
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final boolean isNode() {
        boolean isNode;
        int i2 = this.currentGroup;
        if (i2 < this.currentGroupEnd) {
            isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress(i2));
            if (isNode) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final List<Anchor> moveFrom(@NotNull SlotTable table, int i2) {
        int locationOf;
        int locationOf2;
        List<Anchor> emptyList;
        ArrayList arrayList;
        boolean isNode;
        int locationOf3;
        int i3;
        int i4;
        int parentAnchor;
        Intrinsics.checkNotNullParameter(table, "table");
        if (this.insertCount > 0) {
            if (i2 == 0 && this.currentGroup == 0 && this.table.getGroupsSize() == 0) {
                int[] iArr = this.groups;
                Object[] objArr = this.slots;
                ArrayList<Anchor> arrayList2 = this.anchors;
                int[] groups = table.getGroups();
                int groupsSize = table.getGroupsSize();
                Object[] slots = table.getSlots();
                int slotsSize = table.getSlotsSize();
                this.groups = groups;
                this.slots = slots;
                this.anchors = table.getAnchors$runtime_release();
                this.groupGapStart = groupsSize;
                this.groupGapLen = (groups.length / 5) - groupsSize;
                this.slotsGapStart = slotsSize;
                this.slotsGapLen = slots.length - slotsSize;
                this.slotsGapOwner = groupsSize;
                table.setTo$runtime_release(iArr, 0, objArr, 0, arrayList2);
                return this.anchors;
            }
            SlotWriter openWriter = table.openWriter();
            try {
                int groupSize = openWriter.groupSize(i2);
                int i5 = i2 + groupSize;
                int dataIndex = openWriter.dataIndex(i2);
                int dataIndex2 = openWriter.dataIndex(i5);
                int i6 = dataIndex2 - dataIndex;
                insertGroups(groupSize);
                insertSlots(i6, getCurrentGroup());
                int[] iArr2 = this.groups;
                int currentGroup = getCurrentGroup();
                ArraysKt___ArraysJvmKt.copyInto(openWriter.groups, iArr2, currentGroup * 5, i2 * 5, i5 * 5);
                Object[] objArr2 = this.slots;
                int i7 = this.currentSlot;
                ArraysKt___ArraysJvmKt.copyInto(openWriter.slots, objArr2, i7, dataIndex, dataIndex2);
                SlotTableKt.updateParentAnchor(iArr2, currentGroup, getParent());
                int i8 = currentGroup - i2;
                int i9 = groupSize + currentGroup;
                int dataIndex3 = i7 - dataIndex(iArr2, currentGroup);
                int i10 = this.slotsGapOwner;
                int i11 = this.slotsGapLen;
                int length = objArr2.length;
                int i12 = currentGroup;
                while (i12 < i9) {
                    int i13 = i12 + 1;
                    if (i12 != currentGroup) {
                        parentAnchor = SlotTableKt.parentAnchor(iArr2, i12);
                        SlotTableKt.updateParentAnchor(iArr2, i12, parentAnchor + i8);
                    }
                    int dataIndex4 = dataIndex(iArr2, i12) + dataIndex3;
                    if (i10 < i12) {
                        i3 = dataIndex3;
                        i4 = 0;
                    } else {
                        i3 = dataIndex3;
                        i4 = this.slotsGapStart;
                    }
                    SlotTableKt.updateDataAnchor(iArr2, i12, dataIndexToDataAnchor(dataIndex4, i4, i11, length));
                    if (i12 == i10) {
                        i10++;
                    }
                    i12 = i13;
                    dataIndex3 = i3;
                }
                this.slotsGapOwner = i10;
                locationOf = SlotTableKt.locationOf(table.getAnchors$runtime_release(), i2, table.getGroupsSize());
                locationOf2 = SlotTableKt.locationOf(table.getAnchors$runtime_release(), i5, table.getGroupsSize());
                if (locationOf < locationOf2) {
                    ArrayList<Anchor> anchors$runtime_release = table.getAnchors$runtime_release();
                    ArrayList arrayList3 = new ArrayList(locationOf2 - locationOf);
                    int i14 = locationOf;
                    while (i14 < locationOf2) {
                        int i15 = i14 + 1;
                        Anchor anchor = anchors$runtime_release.get(i14);
                        Intrinsics.checkNotNullExpressionValue(anchor, "sourceAnchors[anchorIndex]");
                        Anchor anchor2 = anchor;
                        anchor2.setLocation$runtime_release(anchor2.getLocation$runtime_release() + i8);
                        arrayList3.add(anchor2);
                        i14 = i15;
                    }
                    locationOf3 = SlotTableKt.locationOf(this.anchors, getCurrentGroup(), getSize$runtime_release());
                    getTable$runtime_release().getAnchors$runtime_release().addAll(locationOf3, arrayList3);
                    anchors$runtime_release.subList(locationOf, locationOf2).clear();
                    arrayList = arrayList3;
                } else {
                    emptyList = CollectionsKt__CollectionsKt.emptyList();
                    arrayList = emptyList;
                }
                int parent = openWriter.parent(i2);
                if (parent >= 0) {
                    openWriter.startGroup();
                    openWriter.advanceBy(parent - openWriter.getCurrentGroup());
                    openWriter.startGroup();
                }
                openWriter.advanceBy(i2 - openWriter.getCurrentGroup());
                boolean removeGroup = openWriter.removeGroup();
                if (parent >= 0) {
                    openWriter.skipToGroupEnd();
                    openWriter.endGroup();
                    openWriter.skipToGroupEnd();
                    openWriter.endGroup();
                }
                if (!(!removeGroup)) {
                    ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
                    throw new KotlinNothingValueException();
                }
                int i16 = this.nodeCount;
                isNode = SlotTableKt.isNode(iArr2, currentGroup);
                this.nodeCount = i16 + (isNode ? 1 : SlotTableKt.nodeCount(iArr2, currentGroup));
                this.currentGroup = i9;
                this.currentSlot = i7 + i6;
                return arrayList;
            } finally {
                openWriter.close();
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void moveGroup(int i2) {
        int groupSize;
        int groupSize2;
        if (!(this.insertCount == 0)) {
            throw new IllegalArgumentException("Cannot move a group while inserting".toString());
        }
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
        }
        if (i2 == 0) {
            return;
        }
        int i3 = this.currentGroup;
        int i4 = this.parent;
        int i5 = this.currentGroupEnd;
        int i6 = i3;
        for (int i7 = i2; i7 > 0; i7--) {
            groupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i6));
            i6 += groupSize2;
            if (!(i6 <= i5)) {
                throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
            }
        }
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(i6));
        int i8 = this.currentSlot;
        int dataIndex = dataIndex(this.groups, groupIndexToAddress(i6));
        int i9 = i6 + groupSize;
        int dataIndex2 = dataIndex(this.groups, groupIndexToAddress(i9));
        int i10 = dataIndex2 - dataIndex;
        insertSlots(i10, Math.max(this.currentGroup - 1, 0));
        insertGroups(groupSize);
        int[] iArr = this.groups;
        int groupIndexToAddress = groupIndexToAddress(i9) * 5;
        ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, groupIndexToAddress(i3) * 5, groupIndexToAddress, (groupSize * 5) + groupIndexToAddress);
        if (i10 > 0) {
            Object[] objArr = this.slots;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i8, dataIndexToDataAddress(dataIndex + i10), dataIndexToDataAddress(dataIndex2 + i10));
        }
        int i11 = dataIndex + i10;
        int i12 = i11 - i8;
        int i13 = this.slotsGapStart;
        int i14 = this.slotsGapLen;
        int length = this.slots.length;
        int i15 = this.slotsGapOwner;
        int i16 = i3 + groupSize;
        int i17 = i3;
        while (i17 < i16) {
            int i18 = i17 + 1;
            int groupIndexToAddress2 = groupIndexToAddress(i17);
            int i19 = i12;
            updateDataIndex(iArr, groupIndexToAddress2, dataIndexToDataAnchor(dataIndex(iArr, groupIndexToAddress2) - i12, i15 < groupIndexToAddress2 ? 0 : i13, i14, length));
            i12 = i19;
            i17 = i18;
        }
        moveAnchors(i9, i3, groupSize);
        if (!(!removeGroups(i9, groupSize))) {
            ComposerKt.composeRuntimeError("Unexpectedly removed anchors".toString());
            throw new KotlinNothingValueException();
        }
        fixParentAnchorsFor(i4, this.currentGroupEnd, i3);
        if (i10 > 0) {
            removeSlots(i11, i10, i9 - 1);
        }
    }

    @Nullable
    public final Object node(int i2) {
        boolean isNode;
        int groupIndexToAddress = groupIndexToAddress(i2);
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (isNode) {
            return this.slots[dataIndexToDataAddress(nodeIndex(this.groups, groupIndexToAddress))];
        }
        return null;
    }

    @Nullable
    public final Object node(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        return node(anchor.toIndexFor(this));
    }

    public final int parent(int i2) {
        return parent(this.groups, i2);
    }

    public final int parent(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (anchor.getValid()) {
            return parent(this.groups, anchorIndex(anchor));
        }
        return -1;
    }

    public final boolean removeGroup() {
        if (this.insertCount == 0) {
            int i2 = this.currentGroup;
            int i3 = this.currentSlot;
            int skipGroup = skipGroup();
            boolean removeGroups = removeGroups(i2, this.currentGroup - i2);
            removeSlots(i3, this.currentSlot - i3, i2 - 1);
            this.currentGroup = i2;
            this.currentSlot = i3;
            this.nodeCount -= skipGroup;
            return removeGroups;
        }
        throw new IllegalArgumentException("Cannot remove group while inserting".toString());
    }

    public final void seek(@NotNull Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    @Nullable
    public final Object set(int i2, @Nullable Object obj) {
        int slotIndex = slotIndex(this.groups, groupIndexToAddress(this.currentGroup));
        boolean z = true;
        int i3 = slotIndex + i2;
        if ((i3 < slotIndex || i3 >= dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1))) ? false : false) {
            int dataIndexToDataAddress = dataIndexToDataAddress(i3);
            Object[] objArr = this.slots;
            Object obj2 = objArr[dataIndexToDataAddress];
            objArr[dataIndexToDataAddress] = obj;
            return obj2;
        }
        ComposerKt.composeRuntimeError(("Write to an invalid slot index " + i2 + " for group " + getCurrentGroup()).toString());
        throw new KotlinNothingValueException();
    }

    public final void set(@Nullable Object obj) {
        int i2 = this.currentSlot;
        if (i2 <= this.currentSlotEnd) {
            this.slots[dataIndexToDataAddress(i2 - 1)] = obj;
        } else {
            ComposerKt.composeRuntimeError("Writing to an invalid slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    @Nullable
    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i2 = this.currentSlot;
        this.currentSlot = i2 + 1;
        return objArr[dataIndexToDataAddress(i2)];
    }

    public final int skipGroup() {
        int groupSize;
        boolean isNode;
        int nodeCount;
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int i2 = this.currentGroup;
        groupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress);
        int i3 = i2 + groupSize;
        this.currentGroup = i3;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i3));
        isNode = SlotTableKt.isNode(this.groups, groupIndexToAddress);
        if (isNode) {
            return 1;
        }
        nodeCount = SlotTableKt.nodeCount(this.groups, groupIndexToAddress);
        return nodeCount;
    }

    public final void skipToGroupEnd() {
        int i2 = this.currentGroupEnd;
        this.currentGroup = i2;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i2));
    }

    public final void startData(int i2, @Nullable Object obj) {
        startGroup(i2, Composer.Companion.getEmpty(), false, obj);
    }

    public final void startData(int i2, @Nullable Object obj, @Nullable Object obj2) {
        startGroup(i2, obj, false, obj2);
    }

    public final void startGroup() {
        if (!(this.insertCount == 0)) {
            throw new IllegalArgumentException("Key must be supplied when inserting".toString());
        }
        Composer.Companion companion = Composer.Companion;
        startGroup(0, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startGroup(int i2) {
        Composer.Companion companion = Composer.Companion;
        startGroup(i2, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startGroup(int i2, @Nullable Object obj) {
        startGroup(i2, obj, false, Composer.Companion.getEmpty());
    }

    public final void startNode(@Nullable Object obj) {
        startGroup(androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMinor, obj, true, Composer.Companion.getEmpty());
    }

    public final void startNode(@Nullable Object obj, @Nullable Object obj2) {
        startGroup(androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMinor, obj, true, obj2);
    }

    @NotNull
    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    @Nullable
    public final Object update(@Nullable Object obj) {
        Object skip = skip();
        set(obj);
        return skip;
    }

    public final void updateAux(@Nullable Object obj) {
        boolean hasAux;
        int groupIndexToAddress = groupIndexToAddress(this.currentGroup);
        hasAux = SlotTableKt.hasAux(this.groups, groupIndexToAddress);
        if (hasAux) {
            this.slots[dataIndexToDataAddress(auxIndex(this.groups, groupIndexToAddress))] = obj;
        } else {
            ComposerKt.composeRuntimeError("Updating the data of a group that was not created with a data slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void updateNode(@NotNull Anchor anchor, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        updateNodeOfGroup(anchor.toIndexFor(this), obj);
    }

    public final void updateNode(@Nullable Object obj) {
        updateNodeOfGroup(this.currentGroup, obj);
    }

    public final void updateParentNode(@Nullable Object obj) {
        updateNodeOfGroup(this.parent, obj);
    }

    public final void verifyDataAnchors$runtime_release() {
        int dataAnchor;
        int i2 = this.slotsGapOwner;
        int length = this.slots.length - this.slotsGapLen;
        int size$runtime_release = getSize$runtime_release();
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (i3 < size$runtime_release) {
            int i5 = i3 + 1;
            int groupIndexToAddress = groupIndexToAddress(i3);
            dataAnchor = SlotTableKt.dataAnchor(this.groups, groupIndexToAddress);
            int dataIndex = dataIndex(this.groups, groupIndexToAddress);
            if (!(dataIndex >= i4)) {
                throw new IllegalStateException(("Data index out of order at " + i3 + ", previous = " + i4 + ", current = " + dataIndex).toString());
            }
            if (!(dataIndex <= length)) {
                throw new IllegalStateException(("Data index, " + dataIndex + ", out of bound at " + i3).toString());
            }
            if (dataAnchor < 0 && !z) {
                if (!(i2 == i3)) {
                    throw new IllegalStateException(("Expected the slot gap owner to be " + i2 + " found gap at " + i3).toString());
                }
                z = true;
            }
            i3 = i5;
            i4 = dataIndex;
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int parentAnchor;
        int parentAnchor2;
        int i2 = this.groupGapStart;
        int i3 = this.groupGapLen;
        int capacity = getCapacity();
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                int i5 = i3 + i2;
                while (i5 < capacity) {
                    int i6 = i5 + 1;
                    parentAnchor = SlotTableKt.parentAnchor(this.groups, i5);
                    if (parentAnchorToIndex(parentAnchor) < i2) {
                        if (!(parentAnchor > -2)) {
                            throw new IllegalStateException(Intrinsics.stringPlus("Expected a start relative anchor at ", Integer.valueOf(i5)).toString());
                        }
                    } else {
                        if (!(parentAnchor <= -2)) {
                            throw new IllegalStateException(Intrinsics.stringPlus("Expected an end relative anchor at ", Integer.valueOf(i5)).toString());
                        }
                    }
                    i5 = i6;
                }
                return;
            }
            int i7 = i4 + 1;
            parentAnchor2 = SlotTableKt.parentAnchor(this.groups, i4);
            if (!(parentAnchor2 > -2)) {
                throw new IllegalStateException(Intrinsics.stringPlus("Expected a start relative anchor at ", Integer.valueOf(i4)).toString());
            }
            i4 = i7;
        }
    }
}
