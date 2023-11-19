package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public class zzke {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public /* synthetic */ zzke(zzkd zzkdVar) {
    }

    public static int zzb(int i2) {
        return (i2 >>> 1) ^ (-(i2 & 1));
    }

    public static long zzc(long j2) {
        return (j2 >>> 1) ^ (-(1 & j2));
    }
}
