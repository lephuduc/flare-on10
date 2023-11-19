package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkx implements Runnable {
    public final /* synthetic */ zzli zza;
    public final /* synthetic */ zzlh zzb;

    public zzkx(zzlh zzlhVar, zzli zzliVar) {
        this.zzb = zzlhVar;
        this.zza = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlh.zzy(this.zzb, this.zza);
        this.zzb.zzS();
    }
}
