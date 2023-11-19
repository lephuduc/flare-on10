package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzgf implements Runnable {
    public final /* synthetic */ zzac zza;
    public final /* synthetic */ zzq zzb;
    public final /* synthetic */ zzgv zzc;

    public zzgf(zzgv zzgvVar, zzac zzacVar, zzq zzqVar) {
        this.zzc = zzgvVar;
        this.zza = zzacVar;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlh zzlhVar;
        zzlh zzlhVar2;
        zzlh zzlhVar3;
        zzlhVar = this.zzc.zza;
        zzlhVar.zzA();
        if (this.zza.zzc.zza() == null) {
            zzlhVar3 = this.zzc.zza;
            zzlhVar3.zzO(this.zza, this.zzb);
            return;
        }
        zzlhVar2 = this.zzc.zza;
        zzlhVar2.zzU(this.zza, this.zzb);
    }
}
