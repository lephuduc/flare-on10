package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a<\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a2\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a1\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0082\b\u001a-\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a\u0010\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0002\u001a!\u0010'\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001a\u0019\u0010+\u001a\u00020,*\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\u001a\u0019\u0010/\u001a\u00020\f*\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u001a+\u00102\u001a\u00020\u0002*\u00020\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000204H\u0086\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b5\u00106\u001a\u0019\u00107\u001a\u00020\u0014*\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109\"\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006:"}, d2 = {"isSpecified", "", "Landroidx/compose/ui/graphics/Color;", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified-8_81llA", "(J)Z", "isUnspecified", "isUnspecified-8_81llA$annotations", "isUnspecified-8_81llA", "Color", "red", "", "green", "blue", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "color", "", "(I)J", "(IIII)J", "", "(J)J", "compositeComponent", "fgC", "bgC", "fgA", "bgA", "a", "lerp", "start", "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "saturate", "v", "compositeOver", "background", "compositeOver--OWjLjI", "(JJ)J", "getComponents", "", "getComponents-8_81llA", "(J)[F", "luminance", "luminance-8_81llA", "(J)F", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)J", "toArgb", "toArgb-8_81llA", "(J)I", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ColorKt {
    /* JADX WARN: Removed duplicated region for block: B:108:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x005c  */
    @androidx.compose.runtime.Stable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long Color(float r9, float r10, float r11, float r12, @org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.colorspace.ColorSpace r13) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.Color(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    @Stable
    public static final long Color(int i2) {
        return Color.m1388constructorimpl(ULong.m3753constructorimpl(ULong.m3753constructorimpl(i2) << 32));
    }

    @Stable
    public static final long Color(int i2, int i3, int i4, int i5) {
        return Color(((i2 & 255) << 16) | ((i5 & 255) << 24) | ((i3 & 255) << 8) | (i4 & 255));
    }

    @Stable
    public static final long Color(long j2) {
        return Color.m1388constructorimpl(ULong.m3753constructorimpl(ULong.m3753constructorimpl(ULong.m3753constructorimpl(j2) & 4294967295L) << 32));
    }

    public static /* synthetic */ long Color$default(float f2, float f3, float f4, float f5, ColorSpace colorSpace, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            f5 = 1.0f;
        }
        if ((i2 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f2, f3, f4, f5, colorSpace);
    }

    public static /* synthetic */ long Color$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            i5 = 255;
        }
        return Color(i2, i3, i4, i5);
    }

    /* renamed from: access$getComponents-8_81llA */
    public static final /* synthetic */ float[] m1437access$getComponents8_81llA(long j2) {
        return m1439getComponents8_81llA(j2);
    }

    private static final float compositeComponent(float f2, float f3, float f4, float f5, float f6) {
        if (f6 == 0.0f) {
            return 0.0f;
        }
        return ((f2 * f4) + ((f3 * f5) * (1.0f - f4))) / f6;
    }

    @Stable
    /* renamed from: compositeOver--OWjLjI */
    public static final long m1438compositeOverOWjLjI(long j2, long j3) {
        long m1389convertvNxB06k = Color.m1389convertvNxB06k(j2, Color.m1396getColorSpaceimpl(j3));
        float m1394getAlphaimpl = Color.m1394getAlphaimpl(j3);
        float m1394getAlphaimpl2 = Color.m1394getAlphaimpl(m1389convertvNxB06k);
        float f2 = 1.0f - m1394getAlphaimpl2;
        float f3 = (m1394getAlphaimpl * f2) + m1394getAlphaimpl2;
        int i2 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        return Color(i2 == 0 ? 0.0f : ((Color.m1398getRedimpl(m1389convertvNxB06k) * m1394getAlphaimpl2) + ((Color.m1398getRedimpl(j3) * m1394getAlphaimpl) * f2)) / f3, i2 == 0 ? 0.0f : ((Color.m1397getGreenimpl(m1389convertvNxB06k) * m1394getAlphaimpl2) + ((Color.m1397getGreenimpl(j3) * m1394getAlphaimpl) * f2)) / f3, i2 == 0 ? 0.0f : ((Color.m1395getBlueimpl(m1389convertvNxB06k) * m1394getAlphaimpl2) + ((Color.m1395getBlueimpl(j3) * m1394getAlphaimpl) * f2)) / f3, f3, Color.m1396getColorSpaceimpl(j3));
    }

    /* renamed from: getComponents-8_81llA */
    public static final float[] m1439getComponents8_81llA(long j2) {
        return new float[]{Color.m1398getRedimpl(j2), Color.m1397getGreenimpl(j2), Color.m1395getBlueimpl(j2), Color.m1394getAlphaimpl(j2)};
    }

    /* renamed from: isSpecified-8_81llA */
    public static final boolean m1440isSpecified8_81llA(long j2) {
        return j2 != Color.Companion.m1428getUnspecified0d7_KjU();
    }

    @Stable
    /* renamed from: isSpecified-8_81llA$annotations */
    public static /* synthetic */ void m1441isSpecified8_81llA$annotations(long j2) {
    }

    /* renamed from: isUnspecified-8_81llA */
    public static final boolean m1442isUnspecified8_81llA(long j2) {
        return j2 == Color.Companion.m1428getUnspecified0d7_KjU();
    }

    @Stable
    /* renamed from: isUnspecified-8_81llA$annotations */
    public static /* synthetic */ void m1443isUnspecified8_81llA$annotations(long j2) {
    }

    @Stable
    /* renamed from: lerp-jxsXWHM */
    public static final long m1444lerpjxsXWHM(long j2, long j3, float f2) {
        ColorSpace oklab$ui_graphics_release = ColorSpaces.INSTANCE.getOklab$ui_graphics_release();
        long m1389convertvNxB06k = Color.m1389convertvNxB06k(j2, oklab$ui_graphics_release);
        long m1389convertvNxB06k2 = Color.m1389convertvNxB06k(j3, oklab$ui_graphics_release);
        float m1394getAlphaimpl = Color.m1394getAlphaimpl(m1389convertvNxB06k);
        float m1398getRedimpl = Color.m1398getRedimpl(m1389convertvNxB06k);
        float m1397getGreenimpl = Color.m1397getGreenimpl(m1389convertvNxB06k);
        float m1395getBlueimpl = Color.m1395getBlueimpl(m1389convertvNxB06k);
        float m1394getAlphaimpl2 = Color.m1394getAlphaimpl(m1389convertvNxB06k2);
        float m1398getRedimpl2 = Color.m1398getRedimpl(m1389convertvNxB06k2);
        float m1397getGreenimpl2 = Color.m1397getGreenimpl(m1389convertvNxB06k2);
        float m1395getBlueimpl2 = Color.m1395getBlueimpl(m1389convertvNxB06k2);
        return Color.m1389convertvNxB06k(Color(MathHelpersKt.lerp(m1398getRedimpl, m1398getRedimpl2, f2), MathHelpersKt.lerp(m1397getGreenimpl, m1397getGreenimpl2, f2), MathHelpersKt.lerp(m1395getBlueimpl, m1395getBlueimpl2, f2), MathHelpersKt.lerp(m1394getAlphaimpl, m1394getAlphaimpl2, f2), oklab$ui_graphics_release), Color.m1396getColorSpaceimpl(j3));
    }

    @Stable
    /* renamed from: luminance-8_81llA */
    public static final float m1445luminance8_81llA(long j2) {
        ColorSpace m1396getColorSpaceimpl = Color.m1396getColorSpaceimpl(j2);
        if (ColorModel.m1723equalsimpl0(m1396getColorSpaceimpl.m1732getModelxdoWZVw(), ColorModel.Companion.m1730getRgbxdoWZVw())) {
            Function1<Double, Double> eotf = ((Rgb) m1396getColorSpaceimpl).getEotf();
            return saturate((float) ((eotf.invoke(Double.valueOf(Color.m1398getRedimpl(j2))).doubleValue() * 0.2126d) + (eotf.invoke(Double.valueOf(Color.m1397getGreenimpl(j2))).doubleValue() * 0.7152d) + (eotf.invoke(Double.valueOf(Color.m1395getBlueimpl(j2))).doubleValue() * 0.0722d)));
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("The specified color must be encoded in an RGB color space. The supplied color space is ", ColorModel.m1726toStringimpl(m1396getColorSpaceimpl.m1732getModelxdoWZVw())).toString());
    }

    private static final float saturate(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        return f2;
    }

    /* renamed from: takeOrElse-DxMtmZc */
    public static final long m1446takeOrElseDxMtmZc(long j2, @NotNull Function0<Color> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return (j2 > Color.Companion.m1428getUnspecified0d7_KjU() ? 1 : (j2 == Color.Companion.m1428getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j2 : block.invoke().m1402unboximpl();
    }

    @Stable
    /* renamed from: toArgb-8_81llA */
    public static final int m1447toArgb8_81llA(long j2) {
        ColorSpace m1396getColorSpaceimpl = Color.m1396getColorSpaceimpl(j2);
        if (m1396getColorSpaceimpl.isSrgb()) {
            return (int) ULong.m3753constructorimpl(j2 >>> 32);
        }
        float[] m1439getComponents8_81llA = m1439getComponents8_81llA(j2);
        ColorSpaceKt.m1734connectYBCOT_4$default(m1396getColorSpaceimpl, null, 0, 3, null).transform(m1439getComponents8_81llA);
        return ((int) ((m1439getComponents8_81llA[2] * 255.0f) + 0.5f)) | (((int) ((m1439getComponents8_81llA[3] * 255.0f) + 0.5f)) << 24) | (((int) ((m1439getComponents8_81llA[0] * 255.0f) + 0.5f)) << 16) | (((int) ((m1439getComponents8_81llA[1] * 255.0f) + 0.5f)) << 8);
    }
}
