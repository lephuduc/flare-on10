package androidx.compose.ui.platform;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"invertTo", "", "Landroidx/compose/ui/graphics/Matrix;", "other", "invertTo-JiSxe2E", "([F[F)Z", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class InvertMatrixKt {
    /* renamed from: invertTo-JiSxe2E  reason: not valid java name */
    public static final boolean m2941invertToJiSxe2E(@NotNull float[] invertTo, @NotNull float[] other) {
        Intrinsics.checkNotNullParameter(invertTo, "$this$invertTo");
        Intrinsics.checkNotNullParameter(other, "other");
        float f2 = invertTo[0];
        float f3 = invertTo[1];
        float f4 = invertTo[2];
        float f5 = invertTo[3];
        float f6 = invertTo[4];
        float f7 = invertTo[5];
        float f8 = invertTo[6];
        float f9 = invertTo[7];
        float f10 = invertTo[8];
        float f11 = invertTo[9];
        float f12 = invertTo[10];
        float f13 = invertTo[11];
        float f14 = invertTo[12];
        float f15 = invertTo[13];
        float f16 = invertTo[14];
        float f17 = invertTo[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (((((f18 * f29) - (f19 * f28)) + (f20 * f27)) + (f21 * f26)) - (f22 * f25)) + (f23 * f24);
        if (f30 == 0.0f) {
            return false;
        }
        float f31 = 1.0f / f30;
        other[0] = (((f7 * f29) - (f8 * f28)) + (f9 * f27)) * f31;
        other[1] = ((((-f3) * f29) + (f4 * f28)) - (f5 * f27)) * f31;
        other[2] = (((f15 * f23) - (f16 * f22)) + (f17 * f21)) * f31;
        other[3] = ((((-f11) * f23) + (f12 * f22)) - (f13 * f21)) * f31;
        float f32 = -f6;
        other[4] = (((f32 * f29) + (f8 * f26)) - (f9 * f25)) * f31;
        other[5] = (((f29 * f2) - (f4 * f26)) + (f5 * f25)) * f31;
        float f33 = -f14;
        other[6] = (((f33 * f23) + (f16 * f20)) - (f17 * f19)) * f31;
        other[7] = (((f23 * f10) - (f12 * f20)) + (f13 * f19)) * f31;
        other[8] = (((f6 * f28) - (f7 * f26)) + (f9 * f24)) * f31;
        other[9] = ((((-f2) * f28) + (f26 * f3)) - (f5 * f24)) * f31;
        other[10] = (((f14 * f22) - (f15 * f20)) + (f17 * f18)) * f31;
        other[11] = ((((-f10) * f22) + (f20 * f11)) - (f13 * f18)) * f31;
        other[12] = (((f32 * f27) + (f7 * f25)) - (f8 * f24)) * f31;
        other[13] = (((f2 * f27) - (f3 * f25)) + (f4 * f24)) * f31;
        other[14] = (((f33 * f21) + (f15 * f19)) - (f16 * f18)) * f31;
        other[15] = (((f10 * f21) - (f11 * f19)) + (f12 * f18)) * f31;
        return true;
    }
}
