package androidx.compose.ui.graphics.vector;

import androidx.appcompat.R;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class VectorPainterKt$rememberVectorPainter$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ VectorPainter $painter;
    public final /* synthetic */ int $tintBlendMode;
    public final /* synthetic */ long $tintColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainterKt$rememberVectorPainter$1(VectorPainter vectorPainter, long j2, int i2) {
        super(0);
        this.$painter = vectorPainter;
        this.$tintColor = j2;
        this.$tintBlendMode = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$painter.setIntrinsicColorFilter$ui_release(!Color.m1393equalsimpl0(this.$tintColor, Color.Companion.m1428getUnspecified0d7_KjU()) ? ColorFilter.Companion.m1436tintxETnrds(this.$tintColor, this.$tintBlendMode) : null);
    }
}
