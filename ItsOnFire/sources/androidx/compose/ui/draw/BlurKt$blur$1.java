package androidx.compose.ui.draw;

import androidx.appcompat.R;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffectKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BlurKt$blur$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
    public final /* synthetic */ boolean $clip;
    public final /* synthetic */ Shape $edgeTreatment;
    public final /* synthetic */ float $radiusX;
    public final /* synthetic */ float $radiusY;
    public final /* synthetic */ int $tileMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurKt$blur$1(float f2, float f3, int i2, Shape shape, boolean z) {
        super(1);
        this.$radiusX = f2;
        this.$radiusY = f3;
        this.$tileMode = i2;
        this.$edgeTreatment = shape;
        this.$clip = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        float mo277toPx0680j_4 = graphicsLayer.mo277toPx0680j_4(this.$radiusX);
        float mo277toPx0680j_42 = graphicsLayer.mo277toPx0680j_4(this.$radiusY);
        graphicsLayer.setRenderEffect((mo277toPx0680j_4 <= 0.0f || mo277toPx0680j_42 <= 0.0f) ? null : RenderEffectKt.m1633BlurEffect3YTHUZs(mo277toPx0680j_4, mo277toPx0680j_42, this.$tileMode));
        Shape shape = this.$edgeTreatment;
        if (shape == null) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        graphicsLayer.setShape(shape);
        graphicsLayer.setClip(this.$clip);
    }
}
