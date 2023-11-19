package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import j.y0;

/* loaded from: classes.dex */
final class zzlb implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb = "_err";
    public final /* synthetic */ Bundle zzc;
    public final /* synthetic */ zzlc zzd;

    public zzlb(zzlc zzlcVar, String str, String str2, Bundle bundle) {
        this.zzd = zzlcVar;
        this.zza = str;
        this.zzc = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zza.zzF((zzau) Preconditions.checkNotNull(this.zzd.zza.zzv().zzz(this.zza, this.zzb, this.zzc, y0.f581c, this.zzd.zza.zzax().currentTimeMillis(), false, true)), this.zza);
    }
}
