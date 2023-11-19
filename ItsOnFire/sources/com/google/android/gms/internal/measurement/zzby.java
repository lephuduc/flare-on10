package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class zzby extends Handler {
    private final Looper zza;

    public zzby() {
        this.zza = Looper.getMainLooper();
    }

    public zzby(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }
}
