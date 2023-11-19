package androidx.compose.material;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldKt$drawIndicatorLine$1 extends Lambda implements Function1<DrawScope, Unit> {
    public final /* synthetic */ long $color;
    public final /* synthetic */ float $lineWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldKt$drawIndicatorLine$1(float f2, long j2) {
        super(1);
        this.$lineWidth = f2;
        this.$color = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        float density = this.$lineWidth * drawBehind.getDensity();
        float m1227getHeightimpl = Size.m1227getHeightimpl(drawBehind.mo1780getSizeNHjbRc()) - (density / 2);
        DrawScope.DefaultImpls.m1821drawLineNGM6Ib0$default(drawBehind, this.$color, OffsetKt.Offset(0.0f, m1227getHeightimpl), OffsetKt.Offset(Size.m1230getWidthimpl(drawBehind.mo1780getSizeNHjbRc()), m1227getHeightimpl), density, 0, null, 0.0f, null, 0, 496, null);
    }
}
