package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjf implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzb;
    public final /* synthetic */ zzjz zzc;

    public zzjf(zzjz zzjzVar, zzq zzqVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzc = zzjzVar;
        this.zza = zzqVar;
        this.zzb = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        String str = null;
        try {
            try {
                if (this.zzc.zzt.zzm().zzc().zzj(zzha.ANALYTICS_STORAGE)) {
                    zzjz zzjzVar = this.zzc;
                    zzejVar = zzjzVar.zzb;
                    if (zzejVar == null) {
                        zzjzVar.zzt.zzaA().zzd().zza("Failed to get app instance id");
                    } else {
                        Preconditions.checkNotNull(this.zza);
                        str = zzejVar.zzd(this.zza);
                        if (str != null) {
                            this.zzc.zzt.zzq().zzO(str);
                            this.zzc.zzt.zzm().zze.zzb(str);
                        }
                        this.zzc.zzQ();
                    }
                } else {
                    this.zzc.zzt.zzaA().zzl().zza("Analytics storage consent denied; will not get app instance id");
                    this.zzc.zzt.zzq().zzO(null);
                    this.zzc.zzt.zzm().zze.zzb(null);
                }
            } catch (RemoteException e2) {
                this.zzc.zzt.zzaA().zzd().zzb("Failed to get app instance id", e2);
            }
        } finally {
            this.zzc.zzt.zzv().zzW(this.zzb, null);
        }
    }
}
