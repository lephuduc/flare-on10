package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zznc implements Iterator {
    public final /* synthetic */ zzng zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zznc(zzng zzngVar, zznb zznbVar) {
        this.zza = zzngVar;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i2 = this.zzb + 1;
        list = this.zza.zzb;
        if (i2 >= list.size()) {
            map = this.zza.zzc;
            return !map.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        Object next;
        List list2;
        this.zzc = true;
        int i2 = this.zzb + 1;
        this.zzb = i2;
        list = this.zza.zzb;
        if (i2 < list.size()) {
            list2 = this.zza.zzb;
            next = list2.get(this.zzb);
        } else {
            next = zza().next();
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzn();
        int i2 = this.zzb;
        list = this.zza.zzb;
        if (i2 >= list.size()) {
            zza().remove();
            return;
        }
        zzng zzngVar = this.zza;
        int i3 = this.zzb;
        this.zzb = i3 - 1;
        zzngVar.zzl(i3);
    }
}
