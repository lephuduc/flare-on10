package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.appcompat.R;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010L\u001a\u00020MH&J\u0010\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020PH&J\b\u0010Q\u001a\u00020RH&J\u0010\u0010S\u001a\u00020M2\u0006\u0010T\u001a\u00020UH&J\u0010\u0010V\u001a\u00020M2\u0006\u0010T\u001a\u00020UH&J\u0010\u0010W\u001a\u00020M2\u0006\u0010X\u001a\u00020\tH&J\u0010\u0010Y\u001a\u00020M2\u0006\u0010X\u001a\u00020\tH&J.\u0010Z\u001a\u00020M2\u0006\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010^2\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020M0`H&J\u0010\u0010b\u001a\u00020\u00102\u0006\u0010c\u001a\u00020\u0010H&J\u0012\u0010d\u001a\u00020M2\b\u0010e\u001a\u0004\u0018\u00010fH&J(\u0010g\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0005\"\u0004\b\u000e\u0010\u0007R\u0018\u0010\u000f\u001a\u00020\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u00020\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u0018\u0010\u0018\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0005\"\u0004\b\u001a\u0010\u0007R\u0012\u0010\u001b\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u0012\u0010\u001d\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000bR\u0012\u0010\u001f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u000bR\u0018\u0010!\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0005\"\u0004\b#\u0010\u0007R\u0018\u0010$\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0005\"\u0004\b&\u0010\u0007R\u001a\u0010'\u001a\u0004\u0018\u00010(X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0012\u0010-\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u000bR\u0018\u0010/\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b0\u0010\u0005\"\u0004\b1\u0010\u0007R\u0018\u00102\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b3\u0010\u0005\"\u0004\b4\u0010\u0007R\u0018\u00105\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b6\u0010\u0005\"\u0004\b7\u0010\u0007R\u0018\u00108\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b9\u0010\u0005\"\u0004\b:\u0010\u0007R\u0018\u0010;\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b<\u0010\u0005\"\u0004\b=\u0010\u0007R\u0012\u0010>\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u000bR\u0018\u0010@\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bA\u0010\u0005\"\u0004\bB\u0010\u0007R\u0018\u0010C\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bD\u0010\u0005\"\u0004\bE\u0010\u0007R\u0012\u0010F\u001a\u00020GX¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0012\u0010J\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u000b¨\u0006h"}, d2 = {"Landroidx/compose/ui/platform/DeviceRenderNode;", "", "alpha", "", "getAlpha", "()F", "setAlpha", "(F)V", "bottom", "", "getBottom", "()I", "cameraDistance", "getCameraDistance", "setCameraDistance", "clipToBounds", "", "getClipToBounds", "()Z", "setClipToBounds", "(Z)V", "clipToOutline", "getClipToOutline", "setClipToOutline", "elevation", "getElevation", "setElevation", "hasDisplayList", "getHasDisplayList", "height", "getHeight", "left", "getLeft", "pivotX", "getPivotX", "setPivotX", "pivotY", "getPivotY", "setPivotY", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "right", "getRight", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "top", "getTop", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "uniqueId", "", "getUniqueId", "()J", "width", "getWidth", "discardDisplayList", "", "drawInto", "canvas", "Landroid/graphics/Canvas;", "dumpRenderNodeData", "Landroidx/compose/ui/platform/DeviceRenderNodeData;", "getInverseMatrix", "matrix", "Landroid/graphics/Matrix;", "getMatrix", "offsetLeftAndRight", "offset", "offsetTopAndBottom", "record", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "clipPath", "Landroidx/compose/ui/graphics/Path;", "drawBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "setHasOverlappingRendering", "hasOverlappingRendering", "setOutline", "outline", "Landroid/graphics/Outline;", "setPosition", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public interface DeviceRenderNode {
    void discardDisplayList();

    void drawInto(@NotNull Canvas canvas);

    @NotNull
    DeviceRenderNodeData dumpRenderNodeData();

    float getAlpha();

    int getBottom();

    float getCameraDistance();

    boolean getClipToBounds();

    boolean getClipToOutline();

    float getElevation();

    boolean getHasDisplayList();

    int getHeight();

    void getInverseMatrix(@NotNull Matrix matrix);

    int getLeft();

    void getMatrix(@NotNull Matrix matrix);

    float getPivotX();

    float getPivotY();

    @Nullable
    RenderEffect getRenderEffect();

    int getRight();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    int getTop();

    float getTranslationX();

    float getTranslationY();

    long getUniqueId();

    int getWidth();

    void offsetLeftAndRight(int i2);

    void offsetTopAndBottom(int i2);

    void record(@NotNull CanvasHolder canvasHolder, @Nullable Path path, @NotNull Function1<? super androidx.compose.ui.graphics.Canvas, Unit> function1);

    void setAlpha(float f2);

    void setCameraDistance(float f2);

    void setClipToBounds(boolean z);

    void setClipToOutline(boolean z);

    void setElevation(float f2);

    boolean setHasOverlappingRendering(boolean z);

    void setOutline(@Nullable Outline outline);

    void setPivotX(float f2);

    void setPivotY(float f2);

    boolean setPosition(int i2, int i3, int i4, int i5);

    void setRenderEffect(@Nullable RenderEffect renderEffect);

    void setRotationX(float f2);

    void setRotationY(float f2);

    void setRotationZ(float f2);

    void setScaleX(float f2);

    void setScaleY(float f2);

    void setTranslationX(float f2);

    void setTranslationY(float f2);
}
