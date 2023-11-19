package androidx.compose.foundation;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J'\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/BorderStroke;", "", "width", "Landroidx/compose/ui/unit/Dp;", "brush", "Landroidx/compose/ui/graphics/Brush;", "(FLandroidx/compose/ui/graphics/Brush;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getWidth-D9Ej5fM", "()F", "F", "copy", "copy-D5KLDUw", "(FLandroidx/compose/ui/graphics/Brush;)Landroidx/compose/foundation/BorderStroke;", "equals", "", "other", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BorderStroke {
    @NotNull
    private final Brush brush;
    private final float width;

    private BorderStroke(float f2, Brush brush) {
        this.width = f2;
        this.brush = brush;
    }

    public /* synthetic */ BorderStroke(float f2, Brush brush, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, brush);
    }

    /* renamed from: copy-D5KLDUw$default  reason: not valid java name */
    public static /* synthetic */ BorderStroke m163copyD5KLDUw$default(BorderStroke borderStroke, float f2, Brush brush, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = borderStroke.m165getWidthD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            brush = borderStroke.brush;
        }
        return borderStroke.m164copyD5KLDUw(f2, brush);
    }

    @NotNull
    /* renamed from: copy-D5KLDUw  reason: not valid java name */
    public final BorderStroke m164copyD5KLDUw(float f2, @NotNull Brush brush) {
        Intrinsics.checkNotNullParameter(brush, "brush");
        return new BorderStroke(f2, brush, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BorderStroke) {
            BorderStroke borderStroke = (BorderStroke) obj;
            return Dp.m3330equalsimpl0(m165getWidthD9Ej5fM(), borderStroke.m165getWidthD9Ej5fM()) && Intrinsics.areEqual(this.brush, borderStroke.brush);
        }
        return false;
    }

    @NotNull
    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getWidth-D9Ej5fM  reason: not valid java name */
    public final float m165getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (Dp.m3331hashCodeimpl(m165getWidthD9Ej5fM()) * 31) + this.brush.hashCode();
    }

    @NotNull
    public String toString() {
        return "BorderStroke(width=" + ((Object) Dp.m3336toStringimpl(m165getWidthD9Ej5fM())) + ", brush=" + this.brush + ')';
    }
}
