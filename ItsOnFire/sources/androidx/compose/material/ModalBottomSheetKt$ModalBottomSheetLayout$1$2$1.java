package androidx.compose.material;

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
public final class ModalBottomSheetKt$ModalBottomSheetLayout$1$2$1 extends Lambda implements Function1<Density, IntOffset> {
    public final /* synthetic */ float $fullHeight;
    public final /* synthetic */ ModalBottomSheetState $sheetState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheetLayout$1$2$1(ModalBottomSheetState modalBottomSheetState, float f2) {
        super(1);
        this.$sheetState = modalBottomSheetState;
        this.$fullHeight = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
        return IntOffset.m3434boximpl(m885invokeBjo55l4(density));
    }

    /* renamed from: invoke-Bjo55l4  reason: not valid java name */
    public final long m885invokeBjo55l4(@NotNull Density offset) {
        int roundToInt;
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        roundToInt = MathKt__MathJVMKt.roundToInt(this.$sheetState.getAnchors$material_release().isEmpty() ? this.$fullHeight : this.$sheetState.getOffset().getValue().floatValue());
        return IntOffsetKt.IntOffset(0, roundToInt);
    }
}
