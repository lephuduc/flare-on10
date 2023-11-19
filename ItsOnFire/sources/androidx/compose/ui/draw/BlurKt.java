package androidx.compose.ui.draw;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"blur", "Landroidx/compose/ui/Modifier;", "radius", "Landroidx/compose/ui/unit/Dp;", "edgeTreatment", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "blur-F8QBwvs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "radiusX", "radiusY", "blur-1fqS-gw", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BlurKt {
    @Stable
    @NotNull
    /* renamed from: blur-1fqS-gw  reason: not valid java name */
    public static final Modifier m1080blur1fqSgw(@NotNull Modifier blur, float f2, float f3, @NotNull Shape shape) {
        int m1690getDecal3opZhB0;
        boolean z;
        Intrinsics.checkNotNullParameter(blur, "$this$blur");
        if (shape != null) {
            m1690getDecal3opZhB0 = TileMode.Companion.m1689getClamp3opZhB0();
            z = true;
        } else {
            m1690getDecal3opZhB0 = TileMode.Companion.m1690getDecal3opZhB0();
            z = false;
        }
        float f4 = 0;
        return ((Dp.m3324compareTo0680j_4(f2, Dp.m3325constructorimpl(f4)) <= 0 || Dp.m3324compareTo0680j_4(f3, Dp.m3325constructorimpl(f4)) <= 0) && !z) ? blur : GraphicsLayerModifierKt.graphicsLayer(blur, new BlurKt$blur$1(f2, f3, m1690getDecal3opZhB0, shape, z));
    }

    /* renamed from: blur-1fqS-gw$default  reason: not valid java name */
    public static /* synthetic */ Modifier m1081blur1fqSgw$default(Modifier modifier, float f2, float f3, BlurredEdgeTreatment blurredEdgeTreatment, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m1084boximpl(BlurredEdgeTreatment.Companion.m1091getRectangleGoahg());
        }
        return m1080blur1fqSgw(modifier, f2, f3, blurredEdgeTreatment.m1090unboximpl());
    }

    @Stable
    @NotNull
    /* renamed from: blur-F8QBwvs  reason: not valid java name */
    public static final Modifier m1082blurF8QBwvs(@NotNull Modifier blur, float f2, @NotNull Shape shape) {
        Intrinsics.checkNotNullParameter(blur, "$this$blur");
        return m1080blur1fqSgw(blur, f2, f2, shape);
    }

    /* renamed from: blur-F8QBwvs$default  reason: not valid java name */
    public static /* synthetic */ Modifier m1083blurF8QBwvs$default(Modifier modifier, float f2, BlurredEdgeTreatment blurredEdgeTreatment, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m1084boximpl(BlurredEdgeTreatment.Companion.m1091getRectangleGoahg());
        }
        return m1082blurF8QBwvs(modifier, f2, blurredEdgeTreatment.m1090unboximpl());
    }
}
