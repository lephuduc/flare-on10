package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 G2\u00020\u0001:\u0001GB\u0014\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020 2\u0006\u0010!\u001a\u00020 ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u0015\u0010\u001b\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020$¢\u0006\u0004\b\u001e\u0010%J\r\u0010&\u001a\u00020\u0018¢\u0006\u0004\b'\u0010\u001aJ\u0015\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u000e¢\u0006\u0004\b-\u0010+J\u0015\u0010.\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u000e¢\u0006\u0004\b/\u0010+J+\u00100\u001a\u00020\u00182\b\b\u0002\u00101\u001a\u00020\u000e2\b\b\u0002\u00102\u001a\u00020\u000e2\b\b\u0002\u00103\u001a\u00020\u000e¢\u0006\u0004\b4\u00105J(\u00106\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u000eH\u0086\n¢\u0006\u0004\b8\u00109J\u001b\u0010:\u001a\u00020\u00182\u0006\u0010;\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010=J\u001e\u0010>\u001a\u00020\u00182\u0006\u0010?\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010=J\u000f\u0010A\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ+\u0010E\u001a\u00020\u00182\b\b\u0002\u00101\u001a\u00020\u000e2\b\b\u0002\u00102\u001a\u00020\u000e2\b\b\u0002\u00103\u001a\u00020\u000e¢\u0006\u0004\bF\u00105R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006H"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "values", "", "constructor-impl", "([F)[F", "getValues", "()[F", "equals", "", "other", "equals-impl", "([FLjava/lang/Object;)Z", "get", "", "row", "", "column", "get-impl", "([FII)F", "hashCode", "hashCode-impl", "([F)I", "invert", "", "invert-impl", "([F)V", "map", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "map-impl", "([FLandroidx/compose/ui/geometry/MutableRect;)V", "Landroidx/compose/ui/geometry/Offset;", "point", "map-MK-Hz9U", "([FJ)J", "Landroidx/compose/ui/geometry/Rect;", "([FLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "reset", "reset-impl", "rotateX", "degrees", "rotateX-impl", "([FF)V", "rotateY", "rotateY-impl", "rotateZ", "rotateZ-impl", "scale", "x", "y", "z", "scale-impl", "([FFFF)V", "set", "v", "set-impl", "([FIIF)V", "setFrom", "matrix", "setFrom-58bKbWc", "([F[F)V", "timesAssign", "m", "timesAssign-58bKbWc", "toString", "", "toString-impl", "([F)Ljava/lang/String;", "translate", "translate-impl", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
@JvmInline
/* loaded from: classes.dex */
public final class Matrix {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int Perspective0 = 3;
    public static final int Perspective1 = 7;
    public static final int Perspective2 = 15;
    public static final int ScaleX = 0;
    public static final int ScaleY = 5;
    public static final int ScaleZ = 10;
    public static final int SkewX = 4;
    public static final int SkewY = 1;
    public static final int TranslateX = 12;
    public static final int TranslateY = 13;
    public static final int TranslateZ = 14;
    @NotNull
    private final float[] values;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/Matrix$Companion;", "", "()V", "Perspective0", "", "Perspective1", "Perspective2", "ScaleX", "ScaleY", "ScaleZ", "SkewX", "SkewY", "TranslateX", "TranslateY", "TranslateZ", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl */
    public static final /* synthetic */ Matrix m1558boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    @NotNull
    /* renamed from: constructor-impl */
    public static float[] m1559constructorimpl(@NotNull float[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return values;
    }

    /* renamed from: constructor-impl$default */
    public static /* synthetic */ float[] m1560constructorimpl$default(float[] fArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m1559constructorimpl(fArr);
    }

    /* renamed from: equals-impl */
    public static boolean m1561equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && Intrinsics.areEqual(fArr, ((Matrix) obj).m1581unboximpl());
    }

    /* renamed from: equals-impl0 */
    public static final boolean m1562equalsimpl0(float[] fArr, float[] fArr2) {
        return Intrinsics.areEqual(fArr, fArr2);
    }

    /* renamed from: get-impl */
    public static final float m1563getimpl(float[] arg0, int i2, int i3) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        return arg0[(i2 * 4) + i3];
    }

    /* renamed from: hashCode-impl */
    public static int m1564hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: invert-impl */
    public static final void m1565invertimpl(float[] arg0) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        float f2 = arg0[0];
        float f3 = arg0[1];
        float f4 = arg0[2];
        float f5 = arg0[3];
        float f6 = arg0[4];
        float f7 = arg0[5];
        float f8 = arg0[6];
        float f9 = arg0[7];
        float f10 = arg0[8];
        float f11 = arg0[9];
        float f12 = arg0[10];
        float f13 = arg0[11];
        float f14 = arg0[12];
        float f15 = arg0[13];
        float f16 = arg0[14];
        float f17 = arg0[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (((((f18 * f29) - (f19 * f28)) + (f20 * f27)) + (f21 * f26)) - (f22 * f25)) + (f23 * f24);
        if (f30 == 0.0f) {
            return;
        }
        float f31 = 1.0f / f30;
        arg0[0] = (((f7 * f29) - (f8 * f28)) + (f9 * f27)) * f31;
        arg0[1] = ((((-f3) * f29) + (f4 * f28)) - (f5 * f27)) * f31;
        arg0[2] = (((f15 * f23) - (f16 * f22)) + (f17 * f21)) * f31;
        arg0[3] = ((((-f11) * f23) + (f12 * f22)) - (f13 * f21)) * f31;
        float f32 = -f6;
        arg0[4] = (((f32 * f29) + (f8 * f26)) - (f9 * f25)) * f31;
        arg0[5] = (((f29 * f2) - (f4 * f26)) + (f5 * f25)) * f31;
        float f33 = -f14;
        arg0[6] = (((f33 * f23) + (f16 * f20)) - (f17 * f19)) * f31;
        arg0[7] = (((f23 * f10) - (f12 * f20)) + (f13 * f19)) * f31;
        arg0[8] = (((f6 * f28) - (f7 * f26)) + (f9 * f24)) * f31;
        arg0[9] = ((((-f2) * f28) + (f26 * f3)) - (f5 * f24)) * f31;
        arg0[10] = (((f14 * f22) - (f15 * f20)) + (f17 * f18)) * f31;
        arg0[11] = ((((-f10) * f22) + (f20 * f11)) - (f13 * f18)) * f31;
        arg0[12] = (((f32 * f27) + (f7 * f25)) - (f8 * f24)) * f31;
        arg0[13] = (((f2 * f27) - (f3 * f25)) + (f4 * f24)) * f31;
        arg0[14] = (((f33 * f21) + (f15 * f19)) - (f16 * f18)) * f31;
        arg0[15] = (((f10 * f21) - (f11 * f19)) + (f12 * f18)) * f31;
    }

    /* renamed from: map-MK-Hz9U */
    public static final long m1566mapMKHz9U(float[] arg0, long j2) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        float m1161getXimpl = Offset.m1161getXimpl(j2);
        float m1162getYimpl = Offset.m1162getYimpl(j2);
        float f2 = (arg0[3] * m1161getXimpl) + (arg0[7] * m1162getYimpl) + arg0[15];
        float f3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)) == 0 ? 0.0f : 1.0f / f2;
        return OffsetKt.Offset(((arg0[0] * m1161getXimpl) + (arg0[4] * m1162getYimpl) + arg0[12]) * f3, f3 * ((arg0[1] * m1161getXimpl) + (arg0[5] * m1162getYimpl) + arg0[13]));
    }

    @NotNull
    /* renamed from: map-impl */
    public static final Rect m1567mapimpl(float[] arg0, @NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Intrinsics.checkNotNullParameter(rect, "rect");
        long m1566mapMKHz9U = m1566mapMKHz9U(arg0, OffsetKt.Offset(rect.getLeft(), rect.getTop()));
        long m1566mapMKHz9U2 = m1566mapMKHz9U(arg0, OffsetKt.Offset(rect.getLeft(), rect.getBottom()));
        long m1566mapMKHz9U3 = m1566mapMKHz9U(arg0, OffsetKt.Offset(rect.getRight(), rect.getTop()));
        long m1566mapMKHz9U4 = m1566mapMKHz9U(arg0, OffsetKt.Offset(rect.getRight(), rect.getBottom()));
        return new Rect(Math.min(Math.min(Offset.m1161getXimpl(m1566mapMKHz9U), Offset.m1161getXimpl(m1566mapMKHz9U2)), Math.min(Offset.m1161getXimpl(m1566mapMKHz9U3), Offset.m1161getXimpl(m1566mapMKHz9U4))), Math.min(Math.min(Offset.m1162getYimpl(m1566mapMKHz9U), Offset.m1162getYimpl(m1566mapMKHz9U2)), Math.min(Offset.m1162getYimpl(m1566mapMKHz9U3), Offset.m1162getYimpl(m1566mapMKHz9U4))), Math.max(Math.max(Offset.m1161getXimpl(m1566mapMKHz9U), Offset.m1161getXimpl(m1566mapMKHz9U2)), Math.max(Offset.m1161getXimpl(m1566mapMKHz9U3), Offset.m1161getXimpl(m1566mapMKHz9U4))), Math.max(Math.max(Offset.m1162getYimpl(m1566mapMKHz9U), Offset.m1162getYimpl(m1566mapMKHz9U2)), Math.max(Offset.m1162getYimpl(m1566mapMKHz9U3), Offset.m1162getYimpl(m1566mapMKHz9U4))));
    }

    /* renamed from: map-impl */
    public static final void m1568mapimpl(float[] arg0, @NotNull MutableRect rect) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Intrinsics.checkNotNullParameter(rect, "rect");
        long m1566mapMKHz9U = m1566mapMKHz9U(arg0, OffsetKt.Offset(rect.getLeft(), rect.getTop()));
        long m1566mapMKHz9U2 = m1566mapMKHz9U(arg0, OffsetKt.Offset(rect.getLeft(), rect.getBottom()));
        long m1566mapMKHz9U3 = m1566mapMKHz9U(arg0, OffsetKt.Offset(rect.getRight(), rect.getTop()));
        long m1566mapMKHz9U4 = m1566mapMKHz9U(arg0, OffsetKt.Offset(rect.getRight(), rect.getBottom()));
        rect.setLeft(Math.min(Math.min(Offset.m1161getXimpl(m1566mapMKHz9U), Offset.m1161getXimpl(m1566mapMKHz9U2)), Math.min(Offset.m1161getXimpl(m1566mapMKHz9U3), Offset.m1161getXimpl(m1566mapMKHz9U4))));
        rect.setTop(Math.min(Math.min(Offset.m1162getYimpl(m1566mapMKHz9U), Offset.m1162getYimpl(m1566mapMKHz9U2)), Math.min(Offset.m1162getYimpl(m1566mapMKHz9U3), Offset.m1162getYimpl(m1566mapMKHz9U4))));
        rect.setRight(Math.max(Math.max(Offset.m1161getXimpl(m1566mapMKHz9U), Offset.m1161getXimpl(m1566mapMKHz9U2)), Math.max(Offset.m1161getXimpl(m1566mapMKHz9U3), Offset.m1161getXimpl(m1566mapMKHz9U4))));
        rect.setBottom(Math.max(Math.max(Offset.m1162getYimpl(m1566mapMKHz9U), Offset.m1162getYimpl(m1566mapMKHz9U2)), Math.max(Offset.m1162getYimpl(m1566mapMKHz9U3), Offset.m1162getYimpl(m1566mapMKHz9U4))));
    }

    /* renamed from: reset-impl */
    public static final void m1569resetimpl(float[] arg0) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        int i2 = 0;
        while (i2 < 4) {
            int i3 = i2 + 1;
            int i4 = 0;
            while (i4 < 4) {
                int i5 = i4 + 1;
                arg0[(i4 * 4) + i2] = i2 == i4 ? 1.0f : 0.0f;
                i4 = i5;
            }
            i2 = i3;
        }
    }

    /* renamed from: rotateX-impl */
    public static final void m1570rotateXimpl(float[] arg0, float f2) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        double d2 = (f2 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d2);
        float sin = (float) Math.sin(d2);
        float f3 = arg0[1];
        float f4 = arg0[2];
        float f5 = arg0[5];
        float f6 = arg0[6];
        float f7 = arg0[9];
        float f8 = arg0[10];
        float f9 = arg0[13];
        float f10 = arg0[14];
        arg0[1] = (f3 * cos) - (f4 * sin);
        arg0[2] = (f3 * sin) + (f4 * cos);
        arg0[5] = (f5 * cos) - (f6 * sin);
        arg0[6] = (f5 * sin) + (f6 * cos);
        arg0[9] = (f7 * cos) - (f8 * sin);
        arg0[10] = (f7 * sin) + (f8 * cos);
        arg0[13] = (f9 * cos) - (f10 * sin);
        arg0[14] = (f9 * sin) + (f10 * cos);
    }

    /* renamed from: rotateY-impl */
    public static final void m1571rotateYimpl(float[] arg0, float f2) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        double d2 = (f2 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d2);
        float sin = (float) Math.sin(d2);
        float f3 = arg0[0];
        float f4 = arg0[2];
        float f5 = arg0[4];
        float f6 = arg0[6];
        float f7 = arg0[8];
        float f8 = arg0[10];
        float f9 = arg0[12];
        float f10 = arg0[14];
        arg0[0] = (f3 * cos) + (f4 * sin);
        arg0[2] = ((-f3) * sin) + (f4 * cos);
        arg0[4] = (f5 * cos) + (f6 * sin);
        arg0[6] = ((-f5) * sin) + (f6 * cos);
        arg0[8] = (f7 * cos) + (f8 * sin);
        arg0[10] = ((-f7) * sin) + (f8 * cos);
        arg0[12] = (f9 * cos) + (f10 * sin);
        arg0[14] = ((-f9) * sin) + (f10 * cos);
    }

    /* renamed from: rotateZ-impl */
    public static final void m1572rotateZimpl(float[] arg0, float f2) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        double d2 = (f2 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d2);
        float sin = (float) Math.sin(d2);
        float f3 = arg0[0];
        float f4 = arg0[4];
        float f5 = -sin;
        float f6 = arg0[1];
        float f7 = arg0[5];
        float f8 = arg0[2];
        float f9 = arg0[6];
        float f10 = arg0[3];
        float f11 = arg0[7];
        arg0[0] = (cos * f3) + (sin * f4);
        arg0[1] = (cos * f6) + (sin * f7);
        arg0[2] = (cos * f8) + (sin * f9);
        arg0[3] = (cos * f10) + (sin * f11);
        arg0[4] = (f3 * f5) + (f4 * cos);
        arg0[5] = (f6 * f5) + (f7 * cos);
        arg0[6] = (f8 * f5) + (f9 * cos);
        arg0[7] = (f5 * f10) + (cos * f11);
    }

    /* renamed from: scale-impl */
    public static final void m1573scaleimpl(float[] arg0, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        arg0[0] = arg0[0] * f2;
        arg0[1] = arg0[1] * f2;
        arg0[2] = arg0[2] * f2;
        arg0[3] = arg0[3] * f2;
        arg0[4] = arg0[4] * f3;
        arg0[5] = arg0[5] * f3;
        arg0[6] = arg0[6] * f3;
        arg0[7] = arg0[7] * f3;
        arg0[8] = arg0[8] * f4;
        arg0[9] = arg0[9] * f4;
        arg0[10] = arg0[10] * f4;
        arg0[11] = arg0[11] * f4;
    }

    /* renamed from: scale-impl$default */
    public static /* synthetic */ void m1574scaleimpl$default(float[] fArr, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 1.0f;
        }
        m1573scaleimpl(fArr, f2, f3, f4);
    }

    /* renamed from: set-impl */
    public static final void m1575setimpl(float[] arg0, int i2, int i3, float f2) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        arg0[(i2 * 4) + i3] = f2;
    }

    /* renamed from: setFrom-58bKbWc */
    public static final void m1576setFrom58bKbWc(float[] arg0, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        for (int i2 = 0; i2 < 16; i2++) {
            arg0[i2] = matrix[i2];
        }
    }

    /* renamed from: timesAssign-58bKbWc */
    public static final void m1577timesAssign58bKbWc(float[] arg0, @NotNull float[] m2) {
        float m1583dotp89u6pk;
        float m1583dotp89u6pk2;
        float m1583dotp89u6pk3;
        float m1583dotp89u6pk4;
        float m1583dotp89u6pk5;
        float m1583dotp89u6pk6;
        float m1583dotp89u6pk7;
        float m1583dotp89u6pk8;
        float m1583dotp89u6pk9;
        float m1583dotp89u6pk10;
        float m1583dotp89u6pk11;
        float m1583dotp89u6pk12;
        float m1583dotp89u6pk13;
        float m1583dotp89u6pk14;
        float m1583dotp89u6pk15;
        float m1583dotp89u6pk16;
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        Intrinsics.checkNotNullParameter(m2, "m");
        m1583dotp89u6pk = MatrixKt.m1583dotp89u6pk(arg0, 0, m2, 0);
        m1583dotp89u6pk2 = MatrixKt.m1583dotp89u6pk(arg0, 0, m2, 1);
        m1583dotp89u6pk3 = MatrixKt.m1583dotp89u6pk(arg0, 0, m2, 2);
        m1583dotp89u6pk4 = MatrixKt.m1583dotp89u6pk(arg0, 0, m2, 3);
        m1583dotp89u6pk5 = MatrixKt.m1583dotp89u6pk(arg0, 1, m2, 0);
        m1583dotp89u6pk6 = MatrixKt.m1583dotp89u6pk(arg0, 1, m2, 1);
        m1583dotp89u6pk7 = MatrixKt.m1583dotp89u6pk(arg0, 1, m2, 2);
        m1583dotp89u6pk8 = MatrixKt.m1583dotp89u6pk(arg0, 1, m2, 3);
        m1583dotp89u6pk9 = MatrixKt.m1583dotp89u6pk(arg0, 2, m2, 0);
        m1583dotp89u6pk10 = MatrixKt.m1583dotp89u6pk(arg0, 2, m2, 1);
        m1583dotp89u6pk11 = MatrixKt.m1583dotp89u6pk(arg0, 2, m2, 2);
        m1583dotp89u6pk12 = MatrixKt.m1583dotp89u6pk(arg0, 2, m2, 3);
        m1583dotp89u6pk13 = MatrixKt.m1583dotp89u6pk(arg0, 3, m2, 0);
        m1583dotp89u6pk14 = MatrixKt.m1583dotp89u6pk(arg0, 3, m2, 1);
        m1583dotp89u6pk15 = MatrixKt.m1583dotp89u6pk(arg0, 3, m2, 2);
        m1583dotp89u6pk16 = MatrixKt.m1583dotp89u6pk(arg0, 3, m2, 3);
        arg0[0] = m1583dotp89u6pk;
        arg0[1] = m1583dotp89u6pk2;
        arg0[2] = m1583dotp89u6pk3;
        arg0[3] = m1583dotp89u6pk4;
        arg0[4] = m1583dotp89u6pk5;
        arg0[5] = m1583dotp89u6pk6;
        arg0[6] = m1583dotp89u6pk7;
        arg0[7] = m1583dotp89u6pk8;
        arg0[8] = m1583dotp89u6pk9;
        arg0[9] = m1583dotp89u6pk10;
        arg0[10] = m1583dotp89u6pk11;
        arg0[11] = m1583dotp89u6pk12;
        arg0[12] = m1583dotp89u6pk13;
        arg0[13] = m1583dotp89u6pk14;
        arg0[14] = m1583dotp89u6pk15;
        arg0[15] = m1583dotp89u6pk16;
    }

    @NotNull
    /* renamed from: toString-impl */
    public static String m1578toStringimpl(float[] arg0) {
        String trimIndent;
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        trimIndent = StringsKt__IndentKt.trimIndent("\n            |" + arg0[0] + ' ' + arg0[1] + ' ' + arg0[2] + ' ' + arg0[3] + "|\n            |" + arg0[4] + ' ' + arg0[5] + ' ' + arg0[6] + ' ' + arg0[7] + "|\n            |" + arg0[8] + ' ' + arg0[9] + ' ' + arg0[10] + ' ' + arg0[11] + "|\n            |" + arg0[12] + ' ' + arg0[13] + ' ' + arg0[14] + ' ' + arg0[15] + "|\n        ");
        return trimIndent;
    }

    /* renamed from: translate-impl */
    public static final void m1579translateimpl(float[] arg0, float f2, float f3, float f4) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        float f5 = (arg0[0] * f2) + (arg0[4] * f3) + (arg0[8] * f4) + arg0[12];
        float f6 = (arg0[1] * f2) + (arg0[5] * f3) + (arg0[9] * f4) + arg0[13];
        float f7 = (arg0[2] * f2) + (arg0[6] * f3) + (arg0[10] * f4) + arg0[14];
        arg0[12] = f5;
        arg0[13] = f6;
        arg0[14] = f7;
        arg0[15] = (arg0[3] * f2) + (arg0[7] * f3) + (arg0[11] * f4) + arg0[15];
    }

    /* renamed from: translate-impl$default */
    public static /* synthetic */ void m1580translateimpl$default(float[] fArr, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        m1579translateimpl(fArr, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        return m1561equalsimpl(this.values, obj);
    }

    @NotNull
    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m1564hashCodeimpl(this.values);
    }

    @NotNull
    public String toString() {
        return m1578toStringimpl(this.values);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ float[] m1581unboximpl() {
        return this.values;
    }
}
