package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\bf\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ'\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\n\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0003H&J0\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016JH\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H&J0\u0010#\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J-\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J-\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020(2\u0006\u0010!\u001a\u00020\"H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101JM\u00102\u001a\u00020\u00032\u0006\u0010-\u001a\u00020.2\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002042\b\b\u0002\u00108\u001a\u0002062\u0006\u0010!\u001a\u00020\"H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:J-\u0010;\u001a\u00020\u00032\u0006\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020(2\u0006\u0010!\u001a\u00020\"H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H\u0016J0\u0010@\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H&J\u0018\u0010A\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"H&J3\u0010B\u001a\u00020\u00032\u0006\u0010C\u001a\u00020D2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020(0F2\u0006\u0010!\u001a\u00020\"H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010HJ-\u0010I\u001a\u00020\u00032\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020J2\u0006\u0010!\u001a\u00020\"H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bK\u0010LJ\u0018\u0010M\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H\u0016J0\u0010M\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H&J@\u0010N\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010O\u001a\u00020\u00102\u0006\u0010P\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H&J-\u0010Q\u001a\u00020\u00032\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010!\u001a\u00020\"H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bV\u0010WJ\b\u0010X\u001a\u00020\u0003H&J\b\u0010Y\u001a\u00020\u0003H&J\u0010\u0010Z\u001a\u00020\u00032\u0006\u0010[\u001a\u00020\u0010H&J\b\u0010\\\u001a\u00020\u0003H&J\u0018\u0010]\u001a\u00020\u00032\u0006\u0010^\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H&J\u001a\u0010_\u001a\u00020\u00032\u0006\u0010`\u001a\u00020\u00102\b\b\u0002\u0010a\u001a\u00020\u0010H&J\u0018\u0010b\u001a\u00020\u00032\u0006\u0010`\u001a\u00020\u00102\u0006\u0010a\u001a\u00020\u0010H&J\u0018\u0010c\u001a\u00020\u00032\u0006\u0010d\u001a\u00020\u00102\u0006\u0010e\u001a\u00020\u0010H\u0016J\u0018\u0010f\u001a\u00020\u00032\u0006\u0010g\u001a\u00020\u00102\u0006\u0010h\u001a\u00020\u0010H&\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006i"}, d2 = {"Landroidx/compose/ui/graphics/Canvas;", "", "clipPath", "", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipRect", "rect", "Landroidx/compose/ui/geometry/Rect;", "clipRect-mtrdD-E", "(Landroidx/compose/ui/geometry/Rect;I)V", "left", "", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "concat", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "concat-58bKbWc", "([F)V", "disableZ", "drawArc", "startAngle", "sweepAngle", "useCenter", "", "paint", "Landroidx/compose/ui/graphics/Paint;", "drawArcRad", "startAngleRad", "sweepAngleRad", "drawCircle", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawOval", "drawPath", "drawPoints", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "points", "", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawRawPoints", "", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRect", "drawRoundRect", "radiusX", "radiusY", "drawVertices", "vertices", "Landroidx/compose/ui/graphics/Vertices;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "enableZ", "restore", "rotate", "degrees", "save", "saveLayer", "bounds", "scale", "sx", "sy", "skew", "skewRad", "sxRad", "syRad", "translate", "dx", "dy", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public interface Canvas {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        /* renamed from: clipPath-mtrdD-E$default  reason: not valid java name */
        public static /* synthetic */ void m1368clipPathmtrdDE$default(Canvas canvas, Path path, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
            }
            if ((i3 & 2) != 0) {
                i2 = ClipOp.Companion.m1381getIntersectrtfAjoo();
            }
            canvas.mo1255clipPathmtrdDE(path, i2);
        }

        /* renamed from: clipRect-N_I0leg$default  reason: not valid java name */
        public static /* synthetic */ void m1369clipRectN_I0leg$default(Canvas canvas, float f2, float f3, float f4, float f5, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
            }
            if ((i3 & 16) != 0) {
                i2 = ClipOp.Companion.m1381getIntersectrtfAjoo();
            }
            canvas.mo1256clipRectN_I0leg(f2, f3, f4, f5, i2);
        }

        /* renamed from: clipRect-mtrdD-E  reason: not valid java name */
        public static void m1370clipRectmtrdDE(@NotNull Canvas canvas, @NotNull Rect rect, int i2) {
            Intrinsics.checkNotNullParameter(canvas, "this");
            Intrinsics.checkNotNullParameter(rect, "rect");
            canvas.mo1256clipRectN_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), i2);
        }

        /* renamed from: clipRect-mtrdD-E$default  reason: not valid java name */
        public static /* synthetic */ void m1371clipRectmtrdDE$default(Canvas canvas, Rect rect, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
            }
            if ((i3 & 2) != 0) {
                i2 = ClipOp.Companion.m1381getIntersectrtfAjoo();
            }
            canvas.mo1257clipRectmtrdDE(rect, i2);
        }

        public static void drawArc(@NotNull Canvas canvas, @NotNull Rect rect, float f2, float f3, boolean z, @NotNull Paint paint) {
            Intrinsics.checkNotNullParameter(canvas, "this");
            Intrinsics.checkNotNullParameter(rect, "rect");
            Intrinsics.checkNotNullParameter(paint, "paint");
            canvas.drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f2, f3, z, paint);
        }

        public static void drawArcRad(@NotNull Canvas canvas, @NotNull Rect rect, float f2, float f3, boolean z, @NotNull Paint paint) {
            Intrinsics.checkNotNullParameter(canvas, "this");
            Intrinsics.checkNotNullParameter(rect, "rect");
            Intrinsics.checkNotNullParameter(paint, "paint");
            canvas.drawArc(rect, DegreesKt.degrees(f2), DegreesKt.degrees(f3), z, paint);
        }

        /* renamed from: drawImageRect-HPBpro0$default  reason: not valid java name */
        public static /* synthetic */ void m1372drawImageRectHPBpro0$default(Canvas canvas, ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, Paint paint, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
            }
            long m3453getZeronOccac = (i2 & 2) != 0 ? IntOffset.Companion.m3453getZeronOccac() : j2;
            long IntSize = (i2 & 4) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j3;
            canvas.mo1261drawImageRectHPBpro0(imageBitmap, m3453getZeronOccac, IntSize, (i2 & 8) != 0 ? IntOffset.Companion.m3453getZeronOccac() : j4, (i2 & 16) != 0 ? IntSize : j5, paint);
        }

        public static void drawOval(@NotNull Canvas canvas, @NotNull Rect rect, @NotNull Paint paint) {
            Intrinsics.checkNotNullParameter(canvas, "this");
            Intrinsics.checkNotNullParameter(rect, "rect");
            Intrinsics.checkNotNullParameter(paint, "paint");
            canvas.drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
        }

        public static void drawRect(@NotNull Canvas canvas, @NotNull Rect rect, @NotNull Paint paint) {
            Intrinsics.checkNotNullParameter(canvas, "this");
            Intrinsics.checkNotNullParameter(rect, "rect");
            Intrinsics.checkNotNullParameter(paint, "paint");
            canvas.drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
        }

        public static /* synthetic */ void scale$default(Canvas canvas, float f2, float f3, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
            }
            if ((i2 & 2) != 0) {
                f3 = f2;
            }
            canvas.scale(f2, f3);
        }

        public static void skewRad(@NotNull Canvas canvas, float f2, float f3) {
            Intrinsics.checkNotNullParameter(canvas, "this");
            canvas.skew(DegreesKt.degrees(f2), DegreesKt.degrees(f3));
        }
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo1255clipPathmtrdDE(@NotNull Path path, int i2);

    /* renamed from: clipRect-N_I0leg */
    void mo1256clipRectN_I0leg(float f2, float f3, float f4, float f5, int i2);

    /* renamed from: clipRect-mtrdD-E */
    void mo1257clipRectmtrdDE(@NotNull Rect rect, int i2);

    /* renamed from: concat-58bKbWc */
    void mo1258concat58bKbWc(@NotNull float[] fArr);

    void disableZ();

    void drawArc(float f2, float f3, float f4, float f5, float f6, float f7, boolean z, @NotNull Paint paint);

    void drawArc(@NotNull Rect rect, float f2, float f3, boolean z, @NotNull Paint paint);

    void drawArcRad(@NotNull Rect rect, float f2, float f3, boolean z, @NotNull Paint paint);

    /* renamed from: drawCircle-9KIMszo */
    void mo1259drawCircle9KIMszo(long j2, float f2, @NotNull Paint paint);

    /* renamed from: drawImage-d-4ec7I */
    void mo1260drawImaged4ec7I(@NotNull ImageBitmap imageBitmap, long j2, @NotNull Paint paint);

    /* renamed from: drawImageRect-HPBpro0 */
    void mo1261drawImageRectHPBpro0(@NotNull ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, @NotNull Paint paint);

    /* renamed from: drawLine-Wko1d7g */
    void mo1262drawLineWko1d7g(long j2, long j3, @NotNull Paint paint);

    void drawOval(float f2, float f3, float f4, float f5, @NotNull Paint paint);

    void drawOval(@NotNull Rect rect, @NotNull Paint paint);

    void drawPath(@NotNull Path path, @NotNull Paint paint);

    /* renamed from: drawPoints-O7TthRY */
    void mo1263drawPointsO7TthRY(int i2, @NotNull List<Offset> list, @NotNull Paint paint);

    /* renamed from: drawRawPoints-O7TthRY */
    void mo1264drawRawPointsO7TthRY(int i2, @NotNull float[] fArr, @NotNull Paint paint);

    void drawRect(float f2, float f3, float f4, float f5, @NotNull Paint paint);

    void drawRect(@NotNull Rect rect, @NotNull Paint paint);

    void drawRoundRect(float f2, float f3, float f4, float f5, float f6, float f7, @NotNull Paint paint);

    /* renamed from: drawVertices-TPEHhCM */
    void mo1265drawVerticesTPEHhCM(@NotNull Vertices vertices, int i2, @NotNull Paint paint);

    void enableZ();

    void restore();

    void rotate(float f2);

    void save();

    void saveLayer(@NotNull Rect rect, @NotNull Paint paint);

    void scale(float f2, float f3);

    void skew(float f2, float f3);

    void skewRad(float f2, float f3);

    void translate(float f2, float f3);
}
