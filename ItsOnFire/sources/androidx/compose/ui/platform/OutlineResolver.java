package androidx.compose.ui.platform;

import android.graphics.Outline;
import androidx.appcompat.R;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u001b\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u001fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\u001b\u00103\u001a\u00020,2\u0006\u0010$\u001a\u00020\u001cø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J6\u00103\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#2\u0006\u00106\u001a\u00020!2\u0006\u0010+\u001a\u00020\u00062\u0006\u00107\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003J\b\u00108\u001a\u00020,H\u0002J\u0010\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020\nH\u0002J\u0010\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020=H\u0002J\u0010\u0010>\u001a\u00020,2\u0006\u0010?\u001a\u00020(H\u0002J3\u0010@\u001a\u00020\u0006*\u0004\u0018\u00010(2\u0006\u0010A\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020!H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010DR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u001b\u001a\u00020\u001cX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u001dR\u0019\u0010\u001e\u001a\u00020\u001fX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u001dR\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010$\u001a\u00020\u001cX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u001dR\u0010\u0010%\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, d2 = {"Landroidx/compose/ui/platform/OutlineResolver;", "", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;)V", "cacheIsDirty", "", "cachedOutline", "Landroid/graphics/Outline;", "cachedRrectPath", "Landroidx/compose/ui/graphics/Path;", "calculatedOutline", "Landroidx/compose/ui/graphics/Outline;", "clipPath", "getClipPath", "()Landroidx/compose/ui/graphics/Path;", "isSupportedOutline", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outline", "getOutline", "()Landroid/graphics/Outline;", "outlineClipSupported", "getOutlineClipSupported", "()Z", "outlineNeeded", "outlinePath", "rectSize", "Landroidx/compose/ui/geometry/Size;", "J", "rectTopLeft", "Landroidx/compose/ui/geometry/Offset;", "roundedCornerRadius", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "size", "tmpOpPath", "tmpPath", "tmpRoundRect", "Landroidx/compose/ui/geometry/RoundRect;", "tmpTouchPointPath", "usePathForClip", "clipToOutline", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "isInOutline", "position", "isInOutline-k-4lQ0M", "(J)Z", "update", "update-uvyYCjk", "(J)V", "alpha", "elevation", "updateCache", "updateCacheWithPath", "composePath", "updateCacheWithRect", "rect", "Landroidx/compose/ui/geometry/Rect;", "updateCacheWithRoundRect", "roundRect", "isSameBounds", "offset", "radius", "isSameBounds-4L21HEs", "(Landroidx/compose/ui/geometry/RoundRect;JJF)Z", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class OutlineResolver {
    private boolean cacheIsDirty;
    @NotNull
    private final Outline cachedOutline;
    @Nullable
    private Path cachedRrectPath;
    @Nullable
    private androidx.compose.ui.graphics.Outline calculatedOutline;
    @NotNull
    private Density density;
    private boolean isSupportedOutline;
    @NotNull
    private LayoutDirection layoutDirection;
    private boolean outlineNeeded;
    @Nullable
    private Path outlinePath;
    private long rectSize;
    private long rectTopLeft;
    private float roundedCornerRadius;
    @NotNull
    private Shape shape;
    private long size;
    @Nullable
    private Path tmpOpPath;
    @Nullable
    private Path tmpPath;
    @Nullable
    private RoundRect tmpRoundRect;
    @Nullable
    private Path tmpTouchPointPath;
    private boolean usePathForClip;

    public OutlineResolver(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.density = density;
        this.isSupportedOutline = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        Size.Companion companion = Size.Companion;
        this.size = companion.m1239getZeroNHjbRc();
        this.shape = RectangleShapeKt.getRectangleShape();
        this.rectTopLeft = Offset.Companion.m1177getZeroF1C5BW0();
        this.rectSize = companion.m1239getZeroNHjbRc();
        this.layoutDirection = LayoutDirection.Ltr;
    }

    /* renamed from: isSameBounds-4L21HEs  reason: not valid java name */
    private final boolean m2959isSameBounds4L21HEs(RoundRect roundRect, long j2, long j3, float f2) {
        if (roundRect == null || !RoundRectKt.isSimple(roundRect)) {
            return false;
        }
        if (roundRect.getLeft() == Offset.m1161getXimpl(j2)) {
            if (roundRect.getTop() == Offset.m1162getYimpl(j2)) {
                if (roundRect.getRight() == Offset.m1161getXimpl(j2) + Size.m1230getWidthimpl(j3)) {
                    if (roundRect.getBottom() == Offset.m1162getYimpl(j2) + Size.m1227getHeightimpl(j3)) {
                        return (CornerRadius.m1136getXimpl(roundRect.m1211getTopLeftCornerRadiuskKHJgLs()) > f2 ? 1 : (CornerRadius.m1136getXimpl(roundRect.m1211getTopLeftCornerRadiuskKHJgLs()) == f2 ? 0 : -1)) == 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private final void updateCache() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = Offset.Companion.m1177getZeroF1C5BW0();
            long j2 = this.size;
            this.rectSize = j2;
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            if (!this.outlineNeeded || Size.m1230getWidthimpl(j2) <= 0.0f || Size.m1227getHeightimpl(this.size) <= 0.0f) {
                this.cachedOutline.setEmpty();
                return;
            }
            this.isSupportedOutline = true;
            androidx.compose.ui.graphics.Outline mo209createOutlinePq9zytI = this.shape.mo209createOutlinePq9zytI(this.size, this.layoutDirection, this.density);
            this.calculatedOutline = mo209createOutlinePq9zytI;
            if (mo209createOutlinePq9zytI instanceof Outline.Rectangle) {
                updateCacheWithRect(((Outline.Rectangle) mo209createOutlinePq9zytI).getRect());
            } else if (mo209createOutlinePq9zytI instanceof Outline.Rounded) {
                updateCacheWithRoundRect(((Outline.Rounded) mo209createOutlinePq9zytI).getRoundRect());
            } else if (mo209createOutlinePq9zytI instanceof Outline.Generic) {
                updateCacheWithPath(((Outline.Generic) mo209createOutlinePq9zytI).getPath());
            }
        }
    }

    private final void updateCacheWithPath(Path path) {
        android.graphics.Outline outline = this.cachedOutline;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setConvexPath(((AndroidPath) path).getInternalPath());
        this.usePathForClip = !this.cachedOutline.canClip();
        this.outlinePath = path;
    }

    private final void updateCacheWithRect(Rect rect) {
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        int roundToInt4;
        this.rectTopLeft = OffsetKt.Offset(rect.getLeft(), rect.getTop());
        this.rectSize = SizeKt.Size(rect.getWidth(), rect.getHeight());
        android.graphics.Outline outline = this.cachedOutline;
        roundToInt = MathKt__MathJVMKt.roundToInt(rect.getLeft());
        roundToInt2 = MathKt__MathJVMKt.roundToInt(rect.getTop());
        roundToInt3 = MathKt__MathJVMKt.roundToInt(rect.getRight());
        roundToInt4 = MathKt__MathJVMKt.roundToInt(rect.getBottom());
        outline.setRect(roundToInt, roundToInt2, roundToInt3, roundToInt4);
    }

    private final void updateCacheWithRoundRect(RoundRect roundRect) {
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        int roundToInt4;
        float m1136getXimpl = CornerRadius.m1136getXimpl(roundRect.m1211getTopLeftCornerRadiuskKHJgLs());
        this.rectTopLeft = OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
        this.rectSize = SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
        if (RoundRectKt.isSimple(roundRect)) {
            android.graphics.Outline outline = this.cachedOutline;
            roundToInt = MathKt__MathJVMKt.roundToInt(roundRect.getLeft());
            roundToInt2 = MathKt__MathJVMKt.roundToInt(roundRect.getTop());
            roundToInt3 = MathKt__MathJVMKt.roundToInt(roundRect.getRight());
            roundToInt4 = MathKt__MathJVMKt.roundToInt(roundRect.getBottom());
            outline.setRoundRect(roundToInt, roundToInt2, roundToInt3, roundToInt4, m1136getXimpl);
            this.roundedCornerRadius = m1136getXimpl;
            return;
        }
        Path path = this.cachedRrectPath;
        if (path == null) {
            path = AndroidPath_androidKt.Path();
            this.cachedRrectPath = path;
        }
        path.reset();
        path.addRoundRect(roundRect);
        updateCacheWithPath(path);
    }

    public final void clipToOutline(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Path clipPath = getClipPath();
        if (clipPath != null) {
            Canvas.DefaultImpls.m1368clipPathmtrdDE$default(canvas, clipPath, 0, 2, null);
            return;
        }
        float f2 = this.roundedCornerRadius;
        if (f2 <= 0.0f) {
            Canvas.DefaultImpls.m1369clipRectN_I0leg$default(canvas, Offset.m1161getXimpl(this.rectTopLeft), Offset.m1162getYimpl(this.rectTopLeft), Size.m1230getWidthimpl(this.rectSize) + Offset.m1161getXimpl(this.rectTopLeft), Size.m1227getHeightimpl(this.rectSize) + Offset.m1162getYimpl(this.rectTopLeft), 0, 16, null);
            return;
        }
        Path path = this.tmpPath;
        RoundRect roundRect = this.tmpRoundRect;
        if (path == null || !m2959isSameBounds4L21HEs(roundRect, this.rectTopLeft, this.rectSize, f2)) {
            RoundRect m1215RoundRectgG7oq9Y = RoundRectKt.m1215RoundRectgG7oq9Y(Offset.m1161getXimpl(this.rectTopLeft), Offset.m1162getYimpl(this.rectTopLeft), Offset.m1161getXimpl(this.rectTopLeft) + Size.m1230getWidthimpl(this.rectSize), Offset.m1162getYimpl(this.rectTopLeft) + Size.m1227getHeightimpl(this.rectSize), CornerRadiusKt.CornerRadius$default(this.roundedCornerRadius, 0.0f, 2, null));
            if (path == null) {
                path = AndroidPath_androidKt.Path();
            } else {
                path.reset();
            }
            path.addRoundRect(m1215RoundRectgG7oq9Y);
            this.tmpRoundRect = m1215RoundRectgG7oq9Y;
            this.tmpPath = path;
        }
        Canvas.DefaultImpls.m1368clipPathmtrdDE$default(canvas, path, 0, 2, null);
    }

    @Nullable
    public final Path getClipPath() {
        updateCache();
        return this.outlinePath;
    }

    @Nullable
    public final android.graphics.Outline getOutline() {
        updateCache();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    public final boolean getOutlineClipSupported() {
        return !this.usePathForClip;
    }

    /* renamed from: isInOutline-k-4lQ0M  reason: not valid java name */
    public final boolean m2960isInOutlinek4lQ0M(long j2) {
        androidx.compose.ui.graphics.Outline outline;
        if (this.outlineNeeded && (outline = this.calculatedOutline) != null) {
            return ShapeContainingUtilKt.isInOutline(outline, Offset.m1161getXimpl(j2), Offset.m1162getYimpl(j2), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    public final boolean update(@NotNull Shape shape, float f2, boolean z, float f3, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        this.cachedOutline.setAlpha(f2);
        boolean z2 = !Intrinsics.areEqual(this.shape, shape);
        if (z2) {
            this.shape = shape;
            this.cacheIsDirty = true;
        }
        boolean z3 = z || f3 > 0.0f;
        if (this.outlineNeeded != z3) {
            this.outlineNeeded = z3;
            this.cacheIsDirty = true;
        }
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            this.cacheIsDirty = true;
        }
        if (!Intrinsics.areEqual(this.density, density)) {
            this.density = density;
            this.cacheIsDirty = true;
        }
        return z2;
    }

    /* renamed from: update-uvyYCjk  reason: not valid java name */
    public final void m2961updateuvyYCjk(long j2) {
        if (Size.m1226equalsimpl0(this.size, j2)) {
            return;
        }
        this.size = j2;
        this.cacheIsDirty = true;
    }
}
