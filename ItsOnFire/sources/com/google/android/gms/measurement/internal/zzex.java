package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

@WorkerThread
/* loaded from: classes.dex */
final class zzex implements Runnable {
    private final zzev zza;
    private final int zzb;
    private final Throwable zzc;
    private final byte[] zzd;
    private final String zze;
    private final Map zzf;

    public /* synthetic */ zzex(String str, zzev zzevVar, int i2, Throwable th, byte[] bArr, Map map, zzew zzewVar) {
        Preconditions.checkNotNull(zzevVar);
        this.zza = zzevVar;
        this.zzb = i2;
        this.zzc = th;
        this.zzd = bArr;
        this.zze = str;
        this.zzf = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zze, this.zzb, this.zzc, this.zzd, this.zzf);
    }
}
