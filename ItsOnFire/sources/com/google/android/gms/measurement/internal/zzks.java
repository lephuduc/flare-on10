package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public final class zzks extends zzku {
    private final AlarmManager zza;
    private zzan zzb;
    private Integer zzc;

    public zzks(zzlh zzlhVar) {
        super(zzlhVar);
        this.zza = (AlarmManager) this.zzt.zzaw().getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    private final int zzf() {
        if (this.zzc == null) {
            this.zzc = Integer.valueOf("measurement".concat(String.valueOf(this.zzt.zzaw().getPackageName())).hashCode());
        }
        return this.zzc.intValue();
    }

    private final PendingIntent zzh() {
        Context zzaw = this.zzt.zzaw();
        return PendingIntent.getBroadcast(zzaw, 0, new Intent().setClassName(zzaw, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzbs.zza);
    }

    private final zzan zzi() {
        if (this.zzb == null) {
            this.zzb = new zzkr(this, this.zzf.zzp());
        }
        return this.zzb;
    }

    @TargetApi(24)
    private final void zzj() {
        JobScheduler jobScheduler = (JobScheduler) this.zzt.zzaw().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(zzf());
        }
    }

    public final void zza() {
        zzW();
        this.zzt.zzaA().zzj().zza("Unscheduling upload");
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        zzi().zzb();
        zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzku
    public final boolean zzb() {
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzh());
        }
        zzj();
        return false;
    }

    public final void zzd(long j2) {
        zzW();
        this.zzt.zzay();
        Context zzaw = this.zzt.zzaw();
        if (!zzlp.zzal(zzaw)) {
            this.zzt.zzaA().zzc().zza("Receiver not registered/enabled");
        }
        if (!zzlp.zzam(zzaw, false)) {
            this.zzt.zzaA().zzc().zza("Service not registered/enabled");
        }
        zza();
        this.zzt.zzaA().zzj().zzb("Scheduling upload, millis", Long.valueOf(j2));
        this.zzt.zzax().elapsedRealtime();
        this.zzt.zzf();
        if (j2 < Math.max(0L, ((Long) zzeg.zzx.zza(null)).longValue()) && !zzi().zze()) {
            zzi().zzd(j2);
        }
        this.zzt.zzay();
        Context zzaw2 = this.zzt.zzaw();
        ComponentName componentName = new ComponentName(zzaw2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int zzf = zzf();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.zzbt.zza(zzaw2, new JobInfo.Builder(zzf, componentName).setMinimumLatency(j2).setOverrideDeadline(j2 + j2).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }
}
