package kotlin.collections;

import androidx.appcompat.R;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0014\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0016\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* renamed from: partition--nroSd4  reason: not valid java name */
    private static final int m4033partitionnroSd4(long[] jArr, int i2, int i3) {
        long m3812getsVKNKU = ULongArray.m3812getsVKNKU(jArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (UnsignedKt.ulongCompare(ULongArray.m3812getsVKNKU(jArr, i2), m3812getsVKNKU) < 0) {
                i2++;
            }
            while (UnsignedKt.ulongCompare(ULongArray.m3812getsVKNKU(jArr, i3), m3812getsVKNKU) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                long m3812getsVKNKU2 = ULongArray.m3812getsVKNKU(jArr, i2);
                ULongArray.m3817setk8EXiF4(jArr, i2, ULongArray.m3812getsVKNKU(jArr, i3));
                ULongArray.m3817setk8EXiF4(jArr, i3, m3812getsVKNKU2);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-4UcCI2c  reason: not valid java name */
    private static final int m4034partition4UcCI2c(byte[] bArr, int i2, int i3) {
        int i4;
        byte m3656getw2LRezQ = UByteArray.m3656getw2LRezQ(bArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (true) {
                int m3656getw2LRezQ2 = UByteArray.m3656getw2LRezQ(bArr, i2) & UByte.MAX_VALUE;
                i4 = m3656getw2LRezQ & UByte.MAX_VALUE;
                if (Intrinsics.compare(m3656getw2LRezQ2, i4) >= 0) {
                    break;
                }
                i2++;
            }
            while (Intrinsics.compare(UByteArray.m3656getw2LRezQ(bArr, i3) & UByte.MAX_VALUE, i4) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                byte m3656getw2LRezQ3 = UByteArray.m3656getw2LRezQ(bArr, i2);
                UByteArray.m3661setVurrAj0(bArr, i2, UByteArray.m3656getw2LRezQ(bArr, i3));
                UByteArray.m3661setVurrAj0(bArr, i3, m3656getw2LRezQ3);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-Aa5vz7o  reason: not valid java name */
    private static final int m4035partitionAa5vz7o(short[] sArr, int i2, int i3) {
        int i4;
        short m3916getMh2AYeg = UShortArray.m3916getMh2AYeg(sArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (true) {
                int m3916getMh2AYeg2 = UShortArray.m3916getMh2AYeg(sArr, i2) & UShort.MAX_VALUE;
                i4 = m3916getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(m3916getMh2AYeg2, i4) >= 0) {
                    break;
                }
                i2++;
            }
            while (Intrinsics.compare(UShortArray.m3916getMh2AYeg(sArr, i3) & UShort.MAX_VALUE, i4) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                short m3916getMh2AYeg3 = UShortArray.m3916getMh2AYeg(sArr, i2);
                UShortArray.m3921set01HTLdE(sArr, i2, UShortArray.m3916getMh2AYeg(sArr, i3));
                UShortArray.m3921set01HTLdE(sArr, i3, m3916getMh2AYeg3);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-oBK06Vg  reason: not valid java name */
    private static final int m4036partitionoBK06Vg(int[] iArr, int i2, int i3) {
        int m3734getpVg5ArA = UIntArray.m3734getpVg5ArA(iArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (UnsignedKt.uintCompare(UIntArray.m3734getpVg5ArA(iArr, i2), m3734getpVg5ArA) < 0) {
                i2++;
            }
            while (UnsignedKt.uintCompare(UIntArray.m3734getpVg5ArA(iArr, i3), m3734getpVg5ArA) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                int m3734getpVg5ArA2 = UIntArray.m3734getpVg5ArA(iArr, i2);
                UIntArray.m3739setVXSXFK8(iArr, i2, UIntArray.m3734getpVg5ArA(iArr, i3));
                UIntArray.m3739setVXSXFK8(iArr, i3, m3734getpVg5ArA2);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort--nroSd4  reason: not valid java name */
    private static final void m4037quickSortnroSd4(long[] jArr, int i2, int i3) {
        int m4033partitionnroSd4 = m4033partitionnroSd4(jArr, i2, i3);
        int i4 = m4033partitionnroSd4 - 1;
        if (i2 < i4) {
            m4037quickSortnroSd4(jArr, i2, i4);
        }
        if (m4033partitionnroSd4 < i3) {
            m4037quickSortnroSd4(jArr, m4033partitionnroSd4, i3);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-4UcCI2c  reason: not valid java name */
    private static final void m4038quickSort4UcCI2c(byte[] bArr, int i2, int i3) {
        int m4034partition4UcCI2c = m4034partition4UcCI2c(bArr, i2, i3);
        int i4 = m4034partition4UcCI2c - 1;
        if (i2 < i4) {
            m4038quickSort4UcCI2c(bArr, i2, i4);
        }
        if (m4034partition4UcCI2c < i3) {
            m4038quickSort4UcCI2c(bArr, m4034partition4UcCI2c, i3);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-Aa5vz7o  reason: not valid java name */
    private static final void m4039quickSortAa5vz7o(short[] sArr, int i2, int i3) {
        int m4035partitionAa5vz7o = m4035partitionAa5vz7o(sArr, i2, i3);
        int i4 = m4035partitionAa5vz7o - 1;
        if (i2 < i4) {
            m4039quickSortAa5vz7o(sArr, i2, i4);
        }
        if (m4035partitionAa5vz7o < i3) {
            m4039quickSortAa5vz7o(sArr, m4035partitionAa5vz7o, i3);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-oBK06Vg  reason: not valid java name */
    private static final void m4040quickSortoBK06Vg(int[] iArr, int i2, int i3) {
        int m4036partitionoBK06Vg = m4036partitionoBK06Vg(iArr, i2, i3);
        int i4 = m4036partitionoBK06Vg - 1;
        if (i2 < i4) {
            m4040quickSortoBK06Vg(iArr, i2, i4);
        }
        if (m4036partitionoBK06Vg < i3) {
            m4040quickSortoBK06Vg(iArr, m4036partitionoBK06Vg, i3);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray--nroSd4  reason: not valid java name */
    public static final void m4041sortArraynroSd4(@NotNull long[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m4037quickSortnroSd4(array, i2, i3 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-4UcCI2c  reason: not valid java name */
    public static final void m4042sortArray4UcCI2c(@NotNull byte[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m4038quickSort4UcCI2c(array, i2, i3 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-Aa5vz7o  reason: not valid java name */
    public static final void m4043sortArrayAa5vz7o(@NotNull short[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m4039quickSortAa5vz7o(array, i2, i3 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-oBK06Vg  reason: not valid java name */
    public static final void m4044sortArrayoBK06Vg(@NotNull int[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m4040quickSortoBK06Vg(array, i2, i3 - 1);
    }
}
