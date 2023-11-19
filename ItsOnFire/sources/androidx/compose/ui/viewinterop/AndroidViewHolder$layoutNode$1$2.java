package androidx.compose.ui.viewinterop;

import androidx.appcompat.R;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/unit/Density;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidViewHolder$layoutNode$1$2 extends Lambda implements Function1<Density, Unit> {
    public final /* synthetic */ LayoutNode $layoutNode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$2(LayoutNode layoutNode) {
        super(1);
        this.$layoutNode = layoutNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Density density) {
        invoke2(density);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Density it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$layoutNode.setDensity(it);
    }
}
