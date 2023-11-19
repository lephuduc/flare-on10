package androidx.core.util;

import androidx.annotation.RestrictTo;
import java.io.PrintWriter;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class TimeUtils {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final Object sFormatSync = new Object();
    private static char[] sFormatStr = new char[24];

    private TimeUtils() {
    }

    private static int accumField(int i2, int i3, boolean z, int i4) {
        if (i2 > 99 || (z && i4 >= 3)) {
            return i3 + 3;
        }
        if (i2 > 9 || (z && i4 >= 2)) {
            return i3 + 2;
        }
        if (z || i2 > 0) {
            return i3 + 1;
        }
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j2, long j3, PrintWriter printWriter) {
        if (j2 == 0) {
            printWriter.print("--");
        } else {
            formatDuration(j2 - j3, printWriter, 0);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j2, PrintWriter printWriter) {
        formatDuration(j2, printWriter, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j2, PrintWriter printWriter, int i2) {
        synchronized (sFormatSync) {
            printWriter.print(new String(sFormatStr, 0, formatDurationLocked(j2, i2)));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void formatDuration(long j2, StringBuilder sb) {
        synchronized (sFormatSync) {
            sb.append(sFormatStr, 0, formatDurationLocked(j2, 0));
        }
    }

    private static int formatDurationLocked(long j2, int i2) {
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j3 = j2;
        if (sFormatStr.length < i2) {
            sFormatStr = new char[i2];
        }
        char[] cArr = sFormatStr;
        int i8 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i8 == 0) {
            int i9 = i2 - 1;
            while (i9 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (i8 > 0) {
            c2 = '+';
        } else {
            c2 = '-';
            j3 = -j3;
        }
        int i10 = (int) (j3 % 1000);
        int floor = (int) Math.floor(j3 / 1000);
        if (floor > SECONDS_PER_DAY) {
            i3 = floor / SECONDS_PER_DAY;
            floor -= SECONDS_PER_DAY * i3;
        } else {
            i3 = 0;
        }
        if (floor > SECONDS_PER_HOUR) {
            i4 = floor / SECONDS_PER_HOUR;
            floor -= i4 * SECONDS_PER_HOUR;
        } else {
            i4 = 0;
        }
        if (floor > 60) {
            int i11 = floor / 60;
            i5 = floor - (i11 * 60);
            i6 = i11;
        } else {
            i5 = floor;
            i6 = 0;
        }
        if (i2 != 0) {
            int accumField = accumField(i3, 1, false, 0);
            int accumField2 = accumField + accumField(i4, 1, accumField > 0, 2);
            int accumField3 = accumField2 + accumField(i6, 1, accumField2 > 0, 2);
            int accumField4 = accumField3 + accumField(i5, 1, accumField3 > 0, 2);
            i7 = 0;
            for (int accumField5 = accumField4 + accumField(i10, 2, true, accumField4 > 0 ? 3 : 0) + 1; accumField5 < i2; accumField5++) {
                cArr[i7] = ' ';
                i7++;
            }
        } else {
            i7 = 0;
        }
        cArr[i7] = c2;
        int i12 = i7 + 1;
        boolean z = i2 != 0;
        int printField = printField(cArr, i3, 'd', i12, false, 0);
        int printField2 = printField(cArr, i4, 'h', printField, printField != i12, z ? 2 : 0);
        int printField3 = printField(cArr, i6, 'm', printField2, printField2 != i12, z ? 2 : 0);
        int printField4 = printField(cArr, i5, 's', printField3, printField3 != i12, z ? 2 : 0);
        int printField5 = printField(cArr, i10, 'm', printField4, true, (!z || printField4 == i12) ? 0 : 3);
        cArr[printField5] = 's';
        return printField5 + 1;
    }

    private static int printField(char[] cArr, int i2, char c2, int i3, boolean z, int i4) {
        int i5;
        if (z || i2 > 0) {
            if ((!z || i4 < 3) && i2 <= 99) {
                i5 = i3;
            } else {
                int i6 = i2 / 100;
                cArr[i3] = (char) (i6 + 48);
                i5 = i3 + 1;
                i2 -= i6 * 100;
            }
            if ((z && i4 >= 2) || i2 > 9 || i3 != i5) {
                int i7 = i2 / 10;
                cArr[i5] = (char) (i7 + 48);
                i5++;
                i2 -= i7 * 10;
            }
            cArr[i5] = (char) (i2 + 48);
            int i8 = i5 + 1;
            cArr[i8] = c2;
            return i8 + 1;
        }
        return i3;
    }
}
