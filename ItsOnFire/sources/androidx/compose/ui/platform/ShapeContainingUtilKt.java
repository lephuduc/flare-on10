package androidx.compose.ui.platform;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0000\u001a4\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002\u001a \u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a4\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0002\u001a=\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u0001*\u00020\u001bH\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"isInOutline", "", "outline", "Landroidx/compose/ui/graphics/Outline;", "x", "", "y", "tmpTouchPointPath", "Landroidx/compose/ui/graphics/Path;", "tmpOpPath", "isInPath", "path", "isInRectangle", "rect", "Landroidx/compose/ui/geometry/Rect;", "isInRoundedRect", "Landroidx/compose/ui/graphics/Outline$Rounded;", "touchPointPath", "opPath", "isWithinEllipse", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "centerX", "centerY", "isWithinEllipse-VE1yxkc", "(FFJFF)Z", "cornersFit", "Landroidx/compose/ui/geometry/RoundRect;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ShapeContainingUtilKt {
    private static final boolean cornersFit(RoundRect roundRect) {
        return CornerRadius.m1136getXimpl(roundRect.m1211getTopLeftCornerRadiuskKHJgLs()) + CornerRadius.m1136getXimpl(roundRect.m1212getTopRightCornerRadiuskKHJgLs()) <= roundRect.getWidth() && CornerRadius.m1136getXimpl(roundRect.m1209getBottomLeftCornerRadiuskKHJgLs()) + CornerRadius.m1136getXimpl(roundRect.m1210getBottomRightCornerRadiuskKHJgLs()) <= roundRect.getWidth() && CornerRadius.m1137getYimpl(roundRect.m1211getTopLeftCornerRadiuskKHJgLs()) + CornerRadius.m1137getYimpl(roundRect.m1209getBottomLeftCornerRadiuskKHJgLs()) <= roundRect.getHeight() && CornerRadius.m1137getYimpl(roundRect.m1212getTopRightCornerRadiuskKHJgLs()) + CornerRadius.m1137getYimpl(roundRect.m1210getBottomRightCornerRadiuskKHJgLs()) <= roundRect.getHeight();
    }

    public static final boolean isInOutline(@NotNull Outline outline, float f2, float f3, @Nullable Path path, @Nullable Path path2) {
        Intrinsics.checkNotNullParameter(outline, "outline");
        if (outline instanceof Outline.Rectangle) {
            return isInRectangle(((Outline.Rectangle) outline).getRect(), f2, f3);
        }
        if (outline instanceof Outline.Rounded) {
            return isInRoundedRect((Outline.Rounded) outline, f2, f3, path, path2);
        }
        if (outline instanceof Outline.Generic) {
            return isInPath(((Outline.Generic) outline).getPath(), f2, f3, path, path2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean isInOutline$default(Outline outline, float f2, float f3, Path path, Path path2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            path = null;
        }
        if ((i2 & 16) != 0) {
            path2 = null;
        }
        return isInOutline(outline, f2, f3, path, path2);
    }

    private static final boolean isInPath(Path path, float f2, float f3, Path path2, Path path3) {
        Rect rect = new Rect(f2 - 0.005f, f3 - 0.005f, f2 + 0.005f, f3 + 0.005f);
        if (path2 == null) {
            path2 = AndroidPath_androidKt.Path();
        }
        path2.addRect(rect);
        if (path3 == null) {
            path3 = AndroidPath_androidKt.Path();
        }
        path3.mo1295opN5in7k0(path, path2, PathOperation.Companion.m1618getIntersectb3I0S0c());
        boolean isEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !isEmpty;
    }

    private static final boolean isInRectangle(Rect rect, float f2, float f3) {
        return rect.getLeft() <= f2 && f2 < rect.getRight() && rect.getTop() <= f3 && f3 < rect.getBottom();
    }

    private static final boolean isInRoundedRect(Outline.Rounded rounded, float f2, float f3, Path path, Path path2) {
        long m1210getBottomRightCornerRadiuskKHJgLs;
        float f4;
        float f5;
        RoundRect roundRect = rounded.getRoundRect();
        if (f2 < roundRect.getLeft() || f2 >= roundRect.getRight() || f3 < roundRect.getTop() || f3 >= roundRect.getBottom()) {
            return false;
        }
        if (!cornersFit(roundRect)) {
            Path Path = path2 == null ? AndroidPath_androidKt.Path() : path2;
            Path.addRoundRect(roundRect);
            return isInPath(Path, f2, f3, path, path2);
        }
        float m1136getXimpl = CornerRadius.m1136getXimpl(roundRect.m1211getTopLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
        float m1137getYimpl = CornerRadius.m1137getYimpl(roundRect.m1211getTopLeftCornerRadiuskKHJgLs()) + roundRect.getTop();
        float right = roundRect.getRight() - CornerRadius.m1136getXimpl(roundRect.m1212getTopRightCornerRadiuskKHJgLs());
        float m1137getYimpl2 = CornerRadius.m1137getYimpl(roundRect.m1212getTopRightCornerRadiuskKHJgLs()) + roundRect.getTop();
        float right2 = roundRect.getRight() - CornerRadius.m1136getXimpl(roundRect.m1210getBottomRightCornerRadiuskKHJgLs());
        float bottom = roundRect.getBottom() - CornerRadius.m1137getYimpl(roundRect.m1210getBottomRightCornerRadiuskKHJgLs());
        float bottom2 = roundRect.getBottom() - CornerRadius.m1137getYimpl(roundRect.m1209getBottomLeftCornerRadiuskKHJgLs());
        float m1136getXimpl2 = CornerRadius.m1136getXimpl(roundRect.m1209getBottomLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
        if (f2 < m1136getXimpl && f3 < m1137getYimpl) {
            m1210getBottomRightCornerRadiuskKHJgLs = roundRect.m1211getTopLeftCornerRadiuskKHJgLs();
            f4 = f2;
            f5 = f3;
        } else if (f2 < m1136getXimpl2 && f3 > bottom2) {
            m1210getBottomRightCornerRadiuskKHJgLs = roundRect.m1209getBottomLeftCornerRadiuskKHJgLs();
            f4 = f2;
            f5 = f3;
            m1136getXimpl = m1136getXimpl2;
            m1137getYimpl = bottom2;
        } else if (f2 > right && f3 < m1137getYimpl2) {
            m1210getBottomRightCornerRadiuskKHJgLs = roundRect.m1212getTopRightCornerRadiuskKHJgLs();
            f4 = f2;
            f5 = f3;
            m1136getXimpl = right;
            m1137getYimpl = m1137getYimpl2;
        } else if (f2 <= right2 || f3 <= bottom) {
            return true;
        } else {
            m1210getBottomRightCornerRadiuskKHJgLs = roundRect.m1210getBottomRightCornerRadiuskKHJgLs();
            f4 = f2;
            f5 = f3;
            m1136getXimpl = right2;
            m1137getYimpl = bottom;
        }
        return m2962isWithinEllipseVE1yxkc(f4, f5, m1210getBottomRightCornerRadiuskKHJgLs, m1136getXimpl, m1137getYimpl);
    }

    /* renamed from: isWithinEllipse-VE1yxkc  reason: not valid java name */
    private static final boolean m2962isWithinEllipseVE1yxkc(float f2, float f3, long j2, float f4, float f5) {
        float f6 = f2 - f4;
        float f7 = f3 - f5;
        float m1136getXimpl = CornerRadius.m1136getXimpl(j2);
        float m1137getYimpl = CornerRadius.m1137getYimpl(j2);
        return ((f6 * f6) / (m1136getXimpl * m1136getXimpl)) + ((f7 * f7) / (m1137getYimpl * m1137getYimpl)) <= 1.0f;
    }
}
