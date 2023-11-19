package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class RadioButtonKt$RadioButton$2$1 extends Lambda implements Function1<DrawScope, Unit> {
    public final /* synthetic */ State<Dp> $dotRadius;
    public final /* synthetic */ State<Color> $radioColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioButtonKt$RadioButton$2$1(State<Color> state, State<Dp> state2) {
        super(1);
        this.$radioColor = state;
        this.$dotRadius = state2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DrawScope Canvas) {
        float f2;
        float f3;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        f2 = RadioButtonKt.RadioStrokeWidth;
        float mo277toPx0680j_4 = Canvas.mo277toPx0680j_4(f2);
        long m1402unboximpl = this.$radioColor.getValue().m1402unboximpl();
        f3 = RadioButtonKt.RadioRadius;
        float f4 = mo277toPx0680j_4 / 2;
        DrawScope.DefaultImpls.m1815drawCircleVaOC9Bg$default(Canvas, m1402unboximpl, Canvas.mo277toPx0680j_4(f3) - f4, 0L, 0.0f, new Stroke(mo277toPx0680j_4, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
        if (Dp.m3324compareTo0680j_4(this.$dotRadius.getValue().m3339unboximpl(), Dp.m3325constructorimpl(0)) > 0) {
            DrawScope.DefaultImpls.m1815drawCircleVaOC9Bg$default(Canvas, this.$radioColor.getValue().m1402unboximpl(), Canvas.mo277toPx0680j_4(this.$dotRadius.getValue().m3339unboximpl()) - f4, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
        }
    }
}
