package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class CheckboxKt$CheckboxImpl$1$1 extends Lambda implements Function1<DrawScope, Unit> {
    public final /* synthetic */ State<Color> $borderColor$delegate;
    public final /* synthetic */ State<Color> $boxColor$delegate;
    public final /* synthetic */ CheckDrawingCache $checkCache;
    public final /* synthetic */ State<Float> $checkCenterGravitationShiftFraction$delegate;
    public final /* synthetic */ State<Color> $checkColor$delegate;
    public final /* synthetic */ State<Float> $checkDrawFraction$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxKt$CheckboxImpl$1$1(CheckDrawingCache checkDrawingCache, State<Color> state, State<Color> state2, State<Color> state3, State<Float> state4, State<Float> state5) {
        super(1);
        this.$checkCache = checkDrawingCache;
        this.$boxColor$delegate = state;
        this.$borderColor$delegate = state2;
        this.$checkColor$delegate = state3;
        this.$checkDrawFraction$delegate = state4;
        this.$checkCenterGravitationShiftFraction$delegate = state5;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DrawScope Canvas) {
        float f2;
        long m748CheckboxImpl$lambda9;
        long m744CheckboxImpl$lambda10;
        float f3;
        long m747CheckboxImpl$lambda8;
        float m745CheckboxImpl$lambda4;
        float m746CheckboxImpl$lambda6;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        f2 = CheckboxKt.StrokeWidth;
        float floor = (float) Math.floor(Canvas.mo277toPx0680j_4(f2));
        m748CheckboxImpl$lambda9 = CheckboxKt.m748CheckboxImpl$lambda9(this.$boxColor$delegate);
        m744CheckboxImpl$lambda10 = CheckboxKt.m744CheckboxImpl$lambda10(this.$borderColor$delegate);
        f3 = CheckboxKt.RadiusSize;
        CheckboxKt.m756drawBox1wkBAMs(Canvas, m748CheckboxImpl$lambda9, m744CheckboxImpl$lambda10, Canvas.mo277toPx0680j_4(f3), floor);
        m747CheckboxImpl$lambda8 = CheckboxKt.m747CheckboxImpl$lambda8(this.$checkColor$delegate);
        m745CheckboxImpl$lambda4 = CheckboxKt.m745CheckboxImpl$lambda4(this.$checkDrawFraction$delegate);
        m746CheckboxImpl$lambda6 = CheckboxKt.m746CheckboxImpl$lambda6(this.$checkCenterGravitationShiftFraction$delegate);
        CheckboxKt.m757drawCheck3IgeMak(Canvas, m747CheckboxImpl$lambda8, m745CheckboxImpl$lambda4, m746CheckboxImpl$lambda6, floor, this.$checkCache);
    }
}
