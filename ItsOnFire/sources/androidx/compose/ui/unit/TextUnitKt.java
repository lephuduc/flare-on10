package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\u001a%\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a\u001d\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0006H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010\u0015\u001a%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001a-\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001a-\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103\u001a \u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020\fH\u0001ø\u0001\u0000¢\u0006\u0002\u00107\u001a+\u00108\u001a\u00020\u0006*\u00020\u00062\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00060:H\u0086\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b;\u0010<\u001a\"\u0010=\u001a\u00020\u0006*\u00020\u00072\u0006\u0010>\u001a\u00020\u0006H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010@\u001a\"\u0010=\u001a\u00020\u0006*\u00020\f2\u0006\u0010>\u001a\u00020\u0006H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010#\u001a\"\u0010=\u001a\u00020\u0006*\u00020\u000f2\u0006\u0010>\u001a\u00020\u0006H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010A\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"!\u0010\u0005\u001a\u00020\u0006*\u00020\u00078FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"!\u0010\u0005\u001a\u00020\u0006*\u00020\f8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\r\u001a\u0004\b\n\u0010\u000e\"!\u0010\u0005\u001a\u00020\u0006*\u00020\u000f8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\u0010\u001a\u0004\b\n\u0010\u0011\"\"\u0010\u0012\u001a\u00020\u0013*\u00020\u00068Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"!\u0010\u0018\u001a\u00020\u0013*\u00020\u00068FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"!\u0010\u001b\u001a\u00020\u0006*\u00020\u00078FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\t\u001a\u0004\b\u001d\u0010\u000b\"!\u0010\u001b\u001a\u00020\u0006*\u00020\f8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u000e\"!\u0010\u001b\u001a\u00020\u0006*\u00020\u000f8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0011\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006B"}, d2 = {"UNIT_MASK", "", "UNIT_TYPE_EM", "UNIT_TYPE_SP", "UNIT_TYPE_UNSPECIFIED", "em", "Landroidx/compose/ui/unit/TextUnit;", "", "getEm$annotations", "(D)V", "getEm", "(D)J", "", "(F)V", "(F)J", "", "(I)V", "(I)J", "isSpecified", "", "isSpecified--R2X_6o$annotations", "(J)V", "isSpecified--R2X_6o", "(J)Z", "isUnspecified", "isUnspecified--R2X_6o$annotations", "isUnspecified--R2X_6o", "sp", "getSp$annotations", "getSp", "TextUnit", "value", "type", "Landroidx/compose/ui/unit/TextUnitType;", "TextUnit-anM5pPY", "(FJ)J", "checkArithmetic", "", "a", "checkArithmetic--R2X_6o", "b", "checkArithmetic-NB67dxo", "(JJ)V", "c", "checkArithmetic-vU-0ePk", "(JJJ)V", "lerp", "start", "stop", "fraction", "lerp-C3pnCVY", "(JJF)J", "pack", "unitType", "v", "(JF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-eAf_CNQ", "(JLkotlin/jvm/functions/Function0;)J", "times", "other", "times-mpE4wyQ", "(DJ)J", "(IJ)J", "ui-unit_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    @ExperimentalUnitApi
    /* renamed from: TextUnit-anM5pPY  reason: not valid java name */
    public static final long m3518TextUnitanM5pPY(float f2, long j2) {
        return pack(j2, f2);
    }

    @PublishedApi
    /* renamed from: checkArithmetic--R2X_6o  reason: not valid java name */
    public static final void m3519checkArithmeticR2X_6o(long j2) {
        if (!(!m3524isUnspecifiedR2X_6o(j2))) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
    }

    @PublishedApi
    /* renamed from: checkArithmetic-NB67dxo  reason: not valid java name */
    public static final void m3520checkArithmeticNB67dxo(long j2, long j3) {
        if (!((m3524isUnspecifiedR2X_6o(j2) || m3524isUnspecifiedR2X_6o(j3)) ? false : true)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (TextUnitType.m3534equalsimpl0(TextUnit.m3505getTypeUIouoOA(j2), TextUnit.m3505getTypeUIouoOA(j3))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m3536toStringimpl(TextUnit.m3505getTypeUIouoOA(j2))) + " and " + ((Object) TextUnitType.m3536toStringimpl(TextUnit.m3505getTypeUIouoOA(j3)))).toString());
    }

    @PublishedApi
    /* renamed from: checkArithmetic-vU-0ePk  reason: not valid java name */
    public static final void m3521checkArithmeticvU0ePk(long j2, long j3, long j4) {
        boolean z = true;
        if (!((m3524isUnspecifiedR2X_6o(j2) || m3524isUnspecifiedR2X_6o(j3) || m3524isUnspecifiedR2X_6o(j4)) ? false : true)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (!TextUnitType.m3534equalsimpl0(TextUnit.m3505getTypeUIouoOA(j2), TextUnit.m3505getTypeUIouoOA(j3)) || !TextUnitType.m3534equalsimpl0(TextUnit.m3505getTypeUIouoOA(j3), TextUnit.m3505getTypeUIouoOA(j4))) {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m3536toStringimpl(TextUnit.m3505getTypeUIouoOA(j2))) + " and " + ((Object) TextUnitType.m3536toStringimpl(TextUnit.m3505getTypeUIouoOA(j3)))).toString());
    }

    public static final long getEm(double d2) {
        return pack(UNIT_TYPE_EM, (float) d2);
    }

    public static final long getEm(float f2) {
        return pack(UNIT_TYPE_EM, f2);
    }

    public static final long getEm(int i2) {
        return pack(UNIT_TYPE_EM, i2);
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(double d2) {
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(float f2) {
    }

    @Stable
    public static /* synthetic */ void getEm$annotations(int i2) {
    }

    public static final long getSp(double d2) {
        return pack(UNIT_TYPE_SP, (float) d2);
    }

    public static final long getSp(float f2) {
        return pack(UNIT_TYPE_SP, f2);
    }

    public static final long getSp(int i2) {
        return pack(UNIT_TYPE_SP, i2);
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(double d2) {
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(float f2) {
    }

    @Stable
    public static /* synthetic */ void getSp$annotations(int i2) {
    }

    /* renamed from: isSpecified--R2X_6o  reason: not valid java name */
    public static final boolean m3522isSpecifiedR2X_6o(long j2) {
        return !m3524isUnspecifiedR2X_6o(j2);
    }

    @Stable
    /* renamed from: isSpecified--R2X_6o$annotations  reason: not valid java name */
    public static /* synthetic */ void m3523isSpecifiedR2X_6o$annotations(long j2) {
    }

    /* renamed from: isUnspecified--R2X_6o  reason: not valid java name */
    public static final boolean m3524isUnspecifiedR2X_6o(long j2) {
        return TextUnit.m3504getRawTypeimpl(j2) == 0;
    }

    @Stable
    /* renamed from: isUnspecified--R2X_6o$annotations  reason: not valid java name */
    public static /* synthetic */ void m3525isUnspecifiedR2X_6o$annotations(long j2) {
    }

    @Stable
    /* renamed from: lerp-C3pnCVY  reason: not valid java name */
    public static final long m3526lerpC3pnCVY(long j2, long j3, float f2) {
        m3520checkArithmeticNB67dxo(j2, j3);
        return pack(TextUnit.m3504getRawTypeimpl(j2), MathHelpersKt.lerp(TextUnit.m3506getValueimpl(j2), TextUnit.m3506getValueimpl(j3), f2));
    }

    @PublishedApi
    public static final long pack(long j2, float f2) {
        return TextUnit.m3498constructorimpl(j2 | (Float.floatToIntBits(f2) & 4294967295L));
    }

    /* renamed from: takeOrElse-eAf_CNQ  reason: not valid java name */
    public static final long m3527takeOrElseeAf_CNQ(long j2, @NotNull Function0<TextUnit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return m3524isUnspecifiedR2X_6o(j2) ^ true ? j2 : block.invoke().m3515unboximpl();
    }

    @Stable
    /* renamed from: times-mpE4wyQ  reason: not valid java name */
    public static final long m3528timesmpE4wyQ(double d2, long j2) {
        m3519checkArithmeticR2X_6o(j2);
        return pack(TextUnit.m3504getRawTypeimpl(j2), ((float) d2) * TextUnit.m3506getValueimpl(j2));
    }

    @Stable
    /* renamed from: times-mpE4wyQ  reason: not valid java name */
    public static final long m3529timesmpE4wyQ(float f2, long j2) {
        m3519checkArithmeticR2X_6o(j2);
        return pack(TextUnit.m3504getRawTypeimpl(j2), f2 * TextUnit.m3506getValueimpl(j2));
    }

    @Stable
    /* renamed from: times-mpE4wyQ  reason: not valid java name */
    public static final long m3530timesmpE4wyQ(int i2, long j2) {
        m3519checkArithmeticR2X_6o(j2);
        return pack(TextUnit.m3504getRawTypeimpl(j2), i2 * TextUnit.m3506getValueimpl(j2));
    }
}
