package androidx.compose.ui.geometry;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0001>BP\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\bø\u0001\u0000¢\u0006\u0002\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0019\u0010!\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\"\u0010\u0011J\u0019\u0010#\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b$\u0010\u0011J\u0019\u0010%\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b&\u0010\u0011J\u0019\u0010'\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b(\u0010\u0011J\u001b\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.Jf\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\u00020*2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J(\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0003H\u0002J\b\u0010;\u001a\u00020\u0000H\u0002J\b\u0010<\u001a\u00020=H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u000b\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\n\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u001c\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "left", "", "top", "right", "bottom", "topLeftCornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "_scaledRadiiRect", "getBottom", "()F", "getBottomLeftCornerRadius-kKHJgLs", "()J", "J", "getBottomRightCornerRadius-kKHJgLs", "height", "getHeight", "getLeft", "getRight", "getTop", "getTopLeftCornerRadius-kKHJgLs", "getTopRightCornerRadius-kKHJgLs", "width", "getWidth", "component1", "component2", "component3", "component4", "component5", "component5-kKHJgLs", "component6", "component6-kKHJgLs", "component7", "component7-kKHJgLs", "component8", "component8-kKHJgLs", "contains", "", "point", "Landroidx/compose/ui/geometry/Offset;", "contains-k-4lQ0M", "(J)Z", "copy", "copy-MDFrsts", "(FFFFJJJJ)Landroidx/compose/ui/geometry/RoundRect;", "equals", "other", "hashCode", "", "minRadius", "min", "radius1", "radius2", "limit", "scaledRadiiRect", "toString", "", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class RoundRect {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final RoundRect Zero = RoundRectKt.m1215RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.Companion.m1146getZerokKHJgLs());
    @Nullable
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/RoundRect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getZero$annotations() {
        }

        @NotNull
        public final RoundRect getZero() {
            return RoundRect.Zero;
        }
    }

    private RoundRect(float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5) {
        this.left = f2;
        this.top = f3;
        this.right = f4;
        this.bottom = f5;
        this.topLeftCornerRadius = j2;
        this.topRightCornerRadius = j3;
        this.bottomRightCornerRadius = j4;
        this.bottomLeftCornerRadius = j5;
    }

    public /* synthetic */ RoundRect(float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, (i2 & 16) != 0 ? CornerRadius.Companion.m1146getZerokKHJgLs() : j2, (i2 & 32) != 0 ? CornerRadius.Companion.m1146getZerokKHJgLs() : j3, (i2 & 64) != 0 ? CornerRadius.Companion.m1146getZerokKHJgLs() : j4, (i2 & 128) != 0 ? CornerRadius.Companion.m1146getZerokKHJgLs() : j5, null);
    }

    public /* synthetic */ RoundRect(float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, j2, j3, j4, j5);
    }

    @NotNull
    public static final RoundRect getZero() {
        return Companion.getZero();
    }

    private final float minRadius(float f2, float f3, float f4, float f5) {
        float f6 = f3 + f4;
        if (f6 > f5) {
            return !((f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1)) == 0) ? Math.min(f2, f5 / f6) : f2;
        }
        return f2;
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect == null) {
            float minRadius = minRadius(minRadius(minRadius(minRadius(1.0f, CornerRadius.m1137getYimpl(m1209getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m1137getYimpl(m1211getTopLeftCornerRadiuskKHJgLs()), getHeight()), CornerRadius.m1136getXimpl(m1211getTopLeftCornerRadiuskKHJgLs()), CornerRadius.m1136getXimpl(m1212getTopRightCornerRadiuskKHJgLs()), getWidth()), CornerRadius.m1137getYimpl(m1212getTopRightCornerRadiuskKHJgLs()), CornerRadius.m1137getYimpl(m1210getBottomRightCornerRadiuskKHJgLs()), getHeight()), CornerRadius.m1136getXimpl(m1210getBottomRightCornerRadiuskKHJgLs()), CornerRadius.m1136getXimpl(m1209getBottomLeftCornerRadiuskKHJgLs()), getWidth());
            RoundRect roundRect2 = new RoundRect(getLeft() * minRadius, getTop() * minRadius, getRight() * minRadius, getBottom() * minRadius, CornerRadiusKt.CornerRadius(CornerRadius.m1136getXimpl(m1211getTopLeftCornerRadiuskKHJgLs()) * minRadius, CornerRadius.m1137getYimpl(m1211getTopLeftCornerRadiuskKHJgLs()) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m1136getXimpl(m1212getTopRightCornerRadiuskKHJgLs()) * minRadius, CornerRadius.m1137getYimpl(m1212getTopRightCornerRadiuskKHJgLs()) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m1136getXimpl(m1210getBottomRightCornerRadiuskKHJgLs()) * minRadius, CornerRadius.m1137getYimpl(m1210getBottomRightCornerRadiuskKHJgLs()) * minRadius), CornerRadiusKt.CornerRadius(CornerRadius.m1136getXimpl(m1209getBottomLeftCornerRadiuskKHJgLs()) * minRadius, CornerRadius.m1137getYimpl(m1209getBottomLeftCornerRadiuskKHJgLs()) * minRadius), null);
            this._scaledRadiiRect = roundRect2;
            return roundRect2;
        }
        return roundRect;
    }

    public final float component1() {
        return this.left;
    }

    public final float component2() {
        return this.top;
    }

    public final float component3() {
        return this.right;
    }

    public final float component4() {
        return this.bottom;
    }

    /* renamed from: component5-kKHJgLs  reason: not valid java name */
    public final long m1203component5kKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: component6-kKHJgLs  reason: not valid java name */
    public final long m1204component6kKHJgLs() {
        return this.topRightCornerRadius;
    }

    /* renamed from: component7-kKHJgLs  reason: not valid java name */
    public final long m1205component7kKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    /* renamed from: component8-kKHJgLs  reason: not valid java name */
    public final long m1206component8kKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: contains-k-4lQ0M  reason: not valid java name */
    public final boolean m1207containsk4lQ0M(long j2) {
        float m1161getXimpl;
        float m1162getYimpl;
        float m1136getXimpl;
        long m1209getBottomLeftCornerRadiuskKHJgLs;
        if (Offset.m1161getXimpl(j2) < this.left || Offset.m1161getXimpl(j2) >= this.right || Offset.m1162getYimpl(j2) < this.top || Offset.m1162getYimpl(j2) >= this.bottom) {
            return false;
        }
        RoundRect scaledRadiiRect = scaledRadiiRect();
        if (Offset.m1161getXimpl(j2) < this.left + CornerRadius.m1136getXimpl(scaledRadiiRect.m1211getTopLeftCornerRadiuskKHJgLs()) && Offset.m1162getYimpl(j2) < this.top + CornerRadius.m1137getYimpl(scaledRadiiRect.m1211getTopLeftCornerRadiuskKHJgLs())) {
            m1161getXimpl = (Offset.m1161getXimpl(j2) - this.left) - CornerRadius.m1136getXimpl(scaledRadiiRect.m1211getTopLeftCornerRadiuskKHJgLs());
            m1162getYimpl = (Offset.m1162getYimpl(j2) - this.top) - CornerRadius.m1137getYimpl(scaledRadiiRect.m1211getTopLeftCornerRadiuskKHJgLs());
            m1136getXimpl = CornerRadius.m1136getXimpl(scaledRadiiRect.m1211getTopLeftCornerRadiuskKHJgLs());
            m1209getBottomLeftCornerRadiuskKHJgLs = scaledRadiiRect.m1211getTopLeftCornerRadiuskKHJgLs();
        } else if (Offset.m1161getXimpl(j2) > this.right - CornerRadius.m1136getXimpl(scaledRadiiRect.m1212getTopRightCornerRadiuskKHJgLs()) && Offset.m1162getYimpl(j2) < this.top + CornerRadius.m1137getYimpl(scaledRadiiRect.m1212getTopRightCornerRadiuskKHJgLs())) {
            m1161getXimpl = (Offset.m1161getXimpl(j2) - this.right) + CornerRadius.m1136getXimpl(scaledRadiiRect.m1212getTopRightCornerRadiuskKHJgLs());
            m1162getYimpl = (Offset.m1162getYimpl(j2) - this.top) - CornerRadius.m1137getYimpl(scaledRadiiRect.m1212getTopRightCornerRadiuskKHJgLs());
            m1136getXimpl = CornerRadius.m1136getXimpl(scaledRadiiRect.m1212getTopRightCornerRadiuskKHJgLs());
            m1209getBottomLeftCornerRadiuskKHJgLs = scaledRadiiRect.m1212getTopRightCornerRadiuskKHJgLs();
        } else if (Offset.m1161getXimpl(j2) > this.right - CornerRadius.m1136getXimpl(scaledRadiiRect.m1210getBottomRightCornerRadiuskKHJgLs()) && Offset.m1162getYimpl(j2) > this.bottom - CornerRadius.m1137getYimpl(scaledRadiiRect.m1210getBottomRightCornerRadiuskKHJgLs())) {
            m1161getXimpl = (Offset.m1161getXimpl(j2) - this.right) + CornerRadius.m1136getXimpl(scaledRadiiRect.m1210getBottomRightCornerRadiuskKHJgLs());
            m1162getYimpl = (Offset.m1162getYimpl(j2) - this.bottom) + CornerRadius.m1137getYimpl(scaledRadiiRect.m1210getBottomRightCornerRadiuskKHJgLs());
            m1136getXimpl = CornerRadius.m1136getXimpl(scaledRadiiRect.m1210getBottomRightCornerRadiuskKHJgLs());
            m1209getBottomLeftCornerRadiuskKHJgLs = scaledRadiiRect.m1210getBottomRightCornerRadiuskKHJgLs();
        } else if (Offset.m1161getXimpl(j2) >= this.left + CornerRadius.m1136getXimpl(scaledRadiiRect.m1209getBottomLeftCornerRadiuskKHJgLs()) || Offset.m1162getYimpl(j2) <= this.bottom - CornerRadius.m1137getYimpl(scaledRadiiRect.m1209getBottomLeftCornerRadiuskKHJgLs())) {
            return true;
        } else {
            m1161getXimpl = (Offset.m1161getXimpl(j2) - this.left) - CornerRadius.m1136getXimpl(scaledRadiiRect.m1209getBottomLeftCornerRadiuskKHJgLs());
            m1162getYimpl = (Offset.m1162getYimpl(j2) - this.bottom) + CornerRadius.m1137getYimpl(scaledRadiiRect.m1209getBottomLeftCornerRadiuskKHJgLs());
            m1136getXimpl = CornerRadius.m1136getXimpl(scaledRadiiRect.m1209getBottomLeftCornerRadiuskKHJgLs());
            m1209getBottomLeftCornerRadiuskKHJgLs = scaledRadiiRect.m1209getBottomLeftCornerRadiuskKHJgLs();
        }
        float f2 = m1161getXimpl / m1136getXimpl;
        float m1137getYimpl = m1162getYimpl / CornerRadius.m1137getYimpl(m1209getBottomLeftCornerRadiuskKHJgLs);
        return (f2 * f2) + (m1137getYimpl * m1137getYimpl) <= 1.0f;
    }

    @NotNull
    /* renamed from: copy-MDFrsts  reason: not valid java name */
    public final RoundRect m1208copyMDFrsts(float f2, float f3, float f4, float f5, long j2, long j3, long j4, long j5) {
        return new RoundRect(f2, f3, f4, f5, j2, j3, j4, j5, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RoundRect) {
            RoundRect roundRect = (RoundRect) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.left), (Object) Float.valueOf(roundRect.left)) && Intrinsics.areEqual((Object) Float.valueOf(this.top), (Object) Float.valueOf(roundRect.top)) && Intrinsics.areEqual((Object) Float.valueOf(this.right), (Object) Float.valueOf(roundRect.right)) && Intrinsics.areEqual((Object) Float.valueOf(this.bottom), (Object) Float.valueOf(roundRect.bottom)) && CornerRadius.m1135equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m1135equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m1135equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m1135equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
        }
        return false;
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomLeftCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m1209getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: getBottomRightCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m1210getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    /* renamed from: getTopLeftCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m1211getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: getTopRightCornerRadius-kKHJgLs  reason: not valid java name */
    public final long m1212getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom)) * 31) + CornerRadius.m1138hashCodeimpl(this.topLeftCornerRadius)) * 31) + CornerRadius.m1138hashCodeimpl(this.topRightCornerRadius)) * 31) + CornerRadius.m1138hashCodeimpl(this.bottomRightCornerRadius)) * 31) + CornerRadius.m1138hashCodeimpl(this.bottomLeftCornerRadius);
    }

    @NotNull
    public String toString() {
        long m1211getTopLeftCornerRadiuskKHJgLs = m1211getTopLeftCornerRadiuskKHJgLs();
        long m1212getTopRightCornerRadiuskKHJgLs = m1212getTopRightCornerRadiuskKHJgLs();
        long m1210getBottomRightCornerRadiuskKHJgLs = m1210getBottomRightCornerRadiuskKHJgLs();
        long m1209getBottomLeftCornerRadiuskKHJgLs = m1209getBottomLeftCornerRadiuskKHJgLs();
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        if (!CornerRadius.m1135equalsimpl0(m1211getTopLeftCornerRadiuskKHJgLs, m1212getTopRightCornerRadiuskKHJgLs) || !CornerRadius.m1135equalsimpl0(m1212getTopRightCornerRadiuskKHJgLs, m1210getBottomRightCornerRadiuskKHJgLs) || !CornerRadius.m1135equalsimpl0(m1210getBottomRightCornerRadiuskKHJgLs, m1209getBottomLeftCornerRadiuskKHJgLs)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) CornerRadius.m1142toStringimpl(m1211getTopLeftCornerRadiuskKHJgLs)) + ", topRight=" + ((Object) CornerRadius.m1142toStringimpl(m1212getTopRightCornerRadiuskKHJgLs)) + ", bottomRight=" + ((Object) CornerRadius.m1142toStringimpl(m1210getBottomRightCornerRadiuskKHJgLs)) + ", bottomLeft=" + ((Object) CornerRadius.m1142toStringimpl(m1209getBottomLeftCornerRadiuskKHJgLs)) + ')';
        }
        if (CornerRadius.m1136getXimpl(m1211getTopLeftCornerRadiuskKHJgLs) == CornerRadius.m1137getYimpl(m1211getTopLeftCornerRadiuskKHJgLs)) {
            return "RoundRect(rect=" + str + ", radius=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m1136getXimpl(m1211getTopLeftCornerRadiuskKHJgLs), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m1136getXimpl(m1211getTopLeftCornerRadiuskKHJgLs), 1) + ", y=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.m1137getYimpl(m1211getTopLeftCornerRadiuskKHJgLs), 1) + ')';
    }
}
