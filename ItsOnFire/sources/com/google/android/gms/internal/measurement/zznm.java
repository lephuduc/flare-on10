package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
final class zznm extends zznk {
    @Override // com.google.android.gms.internal.measurement.zznk
    public final /* synthetic */ int zza(Object obj) {
        return ((zznl) obj).zza();
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final /* synthetic */ int zzb(Object obj) {
        return ((zznl) obj).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzlb zzlbVar = (zzlb) obj;
        zznl zznlVar = zzlbVar.zzc;
        if (zznlVar == zznl.zzc()) {
            zznl zzf = zznl.zzf();
            zzlbVar.zzc = zzf;
            return zzf;
        }
        return zznlVar;
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzlb) obj).zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (zznl.zzc().equals(obj2)) {
            return obj;
        }
        zznl zznlVar = (zznl) obj2;
        if (zznl.zzc().equals(obj)) {
            return zznl.zze((zznl) obj, zznlVar);
        }
        ((zznl) obj).zzd(zznlVar);
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i2, long j2) {
        ((zznl) obj).zzj(i2 << 3, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final void zzg(Object obj) {
        ((zzlb) obj).zzc.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final /* synthetic */ void zzh(Object obj, Object obj2) {
        ((zzlb) obj).zzc = (zznl) obj2;
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final /* synthetic */ void zzi(Object obj, zzoc zzocVar) throws IOException {
        ((zznl) obj).zzk(zzocVar);
    }
}
