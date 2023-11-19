package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzix implements Runnable {
    public final /* synthetic */ zzir zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zziz zzc;

    public zzix(zziz zzizVar, zzir zzirVar, long j2) {
        this.zzc = zzizVar;
        this.zza = zzirVar;
        this.zzb = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzB(this.zza, false, this.zzb);
        zziz zzizVar = this.zzc;
        zzizVar.zza = null;
        zzizVar.zzt.zzt().zzG(null);
    }
}
