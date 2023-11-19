package androidx.compose.animation.core;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "it", "Landroidx/compose/animation/core/AnimationVector2D;", "invoke-Bjo55l4", "(Landroidx/compose/animation/core/AnimationVector2D;)J"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class VectorConvertersKt$IntOffsetToVector$2 extends Lambda implements Function1<AnimationVector2D, IntOffset> {
    public static final VectorConvertersKt$IntOffsetToVector$2 INSTANCE = new VectorConvertersKt$IntOffsetToVector$2();

    public VectorConvertersKt$IntOffsetToVector$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IntOffset invoke(AnimationVector2D animationVector2D) {
        return IntOffset.m3434boximpl(m144invokeBjo55l4(animationVector2D));
    }

    /* renamed from: invoke-Bjo55l4  reason: not valid java name */
    public final long m144invokeBjo55l4(@NotNull AnimationVector2D it) {
        int roundToInt;
        int roundToInt2;
        Intrinsics.checkNotNullParameter(it, "it");
        roundToInt = MathKt__MathJVMKt.roundToInt(it.getV1());
        roundToInt2 = MathKt__MathJVMKt.roundToInt(it.getV2());
        return IntOffsetKt.IntOffset(roundToInt, roundToInt2);
    }
}
