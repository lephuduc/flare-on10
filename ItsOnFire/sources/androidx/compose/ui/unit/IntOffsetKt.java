package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.math.MathKt__MathJVMKt;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a-\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\"\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\"\u0010\r\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0011\u001a\"\u0010\u0013\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0011\u001a\"\u0010\u0013\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0011\u001a\u001a\u0010\u0016\u001a\u00020\u0001*\u00020\u000eH\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001a\u0010\u0019\u001a\u00020\u000e*\u00020\u0001H\u0087\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0018\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"IntOffset", "Landroidx/compose/ui/unit/IntOffset;", "x", "", "y", "(II)J", "lerp", "start", "stop", "fraction", "", "lerp-81ZRxRo", "(JJF)J", "minus", "Landroidx/compose/ui/geometry/Offset;", "offset", "minus-Nv-tHpc", "(JJ)J", "minus-oCl6YwE", "plus", "plus-Nv-tHpc", "plus-oCl6YwE", "round", "round-k-4lQ0M", "(J)J", "toOffset", "toOffset--gyyYBs", "ui-unit_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class IntOffsetKt {
    @Stable
    public static final long IntOffset(int i2, int i3) {
        return IntOffset.m3437constructorimpl((i3 & 4294967295L) | (i2 << 32));
    }

    @Stable
    /* renamed from: lerp-81ZRxRo  reason: not valid java name */
    public static final long m3454lerp81ZRxRo(long j2, long j3, float f2) {
        return IntOffset(MathHelpersKt.lerp(IntOffset.m3443getXimpl(j2), IntOffset.m3443getXimpl(j3), f2), MathHelpersKt.lerp(IntOffset.m3444getYimpl(j2), IntOffset.m3444getYimpl(j3), f2));
    }

    @Stable
    /* renamed from: minus-Nv-tHpc  reason: not valid java name */
    public static final long m3455minusNvtHpc(long j2, long j3) {
        return OffsetKt.Offset(Offset.m1161getXimpl(j2) - IntOffset.m3443getXimpl(j3), Offset.m1162getYimpl(j2) - IntOffset.m3444getYimpl(j3));
    }

    @Stable
    /* renamed from: minus-oCl6YwE  reason: not valid java name */
    public static final long m3456minusoCl6YwE(long j2, long j3) {
        return OffsetKt.Offset(IntOffset.m3443getXimpl(j2) - Offset.m1161getXimpl(j3), IntOffset.m3444getYimpl(j2) - Offset.m1162getYimpl(j3));
    }

    @Stable
    /* renamed from: plus-Nv-tHpc  reason: not valid java name */
    public static final long m3457plusNvtHpc(long j2, long j3) {
        return OffsetKt.Offset(Offset.m1161getXimpl(j2) + IntOffset.m3443getXimpl(j3), Offset.m1162getYimpl(j2) + IntOffset.m3444getYimpl(j3));
    }

    @Stable
    /* renamed from: plus-oCl6YwE  reason: not valid java name */
    public static final long m3458plusoCl6YwE(long j2, long j3) {
        return OffsetKt.Offset(IntOffset.m3443getXimpl(j2) + Offset.m1161getXimpl(j3), IntOffset.m3444getYimpl(j2) + Offset.m1162getYimpl(j3));
    }

    @Stable
    /* renamed from: round-k-4lQ0M  reason: not valid java name */
    public static final long m3459roundk4lQ0M(long j2) {
        int roundToInt;
        int roundToInt2;
        roundToInt = MathKt__MathJVMKt.roundToInt(Offset.m1161getXimpl(j2));
        roundToInt2 = MathKt__MathJVMKt.roundToInt(Offset.m1162getYimpl(j2));
        return IntOffset(roundToInt, roundToInt2);
    }

    @Stable
    /* renamed from: toOffset--gyyYBs  reason: not valid java name */
    public static final long m3460toOffsetgyyYBs(long j2) {
        return OffsetKt.Offset(IntOffset.m3443getXimpl(j2), IntOffset.m3444getYimpl(j2));
    }
}
