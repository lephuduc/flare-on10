package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TestModifierUpdaterKt$TestModifierUpdaterLayout$$inlined$ComposeNode$1 extends Lambda implements Function0<LayoutNode> {
    public final /* synthetic */ Function0 $factory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestModifierUpdaterKt$TestModifierUpdaterLayout$$inlined$ComposeNode$1(Function0 function0) {
        super(0);
        this.$factory = function0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final LayoutNode invoke() {
        return this.$factory.invoke();
    }
}
