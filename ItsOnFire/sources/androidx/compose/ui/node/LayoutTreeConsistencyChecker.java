package androidx.compose.ui.node;

import androidx.appcompat.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\f\u0010\u0011\u001a\u00020\f*\u00020\u0003H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "", "root", "Landroidx/compose/ui/node/LayoutNode;", "relayoutNodes", "Landroidx/compose/ui/node/DepthSortedSet;", "postponedMeasureRequests", "", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/DepthSortedSet;Ljava/util/List;)V", "assertConsistent", "", "isTreeConsistent", "", "node", "logTree", "", "nodeToString", "consistentLayoutState", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LayoutTreeConsistencyChecker {
    @NotNull
    private final List<LayoutNode> postponedMeasureRequests;
    @NotNull
    private final DepthSortedSet relayoutNodes;
    @NotNull
    private final LayoutNode root;

    public LayoutTreeConsistencyChecker(@NotNull LayoutNode root, @NotNull DepthSortedSet relayoutNodes, @NotNull List<LayoutNode> postponedMeasureRequests) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(relayoutNodes, "relayoutNodes");
        Intrinsics.checkNotNullParameter(postponedMeasureRequests, "postponedMeasureRequests");
        this.root = root;
        this.relayoutNodes = relayoutNodes;
        this.postponedMeasureRequests = postponedMeasureRequests;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        if ((r0 != null && r0.isPlaced()) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean consistentLayoutState(androidx.compose.ui.node.LayoutNode r7) {
        /*
            r6 = this;
            androidx.compose.ui.node.LayoutNode r0 = r7.getParent$ui_release()
            boolean r1 = r7.isPlaced()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L22
            int r1 = r7.getPlaceOrder$ui_release()
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r4) goto L6f
            if (r0 != 0) goto L19
        L17:
            r1 = r2
            goto L20
        L19:
            boolean r1 = r0.isPlaced()
            if (r1 != r3) goto L17
            r1 = r3
        L20:
            if (r1 == 0) goto L6f
        L22:
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = r7.getLayoutState$ui_release()
            androidx.compose.ui.node.LayoutNode$LayoutState r4 = androidx.compose.ui.node.LayoutNode.LayoutState.NeedsRemeasure
            if (r1 != r4) goto L33
            java.util.List<androidx.compose.ui.node.LayoutNode> r1 = r6.postponedMeasureRequests
            boolean r1 = r1.contains(r7)
            if (r1 == 0) goto L33
            return r3
        L33:
            if (r0 != 0) goto L37
            r0 = 0
            goto L3b
        L37:
            androidx.compose.ui.node.LayoutNode$LayoutState r0 = r0.getLayoutState$ui_release()
        L3b:
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = r7.getLayoutState$ui_release()
            if (r1 != r4) goto L51
            androidx.compose.ui.node.DepthSortedSet r6 = r6.relayoutNodes
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L4f
            if (r0 == r4) goto L4f
            androidx.compose.ui.node.LayoutNode$LayoutState r6 = androidx.compose.ui.node.LayoutNode.LayoutState.Measuring
            if (r0 != r6) goto L50
        L4f:
            r2 = r3
        L50:
            return r2
        L51:
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = r7.getLayoutState$ui_release()
            androidx.compose.ui.node.LayoutNode$LayoutState r5 = androidx.compose.ui.node.LayoutNode.LayoutState.NeedsRelayout
            if (r1 != r5) goto L6f
            androidx.compose.ui.node.DepthSortedSet r6 = r6.relayoutNodes
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L6d
            if (r0 == r4) goto L6d
            if (r0 == r5) goto L6d
            androidx.compose.ui.node.LayoutNode$LayoutState r6 = androidx.compose.ui.node.LayoutNode.LayoutState.Measuring
            if (r0 == r6) goto L6d
            androidx.compose.ui.node.LayoutNode$LayoutState r6 = androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut
            if (r0 != r6) goto L6e
        L6d:
            r2 = r3
        L6e:
            return r2
        L6f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutTreeConsistencyChecker.consistentLayoutState(androidx.compose.ui.node.LayoutNode):boolean");
    }

    private final boolean isTreeConsistent(LayoutNode layoutNode) {
        if (consistentLayoutState(layoutNode)) {
            List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
            int size = children$ui_release.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                if (!isTreeConsistent(children$ui_release.get(i2))) {
                    return false;
                }
                i2 = i3;
            }
            return true;
        }
        return false;
    }

    private final String logTree() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        logTree$printSubTree(this, sb, this.root, 0);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "stringBuilder.toString()");
        return sb2;
    }

    private static final void logTree$printSubTree(LayoutTreeConsistencyChecker layoutTreeConsistencyChecker, StringBuilder sb, LayoutNode layoutNode, int i2) {
        String nodeToString = layoutTreeConsistencyChecker.nodeToString(layoutNode);
        if (nodeToString.length() > 0) {
            int i3 = 0;
            while (i3 < i2) {
                i3++;
                sb.append("..");
            }
            sb.append(nodeToString);
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            i2++;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i4 = 0; i4 < size; i4++) {
            logTree$printSubTree(layoutTreeConsistencyChecker, sb, children$ui_release.get(i4), i2);
        }
    }

    private final String nodeToString(LayoutNode layoutNode) {
        StringBuilder sb = new StringBuilder();
        sb.append(layoutNode);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(layoutNode.getLayoutState$ui_release());
        sb2.append(']');
        sb.append(sb2.toString());
        if (!layoutNode.isPlaced()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + layoutNode.getMeasuredByParent$ui_release() + ']');
        if (!consistentLayoutState(layoutNode)) {
            sb.append("[INCONSISTENT]");
        }
        String sb3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "with(StringBuilder()) {\n…     toString()\n        }");
        return sb3;
    }

    public final void assertConsistent() {
        if (!isTreeConsistent(this.root)) {
            System.out.println((Object) logTree());
            throw new IllegalStateException("Inconsistency found!");
        }
    }
}
