package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzno implements Iterator {
    public final Iterator zza;
    public final /* synthetic */ zznp zzb;

    public zzno(zznp zznpVar) {
        zzlq zzlqVar;
        this.zzb = zznpVar;
        zzlqVar = zznpVar.zza;
        this.zza = zzlqVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
