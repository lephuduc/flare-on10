package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzgr implements Runnable {
    public final /* synthetic */ zzlk zza;
    public final /* synthetic */ zzq zzb;
    public final /* synthetic */ zzgv zzc;

    public zzgr(zzgv zzgvVar, zzlk zzlkVar, zzq zzqVar) {
        this.zzc = zzgvVar;
        this.zza = zzlkVar;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlh zzlhVar;
        zzlh zzlhVar2;
        zzlh zzlhVar3;
        zzlhVar = this.zzc.zza;
        zzlhVar.zzA();
        if (this.zza.zza() == null) {
            zzlhVar3 = this.zzc.zza;
            zzlhVar3.zzP(this.zza.zzb, this.zzb);
            return;
        }
        zzlhVar2 = this.zzc.zza;
        zzlhVar2.zzW(this.zza, this.zzb);
    }
}
