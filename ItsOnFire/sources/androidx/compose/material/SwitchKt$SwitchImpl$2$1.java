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
public final class SwitchKt$SwitchImpl$2$1 extends Lambda implements Function1<DrawScope, Unit> {
    public final /* synthetic */ State<Color> $trackColor$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$2$1(State<Color> state) {
        super(1);
        this.$trackColor$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DrawScope Canvas) {
        long m976SwitchImpl$lambda5;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        m976SwitchImpl$lambda5 = SwitchKt.m976SwitchImpl$lambda5(this.$trackColor$delegate);
        SwitchKt.m980drawTrackRPmYEkk(Canvas, m976SwitchImpl$lambda5, Canvas.mo277toPx0680j_4(SwitchKt.getTrackWidth()), Canvas.mo277toPx0680j_4(SwitchKt.getTrackStrokeWidth()));
    }
}
