package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzgm extends zzlb implements zzmj {
    private static final zzgm zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        zzgm zzgmVar = new zzgm();
        zza = zzgmVar;
        zzlb.zzbO(zzgm.class, zzgmVar);
    }

    private zzgm() {
    }

    public static zzgl zzd() {
        return (zzgl) zza.zzbA();
    }

    public static /* synthetic */ void zzh(zzgm zzgmVar, long j2) {
        zzgmVar.zzd |= 1;
        zzgmVar.zze = j2;
    }

    public static /* synthetic */ void zzi(zzgm zzgmVar, String str) {
        str.getClass();
        zzgmVar.zzd |= 2;
        zzgmVar.zzf = str;
    }

    public static /* synthetic */ void zzj(zzgm zzgmVar, String str) {
        str.getClass();
        zzgmVar.zzd |= 4;
        zzgmVar.zzg = str;
    }

    public static /* synthetic */ void zzk(zzgm zzgmVar) {
        zzgmVar.zzd &= -5;
        zzgmVar.zzg = zza.zzg;
    }

    public static /* synthetic */ void zzm(zzgm zzgmVar, long j2) {
        zzgmVar.zzd |= 8;
        zzgmVar.zzh = j2;
    }

    public static /* synthetic */ void zzn(zzgm zzgmVar) {
        zzgmVar.zzd &= -9;
        zzgmVar.zzh = 0L;
    }

    public static /* synthetic */ void zzo(zzgm zzgmVar, double d2) {
        zzgmVar.zzd |= 32;
        zzgmVar.zzj = d2;
    }

    public static /* synthetic */ void zzp(zzgm zzgmVar) {
        zzgmVar.zzd &= -33;
        zzgmVar.zzj = 0.0d;
    }

    public final double zza() {
        return this.zzj;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final long zzc() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzg;
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
                    return new zzgl(null);
                }
                return new zzgm();
            }
            return zzlb.zzbL(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final boolean zzq() {
        return (this.zzd & 32) != 0;
    }

    public final boolean zzr() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzs() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzt() {
        return (this.zzd & 4) != 0;
    }
}
