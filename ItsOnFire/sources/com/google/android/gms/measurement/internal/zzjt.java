package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzjt implements Runnable {
    public final /* synthetic */ zzej zza;
    public final /* synthetic */ zzjy zzb;

    public zzjt(zzjy zzjyVar, zzej zzejVar) {
        this.zzb = zzjyVar;
        this.zza = zzejVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb) {
            this.zzb.zzb = false;
            if (!this.zzb.zza.zzL()) {
                this.zzb.zza.zzt.zzaA().zzj().zza("Connected to service");
                this.zzb.zza.zzJ(this.zza);
            }
        }
    }
}
