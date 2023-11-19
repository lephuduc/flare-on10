package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzas implements Iterator {
    public final /* synthetic */ zzat zza;
    private int zzb = 0;

    public zzas(zzat zzatVar) {
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
        String str2;
        int i2 = this.zzb;
        zzat zzatVar = this.zza;
        str = zzatVar.zza;
        if (i2 < str.length()) {
            str2 = zzatVar.zza;
            this.zzb = i2 + 1;
            return new zzat(String.valueOf(str2.charAt(i2)));
        }
        throw new NoSuchElementException();
    }
}
