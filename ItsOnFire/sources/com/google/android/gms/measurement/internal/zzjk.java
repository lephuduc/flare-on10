package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjk implements Runnable {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzc;
    public final /* synthetic */ zzjz zzd;

    public zzjk(zzjz zzjzVar, zzau zzauVar, String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzd = zzjzVar;
        this.zza = zzauVar;
        this.zzb = str;
        this.zzc = zzcfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.android.gms.internal.measurement.zzcf] */
    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        byte[] bArr = null;
        try {
            try {
                zzjz zzjzVar = this.zzd;
                zzejVar = zzjzVar.zzb;
                if (zzejVar == null) {
                    zzjzVar.zzt.zzaA().zzd().zza("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArr = zzejVar.zzu(this.zza, this.zzb);
                    this.zzd.zzQ();
                }
            } catch (RemoteException e2) {
                this.zzd.zzt.zzaA().zzd().zzb("Failed to send event to the service to bundle", e2);
            }
        } finally {
            this.zzd.zzt.zzv().zzT(this.zzc, bArr);
        }
    }
}
