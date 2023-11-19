package androidx.compose.runtime;

import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020%2\u0006\u0010#\u001a\u00020\u0004J\u0016\u0010&\u001a\u00020'2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0006J\u001e\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006J\u0016\u0010-\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006J\u000e\u0010.\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0004J\u0016\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u0006J\u000e\u00102\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0004R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000ej\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012RW\u0010\u0013\u001a>\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0014j\b\u0012\u0004\u0012\u00020\u0004`\u00150\u000ej\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0014j\b\u0012\u0004\u0012\u00020\u0004`\u0015`\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0012R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Landroidx/compose/runtime/Pending;", "", "keyInfos", "", "Landroidx/compose/runtime/KeyInfo;", "startIndex", "", "(Ljava/util/List;I)V", "groupIndex", "getGroupIndex", "()I", "setGroupIndex", "(I)V", "groupInfos", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupInfo;", "Lkotlin/collections/HashMap;", "getKeyInfos", "()Ljava/util/List;", "keyMap", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "getKeyMap", "()Ljava/util/HashMap;", "keyMap$delegate", "Lkotlin/Lazy;", "getStartIndex", "used", "", "getUsed", "usedKeys", "getNext", "key", "dataKey", "nodePositionOf", "keyInfo", "recordUsed", "", "registerInsert", "", "insertIndex", "registerMoveNode", Constants.MessagePayloadKeys.FROM, "to", "count", "registerMoveSlot", "slotPositionOf", "updateNodeCount", "group", "newCount", "updatedNodeCountOf", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class Pending {
    private int groupIndex;
    @NotNull
    private final HashMap<Integer, GroupInfo> groupInfos;
    @NotNull
    private final List<KeyInfo> keyInfos;
    @NotNull
    private final Lazy keyMap$delegate;
    private final int startIndex;
    @NotNull
    private final List<KeyInfo> usedKeys;

    public Pending(@NotNull List<KeyInfo> keyInfos, int i2) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(keyInfos, "keyInfos");
        this.keyInfos = keyInfos;
        this.startIndex = i2;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException("Invalid start index".toString());
        }
        this.usedKeys = new ArrayList();
        HashMap<Integer, GroupInfo> hashMap = new HashMap<>();
        int size = getKeyInfos().size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            KeyInfo keyInfo = getKeyInfos().get(i4);
            hashMap.put(Integer.valueOf(keyInfo.getLocation()), new GroupInfo(i4, i3, keyInfo.getNodes()));
            i3 += keyInfo.getNodes();
        }
        this.groupInfos = hashMap;
        lazy = LazyKt__LazyJVMKt.lazy(new Pending$keyMap$2(this));
        this.keyMap$delegate = lazy;
    }

    public final int getGroupIndex() {
        return this.groupIndex;
    }

    @NotNull
    public final List<KeyInfo> getKeyInfos() {
        return this.keyInfos;
    }

    @NotNull
    public final HashMap<Object, LinkedHashSet<KeyInfo>> getKeyMap() {
        return (HashMap) this.keyMap$delegate.getValue();
    }

    @Nullable
    public final KeyInfo getNext(int i2, @Nullable Object obj) {
        Object pop;
        pop = ComposerKt.pop(getKeyMap(), obj != null ? new JoinedKey(Integer.valueOf(i2), obj) : Integer.valueOf(i2));
        return (KeyInfo) pop;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    @NotNull
    public final List<KeyInfo> getUsed() {
        return this.usedKeys;
    }

    public final int nodePositionOf(@NotNull KeyInfo keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "keyInfo");
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        if (groupInfo == null) {
            return -1;
        }
        return groupInfo.getNodeIndex();
    }

    public final boolean recordUsed(@NotNull KeyInfo keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "keyInfo");
        return this.usedKeys.add(keyInfo);
    }

    public final void registerInsert(@NotNull KeyInfo keyInfo, int i2) {
        Intrinsics.checkNotNullParameter(keyInfo, "keyInfo");
        this.groupInfos.put(Integer.valueOf(keyInfo.getLocation()), new GroupInfo(-1, i2, 0));
    }

    public final void registerMoveNode(int i2, int i3, int i4) {
        int i5;
        int i6;
        if (i2 > i3) {
            Collection<GroupInfo> values = this.groupInfos.values();
            Intrinsics.checkNotNullExpressionValue(values, "groupInfos.values");
            for (GroupInfo groupInfo : values) {
                int nodeIndex = groupInfo.getNodeIndex();
                if (i2 <= nodeIndex && nodeIndex < i2 + i4) {
                    i6 = (nodeIndex - i2) + i3;
                } else if (i3 <= nodeIndex && nodeIndex < i2) {
                    i6 = nodeIndex + i4;
                }
                groupInfo.setNodeIndex(i6);
            }
        } else if (i3 > i2) {
            Collection<GroupInfo> values2 = this.groupInfos.values();
            Intrinsics.checkNotNullExpressionValue(values2, "groupInfos.values");
            for (GroupInfo groupInfo2 : values2) {
                int nodeIndex2 = groupInfo2.getNodeIndex();
                if (i2 <= nodeIndex2 && nodeIndex2 < i2 + i4) {
                    i5 = (nodeIndex2 - i2) + i3;
                } else if (i2 + 1 <= nodeIndex2 && nodeIndex2 < i3) {
                    i5 = nodeIndex2 - i4;
                }
                groupInfo2.setNodeIndex(i5);
            }
        }
    }

    public final void registerMoveSlot(int i2, int i3) {
        if (i2 > i3) {
            Collection<GroupInfo> values = this.groupInfos.values();
            Intrinsics.checkNotNullExpressionValue(values, "groupInfos.values");
            for (GroupInfo groupInfo : values) {
                int slotIndex = groupInfo.getSlotIndex();
                if (slotIndex == i2) {
                    groupInfo.setSlotIndex(i3);
                } else if (i3 <= slotIndex && slotIndex < i2) {
                    groupInfo.setSlotIndex(slotIndex + 1);
                }
            }
        } else if (i3 > i2) {
            Collection<GroupInfo> values2 = this.groupInfos.values();
            Intrinsics.checkNotNullExpressionValue(values2, "groupInfos.values");
            for (GroupInfo groupInfo2 : values2) {
                int slotIndex2 = groupInfo2.getSlotIndex();
                if (slotIndex2 == i2) {
                    groupInfo2.setSlotIndex(i3);
                } else if (i2 + 1 <= slotIndex2 && slotIndex2 < i3) {
                    groupInfo2.setSlotIndex(slotIndex2 - 1);
                }
            }
        }
    }

    public final void setGroupIndex(int i2) {
        this.groupIndex = i2;
    }

    public final int slotPositionOf(@NotNull KeyInfo keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "keyInfo");
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        if (groupInfo == null) {
            return -1;
        }
        return groupInfo.getSlotIndex();
    }

    public final boolean updateNodeCount(int i2, int i3) {
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(i2));
        if (groupInfo != null) {
            int nodeIndex = groupInfo.getNodeIndex();
            int nodeCount = i3 - groupInfo.getNodeCount();
            groupInfo.setNodeCount(i3);
            if (nodeCount != 0) {
                Collection<GroupInfo> values = this.groupInfos.values();
                Intrinsics.checkNotNullExpressionValue(values, "groupInfos.values");
                for (GroupInfo groupInfo2 : values) {
                    if (groupInfo2.getNodeIndex() >= nodeIndex && !Intrinsics.areEqual(groupInfo2, groupInfo)) {
                        groupInfo2.setNodeIndex(groupInfo2.getNodeIndex() + nodeCount);
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final int updatedNodeCountOf(@NotNull KeyInfo keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "keyInfo");
        GroupInfo groupInfo = this.groupInfos.get(Integer.valueOf(keyInfo.getLocation()));
        Integer valueOf = groupInfo == null ? null : Integer.valueOf(groupInfo.getNodeCount());
        return valueOf == null ? keyInfo.getNodes() : valueOf.intValue();
    }
}
