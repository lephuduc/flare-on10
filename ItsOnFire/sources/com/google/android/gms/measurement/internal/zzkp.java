package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;

/* loaded from: classes.dex */
public final class zzkp extends zzf {
    public final zzko zza;
    public final zzkn zzb;
    public final zzkl zzc;
    private Handler zzd;
    private boolean zze;

    public zzkp(zzgd zzgdVar) {
        super(zzgdVar);
        this.zze = true;
        this.zza = new zzko(this);
        this.zzb = new zzkn(this);
        this.zzc = new zzkl(this);
    }

    public static /* bridge */ /* synthetic */ void zzj(zzkp zzkpVar, long j2) {
        zzkpVar.zzg();
        zzkpVar.zzp();
        zzkpVar.zzt.zzaA().zzj().zzb("Activity paused, time", Long.valueOf(j2));
        zzkpVar.zzc.zza(j2);
        if (zzkpVar.zzt.zzf().zzu()) {
            zzkpVar.zzb.zzb(j2);
        }
    }

    public static /* bridge */ /* synthetic */ void zzl(zzkp zzkpVar, long j2) {
        zzkpVar.zzg();
        zzkpVar.zzp();
        zzkpVar.zzt.zzaA().zzj().zzb("Activity resumed, time", Long.valueOf(j2));
        if (!zzkpVar.zzt.zzf().zzs(null, zzeg.zzaG) ? zzkpVar.zzt.zzf().zzu() || zzkpVar.zzt.zzm().zzm.zzb() : zzkpVar.zzt.zzf().zzu() || zzkpVar.zze) {
            zzkpVar.zzb.zzc(j2);
        }
        zzkpVar.zzc.zzb();
        zzko zzkoVar = zzkpVar.zza;
        zzkoVar.zza.zzg();
        if (zzkoVar.zza.zzt.zzJ()) {
            zzkoVar.zzb(zzkoVar.zza.zzt.zzax().currentTimeMillis(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzp() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.measurement.zzby(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    @WorkerThread
    public final void zzm(boolean z) {
        zzg();
        this.zze = z;
    }

    @WorkerThread
    public final boolean zzo() {
        zzg();
        return this.zze;
    }
}
