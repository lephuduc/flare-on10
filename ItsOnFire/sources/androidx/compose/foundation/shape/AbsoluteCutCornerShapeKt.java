package androidx.compose.foundation.shape;

import androidx.appcompat.R;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a;\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\u000e\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"AbsoluteCutCornerShape", "Landroidx/compose/foundation/shape/AbsoluteCutCornerShape;", "corner", "Landroidx/compose/foundation/shape/CornerSize;", "size", "Landroidx/compose/ui/unit/Dp;", "AbsoluteCutCornerShape-0680j_4", "(F)Landroidx/compose/foundation/shape/AbsoluteCutCornerShape;", "topLeft", "topRight", "bottomRight", "bottomLeft", "AbsoluteCutCornerShape-a9UjIt4", "(FFFF)Landroidx/compose/foundation/shape/AbsoluteCutCornerShape;", "", "percent", "", "topLeftPercent", "topRightPercent", "bottomRightPercent", "bottomLeftPercent", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AbsoluteCutCornerShapeKt {
    @NotNull
    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(float f2) {
        return AbsoluteCutCornerShape(CornerSizeKt.CornerSize(f2));
    }

    @NotNull
    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(float f2, float f3, float f4, float f5) {
        return new AbsoluteCutCornerShape(CornerSizeKt.CornerSize(f2), CornerSizeKt.CornerSize(f3), CornerSizeKt.CornerSize(f4), CornerSizeKt.CornerSize(f5));
    }

    @NotNull
    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(int i2) {
        return AbsoluteCutCornerShape(CornerSizeKt.CornerSize(i2));
    }

    @NotNull
    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(int i2, int i3, int i4, int i5) {
        return new AbsoluteCutCornerShape(CornerSizeKt.CornerSize(i2), CornerSizeKt.CornerSize(i3), CornerSizeKt.CornerSize(i4), CornerSizeKt.CornerSize(i5));
    }

    @NotNull
    public static final AbsoluteCutCornerShape AbsoluteCutCornerShape(@NotNull CornerSize corner) {
        Intrinsics.checkNotNullParameter(corner, "corner");
        return new AbsoluteCutCornerShape(corner, corner, corner, corner);
    }

    public static /* synthetic */ AbsoluteCutCornerShape AbsoluteCutCornerShape$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return AbsoluteCutCornerShape(f2, f3, f4, f5);
    }

    public static /* synthetic */ AbsoluteCutCornerShape AbsoluteCutCornerShape$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = 0;
        }
        if ((i6 & 2) != 0) {
            i3 = 0;
        }
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = 0;
        }
        return AbsoluteCutCornerShape(i2, i3, i4, i5);
    }

    @NotNull
    /* renamed from: AbsoluteCutCornerShape-0680j_4  reason: not valid java name */
    public static final AbsoluteCutCornerShape m501AbsoluteCutCornerShape0680j_4(float f2) {
        return AbsoluteCutCornerShape(CornerSizeKt.m509CornerSize0680j_4(f2));
    }

    @NotNull
    /* renamed from: AbsoluteCutCornerShape-a9UjIt4  reason: not valid java name */
    public static final AbsoluteCutCornerShape m502AbsoluteCutCornerShapea9UjIt4(float f2, float f3, float f4, float f5) {
        return new AbsoluteCutCornerShape(CornerSizeKt.m509CornerSize0680j_4(f2), CornerSizeKt.m509CornerSize0680j_4(f3), CornerSizeKt.m509CornerSize0680j_4(f4), CornerSizeKt.m509CornerSize0680j_4(f5));
    }

    /* renamed from: AbsoluteCutCornerShape-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ AbsoluteCutCornerShape m503AbsoluteCutCornerShapea9UjIt4$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.m3325constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m3325constructorimpl(0);
        }
        if ((i2 & 4) != 0) {
            f4 = Dp.m3325constructorimpl(0);
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.m3325constructorimpl(0);
        }
        return m502AbsoluteCutCornerShapea9UjIt4(f2, f3, f4, f5);
    }
}
