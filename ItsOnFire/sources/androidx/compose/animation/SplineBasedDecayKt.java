package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u000e\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"EndTension", "", "Inflection", "P1", "P2", "StartTension", "computeSplineInfo", "", "splinePositions", "", "splineTimes", "nbSamples", "", "splineBasedDecay", "Landroidx/compose/animation/core/DecayAnimationSpec;", "T", "density", "Landroidx/compose/ui/unit/Density;", "animation_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SplineBasedDecayKt {
    private static final float EndTension = 1.0f;
    private static final float Inflection = 0.35f;
    private static final float P1 = 0.175f;
    private static final float P2 = 0.35000002f;
    private static final float StartTension = 0.5f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void computeSplineInfo(float[] fArr, float[] fArr2, int i2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        int i3;
        float f11 = 0.0f;
        int i4 = 0;
        float f12 = 0.0f;
        while (true) {
            float f13 = 1.0f;
            if (i4 >= i2) {
                fArr2[i2] = 1.0f;
                fArr[i2] = 1.0f;
                return;
            }
            int i5 = i4 + 1;
            float f14 = i4 / i2;
            float f15 = 1.0f;
            while (true) {
                f2 = 2.0f;
                f3 = ((f15 - f11) / 2.0f) + f11;
                f4 = f13 - f3;
                f5 = f3 * 3.0f * f4;
                f6 = f3 * f3 * f3;
                float f16 = (((f4 * P1) + (f3 * P2)) * f5) + f6;
                if (Math.abs(f16 - f14) < 1.0E-5d) {
                    break;
                }
                int i6 = i5;
                if (f16 > f14) {
                    f15 = f3;
                } else {
                    f11 = f3;
                }
                i5 = i6;
                f13 = 1.0f;
            }
            fArr[i4] = (f5 * ((f4 * 0.5f) + f3)) + f6;
            float f17 = f13;
            while (true) {
                f7 = ((f17 - f12) / f2) + f12;
                f8 = f13 - f7;
                f9 = f7 * 3.0f * f8;
                f10 = f7 * f7 * f7;
                float f18 = (((f8 * 0.5f) + f7) * f9) + f10;
                i3 = i5;
                if (Math.abs(f18 - f14) < 1.0E-5d) {
                    break;
                }
                if (f18 > f14) {
                    f17 = f7;
                } else {
                    f12 = f7;
                }
                i5 = i3;
                f13 = 1.0f;
                f2 = 2.0f;
            }
            fArr2[i4] = (f9 * ((f8 * P1) + (f7 * P2))) + f10;
            i4 = i3;
        }
    }

    @NotNull
    public static final <T> DecayAnimationSpec<T> splineBasedDecay(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return DecayAnimationSpecKt.generateDecayAnimationSpec(new SplineBasedFloatDecayAnimationSpec(density));
    }
}
