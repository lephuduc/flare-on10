package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzlu extends zzlw {
    private zzlu() {
        super(null);
    }

    public /* synthetic */ zzlu(zzlt zzltVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zza(Object obj, long j2) {
        ((zzli) zznu.zzf(obj, j2)).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    public final void zzb(Object obj, Object obj2, long j2) {
        zzli zzliVar = (zzli) zznu.zzf(obj, j2);
        zzli zzliVar2 = (zzli) zznu.zzf(obj2, j2);
        int size = zzliVar.size();
        int size2 = zzliVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzliVar.zzc()) {
                zzliVar = zzliVar.zzd(size2 + size);
            }
            zzliVar.addAll(zzliVar2);
        }
        if (size > 0) {
            zzliVar2 = zzliVar;
        }
        zznu.zzs(obj, j2, zzliVar2);
    }
}
