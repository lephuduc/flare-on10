package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzgo implements Runnable {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ zzq zzb;
    public final /* synthetic */ zzgv zzc;

    public zzgo(zzgv zzgvVar, zzau zzauVar, zzq zzqVar) {
        this.zzc = zzgvVar;
        this.zza = zzauVar;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzv(this.zzc.zzb(this.zza, this.zzb), this.zzb);
    }
}
