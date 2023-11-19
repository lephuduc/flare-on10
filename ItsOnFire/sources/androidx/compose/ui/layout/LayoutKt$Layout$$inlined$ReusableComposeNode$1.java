package androidx.compose.ui.layout;

import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
/* loaded from: classes.dex */
public final class LayoutKt$Layout$$inlined$ReusableComposeNode$1 extends Lambda implements Function0<ComposeUiNode> {
    public final /* synthetic */ Function0 $factory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutKt$Layout$$inlined$ReusableComposeNode$1(Function0 function0) {
        super(0);
        this.$factory = function0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ComposeUiNode invoke() {
        return this.$factory.invoke();
    }
}
