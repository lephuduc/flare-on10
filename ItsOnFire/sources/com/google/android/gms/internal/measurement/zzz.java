package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class zzz {
    public final TreeMap zza = new TreeMap();
    public final TreeMap zzb = new TreeMap();

    private static final int zzc(zzg zzgVar, zzao zzaoVar, zzap zzapVar) {
        zzap zza = zzaoVar.zza(zzgVar, Collections.singletonList(zzapVar));
        if (zza instanceof zzah) {
            return zzh.zzb(zza.zzh().doubleValue());
        }
        return -1;
    }

    public final void zza(String str, int i2, zzao zzaoVar, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.zzb;
        } else if (!"edit".equals(str2)) {
            throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
        } else {
            treeMap = this.zza;
        }
        if (treeMap.containsKey(Integer.valueOf(i2))) {
            i2 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i2), zzaoVar);
    }

    public final void zzb(zzg zzgVar, zzab zzabVar) {
        zzl zzlVar = new zzl(zzabVar);
        for (Integer num : this.zza.keySet()) {
            zzaa clone = zzabVar.zzb().clone();
            int zzc = zzc(zzgVar, (zzao) this.zza.get(num), zzlVar);
            if (zzc == 2 || zzc == -1) {
                zzabVar.zzf(clone);
            }
        }
        for (Integer num2 : this.zzb.keySet()) {
            zzc(zzgVar, (zzao) this.zzb.get(num2), zzlVar);
        }
    }
}
