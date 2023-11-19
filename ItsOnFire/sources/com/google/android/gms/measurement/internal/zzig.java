package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzqu;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzig implements Runnable {
    public final /* synthetic */ zzhb zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ zzhb zzd;
    public final /* synthetic */ zzik zze;

    public zzig(zzik zzikVar, zzhb zzhbVar, long j2, boolean z, zzhb zzhbVar2) {
        this.zze = zzikVar;
        this.zza = zzhbVar;
        this.zzb = j2;
        this.zzc = z;
        this.zzd = zzhbVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzV(this.zza);
        zzik.zzw(this.zze, this.zza, this.zzb, false, this.zzc);
        zzqu.zzc();
        if (this.zze.zzt.zzf().zzs(null, zzeg.zzan)) {
            zzik.zzv(this.zze, this.zza, this.zzd);
        }
    }
}
