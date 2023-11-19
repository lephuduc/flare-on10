package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* loaded from: classes.dex */
final class zza implements Runnable {
    private final Runnable zza;

    public zza(Runnable runnable, int i2) {
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.zza.run();
    }
}
