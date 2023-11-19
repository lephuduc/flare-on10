package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifiedFocusNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0000\u001a&\u0010\n\u001a\u0004\u0018\u00010\u0007*\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\b\u001a\u00020\tH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"FocusTag", "", "findFocusableChildren", "", "Landroidx/compose/ui/node/LayoutNode;", "focusableChildren", "", "Landroidx/compose/ui/node/ModifiedFocusNode;", "excludeDeactivated", "", "searchChildrenForFocusNode", "queue", "Landroidx/compose/runtime/collection/MutableVector;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class FocusNodeUtilsKt {
    @NotNull
    public static final String FocusTag = "Compose Focus";

    public static final void findFocusableChildren(@NotNull LayoutNode layoutNode, @NotNull List<ModifiedFocusNode> focusableChildren, boolean z) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        Intrinsics.checkNotNullParameter(focusableChildren, "focusableChildren");
        ModifiedFocusNode findNextFocusWrapper = layoutNode.getOuterLayoutNodeWrapper$ui_release().findNextFocusWrapper(z);
        if ((findNextFocusWrapper == null ? null : Boolean.valueOf(focusableChildren.add(findNextFocusWrapper))) == null) {
            List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
            int size = children$ui_release.size();
            for (int i2 = 0; i2 < size; i2++) {
                findFocusableChildren(children$ui_release.get(i2), focusableChildren, z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.node.ModifiedFocusNode searchChildrenForFocusNode(@org.jetbrains.annotations.NotNull androidx.compose.ui.node.LayoutNode r5, @org.jetbrains.annotations.NotNull androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> r6, boolean r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "queue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            androidx.compose.runtime.collection.MutableVector r5 = r5.get_children$ui_release()
            int r0 = r5.getSize()
            r1 = 0
            if (r0 <= 0) goto L30
            java.lang.Object[] r5 = r5.getContent()
            r2 = r1
        L1a:
            r3 = r5[r2]
            androidx.compose.ui.node.LayoutNode r3 = (androidx.compose.ui.node.LayoutNode) r3
            androidx.compose.ui.node.LayoutNodeWrapper r4 = r3.getOuterLayoutNodeWrapper$ui_release()
            androidx.compose.ui.node.ModifiedFocusNode r4 = r4.findNextFocusWrapper(r7)
            if (r4 == 0) goto L29
            return r4
        L29:
            r6.add(r3)
            int r2 = r2 + 1
            if (r2 < r0) goto L1a
        L30:
            boolean r5 = r6.isNotEmpty()
            if (r5 == 0) goto L43
            java.lang.Object r5 = r6.removeAt(r1)
            androidx.compose.ui.node.LayoutNode r5 = (androidx.compose.ui.node.LayoutNode) r5
            androidx.compose.ui.node.ModifiedFocusNode r5 = searchChildrenForFocusNode(r5, r6, r7)
            if (r5 == 0) goto L30
            return r5
        L43:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusNodeUtilsKt.searchChildrenForFocusNode(androidx.compose.ui.node.LayoutNode, androidx.compose.runtime.collection.MutableVector, boolean):androidx.compose.ui.node.ModifiedFocusNode");
    }

    public static /* synthetic */ ModifiedFocusNode searchChildrenForFocusNode$default(LayoutNode layoutNode, MutableVector mutableVector, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutableVector = new MutableVector(new LayoutNode[16], 0);
        }
        return searchChildrenForFocusNode(layoutNode, mutableVector, z);
    }
}
