package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001a\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\u00038Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000b\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/TabPosition;", "", "left", "Landroidx/compose/ui/unit/Dp;", "width", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLeft-D9Ej5fM", "()F", "F", "right", "getRight-D9Ej5fM", "getWidth-D9Ej5fM", "equals", "", "other", "hashCode", "", "toString", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TabPosition {
    private final float left;
    private final float width;

    private TabPosition(float f2, float f3) {
        this.left = f2;
        this.width = f3;
    }

    public /* synthetic */ TabPosition(float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TabPosition) {
            TabPosition tabPosition = (TabPosition) obj;
            return Dp.m3330equalsimpl0(m988getLeftD9Ej5fM(), tabPosition.m988getLeftD9Ej5fM()) && Dp.m3330equalsimpl0(m990getWidthD9Ej5fM(), tabPosition.m990getWidthD9Ej5fM());
        }
        return false;
    }

    /* renamed from: getLeft-D9Ej5fM  reason: not valid java name */
    public final float m988getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM  reason: not valid java name */
    public final float m989getRightD9Ej5fM() {
        return Dp.m3325constructorimpl(m988getLeftD9Ej5fM() + m990getWidthD9Ej5fM());
    }

    /* renamed from: getWidth-D9Ej5fM  reason: not valid java name */
    public final float m990getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (Dp.m3331hashCodeimpl(m988getLeftD9Ej5fM()) * 31) + Dp.m3331hashCodeimpl(m990getWidthD9Ej5fM());
    }

    @NotNull
    public String toString() {
        return "TabPosition(left=" + ((Object) Dp.m3336toStringimpl(m988getLeftD9Ej5fM())) + ", right=" + ((Object) Dp.m3336toStringimpl(m989getRightD9Ej5fM())) + ", width=" + ((Object) Dp.m3336toStringimpl(m990getWidthD9Ej5fM())) + ')';
    }
}
