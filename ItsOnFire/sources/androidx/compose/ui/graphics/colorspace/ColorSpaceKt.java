package androidx.compose.ui.graphics.colorspace;

import androidx.appcompat.R;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.Connector;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a8\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0000\u001a\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0000\u001a\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0000\u001a8\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001aH\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a8\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001aH\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u001e\u0010\u001d\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020!H\u0007\u001a+\u0010\"\u001a\u00020#*\u00020\u001e2\b\b\u0002\u0010$\u001a\u00020\u001e2\b\b\u0002\u0010%\u001a\u00020&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"absRcpResponse", "", "x", "a", "b", "c", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "g", "absResponse", "chromaticAdaptation", "", "matrix", "srcWhitePoint", "dstWhitePoint", "compare", "", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "inverse3x3", "m", "mul3x3", "lhs", "rhs", "mul3x3Diag", "mul3x3Float3", "rcpResponse", "e", "f", "response", "adapt", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "whitePoint", "adaptation", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "connect", "Landroidx/compose/ui/graphics/colorspace/Connector;", FirebaseAnalytics.Param.DESTINATION, "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "connect-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)Landroidx/compose/ui/graphics/colorspace/Connector;", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ColorSpaceKt {
    public static final double absRcpResponse(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Math.copySign(rcpResponse(d2 < 0.0d ? -d2 : d2, d3, d4, d5, d6, d7), d2);
    }

    public static final double absResponse(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Math.copySign(response(d2 < 0.0d ? -d2 : d2, d3, d4, d5, d6, d7), d2);
    }

    @JvmOverloads
    @NotNull
    public static final ColorSpace adapt(@NotNull ColorSpace colorSpace, @NotNull WhitePoint whitePoint) {
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        return adapt$default(colorSpace, whitePoint, null, 2, null);
    }

    @JvmOverloads
    @NotNull
    public static final ColorSpace adapt(@NotNull ColorSpace colorSpace, @NotNull WhitePoint whitePoint, @NotNull Adaptation adaptation) {
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(adaptation, "adaptation");
        if (ColorModel.m1723equalsimpl0(colorSpace.m1732getModelxdoWZVw(), ColorModel.Companion.m1730getRgbxdoWZVw())) {
            Rgb rgb = (Rgb) colorSpace;
            if (compare(rgb.getWhitePoint(), whitePoint)) {
                return colorSpace;
            }
            return new Rgb(rgb, mul3x3(chromaticAdaptation(adaptation.getTransform$ui_graphics_release(), rgb.getWhitePoint().toXyz$ui_graphics_release(), whitePoint.toXyz$ui_graphics_release()), rgb.getTransform$ui_graphics_release()), whitePoint);
        }
        return colorSpace;
    }

    public static /* synthetic */ ColorSpace adapt$default(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            adaptation = Adaptation.Companion.getBradford();
        }
        return adapt(colorSpace, whitePoint, adaptation);
    }

    @NotNull
    public static final float[] chromaticAdaptation(@NotNull float[] matrix, @NotNull float[] srcWhitePoint, @NotNull float[] dstWhitePoint) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(srcWhitePoint, "srcWhitePoint");
        Intrinsics.checkNotNullParameter(dstWhitePoint, "dstWhitePoint");
        float[] mul3x3Float3 = mul3x3Float3(matrix, srcWhitePoint);
        float[] mul3x3Float32 = mul3x3Float3(matrix, dstWhitePoint);
        return mul3x3(inverse3x3(matrix), mul3x3Diag(new float[]{mul3x3Float32[0] / mul3x3Float3[0], mul3x3Float32[1] / mul3x3Float3[1], mul3x3Float32[2] / mul3x3Float3[2]}, matrix));
    }

    public static final boolean compare(@NotNull TransferParameters a2, @Nullable TransferParameters transferParameters) {
        Intrinsics.checkNotNullParameter(a2, "a");
        return transferParameters != null && Math.abs(a2.getA() - transferParameters.getA()) < 0.001d && Math.abs(a2.getB() - transferParameters.getB()) < 0.001d && Math.abs(a2.getC() - transferParameters.getC()) < 0.001d && Math.abs(a2.getD() - transferParameters.getD()) < 0.002d && Math.abs(a2.getE() - transferParameters.getE()) < 0.001d && Math.abs(a2.getF() - transferParameters.getF()) < 0.001d && Math.abs(a2.getGamma() - transferParameters.getGamma()) < 0.001d;
    }

    public static final boolean compare(@NotNull WhitePoint a2, @NotNull WhitePoint b2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        if (a2 == b2) {
            return true;
        }
        return Math.abs(a2.getX() - b2.getX()) < 0.001f && Math.abs(a2.getY() - b2.getY()) < 0.001f;
    }

    public static final boolean compare(@NotNull float[] a2, @NotNull float[] b2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        if (a2 == b2) {
            return true;
        }
        int length = a2.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (Float.compare(a2[i2], b2[i2]) != 0 && Math.abs(a2[i2] - b2[i2]) > 0.001f) {
                return false;
            }
            i2 = i3;
        }
        return true;
    }

    @NotNull
    /* renamed from: connect-YBCOT_4 */
    public static final Connector m1733connectYBCOT_4(@NotNull ColorSpace connect, @NotNull ColorSpace destination, int i2) {
        Intrinsics.checkNotNullParameter(connect, "$this$connect");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (connect == destination) {
            return Connector.Companion.identity$ui_graphics_release(connect);
        }
        long m1732getModelxdoWZVw = connect.m1732getModelxdoWZVw();
        ColorModel.Companion companion = ColorModel.Companion;
        return (ColorModel.m1723equalsimpl0(m1732getModelxdoWZVw, companion.m1730getRgbxdoWZVw()) && ColorModel.m1723equalsimpl0(destination.m1732getModelxdoWZVw(), companion.m1730getRgbxdoWZVw())) ? new Connector.RgbConnector((Rgb) connect, (Rgb) destination, i2, null) : new Connector(connect, destination, i2, null);
    }

    /* renamed from: connect-YBCOT_4$default */
    public static /* synthetic */ Connector m1734connectYBCOT_4$default(ColorSpace colorSpace, ColorSpace colorSpace2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            colorSpace2 = ColorSpaces.INSTANCE.getSrgb();
        }
        if ((i3 & 2) != 0) {
            i2 = RenderIntent.Companion.m1747getPerceptualuksYyKA();
        }
        return m1733connectYBCOT_4(colorSpace, colorSpace2, i2);
    }

    @NotNull
    public static final float[] inverse3x3(@NotNull float[] m2) {
        Intrinsics.checkNotNullParameter(m2, "m");
        float f2 = m2[0];
        float f3 = m2[3];
        float f4 = m2[6];
        float f5 = m2[1];
        float f6 = m2[4];
        float f7 = m2[7];
        float f8 = m2[2];
        float f9 = m2[5];
        float f10 = m2[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f2 * f11) + (f3 * f12) + (f4 * f13);
        float[] fArr = new float[m2.length];
        fArr[0] = f11 / f14;
        fArr[1] = f12 / f14;
        fArr[2] = f13 / f14;
        fArr[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr;
    }

    @NotNull
    public static final float[] mul3x3(@NotNull float[] lhs, @NotNull float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f2 = lhs[3];
        float f3 = rhs[1];
        float f4 = lhs[6];
        float f5 = rhs[2];
        float f6 = lhs[1];
        float f7 = rhs[0];
        float f8 = lhs[4];
        float f9 = lhs[7];
        float f10 = lhs[5];
        float f11 = lhs[8];
        float f12 = lhs[0];
        float f13 = rhs[4];
        float f14 = (rhs[3] * f12) + (f2 * f13);
        float f15 = rhs[5];
        float f16 = lhs[1];
        float f17 = rhs[3];
        float f18 = lhs[2];
        float f19 = f12 * rhs[6];
        float f20 = lhs[3];
        float f21 = rhs[7];
        float f22 = f19 + (f20 * f21);
        float f23 = rhs[8];
        float f24 = rhs[6];
        return new float[]{(lhs[0] * rhs[0]) + (f2 * f3) + (f4 * f5), (f6 * f7) + (f3 * f8) + (f9 * f5), (lhs[2] * f7) + (rhs[1] * f10) + (f5 * f11), f14 + (f4 * f15), (f16 * f17) + (f8 * f13) + (f9 * f15), (f17 * f18) + (f10 * rhs[4]) + (f15 * f11), f22 + (f4 * f23), (f16 * f24) + (lhs[4] * f21) + (f9 * f23), (f18 * f24) + (lhs[5] * rhs[7]) + (f11 * f23)};
    }

    @NotNull
    public static final float[] mul3x3Diag(@NotNull float[] lhs, @NotNull float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f2 = lhs[0];
        float f3 = lhs[1];
        float f4 = lhs[2];
        return new float[]{lhs[0] * rhs[0], lhs[1] * rhs[1], lhs[2] * rhs[2], rhs[3] * f2, rhs[4] * f3, rhs[5] * f4, f2 * rhs[6], f3 * rhs[7], f4 * rhs[8]};
    }

    @NotNull
    public static final float[] mul3x3Float3(@NotNull float[] lhs, @NotNull float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f2 = rhs[0];
        float f3 = rhs[1];
        float f4 = rhs[2];
        rhs[0] = (lhs[0] * f2) + (lhs[3] * f3) + (lhs[6] * f4);
        rhs[1] = (lhs[1] * f2) + (lhs[4] * f3) + (lhs[7] * f4);
        rhs[2] = (lhs[2] * f2) + (lhs[5] * f3) + (lhs[8] * f4);
        return rhs;
    }

    public static final double rcpResponse(double d2, double d3, double d4, double d5, double d6, double d7) {
        return d2 >= d6 * d5 ? (Math.pow(d2, 1.0d / d7) - d4) / d3 : d2 / d5;
    }

    public static final double rcpResponse(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        return d2 >= d6 * d5 ? (Math.pow(d2 - d7, 1.0d / d9) - d4) / d3 : (d2 - d8) / d5;
    }

    public static final double response(double d2, double d3, double d4, double d5, double d6, double d7) {
        return d2 >= d6 ? Math.pow((d3 * d2) + d4, d7) : d2 * d5;
    }

    public static final double response(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        return d2 >= d6 ? Math.pow((d3 * d2) + d4, d9) + d7 : (d5 * d2) + d8;
    }
}
