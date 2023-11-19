package androidx.compose.ui.node;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a(\u0010\u0006\u001a\u0002H\u0007\"\f\b\u0000\u0010\u0007*\u0006\u0012\u0002\b\u00030\b*\u0002H\u00072\u0006\u0010\t\u001a\u00020\nH\u0082\b¢\u0006\u0002\u0010\u000b\u001a \u0010\f\u001a\u0002H\u0007\"\f\b\u0000\u0010\u0007*\u0006\u0012\u0002\b\u00030\b*\u0002H\u0007H\u0082\b¢\u0006\u0002\u0010\r\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"DebugChanges", "", "add", "", "Landroidx/compose/ui/node/LayoutNode;", "child", "assignChained", "T", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "originalWrapper", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "(Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;Landroidx/compose/ui/node/LayoutNodeWrapper;)Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "initialize", "(Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;)Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "requireOwner", "Landroidx/compose/ui/node/Owner;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LayoutNodeKt {
    private static final boolean DebugChanges = false;

    public static final void add(@NotNull LayoutNode layoutNode, @NotNull LayoutNode child) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        layoutNode.insertAt$ui_release(layoutNode.getChildren$ui_release().size(), child);
    }

    private static final <T extends DelegatingLayoutNodeWrapper<?>> T assignChained(T t2, LayoutNodeWrapper layoutNodeWrapper) {
        if (layoutNodeWrapper != t2.getWrapped$ui_release()) {
            ((DelegatingLayoutNodeWrapper) t2.getWrapped$ui_release()).setChained(true);
        }
        return t2;
    }

    private static final <T extends DelegatingLayoutNodeWrapper<?>> T initialize(T t2) {
        t2.onInitialize();
        return t2;
    }

    @NotNull
    public static final Owner requireOwner(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        Owner owner$ui_release = layoutNode.getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }
}
