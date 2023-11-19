package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzit implements Runnable {
    public final /* synthetic */ Bundle zza;
    public final /* synthetic */ zzir zzb;
    public final /* synthetic */ zzir zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ zziz zze;

    public zzit(zziz zzizVar, Bundle bundle, zzir zzirVar, zzir zzirVar2, long j2) {
        this.zze = zzizVar;
        this.zza = bundle;
        this.zzb = zzirVar;
        this.zzc = zzirVar2;
        this.zzd = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zziz.zzp(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
