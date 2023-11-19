package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
final class zzip implements zzim {
    private static final zzim zza = zzio.zza;
    private volatile zzim zzb;
    @CheckForNull
    private Object zzc;

    public zzip(zzim zzimVar) {
        zzimVar.getClass();
        this.zzb = zzimVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == zza) {
            obj = "<supplier that returned " + String.valueOf(this.zzc) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final Object zza() {
        zzim zzimVar = this.zzb;
        zzim zzimVar2 = zza;
        if (zzimVar != zzimVar2) {
            synchronized (this) {
                if (this.zzb != zzimVar2) {
                    Object zza2 = this.zzb.zza();
                    this.zzc = zza2;
                    this.zzb = zzimVar2;
                    return zza2;
                }
            }
        }
        return this.zzc;
    }
}
