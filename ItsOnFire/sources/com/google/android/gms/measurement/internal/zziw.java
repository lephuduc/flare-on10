package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zziw implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zziz zzb;

    public zziw(zziz zzizVar, long j2) {
        this.zzb = zzizVar;
        this.zza = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzt.zzd().zzf(this.zza);
        this.zzb.zza = null;
    }
}
