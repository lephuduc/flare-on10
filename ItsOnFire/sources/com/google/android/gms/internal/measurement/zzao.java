package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzao extends zzai implements zzal {
    public final List zza;
    public final List zzb;
    public zzg zzc;

    private zzao(zzao zzaoVar) {
        super(zzaoVar.zzd);
        ArrayList arrayList = new ArrayList(zzaoVar.zza.size());
        this.zza = arrayList;
        arrayList.addAll(zzaoVar.zza);
        ArrayList arrayList2 = new ArrayList(zzaoVar.zzb.size());
        this.zzb = arrayList2;
        arrayList2.addAll(zzaoVar.zzb);
        this.zzc = zzaoVar.zzc;
    }

    public zzao(String str, List list, List list2, zzg zzgVar) {
        super(str);
        this.zza = new ArrayList();
        this.zzc = zzgVar;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zza.add(((zzap) it.next()).zzi());
            }
        }
        this.zzb = new ArrayList(list2);
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        String str;
        zzap zzapVar;
        zzg zza = this.zzc.zza();
        for (int i2 = 0; i2 < this.zza.size(); i2++) {
            if (i2 < list.size()) {
                str = (String) this.zza.get(i2);
                zzapVar = zzgVar.zzb((zzap) list.get(i2));
            } else {
                str = (String) this.zza.get(i2);
                zzapVar = zzap.zzf;
            }
            zza.zze(str, zzapVar);
        }
        for (zzap zzapVar2 : this.zzb) {
            zzap zzb = zza.zzb(zzapVar2);
            if (zzb instanceof zzaq) {
                zzb = zza.zzb(zzapVar2);
            }
            if (zzb instanceof zzag) {
                return ((zzag) zzb).zzb();
            }
        }
        return zzap.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzai, com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzao(this);
    }
}
