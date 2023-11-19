package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzgs implements Callable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzgv zzb;

    public zzgs(zzgv zzgvVar, String str) {
        this.zzb = zzgvVar;
        this.zza = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzlh zzlhVar;
        zzlh zzlhVar2;
        zzlhVar = this.zzb.zza;
        zzlhVar.zzA();
        zzlhVar2 = this.zzb.zza;
        return zzlhVar2.zzh().zzu(this.zza);
    }
}
