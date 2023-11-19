package androidx.compose.animation.core;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector1D;", "it", "Landroidx/compose/ui/unit/Dp;", "invoke-0680j_4", "(F)Landroidx/compose/animation/core/AnimationVector1D;"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class VectorConvertersKt$DpToVector$1 extends Lambda implements Function1<Dp, AnimationVector1D> {
    public static final VectorConvertersKt$DpToVector$1 INSTANCE = new VectorConvertersKt$DpToVector$1();

    public VectorConvertersKt$DpToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ AnimationVector1D invoke(Dp dp) {
        return m141invoke0680j_4(dp.m3339unboximpl());
    }

    @NotNull
    /* renamed from: invoke-0680j_4  reason: not valid java name */
    public final AnimationVector1D m141invoke0680j_4(float f2) {
        return new AnimationVector1D(f2);
    }
}
