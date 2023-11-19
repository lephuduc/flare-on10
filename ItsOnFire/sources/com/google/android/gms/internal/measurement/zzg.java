package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzg {
    public final zzg zza;
    public final zzax zzb;
    public final Map zzc = new HashMap();
    public final Map zzd = new HashMap();

    public zzg(zzg zzgVar, zzax zzaxVar) {
        this.zza = zzgVar;
        this.zzb = zzaxVar;
    }

    public final zzg zza() {
        return new zzg(this, this.zzb);
    }

    public final zzap zzb(zzap zzapVar) {
        return this.zzb.zza(this, zzapVar);
    }

    public final zzap zzc(zzae zzaeVar) {
        zzap zzapVar = zzap.zzf;
        Iterator zzk = zzaeVar.zzk();
        while (zzk.hasNext()) {
            zzapVar = this.zzb.zza(this, zzaeVar.zze(((Integer) zzk.next()).intValue()));
            if (zzapVar instanceof zzag) {
                break;
            }
        }
        return zzapVar;
    }

    public final zzap zzd(String str) {
        if (this.zzc.containsKey(str)) {
            return (zzap) this.zzc.get(str);
        }
        zzg zzgVar = this.zza;
        if (zzgVar != null) {
            return zzgVar.zzd(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    public final void zze(String str, zzap zzapVar) {
        if (this.zzd.containsKey(str)) {
            return;
        }
        Map map = this.zzc;
        if (zzapVar == null) {
            map.remove(str);
        } else {
            map.put(str, zzapVar);
        }
    }

    public final void zzf(String str, zzap zzapVar) {
        zze(str, zzapVar);
        this.zzd.put(str, Boolean.TRUE);
    }

    public final void zzg(String str, zzap zzapVar) {
        zzg zzgVar;
        if (!this.zzc.containsKey(str) && (zzgVar = this.zza) != null && zzgVar.zzh(str)) {
            this.zza.zzg(str, zzapVar);
        } else if (this.zzd.containsKey(str)) {
        } else {
            Map map = this.zzc;
            if (zzapVar == null) {
                map.remove(str);
            } else {
                map.put(str, zzapVar);
            }
        }
    }

    public final boolean zzh(String str) {
        if (this.zzc.containsKey(str)) {
            return true;
        }
        zzg zzgVar = this.zza;
        if (zzgVar != null) {
            return zzgVar.zzh(str);
        }
        return false;
    }
}
