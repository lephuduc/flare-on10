package androidx.compose.material;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt__MathJVMKt;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1 extends Lambda implements Function1<Constraints, Constraints> {
    public final /* synthetic */ float $headerHeightPx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1(float f2) {
        super(1);
        this.$headerHeightPx = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
        return Constraints.m3281boximpl(m705invokeZezNO4M(constraints.m3299unboximpl()));
    }

    /* renamed from: invoke-ZezNO4M  reason: not valid java name */
    public final long m705invokeZezNO4M(long j2) {
        int roundToInt;
        long m3284copyZbe2FdA$default = Constraints.m3284copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        roundToInt = MathKt__MathJVMKt.roundToInt(this.$headerHeightPx);
        return ConstraintsKt.m3310offsetNN6EwU$default(m3284copyZbe2FdA$default, 0, -roundToInt, 1, null);
    }
}
