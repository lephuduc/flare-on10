package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0$J\u0006\u0010%\u001a\u00020&J\r\u0010'\u001a\u00020&H\u0000¢\u0006\u0002\b(J\r\u0010)\u001a\u00020&H\u0000¢\u0006\u0002\b*R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\fR\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0017\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\u001a\u0010\u001a\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR\u001a\u0010\u001d\u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR\u001a\u0010 \u001a\u00020\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000e¨\u0006+"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "dirty", "", "getDirty$ui_release", "()Z", "setDirty$ui_release", "(Z)V", "previousUsedDuringParentLayout", "getPreviousUsedDuringParentLayout$ui_release", "setPreviousUsedDuringParentLayout$ui_release", "queried", "getQueried$ui_release", "queryOwner", "required", "getRequired$ui_release", "usedByModifierLayout", "getUsedByModifierLayout$ui_release", "setUsedByModifierLayout$ui_release", "usedByModifierMeasurement", "getUsedByModifierMeasurement$ui_release", "setUsedByModifierMeasurement$ui_release", "usedDuringParentLayout", "getUsedDuringParentLayout$ui_release", "setUsedDuringParentLayout$ui_release", "usedDuringParentMeasurement", "getUsedDuringParentMeasurement$ui_release", "setUsedDuringParentMeasurement$ui_release", "getLastCalculation", "", "recalculate", "", "recalculateQueryOwner", "recalculateQueryOwner$ui_release", "reset", "reset$ui_release", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LayoutNodeAlignmentLines {
    @NotNull
    private final Map<AlignmentLine, Integer> alignmentLines;
    private boolean dirty;
    @NotNull
    private final LayoutNode layoutNode;
    private boolean previousUsedDuringParentLayout;
    @Nullable
    private LayoutNode queryOwner;
    private boolean usedByModifierLayout;
    private boolean usedByModifierMeasurement;
    private boolean usedDuringParentLayout;
    private boolean usedDuringParentMeasurement;

    public LayoutNodeAlignmentLines(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
        this.dirty = true;
        this.alignmentLines = new HashMap();
    }

    private static final void recalculate$addAlignmentLine(LayoutNodeAlignmentLines layoutNodeAlignmentLines, AlignmentLine alignmentLine, int i2, LayoutNodeWrapper layoutNodeWrapper) {
        long Offset;
        int roundToInt;
        Object value;
        loop0: while (true) {
            float f2 = i2;
            Offset = OffsetKt.Offset(f2, f2);
            do {
                Offset = layoutNodeWrapper.m2885toParentPositionMKHz9U(Offset);
                layoutNodeWrapper = layoutNodeWrapper.getWrappedBy$ui_release();
                Intrinsics.checkNotNull(layoutNodeWrapper);
                if (Intrinsics.areEqual(layoutNodeWrapper, layoutNodeAlignmentLines.layoutNode.getInnerLayoutNodeWrapper$ui_release())) {
                    break loop0;
                }
            } while (!layoutNodeWrapper.getProvidedAlignmentLines().contains(alignmentLine));
            i2 = layoutNodeWrapper.get(alignmentLine);
        }
        roundToInt = MathKt__MathJVMKt.roundToInt(alignmentLine instanceof HorizontalAlignmentLine ? Offset.m1162getYimpl(Offset) : Offset.m1161getXimpl(Offset));
        Map<AlignmentLine, Integer> map = layoutNodeAlignmentLines.alignmentLines;
        if (map.containsKey(alignmentLine)) {
            value = MapsKt__MapsKt.getValue(layoutNodeAlignmentLines.alignmentLines, alignmentLine);
            roundToInt = AlignmentLineKt.merge(alignmentLine, ((Number) value).intValue(), roundToInt);
        }
        map.put(alignmentLine, Integer.valueOf(roundToInt));
    }

    public final boolean getDirty$ui_release() {
        return this.dirty;
    }

    @NotNull
    public final Map<AlignmentLine, Integer> getLastCalculation() {
        return this.alignmentLines;
    }

    public final boolean getPreviousUsedDuringParentLayout$ui_release() {
        return this.previousUsedDuringParentLayout;
    }

    public final boolean getQueried$ui_release() {
        return this.usedDuringParentMeasurement || this.previousUsedDuringParentLayout || this.usedByModifierMeasurement || this.usedByModifierLayout;
    }

    public final boolean getRequired$ui_release() {
        recalculateQueryOwner$ui_release();
        return this.queryOwner != null;
    }

    public final boolean getUsedByModifierLayout$ui_release() {
        return this.usedByModifierLayout;
    }

    public final boolean getUsedByModifierMeasurement$ui_release() {
        return this.usedByModifierMeasurement;
    }

    public final boolean getUsedDuringParentLayout$ui_release() {
        return this.usedDuringParentLayout;
    }

    public final boolean getUsedDuringParentMeasurement$ui_release() {
        return this.usedDuringParentMeasurement;
    }

    public final void recalculate() {
        this.alignmentLines.clear();
        MutableVector<LayoutNode> mutableVector = this.layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size <= 0) {
            this.alignmentLines.putAll(this.layoutNode.getInnerLayoutNodeWrapper$ui_release().getMeasureResult().getAlignmentLines());
            this.dirty = false;
        }
        LayoutNode[] content = mutableVector.getContent();
        int i2 = 0;
        do {
            LayoutNode layoutNode = content[i2];
            if (layoutNode.isPlaced()) {
                if (layoutNode.getAlignmentLines$ui_release().getDirty$ui_release()) {
                    layoutNode.layoutChildren$ui_release();
                }
                for (Map.Entry<AlignmentLine, Integer> entry : layoutNode.getAlignmentLines$ui_release().alignmentLines.entrySet()) {
                    recalculate$addAlignmentLine(this, entry.getKey(), entry.getValue().intValue(), layoutNode.getInnerLayoutNodeWrapper$ui_release());
                }
                LayoutNodeWrapper innerLayoutNodeWrapper$ui_release = layoutNode.getInnerLayoutNodeWrapper$ui_release();
                while (true) {
                    innerLayoutNodeWrapper$ui_release = innerLayoutNodeWrapper$ui_release.getWrappedBy$ui_release();
                    Intrinsics.checkNotNull(innerLayoutNodeWrapper$ui_release);
                    if (Intrinsics.areEqual(innerLayoutNodeWrapper$ui_release, this.layoutNode.getInnerLayoutNodeWrapper$ui_release())) {
                        break;
                    }
                    for (AlignmentLine alignmentLine : innerLayoutNodeWrapper$ui_release.getProvidedAlignmentLines()) {
                        recalculate$addAlignmentLine(this, alignmentLine, innerLayoutNodeWrapper$ui_release.get(alignmentLine), innerLayoutNodeWrapper$ui_release);
                    }
                }
            }
            i2++;
        } while (i2 < size);
        this.alignmentLines.putAll(this.layoutNode.getInnerLayoutNodeWrapper$ui_release().getMeasureResult().getAlignmentLines());
        this.dirty = false;
    }

    public final void recalculateQueryOwner$ui_release() {
        LayoutNodeAlignmentLines alignmentLines$ui_release;
        LayoutNodeAlignmentLines alignmentLines$ui_release2;
        LayoutNode layoutNode = null;
        if (getQueried$ui_release()) {
            layoutNode = this.layoutNode;
        } else {
            LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
            if (parent$ui_release == null) {
                return;
            }
            LayoutNode layoutNode2 = parent$ui_release.getAlignmentLines$ui_release().queryOwner;
            if (layoutNode2 == null || !layoutNode2.getAlignmentLines$ui_release().getQueried$ui_release()) {
                LayoutNode layoutNode3 = this.queryOwner;
                if (layoutNode3 == null || layoutNode3.getAlignmentLines$ui_release().getQueried$ui_release()) {
                    return;
                }
                LayoutNode parent$ui_release2 = layoutNode3.getParent$ui_release();
                if (parent$ui_release2 != null && (alignmentLines$ui_release2 = parent$ui_release2.getAlignmentLines$ui_release()) != null) {
                    alignmentLines$ui_release2.recalculateQueryOwner$ui_release();
                }
                LayoutNode parent$ui_release3 = layoutNode3.getParent$ui_release();
                if (parent$ui_release3 != null && (alignmentLines$ui_release = parent$ui_release3.getAlignmentLines$ui_release()) != null) {
                    layoutNode = alignmentLines$ui_release.queryOwner;
                }
            } else {
                layoutNode = layoutNode2;
            }
        }
        this.queryOwner = layoutNode;
    }

    public final void reset$ui_release() {
        this.dirty = true;
        this.usedDuringParentMeasurement = false;
        this.previousUsedDuringParentLayout = false;
        this.usedDuringParentLayout = false;
        this.usedByModifierMeasurement = false;
        this.usedByModifierLayout = false;
        this.queryOwner = null;
    }

    public final void setDirty$ui_release(boolean z) {
        this.dirty = z;
    }

    public final void setPreviousUsedDuringParentLayout$ui_release(boolean z) {
        this.previousUsedDuringParentLayout = z;
    }

    public final void setUsedByModifierLayout$ui_release(boolean z) {
        this.usedByModifierLayout = z;
    }

    public final void setUsedByModifierMeasurement$ui_release(boolean z) {
        this.usedByModifierMeasurement = z;
    }

    public final void setUsedDuringParentLayout$ui_release(boolean z) {
        this.usedDuringParentLayout = z;
    }

    public final void setUsedDuringParentMeasurement$ui_release(boolean z) {
        this.usedDuringParentMeasurement = z;
    }
}
