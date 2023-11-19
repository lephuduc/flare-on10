package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzqu;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzif implements Runnable {
    public final /* synthetic */ zzhb zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ zzhb zze;
    public final /* synthetic */ zzik zzf;

    public zzif(zzik zzikVar, zzhb zzhbVar, long j2, long j3, boolean z, zzhb zzhbVar2) {
        this.zzf = zzikVar;
        this.zza = zzhbVar;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = z;
        this.zze = zzhbVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzf.zzV(this.zza);
        this.zzf.zzL(this.zzb, false);
        zzik.zzw(this.zzf, this.zza, this.zzc, true, this.zzd);
        zzqu.zzc();
        if (this.zzf.zzt.zzf().zzs(null, zzeg.zzan)) {
            zzik.zzv(this.zzf, this.zza, this.zze);
        }
    }
}
