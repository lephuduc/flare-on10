package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import androidx.compose.ui.graphics.VertexMode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"toAndroidVertexMode", "Landroid/graphics/Canvas$VertexMode;", "Landroidx/compose/ui/graphics/VertexMode;", "toAndroidVertexMode-JOOmi9M", "(I)Landroid/graphics/Canvas$VertexMode;", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidVertexMode_androidKt {
    @NotNull
    /* renamed from: toAndroidVertexMode-JOOmi9M  reason: not valid java name */
    public static final Canvas.VertexMode m1306toAndroidVertexModeJOOmi9M(int i2) {
        VertexMode.Companion companion = VertexMode.Companion;
        if (!VertexMode.m1711equalsimpl0(i2, companion.m1717getTrianglesc2xauaI())) {
            if (VertexMode.m1711equalsimpl0(i2, companion.m1716getTriangleStripc2xauaI())) {
                return Canvas.VertexMode.TRIANGLE_STRIP;
            }
            if (VertexMode.m1711equalsimpl0(i2, companion.m1715getTriangleFanc2xauaI())) {
                return Canvas.VertexMode.TRIANGLE_FAN;
            }
        }
        return Canvas.VertexMode.TRIANGLES;
    }
}
