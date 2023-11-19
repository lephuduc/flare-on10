package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SimpleGraphicsLayerModifier$layerBlock$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
    public final /* synthetic */ SimpleGraphicsLayerModifier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleGraphicsLayerModifier$layerBlock$1(SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
        super(1);
        this.this$0 = simpleGraphicsLayerModifier;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull GraphicsLayerScope graphicsLayerScope) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        long j2;
        Shape shape;
        boolean z;
        RenderEffect renderEffect;
        Intrinsics.checkNotNullParameter(graphicsLayerScope, "$this$null");
        f2 = this.this$0.scaleX;
        graphicsLayerScope.setScaleX(f2);
        f3 = this.this$0.scaleY;
        graphicsLayerScope.setScaleY(f3);
        f4 = this.this$0.alpha;
        graphicsLayerScope.setAlpha(f4);
        f5 = this.this$0.translationX;
        graphicsLayerScope.setTranslationX(f5);
        f6 = this.this$0.translationY;
        graphicsLayerScope.setTranslationY(f6);
        f7 = this.this$0.shadowElevation;
        graphicsLayerScope.setShadowElevation(f7);
        f8 = this.this$0.rotationX;
        graphicsLayerScope.setRotationX(f8);
        f9 = this.this$0.rotationY;
        graphicsLayerScope.setRotationY(f9);
        f10 = this.this$0.rotationZ;
        graphicsLayerScope.setRotationZ(f10);
        f11 = this.this$0.cameraDistance;
        graphicsLayerScope.setCameraDistance(f11);
        j2 = this.this$0.transformOrigin;
        graphicsLayerScope.mo1531setTransformOrigin__ExYCQ(j2);
        shape = this.this$0.shape;
        graphicsLayerScope.setShape(shape);
        z = this.this$0.clip;
        graphicsLayerScope.setClip(z);
        renderEffect = this.this$0.renderEffect;
        graphicsLayerScope.setRenderEffect(renderEffect);
    }
}
