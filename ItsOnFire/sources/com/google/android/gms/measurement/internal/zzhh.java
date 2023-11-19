package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhh implements zzen {
    public final /* synthetic */ zzgd zza;

    public zzhh(zzhi zzhiVar, zzgd zzgdVar) {
        this.zza = zzgdVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzen
    public final boolean zza() {
        return this.zza.zzL() && Log.isLoggable(this.zza.zzaA().zzr(), 3);
    }
}
