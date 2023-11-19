package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zziy extends zzis {
    private final zzja zza;

    public zziy(zzja zzjaVar, int i2) {
        super(zzjaVar.size(), i2);
        this.zza = zzjaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final Object zza(int i2) {
        return this.zza.get(i2);
    }
}
