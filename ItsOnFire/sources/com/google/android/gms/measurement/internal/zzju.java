package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes.dex */
final class zzju implements Runnable {
    public final /* synthetic */ ComponentName zza;
    public final /* synthetic */ zzjy zzb;

    public zzju(zzjy zzjyVar, ComponentName componentName) {
        this.zzb = zzjyVar;
        this.zza = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz.zzo(this.zzb.zza, this.zza);
    }
}
