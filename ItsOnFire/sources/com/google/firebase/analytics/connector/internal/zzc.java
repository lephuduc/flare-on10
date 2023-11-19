package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzja;
import com.google.android.gms.internal.measurement.zzjb;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import j.y0;

/* loaded from: classes.dex */
public final class zzc {
    public static final /* synthetic */ int zza = 0;
    private static final zzjb zzb = zzjb.zzi("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", FirebaseAnalytics.Event.CAMPAIGN_DETAILS, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    private static final zzja zzc = zzja.zzj("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    private static final zzja zzd = zzja.zzi(y0.f581c, "app", "am");
    private static final zzja zze = zzja.zzh("_r", "_dbg");
    private static final zzja zzf;
    private static final zzja zzg;

    static {
        zzix zzixVar = new zzix();
        zzixVar.zza(zzhe.zza);
        zzixVar.zza(zzhe.zzb);
        zzf = zzixVar.zzb();
        zzg = zzja.zzh("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean zza(String str, String str2, Bundle bundle) {
        char c2;
        String str3;
        if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2)) {
            if (zzd(str) && bundle != null) {
                zzja zzjaVar = zze;
                int size = zzjaVar.size();
                int i2 = 0;
                while (i2 < size) {
                    boolean containsKey = bundle.containsKey((String) zzjaVar.get(i2));
                    i2++;
                    if (containsKey) {
                        return false;
                    }
                }
                int hashCode = str.hashCode();
                if (hashCode == 101200) {
                    if (str.equals("fcm")) {
                        c2 = 0;
                    }
                    c2 = 65535;
                } else if (hashCode != 101230) {
                    if (hashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                        c2 = 2;
                    }
                    c2 = 65535;
                } else {
                    if (str.equals("fdl")) {
                        c2 = 1;
                    }
                    c2 = 65535;
                }
                if (c2 == 0) {
                    str3 = "fcm_integration";
                } else if (c2 == 1) {
                    str3 = "fdl_integration";
                } else if (c2 != 2) {
                    return false;
                } else {
                    str3 = "fiam_integration";
                }
                bundle.putString("_cis", str3);
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean zzb(String str, Bundle bundle) {
        if (zzc.contains(str)) {
            return false;
        }
        if (bundle != null) {
            zzja zzjaVar = zze;
            int size = zzjaVar.size();
            int i2 = 0;
            while (i2 < size) {
                boolean containsKey = bundle.containsKey((String) zzjaVar.get(i2));
                i2++;
                if (containsKey) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean zzc(String str) {
        return !zzb.contains(str);
    }

    public static boolean zzd(String str) {
        return !zzd.contains(str);
    }

    public static boolean zze(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        } else if (Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION.equals(str2)) {
            return str.equals("fcm") || str.equals(AppMeasurement.FIAM_ORIGIN);
        } else if (zzf.contains(str2)) {
            return false;
        } else {
            zzja zzjaVar = zzg;
            int size = zzjaVar.size();
            int i2 = 0;
            while (i2 < size) {
                boolean matches = str2.matches((String) zzjaVar.get(i2));
                i2++;
                if (matches) {
                    return false;
                }
            }
            return true;
        }
    }
}
