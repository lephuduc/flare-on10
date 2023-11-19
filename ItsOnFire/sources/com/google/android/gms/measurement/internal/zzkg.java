package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzkg {
    private final Context zza;

    public zzkg(Context context) {
        Preconditions.checkNotNull(context);
        this.zza = context;
    }

    private final zzet zzk() {
        return zzgd.zzp(this.zza, null, null).zzaA();
    }

    @MainThread
    public final int zza(final Intent intent, int i2, final int i3) {
        zzgd zzp = zzgd.zzp(this.zza, null, null);
        final zzet zzaA = zzp.zzaA();
        if (intent == null) {
            zzaA.zzk().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzp.zzay();
        zzaA.zzj().zzc("Local AppMeasurementService called. startId, action", Integer.valueOf(i3), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzh(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkd
                @Override // java.lang.Runnable
                public final void run() {
                    zzkg.this.zzc(i3, zzaA, intent);
                }
            });
        }
        return 2;
    }

    @MainThread
    public final IBinder zzb(Intent intent) {
        if (intent == null) {
            zzk().zzd().zza("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzgv(zzlh.zzt(this.zza), null);
        }
        zzk().zzk().zzb("onBind received unknown action", action);
        return null;
    }

    public final /* synthetic */ void zzc(int i2, zzet zzetVar, Intent intent) {
        if (((zzkf) this.zza).zzc(i2)) {
            zzetVar.zzj().zzb("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i2));
            zzk().zzj().zza("Completed wakeful intent.");
            ((zzkf) this.zza).zza(intent);
        }
    }

    public final /* synthetic */ void zzd(zzet zzetVar, JobParameters jobParameters) {
        zzetVar.zzj().zza("AppMeasurementJobService processed last upload request.");
        ((zzkf) this.zza).zzb(jobParameters, false);
    }

    @MainThread
    public final void zze() {
        zzgd zzp = zzgd.zzp(this.zza, null, null);
        zzet zzaA = zzp.zzaA();
        zzp.zzay();
        zzaA.zzj().zza("Local AppMeasurementService is starting up");
    }

    @MainThread
    public final void zzf() {
        zzgd zzp = zzgd.zzp(this.zza, null, null);
        zzet zzaA = zzp.zzaA();
        zzp.zzay();
        zzaA.zzj().zza("Local AppMeasurementService is shutting down");
    }

    @MainThread
    public final void zzg(Intent intent) {
        if (intent == null) {
            zzk().zzd().zza("onRebind called with null intent");
            return;
        }
        zzk().zzj().zzb("onRebind called. action", intent.getAction());
    }

    public final void zzh(Runnable runnable) {
        zzlh zzt = zzlh.zzt(this.zza);
        zzt.zzaB().zzp(new zzke(this, zzt, runnable));
    }

    @TargetApi(24)
    @MainThread
    public final boolean zzi(final JobParameters jobParameters) {
        zzgd zzp = zzgd.zzp(this.zza, null, null);
        final zzet zzaA = zzp.zzaA();
        String string = jobParameters.getExtras().getString("action");
        zzp.zzay();
        zzaA.zzj().zzb("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            zzh(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkc
                @Override // java.lang.Runnable
                public final void run() {
                    zzkg.this.zzd(zzaA, jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    @MainThread
    public final boolean zzj(Intent intent) {
        if (intent == null) {
            zzk().zzd().zza("onUnbind called with null intent");
            return true;
        }
        zzk().zzj().zzb("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
