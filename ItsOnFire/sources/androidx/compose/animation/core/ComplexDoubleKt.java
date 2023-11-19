package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\u001a,\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0000\u001a\u0015\u0010\t\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0080\n\u001a\u0015\u0010\u000b\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0080\n\u001a\u0015\u0010\f\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0080\n¨\u0006\r"}, d2 = {"complexQuadraticFormula", "Lkotlin/Pair;", "Landroidx/compose/animation/core/ComplexDouble;", "a", "", "b", "c", "complexSqrt", "num", "minus", "other", "plus", "times", "animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ComplexDoubleKt {
    @NotNull
    public static final Pair<ComplexDouble, ComplexDouble> complexQuadraticFormula(double d2, double d3, double d4) {
        double d5 = -d3;
        double d6 = (d3 * d3) - ((4.0d * d2) * d4);
        ComplexDouble complexSqrt = complexSqrt(d6);
        complexSqrt._real += d5;
        double d7 = d2 * 2.0d;
        complexSqrt._real /= d7;
        complexSqrt._imaginary /= d7;
        ComplexDouble complexSqrt2 = complexSqrt(d6);
        double d8 = -1;
        complexSqrt2._real *= d8;
        complexSqrt2._imaginary *= d8;
        complexSqrt2._real += d5;
        complexSqrt2._real /= d7;
        complexSqrt2._imaginary /= d7;
        return TuplesKt.to(complexSqrt, complexSqrt2);
    }

    @NotNull
    public static final ComplexDouble complexSqrt(double d2) {
        return d2 < 0.0d ? new ComplexDouble(0.0d, Math.sqrt(Math.abs(d2))) : new ComplexDouble(Math.sqrt(d2), 0.0d);
    }

    @NotNull
    public static final ComplexDouble minus(double d2, @NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        double d3 = -1;
        other._real *= d3;
        other._imaginary *= d3;
        other._real += d2;
        return other;
    }

    @NotNull
    public static final ComplexDouble plus(double d2, @NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        other._real += d2;
        return other;
    }

    @NotNull
    public static final ComplexDouble times(double d2, @NotNull ComplexDouble other) {
        Intrinsics.checkNotNullParameter(other, "other");
        other._real *= d2;
        other._imaginary *= d2;
        return other;
    }
}
