package androidx.core.content.res;

import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
final class CamUtils {
    public static final float[][] XYZ_TO_CAM16RGB = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] CAM16RGB_TO_XYZ = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] WHITE_POINT_D65 = {95.047f, 100.0f, 108.883f};
    public static final float[][] SRGB_TO_XYZ = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    private CamUtils() {
    }

    public static int intFromLStar(float f2) {
        if (f2 < 1.0f) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = (f2 > 8.0f ? 1 : (f2 == 8.0f ? 0 : -1)) > 0 ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = WHITE_POINT_D65;
        return ColorUtils.XYZToColor(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static float lStarFromInt(int i2) {
        return lStarFromY(yFromInt(i2));
    }

    public static float lStarFromY(float f2) {
        float f3 = f2 / 100.0f;
        return f3 <= 0.008856452f ? f3 * 903.2963f : (((float) Math.cbrt(f3)) * 116.0f) - 16.0f;
    }

    public static float lerp(float f2, float f3, float f4) {
        return f2 + ((f3 - f2) * f4);
    }

    public static float linearized(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    @NonNull
    public static float[] xyzFromInt(int i2) {
        float linearized = linearized(Color.red(i2));
        float linearized2 = linearized(Color.green(i2));
        float linearized3 = linearized(Color.blue(i2));
        float[][] fArr = SRGB_TO_XYZ;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[0] * linearized) + (fArr2[1] * linearized2) + (fArr2[2] * linearized3);
        float[] fArr3 = fArr[1];
        float f3 = (fArr3[0] * linearized) + (fArr3[1] * linearized2) + (fArr3[2] * linearized3);
        float[] fArr4 = fArr[2];
        return new float[]{f2, f3, (linearized * fArr4[0]) + (linearized2 * fArr4[1]) + (linearized3 * fArr4[2])};
    }

    public static float yFromInt(int i2) {
        float linearized = linearized(Color.red(i2));
        float linearized2 = linearized(Color.green(i2));
        float linearized3 = linearized(Color.blue(i2));
        float[] fArr = SRGB_TO_XYZ[1];
        return (linearized * fArr[0]) + (linearized2 * fArr[1]) + (linearized3 * fArr[2]);
    }

    public static float yFromLStar(float f2) {
        return (f2 > 8.0f ? (float) Math.pow((f2 + 16.0d) / 116.0d, 3.0d) : f2 / 903.2963f) * 100.0f;
    }
}
