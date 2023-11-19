package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\u001a8\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002\u001a\u001f\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u000b\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000e\u001a!\u0010\u0012\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0015\u001a!\u0010\u0019\u001a\u00020\u001a*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010\u001d\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Constraints", "Landroidx/compose/ui/unit/Constraints;", "minWidth", "", "maxWidth", "minHeight", "maxHeight", "(IIII)J", "addMaxWithMinimum", "max", "value", "constrain", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "Landroidx/compose/ui/unit/IntSize;", "size", "constrain-4WqzIAM", "constrainHeight", "height", "constrainHeight-K40F9xA", "(JI)I", "constrainWidth", "width", "constrainWidth-K40F9xA", "isSatisfiedBy", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", "offset", "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "ui-unit_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ConstraintsKt {
    @Stable
    public static final long Constraints(int i2, int i3, int i4, int i5) {
        boolean z = true;
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("maxWidth(" + i3 + ") must be >= than minWidth(" + i2 + ')').toString());
        }
        if (!(i5 >= i4)) {
            throw new IllegalArgumentException(("maxHeight(" + i5 + ") must be >= than minHeight(" + i4 + ')').toString());
        }
        if (i2 < 0 || i4 < 0) {
            z = false;
        }
        if (z) {
            return Constraints.Companion.m3300createConstraintsZbe2FdA$ui_unit_release(i2, i3, i4, i5);
        }
        throw new IllegalArgumentException(("minWidth(" + i2 + ") and minHeight(" + i4 + ") must be >= 0").toString());
    }

    public static /* synthetic */ long Constraints$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = 0;
        }
        if ((i6 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return Constraints(i2, i3, i4, i5);
    }

    private static final int addMaxWithMinimum(int i2, int i3) {
        int coerceAtLeast;
        if (i2 == Integer.MAX_VALUE) {
            return i2;
        }
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i2 + i3, 0);
        return coerceAtLeast;
    }

    @Stable
    /* renamed from: constrain-4WqzIAM  reason: not valid java name */
    public static final long m3304constrain4WqzIAM(long j2, long j3) {
        int coerceIn;
        int coerceIn2;
        coerceIn = RangesKt___RangesKt.coerceIn(IntSize.m3485getWidthimpl(j3), Constraints.m3295getMinWidthimpl(j2), Constraints.m3293getMaxWidthimpl(j2));
        coerceIn2 = RangesKt___RangesKt.coerceIn(IntSize.m3484getHeightimpl(j3), Constraints.m3294getMinHeightimpl(j2), Constraints.m3292getMaxHeightimpl(j2));
        return IntSizeKt.IntSize(coerceIn, coerceIn2);
    }

    /* renamed from: constrain-N9IONVI  reason: not valid java name */
    public static final long m3305constrainN9IONVI(long j2, long j3) {
        int coerceIn;
        int coerceIn2;
        int coerceIn3;
        int coerceIn4;
        coerceIn = RangesKt___RangesKt.coerceIn(Constraints.m3295getMinWidthimpl(j3), Constraints.m3295getMinWidthimpl(j2), Constraints.m3293getMaxWidthimpl(j2));
        coerceIn2 = RangesKt___RangesKt.coerceIn(Constraints.m3293getMaxWidthimpl(j3), Constraints.m3295getMinWidthimpl(j2), Constraints.m3293getMaxWidthimpl(j2));
        coerceIn3 = RangesKt___RangesKt.coerceIn(Constraints.m3294getMinHeightimpl(j3), Constraints.m3294getMinHeightimpl(j2), Constraints.m3292getMaxHeightimpl(j2));
        coerceIn4 = RangesKt___RangesKt.coerceIn(Constraints.m3292getMaxHeightimpl(j3), Constraints.m3294getMinHeightimpl(j2), Constraints.m3292getMaxHeightimpl(j2));
        return Constraints(coerceIn, coerceIn2, coerceIn3, coerceIn4);
    }

    @Stable
    /* renamed from: constrainHeight-K40F9xA  reason: not valid java name */
    public static final int m3306constrainHeightK40F9xA(long j2, int i2) {
        int coerceIn;
        coerceIn = RangesKt___RangesKt.coerceIn(i2, Constraints.m3294getMinHeightimpl(j2), Constraints.m3292getMaxHeightimpl(j2));
        return coerceIn;
    }

    @Stable
    /* renamed from: constrainWidth-K40F9xA  reason: not valid java name */
    public static final int m3307constrainWidthK40F9xA(long j2, int i2) {
        int coerceIn;
        coerceIn = RangesKt___RangesKt.coerceIn(i2, Constraints.m3295getMinWidthimpl(j2), Constraints.m3293getMaxWidthimpl(j2));
        return coerceIn;
    }

    @Stable
    /* renamed from: isSatisfiedBy-4WqzIAM  reason: not valid java name */
    public static final boolean m3308isSatisfiedBy4WqzIAM(long j2, long j3) {
        int m3295getMinWidthimpl = Constraints.m3295getMinWidthimpl(j2);
        int m3293getMaxWidthimpl = Constraints.m3293getMaxWidthimpl(j2);
        int m3485getWidthimpl = IntSize.m3485getWidthimpl(j3);
        if (m3295getMinWidthimpl <= m3485getWidthimpl && m3485getWidthimpl <= m3293getMaxWidthimpl) {
            int m3294getMinHeightimpl = Constraints.m3294getMinHeightimpl(j2);
            int m3292getMaxHeightimpl = Constraints.m3292getMaxHeightimpl(j2);
            int m3484getHeightimpl = IntSize.m3484getHeightimpl(j3);
            if (m3294getMinHeightimpl <= m3484getHeightimpl && m3484getHeightimpl <= m3292getMaxHeightimpl) {
                return true;
            }
        }
        return false;
    }

    @Stable
    /* renamed from: offset-NN6Ew-U  reason: not valid java name */
    public static final long m3309offsetNN6EwU(long j2, int i2, int i3) {
        int coerceAtLeast;
        int coerceAtLeast2;
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(Constraints.m3295getMinWidthimpl(j2) + i2, 0);
        int addMaxWithMinimum = addMaxWithMinimum(Constraints.m3293getMaxWidthimpl(j2), i2);
        coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(Constraints.m3294getMinHeightimpl(j2) + i3, 0);
        return Constraints(coerceAtLeast, addMaxWithMinimum, coerceAtLeast2, addMaxWithMinimum(Constraints.m3292getMaxHeightimpl(j2), i3));
    }

    /* renamed from: offset-NN6Ew-U$default  reason: not valid java name */
    public static /* synthetic */ long m3310offsetNN6EwU$default(long j2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return m3309offsetNN6EwU(j2, i2, i3);
    }
}
