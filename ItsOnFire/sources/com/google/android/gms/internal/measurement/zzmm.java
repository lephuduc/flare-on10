package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzmm implements zzmt {
    private final zzmi zza;
    private final zznk zzb;
    private final boolean zzc;
    private final zzko zzd;

    private zzmm(zznk zznkVar, zzko zzkoVar, zzmi zzmiVar) {
        this.zzb = zznkVar;
        this.zzc = zzkoVar.zzc(zzmiVar);
        this.zzd = zzkoVar;
        this.zza = zzmiVar;
    }

    public static zzmm zzc(zznk zznkVar, zzko zzkoVar, zzmi zzmiVar) {
        return new zzmm(zznkVar, zzkoVar, zzmiVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final int zza(Object obj) {
        zznk zznkVar = this.zzb;
        int zzb = zznkVar.zzb(zznkVar.zzd(obj));
        if (this.zzc) {
            this.zzd.zza(obj);
            throw null;
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (this.zzc) {
            this.zzd.zza(obj);
            throw null;
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final Object zze() {
        zzmi zzmiVar = this.zza;
        return zzmiVar instanceof zzlb ? ((zzlb) zzmiVar).zzbD() : zzmiVar.zzbJ().zzaF();
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzf(Object obj) {
        this.zzb.zzg(obj);
        this.zzd.zzb(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzg(Object obj, Object obj2) {
        zzmv.zzB(this.zzb, obj, obj2);
        if (this.zzc) {
            this.zzd.zza(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzh(Object obj, byte[] bArr, int i2, int i3, zzjn zzjnVar) throws IOException {
        zzlb zzlbVar = (zzlb) obj;
        if (zzlbVar.zzc == zznl.zzc()) {
            zzlbVar.zzc = zznl.zzf();
        }
        zzky zzkyVar = (zzky) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzi(Object obj, zzoc zzocVar) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzj(Object obj, Object obj2) {
        if (this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            if (this.zzc) {
                this.zzd.zza(obj);
                this.zzd.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }
}
