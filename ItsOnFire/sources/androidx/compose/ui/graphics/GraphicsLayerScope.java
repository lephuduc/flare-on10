package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R \u0010\u000b\u001a\u00020\f8fX¦\u000e¢\u0006\u0012\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00148V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0005\"\u0004\b\u001c\u0010\u0007R\u0018\u0010\u001d\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0005\"\u0004\b\u001f\u0010\u0007R\u0018\u0010 \u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0005\"\u0004\b\"\u0010\u0007R\u0018\u0010#\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0005\"\u0004\b%\u0010\u0007R\u0018\u0010&\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0005\"\u0004\b(\u0010\u0007R\u0018\u0010)\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0005\"\u0004\b+\u0010\u0007R\u0018\u0010,\u001a\u00020-X¦\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R!\u00102\u001a\u000203X¦\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0018\u00108\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b9\u0010\u0005\"\u0004\b:\u0010\u0007R\u0018\u0010;\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b<\u0010\u0005\"\u0004\b=\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Landroidx/compose/ui/unit/Density;", "alpha", "", "getAlpha", "()F", "setAlpha", "(F)V", "cameraDistance", "getCameraDistance", "setCameraDistance", "clip", "", "getClip$annotations", "()V", "getClip", "()Z", "setClip", "(Z)V", "<anonymous parameter 0>", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "shadowElevation", "getShadowElevation", "setShadowElevation", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "getTransformOrigin-SzJe1aQ", "()J", "setTransformOrigin-__ExYCQ", "(J)V", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public interface GraphicsLayerScope extends Density {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getClip$annotations() {
        }

        @Nullable
        public static RenderEffect getRenderEffect(@NotNull GraphicsLayerScope graphicsLayerScope) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope, "this");
            return null;
        }

        @Stable
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m1532roundToPxR2X_6o(@NotNull GraphicsLayerScope graphicsLayerScope, long j2) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope, "this");
            return Density.DefaultImpls.m3311roundToPxR2X_6o(graphicsLayerScope, j2);
        }

        @Stable
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m1533roundToPx0680j_4(@NotNull GraphicsLayerScope graphicsLayerScope, float f2) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope, "this");
            return Density.DefaultImpls.m3312roundToPx0680j_4(graphicsLayerScope, f2);
        }

        public static void setRenderEffect(@NotNull GraphicsLayerScope graphicsLayerScope, @Nullable RenderEffect renderEffect) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope, "this");
        }

        @Stable
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m1534toDpGaN1DYA(@NotNull GraphicsLayerScope graphicsLayerScope, long j2) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope, "this");
            return Density.DefaultImpls.m3313toDpGaN1DYA(graphicsLayerScope, j2);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m1535toDpu2uoSUM(@NotNull GraphicsLayerScope graphicsLayerScope, float f2) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope, "this");
            return Density.DefaultImpls.m3314toDpu2uoSUM(graphicsLayerScope, f2);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m1536toDpu2uoSUM(@NotNull GraphicsLayerScope graphicsLayerScope, int i2) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope, "this");
            return Density.DefaultImpls.m3315toDpu2uoSUM((Density) graphicsLayerScope, i2);
        }

        @Stable
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m1537toDpSizekrfVVM(@NotNull GraphicsLayerScope graphicsLayerScope, long j2) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope, "this");
            return Density.DefaultImpls.m3316toDpSizekrfVVM(graphicsLayerScope, j2);
        }

        @Stable
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m1538toPxR2X_6o(@NotNull GraphicsLayerScope graphicsLayerScope, long j2) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope, "this");
            return Density.DefaultImpls.m3317toPxR2X_6o(graphicsLayerScope, j2);
        }

        @Stable
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m1539toPx0680j_4(@NotNull GraphicsLayerScope graphicsLayerScope, float f2) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope, "this");
            return Density.DefaultImpls.m3318toPx0680j_4(graphicsLayerScope, f2);
        }

        @Stable
        @NotNull
        public static Rect toRect(@NotNull GraphicsLayerScope graphicsLayerScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return Density.DefaultImpls.toRect(graphicsLayerScope, receiver);
        }

        @Stable
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m1540toSizeXkaWNTQ(@NotNull GraphicsLayerScope graphicsLayerScope, long j2) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope, "this");
            return Density.DefaultImpls.m3319toSizeXkaWNTQ(graphicsLayerScope, j2);
        }

        @Stable
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m1541toSp0xMU5do(@NotNull GraphicsLayerScope graphicsLayerScope, float f2) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope, "this");
            return Density.DefaultImpls.m3320toSp0xMU5do(graphicsLayerScope, f2);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m1542toSpkPz2Gy4(@NotNull GraphicsLayerScope graphicsLayerScope, float f2) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope, "this");
            return Density.DefaultImpls.m3321toSpkPz2Gy4(graphicsLayerScope, f2);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m1543toSpkPz2Gy4(@NotNull GraphicsLayerScope graphicsLayerScope, int i2) {
            Intrinsics.checkNotNullParameter(graphicsLayerScope, "this");
            return Density.DefaultImpls.m3322toSpkPz2Gy4((Density) graphicsLayerScope, i2);
        }
    }

    float getAlpha();

    float getCameraDistance();

    boolean getClip();

    @Nullable
    RenderEffect getRenderEffect();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    @NotNull
    Shape getShape();

    /* renamed from: getTransformOrigin-SzJe1aQ  reason: not valid java name */
    long mo1530getTransformOriginSzJe1aQ();

    float getTranslationX();

    float getTranslationY();

    void setAlpha(float f2);

    void setCameraDistance(float f2);

    void setClip(boolean z);

    void setRenderEffect(@Nullable RenderEffect renderEffect);

    void setRotationX(float f2);

    void setRotationY(float f2);

    void setRotationZ(float f2);

    void setScaleX(float f2);

    void setScaleY(float f2);

    void setShadowElevation(float f2);

    void setShape(@NotNull Shape shape);

    /* renamed from: setTransformOrigin-__ExYCQ  reason: not valid java name */
    void mo1531setTransformOrigin__ExYCQ(long j2);

    void setTranslationX(float f2);

    void setTranslationY(float f2);
}
