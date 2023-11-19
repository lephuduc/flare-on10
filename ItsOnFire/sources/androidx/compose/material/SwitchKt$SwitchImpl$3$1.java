package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SwitchKt$SwitchImpl$3$1 extends Lambda implements Function1<Density, IntOffset> {
    public final /* synthetic */ State<Float> $thumbValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$3$1(State<Float> state) {
        super(1);
        this.$thumbValue = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
        return IntOffset.m3434boximpl(m981invokeBjo55l4(density));
    }

    /* renamed from: invoke-Bjo55l4  reason: not valid java name */
    public final long m981invokeBjo55l4(@NotNull Density offset) {
        int roundToInt;
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        roundToInt = MathKt__MathJVMKt.roundToInt(this.$thumbValue.getValue().floatValue());
        return IntOffsetKt.IntOffset(roundToInt, 0);
    }
}
