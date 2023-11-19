package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzjx implements Runnable {
    public final /* synthetic */ zzjy zza;

    public zzjx(zzjy zzjyVar) {
        this.zza = zzjyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza.zzb = null;
        this.zza.zza.zzP();
    }
}
