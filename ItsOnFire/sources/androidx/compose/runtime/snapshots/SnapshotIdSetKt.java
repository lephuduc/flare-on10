package androidx.compose.runtime.snapshots;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¨\u0006\u0007"}, d2 = {"lowestBitOf", "", "bits", "", "binarySearch", "", "value", "runtime_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SnapshotIdSetKt {
    public static final int binarySearch(@NotNull int[] iArr, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length - 1;
        int i3 = 0;
        while (i3 <= length) {
            int i4 = (i3 + length) >>> 1;
            int i5 = iArr[i4];
            if (i2 > i5) {
                i3 = i4 + 1;
            } else if (i2 >= i5) {
                return i4;
            } else {
                length = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int lowestBitOf(long j2) {
        int i2 = 32;
        if ((4294967295L & j2) == 0) {
            j2 >>= 32;
        } else {
            i2 = 0;
        }
        if ((65535 & j2) == 0) {
            i2 += 16;
            j2 >>= 16;
        }
        if ((255 & j2) == 0) {
            i2 += 8;
            j2 >>= 8;
        }
        if ((15 & j2) == 0) {
            i2 += 4;
            j2 >>= 4;
        }
        if ((1 & j2) != 0) {
            return i2;
        }
        if ((2 & j2) != 0) {
            return i2 + 1;
        }
        if ((4 & j2) != 0) {
            return i2 + 2;
        }
        if ((j2 & 8) != 0) {
            return i2 + 3;
        }
        return -1;
    }
}
