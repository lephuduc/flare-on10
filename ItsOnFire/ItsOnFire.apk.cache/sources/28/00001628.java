package androidx.core.math;

/* loaded from: classes.dex */
public class MathUtils {
    private MathUtils() {
    }

    public static int addExact(int i2, int i3) {
        int i4 = i2 + i3;
        if (((i2 ^ i4) & (i3 ^ i4)) >= 0) {
            return i4;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long addExact(long j2, long j3) {
        long j4 = j2 + j3;
        if (((j2 ^ j4) & (j3 ^ j4)) >= 0) {
            return j4;
        }
        throw new ArithmeticException("long overflow");
    }

    public static double clamp(double d2, double d3, double d4) {
        return d2 < d3 ? d3 : d2 > d4 ? d4 : d2;
    }

    public static float clamp(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    public static int clamp(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static long clamp(long j2, long j3, long j4) {
        return j2 < j3 ? j3 : j2 > j4 ? j4 : j2;
    }

    public static int decrementExact(int i2) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long decrementExact(long j2) {
        if (j2 != Long.MIN_VALUE) {
            return j2 - 1;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int incrementExact(int i2) {
        if (i2 != Integer.MAX_VALUE) {
            return i2 + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long incrementExact(long j2) {
        if (j2 != Long.MAX_VALUE) {
            return j2 + 1;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int multiplyExact(int i2, int i3) {
        long j2 = i2 * i3;
        int i4 = (int) j2;
        if (i4 == j2) {
            return i4;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long multiplyExact(long j2, long j3) {
        long j4 = j2 * j3;
        if (((Math.abs(j2) | Math.abs(j3)) >>> 31) == 0 || ((j3 == 0 || j4 / j3 == j2) && !(j2 == Long.MIN_VALUE && j3 == -1))) {
            return j4;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int negateExact(int i2) {
        if (i2 != Integer.MIN_VALUE) {
            return -i2;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long negateExact(long j2) {
        if (j2 != Long.MIN_VALUE) {
            return -j2;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int subtractExact(int i2, int i3) {
        int i4 = i2 - i3;
        if (((i2 ^ i4) & (i3 ^ i2)) >= 0) {
            return i4;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long subtractExact(long j2, long j3) {
        long j4 = j2 - j3;
        if (((j2 ^ j4) & (j3 ^ j2)) >= 0) {
            return j4;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int toIntExact(long j2) {
        int i2 = (int) j2;
        if (i2 == j2) {
            return i2;
        }
        throw new ArithmeticException("integer overflow");
    }
}