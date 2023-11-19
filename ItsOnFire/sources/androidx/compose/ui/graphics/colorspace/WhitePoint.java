package androidx.compose.ui.graphics.colorspace;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006B'\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\r\u0010\u0017\u001a\u00020\u0018H\u0000¢\u0006\u0002\b\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "", "x", "", "y", "z", "(FFF)V", "sum", "(FFFF)V", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "toXyz", "", "toXyz$ui_graphics_release", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class WhitePoint {
    private final float x;
    private final float y;

    public WhitePoint(float f2, float f3) {
        this.x = f2;
        this.y = f3;
    }

    public WhitePoint(float f2, float f3, float f4) {
        this(f2, f3, f4, f2 + f3 + f4);
    }

    private WhitePoint(float f2, float f3, float f4, float f5) {
        this(f2 / f5, f3 / f5);
    }

    public static /* synthetic */ WhitePoint copy$default(WhitePoint whitePoint, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = whitePoint.x;
        }
        if ((i2 & 2) != 0) {
            f3 = whitePoint.y;
        }
        return whitePoint.copy(f2, f3);
    }

    public final float component1() {
        return this.x;
    }

    public final float component2() {
        return this.y;
    }

    @NotNull
    public final WhitePoint copy(float f2, float f3) {
        return new WhitePoint(f2, f3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WhitePoint) {
            WhitePoint whitePoint = (WhitePoint) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.x), (Object) Float.valueOf(whitePoint.x)) && Intrinsics.areEqual((Object) Float.valueOf(this.y), (Object) Float.valueOf(whitePoint.y));
        }
        return false;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return (Float.hashCode(this.x) * 31) + Float.hashCode(this.y);
    }

    @NotNull
    public String toString() {
        return "WhitePoint(x=" + this.x + ", y=" + this.y + ')';
    }

    @NotNull
    public final float[] toXyz$ui_graphics_release() {
        float f2 = this.x;
        float f3 = this.y;
        return new float[]{f2 / f3, 1.0f, ((1.0f - f2) - f3) / f3};
    }
}
