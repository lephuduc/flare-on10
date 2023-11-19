package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzbg implements zzbf {
    private final zzg zza;
    private final String zzb;

    public zzbg(zzg zzgVar, String str) {
        this.zza = zzgVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzbf
    public final zzg zza(zzap zzapVar) {
        this.zza.zze(this.zzb, zzapVar);
        return this.zza;
    }
}
