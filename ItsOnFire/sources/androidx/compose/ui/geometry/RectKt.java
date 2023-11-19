package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0006\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a \u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\rH\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Rect", "Landroidx/compose/ui/geometry/Rect;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "bottomRight", "Rect-0a9Yr6o", "(JJ)Landroidx/compose/ui/geometry/Rect;", "offset", "size", "Landroidx/compose/ui/geometry/Size;", "Rect-tz77jQw", "center", "radius", "", "Rect-3MmeM6k", "(JF)Landroidx/compose/ui/geometry/Rect;", "lerp", "start", "stop", "fraction", "ui-geometry_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class RectKt {
    @Stable
    @NotNull
    /* renamed from: Rect-0a9Yr6o  reason: not valid java name */
    public static final Rect m1199Rect0a9Yr6o(long j2, long j3) {
        return new Rect(Offset.m1161getXimpl(j2), Offset.m1162getYimpl(j2), Offset.m1161getXimpl(j3), Offset.m1162getYimpl(j3));
    }

    @Stable
    @NotNull
    /* renamed from: Rect-3MmeM6k  reason: not valid java name */
    public static final Rect m1200Rect3MmeM6k(long j2, float f2) {
        return new Rect(Offset.m1161getXimpl(j2) - f2, Offset.m1162getYimpl(j2) - f2, Offset.m1161getXimpl(j2) + f2, Offset.m1162getYimpl(j2) + f2);
    }

    @Stable
    @NotNull
    /* renamed from: Rect-tz77jQw  reason: not valid java name */
    public static final Rect m1201Recttz77jQw(long j2, long j3) {
        return new Rect(Offset.m1161getXimpl(j2), Offset.m1162getYimpl(j2), Offset.m1161getXimpl(j2) + Size.m1230getWidthimpl(j3), Offset.m1162getYimpl(j2) + Size.m1227getHeightimpl(j3));
    }

    @Stable
    @NotNull
    public static final Rect lerp(@NotNull Rect start, @NotNull Rect stop, float f2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new Rect(MathHelpersKt.lerp(start.getLeft(), stop.getLeft(), f2), MathHelpersKt.lerp(start.getTop(), stop.getTop(), f2), MathHelpersKt.lerp(start.getRight(), stop.getRight(), f2), MathHelpersKt.lerp(start.getBottom(), stop.getBottom(), f2));
    }
}
