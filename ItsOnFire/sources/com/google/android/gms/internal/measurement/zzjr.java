package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzjr extends zzjt {
    public final /* synthetic */ zzka zza;
    private int zzb = 0;
    private final int zzc;

    public zzjr(zzka zzkaVar) {
        this.zza = zzkaVar;
        this.zzc = zzkaVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzjv
    public final byte zza() {
        int i2 = this.zzb;
        if (i2 < this.zzc) {
            this.zzb = i2 + 1;
            return this.zza.zzb(i2);
        }
        throw new NoSuchElementException();
    }
}
