package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzfa implements Runnable {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ zzfb zzb;

    public zzfa(zzfb zzfbVar, boolean z) {
        this.zzb = zzfbVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlh zzlhVar;
        zzlhVar = this.zzb.zzb;
        zzlhVar.zzJ(this.zza);
    }
}
