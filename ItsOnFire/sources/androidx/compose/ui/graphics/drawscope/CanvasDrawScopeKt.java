package androidx.compose.ui.graphics.drawscope;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"DefaultDensity", "Landroidx/compose/ui/unit/Density;", "asDrawTransform", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class CanvasDrawScopeKt {
    @NotNull
    private static final Density DefaultDensity = DensityKt.Density(1.0f, 1.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawTransform asDrawTransform(final DrawContext drawContext) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1
            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipPath-mtrdD-E  reason: not valid java name */
            public void mo1788clipPathmtrdDE(@NotNull Path path, int i2) {
                Intrinsics.checkNotNullParameter(path, "path");
                DrawContext.this.getCanvas().mo1255clipPathmtrdDE(path, i2);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipRect-N_I0leg  reason: not valid java name */
            public void mo1789clipRectN_I0leg(float f2, float f3, float f4, float f5, int i2) {
                DrawContext.this.getCanvas().mo1256clipRectN_I0leg(f2, f3, f4, f5, i2);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
            public long mo1790getCenterF1C5BW0() {
                return SizeKt.m1240getCenteruvyYCjk(mo1791getSizeNHjbRc());
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: getSize-NH-jbRc  reason: not valid java name */
            public long mo1791getSizeNHjbRc() {
                return DrawContext.this.mo1786getSizeNHjbRc();
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void inset(float f2, float f3, float f4, float f5) {
                Canvas canvas = DrawContext.this.getCanvas();
                DrawContext drawContext2 = DrawContext.this;
                long Size = SizeKt.Size(Size.m1230getWidthimpl(mo1791getSizeNHjbRc()) - (f4 + f2), Size.m1227getHeightimpl(mo1791getSizeNHjbRc()) - (f5 + f3));
                if (!(Size.m1230getWidthimpl(Size) >= 0.0f && Size.m1227getHeightimpl(Size) >= 0.0f)) {
                    throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
                }
                drawContext2.mo1787setSizeuvyYCjk(Size);
                canvas.translate(f2, f3);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: rotate-Uv8p0NA  reason: not valid java name */
            public void mo1792rotateUv8p0NA(float f2, long j2) {
                Canvas canvas = DrawContext.this.getCanvas();
                canvas.translate(Offset.m1161getXimpl(j2), Offset.m1162getYimpl(j2));
                canvas.rotate(f2);
                canvas.translate(-Offset.m1161getXimpl(j2), -Offset.m1162getYimpl(j2));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: scale-0AR0LA0  reason: not valid java name */
            public void mo1793scale0AR0LA0(float f2, float f3, long j2) {
                Canvas canvas = DrawContext.this.getCanvas();
                canvas.translate(Offset.m1161getXimpl(j2), Offset.m1162getYimpl(j2));
                canvas.scale(f2, f3);
                canvas.translate(-Offset.m1161getXimpl(j2), -Offset.m1162getYimpl(j2));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: transform-58bKbWc  reason: not valid java name */
            public void mo1794transform58bKbWc(@NotNull float[] matrix) {
                Intrinsics.checkNotNullParameter(matrix, "matrix");
                DrawContext.this.getCanvas().mo1258concat58bKbWc(matrix);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void translate(float f2, float f3) {
                DrawContext.this.getCanvas().translate(f2, f3);
            }
        };
    }
}
