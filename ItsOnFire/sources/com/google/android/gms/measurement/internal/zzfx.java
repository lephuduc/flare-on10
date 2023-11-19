package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfx implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ zzga zza;
    private final String zzb;

    public zzfx(zzga zzgaVar, String str) {
        this.zza = zzgaVar;
        Preconditions.checkNotNull(str);
        this.zzb = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.zza.zzt.zzaA().zzd().zzb(this.zzb, th);
    }
}
