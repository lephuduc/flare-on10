package androidx.compose.ui.input.nestedscroll;

import j.u0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj/u0;", "invoke", "()Lj/u0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class NestedScrollDelegatingWrapper$refreshChildrenWithParentConnection$1$2 extends Lambda implements Function0<u0> {
    public final /* synthetic */ NestedScrollDelegatingWrapper $outerChild;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDelegatingWrapper$refreshChildrenWithParentConnection$1$2(NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper) {
        super(0);
        this.$outerChild = nestedScrollDelegatingWrapper;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final u0 invoke() {
        NestedScrollModifier modifier;
        NestedScrollDispatcher dispatcher;
        NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper = this.$outerChild;
        if (nestedScrollDelegatingWrapper == null || (modifier = nestedScrollDelegatingWrapper.getModifier()) == null || (dispatcher = modifier.getDispatcher()) == null) {
            return null;
        }
        return dispatcher.getOriginNestedScrollScope$ui_release();
    }
}
