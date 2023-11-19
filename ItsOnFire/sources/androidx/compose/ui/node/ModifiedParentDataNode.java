package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.ui.layout.ParentDataModifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/ModifiedParentDataNode;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/layout/ParentDataModifier;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "parentDataModifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/layout/ParentDataModifier;)V", "parentData", "", "getParentData", "()Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ModifiedParentDataNode extends DelegatingLayoutNodeWrapper<ParentDataModifier> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifiedParentDataNode(@NotNull LayoutNodeWrapper wrapped, @NotNull ParentDataModifier parentDataModifier) {
        super(wrapped, parentDataModifier);
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        Intrinsics.checkNotNullParameter(parentDataModifier, "parentDataModifier");
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        return getModifier().modifyParentData(getLayoutNode$ui_release().getMeasureScope$ui_release(), getWrapped$ui_release().getParentData());
    }
}
