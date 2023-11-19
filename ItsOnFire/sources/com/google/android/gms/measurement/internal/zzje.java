package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzje implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ zzq zzb;
    public final /* synthetic */ zzjz zzc;

    public zzje(zzjz zzjzVar, AtomicReference atomicReference, zzq zzqVar) {
        this.zzc = zzjzVar;
        this.zza = atomicReference;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzej zzejVar;
        synchronized (this.zza) {
            try {
            } catch (RemoteException e2) {
                this.zzc.zzt.zzaA().zzd().zzb("Failed to get app instance id", e2);
                atomicReference = this.zza;
            }
            if (!this.zzc.zzt.zzm().zzc().zzj(zzha.ANALYTICS_STORAGE)) {
                this.zzc.zzt.zzaA().zzl().zza("Analytics storage consent denied; will not get app instance id");
                this.zzc.zzt.zzq().zzO(null);
                this.zzc.zzt.zzm().zze.zzb(null);
                this.zza.set(null);
                this.zza.notify();
                return;
            }
            zzjz zzjzVar = this.zzc;
            zzejVar = zzjzVar.zzb;
            if (zzejVar == null) {
                zzjzVar.zzt.zzaA().zzd().zza("Failed to get app instance id");
                this.zza.notify();
                return;
            }
            Preconditions.checkNotNull(this.zzb);
            this.zza.set(zzejVar.zzd(this.zzb));
            String str = (String) this.zza.get();
            if (str != null) {
                this.zzc.zzt.zzq().zzO(str);
                this.zzc.zzt.zzm().zze.zzb(str);
            }
            this.zzc.zzQ();
            atomicReference = this.zza;
            atomicReference.notify();
        }
    }
}
