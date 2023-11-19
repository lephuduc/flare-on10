package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjh implements Runnable {
    public final /* synthetic */ zzir zza;
    public final /* synthetic */ zzjz zzb;

    public zzjh(zzjz zzjzVar, zzir zzirVar) {
        this.zzb = zzjzVar;
        this.zza = zzirVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzjz zzjzVar = this.zzb;
        zzejVar = zzjzVar.zzb;
        if (zzejVar == null) {
            zzjzVar.zzt.zzaA().zzd().zza("Failed to send current screen to service");
            return;
        }
        try {
            zzir zzirVar = this.zza;
            if (zzirVar == null) {
                zzejVar.zzq(0L, null, null, zzjzVar.zzt.zzaw().getPackageName());
            } else {
                zzejVar.zzq(zzirVar.zzc, zzirVar.zza, zzirVar.zzb, zzjzVar.zzt.zzaw().getPackageName());
            }
            this.zzb.zzQ();
        } catch (RemoteException e2) {
            this.zzb.zzt.zzaA().zzd().zzb("Failed to send current screen to the service", e2);
        }
    }
}
