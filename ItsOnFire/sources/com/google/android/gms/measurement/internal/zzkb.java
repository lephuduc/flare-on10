package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzkb extends zzku {
    public final zzfe zza;
    public final zzfe zzb;
    public final zzfe zzc;
    public final zzfe zzd;
    public final zzfe zze;
    private final Map zzg;

    public zzkb(zzlh zzlhVar) {
        super(zzlhVar);
        this.zzg = new HashMap();
        zzfi zzm = this.zzt.zzm();
        zzm.getClass();
        this.zza = new zzfe(zzm, "last_delete_stale", 0L);
        zzfi zzm2 = this.zzt.zzm();
        zzm2.getClass();
        this.zzb = new zzfe(zzm2, "backoff", 0L);
        zzfi zzm3 = this.zzt.zzm();
        zzm3.getClass();
        this.zzc = new zzfe(zzm3, "last_upload", 0L);
        zzfi zzm4 = this.zzt.zzm();
        zzm4.getClass();
        this.zzd = new zzfe(zzm4, "last_upload_attempt", 0L);
        zzfi zzm5 = this.zzt.zzm();
        zzm5.getClass();
        this.zze = new zzfe(zzm5, "midnight_offset", 0L);
    }

    @WorkerThread
    @Deprecated
    public final Pair zza(String str) {
        zzka zzkaVar;
        AdvertisingIdClient.Info info;
        zzg();
        long elapsedRealtime = this.zzt.zzax().elapsedRealtime();
        zzka zzkaVar2 = (zzka) this.zzg.get(str);
        if (zzkaVar2 == null || elapsedRealtime >= zzkaVar2.zzc) {
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
            long zzi = this.zzt.zzf().zzi(str, zzeg.zza) + elapsedRealtime;
            try {
                long zzi2 = this.zzt.zzf().zzi(str, zzeg.zzb);
                info = null;
                if (zzi2 > 0) {
                    try {
                        info = AdvertisingIdClient.getAdvertisingIdInfo(this.zzt.zzaw());
                    } catch (PackageManager.NameNotFoundException unused) {
                        if (zzkaVar2 != null && elapsedRealtime < zzkaVar2.zzc + zzi2) {
                            return new Pair(zzkaVar2.zza, Boolean.valueOf(zzkaVar2.zzb));
                        }
                    }
                } else {
                    info = AdvertisingIdClient.getAdvertisingIdInfo(this.zzt.zzaw());
                }
            } catch (Exception e2) {
                this.zzt.zzaA().zzc().zzb("Unable to get advertising id", e2);
                zzkaVar = new zzka("", false, zzi);
            }
            if (info == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String id = info.getId();
            zzkaVar = id != null ? new zzka(id, info.isLimitAdTrackingEnabled(), zzi) : new zzka("", info.isLimitAdTrackingEnabled(), zzi);
            this.zzg.put(str, zzkaVar);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(zzkaVar.zza, Boolean.valueOf(zzkaVar.zzb));
        }
        return new Pair(zzkaVar2.zza, Boolean.valueOf(zzkaVar2.zzb));
    }

    @Override // com.google.android.gms.measurement.internal.zzku
    public final boolean zzb() {
        return false;
    }

    @WorkerThread
    public final Pair zzd(String str, zzhb zzhbVar) {
        return zzhbVar.zzj(zzha.AD_STORAGE) ? zza(str) : new Pair("", Boolean.FALSE);
    }

    @WorkerThread
    @Deprecated
    public final String zzf(String str, boolean z) {
        zzg();
        String str2 = z ? (String) zza(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest zzF = zzlp.zzF();
        if (zzF == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, zzF.digest(str2.getBytes())));
    }
}
