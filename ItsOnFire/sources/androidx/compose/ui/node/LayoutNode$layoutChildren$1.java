package androidx.compose.ui.node;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LayoutNode$layoutChildren$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ LayoutNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNode$layoutChildren$1(LayoutNode layoutNode) {
        super(0);
        this.this$0 = layoutNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f A[ORIG_RETURN, RETURN] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke2() {
        /*
            r8 = this;
            androidx.compose.ui.node.LayoutNode r0 = r8.this$0
            r1 = 0
            androidx.compose.ui.node.LayoutNode.access$setNextChildPlaceOrder$p(r0, r1)
            androidx.compose.ui.node.LayoutNode r0 = r8.this$0
            androidx.compose.runtime.collection.MutableVector r0 = r0.get_children$ui_release()
            int r2 = r0.getSize()
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 <= 0) goto L40
            java.lang.Object[] r0 = r0.getContent()
            r4 = r1
        L1a:
            r5 = r0[r4]
            androidx.compose.ui.node.LayoutNode r5 = (androidx.compose.ui.node.LayoutNode) r5
            int r6 = r5.getPlaceOrder$ui_release()
            androidx.compose.ui.node.LayoutNode.access$setPreviousPlaceOrder$p(r5, r6)
            androidx.compose.ui.node.LayoutNode.access$setPlaceOrder$p(r5, r3)
            androidx.compose.ui.node.LayoutNodeAlignmentLines r6 = r5.getAlignmentLines$ui_release()
            r6.setUsedDuringParentLayout$ui_release(r1)
            androidx.compose.ui.node.LayoutNode$UsageByParent r6 = r5.getMeasuredByParent$ui_release()
            androidx.compose.ui.node.LayoutNode$UsageByParent r7 = androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock
            if (r6 != r7) goto L3c
            androidx.compose.ui.node.LayoutNode$UsageByParent r6 = androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed
            r5.setMeasuredByParent$ui_release(r6)
        L3c:
            int r4 = r4 + 1
            if (r4 < r2) goto L1a
        L40:
            androidx.compose.ui.node.LayoutNode r0 = r8.this$0
            androidx.compose.ui.node.LayoutNodeWrapper r0 = r0.getInnerLayoutNodeWrapper$ui_release()
            androidx.compose.ui.layout.MeasureResult r0 = r0.getMeasureResult()
            r0.placeChildren()
            androidx.compose.ui.node.LayoutNode r0 = r8.this$0
            androidx.compose.runtime.collection.MutableVector r0 = r0.get_children$ui_release()
            androidx.compose.ui.node.LayoutNode r8 = r8.this$0
            int r2 = r0.getSize()
            if (r2 <= 0) goto L8f
            java.lang.Object[] r0 = r0.getContent()
        L5f:
            r4 = r0[r1]
            androidx.compose.ui.node.LayoutNode r4 = (androidx.compose.ui.node.LayoutNode) r4
            int r5 = androidx.compose.ui.node.LayoutNode.access$getPreviousPlaceOrder$p(r4)
            int r6 = r4.getPlaceOrder$ui_release()
            if (r5 == r6) goto L7c
            androidx.compose.ui.node.LayoutNode.access$onZSortedChildrenInvalidated(r8)
            r8.invalidateLayer$ui_release()
            int r5 = r4.getPlaceOrder$ui_release()
            if (r5 != r3) goto L7c
            androidx.compose.ui.node.LayoutNode.access$markSubtreeAsNotPlaced(r4)
        L7c:
            androidx.compose.ui.node.LayoutNodeAlignmentLines r5 = r4.getAlignmentLines$ui_release()
            androidx.compose.ui.node.LayoutNodeAlignmentLines r4 = r4.getAlignmentLines$ui_release()
            boolean r4 = r4.getUsedDuringParentLayout$ui_release()
            r5.setPreviousUsedDuringParentLayout$ui_release(r4)
            int r1 = r1 + 1
            if (r1 < r2) goto L5f
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode$layoutChildren$1.invoke2():void");
    }
}
