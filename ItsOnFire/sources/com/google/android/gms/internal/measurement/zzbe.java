package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzbe implements zzbf {
    private final zzg zza;
    private final String zzb;

    public zzbe(zzg zzgVar, String str) {
        this.zza = zzgVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzbf
    public final zzg zza(zzap zzapVar) {
        zzg zza = this.zza.zza();
        zza.zze(this.zzb, zzapVar);
        return zza;
    }
}
