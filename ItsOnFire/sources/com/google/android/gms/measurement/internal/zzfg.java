package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzfg {
    public final String zza;
    public final /* synthetic */ zzfi zzb;
    private final String zzc;
    private final String zzd;
    private final long zze;

    public /* synthetic */ zzfg(zzfi zzfiVar, String str, long j2, zzff zzffVar) {
        this.zzb = zzfiVar;
        Preconditions.checkNotEmpty("health_monitor");
        Preconditions.checkArgument(j2 > 0);
        this.zza = "health_monitor:start";
        this.zzc = "health_monitor:count";
        this.zzd = "health_monitor:value";
        this.zze = j2;
    }

    @WorkerThread
    private final long zzc() {
        return this.zzb.zza().getLong(this.zza, 0L);
    }

    @WorkerThread
    private final void zzd() {
        this.zzb.zzg();
        long currentTimeMillis = this.zzb.zzt.zzax().currentTimeMillis();
        SharedPreferences.Editor edit = this.zzb.zza().edit();
        edit.remove(this.zzc);
        edit.remove(this.zzd);
        edit.putLong(this.zza, currentTimeMillis);
        edit.apply();
    }

    @WorkerThread
    public final Pair zza() {
        long abs;
        this.zzb.zzg();
        this.zzb.zzg();
        long zzc = zzc();
        if (zzc == 0) {
            zzd();
            abs = 0;
        } else {
            abs = Math.abs(zzc - this.zzb.zzt.zzax().currentTimeMillis());
        }
        long j2 = this.zze;
        if (abs < j2) {
            return null;
        }
        if (abs > j2 + j2) {
            zzd();
            return null;
        }
        String string = this.zzb.zza().getString(this.zzd, null);
        long j3 = this.zzb.zza().getLong(this.zzc, 0L);
        zzd();
        return (string == null || j3 <= 0) ? zzfi.zza : new Pair(string, Long.valueOf(j3));
    }

    @WorkerThread
    public final void zzb(String str, long j2) {
        this.zzb.zzg();
        if (zzc() == 0) {
            zzd();
        }
        if (str == null) {
            str = "";
        }
        long j3 = this.zzb.zza().getLong(this.zzc, 0L);
        if (j3 <= 0) {
            SharedPreferences.Editor edit = this.zzb.zza().edit();
            edit.putString(this.zzd, str);
            edit.putLong(this.zzc, 1L);
            edit.apply();
            return;
        }
        long j4 = j3 + 1;
        SharedPreferences.Editor edit2 = this.zzb.zza().edit();
        if ((this.zzb.zzt.zzv().zzG().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j4) {
            edit2.putString(this.zzd, str);
        }
        edit2.putLong(this.zzc, j4);
        edit2.apply();
    }
}
