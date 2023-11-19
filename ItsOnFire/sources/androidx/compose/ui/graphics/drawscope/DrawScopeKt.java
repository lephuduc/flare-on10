package androidx.compose.ui.graphics.drawscope;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.DegreesKt;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aH\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000b\u001ah\u0010\f\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a$\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\bH\u0086\bø\u0001\u0001\u001a1\u0010\u0016\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0001\u001a=\u0010\u0016\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0001\u001aI\u0010\u0016\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0001\u001aH\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001aH\u0010\u001f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\u001e\u001aH\u0010\"\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\"\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b#\u0010\u001e\u001aP\u0010\"\u001a\u00020\u0001*\u00020\u00022\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b&\u0010'\u001a=\u0010(\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0001\u001aB\u0010)\u001a\u00020\u0001*\u00020\u00022\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\t2\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0001\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"clipPath", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "clipPath-KD09W0M", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;ILkotlin/jvm/functions/Function1;)V", "clipRect", "left", "", "top", "right", "bottom", "clipRect-rOu3jXo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFFILkotlin/jvm/functions/Function1;)V", "drawIntoCanvas", "Landroidx/compose/ui/graphics/Canvas;", "inset", "horizontal", "vertical", "rotate", "degrees", "pivot", "Landroidx/compose/ui/geometry/Offset;", "rotate-Rg1IO4c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJLkotlin/jvm/functions/Function1;)V", "rotateRad", "radians", "rotateRad-Rg1IO4c", "scale", "scale-Rg1IO4c", "scaleX", "scaleY", "scale-Fgt4K4Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLkotlin/jvm/functions/Function1;)V", "translate", "withTransform", "transformBlock", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "drawBlock", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class DrawScopeKt {
    /* renamed from: clipPath-KD09W0M  reason: not valid java name */
    public static final void m1847clipPathKD09W0M(@NotNull DrawScope clipPath, @NotNull Path path, int i2, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(clipPath, "$this$clipPath");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = clipPath.getDrawContext();
        long mo1786getSizeNHjbRc = drawContext.mo1786getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo1788clipPathmtrdDE(path, i2);
        block.invoke(clipPath);
        drawContext.getCanvas().restore();
        drawContext.mo1787setSizeuvyYCjk(mo1786getSizeNHjbRc);
    }

    /* renamed from: clipPath-KD09W0M$default  reason: not valid java name */
    public static /* synthetic */ void m1848clipPathKD09W0M$default(DrawScope clipPath, Path path, int i2, Function1 block, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = ClipOp.Companion.m1381getIntersectrtfAjoo();
        }
        Intrinsics.checkNotNullParameter(clipPath, "$this$clipPath");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = clipPath.getDrawContext();
        long mo1786getSizeNHjbRc = drawContext.mo1786getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo1788clipPathmtrdDE(path, i2);
        block.invoke(clipPath);
        drawContext.getCanvas().restore();
        drawContext.mo1787setSizeuvyYCjk(mo1786getSizeNHjbRc);
    }

    /* renamed from: clipRect-rOu3jXo  reason: not valid java name */
    public static final void m1849clipRectrOu3jXo(@NotNull DrawScope clipRect, float f2, float f3, float f4, float f5, int i2, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(clipRect, "$this$clipRect");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = clipRect.getDrawContext();
        long mo1786getSizeNHjbRc = drawContext.mo1786getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo1789clipRectN_I0leg(f2, f3, f4, f5, i2);
        block.invoke(clipRect);
        drawContext.getCanvas().restore();
        drawContext.mo1787setSizeuvyYCjk(mo1786getSizeNHjbRc);
    }

    /* renamed from: clipRect-rOu3jXo$default  reason: not valid java name */
    public static /* synthetic */ void m1850clipRectrOu3jXo$default(DrawScope clipRect, float f2, float f3, float f4, float f5, int i2, Function1 block, int i3, Object obj) {
        float f6 = (i3 & 1) != 0 ? 0.0f : f2;
        float f7 = (i3 & 2) != 0 ? 0.0f : f3;
        if ((i3 & 4) != 0) {
            f4 = Size.m1230getWidthimpl(clipRect.mo1780getSizeNHjbRc());
        }
        float f8 = f4;
        if ((i3 & 8) != 0) {
            f5 = Size.m1227getHeightimpl(clipRect.mo1780getSizeNHjbRc());
        }
        float f9 = f5;
        if ((i3 & 16) != 0) {
            i2 = ClipOp.Companion.m1381getIntersectrtfAjoo();
        }
        Intrinsics.checkNotNullParameter(clipRect, "$this$clipRect");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = clipRect.getDrawContext();
        long mo1786getSizeNHjbRc = drawContext.mo1786getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo1789clipRectN_I0leg(f6, f7, f8, f9, i2);
        block.invoke(clipRect);
        drawContext.getCanvas().restore();
        drawContext.mo1787setSizeuvyYCjk(mo1786getSizeNHjbRc);
    }

    public static final void drawIntoCanvas(@NotNull DrawScope drawScope, @NotNull Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(drawScope.getDrawContext().getCanvas());
    }

    public static final void inset(@NotNull DrawScope drawScope, float f2, float f3, float f4, float f5, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        drawScope.getDrawContext().getTransform().inset(f2, f3, f4, f5);
        block.invoke(drawScope);
        drawScope.getDrawContext().getTransform().inset(-f2, -f3, -f4, -f5);
    }

    public static final void inset(@NotNull DrawScope drawScope, float f2, float f3, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        drawScope.getDrawContext().getTransform().inset(f2, f3, f2, f3);
        block.invoke(drawScope);
        float f4 = -f2;
        float f5 = -f3;
        drawScope.getDrawContext().getTransform().inset(f4, f5, f4, f5);
    }

    public static final void inset(@NotNull DrawScope drawScope, float f2, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        drawScope.getDrawContext().getTransform().inset(f2, f2, f2, f2);
        block.invoke(drawScope);
        float f3 = -f2;
        drawScope.getDrawContext().getTransform().inset(f3, f3, f3, f3);
    }

    public static /* synthetic */ void inset$default(DrawScope drawScope, float f2, float f3, Function1 block, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        drawScope.getDrawContext().getTransform().inset(f2, f3, f2, f3);
        block.invoke(drawScope);
        float f4 = -f2;
        float f5 = -f3;
        drawScope.getDrawContext().getTransform().inset(f4, f5, f4, f5);
    }

    /* renamed from: rotate-Rg1IO4c  reason: not valid java name */
    public static final void m1851rotateRg1IO4c(@NotNull DrawScope rotate, float f2, long j2, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(rotate, "$this$rotate");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = rotate.getDrawContext();
        long mo1786getSizeNHjbRc = drawContext.mo1786getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo1792rotateUv8p0NA(f2, j2);
        block.invoke(rotate);
        drawContext.getCanvas().restore();
        drawContext.mo1787setSizeuvyYCjk(mo1786getSizeNHjbRc);
    }

    /* renamed from: rotate-Rg1IO4c$default  reason: not valid java name */
    public static /* synthetic */ void m1852rotateRg1IO4c$default(DrawScope rotate, float f2, long j2, Function1 block, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = rotate.mo1779getCenterF1C5BW0();
        }
        Intrinsics.checkNotNullParameter(rotate, "$this$rotate");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = rotate.getDrawContext();
        long mo1786getSizeNHjbRc = drawContext.mo1786getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo1792rotateUv8p0NA(f2, j2);
        block.invoke(rotate);
        drawContext.getCanvas().restore();
        drawContext.mo1787setSizeuvyYCjk(mo1786getSizeNHjbRc);
    }

    /* renamed from: rotateRad-Rg1IO4c  reason: not valid java name */
    public static final void m1853rotateRadRg1IO4c(@NotNull DrawScope rotateRad, float f2, long j2, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(rotateRad, "$this$rotateRad");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = rotateRad.getDrawContext();
        long mo1786getSizeNHjbRc = drawContext.mo1786getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo1792rotateUv8p0NA(DegreesKt.degrees(f2), j2);
        block.invoke(rotateRad);
        drawContext.getCanvas().restore();
        drawContext.mo1787setSizeuvyYCjk(mo1786getSizeNHjbRc);
    }

    /* renamed from: rotateRad-Rg1IO4c$default  reason: not valid java name */
    public static /* synthetic */ void m1854rotateRadRg1IO4c$default(DrawScope rotateRad, float f2, long j2, Function1 block, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = rotateRad.mo1779getCenterF1C5BW0();
        }
        Intrinsics.checkNotNullParameter(rotateRad, "$this$rotateRad");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = rotateRad.getDrawContext();
        long mo1786getSizeNHjbRc = drawContext.mo1786getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo1792rotateUv8p0NA(DegreesKt.degrees(f2), j2);
        block.invoke(rotateRad);
        drawContext.getCanvas().restore();
        drawContext.mo1787setSizeuvyYCjk(mo1786getSizeNHjbRc);
    }

    /* renamed from: scale-Fgt4K4Q  reason: not valid java name */
    public static final void m1855scaleFgt4K4Q(@NotNull DrawScope scale, float f2, float f3, long j2, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(scale, "$this$scale");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = scale.getDrawContext();
        long mo1786getSizeNHjbRc = drawContext.mo1786getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo1793scale0AR0LA0(f2, f3, j2);
        block.invoke(scale);
        drawContext.getCanvas().restore();
        drawContext.mo1787setSizeuvyYCjk(mo1786getSizeNHjbRc);
    }

    /* renamed from: scale-Fgt4K4Q$default  reason: not valid java name */
    public static /* synthetic */ void m1856scaleFgt4K4Q$default(DrawScope scale, float f2, float f3, long j2, Function1 block, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = scale.mo1779getCenterF1C5BW0();
        }
        Intrinsics.checkNotNullParameter(scale, "$this$scale");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = scale.getDrawContext();
        long mo1786getSizeNHjbRc = drawContext.mo1786getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo1793scale0AR0LA0(f2, f3, j2);
        block.invoke(scale);
        drawContext.getCanvas().restore();
        drawContext.mo1787setSizeuvyYCjk(mo1786getSizeNHjbRc);
    }

    /* renamed from: scale-Rg1IO4c  reason: not valid java name */
    public static final void m1857scaleRg1IO4c(@NotNull DrawScope scale, float f2, long j2, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(scale, "$this$scale");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = scale.getDrawContext();
        long mo1786getSizeNHjbRc = drawContext.mo1786getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo1793scale0AR0LA0(f2, f2, j2);
        block.invoke(scale);
        drawContext.getCanvas().restore();
        drawContext.mo1787setSizeuvyYCjk(mo1786getSizeNHjbRc);
    }

    /* renamed from: scale-Rg1IO4c$default  reason: not valid java name */
    public static /* synthetic */ void m1858scaleRg1IO4c$default(DrawScope scale, float f2, long j2, Function1 block, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = scale.mo1779getCenterF1C5BW0();
        }
        Intrinsics.checkNotNullParameter(scale, "$this$scale");
        Intrinsics.checkNotNullParameter(block, "block");
        DrawContext drawContext = scale.getDrawContext();
        long mo1786getSizeNHjbRc = drawContext.mo1786getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo1793scale0AR0LA0(f2, f2, j2);
        block.invoke(scale);
        drawContext.getCanvas().restore();
        drawContext.mo1787setSizeuvyYCjk(mo1786getSizeNHjbRc);
    }

    public static final void translate(@NotNull DrawScope drawScope, float f2, float f3, @NotNull Function1<? super DrawScope, Unit> block) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        drawScope.getDrawContext().getTransform().translate(f2, f3);
        block.invoke(drawScope);
        drawScope.getDrawContext().getTransform().translate(-f2, -f3);
    }

    public static /* synthetic */ void translate$default(DrawScope drawScope, float f2, float f3, Function1 block, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        drawScope.getDrawContext().getTransform().translate(f2, f3);
        block.invoke(drawScope);
        drawScope.getDrawContext().getTransform().translate(-f2, -f3);
    }

    public static final void withTransform(@NotNull DrawScope drawScope, @NotNull Function1<? super DrawTransform, Unit> transformBlock, @NotNull Function1<? super DrawScope, Unit> drawBlock) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        Intrinsics.checkNotNullParameter(transformBlock, "transformBlock");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        DrawContext drawContext = drawScope.getDrawContext();
        long mo1786getSizeNHjbRc = drawContext.mo1786getSizeNHjbRc();
        drawContext.getCanvas().save();
        transformBlock.invoke(drawContext.getTransform());
        drawBlock.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.mo1787setSizeuvyYCjk(mo1786getSizeNHjbRc);
    }
}
