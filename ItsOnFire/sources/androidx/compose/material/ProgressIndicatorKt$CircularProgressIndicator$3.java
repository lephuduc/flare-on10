package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$CircularProgressIndicator$3 extends Lambda implements Function1<DrawScope, Unit> {
    public final /* synthetic */ State<Float> $baseRotation$delegate;
    public final /* synthetic */ long $color;
    public final /* synthetic */ State<Integer> $currentRotation$delegate;
    public final /* synthetic */ State<Float> $endAngle$delegate;
    public final /* synthetic */ State<Float> $startAngle$delegate;
    public final /* synthetic */ Stroke $stroke;
    public final /* synthetic */ float $strokeWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$3(float f2, long j2, Stroke stroke, State<Integer> state, State<Float> state2, State<Float> state3, State<Float> state4) {
        super(1);
        this.$strokeWidth = f2;
        this.$color = j2;
        this.$stroke = stroke;
        this.$currentRotation$delegate = state;
        this.$endAngle$delegate = state2;
        this.$startAngle$delegate = state3;
        this.$baseRotation$delegate = state4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DrawScope Canvas) {
        int m916CircularProgressIndicator_aM_cp0Q$lambda8;
        float m914CircularProgressIndicator_aM_cp0Q$lambda10;
        float m915CircularProgressIndicator_aM_cp0Q$lambda11;
        float m917CircularProgressIndicator_aM_cp0Q$lambda9;
        float m915CircularProgressIndicator_aM_cp0Q$lambda112;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        m916CircularProgressIndicator_aM_cp0Q$lambda8 = ProgressIndicatorKt.m916CircularProgressIndicator_aM_cp0Q$lambda8(this.$currentRotation$delegate);
        m914CircularProgressIndicator_aM_cp0Q$lambda10 = ProgressIndicatorKt.m914CircularProgressIndicator_aM_cp0Q$lambda10(this.$endAngle$delegate);
        m915CircularProgressIndicator_aM_cp0Q$lambda11 = ProgressIndicatorKt.m915CircularProgressIndicator_aM_cp0Q$lambda11(this.$startAngle$delegate);
        float abs = Math.abs(m914CircularProgressIndicator_aM_cp0Q$lambda10 - m915CircularProgressIndicator_aM_cp0Q$lambda11);
        m917CircularProgressIndicator_aM_cp0Q$lambda9 = ProgressIndicatorKt.m917CircularProgressIndicator_aM_cp0Q$lambda9(this.$baseRotation$delegate);
        float f2 = (((m916CircularProgressIndicator_aM_cp0Q$lambda8 * 216.0f) % 360.0f) - 90.0f) + m917CircularProgressIndicator_aM_cp0Q$lambda9;
        m915CircularProgressIndicator_aM_cp0Q$lambda112 = ProgressIndicatorKt.m915CircularProgressIndicator_aM_cp0Q$lambda11(this.$startAngle$delegate);
        ProgressIndicatorKt.m938drawIndeterminateCircularIndicatorhrjfTZI(Canvas, m915CircularProgressIndicator_aM_cp0Q$lambda112 + f2, this.$strokeWidth, abs, this.$color, this.$stroke);
    }
}
