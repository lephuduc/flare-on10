package android.graphics;

import android.annotation.NonNull;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final /* synthetic */ class RenderEffect {
    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public static native /* synthetic */ RenderEffect createBlurEffect(float f2, float f3, @NonNull RenderEffect renderEffect, @NonNull Shader.TileMode tileMode);

    @NonNull
    public static native /* synthetic */ RenderEffect createBlurEffect(float f2, float f3, @NonNull Shader.TileMode tileMode);

    @NonNull
    public static native /* synthetic */ RenderEffect createOffsetEffect(float f2, float f3);

    @NonNull
    public static native /* synthetic */ RenderEffect createOffsetEffect(float f2, float f3, @NonNull RenderEffect renderEffect);
}
