package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.messaging.ServiceStarter;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes.dex */
public final class zzag extends zzgw {
    private Boolean zza;
    private zzaf zzb;
    private Boolean zzc;

    public zzag(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzb = zzae.zza;
    }

    public static final long zzA() {
        return ((Long) zzeg.zzD.zza(null)).longValue();
    }

    private final String zzB(String str, String str2) {
        zzer zzd;
        String str3;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str4);
            return str4;
        } catch (ClassNotFoundException e2) {
            e = e2;
            zzd = this.zzt.zzaA().zzd();
            str3 = "Could not find SystemProperties class";
            zzd.zzb(str3, e);
            return "";
        } catch (IllegalAccessException e3) {
            e = e3;
            zzd = this.zzt.zzaA().zzd();
            str3 = "Could not access SystemProperties.get()";
            zzd.zzb(str3, e);
            return "";
        } catch (NoSuchMethodException e4) {
            e = e4;
            zzd = this.zzt.zzaA().zzd();
            str3 = "Could not find SystemProperties.get() method";
            zzd.zzb(str3, e);
            return "";
        } catch (InvocationTargetException e5) {
            e = e5;
            zzd = this.zzt.zzaA().zzd();
            str3 = "SystemProperties.get() threw an exception";
            zzd.zzb(str3, e);
            return "";
        }
    }

    public static final long zzz() {
        return ((Long) zzeg.zzd.zza(null)).longValue();
    }

    @WorkerThread
    public final double zza(String str, zzef zzefVar) {
        if (str != null) {
            String zza = this.zzb.zza(str, zzefVar.zzb());
            if (!TextUtils.isEmpty(zza)) {
                try {
                    return ((Double) zzefVar.zza(Double.valueOf(Double.parseDouble(zza)))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Double) zzefVar.zza(null)).doubleValue();
    }

    public final int zzb(@Size(min = 1) String str) {
        return zzf(str, zzeg.zzH, ServiceStarter.ERROR_UNKNOWN, 2000);
    }

    public final int zzc() {
        return this.zzt.zzv().zzai(201500000, true) ? 100 : 25;
    }

    public final int zzd(@Size(min = 1) String str) {
        return zzf(str, zzeg.zzI, 25, 100);
    }

    @WorkerThread
    public final int zze(String str, zzef zzefVar) {
        if (str != null) {
            String zza = this.zzb.zza(str, zzefVar.zzb());
            if (!TextUtils.isEmpty(zza)) {
                try {
                    return ((Integer) zzefVar.zza(Integer.valueOf(Integer.parseInt(zza)))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Integer) zzefVar.zza(null)).intValue();
    }

    @WorkerThread
    public final int zzf(String str, zzef zzefVar, int i2, int i3) {
        return Math.max(Math.min(zze(str, zzefVar), i3), i2);
    }

    public final long zzh() {
        this.zzt.zzay();
        return 79000L;
    }

    @WorkerThread
    public final long zzi(String str, zzef zzefVar) {
        if (str != null) {
            String zza = this.zzb.zza(str, zzefVar.zzb());
            if (!TextUtils.isEmpty(zza)) {
                try {
                    return ((Long) zzefVar.zza(Long.valueOf(Long.parseLong(zza)))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Long) zzefVar.zza(null)).longValue();
    }

    @VisibleForTesting
    public final Bundle zzj() {
        try {
            if (this.zzt.zzaw().getPackageManager() == null) {
                this.zzt.zzaA().zzd().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(this.zzt.zzaw()).getApplicationInfo(this.zzt.zzaw().getPackageName(), 128);
            if (applicationInfo == null) {
                this.zzt.zzaA().zzd().zza("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e2) {
            this.zzt.zzaA().zzd().zzb("Failed to load metadata: Package name not found", e2);
            return null;
        }
    }

    @VisibleForTesting
    public final Boolean zzk(@Size(min = 1) String str) {
        Preconditions.checkNotEmpty(str);
        Bundle zzj = zzj();
        if (zzj == null) {
            this.zzt.zzaA().zzd().zza("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (zzj.containsKey(str)) {
            return Boolean.valueOf(zzj.getBoolean(str));
        } else {
            return null;
        }
    }

    public final String zzl() {
        return zzB("debug.firebase.analytics.app", "");
    }

    public final String zzm() {
        return zzB("debug.deferred.deeplink", "");
    }

    public final String zzn() {
        this.zzt.zzay();
        return "FA";
    }

    @WorkerThread
    public final String zzo(String str, zzef zzefVar) {
        return (String) zzefVar.zza(str == null ? null : this.zzb.zza(str, zzefVar.zzb()));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzp(@androidx.annotation.Size(min = 1) java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            android.os.Bundle r0 = r3.zzj()
            r1 = 0
            if (r0 != 0) goto L1d
            com.google.android.gms.measurement.internal.zzgd r4 = r3.zzt
            com.google.android.gms.measurement.internal.zzet r4 = r4.zzaA()
            com.google.android.gms.measurement.internal.zzer r4 = r4.zzd()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.zza(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            com.google.android.gms.measurement.internal.zzgd r0 = r3.zzt     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.zzaw()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r3 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r3
        L48:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzgd r3 = r3.zzt
            com.google.android.gms.measurement.internal.zzet r3 = r3.zzaA()
            com.google.android.gms.measurement.internal.zzer r3 = r3.zzd()
            java.lang.String r0 = "Failed to load string array from metadata: resource not found"
            r3.zzb(r0, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzag.zzp(java.lang.String):java.util.List");
    }

    public final void zzq(zzaf zzafVar) {
        this.zzb = zzafVar;
    }

    public final boolean zzr() {
        Boolean zzk = zzk("google_analytics_adid_collection_enabled");
        return zzk == null || zzk.booleanValue();
    }

    @WorkerThread
    public final boolean zzs(String str, zzef zzefVar) {
        Object zza;
        if (str != null) {
            String zza2 = this.zzb.zza(str, zzefVar.zzb());
            if (!TextUtils.isEmpty(zza2)) {
                zza = zzefVar.zza(Boolean.valueOf("1".equals(zza2)));
                return ((Boolean) zza).booleanValue();
            }
        }
        zza = zzefVar.zza(null);
        return ((Boolean) zza).booleanValue();
    }

    public final boolean zzt(String str) {
        return "1".equals(this.zzb.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzu() {
        Boolean zzk = zzk("google_analytics_automatic_screen_reporting_enabled");
        return zzk == null || zzk.booleanValue();
    }

    public final boolean zzv() {
        this.zzt.zzay();
        Boolean zzk = zzk("firebase_analytics_collection_deactivated");
        return zzk != null && zzk.booleanValue();
    }

    public final boolean zzw(String str) {
        return "1".equals(this.zzb.zza(str, "measurement.event_sampling_enabled"));
    }

    @WorkerThread
    public final boolean zzx() {
        if (this.zza == null) {
            Boolean zzk = zzk("app_measurement_lite");
            this.zza = zzk;
            if (zzk == null) {
                this.zza = Boolean.FALSE;
            }
        }
        return this.zza.booleanValue() || !this.zzt.zzN();
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean zzy() {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    ApplicationInfo applicationInfo = this.zzt.zzaw().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(myProcessName)) {
                            z = true;
                        }
                        this.zzc = Boolean.valueOf(z);
                    }
                    if (this.zzc == null) {
                        this.zzc = Boolean.TRUE;
                        this.zzt.zzaA().zzd().zza("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzc.booleanValue();
    }
}
