package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public class zzlo {
    private static final zzkn zzb = zzkn.zza;
    public volatile zzmi zza;
    private volatile zzka zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlo) {
            zzlo zzloVar = (zzlo) obj;
            zzmi zzmiVar = this.zza;
            zzmi zzmiVar2 = zzloVar.zza;
            if (zzmiVar == null && zzmiVar2 == null) {
                return zzb().equals(zzloVar.zzb());
            }
            if (zzmiVar == null || zzmiVar2 == null) {
                if (zzmiVar != null) {
                    zzloVar.zzc(zzmiVar.zzbV());
                    return zzmiVar.equals(zzloVar.zza);
                }
                zzc(zzmiVar2.zzbV());
                return this.zza.equals(zzmiVar2);
            }
            return zzmiVar.equals(zzmiVar2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzjx) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzbz();
        }
        return 0;
    }

    public final zzka zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            this.zzc = this.zza == null ? zzka.zzb : this.zza.zzbv();
            return this.zzc;
        }
    }

    public final void zzc(zzmi zzmiVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzmiVar;
                    this.zzc = zzka.zzb;
                } catch (zzll unused) {
                    this.zza = zzmiVar;
                    this.zzc = zzka.zzb;
                }
            }
        }
    }
}
