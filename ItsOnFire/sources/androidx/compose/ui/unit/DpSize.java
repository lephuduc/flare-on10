package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0010\u001a\u00020\u0007H\u0087\nø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0019\u0010\u0012\u001a\u00020\u0007H\u0087\nø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u001cH\u0087\u0002ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001e\u0010%\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010'J!\u0010*\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b+\u0010\u001bJ!\u0010*\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u001cH\u0087\u0002ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b+\u0010\u001dJ\u000f\u0010,\u001a\u00020-H\u0017¢\u0006\u0004\b.\u0010/R#\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\tR#\u0010\r\u001a\u00020\u00078FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/ui/unit/DpSize;", "", "packedValue", "", "constructor-impl", "(J)J", "height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM$annotations", "()V", "getHeight-D9Ej5fM", "(J)F", "getPackedValue$annotations", "width", "getWidth-D9Ej5fM$annotations", "getWidth-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "copy", "copy-DwJknco", "(JFF)J", "div", "other", "", "div-Gh9hcWk", "(JF)J", "", "(JI)J", "equals", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(J)I", "minus", "minus-e_xh8Ic", "(JJ)J", "plus", "plus-e_xh8Ic", "times", "times-Gh9hcWk", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: classes.dex */
public final class DpSize {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified;
    private static final long Zero;
    private final long packedValue;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/unit/DpSize$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/unit/DpSize;", "getUnspecified-MYxV2XQ", "()J", "J", "Zero", "getZero-MYxV2XQ", "ui-unit_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getUnspecified-MYxV2XQ  reason: not valid java name */
        public final long m3432getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }

        /* renamed from: getZero-MYxV2XQ  reason: not valid java name */
        public final long m3433getZeroMYxV2XQ() {
            return DpSize.Zero;
        }
    }

    static {
        float f2 = 0;
        Zero = DpKt.m3347DpSizeYgX7TsA(Dp.m3325constructorimpl(f2), Dp.m3325constructorimpl(f2));
        Dp.Companion companion = Dp.Companion;
        Unspecified = DpKt.m3347DpSizeYgX7TsA(companion.m3345getUnspecifiedD9Ej5fM(), companion.m3345getUnspecifiedD9Ej5fM());
    }

    private /* synthetic */ DpSize(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ DpSize m3411boximpl(long j2) {
        return new DpSize(j2);
    }

    @Stable
    /* renamed from: component1-D9Ej5fM  reason: not valid java name */
    public static final float m3412component1D9Ej5fM(long j2) {
        return m3423getWidthD9Ej5fM(j2);
    }

    @Stable
    /* renamed from: component2-D9Ej5fM  reason: not valid java name */
    public static final float m3413component2D9Ej5fM(long j2) {
        return m3421getHeightD9Ej5fM(j2);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m3414constructorimpl(long j2) {
        return j2;
    }

    /* renamed from: copy-DwJknco  reason: not valid java name */
    public static final long m3415copyDwJknco(long j2, float f2, float f3) {
        return DpKt.m3347DpSizeYgX7TsA(f2, f3);
    }

    /* renamed from: copy-DwJknco$default  reason: not valid java name */
    public static /* synthetic */ long m3416copyDwJknco$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = m3423getWidthD9Ej5fM(j2);
        }
        if ((i2 & 2) != 0) {
            f3 = m3421getHeightD9Ej5fM(j2);
        }
        return m3415copyDwJknco(j2, f2, f3);
    }

    @Stable
    /* renamed from: div-Gh9hcWk  reason: not valid java name */
    public static final long m3417divGh9hcWk(long j2, float f2) {
        return DpKt.m3347DpSizeYgX7TsA(Dp.m3325constructorimpl(m3423getWidthD9Ej5fM(j2) / f2), Dp.m3325constructorimpl(m3421getHeightD9Ej5fM(j2) / f2));
    }

    @Stable
    /* renamed from: div-Gh9hcWk  reason: not valid java name */
    public static final long m3418divGh9hcWk(long j2, int i2) {
        float f2 = i2;
        return DpKt.m3347DpSizeYgX7TsA(Dp.m3325constructorimpl(m3423getWidthD9Ej5fM(j2) / f2), Dp.m3325constructorimpl(m3421getHeightD9Ej5fM(j2) / f2));
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m3419equalsimpl(long j2, Object obj) {
        return (obj instanceof DpSize) && j2 == ((DpSize) obj).m3431unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m3420equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getHeight-D9Ej5fM  reason: not valid java name */
    public static final float m3421getHeightD9Ej5fM(long j2) {
        if (j2 != Unspecified) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Dp.m3325constructorimpl(Float.intBitsToFloat((int) (j2 & 4294967295L)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    @Stable
    /* renamed from: getHeight-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m3422getHeightD9Ej5fM$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getWidth-D9Ej5fM  reason: not valid java name */
    public static final float m3423getWidthD9Ej5fM(long j2) {
        if (j2 != Unspecified) {
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            return Dp.m3325constructorimpl(Float.intBitsToFloat((int) (j2 >> 32)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    @Stable
    /* renamed from: getWidth-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m3424getWidthD9Ej5fM$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m3425hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    @Stable
    /* renamed from: minus-e_xh8Ic  reason: not valid java name */
    public static final long m3426minuse_xh8Ic(long j2, long j3) {
        return DpKt.m3347DpSizeYgX7TsA(Dp.m3325constructorimpl(m3423getWidthD9Ej5fM(j2) - m3423getWidthD9Ej5fM(j3)), Dp.m3325constructorimpl(m3421getHeightD9Ej5fM(j2) - m3421getHeightD9Ej5fM(j3)));
    }

    @Stable
    /* renamed from: plus-e_xh8Ic  reason: not valid java name */
    public static final long m3427pluse_xh8Ic(long j2, long j3) {
        return DpKt.m3347DpSizeYgX7TsA(Dp.m3325constructorimpl(m3423getWidthD9Ej5fM(j2) + m3423getWidthD9Ej5fM(j3)), Dp.m3325constructorimpl(m3421getHeightD9Ej5fM(j2) + m3421getHeightD9Ej5fM(j3)));
    }

    @Stable
    /* renamed from: times-Gh9hcWk  reason: not valid java name */
    public static final long m3428timesGh9hcWk(long j2, float f2) {
        return DpKt.m3347DpSizeYgX7TsA(Dp.m3325constructorimpl(m3423getWidthD9Ej5fM(j2) * f2), Dp.m3325constructorimpl(m3421getHeightD9Ej5fM(j2) * f2));
    }

    @Stable
    /* renamed from: times-Gh9hcWk  reason: not valid java name */
    public static final long m3429timesGh9hcWk(long j2, int i2) {
        float f2 = i2;
        return DpKt.m3347DpSizeYgX7TsA(Dp.m3325constructorimpl(m3423getWidthD9Ej5fM(j2) * f2), Dp.m3325constructorimpl(m3421getHeightD9Ej5fM(j2) * f2));
    }

    @Stable
    @NotNull
    /* renamed from: toString-impl  reason: not valid java name */
    public static String m3430toStringimpl(long j2) {
        if (j2 != Companion.m3432getUnspecifiedMYxV2XQ()) {
            return ((Object) Dp.m3336toStringimpl(m3423getWidthD9Ej5fM(j2))) + " x " + ((Object) Dp.m3336toStringimpl(m3421getHeightD9Ej5fM(j2)));
        }
        return "DpSize.Unspecified";
    }

    public boolean equals(Object obj) {
        return m3419equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3425hashCodeimpl(this.packedValue);
    }

    @Stable
    @NotNull
    public String toString() {
        return m3430toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m3431unboximpl() {
        return this.packedValue;
    }
}
