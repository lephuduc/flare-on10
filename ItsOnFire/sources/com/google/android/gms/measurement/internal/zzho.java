package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzho implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzik zzb;

    public zzho(zzik zzikVar, long j2) {
        this.zzb = zzikVar;
        this.zza = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzt.zzm().zzf.zzb(this.zza);
        this.zzb.zzt.zzaA().zzc().zzb("Session timeout duration set", Long.valueOf(this.zza));
    }
}
