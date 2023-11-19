package androidx.compose.ui.graphics;

import androidx.core.internal.view.SupportMenu;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\b\u0081@\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001RB\u0014\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005B\u0014\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0007B\u0012\u0012\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\nJ\u0016\u0010\u0015\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\nJ\u0016\u0010\u0017\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\nJ\u001e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b#\u0010\nJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010\u000eJ\r\u0010&\u001a\u00020\u001e¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u001e¢\u0006\u0004\b*\u0010(J\r\u0010+\u001a\u00020\u001e¢\u0006\u0004\b,\u0010(J\r\u0010-\u001a\u00020\u001e¢\u0006\u0004\b.\u0010(J\u0016\u0010/\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b0\u0010\nJ\r\u00101\u001a\u00020\f¢\u0006\u0004\b2\u0010\u000eJ\r\u00103\u001a\u000204¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0003¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020>¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\f¢\u0006\u0004\bB\u0010\u000eJ\r\u0010C\u001a\u00020D¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\f¢\u0006\u0004\bH\u0010\u000eJ\r\u0010I\u001a\u00020\t¢\u0006\u0004\bJ\u0010\nJ\u000f\u0010K\u001a\u00020>H\u0016¢\u0006\u0004\bL\u0010@J\u0016\u0010M\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bN\u0010\nJ\u001b\u0010O\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bP\u0010QR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00008Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e\u0088\u0001\bø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, d2 = {"Landroidx/compose/ui/graphics/Float16;", "", "value", "", "constructor-impl", "(F)S", "", "(D)S", "halfValue", "", "(S)S", "exponent", "", "getExponent-impl", "(S)I", "getHalfValue", "()S", "sign", "getSign-slo4al4", "significand", "getSignificand-impl", "absoluteValue", "absoluteValue-slo4al4", "ceil", "ceil-slo4al4", "compareTo", "other", "compareTo-41bOqos", "(SS)I", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floor", "floor-slo4al4", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(S)Z", "isInfinite", "isInfinite-impl", "isNaN", "isNaN-impl", "isNormalized", "isNormalized-impl", "round", "round-slo4al4", "toBits", "toBits-impl", "toByte", "", "toByte-impl", "(S)B", "toDouble", "toDouble-impl", "(S)D", "toFloat", "toFloat-impl", "(S)F", "toHexString", "", "toHexString-impl", "(S)Ljava/lang/String;", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toRawBits", "toRawBits-impl", "toShort", "toShort-impl", "toString", "toString-impl", "trunc", "trunc-slo4al4", "withSign", "withSign-qCeQghg", "(SS)S", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: classes.dex */
public final class Float16 implements Comparable<Float16> {
    private static final int FP16_COMBINED = 32767;
    private static final int FP16_EXPONENT_BIAS = 15;
    private static final int FP16_EXPONENT_MASK = 31;
    private static final int FP16_EXPONENT_MAX = 31744;
    private static final int FP16_EXPONENT_SHIFT = 10;
    private static final int FP16_SIGNIFICAND_MASK = 1023;
    private static final int FP16_SIGN_MASK = 32768;
    private static final int FP16_SIGN_SHIFT = 15;
    private static final float FP32_DENORMAL_FLOAT;
    private static final int FP32_DENORMAL_MAGIC = 1056964608;
    private static final int FP32_EXPONENT_BIAS = 127;
    private static final int FP32_EXPONENT_MASK = 255;
    private static final int FP32_EXPONENT_SHIFT = 23;
    private static final int FP32_QNAN_MASK = 4194304;
    private static final int FP32_SIGNIFICAND_MASK = 8388607;
    private static final int FP32_SIGN_SHIFT = 31;
    public static final int MaxExponent = 15;
    public static final int MinExponent = -14;
    public static final int Size = 16;
    private final short halfValue;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final short Epsilon = m1487constructorimpl((short) 5120);
    private static final short LowestValue = m1487constructorimpl((short) -1025);
    private static final short MaxValue = m1487constructorimpl((short) 31743);
    private static final short MinNormal = m1487constructorimpl((short) 1024);
    private static final short MinValue = m1487constructorimpl((short) 1);
    private static final short NaN = m1487constructorimpl((short) 32256);
    private static final short NegativeInfinity = m1487constructorimpl((short) -1024);
    private static final short NegativeZero = m1487constructorimpl((short) ShortCompanionObject.MIN_VALUE);
    private static final short PositiveInfinity = m1487constructorimpl((short) 31744);
    private static final short PositiveZero = m1487constructorimpl((short) 0);
    private static final short One = m1486constructorimpl(1.0f);
    private static final short NegativeOne = m1486constructorimpl(-1.0f);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0010\n\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0012H\u0002J\u0010\u00104\u001a\u00020\t2\u0006\u00105\u001a\u000202H\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001b\u0010\u0006R\u000e\u0010\u001c\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001e\u0010\u0006R\u000e\u0010\u001f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b!\u0010\u0006R\u001c\u0010\"\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b#\u0010\u0006R\u001c\u0010$\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b%\u0010\u0006R\u001c\u0010&\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b'\u0010\u0006R\u0019\u0010(\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0007R\u001c\u0010)\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b*\u0010\u0006R\u0019\u0010+\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0007R\u001c\u0010,\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b-\u0010\u0006R\u001c\u0010.\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b/\u0010\u0006R\u000e\u00100\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/ui/graphics/Float16$Companion;", "", "()V", "Epsilon", "Landroidx/compose/ui/graphics/Float16;", "getEpsilon-slo4al4", "()S", "S", "FP16_COMBINED", "", "FP16_EXPONENT_BIAS", "FP16_EXPONENT_MASK", "FP16_EXPONENT_MAX", "FP16_EXPONENT_SHIFT", "FP16_SIGNIFICAND_MASK", "FP16_SIGN_MASK", "FP16_SIGN_SHIFT", "FP32_DENORMAL_FLOAT", "", "FP32_DENORMAL_MAGIC", "FP32_EXPONENT_BIAS", "FP32_EXPONENT_MASK", "FP32_EXPONENT_SHIFT", "FP32_QNAN_MASK", "FP32_SIGNIFICAND_MASK", "FP32_SIGN_SHIFT", "LowestValue", "getLowestValue-slo4al4", "MaxExponent", "MaxValue", "getMaxValue-slo4al4", "MinExponent", "MinNormal", "getMinNormal-slo4al4", "MinValue", "getMinValue-slo4al4", "NaN", "getNaN-slo4al4", "NegativeInfinity", "getNegativeInfinity-slo4al4", "NegativeOne", "NegativeZero", "getNegativeZero-slo4al4", "One", "PositiveInfinity", "getPositiveInfinity-slo4al4", "PositiveZero", "getPositiveZero-slo4al4", "Size", "floatToHalf", "", "f", "toCompareValue", "value", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final short floatToHalf(float f2) {
            int i2;
            int i3;
            int floatToRawIntBits = Float.floatToRawIntBits(f2);
            int i4 = floatToRawIntBits >>> 31;
            int i5 = (floatToRawIntBits >>> 23) & 255;
            int i6 = floatToRawIntBits & Float16.FP32_SIGNIFICAND_MASK;
            if (i5 == 255) {
                i2 = i6 != 0 ? 512 : 0;
                r2 = 31;
            } else {
                int i7 = (i5 - 127) + 15;
                if (i7 >= 31) {
                    r2 = 49;
                    i2 = 0;
                } else if (i7 > 0) {
                    int i8 = i6 >> 13;
                    if ((i6 & 4096) != 0) {
                        i3 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                        return (short) i3;
                    }
                    i2 = i8;
                    r2 = i7;
                } else if (i7 < -10) {
                    i2 = 0;
                } else {
                    int i9 = (i6 | 8388608) >> (1 - i7);
                    if ((i9 & 4096) != 0) {
                        i9 += 8192;
                    }
                    i2 = i9 >> 13;
                }
            }
            i3 = i2 | (i4 << 15) | (r2 << 10);
            return (short) i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int toCompareValue(short s2) {
            return (s2 & ShortCompanionObject.MIN_VALUE) != 0 ? 32768 - (s2 & UShort.MAX_VALUE) : s2 & UShort.MAX_VALUE;
        }

        /* renamed from: getEpsilon-slo4al4  reason: not valid java name */
        public final short m1514getEpsilonslo4al4() {
            return Float16.Epsilon;
        }

        /* renamed from: getLowestValue-slo4al4  reason: not valid java name */
        public final short m1515getLowestValueslo4al4() {
            return Float16.LowestValue;
        }

        /* renamed from: getMaxValue-slo4al4  reason: not valid java name */
        public final short m1516getMaxValueslo4al4() {
            return Float16.MaxValue;
        }

        /* renamed from: getMinNormal-slo4al4  reason: not valid java name */
        public final short m1517getMinNormalslo4al4() {
            return Float16.MinNormal;
        }

        /* renamed from: getMinValue-slo4al4  reason: not valid java name */
        public final short m1518getMinValueslo4al4() {
            return Float16.MinValue;
        }

        /* renamed from: getNaN-slo4al4  reason: not valid java name */
        public final short m1519getNaNslo4al4() {
            return Float16.NaN;
        }

        /* renamed from: getNegativeInfinity-slo4al4  reason: not valid java name */
        public final short m1520getNegativeInfinityslo4al4() {
            return Float16.NegativeInfinity;
        }

        /* renamed from: getNegativeZero-slo4al4  reason: not valid java name */
        public final short m1521getNegativeZeroslo4al4() {
            return Float16.NegativeZero;
        }

        /* renamed from: getPositiveInfinity-slo4al4  reason: not valid java name */
        public final short m1522getPositiveInfinityslo4al4() {
            return Float16.PositiveInfinity;
        }

        /* renamed from: getPositiveZero-slo4al4  reason: not valid java name */
        public final short m1523getPositiveZeroslo4al4() {
            return Float16.PositiveZero;
        }
    }

    static {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        FP32_DENORMAL_FLOAT = Float.intBitsToFloat(FP32_DENORMAL_MAGIC);
    }

    private /* synthetic */ Float16(short s2) {
        this.halfValue = s2;
    }

    /* renamed from: absoluteValue-slo4al4  reason: not valid java name */
    public static final short m1481absoluteValueslo4al4(short s2) {
        return m1487constructorimpl((short) (s2 & ShortCompanionObject.MAX_VALUE));
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Float16 m1482boximpl(short s2) {
        return new Float16(s2);
    }

    /* renamed from: ceil-slo4al4  reason: not valid java name */
    public static final short m1483ceilslo4al4(short s2) {
        int i2 = s2 & UShort.MAX_VALUE;
        int i3 = i2 & FP16_COMBINED;
        if (i3 < 15360) {
            i2 = ((-((~(i2 >> 15)) & (i3 == 0 ? 0 : 1))) & 15360) | (32768 & i2);
        } else if (i3 < 25600) {
            int i4 = (1 << (25 - (i3 >> 10))) - 1;
            i2 = (i2 + (((i2 >> 15) - 1) & i4)) & (~i4);
        }
        return m1487constructorimpl((short) i2);
    }

    /* renamed from: compareTo-41bOqos  reason: not valid java name */
    public static int m1484compareTo41bOqos(short s2, short s3) {
        if (m1497isNaNimpl(s2)) {
            return !m1497isNaNimpl(s3) ? 1 : 0;
        }
        if (m1497isNaNimpl(s3)) {
            return -1;
        }
        Companion companion = Companion;
        return Intrinsics.compare(companion.toCompareValue(s2), companion.toCompareValue(s3));
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m1485constructorimpl(double d2) {
        return m1486constructorimpl((float) d2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m1486constructorimpl(float f2) {
        return m1487constructorimpl(Companion.floatToHalf(f2));
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static short m1487constructorimpl(short s2) {
        return s2;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1488equalsimpl(short s2, Object obj) {
        return (obj instanceof Float16) && s2 == ((Float16) obj).m1513unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1489equalsimpl0(short s2, short s3) {
        return s2 == s3;
    }

    /* renamed from: floor-slo4al4  reason: not valid java name */
    public static final short m1490floorslo4al4(short s2) {
        int i2 = SupportMenu.USER_MASK;
        int i3 = s2 & UShort.MAX_VALUE;
        int i4 = i3 & FP16_COMBINED;
        if (i4 < 15360) {
            int i5 = i3 & 32768;
            if (i3 <= 32768) {
                i2 = 0;
            }
            i3 = (i2 & 15360) | i5;
        } else if (i4 < 25600) {
            int i6 = (1 << (25 - (i4 >> 10))) - 1;
            i3 = (i3 + ((-(i3 >> 15)) & i6)) & (~i6);
        }
        return m1487constructorimpl((short) i3);
    }

    /* renamed from: getExponent-impl  reason: not valid java name */
    public static final int m1491getExponentimpl(short s2) {
        return ((s2 >>> 10) & 31) - 15;
    }

    /* renamed from: getSign-slo4al4  reason: not valid java name */
    public static final short m1492getSignslo4al4(short s2) {
        return m1497isNaNimpl(s2) ? NaN : m1484compareTo41bOqos(s2, NegativeZero) < 0 ? NegativeOne : m1484compareTo41bOqos(s2, PositiveZero) > 0 ? One : s2;
    }

    /* renamed from: getSignificand-impl  reason: not valid java name */
    public static final int m1493getSignificandimpl(short s2) {
        return s2 & 1023;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1494hashCodeimpl(short s2) {
        return Short.hashCode(s2);
    }

    /* renamed from: isFinite-impl  reason: not valid java name */
    public static final boolean m1495isFiniteimpl(short s2) {
        return (s2 & ShortCompanionObject.MAX_VALUE) != FP16_EXPONENT_MAX;
    }

    /* renamed from: isInfinite-impl  reason: not valid java name */
    public static final boolean m1496isInfiniteimpl(short s2) {
        return (s2 & ShortCompanionObject.MAX_VALUE) == FP16_EXPONENT_MAX;
    }

    /* renamed from: isNaN-impl  reason: not valid java name */
    public static final boolean m1497isNaNimpl(short s2) {
        return (s2 & ShortCompanionObject.MAX_VALUE) > FP16_EXPONENT_MAX;
    }

    /* renamed from: isNormalized-impl  reason: not valid java name */
    public static final boolean m1498isNormalizedimpl(short s2) {
        int i2 = s2 & FP16_EXPONENT_MAX;
        return (i2 == 0 || i2 == FP16_EXPONENT_MAX) ? false : true;
    }

    /* renamed from: round-slo4al4  reason: not valid java name */
    public static final short m1499roundslo4al4(short s2) {
        int i2 = SupportMenu.USER_MASK;
        int i3 = s2 & UShort.MAX_VALUE;
        int i4 = i3 & FP16_COMBINED;
        if (i4 < 15360) {
            int i5 = i3 & 32768;
            if (i4 < 14336) {
                i2 = 0;
            }
            i3 = i5 | (i2 & 15360);
        } else if (i4 < 25600) {
            int i6 = 25 - (i4 >> 10);
            i3 = (i3 + (1 << (i6 - 1))) & (~((1 << i6) - 1));
        }
        return m1487constructorimpl((short) i3);
    }

    /* renamed from: toBits-impl  reason: not valid java name */
    public static final int m1500toBitsimpl(short s2) {
        return m1497isNaNimpl(s2) ? NaN : s2 & UShort.MAX_VALUE;
    }

    /* renamed from: toByte-impl  reason: not valid java name */
    public static final byte m1501toByteimpl(short s2) {
        return (byte) m1503toFloatimpl(s2);
    }

    /* renamed from: toDouble-impl  reason: not valid java name */
    public static final double m1502toDoubleimpl(short s2) {
        return m1503toFloatimpl(s2);
    }

    /* renamed from: toFloat-impl  reason: not valid java name */
    public static final float m1503toFloatimpl(short s2) {
        int i2;
        int i3;
        int i4 = s2 & UShort.MAX_VALUE;
        int i5 = 32768 & i4;
        int i6 = (i4 >>> 10) & 31;
        int i7 = i4 & FP16_SIGNIFICAND_MASK;
        int i8 = 0;
        if (i6 != 0) {
            int i9 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i9 != 0) {
                    i9 |= 4194304;
                }
            } else {
                i2 = (i6 - 15) + 127;
            }
            int i10 = i9;
            i8 = i2;
            i3 = i10;
        } else if (i7 != 0) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            float intBitsToFloat = Float.intBitsToFloat(i7 + FP32_DENORMAL_MAGIC) - FP32_DENORMAL_FLOAT;
            return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
        } else {
            i3 = 0;
        }
        int i11 = i3 | (i5 << 16) | (i8 << 23);
        FloatCompanionObject floatCompanionObject2 = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(i11);
    }

    @NotNull
    /* renamed from: toHexString-impl  reason: not valid java name */
    public static final String m1504toHexStringimpl(short s2) {
        int checkRadix;
        String valueOf;
        int checkRadix2;
        StringBuilder sb = new StringBuilder();
        int i2 = s2 & UShort.MAX_VALUE;
        int i3 = i2 >>> 15;
        int i4 = (i2 >>> 10) & 31;
        int i5 = i2 & FP16_SIGNIFICAND_MASK;
        if (i4 != 31) {
            if (i3 == 1) {
                sb.append('-');
            }
            if (i4 != 0) {
                sb.append("0x1.");
                checkRadix = CharsKt__CharJVMKt.checkRadix(16);
                String num = Integer.toString(i5, checkRadix);
                Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
                sb.append(new Regex("0{2,}$").replaceFirst(num, ""));
                sb.append('p');
                valueOf = String.valueOf(i4 - 15);
            } else if (i5 == 0) {
                valueOf = "0x0.0p0";
            } else {
                sb.append("0x0.");
                checkRadix2 = CharsKt__CharJVMKt.checkRadix(16);
                String num2 = Integer.toString(i5, checkRadix2);
                Intrinsics.checkNotNullExpressionValue(num2, "toString(this, checkRadix(radix))");
                sb.append(new Regex("0{2,}$").replaceFirst(num2, ""));
                valueOf = "p-14";
            }
        } else if (i5 == 0) {
            if (i3 != 0) {
                sb.append('-');
            }
            valueOf = "Infinity";
        } else {
            valueOf = "NaN";
        }
        sb.append(valueOf);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "o.toString()");
        return sb2;
    }

    /* renamed from: toInt-impl  reason: not valid java name */
    public static final int m1505toIntimpl(short s2) {
        return (int) m1503toFloatimpl(s2);
    }

    /* renamed from: toLong-impl  reason: not valid java name */
    public static final long m1506toLongimpl(short s2) {
        return m1503toFloatimpl(s2);
    }

    /* renamed from: toRawBits-impl  reason: not valid java name */
    public static final int m1507toRawBitsimpl(short s2) {
        return s2 & UShort.MAX_VALUE;
    }

    /* renamed from: toShort-impl  reason: not valid java name */
    public static final short m1508toShortimpl(short s2) {
        return (short) m1503toFloatimpl(s2);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1509toStringimpl(short s2) {
        return String.valueOf(m1503toFloatimpl(s2));
    }

    /* renamed from: trunc-slo4al4  reason: not valid java name */
    public static final short m1510truncslo4al4(short s2) {
        int i2;
        int i3 = s2 & UShort.MAX_VALUE;
        int i4 = i3 & FP16_COMBINED;
        if (i4 >= 15360) {
            if (i4 < 25600) {
                i2 = ~((1 << (25 - (i4 >> 10))) - 1);
            }
            return m1487constructorimpl((short) i3);
        }
        i2 = 32768;
        i3 &= i2;
        return m1487constructorimpl((short) i3);
    }

    /* renamed from: withSign-qCeQghg  reason: not valid java name */
    public static final short m1511withSignqCeQghg(short s2, short s3) {
        return m1487constructorimpl((short) ((s2 & ShortCompanionObject.MAX_VALUE) | (s3 & ShortCompanionObject.MIN_VALUE)));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Float16 float16) {
        return m1512compareTo41bOqos(float16.m1513unboximpl());
    }

    /* renamed from: compareTo-41bOqos  reason: not valid java name */
    public int m1512compareTo41bOqos(short s2) {
        return m1484compareTo41bOqos(this.halfValue, s2);
    }

    public boolean equals(Object obj) {
        return m1488equalsimpl(this.halfValue, obj);
    }

    public final short getHalfValue() {
        return this.halfValue;
    }

    public int hashCode() {
        return m1494hashCodeimpl(this.halfValue);
    }

    @NotNull
    public String toString() {
        return m1509toStringimpl(this.halfValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ short m1513unboximpl() {
        return this.halfValue;
    }
}
