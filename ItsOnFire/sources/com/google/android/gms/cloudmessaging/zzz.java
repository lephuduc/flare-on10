package com.google.android.gms.cloudmessaging;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class zzz implements Executor {
    public static final /* synthetic */ zzz zza = new zzz();

    private /* synthetic */ zzz() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
