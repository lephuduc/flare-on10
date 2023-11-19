package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzgl implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ zzgv zzb;

    public zzgl(zzgv zzgvVar, zzq zzqVar) {
        this.zzb = zzgvVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlh zzlhVar;
        zzlh zzlhVar2;
        zzlhVar = this.zzb.zza;
        zzlhVar.zzA();
        zzlhVar2 = this.zzb.zza;
        zzlhVar2.zzQ(this.zza);
    }
}
