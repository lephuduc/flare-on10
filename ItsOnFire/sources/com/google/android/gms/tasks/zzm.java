package com.google.android.gms.tasks;

/* loaded from: classes.dex */
final class zzm implements Runnable {
    public final /* synthetic */ Task zza;
    public final /* synthetic */ zzn zzb;

    public zzm(zzn zznVar, Task task) {
        this.zzb = zznVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnSuccessListener onSuccessListener;
        OnSuccessListener onSuccessListener2;
        obj = this.zzb.zzb;
        synchronized (obj) {
            zzn zznVar = this.zzb;
            onSuccessListener = zznVar.zzc;
            if (onSuccessListener != null) {
                onSuccessListener2 = zznVar.zzc;
                onSuccessListener2.onSuccess(this.zza.getResult());
            }
        }
    }
}
