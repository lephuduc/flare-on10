package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzrf implements zzre {
    public static final zzib zza;
    public static final zzib zzb;

    static {
        zzhy zza2 = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zzf("measurement.sgtm.client.dev", false);
        zzb = zza2.zzf("measurement.sgtm.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzre
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzre
    public final boolean zzb() {
        return ((Boolean) zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzre
    public final boolean zzc() {
        return ((Boolean) zzb.zzb()).booleanValue();
    }
}
