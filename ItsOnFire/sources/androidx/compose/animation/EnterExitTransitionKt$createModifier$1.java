package androidx.compose.animation;

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
public final class EnterExitTransitionKt$createModifier$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
    public final /* synthetic */ State<Float> $alpha$delegate;
    public final /* synthetic */ State<Float> $scale$delegate;
    public final /* synthetic */ State<TransformOrigin> $transformOrigin$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createModifier$1(State<Float> state, State<Float> state2, State<TransformOrigin> state3) {
        super(1);
        this.$alpha$delegate = state;
        this.$scale$delegate = state2;
        this.$transformOrigin$delegate = state3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
        float m50createModifier$lambda8;
        float m45createModifier$lambda11;
        float m45createModifier$lambda112;
        long m46createModifier$lambda13;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        m50createModifier$lambda8 = EnterExitTransitionKt.m50createModifier$lambda8(this.$alpha$delegate);
        graphicsLayer.setAlpha(m50createModifier$lambda8);
        m45createModifier$lambda11 = EnterExitTransitionKt.m45createModifier$lambda11(this.$scale$delegate);
        graphicsLayer.setScaleX(m45createModifier$lambda11);
        m45createModifier$lambda112 = EnterExitTransitionKt.m45createModifier$lambda11(this.$scale$delegate);
        graphicsLayer.setScaleY(m45createModifier$lambda112);
        m46createModifier$lambda13 = EnterExitTransitionKt.m46createModifier$lambda13(this.$transformOrigin$delegate);
        graphicsLayer.mo1531setTransformOrigin__ExYCQ(m46createModifier$lambda13);
    }
}
