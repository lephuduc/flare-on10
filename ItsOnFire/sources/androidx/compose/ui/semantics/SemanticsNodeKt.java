package androidx.compose.ui.semantics;

import androidx.appcompat.R;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\f\u001a\u00020\r*\u00020\tH\u0002\u001a\"\u0010\u000e\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u0010H\u0002\u001a\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013*\u00020\u00022\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0002\u001a&\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010H\u0080\bø\u0001\u0001\u001a\f\u0010\u0019\u001a\u00020\r*\u00020\tH\u0002\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\t8BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\u001a"}, d2 = {"outerMergingSemantics", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "Landroidx/compose/ui/node/LayoutNode;", "getOuterMergingSemantics", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/semantics/SemanticsWrapper;", "outerSemantics", "getOuterSemantics", "role", "Landroidx/compose/ui/semantics/Role;", "Landroidx/compose/ui/semantics/SemanticsNode;", "getRole", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/semantics/Role;", "contentDescriptionFakeNodeId", "", "findClosestParentNode", "selector", "Lkotlin/Function1;", "", "findOneLayerOfSemanticsWrappers", "", "list", "", "nearestSemantics", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "predicate", "roleFakeNodeId", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SemanticsNodeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int contentDescriptionFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 2000000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutNode findClosestParentNode(LayoutNode layoutNode, Function1<? super LayoutNode, Boolean> function1) {
        do {
            layoutNode = layoutNode.getParent$ui_release();
            if (layoutNode == null) {
                return null;
            }
        } while (!function1.invoke(layoutNode).booleanValue());
        return layoutNode;
    }

    private static final List<SemanticsWrapper> findOneLayerOfSemanticsWrappers(LayoutNode layoutNode, List<SemanticsWrapper> list) {
        MutableVector<LayoutNode> zSortedChildren = layoutNode.getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            int i2 = 0;
            LayoutNode[] content = zSortedChildren.getContent();
            do {
                LayoutNode layoutNode2 = content[i2];
                SemanticsWrapper outerSemantics = getOuterSemantics(layoutNode2);
                if (outerSemantics != null) {
                    list.add(outerSemantics);
                } else {
                    findOneLayerOfSemanticsWrappers(layoutNode2, list);
                }
                i2++;
            } while (i2 < size);
            return list;
        }
        return list;
    }

    public static /* synthetic */ List findOneLayerOfSemanticsWrappers$default(LayoutNode layoutNode, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = new ArrayList();
        }
        return findOneLayerOfSemanticsWrappers(layoutNode, list);
    }

    @Nullable
    public static final SemanticsWrapper getOuterMergingSemantics(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = layoutNode.getOuterLayoutNodeWrapper$ui_release(); outerLayoutNodeWrapper$ui_release != null; outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped$ui_release()) {
            if (outerLayoutNodeWrapper$ui_release instanceof SemanticsWrapper) {
                SemanticsWrapper semanticsWrapper = (SemanticsWrapper) outerLayoutNodeWrapper$ui_release;
                if (semanticsWrapper.getModifier().getSemanticsConfiguration().isMergingSemanticsOfDescendants()) {
                    return semanticsWrapper;
                }
            }
        }
        return null;
    }

    @Nullable
    public static final SemanticsWrapper getOuterSemantics(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        for (LayoutNodeWrapper outerLayoutNodeWrapper$ui_release = layoutNode.getOuterLayoutNodeWrapper$ui_release(); outerLayoutNodeWrapper$ui_release != null; outerLayoutNodeWrapper$ui_release = outerLayoutNodeWrapper$ui_release.getWrapped$ui_release()) {
            if (outerLayoutNodeWrapper$ui_release instanceof SemanticsWrapper) {
                return (SemanticsWrapper) outerLayoutNodeWrapper$ui_release;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Role getRole(SemanticsNode semanticsNode) {
        return (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getRole());
    }

    @Nullable
    public static final SemanticsWrapper nearestSemantics(@NotNull LayoutNodeWrapper layoutNodeWrapper, @NotNull Function1<? super SemanticsWrapper, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        while (layoutNodeWrapper != null) {
            if ((layoutNodeWrapper instanceof SemanticsWrapper) && predicate.invoke(layoutNodeWrapper).booleanValue()) {
                return (SemanticsWrapper) layoutNodeWrapper;
            }
            layoutNodeWrapper = layoutNodeWrapper.getWrapped$ui_release();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int roleFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 1000000000;
    }
}
