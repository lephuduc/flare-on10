package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000b\u001a4\u0010\f\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a<\u0010\u0012\u001a\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a4\u0010\u0014\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a4\u0010\u0015\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a9\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0019H\u0082\b\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0003H\u0082\b¨\u0006\u001d"}, d2 = {"estimateAnimationDurationMillis", "", "stiffness", "", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "springConstant", "dampingCoefficient", "mass", "", "estimateCriticallyDamped", "roots", "Lkotlin/Pair;", "Landroidx/compose/animation/core/ComplexDouble;", "p0", "v0", "estimateDurationInternal", "initialPosition", "estimateOverDamped", "estimateUnderDamped", "iterateNewtonsMethod", "x", "fn", "Lkotlin/Function1;", "fnPrime", "isNotFinite", "", "animation-core_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SpringEstimationKt {
    public static final long estimateAnimationDurationMillis(double d2, double d3, double d4, double d5, double d6) {
        return estimateDurationInternal(ComplexDoubleKt.complexQuadraticFormula(1.0d, 2.0d * d3 * Math.sqrt(d2), d2), d3, d4, d5, d6);
    }

    public static final long estimateAnimationDurationMillis(double d2, double d3, double d4, double d5, double d6, double d7) {
        return estimateDurationInternal(ComplexDoubleKt.complexQuadraticFormula(d4, d3, d2), d3 / (Math.sqrt(d2 * d4) * 2.0d), d5, d6, d7);
    }

    public static final long estimateAnimationDurationMillis(float f2, float f3, float f4, float f5, float f6) {
        return estimateAnimationDurationMillis(f2, f3, f4, f5, f6);
    }

    private static final double estimateCriticallyDamped(Pair<ComplexDouble, ComplexDouble> pair, double d2, double d3, double d4) {
        double d5;
        double d6;
        SpringEstimationKt$estimateCriticallyDamped$fn$1 springEstimationKt$estimateCriticallyDamped$fn$1;
        SpringEstimationKt$estimateCriticallyDamped$fnPrime$1 springEstimationKt$estimateCriticallyDamped$fnPrime$1;
        double d7;
        double real = pair.getFirst().getReal();
        double d8 = real * d2;
        double d9 = d3 - d8;
        double log = Math.log(Math.abs(d4 / d2)) / real;
        double estimateCriticallyDamped$t2Iterate = estimateCriticallyDamped$t2Iterate(Math.log(Math.abs(d4 / d9)), real) / real;
        int i2 = 0;
        if (!((Double.isInfinite(log) || Double.isNaN(log)) ? false : true)) {
            d5 = estimateCriticallyDamped$t2Iterate;
        } else {
            if (!(!((Double.isInfinite(estimateCriticallyDamped$t2Iterate) || Double.isNaN(estimateCriticallyDamped$t2Iterate)) ? false : true))) {
                log = Math.max(log, estimateCriticallyDamped$t2Iterate);
            }
            d5 = log;
        }
        double d10 = (-(d8 + d9)) / (real * d9);
        if (!Double.isNaN(d10) && d10 > 0.0d) {
            if (d10 <= 0.0d || (-estimateCriticallyDamped$xInflection(d2, real, d10, d9)) >= d4) {
                d5 = (-(2.0d / real)) - (d2 / d9);
                d6 = d4;
                springEstimationKt$estimateCriticallyDamped$fn$1 = new SpringEstimationKt$estimateCriticallyDamped$fn$1(d2, d9, real, d6);
                springEstimationKt$estimateCriticallyDamped$fnPrime$1 = new SpringEstimationKt$estimateCriticallyDamped$fnPrime$1(d9, real, d2);
                d7 = Double.MAX_VALUE;
                while (d7 > 0.001d && i2 < 100) {
                    i2++;
                    double doubleValue = d5 - (springEstimationKt$estimateCriticallyDamped$fn$1.invoke((SpringEstimationKt$estimateCriticallyDamped$fn$1) Double.valueOf(d5)).doubleValue() / springEstimationKt$estimateCriticallyDamped$fnPrime$1.invoke((SpringEstimationKt$estimateCriticallyDamped$fnPrime$1) Double.valueOf(d5)).doubleValue());
                    double abs = Math.abs(d5 - doubleValue);
                    d5 = doubleValue;
                    d7 = abs;
                }
                return d5;
            } else if (d9 < 0.0d && d2 > 0.0d) {
                d5 = 0.0d;
            }
        }
        d6 = -d4;
        springEstimationKt$estimateCriticallyDamped$fn$1 = new SpringEstimationKt$estimateCriticallyDamped$fn$1(d2, d9, real, d6);
        springEstimationKt$estimateCriticallyDamped$fnPrime$1 = new SpringEstimationKt$estimateCriticallyDamped$fnPrime$1(d9, real, d2);
        d7 = Double.MAX_VALUE;
        while (d7 > 0.001d) {
            i2++;
            double doubleValue2 = d5 - (springEstimationKt$estimateCriticallyDamped$fn$1.invoke((SpringEstimationKt$estimateCriticallyDamped$fn$1) Double.valueOf(d5)).doubleValue() / springEstimationKt$estimateCriticallyDamped$fnPrime$1.invoke((SpringEstimationKt$estimateCriticallyDamped$fnPrime$1) Double.valueOf(d5)).doubleValue());
            double abs2 = Math.abs(d5 - doubleValue2);
            d5 = doubleValue2;
            d7 = abs2;
        }
        return d5;
    }

    private static final double estimateCriticallyDamped$t2Iterate(double d2, double d3) {
        int i2 = 0;
        double d4 = d2;
        while (i2 < 6) {
            i2++;
            d4 = d2 - Math.log(Math.abs(d4 / d3));
        }
        return d4;
    }

    private static final double estimateCriticallyDamped$xInflection(double d2, double d3, double d4, double d5) {
        double d6 = d3 * d4;
        return (d2 * Math.exp(d6)) + (d5 * d4 * Math.exp(d6));
    }

    private static final long estimateDurationInternal(Pair<ComplexDouble, ComplexDouble> pair, double d2, double d3, double d4, double d5) {
        int i2 = (d4 > 0.0d ? 1 : (d4 == 0.0d ? 0 : -1));
        if (i2 == 0) {
            if (d3 == 0.0d) {
                return 0L;
            }
        }
        if (i2 < 0) {
            d3 = -d3;
        }
        double d6 = d3;
        double abs = Math.abs(d4);
        return (long) ((d2 > 1.0d ? estimateOverDamped(pair, abs, d6, d5) : d2 < 1.0d ? estimateUnderDamped(pair, abs, d6, d5) : estimateCriticallyDamped(pair, abs, d6, d5)) * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final double estimateOverDamped(kotlin.Pair<androidx.compose.animation.core.ComplexDouble, androidx.compose.animation.core.ComplexDouble> r31, double r32, double r34, double r36) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SpringEstimationKt.estimateOverDamped(kotlin.Pair, double, double, double):double");
    }

    /* renamed from: estimateOverDamped$xInflection-0  reason: not valid java name */
    private static final double m117estimateOverDamped$xInflection0(double d2, double d3, double d4, double d5, double d6) {
        return (d2 * Math.exp(d3 * d4)) + (d5 * Math.exp(d6 * d4));
    }

    private static final double estimateUnderDamped(Pair<ComplexDouble, ComplexDouble> pair, double d2, double d3, double d4) {
        double real = pair.getFirst().getReal();
        double imaginary = (d3 - (real * d2)) / pair.getFirst().getImaginary();
        return Math.log(d4 / Math.sqrt((d2 * d2) + (imaginary * imaginary))) / real;
    }

    private static final boolean isNotFinite(double d2) {
        return !((Double.isInfinite(d2) || Double.isNaN(d2)) ? false : true);
    }

    private static final double iterateNewtonsMethod(double d2, Function1<? super Double, Double> function1, Function1<? super Double, Double> function12) {
        return d2 - (function1.invoke(Double.valueOf(d2)).doubleValue() / function12.invoke(Double.valueOf(d2)).doubleValue());
    }
}
