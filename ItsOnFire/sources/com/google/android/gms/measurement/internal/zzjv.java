package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzjv implements Runnable {
    public final /* synthetic */ zzej zza;
    public final /* synthetic */ zzjy zzb;

    public zzjv(zzjy zzjyVar, zzej zzejVar) {
        this.zzb = zzjyVar;
        this.zza = zzejVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb) {
            this.zzb.zzb = false;
            if (!this.zzb.zza.zzL()) {
                this.zzb.zza.zzt.zzaA().zzc().zza("Connected to remote service");
                this.zzb.zza.zzJ(this.zza);
            }
        }
    }
}
