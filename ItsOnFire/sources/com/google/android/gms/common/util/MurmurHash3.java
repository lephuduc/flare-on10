package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes.dex */
public class MurmurHash3 {
    private MurmurHash3() {
    }

    @KeepForSdk
    public static int murmurhash3_x86_32(@NonNull byte[] bArr, int i2, int i3, int i4) {
        int i5 = (i3 & (-4)) + i2;
        while (i2 < i5) {
            int i6 = ((bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | (bArr[i2 + 3] << 24)) * (-862048943);
            int i7 = i4 ^ (((i6 << 15) | (i6 >>> 17)) * 461845907);
            i4 = (((i7 >>> 19) | (i7 << 13)) * 5) - 430675100;
            i2 += 4;
        }
        int i8 = i3 & 3;
        if (i8 != 1) {
            if (i8 != 2) {
                r3 = i8 == 3 ? (bArr[i5 + 2] & 255) << 16 : 0;
                int i9 = i4 ^ i3;
                int i10 = (i9 ^ (i9 >>> 16)) * (-2048144789);
                int i11 = (i10 ^ (i10 >>> 13)) * (-1028477387);
                return i11 ^ (i11 >>> 16);
            }
            r3 |= (bArr[i5 + 1] & 255) << 8;
        }
        int i12 = ((bArr[i5] & 255) | r3) * (-862048943);
        i4 ^= ((i12 >>> 17) | (i12 << 15)) * 461845907;
        int i92 = i4 ^ i3;
        int i102 = (i92 ^ (i92 >>> 16)) * (-2048144789);
        int i112 = (i102 ^ (i102 >>> 13)) * (-1028477387);
        return i112 ^ (i112 >>> 16);
    }
}
