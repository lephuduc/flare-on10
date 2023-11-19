package com.google.android.gms.tasks;

/* loaded from: classes.dex */
final class zzc implements Runnable {
    public final /* synthetic */ Task zza;
    public final /* synthetic */ zzd zzb;

    public zzc(zzd zzdVar, Task task) {
        this.zzb = zzdVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzw zzwVar;
        zzw zzwVar2;
        Continuation continuation;
        zzw zzwVar3;
        zzw zzwVar4;
        if (this.zza.isCanceled()) {
            zzwVar4 = this.zzb.zzc;
            zzwVar4.zzc();
            return;
        }
        try {
            continuation = this.zzb.zzb;
            Object then = continuation.then(this.zza);
            zzwVar3 = this.zzb.zzc;
            zzwVar3.zzb(then);
        } catch (RuntimeExecutionException e2) {
            boolean z = e2.getCause() instanceof Exception;
            zzwVar2 = this.zzb.zzc;
            if (z) {
                zzwVar2.zza((Exception) e2.getCause());
            } else {
                zzwVar2.zza(e2);
            }
        } catch (Exception e3) {
            zzwVar = this.zzb.zzc;
            zzwVar.zza(e3);
        }
    }
}
