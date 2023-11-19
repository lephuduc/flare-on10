package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import com.google.firebase.messaging.Constants;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0096\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"androidx/compose/runtime/GroupIterator$next$1", "Landroidx/compose/runtime/tooling/CompositionGroup;", "", "compositionGroups", "getCompositionGroups", "()Ljava/lang/Iterable;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "getData", "isEmpty", "", "()Z", "key", "getKey", "()Ljava/lang/Object;", "node", "getNode", "sourceInfo", "", "getSourceInfo", "()Ljava/lang/String;", "iterator", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class GroupIterator$next$1 implements CompositionGroup, Iterable<CompositionGroup>, KMappedMarker {
    public final /* synthetic */ int $group;
    public final /* synthetic */ GroupIterator this$0;

    public GroupIterator$next$1(GroupIterator groupIterator, int i2) {
        this.this$0 = groupIterator;
        this.$group = i2;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @NotNull
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @NotNull
    public Iterable<Object> getData() {
        int dataAnchor;
        dataAnchor = SlotTableKt.dataAnchor(this.this$0.getTable().getGroups(), this.$group);
        return new GroupIterator$next$1$data$1(dataAnchor, this.$group + 1 < this.this$0.getTable().getGroupsSize() ? SlotTableKt.dataAnchor(this.this$0.getTable().getGroups(), this.$group + 1) : this.this$0.getTable().getSlotsSize(), this.this$0);
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @NotNull
    public Object getKey() {
        boolean hasObjectKey;
        int key;
        int objectKeyIndex;
        hasObjectKey = SlotTableKt.hasObjectKey(this.this$0.getTable().getGroups(), this.$group);
        if (!hasObjectKey) {
            key = SlotTableKt.key(this.this$0.getTable().getGroups(), this.$group);
            return Integer.valueOf(key);
        }
        Object[] slots = this.this$0.getTable().getSlots();
        objectKeyIndex = SlotTableKt.objectKeyIndex(this.this$0.getTable().getGroups(), this.$group);
        Object obj = slots[objectKeyIndex];
        Intrinsics.checkNotNull(obj);
        return obj;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @Nullable
    public Object getNode() {
        boolean isNode;
        int nodeIndex;
        isNode = SlotTableKt.isNode(this.this$0.getTable().getGroups(), this.$group);
        if (isNode) {
            Object[] slots = this.this$0.getTable().getSlots();
            nodeIndex = SlotTableKt.nodeIndex(this.this$0.getTable().getGroups(), this.$group);
            return slots[nodeIndex];
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionGroup
    @Nullable
    public String getSourceInfo() {
        boolean hasAux;
        int auxIndex;
        hasAux = SlotTableKt.hasAux(this.this$0.getTable().getGroups(), this.$group);
        if (hasAux) {
            Object[] slots = this.this$0.getTable().getSlots();
            auxIndex = SlotTableKt.auxIndex(this.this$0.getTable().getGroups(), this.$group);
            Object obj = slots[auxIndex];
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }
        return null;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        int groupSize;
        groupSize = SlotTableKt.groupSize(this.this$0.getTable().getGroups(), this.$group);
        return groupSize == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<CompositionGroup> iterator() {
        int groupSize;
        this.this$0.validateRead();
        SlotTable table = this.this$0.getTable();
        int i2 = this.$group;
        groupSize = SlotTableKt.groupSize(this.this$0.getTable().getGroups(), this.$group);
        return new GroupIterator(table, i2 + 1, i2 + groupSize);
    }
}
