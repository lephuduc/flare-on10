package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzlz implements zzmg {
    private final zzmg[] zza;

    public zzlz(zzmg... zzmgVarArr) {
        this.zza = zzmgVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    public final zzmf zzb(Class cls) {
        zzmg[] zzmgVarArr = this.zza;
        for (int i2 = 0; i2 < 2; i2++) {
            zzmg zzmgVar = zzmgVarArr[i2];
            if (zzmgVar.zzc(cls)) {
                return zzmgVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    public final boolean zzc(Class cls) {
        zzmg[] zzmgVarArr = this.zza;
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzmgVarArr[i2].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
