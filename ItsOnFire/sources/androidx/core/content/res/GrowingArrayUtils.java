package androidx.core.content.res;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
final class GrowingArrayUtils {
    private GrowingArrayUtils() {
    }

    public static int[] append(int[] iArr, int i2, int i3) {
        if (i2 + 1 > iArr.length) {
            int[] iArr2 = new int[growSize(i2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            iArr = iArr2;
        }
        iArr[i2] = i3;
        return iArr;
    }

    public static long[] append(long[] jArr, int i2, long j2) {
        if (i2 + 1 > jArr.length) {
            long[] jArr2 = new long[growSize(i2)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            jArr = jArr2;
        }
        jArr[i2] = j2;
        return jArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object[], java.lang.Object] */
    public static <T> T[] append(T[] tArr, int i2, T t2) {
        if (i2 + 1 > tArr.length) {
            ?? r0 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), growSize(i2));
            System.arraycopy(tArr, 0, r0, 0, i2);
            tArr = r0;
        }
        tArr[i2] = t2;
        return tArr;
    }

    public static boolean[] append(boolean[] zArr, int i2, boolean z) {
        if (i2 + 1 > zArr.length) {
            boolean[] zArr2 = new boolean[growSize(i2)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            zArr = zArr2;
        }
        zArr[i2] = z;
        return zArr;
    }

    public static int growSize(int i2) {
        if (i2 <= 4) {
            return 8;
        }
        return i2 * 2;
    }

    public static int[] insert(int[] iArr, int i2, int i3, int i4) {
        if (i2 + 1 <= iArr.length) {
            System.arraycopy(iArr, i3, iArr, i3 + 1, i2 - i3);
            iArr[i3] = i4;
            return iArr;
        }
        int[] iArr2 = new int[growSize(i2)];
        System.arraycopy(iArr, 0, iArr2, 0, i3);
        iArr2[i3] = i4;
        System.arraycopy(iArr, i3, iArr2, i3 + 1, iArr.length - i3);
        return iArr2;
    }

    public static long[] insert(long[] jArr, int i2, int i3, long j2) {
        if (i2 + 1 <= jArr.length) {
            System.arraycopy(jArr, i3, jArr, i3 + 1, i2 - i3);
            jArr[i3] = j2;
            return jArr;
        }
        long[] jArr2 = new long[growSize(i2)];
        System.arraycopy(jArr, 0, jArr2, 0, i3);
        jArr2[i3] = j2;
        System.arraycopy(jArr, i3, jArr2, i3 + 1, jArr.length - i3);
        return jArr2;
    }

    public static <T> T[] insert(T[] tArr, int i2, int i3, T t2) {
        if (i2 + 1 <= tArr.length) {
            System.arraycopy(tArr, i3, tArr, i3 + 1, i2 - i3);
            tArr[i3] = t2;
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), growSize(i2)));
        System.arraycopy(tArr, 0, tArr2, 0, i3);
        tArr2[i3] = t2;
        System.arraycopy(tArr, i3, tArr2, i3 + 1, tArr.length - i3);
        return tArr2;
    }

    public static boolean[] insert(boolean[] zArr, int i2, int i3, boolean z) {
        if (i2 + 1 <= zArr.length) {
            System.arraycopy(zArr, i3, zArr, i3 + 1, i2 - i3);
            zArr[i3] = z;
            return zArr;
        }
        boolean[] zArr2 = new boolean[growSize(i2)];
        System.arraycopy(zArr, 0, zArr2, 0, i3);
        zArr2[i3] = z;
        System.arraycopy(zArr, i3, zArr2, i3 + 1, zArr.length - i3);
        return zArr2;
    }
}
