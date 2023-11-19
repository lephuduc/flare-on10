package com.google.android.gms.measurement.internal;

import androidx.annotation.GuardedBy;

/* loaded from: classes.dex */
public final class zzef {
    private static final Object zza = new Object();
    private final String zzb;
    private final zzec zzc;
    private final Object zzd;
    private final Object zze;
    private final Object zzf = new Object();
    @GuardedBy("overrideLock")
    private volatile Object zzg = null;
    @GuardedBy("cachingLock")
    private volatile Object zzh = null;

    public /* synthetic */ zzef(String str, Object obj, Object obj2, zzec zzecVar, zzee zzeeVar) {
        this.zzb = str;
        this.zzd = obj;
        this.zze = obj2;
        this.zzc = zzecVar;
    }

    public final Object zza(Object obj) {
        synchronized (this.zzf) {
        }
        if (obj != null) {
            return obj;
        }
        if (zzed.zza == null) {
            return this.zzd;
        }
        synchronized (zza) {
            if (zzab.zza()) {
                return this.zzh == null ? this.zzd : this.zzh;
            }
            try {
                for (zzef zzefVar : zzeg.zzb()) {
                    if (zzab.zza()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    Object obj2 = null;
                    try {
                        zzec zzecVar = zzefVar.zzc;
                        if (zzecVar != null) {
                            obj2 = zzecVar.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (zza) {
                        zzefVar.zzh = obj2;
                    }
                }
            } catch (SecurityException unused2) {
            }
            zzec zzecVar2 = this.zzc;
            if (zzecVar2 == null) {
                return this.zzd;
            }
            try {
                return zzecVar2.zza();
            } catch (IllegalStateException unused3) {
                return this.zzd;
            } catch (SecurityException unused4) {
                return this.zzd;
            }
        }
    }

    public final String zzb() {
        return this.zzb;
    }
}
