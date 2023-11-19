package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class zzgb extends zzlb implements zzmj {
    private static final zzgb zza;
    private zzli zzd = zzlb.zzbH();

    static {
        zzgb zzgbVar = new zzgb();
        zza = zzgbVar;
        zzlb.zzbO(zzgb.class, zzgbVar);
    }

    private zzgb() {
    }

    public static zzga zza() {
        return (zzga) zza.zzbA();
    }

    public static /* synthetic */ void zze(zzgb zzgbVar, zzgd zzgdVar) {
        zzgdVar.getClass();
        zzli zzliVar = zzgbVar.zzd;
        if (!zzliVar.zzc()) {
            zzgbVar.zzd = zzlb.zzbI(zzliVar);
        }
        zzgbVar.zzd.add(zzgdVar);
    }

    public final zzgd zzc(int i2) {
        return (zzgd) this.zzd.get(0);
    }

    public final List zzd() {
        return this.zzd;
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
                    return new zzga(null);
                }
                return new zzgb();
            }
            return zzlb.zzbL(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzgd.class});
        }
        return (byte) 1;
    }
}
