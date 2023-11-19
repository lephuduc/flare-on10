package androidx.compose.ui.graphics;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* renamed from: androidx.compose.ui.graphics.GraphicsLayerModifierKt$graphicsLayer-2Xn7asI$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* loaded from: classes.dex */
public final class GraphicsLayerModifierKt$graphicsLayer2Xn7asI$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    public final /* synthetic */ float $alpha$inlined;
    public final /* synthetic */ float $cameraDistance$inlined;
    public final /* synthetic */ boolean $clip$inlined;
    public final /* synthetic */ RenderEffect $renderEffect$inlined;
    public final /* synthetic */ float $rotationX$inlined;
    public final /* synthetic */ float $rotationY$inlined;
    public final /* synthetic */ float $rotationZ$inlined;
    public final /* synthetic */ float $scaleX$inlined;
    public final /* synthetic */ float $scaleY$inlined;
    public final /* synthetic */ float $shadowElevation$inlined;
    public final /* synthetic */ Shape $shape$inlined;
    public final /* synthetic */ long $transformOrigin$inlined;
    public final /* synthetic */ float $translationX$inlined;
    public final /* synthetic */ float $translationY$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphicsLayerModifierKt$graphicsLayer2Xn7asI$$inlined$debugInspectorInfo$1(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, long j2, Shape shape, boolean z, RenderEffect renderEffect) {
        super(1);
        this.$scaleX$inlined = f2;
        this.$scaleY$inlined = f3;
        this.$alpha$inlined = f4;
        this.$translationX$inlined = f5;
        this.$translationY$inlined = f6;
        this.$shadowElevation$inlined = f7;
        this.$rotationX$inlined = f8;
        this.$rotationY$inlined = f9;
        this.$rotationZ$inlined = f10;
        this.$cameraDistance$inlined = f11;
        this.$transformOrigin$inlined = j2;
        this.$shape$inlined = shape;
        this.$clip$inlined = z;
        this.$renderEffect$inlined = renderEffect;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("scaleX", Float.valueOf(this.$scaleX$inlined));
        inspectorInfo.getProperties().set("scaleY", Float.valueOf(this.$scaleY$inlined));
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.$alpha$inlined));
        inspectorInfo.getProperties().set("translationX", Float.valueOf(this.$translationX$inlined));
        inspectorInfo.getProperties().set("translationY", Float.valueOf(this.$translationY$inlined));
        inspectorInfo.getProperties().set("shadowElevation", Float.valueOf(this.$shadowElevation$inlined));
        inspectorInfo.getProperties().set("rotationX", Float.valueOf(this.$rotationX$inlined));
        inspectorInfo.getProperties().set("rotationY", Float.valueOf(this.$rotationY$inlined));
        inspectorInfo.getProperties().set("rotationZ", Float.valueOf(this.$rotationZ$inlined));
        inspectorInfo.getProperties().set("cameraDistance", Float.valueOf(this.$cameraDistance$inlined));
        inspectorInfo.getProperties().set("transformOrigin", TransformOrigin.m1694boximpl(this.$transformOrigin$inlined));
        inspectorInfo.getProperties().set("shape", this.$shape$inlined);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.$clip$inlined));
        inspectorInfo.getProperties().set("renderEffect", this.$renderEffect$inlined);
    }
}
