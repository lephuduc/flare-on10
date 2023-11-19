package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzqo;
import j.y0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkk implements Runnable {
    public final long zza;
    public final long zzb;
    public final /* synthetic */ zzkl zzc;

    public zzkk(zzkl zzklVar, long j2, long j3) {
        this.zzc = zzklVar;
        this.zza = j2;
        this.zzb = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkj
            @Override // java.lang.Runnable
            public final void run() {
                zzkk zzkkVar = zzkk.this;
                zzkl zzklVar = zzkkVar.zzc;
                long j2 = zzkkVar.zza;
                long j3 = zzkkVar.zzb;
                zzklVar.zza.zzg();
                zzklVar.zza.zzt.zzaA().zzc().zza("Application going to the background");
                zzklVar.zza.zzt.zzm().zzm.zza(true);
                zzklVar.zza.zzm(true);
                if (!zzklVar.zza.zzt.zzf().zzu()) {
                    zzklVar.zza.zzb.zzb(j3);
                    zzklVar.zza.zzb.zzd(false, false, j3);
                }
                zzqo.zzc();
                if (zzklVar.zza.zzt.zzf().zzs(null, zzeg.zzaB)) {
                    zzklVar.zza.zzt.zzaA().zzi().zzb("Application backgrounded at: timestamp_millis", Long.valueOf(j2));
                } else {
                    zzklVar.zza.zzt.zzq().zzH(y0.f581c, "_ab", j2, new Bundle());
                }
            }
        });
    }
}
