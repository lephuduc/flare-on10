package com.google.android.gms.tasks;

/* loaded from: classes.dex */
final class zzi implements Runnable {
    public final /* synthetic */ Task zza;
    public final /* synthetic */ zzj zzb;

    public zzi(zzj zzjVar, Task task) {
        this.zzb = zzjVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnCompleteListener onCompleteListener;
        OnCompleteListener onCompleteListener2;
        obj = this.zzb.zzb;
        synchronized (obj) {
            zzj zzjVar = this.zzb;
            onCompleteListener = zzjVar.zzc;
            if (onCompleteListener != null) {
                onCompleteListener2 = zzjVar.zzc;
                onCompleteListener2.onComplete(this.zza);
            }
        }
    }
}
