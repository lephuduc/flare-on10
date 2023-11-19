package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class zzjd {
    public static Object zza(@CheckForNull Object obj, int i2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i2);
    }

    public static Object[] zzb(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            zza(objArr[i3], i3);
        }
        return objArr;
    }
}
