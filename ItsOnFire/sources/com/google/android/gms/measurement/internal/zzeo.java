package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzeo {
    public static final AtomicReference zza = new AtomicReference();
    public static final AtomicReference zzb = new AtomicReference();
    public static final AtomicReference zzc = new AtomicReference();
    private final zzen zzd;

    public zzeo(zzen zzenVar) {
        this.zzd = zzenVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str3 = strArr[i2];
            if (str == str3 || str.equals(str3)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i2];
                    if (str2 == null) {
                        str2 = strArr2[i2] + "(" + strArr[i2] + ")";
                        strArr3[i2] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String zzb2 = obj instanceof Bundle ? zzb((Bundle) obj) : String.valueOf(obj);
            if (zzb2 != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(zzb2);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final String zzb(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (this.zzd.zza()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Bundle[{");
            for (String str : bundle.keySet()) {
                if (sb.length() != 8) {
                    sb.append(", ");
                }
                sb.append(zze(str));
                sb.append("=");
                Object obj = bundle.get(str);
                sb.append(obj instanceof Bundle ? zza(new Object[]{obj}) : obj instanceof Object[] ? zza((Object[]) obj) : obj instanceof ArrayList ? zza(((ArrayList) obj).toArray()) : String.valueOf(obj));
            }
            sb.append("}]");
            return sb.toString();
        }
        return bundle.toString();
    }

    public final String zzc(zzau zzauVar) {
        if (this.zzd.zza()) {
            StringBuilder sb = new StringBuilder();
            sb.append("origin=");
            sb.append(zzauVar.zzc);
            sb.append(",name=");
            sb.append(zzd(zzauVar.zza));
            sb.append(",params=");
            zzas zzasVar = zzauVar.zzb;
            sb.append(zzasVar == null ? null : !this.zzd.zza() ? zzasVar.toString() : zzb(zzasVar.zzc()));
            return sb.toString();
        }
        return zzauVar.toString();
    }

    public final String zzd(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzhc.zzc, zzhc.zza, zza);
    }

    public final String zze(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzhd.zzb, zzhd.zza, zzb);
    }

    public final String zzf(String str) {
        if (str == null) {
            return null;
        }
        if (this.zzd.zza()) {
            if (str.startsWith("_exp_")) {
                return "experiment_id(" + str + ")";
            }
            return zzg(str, zzhe.zzb, zzhe.zza, zzc);
        }
        return str;
    }
}
