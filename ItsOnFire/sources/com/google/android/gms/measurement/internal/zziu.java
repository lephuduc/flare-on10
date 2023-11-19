package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zziu implements Runnable {
    public final /* synthetic */ zzir zza;
    public final /* synthetic */ zzir zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ zziz zze;

    public zziu(zziz zzizVar, zzir zzirVar, zzir zzirVar2, long j2, boolean z) {
        this.zze = zzizVar;
        this.zza = zzirVar;
        this.zzb = zzirVar2;
        this.zzc = j2;
        this.zzd = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzA(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
