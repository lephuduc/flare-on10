package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* loaded from: classes.dex */
final class zzdw extends zzch {
    private final com.google.android.gms.measurement.internal.zzhg zza;

    public zzdw(com.google.android.gms.measurement.internal.zzhg zzhgVar) {
        this.zza = zzhgVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j2) {
        this.zza.onEvent(str, str2, bundle, j2);
    }
}
