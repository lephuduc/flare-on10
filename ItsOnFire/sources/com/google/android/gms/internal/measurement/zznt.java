package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zznt {
    public final Unsafe zza;

    public zznt(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j2);

    public abstract float zzb(Object obj, long j2);

    public abstract void zzc(Object obj, long j2, boolean z);

    public abstract void zzd(Object obj, long j2, byte b2);

    public abstract void zze(Object obj, long j2, double d2);

    public abstract void zzf(Object obj, long j2, float f2);

    public abstract boolean zzg(Object obj, long j2);
}
