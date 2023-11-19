package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class zzk extends zzai {
    private final zzab zza;

    public zzk(zzab zzabVar) {
        super("internal.eventLogger");
        this.zza = zzabVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzh.zzh(this.zzd, 3, list);
        String zzi = zzgVar.zzb((zzap) list.get(0)).zzi();
        long zza = (long) zzh.zza(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue());
        zzap zzb = zzgVar.zzb((zzap) list.get(2));
        this.zza.zze(zzi, zza, zzb instanceof zzam ? zzh.zzg((zzam) zzb) : new HashMap());
        return zzap.zzf;
    }
}
