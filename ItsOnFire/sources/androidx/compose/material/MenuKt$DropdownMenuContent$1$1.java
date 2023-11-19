package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class MenuKt$DropdownMenuContent$1$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
    public final /* synthetic */ State<Float> $alpha$delegate;
    public final /* synthetic */ State<Float> $scale$delegate;
    public final /* synthetic */ MutableState<TransformOrigin> $transformOriginState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuContent$1$1(MutableState<TransformOrigin> mutableState, State<Float> state, State<Float> state2) {
        super(1);
        this.$transformOriginState = mutableState;
        this.$scale$delegate = state;
        this.$alpha$delegate = state2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
        float m874DropdownMenuContent$lambda1;
        float m874DropdownMenuContent$lambda12;
        float m875DropdownMenuContent$lambda3;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        m874DropdownMenuContent$lambda1 = MenuKt.m874DropdownMenuContent$lambda1(this.$scale$delegate);
        graphicsLayer.setScaleX(m874DropdownMenuContent$lambda1);
        m874DropdownMenuContent$lambda12 = MenuKt.m874DropdownMenuContent$lambda1(this.$scale$delegate);
        graphicsLayer.setScaleY(m874DropdownMenuContent$lambda12);
        m875DropdownMenuContent$lambda3 = MenuKt.m875DropdownMenuContent$lambda3(this.$alpha$delegate);
        graphicsLayer.setAlpha(m875DropdownMenuContent$lambda3);
        graphicsLayer.mo1531setTransformOrigin__ExYCQ(this.$transformOriginState.getValue().m1706unboximpl());
    }
}
