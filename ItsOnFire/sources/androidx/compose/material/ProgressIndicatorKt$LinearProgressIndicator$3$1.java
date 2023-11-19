package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$LinearProgressIndicator$3$1 extends Lambda implements Function1<DrawScope, Unit> {
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ long $color;
    public final /* synthetic */ State<Float> $firstLineHead$delegate;
    public final /* synthetic */ State<Float> $firstLineTail$delegate;
    public final /* synthetic */ State<Float> $secondLineHead$delegate;
    public final /* synthetic */ State<Float> $secondLineTail$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$LinearProgressIndicator$3$1(long j2, long j3, State<Float> state, State<Float> state2, State<Float> state3, State<Float> state4) {
        super(1);
        this.$backgroundColor = j2;
        this.$color = j3;
        this.$firstLineHead$delegate = state;
        this.$firstLineTail$delegate = state2;
        this.$secondLineHead$delegate = state3;
        this.$secondLineTail$delegate = state4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DrawScope Canvas) {
        float m920LinearProgressIndicator_RIQooxk$lambda1;
        float m921LinearProgressIndicator_RIQooxk$lambda2;
        float m922LinearProgressIndicator_RIQooxk$lambda3;
        float m923LinearProgressIndicator_RIQooxk$lambda4;
        float m922LinearProgressIndicator_RIQooxk$lambda32;
        float m923LinearProgressIndicator_RIQooxk$lambda42;
        float m920LinearProgressIndicator_RIQooxk$lambda12;
        float m921LinearProgressIndicator_RIQooxk$lambda22;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float m1227getHeightimpl = Size.m1227getHeightimpl(Canvas.mo1780getSizeNHjbRc());
        ProgressIndicatorKt.m940drawLinearIndicatorBackgroundbw27NRU(Canvas, this.$backgroundColor, m1227getHeightimpl);
        m920LinearProgressIndicator_RIQooxk$lambda1 = ProgressIndicatorKt.m920LinearProgressIndicator_RIQooxk$lambda1(this.$firstLineHead$delegate);
        m921LinearProgressIndicator_RIQooxk$lambda2 = ProgressIndicatorKt.m921LinearProgressIndicator_RIQooxk$lambda2(this.$firstLineTail$delegate);
        if (m920LinearProgressIndicator_RIQooxk$lambda1 - m921LinearProgressIndicator_RIQooxk$lambda2 > 0.0f) {
            m920LinearProgressIndicator_RIQooxk$lambda12 = ProgressIndicatorKt.m920LinearProgressIndicator_RIQooxk$lambda1(this.$firstLineHead$delegate);
            m921LinearProgressIndicator_RIQooxk$lambda22 = ProgressIndicatorKt.m921LinearProgressIndicator_RIQooxk$lambda2(this.$firstLineTail$delegate);
            ProgressIndicatorKt.m939drawLinearIndicator42QJj7c(Canvas, m920LinearProgressIndicator_RIQooxk$lambda12, m921LinearProgressIndicator_RIQooxk$lambda22, this.$color, m1227getHeightimpl);
        }
        m922LinearProgressIndicator_RIQooxk$lambda3 = ProgressIndicatorKt.m922LinearProgressIndicator_RIQooxk$lambda3(this.$secondLineHead$delegate);
        m923LinearProgressIndicator_RIQooxk$lambda4 = ProgressIndicatorKt.m923LinearProgressIndicator_RIQooxk$lambda4(this.$secondLineTail$delegate);
        if (m922LinearProgressIndicator_RIQooxk$lambda3 - m923LinearProgressIndicator_RIQooxk$lambda4 > 0.0f) {
            m922LinearProgressIndicator_RIQooxk$lambda32 = ProgressIndicatorKt.m922LinearProgressIndicator_RIQooxk$lambda3(this.$secondLineHead$delegate);
            m923LinearProgressIndicator_RIQooxk$lambda42 = ProgressIndicatorKt.m923LinearProgressIndicator_RIQooxk$lambda4(this.$secondLineTail$delegate);
            ProgressIndicatorKt.m939drawLinearIndicator42QJj7c(Canvas, m922LinearProgressIndicator_RIQooxk$lambda32, m923LinearProgressIndicator_RIQooxk$lambda42, this.$color, m1227getHeightimpl);
        }
    }
}
