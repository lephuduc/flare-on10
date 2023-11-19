package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LayoutNodeWrapper$updateLayerParameters$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ Function1<GraphicsLayerScope, Unit> $layerBlock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNodeWrapper$updateLayerParameters$1(Function1<? super GraphicsLayerScope, Unit> function1) {
        super(0);
        this.$layerBlock = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ReusableGraphicsLayerScope reusableGraphicsLayerScope;
        Function1<GraphicsLayerScope, Unit> function1 = this.$layerBlock;
        reusableGraphicsLayerScope = LayoutNodeWrapper.graphicsLayerScope;
        function1.invoke(reusableGraphicsLayerScope);
    }
}
