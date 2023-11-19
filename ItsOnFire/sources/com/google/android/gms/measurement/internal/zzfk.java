package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.MainThread;

/* loaded from: classes.dex */
public final class zzfk implements ServiceConnection {
    public final /* synthetic */ zzfl zza;
    private final String zzb;

    public zzfk(zzfl zzflVar, String str) {
        this.zza = zzflVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.zza.zza.zzaA().zzk().zza("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzbr zzb = com.google.android.gms.internal.measurement.zzbq.zzb(iBinder);
            if (zzb == null) {
                this.zza.zza.zzaA().zzk().zza("Install Referrer Service implementation was not found");
                return;
            }
            this.zza.zza.zzaA().zzj().zza("Install Referrer Service connected");
            this.zza.zza.zzaB().zzp(new zzfj(this, zzb, this));
        } catch (RuntimeException e2) {
            this.zza.zza.zzaA().zzk().zzb("Exception occurred while calling Install Referrer API", e2);
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zza.zzaA().zzj().zza("Install Referrer Service disconnected");
    }
}
