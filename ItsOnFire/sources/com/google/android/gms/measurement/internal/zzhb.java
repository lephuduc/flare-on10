package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;

/* loaded from: classes.dex */
public final class zzhb {
    public static final zzhb zza = new zzhb(null, null, 100);
    private final EnumMap zzb;
    private final int zzc;

    public zzhb(Boolean bool, Boolean bool2, int i2) {
        EnumMap enumMap = new EnumMap(zzha.class);
        this.zzb = enumMap;
        enumMap.put((EnumMap) zzha.AD_STORAGE, (zzha) bool);
        enumMap.put((EnumMap) zzha.ANALYTICS_STORAGE, (zzha) bool2);
        this.zzc = i2;
    }

    public zzhb(EnumMap enumMap, int i2) {
        EnumMap enumMap2 = new EnumMap(zzha.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i2;
    }

    public static zzhb zzb(Bundle bundle, int i2) {
        zzha[] values;
        if (bundle == null) {
            return new zzhb(null, null, i2);
        }
        EnumMap enumMap = new EnumMap(zzha.class);
        for (zzha zzhaVar : zzha.values()) {
            enumMap.put((EnumMap) zzhaVar, (zzha) zzp(bundle.getString(zzhaVar.zzd)));
        }
        return new zzhb(enumMap, i2);
    }

    public static zzhb zzc(String str, int i2) {
        EnumMap enumMap = new EnumMap(zzha.class);
        if (str != null) {
            int i3 = 0;
            while (true) {
                zzha[] zzhaVarArr = zzha.zzc;
                int length = zzhaVarArr.length;
                if (i3 >= 2) {
                    break;
                }
                zzha zzhaVar = zzhaVarArr[i3];
                int i4 = i3 + 2;
                if (i4 < str.length()) {
                    char charAt = str.charAt(i4);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put((EnumMap) zzhaVar, (zzha) bool);
                }
                i3++;
            }
        }
        return new zzhb(enumMap, i2);
    }

    public static String zzh(Bundle bundle) {
        zzha[] values;
        String string;
        for (zzha zzhaVar : zzha.values()) {
            if (bundle.containsKey(zzhaVar.zzd) && (string = bundle.getString(zzhaVar.zzd)) != null && zzp(string) == null) {
                return string;
            }
        }
        return null;
    }

    public static boolean zzk(int i2, int i3) {
        return i2 <= i3;
    }

    public static final int zzo(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    private static Boolean zzp(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        zzha[] values;
        if (obj instanceof zzhb) {
            zzhb zzhbVar = (zzhb) obj;
            for (zzha zzhaVar : zzha.values()) {
                if (zzo((Boolean) this.zzb.get(zzhaVar)) != zzo((Boolean) zzhbVar.zzb.get(zzhaVar))) {
                    return false;
                }
            }
            return this.zzc == zzhbVar.zzc;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zzc * 17;
        for (Boolean bool : this.zzb.values()) {
            i2 = (i2 * 31) + zzo(bool);
        }
        return i2;
    }

    public final String toString() {
        zzha[] values;
        StringBuilder sb = new StringBuilder("settings: source=");
        sb.append(this.zzc);
        for (zzha zzhaVar : zzha.values()) {
            sb.append(", ");
            sb.append(zzhaVar.name());
            sb.append("=");
            Boolean bool = (Boolean) this.zzb.get(zzhaVar);
            sb.append(bool == null ? "uninitialized" : true != bool.booleanValue() ? "denied" : "granted");
        }
        return sb.toString();
    }

    public final int zza() {
        return this.zzc;
    }

    public final zzhb zzd(zzhb zzhbVar) {
        zzha[] values;
        EnumMap enumMap = new EnumMap(zzha.class);
        for (zzha zzhaVar : zzha.values()) {
            Boolean bool = (Boolean) this.zzb.get(zzhaVar);
            Boolean bool2 = (Boolean) zzhbVar.zzb.get(zzhaVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put((EnumMap) zzhaVar, (zzha) bool);
        }
        return new zzhb(enumMap, 100);
    }

    public final zzhb zze(zzhb zzhbVar) {
        zzha[] values;
        EnumMap enumMap = new EnumMap(zzha.class);
        for (zzha zzhaVar : zzha.values()) {
            Boolean bool = (Boolean) this.zzb.get(zzhaVar);
            if (bool == null) {
                bool = (Boolean) zzhbVar.zzb.get(zzhaVar);
            }
            enumMap.put((EnumMap) zzhaVar, (zzha) bool);
        }
        return new zzhb(enumMap, this.zzc);
    }

    public final Boolean zzf() {
        return (Boolean) this.zzb.get(zzha.AD_STORAGE);
    }

    public final Boolean zzg() {
        return (Boolean) this.zzb.get(zzha.ANALYTICS_STORAGE);
    }

    public final String zzi() {
        StringBuilder sb = new StringBuilder("G1");
        zzha[] zzhaVarArr = zzha.zzc;
        int length = zzhaVarArr.length;
        for (int i2 = 0; i2 < 2; i2++) {
            Boolean bool = (Boolean) this.zzb.get(zzhaVarArr[i2]);
            sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb.toString();
    }

    public final boolean zzj(zzha zzhaVar) {
        Boolean bool = (Boolean) this.zzb.get(zzhaVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean zzl() {
        for (Boolean bool : this.zzb.values()) {
            if (bool != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzm(zzhb zzhbVar) {
        return zzn(zzhbVar, (zzha[]) this.zzb.keySet().toArray(new zzha[0]));
    }

    public final boolean zzn(zzhb zzhbVar, zzha... zzhaVarArr) {
        for (zzha zzhaVar : zzhaVarArr) {
            Boolean bool = (Boolean) this.zzb.get(zzhaVar);
            Boolean bool2 = (Boolean) zzhbVar.zzb.get(zzhaVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }
}
