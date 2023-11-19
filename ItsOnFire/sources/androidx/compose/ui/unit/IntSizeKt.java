package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\"\u0010\f\u001a\u00020\u0002*\u00020\t2\u0006\u0010\r\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0010\u001a\u00020\u0011*\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0014\u001a\u00020\u0015*\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0006\"!\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"center", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/IntSize;", "getCenter-ozmzZPI$annotations", "(J)V", "getCenter-ozmzZPI", "(J)J", "IntSize", "width", "", "height", "(II)J", "times", "size", "times-O0kMr_c", "(IJ)J", "toIntRect", "Landroidx/compose/ui/unit/IntRect;", "toIntRect-ozmzZPI", "(J)Landroidx/compose/ui/unit/IntRect;", "toSize", "Landroidx/compose/ui/geometry/Size;", "toSize-ozmzZPI", "ui-unit_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class IntSizeKt {
    @Stable
    public static final long IntSize(int i2, int i3) {
        return IntSize.m3480constructorimpl((i3 & 4294967295L) | (i2 << 32));
    }

    /* renamed from: getCenter-ozmzZPI  reason: not valid java name */
    public static final long m3491getCenterozmzZPI(long j2) {
        return IntOffsetKt.IntOffset(IntSize.m3485getWidthimpl(j2) / 2, IntSize.m3484getHeightimpl(j2) / 2);
    }

    @Stable
    /* renamed from: getCenter-ozmzZPI$annotations  reason: not valid java name */
    public static /* synthetic */ void m3492getCenterozmzZPI$annotations(long j2) {
    }

    @Stable
    /* renamed from: times-O0kMr_c  reason: not valid java name */
    public static final long m3493timesO0kMr_c(int i2, long j2) {
        return IntSize.m3487timesYEO4UFw(j2, i2);
    }

    @Stable
    @NotNull
    /* renamed from: toIntRect-ozmzZPI  reason: not valid java name */
    public static final IntRect m3494toIntRectozmzZPI(long j2) {
        return IntRectKt.m3475IntRectVbeCjmY(IntOffset.Companion.m3453getZeronOccac(), j2);
    }

    @Stable
    /* renamed from: toSize-ozmzZPI  reason: not valid java name */
    public static final long m3495toSizeozmzZPI(long j2) {
        return SizeKt.Size(IntSize.m3485getWidthimpl(j2), IntSize.m3484getHeightimpl(j2));
    }
}
