package androidx.compose.ui.semantics;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/node/LayoutNode;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class NodeLocationHolder$compareTo$child1$1 extends Lambda implements Function1<LayoutNode, Boolean> {
    public final /* synthetic */ Rect $view1Bounds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeLocationHolder$compareTo$child1$1(Rect rect) {
        super(1);
        this.$view1Bounds = rect;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull LayoutNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LayoutNodeWrapper findWrapperToGetBounds = SemanticsSortKt.findWrapperToGetBounds(it);
        return Boolean.valueOf(findWrapperToGetBounds.isAttached() && !Intrinsics.areEqual(this.$view1Bounds, LayoutCoordinatesKt.boundsInRoot(findWrapperToGetBounds)));
    }
}
