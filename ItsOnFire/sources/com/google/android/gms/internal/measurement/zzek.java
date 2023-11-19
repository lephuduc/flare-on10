package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class zzek extends zzlb implements zzmj {
    private static final zzek zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzli zzg = zzlb.zzbH();
    private boolean zzh;
    private zzer zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        zzek zzekVar = new zzek();
        zza = zzekVar;
        zzlb.zzbO(zzek.class, zzekVar);
    }

    private zzek() {
    }

    public static zzej zzc() {
        return (zzej) zza.zzbA();
    }

    public static /* synthetic */ void zzi(zzek zzekVar, String str) {
        zzekVar.zzd |= 2;
        zzekVar.zzf = str;
    }

    public static /* synthetic */ void zzj(zzek zzekVar, int i2, zzem zzemVar) {
        zzemVar.getClass();
        zzli zzliVar = zzekVar.zzg;
        if (!zzliVar.zzc()) {
            zzekVar.zzg = zzlb.zzbI(zzliVar);
        }
        zzekVar.zzg.set(i2, zzemVar);
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final zzem zze(int i2) {
        return (zzem) this.zzg.get(i2);
    }

    public final zzer zzf() {
        zzer zzerVar = this.zzi;
        return zzerVar == null ? zzer.zzb() : zzerVar;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zzg;
    }

    public final boolean zzk() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzej(null);
                }
                return new zzek();
            }
            return zzlb.zzbL(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", zzem.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }

    public final boolean zzm() {
        return this.zzk;
    }

    public final boolean zzn() {
        return this.zzl;
    }

    public final boolean zzo() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzp() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzq() {
        return (this.zzd & 64) != 0;
    }
}
