package androidx.compose.ui.graphics.painter;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0004H\u0014J\u0012\u0010\u0017\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u0010\u001a\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0002J5\u0010\u001e\u001a\u00020\n*\u00020\t2\u0006\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\f\u0010\"\u001a\u00020\n*\u00020\tH$R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\rX¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/painter/Painter;", "", "()V", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "drawLambda", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "layerPaint", "Landroidx/compose/ui/graphics/Paint;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "useLayer", "", "applyAlpha", "applyColorFilter", "applyLayoutDirection", "configureAlpha", "configureColorFilter", "configureLayoutDirection", "rtl", "obtainPaint", "draw", "size", "draw-x_KDEd0", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/ui/graphics/ColorFilter;)V", "onDraw", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public abstract class Painter {
    @Nullable
    private ColorFilter colorFilter;
    @Nullable
    private Paint layerPaint;
    private boolean useLayer;
    private float alpha = 1.0f;
    @NotNull
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    @NotNull
    private final Function1<DrawScope, Unit> drawLambda = new Painter$drawLambda$1(this);

    private final void configureAlpha(float f2) {
        if (this.alpha == f2) {
            return;
        }
        if (!applyAlpha(f2)) {
            if (f2 == 1.0f) {
                Paint paint = this.layerPaint;
                if (paint != null) {
                    paint.setAlpha(f2);
                }
                this.useLayer = false;
            } else {
                obtainPaint().setAlpha(f2);
                this.useLayer = true;
            }
        }
        this.alpha = f2;
    }

    private final void configureColorFilter(ColorFilter colorFilter) {
        boolean z;
        if (Intrinsics.areEqual(this.colorFilter, colorFilter)) {
            return;
        }
        if (!applyColorFilter(colorFilter)) {
            if (colorFilter == null) {
                Paint paint = this.layerPaint;
                if (paint != null) {
                    paint.setColorFilter(null);
                }
                z = false;
            } else {
                obtainPaint().setColorFilter(colorFilter);
                z = true;
            }
            this.useLayer = z;
        }
        this.colorFilter = colorFilter;
    }

    private final void configureLayoutDirection(LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            applyLayoutDirection(layoutDirection);
            this.layoutDirection = layoutDirection;
        }
    }

    /* renamed from: draw-x_KDEd0$default  reason: not valid java name */
    public static /* synthetic */ void m1879drawx_KDEd0$default(Painter painter, DrawScope drawScope, long j2, float f2, ColorFilter colorFilter, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i2 & 2) != 0) {
            f2 = 1.0f;
        }
        float f3 = f2;
        if ((i2 & 4) != 0) {
            colorFilter = null;
        }
        painter.m1880drawx_KDEd0(drawScope, j2, f3, colorFilter);
    }

    private final Paint obtainPaint() {
        Paint paint = this.layerPaint;
        if (paint == null) {
            Paint Paint = AndroidPaint_androidKt.Paint();
            this.layerPaint = Paint;
            return Paint;
        }
        return paint;
    }

    public boolean applyAlpha(float f2) {
        return false;
    }

    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        return false;
    }

    public boolean applyLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return false;
    }

    /* renamed from: draw-x_KDEd0  reason: not valid java name */
    public final void m1880drawx_KDEd0(@NotNull DrawScope receiver, long j2, float f2, @Nullable ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        configureAlpha(f2);
        configureColorFilter(colorFilter);
        configureLayoutDirection(receiver.getLayoutDirection());
        float m1230getWidthimpl = Size.m1230getWidthimpl(receiver.mo1780getSizeNHjbRc()) - Size.m1230getWidthimpl(j2);
        float m1227getHeightimpl = Size.m1227getHeightimpl(receiver.mo1780getSizeNHjbRc()) - Size.m1227getHeightimpl(j2);
        receiver.getDrawContext().getTransform().inset(0.0f, 0.0f, m1230getWidthimpl, m1227getHeightimpl);
        if (f2 > 0.0f && Size.m1230getWidthimpl(j2) > 0.0f && Size.m1227getHeightimpl(j2) > 0.0f) {
            if (this.useLayer) {
                Rect m1201Recttz77jQw = RectKt.m1201Recttz77jQw(Offset.Companion.m1177getZeroF1C5BW0(), SizeKt.Size(Size.m1230getWidthimpl(j2), Size.m1227getHeightimpl(j2)));
                Canvas canvas = receiver.getDrawContext().getCanvas();
                try {
                    canvas.saveLayer(m1201Recttz77jQw, obtainPaint());
                    onDraw(receiver);
                } finally {
                    canvas.restore();
                }
            } else {
                onDraw(receiver);
            }
        }
        receiver.getDrawContext().getTransform().inset(-0.0f, -0.0f, -m1230getWidthimpl, -m1227getHeightimpl);
    }

    /* renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo1874getIntrinsicSizeNHjbRc();

    public abstract void onDraw(@NotNull DrawScope drawScope);
}
