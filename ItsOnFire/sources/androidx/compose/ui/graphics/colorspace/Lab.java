package androidx.compose.ui.graphics.colorspace;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", "v", "getMaxValue", "", "component", "getMinValue", "toXyz", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class Lab extends ColorSpace {
    private static final float A = 0.008856452f;
    private static final float B = 7.787037f;
    private static final float C = 0.13793103f;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final float D = 0.20689656f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab$Companion;", "", "()V", "A", "", "B", "C", "D", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lab(@NotNull String name, int i2) {
        super(name, ColorModel.Companion.m1729getLabxdoWZVw(), i2, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] v2) {
        float coerceIn;
        float coerceIn2;
        float coerceIn3;
        Intrinsics.checkNotNullParameter(v2, "v");
        float f2 = v2[0];
        Illuminant illuminant = Illuminant.INSTANCE;
        float f3 = f2 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f4 = v2[1] / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f5 = v2[2] / illuminant.getD50Xyz$ui_graphics_release()[2];
        float pow = f3 > A ? (float) Math.pow(f3, 0.33333334f) : (f3 * B) + C;
        float pow2 = f4 > A ? (float) Math.pow(f4, 0.33333334f) : (f4 * B) + C;
        float pow3 = f5 > A ? (float) Math.pow(f5, 0.33333334f) : (f5 * B) + C;
        coerceIn = RangesKt___RangesKt.coerceIn((116.0f * pow2) - 16.0f, 0.0f, 100.0f);
        v2[0] = coerceIn;
        coerceIn2 = RangesKt___RangesKt.coerceIn((pow - pow2) * 500.0f, -128.0f, 128.0f);
        v2[1] = coerceIn2;
        coerceIn3 = RangesKt___RangesKt.coerceIn((pow2 - pow3) * 200.0f, -128.0f, 128.0f);
        v2[2] = coerceIn3;
        return v2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i2) {
        return i2 == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i2) {
        return i2 == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] v2) {
        float coerceIn;
        float coerceIn2;
        float coerceIn3;
        Intrinsics.checkNotNullParameter(v2, "v");
        coerceIn = RangesKt___RangesKt.coerceIn(v2[0], 0.0f, 100.0f);
        v2[0] = coerceIn;
        coerceIn2 = RangesKt___RangesKt.coerceIn(v2[1], -128.0f, 128.0f);
        v2[1] = coerceIn2;
        coerceIn3 = RangesKt___RangesKt.coerceIn(v2[2], -128.0f, 128.0f);
        v2[2] = coerceIn3;
        float f2 = (v2[0] + 16.0f) / 116.0f;
        float f3 = (v2[1] * 0.002f) + f2;
        float f4 = f2 - (coerceIn3 * 0.005f);
        float f5 = f3 > D ? f3 * f3 * f3 : (f3 - C) * 0.12841855f;
        float f6 = f2 > D ? f2 * f2 * f2 : (f2 - C) * 0.12841855f;
        float f7 = f4 > D ? f4 * f4 * f4 : (f4 - C) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        v2[0] = f5 * illuminant.getD50Xyz$ui_graphics_release()[0];
        v2[1] = f6 * illuminant.getD50Xyz$ui_graphics_release()[1];
        v2[2] = f7 * illuminant.getD50Xyz$ui_graphics_release()[2];
        return v2;
    }
}
