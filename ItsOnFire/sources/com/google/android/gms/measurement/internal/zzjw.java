package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
final class zzjw implements Runnable {
    public final /* synthetic */ zzjy zza;

    public zzjw(zzjy zzjyVar) {
        this.zza = zzjyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz zzjzVar = this.zza.zza;
        Context zzaw = zzjzVar.zzt.zzaw();
        this.zza.zza.zzt.zzay();
        zzjz.zzo(zzjzVar, new ComponentName(zzaw, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
