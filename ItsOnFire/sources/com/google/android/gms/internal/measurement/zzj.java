package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzj {
    public final Map zza = new HashMap();

    public final void zza(String str, Callable callable) {
        this.zza.put(str, callable);
    }
}
