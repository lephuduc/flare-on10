package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzkh implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzkp zzb;

    public zzkh(zzkp zzkpVar, long j2) {
        this.zzb = zzkpVar;
        this.zza = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp.zzl(this.zzb, this.zza);
    }
}
