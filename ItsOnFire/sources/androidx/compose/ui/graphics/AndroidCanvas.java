package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\b\u0010)\u001a\u00020\u0015H\u0016JH\u0010*\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J-\u00101\u001a\u00020\u00152\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106J-\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u0002032\u0006\u0010/\u001a\u000200H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<JE\u0010=\u001a\u00020\u00152\u0006\u00108\u001a\u0002092\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020?2\u0006\u0010C\u001a\u00020A2\u0006\u0010/\u001a\u000200H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010EJ-\u0010F\u001a\u00020\u00152\u0006\u0010G\u001a\u0002032\u0006\u0010H\u001a\u0002032\u0006\u0010/\u001a\u000200H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bI\u0010JJ)\u0010K\u001a\u00020\u00152\f\u0010L\u001a\b\u0012\u0004\u0012\u0002030M2\u0006\u0010/\u001a\u0002002\u0006\u0010N\u001a\u00020OH\u0002ø\u0001\u0000J0\u0010P\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0016J\u0018\u0010Q\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010/\u001a\u000200H\u0016J3\u0010R\u001a\u00020\u00152\u0006\u0010S\u001a\u00020T2\f\u0010L\u001a\b\u0012\u0004\u0012\u0002030M2\u0006\u0010/\u001a\u000200H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bU\u0010VJ!\u0010R\u001a\u00020\u00152\f\u0010L\u001a\b\u0012\u0004\u0012\u0002030M2\u0006\u0010/\u001a\u000200H\u0002ø\u0001\u0000J \u0010W\u001a\u00020\u00152\u0006\u0010L\u001a\u00020X2\u0006\u0010/\u001a\u0002002\u0006\u0010N\u001a\u00020OH\u0002J-\u0010Y\u001a\u00020\u00152\u0006\u0010S\u001a\u00020T2\u0006\u0010L\u001a\u00020X2\u0006\u0010/\u001a\u000200H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bZ\u0010[J \u0010Y\u001a\u00020\u00152\u0006\u0010L\u001a\u00020X2\u0006\u0010/\u001a\u0002002\u0006\u0010N\u001a\u00020OH\u0002J0\u0010\\\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0016J@\u0010]\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010^\u001a\u00020\u001e2\u0006\u0010_\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0016J-\u0010`\u001a\u00020\u00152\u0006\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020d2\u0006\u0010/\u001a\u000200H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\be\u0010fJ\b\u0010g\u001a\u00020\u0015H\u0016J\b\u0010h\u001a\u00020\u0015H\u0016J\u0010\u0010i\u001a\u00020\u00152\u0006\u0010j\u001a\u00020\u001eH\u0016J\b\u0010k\u001a\u00020\u0015H\u0016J\u0018\u0010l\u001a\u00020\u00152\u0006\u0010m\u001a\u00020n2\u0006\u0010/\u001a\u000200H\u0016J\u0018\u0010o\u001a\u00020\u00152\u0006\u0010p\u001a\u00020\u001e2\u0006\u0010q\u001a\u00020\u001eH\u0016J\u0018\u0010r\u001a\u00020\u00152\u0006\u0010p\u001a\u00020\u001e2\u0006\u0010q\u001a\u00020\u001eH\u0016J\u0018\u0010s\u001a\u00020\u00152\u0006\u0010t\u001a\u00020\u001e2\u0006\u0010u\u001a\u00020\u001eH\u0016J\u0017\u0010v\u001a\u00020w*\u00020\u0019ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bx\u0010yR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R(\u0010\t\u001a\u00060\nj\u0002`\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0012\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006z"}, d2 = {"Landroidx/compose/ui/graphics/AndroidCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "()V", "dstRect", "Landroid/graphics/Rect;", "getDstRect", "()Landroid/graphics/Rect;", "dstRect$delegate", "Lkotlin/Lazy;", "internalCanvas", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "getInternalCanvas$annotations", "getInternalCanvas", "()Landroid/graphics/Canvas;", "setInternalCanvas", "(Landroid/graphics/Canvas;)V", "srcRect", "getSrcRect", "srcRect$delegate", "clipPath", "", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipRect", "left", "", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "concat", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "concat-58bKbWc", "([F)V", "disableZ", "drawArc", "startAngle", "sweepAngle", "useCenter", "", "paint", "Landroidx/compose/ui/graphics/Paint;", "drawCircle", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLines", "points", "", "stepBy", "", "drawOval", "drawPath", "drawPoints", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawRawLines", "", "drawRawPoints", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRect", "drawRoundRect", "radiusX", "radiusY", "drawVertices", "vertices", "Landroidx/compose/ui/graphics/Vertices;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "enableZ", "restore", "rotate", "degrees", "save", "saveLayer", "bounds", "Landroidx/compose/ui/geometry/Rect;", "scale", "sx", "sy", "skew", "translate", "dx", "dy", "toRegionOp", "Landroid/graphics/Region$Op;", "toRegionOp--7u2Bmg", "(I)Landroid/graphics/Region$Op;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@PublishedApi
/* loaded from: classes.dex */
public final class AndroidCanvas implements Canvas {
    @NotNull
    private final Lazy dstRect$delegate;
    @NotNull
    private android.graphics.Canvas internalCanvas;
    @NotNull
    private final Lazy srcRect$delegate;

    public AndroidCanvas() {
        android.graphics.Canvas canvas;
        Lazy lazy;
        Lazy lazy2;
        canvas = AndroidCanvas_androidKt.EmptyCanvas;
        this.internalCanvas = canvas;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) AndroidCanvas$srcRect$2.INSTANCE);
        this.srcRect$delegate = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) AndroidCanvas$dstRect$2.INSTANCE);
        this.dstRect$delegate = lazy2;
    }

    private final void drawLines(List<Offset> list, Paint paint, int i2) {
        IntRange until;
        IntProgression step;
        if (list.size() < 2) {
            return;
        }
        until = RangesKt___RangesKt.until(0, list.size() - 1);
        step = RangesKt___RangesKt.step(until, i2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 <= 0 || first > last) && (step2 >= 0 || last > first)) {
            return;
        }
        while (true) {
            int i3 = first + step2;
            long m1171unboximpl = list.get(first).m1171unboximpl();
            long m1171unboximpl2 = list.get(first + 1).m1171unboximpl();
            this.internalCanvas.drawLine(Offset.m1161getXimpl(m1171unboximpl), Offset.m1162getYimpl(m1171unboximpl), Offset.m1161getXimpl(m1171unboximpl2), Offset.m1162getYimpl(m1171unboximpl2), paint.asFrameworkPaint());
            if (first == last) {
                return;
            }
            first = i3;
        }
    }

    private final void drawPoints(List<Offset> list, Paint paint) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            long m1171unboximpl = list.get(i2).m1171unboximpl();
            getInternalCanvas().drawPoint(Offset.m1161getXimpl(m1171unboximpl), Offset.m1162getYimpl(m1171unboximpl), paint.asFrameworkPaint());
        }
    }

    private final void drawRawLines(float[] fArr, Paint paint, int i2) {
        IntRange until;
        IntProgression step;
        if (fArr.length < 4 || fArr.length % 2 != 0) {
            return;
        }
        until = RangesKt___RangesKt.until(0, fArr.length - 3);
        step = RangesKt___RangesKt.step(until, i2 * 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 <= 0 || first > last) && (step2 >= 0 || last > first)) {
            return;
        }
        while (true) {
            int i3 = first + step2;
            this.internalCanvas.drawLine(fArr[first], fArr[first + 1], fArr[first + 2], fArr[first + 3], paint.asFrameworkPaint());
            if (first == last) {
                return;
            }
            first = i3;
        }
    }

    private final void drawRawPoints(float[] fArr, Paint paint, int i2) {
        IntRange until;
        IntProgression step;
        if (fArr.length % 2 != 0) {
            return;
        }
        until = RangesKt___RangesKt.until(0, fArr.length - 1);
        step = RangesKt___RangesKt.step(until, i2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 <= 0 || first > last) && (step2 >= 0 || last > first)) {
            return;
        }
        while (true) {
            int i3 = first + step2;
            this.internalCanvas.drawPoint(fArr[first], fArr[first + 1], paint.asFrameworkPaint());
            if (first == last) {
                return;
            }
            first = i3;
        }
    }

    private final Rect getDstRect() {
        return (Rect) this.dstRect$delegate.getValue();
    }

    @PublishedApi
    public static /* synthetic */ void getInternalCanvas$annotations() {
    }

    private final Rect getSrcRect() {
        return (Rect) this.srcRect$delegate.getValue();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipPath-mtrdD-E  reason: not valid java name */
    public void mo1255clipPathmtrdDE(@NotNull Path path, int i2) {
        Intrinsics.checkNotNullParameter(path, "path");
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((AndroidPath) path).getInternalPath(), m1266toRegionOp7u2Bmg(i2));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipRect-N_I0leg  reason: not valid java name */
    public void mo1256clipRectN_I0leg(float f2, float f3, float f4, float f5, int i2) {
        this.internalCanvas.clipRect(f2, f3, f4, f5, m1266toRegionOp7u2Bmg(i2));
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: clipRect-mtrdD-E  reason: not valid java name */
    public void mo1257clipRectmtrdDE(@NotNull androidx.compose.ui.geometry.Rect rect, int i2) {
        Canvas.DefaultImpls.m1370clipRectmtrdDE(this, rect, i2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: concat-58bKbWc  reason: not valid java name */
    public void mo1258concat58bKbWc(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (MatrixKt.m1584isIdentity58bKbWc(matrix)) {
            return;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        AndroidMatrixConversions_androidKt.m1273setFromEL8BTi8(matrix2, matrix);
        this.internalCanvas.concat(matrix2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, false);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(float f2, float f3, float f4, float f5, float f6, float f7, boolean z, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawArc(f2, f3, f4, f5, f6, f7, z, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArc(@NotNull androidx.compose.ui.geometry.Rect rect, float f2, float f3, boolean z, @NotNull Paint paint) {
        Canvas.DefaultImpls.drawArc(this, rect, f2, f3, z, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawArcRad(@NotNull androidx.compose.ui.geometry.Rect rect, float f2, float f3, boolean z, @NotNull Paint paint) {
        Canvas.DefaultImpls.drawArcRad(this, rect, f2, f3, z, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawCircle-9KIMszo  reason: not valid java name */
    public void mo1259drawCircle9KIMszo(long j2, float f2, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawCircle(Offset.m1161getXimpl(j2), Offset.m1162getYimpl(j2), f2, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImage-d-4ec7I  reason: not valid java name */
    public void mo1260drawImaged4ec7I(@NotNull ImageBitmap image, long j2, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(image), Offset.m1161getXimpl(j2), Offset.m1162getYimpl(j2), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawImageRect-HPBpro0  reason: not valid java name */
    public void mo1261drawImageRectHPBpro0(@NotNull ImageBitmap image, long j2, long j3, long j4, long j5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        android.graphics.Canvas canvas = this.internalCanvas;
        Bitmap asAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(image);
        Rect srcRect = getSrcRect();
        srcRect.left = IntOffset.m3443getXimpl(j2);
        srcRect.top = IntOffset.m3444getYimpl(j2);
        srcRect.right = IntOffset.m3443getXimpl(j2) + IntSize.m3485getWidthimpl(j3);
        srcRect.bottom = IntOffset.m3444getYimpl(j2) + IntSize.m3484getHeightimpl(j3);
        Unit unit = Unit.INSTANCE;
        Rect dstRect = getDstRect();
        dstRect.left = IntOffset.m3443getXimpl(j4);
        dstRect.top = IntOffset.m3444getYimpl(j4);
        dstRect.right = IntOffset.m3443getXimpl(j4) + IntSize.m3485getWidthimpl(j5);
        dstRect.bottom = IntOffset.m3444getYimpl(j4) + IntSize.m3484getHeightimpl(j5);
        canvas.drawBitmap(asAndroidBitmap, srcRect, dstRect, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawLine-Wko1d7g  reason: not valid java name */
    public void mo1262drawLineWko1d7g(long j2, long j3, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawLine(Offset.m1161getXimpl(j2), Offset.m1162getYimpl(j2), Offset.m1161getXimpl(j3), Offset.m1162getYimpl(j3), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(float f2, float f3, float f4, float f5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawOval(f2, f3, f4, f5, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawOval(@NotNull androidx.compose.ui.geometry.Rect rect, @NotNull Paint paint) {
        Canvas.DefaultImpls.drawOval(this, rect, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawPath(@NotNull Path path, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        android.graphics.Canvas canvas = this.internalCanvas;
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((AndroidPath) path).getInternalPath(), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawPoints-O7TthRY  reason: not valid java name */
    public void mo1263drawPointsO7TthRY(int i2, @NotNull List<Offset> points, @NotNull Paint paint) {
        int i3;
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(paint, "paint");
        PointMode.Companion companion = PointMode.Companion;
        if (PointMode.m1626equalsimpl0(i2, companion.m1630getLinesr_lszbg())) {
            i3 = 2;
        } else if (!PointMode.m1626equalsimpl0(i2, companion.m1632getPolygonr_lszbg())) {
            if (PointMode.m1626equalsimpl0(i2, companion.m1631getPointsr_lszbg())) {
                drawPoints(points, paint);
                return;
            }
            return;
        } else {
            i3 = 1;
        }
        drawLines(points, paint, i3);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawRawPoints-O7TthRY  reason: not valid java name */
    public void mo1264drawRawPointsO7TthRY(int i2, @NotNull float[] points, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (points.length % 2 != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        PointMode.Companion companion = PointMode.Companion;
        if (PointMode.m1626equalsimpl0(i2, companion.m1630getLinesr_lszbg())) {
            drawRawLines(points, paint, 2);
        } else if (PointMode.m1626equalsimpl0(i2, companion.m1632getPolygonr_lszbg())) {
            drawRawLines(points, paint, 1);
        } else if (PointMode.m1626equalsimpl0(i2, companion.m1631getPointsr_lszbg())) {
            drawRawPoints(points, paint, 2);
        }
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(float f2, float f3, float f4, float f5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawRect(f2, f3, f4, f5, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRect(@NotNull androidx.compose.ui.geometry.Rect rect, @NotNull Paint paint) {
        Canvas.DefaultImpls.drawRect(this, rect, paint);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float f2, float f3, float f4, float f5, float f6, float f7, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawRoundRect(f2, f3, f4, f5, f6, f7, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    /* renamed from: drawVertices-TPEHhCM  reason: not valid java name */
    public void mo1265drawVerticesTPEHhCM(@NotNull Vertices vertices, int i2, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(vertices, "vertices");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.drawVertices(AndroidVertexMode_androidKt.m1306toAndroidVertexModeJOOmi9M(vertices.m1718getVertexModec2xauaI()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.internalCanvas, true);
    }

    @NotNull
    public final android.graphics.Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void restore() {
        this.internalCanvas.restore();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void rotate(float f2) {
        this.internalCanvas.rotate(f2);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void save() {
        this.internalCanvas.save();
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void saveLayer(@NotNull androidx.compose.ui.geometry.Rect bounds, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.internalCanvas.saveLayer(bounds.getLeft(), bounds.getTop(), bounds.getRight(), bounds.getBottom(), paint.asFrameworkPaint(), 31);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void scale(float f2, float f3) {
        this.internalCanvas.scale(f2, f3);
    }

    public final void setInternalCanvas(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "<set-?>");
        this.internalCanvas = canvas;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skew(float f2, float f3) {
        this.internalCanvas.skew(f2, f3);
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void skewRad(float f2, float f3) {
        Canvas.DefaultImpls.skewRad(this, f2, f3);
    }

    @NotNull
    /* renamed from: toRegionOp--7u2Bmg  reason: not valid java name */
    public final Region.Op m1266toRegionOp7u2Bmg(int i2) {
        return ClipOp.m1376equalsimpl0(i2, ClipOp.Companion.m1380getDifferencertfAjoo()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // androidx.compose.ui.graphics.Canvas
    public void translate(float f2, float f3) {
        this.internalCanvas.translate(f2, f3);
    }
}
