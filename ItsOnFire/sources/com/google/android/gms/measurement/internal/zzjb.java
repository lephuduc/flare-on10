package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjb implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ zzq zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ zzjz zzd;

    public zzjb(zzjz zzjzVar, AtomicReference atomicReference, zzq zzqVar, boolean z) {
        this.zzd = zzjzVar;
        this.zza = atomicReference;
        this.zzb = zzqVar;
        this.zzc = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjz zzjzVar;
        zzej zzejVar;
        synchronized (this.zza) {
            try {
                zzjzVar = this.zzd;
                zzejVar = zzjzVar.zzb;
            } catch (RemoteException e2) {
                this.zzd.zzt.zzaA().zzd().zzb("Failed to get all user properties; remote exception", e2);
                atomicReference = this.zza;
            }
            if (zzejVar == null) {
                zzjzVar.zzt.zzaA().zzd().zza("Failed to get all user properties; not connected to service");
                this.zza.notify();
                return;
            }
            Preconditions.checkNotNull(this.zzb);
            this.zza.set(zzejVar.zze(this.zzb, this.zzc));
            this.zzd.zzQ();
            atomicReference = this.zza;
            atomicReference.notify();
        }
    }
}
