package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001BD\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\fJ!\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0019\u0010\u0007\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\u00020\u000bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/RadialGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "(Ljava/util/List;Ljava/util/List;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class RadialGradient extends ShaderBrush {
    private final long center;
    @NotNull
    private final List<Color> colors;
    private final float radius;
    @Nullable
    private final List<Float> stops;
    private final int tileMode;

    private RadialGradient(List<Color> list, List<Float> list2, long j2, float f2, int i2) {
        this.colors = list;
        this.stops = list2;
        this.center = j2;
        this.radius = f2;
        this.tileMode = i2;
    }

    public /* synthetic */ RadialGradient(List list, List list2, long j2, float f2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i3 & 2) != 0 ? null : list2, j2, f2, (i3 & 16) != 0 ? TileMode.Companion.m1689getClamp3opZhB0() : i2, null);
    }

    public /* synthetic */ RadialGradient(List list, List list2, long j2, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j2, f2, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    @Override // androidx.compose.ui.graphics.ShaderBrush
    @org.jetbrains.annotations.NotNull
    /* renamed from: createShader-uvyYCjk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Shader mo1367createShaderuvyYCjk(long r12) {
        /*
            r11 = this;
            long r0 = r11.center
            boolean r0 = androidx.compose.ui.geometry.OffsetKt.m1182isUnspecifiedk4lQ0M(r0)
            r1 = 1
            r2 = 0
            r3 = 2139095040(0x7f800000, float:Infinity)
            if (r0 == 0) goto L19
            long r4 = androidx.compose.ui.geometry.SizeKt.m1240getCenteruvyYCjk(r12)
            float r0 = androidx.compose.ui.geometry.Offset.m1161getXimpl(r4)
        L14:
            float r4 = androidx.compose.ui.geometry.Offset.m1162getYimpl(r4)
            goto L4a
        L19:
            long r4 = r11.center
            float r0 = androidx.compose.ui.geometry.Offset.m1161getXimpl(r4)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L25
            r0 = r1
            goto L26
        L25:
            r0 = r2
        L26:
            if (r0 == 0) goto L2d
            float r0 = androidx.compose.ui.geometry.Size.m1230getWidthimpl(r12)
            goto L33
        L2d:
            long r4 = r11.center
            float r0 = androidx.compose.ui.geometry.Offset.m1161getXimpl(r4)
        L33:
            long r4 = r11.center
            float r4 = androidx.compose.ui.geometry.Offset.m1162getYimpl(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 != 0) goto L3f
            r4 = r1
            goto L40
        L3f:
            r4 = r2
        L40:
            if (r4 == 0) goto L47
            float r4 = androidx.compose.ui.geometry.Size.m1227getHeightimpl(r12)
            goto L4a
        L47:
            long r4 = r11.center
            goto L14
        L4a:
            java.util.List<androidx.compose.ui.graphics.Color> r8 = r11.colors
            java.util.List<java.lang.Float> r9 = r11.stops
            long r5 = androidx.compose.ui.geometry.OffsetKt.Offset(r0, r4)
            float r0 = r11.radius
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L59
            goto L5a
        L59:
            r1 = r2
        L5a:
            if (r1 == 0) goto L65
            float r12 = androidx.compose.ui.geometry.Size.m1229getMinDimensionimpl(r12)
            r13 = 2
            float r13 = (float) r13
            float r12 = r12 / r13
            r7 = r12
            goto L66
        L65:
            r7 = r0
        L66:
            int r10 = r11.tileMode
            android.graphics.Shader r11 = androidx.compose.ui.graphics.ShaderKt.m1641RadialGradientShader8uybcMk(r5, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.RadialGradient.mo1367createShaderuvyYCjk(long):android.graphics.Shader");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RadialGradient) {
            RadialGradient radialGradient = (RadialGradient) obj;
            if (Intrinsics.areEqual(this.colors, radialGradient.colors) && Intrinsics.areEqual(this.stops, radialGradient.stops) && Offset.m1158equalsimpl0(this.center, radialGradient.center)) {
                return ((this.radius > radialGradient.radius ? 1 : (this.radius == radialGradient.radius ? 0 : -1)) == 0) && TileMode.m1685equalsimpl0(this.tileMode, radialGradient.tileMode);
            }
            return false;
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo1346getIntrinsicSizeNHjbRc() {
        float f2 = this.radius;
        if ((Float.isInfinite(f2) || Float.isNaN(f2)) ? false : true) {
            float f3 = this.radius;
            float f4 = 2;
            return SizeKt.Size(f3 * f4, f3 * f4);
        }
        return Size.Companion.m1238getUnspecifiedNHjbRc();
    }

    public int hashCode() {
        int hashCode = this.colors.hashCode() * 31;
        List<Float> list = this.stops;
        return ((((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + Offset.m1163hashCodeimpl(this.center)) * 31) + Float.hashCode(this.radius)) * 31) + TileMode.m1686hashCodeimpl(this.tileMode);
    }

    @NotNull
    public String toString() {
        String str;
        String str2 = "";
        if (OffsetKt.m1180isSpecifiedk4lQ0M(this.center)) {
            str = "center=" + ((Object) Offset.m1169toStringimpl(this.center)) + ", ";
        } else {
            str = "";
        }
        float f2 = this.radius;
        if ((Float.isInfinite(f2) || Float.isNaN(f2)) ? false : true) {
            str2 = "radius=" + this.radius + ", ";
        }
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m1687toStringimpl(this.tileMode)) + ')';
    }
}
