package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzgg implements Runnable {
    public final /* synthetic */ zzac zza;
    public final /* synthetic */ zzgv zzb;

    public zzgg(zzgv zzgvVar, zzac zzacVar) {
        this.zzb = zzgvVar;
        this.zza = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlh zzlhVar;
        zzlh zzlhVar2;
        zzlh zzlhVar3;
        zzlhVar = this.zzb.zza;
        zzlhVar.zzA();
        if (this.zza.zzc.zza() == null) {
            zzlhVar3 = this.zzb.zza;
            zzlhVar3.zzN(this.zza);
            return;
        }
        zzlhVar2 = this.zzb.zza;
        zzlhVar2.zzT(this.zza);
    }
}
