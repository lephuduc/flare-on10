package androidx.compose.ui.graphics.drawscope;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@DrawScopeMarker
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\r\u001a\u00020\u000eH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H&J'\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020&H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u001c\u0010)\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H&R\u001d\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001b\u0010\u0006\u001a\u00020\u0007X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter-F1C5BW0", "()J", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "clipPath", "", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipRect", "left", "", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "inset", "rotate", "degrees", "pivot", "rotate-Uv8p0NA", "(FJ)V", "scale", "scaleX", "scaleY", "scale-0AR0LA0", "(FFJ)V", "transform", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transform-58bKbWc", "([F)V", "translate", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public interface DrawTransform {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        /* renamed from: clipPath-mtrdD-E$default  reason: not valid java name */
        public static /* synthetic */ void m1859clipPathmtrdDE$default(DrawTransform drawTransform, Path path, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
            }
            if ((i3 & 2) != 0) {
                i2 = ClipOp.Companion.m1381getIntersectrtfAjoo();
            }
            drawTransform.mo1788clipPathmtrdDE(path, i2);
        }

        /* renamed from: clipRect-N_I0leg$default  reason: not valid java name */
        public static /* synthetic */ void m1860clipRectN_I0leg$default(DrawTransform drawTransform, float f2, float f3, float f4, float f5, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
            }
            if ((i3 & 1) != 0) {
                f2 = 0.0f;
            }
            if ((i3 & 2) != 0) {
                f3 = 0.0f;
            }
            if ((i3 & 4) != 0) {
                f4 = Size.m1230getWidthimpl(drawTransform.mo1791getSizeNHjbRc());
            }
            if ((i3 & 8) != 0) {
                f5 = Size.m1227getHeightimpl(drawTransform.mo1791getSizeNHjbRc());
            }
            if ((i3 & 16) != 0) {
                i2 = ClipOp.Companion.m1381getIntersectrtfAjoo();
            }
            drawTransform.mo1789clipRectN_I0leg(f2, f3, f4, f5, i2);
        }

        /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
        public static long m1861getCenterF1C5BW0(@NotNull DrawTransform drawTransform) {
            Intrinsics.checkNotNullParameter(drawTransform, "this");
            float f2 = 2;
            return OffsetKt.Offset(Size.m1230getWidthimpl(drawTransform.mo1791getSizeNHjbRc()) / f2, Size.m1227getHeightimpl(drawTransform.mo1791getSizeNHjbRc()) / f2);
        }

        /* renamed from: rotate-Uv8p0NA$default  reason: not valid java name */
        public static /* synthetic */ void m1862rotateUv8p0NA$default(DrawTransform drawTransform, float f2, long j2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
            }
            if ((i2 & 2) != 0) {
                j2 = drawTransform.mo1790getCenterF1C5BW0();
            }
            drawTransform.mo1792rotateUv8p0NA(f2, j2);
        }

        /* renamed from: scale-0AR0LA0$default  reason: not valid java name */
        public static /* synthetic */ void m1863scale0AR0LA0$default(DrawTransform drawTransform, float f2, float f3, long j2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
            }
            if ((i2 & 4) != 0) {
                j2 = drawTransform.mo1790getCenterF1C5BW0();
            }
            drawTransform.mo1793scale0AR0LA0(f2, f3, j2);
        }

        public static /* synthetic */ void translate$default(DrawTransform drawTransform, float f2, float f3, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
            }
            if ((i2 & 1) != 0) {
                f2 = 0.0f;
            }
            if ((i2 & 2) != 0) {
                f3 = 0.0f;
            }
            drawTransform.translate(f2, f3);
        }
    }

    /* renamed from: clipPath-mtrdD-E */
    void mo1788clipPathmtrdDE(@NotNull Path path, int i2);

    /* renamed from: clipRect-N_I0leg */
    void mo1789clipRectN_I0leg(float f2, float f3, float f4, float f5, int i2);

    /* renamed from: getCenter-F1C5BW0 */
    long mo1790getCenterF1C5BW0();

    /* renamed from: getSize-NH-jbRc */
    long mo1791getSizeNHjbRc();

    void inset(float f2, float f3, float f4, float f5);

    /* renamed from: rotate-Uv8p0NA */
    void mo1792rotateUv8p0NA(float f2, long j2);

    /* renamed from: scale-0AR0LA0 */
    void mo1793scale0AR0LA0(float f2, float f3, long j2);

    /* renamed from: transform-58bKbWc */
    void mo1794transform58bKbWc(@NotNull float[] fArr);

    void translate(float f2, float f3);
}
