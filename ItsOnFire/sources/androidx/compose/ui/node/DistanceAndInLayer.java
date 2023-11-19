package androidx.compose.ui.node;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.FloatCompanionObject;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/node/DistanceAndInLayer;", "", "packedValue", "", "constructor-impl", "(J)J", "distance", "", "getDistance-impl", "(J)F", "isInLayer", "", "isInLayer-impl", "(J)Z", "getPackedValue", "()J", "compareTo", "", "other", "compareTo-S_HNhKs", "(JJ)I", "equals", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: classes.dex */
final class DistanceAndInLayer {
    private final long packedValue;

    private /* synthetic */ DistanceAndInLayer(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ DistanceAndInLayer m2852boximpl(long j2) {
        return new DistanceAndInLayer(j2);
    }

    /* renamed from: compareTo-S_HNhKs  reason: not valid java name */
    public static final int m2853compareToS_HNhKs(long j2, long j3) {
        boolean m2859isInLayerimpl = m2859isInLayerimpl(j2);
        return m2859isInLayerimpl != m2859isInLayerimpl(j3) ? m2859isInLayerimpl ? -1 : 1 : (int) Math.signum(m2857getDistanceimpl(j2) - m2857getDistanceimpl(j3));
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m2854constructorimpl(long j2) {
        return j2;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2855equalsimpl(long j2, Object obj) {
        return (obj instanceof DistanceAndInLayer) && j2 == ((DistanceAndInLayer) obj).m2861unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2856equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getDistance-impl  reason: not valid java name */
    public static final float m2857getDistanceimpl(long j2) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2858hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    /* renamed from: isInLayer-impl  reason: not valid java name */
    public static final boolean m2859isInLayerimpl(long j2) {
        return ((int) (j2 & 4294967295L)) != 0;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2860toStringimpl(long j2) {
        return "DistanceAndInLayer(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m2855equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m2858hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m2860toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m2861unboximpl() {
        return this.packedValue;
    }
}
