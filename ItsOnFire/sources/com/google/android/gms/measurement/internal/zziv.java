package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zziv implements Runnable {
    public final /* synthetic */ zziz zza;

    public zziv(zziz zzizVar) {
        this.zza = zzizVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzir zzirVar;
        zziz zzizVar = this.zza;
        zzirVar = zzizVar.zzh;
        zzizVar.zza = zzirVar;
    }
}
