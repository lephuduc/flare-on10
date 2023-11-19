package androidx.compose.runtime;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u0006J\u0006\u0010<\u001a\u00020=J\u0006\u0010>\u001a\u00020=J\u0006\u0010?\u001a\u00020=J\u0006\u0010@\u001a\u00020=J\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BJ\u0010\u0010D\u001a\u0004\u0018\u00010\u00012\u0006\u0010;\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010;\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006J\u0010\u0010E\u001a\u0004\u0018\u00010\u00012\u0006\u0010;\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u00109\u001a\u00020:J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010;\u001a\u00020\u0006J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006J\u000e\u0010F\u001a\u00020$2\u0006\u0010;\u001a\u00020\u0006J\u000e\u0010(\u001a\u00020$2\u0006\u0010;\u001a\u00020\u0006J\b\u0010G\u001a\u0004\u0018\u00010\u0001J\u0010\u0010H\u001a\u0004\u0018\u00010\u00012\u0006\u0010;\u001a\u00020\u0006J\u000e\u0010)\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006J\u000e\u0010+\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006J\u000e\u0010I\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006J\u000e\u0010J\u001a\u00020=2\u0006\u0010;\u001a\u00020\u0006J\u000e\u0010K\u001a\u00020=2\u0006\u0010;\u001a\u00020\u0006J\u0006\u0010L\u001a\u00020\u0006J\u0006\u0010M\u001a\u00020=J\u0006\u0010N\u001a\u00020=J\u0006\u0010O\u001a\u00020=J\u0016\u0010P\u001a\u0004\u0018\u00010\u0001*\u00020!2\u0006\u0010;\u001a\u00020\u0006H\u0002J\u0016\u0010H\u001a\u0004\u0018\u00010\u0001*\u00020!2\u0006\u0010;\u001a\u00020\u0006H\u0002J\u0016\u0010Q\u001a\u0004\u0018\u00010\u0001*\u00020!2\u0006\u0010;\u001a\u00020\u0006H\u0002R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0011\u0010\u0014\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u001a\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0011\u0010\u001c\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0011\u0010\u001e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b'\u0010&R\u0011\u0010(\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0011\u0010)\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b*\u0010\tR\u001e\u0010+\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\tR\u0011\u0010-\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b.\u0010\tR\u0011\u0010/\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b0\u0010\tR\u0011\u00101\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b2\u0010\tR\u0018\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000104X\u0082\u0004¢\u0006\u0004\n\u0002\u00105R\u000e\u00106\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006R"}, d2 = {"Landroidx/compose/runtime/SlotReader;", "", "table", "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "<set-?>", "", "currentEnd", "getCurrentEnd", "()I", "currentGroup", "getCurrentGroup", "currentSlot", "currentSlotEnd", "emptyCount", "groupAux", "getGroupAux", "()Ljava/lang/Object;", "groupEnd", "getGroupEnd", "groupKey", "getGroupKey", "groupNode", "getGroupNode", "groupObjectKey", "getGroupObjectKey", "groupSize", "getGroupSize", "groupSlotCount", "getGroupSlotCount", "groupSlotIndex", "getGroupSlotIndex", "groups", "", "groupsSize", "inEmpty", "", "getInEmpty", "()Z", "isGroupEnd", "isNode", "nodeCount", "getNodeCount", "parent", "getParent", "parentNodes", "getParentNodes", "size", "getSize", "slot", "getSlot", "slots", "", "[Ljava/lang/Object;", "slotsSize", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "anchor", "Landroidx/compose/runtime/Anchor;", FirebaseAnalytics.Param.INDEX, "beginEmpty", "", "close", "endEmpty", "endGroup", "extractKeys", "", "Landroidx/compose/runtime/KeyInfo;", "get", "groupGet", "hasObjectKey", "next", "node", "parentOf", "reposition", "restoreParent", "skipGroup", "skipToGroupEnd", "startGroup", "startNode", "aux", "objectKey", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SlotReader {
    private int currentEnd;
    private int currentGroup;
    private int currentSlot;
    private int currentSlotEnd;
    private int emptyCount;
    @NotNull
    private final int[] groups;
    private final int groupsSize;
    private int parent;
    @NotNull
    private final Object[] slots;
    private final int slotsSize;
    @NotNull
    private final SlotTable table;

    public SlotReader(@NotNull SlotTable table) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.table = table;
        this.groups = table.getGroups();
        int groupsSize = table.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = table.getSlots();
        this.slotsSize = table.getSlotsSize();
        this.currentEnd = groupsSize;
        this.parent = -1;
    }

    public static /* synthetic */ Anchor anchor$default(SlotReader slotReader, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = slotReader.currentGroup;
        }
        return slotReader.anchor(i2);
    }

    private final Object aux(int[] iArr, int i2) {
        boolean hasAux;
        int auxIndex;
        hasAux = SlotTableKt.hasAux(iArr, i2);
        if (hasAux) {
            Object[] objArr = this.slots;
            auxIndex = SlotTableKt.auxIndex(iArr, i2);
            return objArr[auxIndex];
        }
        return Composer.Companion.getEmpty();
    }

    private final Object node(int[] iArr, int i2) {
        boolean isNode;
        int nodeIndex;
        isNode = SlotTableKt.isNode(iArr, i2);
        if (isNode) {
            Object[] objArr = this.slots;
            nodeIndex = SlotTableKt.nodeIndex(iArr, i2);
            return objArr[nodeIndex];
        }
        return Composer.Companion.getEmpty();
    }

    private final Object objectKey(int[] iArr, int i2) {
        boolean hasObjectKey;
        int objectKeyIndex;
        hasObjectKey = SlotTableKt.hasObjectKey(iArr, i2);
        if (hasObjectKey) {
            Object[] objArr = this.slots;
            objectKeyIndex = SlotTableKt.objectKeyIndex(iArr, i2);
            return objArr[objectKeyIndex];
        }
        return null;
    }

    @NotNull
    public final Anchor anchor(int i2) {
        ArrayList<Anchor> anchors$runtime_release = this.table.getAnchors$runtime_release();
        int search = SlotTableKt.search(anchors$runtime_release, i2, this.groupsSize);
        if (search < 0) {
            Anchor anchor = new Anchor(i2);
            anchors$runtime_release.add(-(search + 1), anchor);
            return anchor;
        }
        Anchor anchor2 = anchors$runtime_release.get(search);
        Intrinsics.checkNotNullExpressionValue(anchor2, "get(location)");
        return anchor2;
    }

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final void close() {
        this.table.close$runtime_release(this);
    }

    public final void endEmpty() {
        int i2 = this.emptyCount;
        if (!(i2 > 0)) {
            throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
        }
        this.emptyCount = i2 - 1;
    }

    public final void endGroup() {
        int parentAnchor;
        int groupSize;
        int i2;
        if (this.emptyCount == 0) {
            if (!(this.currentGroup == this.currentEnd)) {
                throw new IllegalArgumentException("endGroup() not called at the end of a group".toString());
            }
            parentAnchor = SlotTableKt.parentAnchor(this.groups, this.parent);
            this.parent = parentAnchor;
            if (parentAnchor < 0) {
                i2 = this.groupsSize;
            } else {
                groupSize = SlotTableKt.groupSize(this.groups, parentAnchor);
                i2 = parentAnchor + groupSize;
            }
            this.currentEnd = i2;
        }
    }

    @NotNull
    public final List<KeyInfo> extractKeys() {
        int key;
        boolean isNode;
        int groupSize;
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount > 0) {
            return arrayList;
        }
        int i2 = this.currentGroup;
        int i3 = 0;
        while (i2 < this.currentEnd) {
            key = SlotTableKt.key(this.groups, i2);
            Object objectKey = objectKey(this.groups, i2);
            isNode = SlotTableKt.isNode(this.groups, i2);
            arrayList.add(new KeyInfo(key, objectKey, i2, isNode ? 1 : SlotTableKt.nodeCount(this.groups, i2), i3));
            groupSize = SlotTableKt.groupSize(this.groups, i2);
            i2 += groupSize;
            i3++;
        }
        return arrayList;
    }

    @Nullable
    public final Object get(int i2) {
        int i3 = this.currentSlot + i2;
        return i3 < this.currentSlotEnd ? this.slots[i3] : Composer.Companion.getEmpty();
    }

    public final int getCurrentEnd() {
        return this.currentEnd;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    @Nullable
    public final Object getGroupAux() {
        int i2 = this.currentGroup;
        if (i2 < this.currentEnd) {
            return aux(this.groups, i2);
        }
        return 0;
    }

    public final int getGroupEnd() {
        return this.currentEnd;
    }

    public final int getGroupKey() {
        int key;
        int i2 = this.currentGroup;
        if (i2 < this.currentEnd) {
            key = SlotTableKt.key(this.groups, i2);
            return key;
        }
        return 0;
    }

    @Nullable
    public final Object getGroupNode() {
        int i2 = this.currentGroup;
        if (i2 < this.currentEnd) {
            return node(this.groups, i2);
        }
        return null;
    }

    @Nullable
    public final Object getGroupObjectKey() {
        int i2 = this.currentGroup;
        if (i2 < this.currentEnd) {
            return objectKey(this.groups, i2);
        }
        return null;
    }

    public final int getGroupSize() {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, this.currentGroup);
        return groupSize;
    }

    public final int getGroupSlotCount() {
        int slotAnchor;
        int i2 = this.currentGroup;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, i2);
        int i3 = i2 + 1;
        return (i3 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i3) : this.slotsSize) - slotAnchor;
    }

    public final int getGroupSlotIndex() {
        int slotAnchor;
        int i2 = this.currentSlot;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, this.parent);
        return i2 - slotAnchor;
    }

    public final boolean getInEmpty() {
        return this.emptyCount > 0;
    }

    public final int getNodeCount() {
        int nodeCount;
        nodeCount = SlotTableKt.nodeCount(this.groups, this.currentGroup);
        return nodeCount;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getParentNodes() {
        int nodeCount;
        int i2 = this.parent;
        if (i2 >= 0) {
            nodeCount = SlotTableKt.nodeCount(this.groups, i2);
            return nodeCount;
        }
        return 0;
    }

    public final int getSize() {
        return this.groupsSize;
    }

    public final int getSlot() {
        int slotAnchor;
        int i2 = this.currentSlot;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, this.parent);
        return i2 - slotAnchor;
    }

    @NotNull
    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    @Nullable
    public final Object groupAux(int i2) {
        return aux(this.groups, i2);
    }

    public final int groupEnd(int i2) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, i2);
        return i2 + groupSize;
    }

    @Nullable
    public final Object groupGet(int i2) {
        int slotAnchor;
        int i3 = this.currentGroup;
        slotAnchor = SlotTableKt.slotAnchor(this.groups, i3);
        int i4 = i3 + 1;
        int i5 = slotAnchor + i2;
        return i5 < (i4 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, i4) : this.slotsSize) ? this.slots[i5] : Composer.Companion.getEmpty();
    }

    public final int groupKey(int i2) {
        int key;
        key = SlotTableKt.key(this.groups, i2);
        return key;
    }

    public final int groupKey(@NotNull Anchor anchor) {
        int key;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (anchor.getValid()) {
            key = SlotTableKt.key(this.groups, this.table.anchorIndex(anchor));
            return key;
        }
        return 0;
    }

    @Nullable
    public final Object groupObjectKey(int i2) {
        return objectKey(this.groups, i2);
    }

    public final int groupSize(int i2) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, i2);
        return groupSize;
    }

    public final boolean hasObjectKey(int i2) {
        boolean hasObjectKey;
        hasObjectKey = SlotTableKt.hasObjectKey(this.groups, i2);
        return hasObjectKey;
    }

    public final boolean isGroupEnd() {
        return getInEmpty() || this.currentGroup == this.currentEnd;
    }

    public final boolean isNode() {
        boolean isNode;
        isNode = SlotTableKt.isNode(this.groups, this.currentGroup);
        return isNode;
    }

    public final boolean isNode(int i2) {
        boolean isNode;
        isNode = SlotTableKt.isNode(this.groups, i2);
        return isNode;
    }

    @Nullable
    public final Object next() {
        int i2;
        if (this.emptyCount > 0 || (i2 = this.currentSlot) >= this.currentSlotEnd) {
            return Composer.Companion.getEmpty();
        }
        Object[] objArr = this.slots;
        this.currentSlot = i2 + 1;
        return objArr[i2];
    }

    @Nullable
    public final Object node(int i2) {
        boolean isNode;
        isNode = SlotTableKt.isNode(this.groups, i2);
        if (isNode) {
            return node(this.groups, i2);
        }
        return null;
    }

    public final int nodeCount(int i2) {
        int nodeCount;
        nodeCount = SlotTableKt.nodeCount(this.groups, i2);
        return nodeCount;
    }

    public final int parent(int i2) {
        int parentAnchor;
        parentAnchor = SlotTableKt.parentAnchor(this.groups, i2);
        return parentAnchor;
    }

    public final int parentOf(int i2) {
        int parentAnchor;
        if (i2 >= 0 && i2 < this.groupsSize) {
            parentAnchor = SlotTableKt.parentAnchor(this.groups, i2);
            return parentAnchor;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("Invalid group index ", Integer.valueOf(i2)).toString());
    }

    public final void reposition(int i2) {
        int groupSize;
        int i3;
        if (!(this.emptyCount == 0)) {
            throw new IllegalArgumentException("Cannot reposition while in an empty region".toString());
        }
        this.currentGroup = i2;
        int parentAnchor = i2 < this.groupsSize ? SlotTableKt.parentAnchor(this.groups, i2) : -1;
        this.parent = parentAnchor;
        if (parentAnchor < 0) {
            i3 = this.groupsSize;
        } else {
            groupSize = SlotTableKt.groupSize(this.groups, parentAnchor);
            i3 = parentAnchor + groupSize;
        }
        this.currentEnd = i3;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void restoreParent(int i2) {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.groups, i2);
        int i3 = groupSize + i2;
        int i4 = this.currentGroup;
        if (i4 >= i2 && i4 <= i3) {
            this.parent = i2;
            this.currentEnd = i3;
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
            return;
        }
        throw new IllegalArgumentException(("Index " + i2 + " is not a parent of " + i4).toString());
    }

    public final int skipGroup() {
        boolean isNode;
        int groupSize;
        if (this.emptyCount == 0) {
            isNode = SlotTableKt.isNode(this.groups, this.currentGroup);
            int nodeCount = isNode ? 1 : SlotTableKt.nodeCount(this.groups, this.currentGroup);
            int i2 = this.currentGroup;
            groupSize = SlotTableKt.groupSize(this.groups, i2);
            this.currentGroup = i2 + groupSize;
            return nodeCount;
        }
        throw new IllegalArgumentException("Cannot skip while in an empty region".toString());
    }

    public final void skipToGroupEnd() {
        if (!(this.emptyCount == 0)) {
            throw new IllegalArgumentException("Cannot skip the enclosing group while in an empty region".toString());
        }
        this.currentGroup = this.currentEnd;
    }

    public final void startGroup() {
        int parentAnchor;
        int groupSize;
        int slotAnchor;
        if (this.emptyCount <= 0) {
            parentAnchor = SlotTableKt.parentAnchor(this.groups, this.currentGroup);
            if (!(parentAnchor == this.parent)) {
                throw new IllegalArgumentException("Invalid slot table detected".toString());
            }
            int i2 = this.currentGroup;
            this.parent = i2;
            groupSize = SlotTableKt.groupSize(this.groups, i2);
            this.currentEnd = i2 + groupSize;
            int i3 = this.currentGroup;
            int i4 = i3 + 1;
            this.currentGroup = i4;
            slotAnchor = SlotTableKt.slotAnchor(this.groups, i3);
            this.currentSlot = slotAnchor;
            this.currentSlotEnd = i3 >= this.groupsSize - 1 ? this.slotsSize : SlotTableKt.dataAnchor(this.groups, i4);
        }
    }

    public final void startNode() {
        boolean isNode;
        if (this.emptyCount <= 0) {
            isNode = SlotTableKt.isNode(this.groups, this.currentGroup);
            if (!isNode) {
                throw new IllegalArgumentException("Expected a node group".toString());
            }
            startGroup();
        }
    }
}
