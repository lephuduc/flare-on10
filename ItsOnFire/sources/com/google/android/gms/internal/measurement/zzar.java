package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzar implements Iterator {
    public final /* synthetic */ zzat zza;
    private int zzb = 0;

    public zzar(zzat zzatVar) {
        this.zza = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i2 = this.zzb;
        str = this.zza.zza;
        return i2 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        int i2 = this.zzb;
        str = this.zza.zza;
        if (i2 < str.length()) {
            this.zzb = i2 + 1;
            return new zzat(String.valueOf(i2));
        }
        throw new NoSuchElementException();
    }
}
