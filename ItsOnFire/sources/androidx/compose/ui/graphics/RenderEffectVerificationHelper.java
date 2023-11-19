package androidx.compose.ui.graphics;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(31)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/RenderEffectVerificationHelper;", "", "()V", "createBlurEffect", "Landroid/graphics/RenderEffect;", "inputRenderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "radiusX", "", "radiusY", "edgeTreatment", "Landroidx/compose/ui/graphics/TileMode;", "createBlurEffect-8A-3gB4", "(Landroidx/compose/ui/graphics/RenderEffect;FFI)Landroid/graphics/RenderEffect;", "createOffsetEffect", "offset", "Landroidx/compose/ui/geometry/Offset;", "createOffsetEffect-Uv8p0NA", "(Landroidx/compose/ui/graphics/RenderEffect;J)Landroid/graphics/RenderEffect;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
final class RenderEffectVerificationHelper {
    @NotNull
    public static final RenderEffectVerificationHelper INSTANCE = new RenderEffectVerificationHelper();

    private RenderEffectVerificationHelper() {
    }

    @DoNotInline
    @NotNull
    /* renamed from: createBlurEffect-8A-3gB4  reason: not valid java name */
    public final android.graphics.RenderEffect m1635createBlurEffect8A3gB4(@Nullable RenderEffect renderEffect, float f2, float f3, int i2) {
        android.graphics.RenderEffect createBlurEffect = renderEffect == null ? android.graphics.RenderEffect.createBlurEffect(f2, f3, AndroidTileMode_androidKt.m1305toAndroidTileMode0vamqd0(i2)) : android.graphics.RenderEffect.createBlurEffect(f2, f3, renderEffect.asAndroidRenderEffect(), AndroidTileMode_androidKt.m1305toAndroidTileMode0vamqd0(i2));
        Intrinsics.checkNotNullExpressionValue(createBlurEffect, "{\n            android.gr…)\n            )\n        }");
        return createBlurEffect;
    }

    @DoNotInline
    @NotNull
    /* renamed from: createOffsetEffect-Uv8p0NA  reason: not valid java name */
    public final android.graphics.RenderEffect m1636createOffsetEffectUv8p0NA(@Nullable RenderEffect renderEffect, long j2) {
        android.graphics.RenderEffect createOffsetEffect;
        String str;
        float m1161getXimpl = Offset.m1161getXimpl(j2);
        if (renderEffect == null) {
            createOffsetEffect = android.graphics.RenderEffect.createOffsetEffect(m1161getXimpl, Offset.m1162getYimpl(j2));
            str = "{\n            android.gr…et.x, offset.y)\n        }";
        } else {
            createOffsetEffect = android.graphics.RenderEffect.createOffsetEffect(m1161getXimpl, Offset.m1162getYimpl(j2), renderEffect.asAndroidRenderEffect());
            str = "{\n            android.gr…)\n            )\n        }";
        }
        Intrinsics.checkNotNullExpressionValue(createOffsetEffect, str);
        return createOffsetEffect;
    }
}
