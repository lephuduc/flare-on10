package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzgu implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ zzgv zze;

    public zzgu(zzgv zzgvVar, String str, String str2, String str3, long j2) {
        this.zze = zzgvVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzir zzirVar;
        zzlh zzlhVar;
        String str;
        String str2 = this.zza;
        if (str2 == null) {
            zzlhVar = this.zze.zza;
            str = this.zzb;
            zzirVar = null;
        } else {
            zzirVar = new zzir(this.zzc, str2, this.zzd);
            zzlhVar = this.zze.zza;
            str = this.zzb;
        }
        zzlhVar.zzR(str, zzirVar);
    }
}
