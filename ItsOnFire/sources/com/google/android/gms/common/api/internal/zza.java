package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class zza implements Runnable {
    public final /* synthetic */ LifecycleCallback zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzb zzc;

    public zza(zzb zzbVar, LifecycleCallback lifecycleCallback, String str) {
        this.zzc = zzbVar;
        this.zza = lifecycleCallback;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        zzb zzbVar = this.zzc;
        i2 = zzbVar.zzc;
        if (i2 > 0) {
            LifecycleCallback lifecycleCallback = this.zza;
            bundle = zzbVar.zzd;
            if (bundle != null) {
                bundle3 = zzbVar.zzd;
                bundle2 = bundle3.getBundle(this.zzb);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i3 = this.zzc.zzc;
        if (i3 >= 2) {
            this.zza.onStart();
        }
        i4 = this.zzc.zzc;
        if (i4 >= 3) {
            this.zza.onResume();
        }
        i5 = this.zzc.zzc;
        if (i5 >= 4) {
            this.zza.onStop();
        }
        i6 = this.zzc.zzc;
        if (i6 >= 5) {
            this.zza.onDestroy();
        }
    }
}
