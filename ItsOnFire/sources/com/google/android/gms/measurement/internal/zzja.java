package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzja implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzq zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zze;
    public final /* synthetic */ zzjz zzf;

    public zzja(zzjz zzjzVar, String str, String str2, zzq zzqVar, boolean z, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzf = zzjzVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = z;
        this.zze = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e2;
        zzej zzejVar;
        Bundle bundle2 = new Bundle();
        try {
            zzjz zzjzVar = this.zzf;
            zzejVar = zzjzVar.zzb;
            if (zzejVar == null) {
                zzjzVar.zzt.zzaA().zzd().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                this.zzf.zzt.zzv().zzS(this.zze, bundle2);
                return;
            }
            Preconditions.checkNotNull(this.zzc);
            List<zzlk> zzh = zzejVar.zzh(this.zza, this.zzb, this.zzd, this.zzc);
            bundle = new Bundle();
            if (zzh != null) {
                for (zzlk zzlkVar : zzh) {
                    String str = zzlkVar.zze;
                    if (str != null) {
                        bundle.putString(zzlkVar.zzb, str);
                    } else {
                        Long l2 = zzlkVar.zzd;
                        if (l2 != null) {
                            bundle.putLong(zzlkVar.zzb, l2.longValue());
                        } else {
                            Double d2 = zzlkVar.zzg;
                            if (d2 != null) {
                                bundle.putDouble(zzlkVar.zzb, d2.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.zzf.zzQ();
                    this.zzf.zzt.zzv().zzS(this.zze, bundle);
                } catch (Throwable th) {
                    th = th;
                    bundle2 = bundle;
                    this.zzf.zzt.zzv().zzS(this.zze, bundle2);
                    throw th;
                }
            } catch (RemoteException e3) {
                e2 = e3;
                this.zzf.zzt.zzaA().zzd().zzc("Failed to get user properties; remote exception", this.zza, e2);
                this.zzf.zzt.zzv().zzS(this.zze, bundle);
            }
        } catch (RemoteException e4) {
            bundle = bundle2;
            e2 = e4;
        } catch (Throwable th2) {
            th = th2;
            this.zzf.zzt.zzv().zzS(this.zze, bundle2);
            throw th;
        }
    }
}
