package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001dH\u0086\nø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0014H\u0086\nø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010 J!\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\nø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010!J\u001a\u0010\"\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001dH\u0086\nø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b)\u0010\u001fJ!\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0014H\u0086\nø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b)\u0010 J!\u0010(\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\nø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b)\u0010!J\u000f\u0010*\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\u0000H\u0086\nø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b/\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u00038@X\u0081\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0010\u001a\u00020\u00118Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/ui/unit/TextUnit;", "", "packedValue", "", "constructor-impl", "(J)J", "isEm", "", "isEm-impl", "(J)Z", "isSp", "isSp-impl", "rawType", "getRawType$annotations", "()V", "getRawType-impl", "type", "Landroidx/compose/ui/unit/TextUnitType;", "getType-UIouoOA", "value", "", "getValue-impl", "(J)F", "compareTo", "", "other", "compareTo--R2X_6o", "(JJ)I", "div", "", "div-kPz2Gy4", "(JD)J", "(JF)J", "(JI)J", "equals", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(J)I", "times", "times-kPz2Gy4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-XSAIIZE", "Companion", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: classes.dex */
public final class TextUnit {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final TextUnitType[] TextUnitTypes;
    private static final long Unspecified;
    private final long packedValue;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R'\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u000e\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/unit/TextUnit$Companion;", "", "()V", "TextUnitTypes", "", "Landroidx/compose/ui/unit/TextUnitType;", "getTextUnitTypes$ui_unit_release", "()[Landroidx/compose/ui/unit/TextUnitType;", "[Landroidx/compose/ui/unit/TextUnitType;", "Unspecified", "Landroidx/compose/ui/unit/TextUnit;", "getUnspecified-XSAIIZE$annotations", "getUnspecified-XSAIIZE", "()J", "J", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getUnspecified-XSAIIZE$annotations  reason: not valid java name */
        public static /* synthetic */ void m3516getUnspecifiedXSAIIZE$annotations() {
        }

        @NotNull
        public final TextUnitType[] getTextUnitTypes$ui_unit_release() {
            return TextUnit.TextUnitTypes;
        }

        /* renamed from: getUnspecified-XSAIIZE  reason: not valid java name */
        public final long m3517getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }
    }

    static {
        TextUnitType.Companion companion = TextUnitType.Companion;
        TextUnitTypes = new TextUnitType[]{TextUnitType.m3531boximpl(companion.m3540getUnspecifiedUIouoOA()), TextUnitType.m3531boximpl(companion.m3539getSpUIouoOA()), TextUnitType.m3531boximpl(companion.m3538getEmUIouoOA())};
        Unspecified = TextUnitKt.pack(0L, Float.NaN);
    }

    private /* synthetic */ TextUnit(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ TextUnit m3496boximpl(long j2) {
        return new TextUnit(j2);
    }

    /* renamed from: compareTo--R2X_6o  reason: not valid java name */
    public static final int m3497compareToR2X_6o(long j2, long j3) {
        TextUnitKt.m3520checkArithmeticNB67dxo(j2, j3);
        return Float.compare(m3506getValueimpl(j2), m3506getValueimpl(j3));
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m3498constructorimpl(long j2) {
        return j2;
    }

    /* renamed from: div-kPz2Gy4  reason: not valid java name */
    public static final long m3499divkPz2Gy4(long j2, double d2) {
        TextUnitKt.m3519checkArithmeticR2X_6o(j2);
        return TextUnitKt.pack(m3504getRawTypeimpl(j2), (float) (m3506getValueimpl(j2) / d2));
    }

    /* renamed from: div-kPz2Gy4  reason: not valid java name */
    public static final long m3500divkPz2Gy4(long j2, float f2) {
        TextUnitKt.m3519checkArithmeticR2X_6o(j2);
        return TextUnitKt.pack(m3504getRawTypeimpl(j2), m3506getValueimpl(j2) / f2);
    }

    /* renamed from: div-kPz2Gy4  reason: not valid java name */
    public static final long m3501divkPz2Gy4(long j2, int i2) {
        TextUnitKt.m3519checkArithmeticR2X_6o(j2);
        return TextUnitKt.pack(m3504getRawTypeimpl(j2), m3506getValueimpl(j2) / i2);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m3502equalsimpl(long j2, Object obj) {
        return (obj instanceof TextUnit) && j2 == ((TextUnit) obj).m3515unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m3503equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    @PublishedApi
    public static /* synthetic */ void getRawType$annotations() {
    }

    /* renamed from: getRawType-impl  reason: not valid java name */
    public static final long m3504getRawTypeimpl(long j2) {
        return j2 & 1095216660480L;
    }

    /* renamed from: getType-UIouoOA  reason: not valid java name */
    public static final long m3505getTypeUIouoOA(long j2) {
        return TextUnitTypes[(int) (m3504getRawTypeimpl(j2) >>> 32)].m3537unboximpl();
    }

    /* renamed from: getValue-impl  reason: not valid java name */
    public static final float m3506getValueimpl(long j2) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m3507hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    /* renamed from: isEm-impl  reason: not valid java name */
    public static final boolean m3508isEmimpl(long j2) {
        return m3504getRawTypeimpl(j2) == 8589934592L;
    }

    /* renamed from: isSp-impl  reason: not valid java name */
    public static final boolean m3509isSpimpl(long j2) {
        return m3504getRawTypeimpl(j2) == 4294967296L;
    }

    /* renamed from: times-kPz2Gy4  reason: not valid java name */
    public static final long m3510timeskPz2Gy4(long j2, double d2) {
        TextUnitKt.m3519checkArithmeticR2X_6o(j2);
        return TextUnitKt.pack(m3504getRawTypeimpl(j2), (float) (m3506getValueimpl(j2) * d2));
    }

    /* renamed from: times-kPz2Gy4  reason: not valid java name */
    public static final long m3511timeskPz2Gy4(long j2, float f2) {
        TextUnitKt.m3519checkArithmeticR2X_6o(j2);
        return TextUnitKt.pack(m3504getRawTypeimpl(j2), m3506getValueimpl(j2) * f2);
    }

    /* renamed from: times-kPz2Gy4  reason: not valid java name */
    public static final long m3512timeskPz2Gy4(long j2, int i2) {
        TextUnitKt.m3519checkArithmeticR2X_6o(j2);
        return TextUnitKt.pack(m3504getRawTypeimpl(j2), m3506getValueimpl(j2) * i2);
    }

    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m3513toStringimpl(long j2) {
        StringBuilder sb;
        String str;
        long m3505getTypeUIouoOA = m3505getTypeUIouoOA(j2);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m3534equalsimpl0(m3505getTypeUIouoOA, companion.m3540getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m3534equalsimpl0(m3505getTypeUIouoOA, companion.m3539getSpUIouoOA())) {
            sb = new StringBuilder();
            sb.append(m3506getValueimpl(j2));
            str = ".sp";
        } else if (!TextUnitType.m3534equalsimpl0(m3505getTypeUIouoOA, companion.m3538getEmUIouoOA())) {
            return "Invalid";
        } else {
            sb = new StringBuilder();
            sb.append(m3506getValueimpl(j2));
            str = ".em";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: unaryMinus-XSAIIZE  reason: not valid java name */
    public static final long m3514unaryMinusXSAIIZE(long j2) {
        TextUnitKt.m3519checkArithmeticR2X_6o(j2);
        return TextUnitKt.pack(m3504getRawTypeimpl(j2), -m3506getValueimpl(j2));
    }

    public boolean equals(Object obj) {
        return m3502equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3507hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m3513toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m3515unboximpl() {
        return this.packedValue;
    }
}
