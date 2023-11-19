package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzmv {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zznk zzc;
    private static final zznk zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zznk zznkVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zznkVar = (zznk) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zznkVar;
        zzd = new zznm();
    }

    public static Object zzA(Object obj, int i2, int i3, Object obj2, zznk zznkVar) {
        if (obj2 == null) {
            obj2 = zznkVar.zzc(obj);
        }
        zznkVar.zzf(obj2, i2, i3);
        return obj2;
    }

    public static void zzB(zznk zznkVar, Object obj, Object obj2) {
        zznkVar.zzh(obj, zznkVar.zze(zznkVar.zzd(obj), zznkVar.zzd(obj2)));
    }

    public static void zzC(Class cls) {
        Class cls2;
        if (!zzlb.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzD(int i2, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzc(i2, list, z);
    }

    public static void zzE(int i2, List list, zzoc zzocVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zze(i2, list);
    }

    public static void zzF(int i2, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzg(i2, list, z);
    }

    public static void zzG(int i2, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzj(i2, list, z);
    }

    public static void zzH(int i2, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzl(i2, list, z);
    }

    public static void zzI(int i2, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzn(i2, list, z);
    }

    public static void zzJ(int i2, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzp(i2, list, z);
    }

    public static void zzK(int i2, List list, zzoc zzocVar, zzmt zzmtVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((zzkj) zzocVar).zzq(i2, list.get(i3), zzmtVar);
        }
    }

    public static void zzL(int i2, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzs(i2, list, z);
    }

    public static void zzM(int i2, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzu(i2, list, z);
    }

    public static void zzN(int i2, List list, zzoc zzocVar, zzmt zzmtVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((zzkj) zzocVar).zzv(i2, list.get(i3), zzmtVar);
        }
    }

    public static void zzO(int i2, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzx(i2, list, z);
    }

    public static void zzP(int i2, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzz(i2, list, z);
    }

    public static void zzQ(int i2, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzB(i2, list, z);
    }

    public static void zzR(int i2, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzD(i2, list, z);
    }

    public static void zzS(int i2, List list, zzoc zzocVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzG(i2, list);
    }

    public static void zzT(int i2, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzI(i2, list, z);
    }

    public static void zzU(int i2, List list, zzoc zzocVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzK(i2, list, z);
    }

    public static boolean zzV(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int zza(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzki.zzx(i2 << 3) + 1);
    }

    public static int zzb(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = size * zzki.zzx(i2 << 3);
        for (int i3 = 0; i3 < list.size(); i3++) {
            int zzd2 = ((zzka) list.get(i3)).zzd();
            zzx += zzki.zzx(zzd2) + zzd2;
        }
        return zzx;
    }

    public static int zzc(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzki.zzx(i2 << 3));
    }

    public static int zzd(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzki.zzu(zzlcVar.zze(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzki.zzu(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zze(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzki.zzx(i2 << 3) + 4);
    }

    public static int zzf(List list) {
        return list.size() * 4;
    }

    public static int zzg(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzki.zzx(i2 << 3) + 8);
    }

    public static int zzh(List list) {
        return list.size() * 8;
    }

    public static int zzi(int i2, List list, zzmt zzmtVar) {
        int size = list.size();
        if (size != 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                i3 += zzki.zzt(i2, (zzmi) list.get(i4), zzmtVar);
            }
            return i3;
        }
        return 0;
    }

    public static int zzj(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzk(list) + (size * zzki.zzx(i2 << 3));
    }

    public static int zzk(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzki.zzu(zzlcVar.zze(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzki.zzu(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzl(int i2, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzm(list) + (list.size() * zzki.zzx(i2 << 3));
    }

    public static int zzm(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlx) {
            zzlx zzlxVar = (zzlx) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzki.zzy(zzlxVar.zza(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzki.zzy(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzn(int i2, Object obj, zzmt zzmtVar) {
        if (!(obj instanceof zzlo)) {
            return zzki.zzx(i2 << 3) + zzki.zzv((zzmi) obj, zzmtVar);
        }
        int i3 = zzki.zzb;
        int zza2 = ((zzlo) obj).zza();
        return zzki.zzx(i2 << 3) + zzki.zzx(zza2) + zza2;
    }

    public static int zzo(int i2, List list, zzmt zzmtVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = zzki.zzx(i2 << 3) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzlo) {
                int zza2 = ((zzlo) obj).zza();
                zzx += zzki.zzx(zza2) + zza2;
            } else {
                zzx += zzki.zzv((zzmi) obj, zzmtVar);
            }
        }
        return zzx;
    }

    public static int zzp(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzq(list) + (size * zzki.zzx(i2 << 3));
    }

    public static int zzq(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            i2 = 0;
            while (i3 < size) {
                int zze = zzlcVar.zze(i3);
                i2 += zzki.zzx((zze >> 31) ^ (zze + zze));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                int intValue = ((Integer) list.get(i3)).intValue();
                i2 += zzki.zzx((intValue >> 31) ^ (intValue + intValue));
                i3++;
            }
        }
        return i2;
    }

    public static int zzr(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzs(list) + (size * zzki.zzx(i2 << 3));
    }

    public static int zzs(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlx) {
            zzlx zzlxVar = (zzlx) list;
            i2 = 0;
            while (i3 < size) {
                long zza2 = zzlxVar.zza(i3);
                i2 += zzki.zzy((zza2 >> 63) ^ (zza2 + zza2));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                long longValue = ((Long) list.get(i3)).longValue();
                i2 += zzki.zzy((longValue >> 63) ^ (longValue + longValue));
                i3++;
            }
        }
        return i2;
    }

    public static int zzt(int i2, List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z = list instanceof zzlq;
        int zzx = zzki.zzx(i2 << 3) * size;
        if (z) {
            zzlq zzlqVar = (zzlq) list;
            while (i3 < size) {
                Object zzf = zzlqVar.zzf(i3);
                if (zzf instanceof zzka) {
                    int zzd2 = ((zzka) zzf).zzd();
                    zzx += zzki.zzx(zzd2) + zzd2;
                } else {
                    zzx += zzki.zzw((String) zzf);
                }
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                if (obj instanceof zzka) {
                    int zzd3 = ((zzka) obj).zzd();
                    zzx += zzki.zzx(zzd3) + zzd3;
                } else {
                    zzx += zzki.zzw((String) obj);
                }
                i3++;
            }
        }
        return zzx;
    }

    public static int zzu(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzv(list) + (size * zzki.zzx(i2 << 3));
    }

    public static int zzv(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzki.zzx(zzlcVar.zze(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzki.zzx(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzw(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzx(list) + (size * zzki.zzx(i2 << 3));
    }

    public static int zzx(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlx) {
            zzlx zzlxVar = (zzlx) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzki.zzy(zzlxVar.zza(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzki.zzy(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static zznk zzy() {
        return zzc;
    }

    public static zznk zzz() {
        return zzd;
    }
}
