package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0006\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a \u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"IntRect", "Landroidx/compose/ui/unit/IntRect;", "topLeft", "Landroidx/compose/ui/unit/IntOffset;", "bottomRight", "IntRect-E1MhUcY", "(JJ)Landroidx/compose/ui/unit/IntRect;", "offset", "size", "Landroidx/compose/ui/unit/IntSize;", "IntRect-VbeCjmY", "center", "radius", "", "IntRect-ar5cAso", "(JI)Landroidx/compose/ui/unit/IntRect;", "lerp", "start", "stop", "fraction", "", "ui-unit_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class IntRectKt {
    @Stable
    @NotNull
    /* renamed from: IntRect-E1MhUcY  reason: not valid java name */
    public static final IntRect m3474IntRectE1MhUcY(long j2, long j3) {
        return new IntRect(IntOffset.m3443getXimpl(j2), IntOffset.m3444getYimpl(j2), IntOffset.m3443getXimpl(j3), IntOffset.m3444getYimpl(j3));
    }

    @Stable
    @NotNull
    /* renamed from: IntRect-VbeCjmY  reason: not valid java name */
    public static final IntRect m3475IntRectVbeCjmY(long j2, long j3) {
        return new IntRect(IntOffset.m3443getXimpl(j2), IntOffset.m3444getYimpl(j2), IntOffset.m3443getXimpl(j2) + IntSize.m3485getWidthimpl(j3), IntOffset.m3444getYimpl(j2) + IntSize.m3484getHeightimpl(j3));
    }

    @Stable
    @NotNull
    /* renamed from: IntRect-ar5cAso  reason: not valid java name */
    public static final IntRect m3476IntRectar5cAso(long j2, int i2) {
        return new IntRect(IntOffset.m3443getXimpl(j2) - i2, IntOffset.m3444getYimpl(j2) - i2, IntOffset.m3443getXimpl(j2) + i2, IntOffset.m3444getYimpl(j2) + i2);
    }

    @Stable
    @NotNull
    public static final IntRect lerp(@NotNull IntRect start, @NotNull IntRect stop, float f2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new IntRect(MathHelpersKt.lerp(start.getLeft(), stop.getLeft(), f2), MathHelpersKt.lerp(start.getTop(), stop.getTop(), f2), MathHelpersKt.lerp(start.getRight(), stop.getRight(), f2), MathHelpersKt.lerp(start.getBottom(), stop.getBottom(), f2));
    }
}
