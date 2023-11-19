package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfs extends zzkx implements zzmj {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private zzfs() {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.zzft r0 = com.google.android.gms.internal.measurement.zzft.zzf()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfs.<init>():void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ zzfs(com.google.android.gms.internal.measurement.zzfk r1) {
        /*
            r0 = this;
            com.google.android.gms.internal.measurement.zzft r1 = com.google.android.gms.internal.measurement.zzft.zzf()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfs.<init>(com.google.android.gms.internal.measurement.zzfk):void");
    }

    public final int zza() {
        return ((zzft) this.zza).zzb();
    }

    public final long zzb() {
        return ((zzft) this.zza).zzc();
    }

    public final long zzc() {
        return ((zzft) this.zza).zzd();
    }

    public final zzfs zzd(Iterable iterable) {
        zzaH();
        zzft.zzm((zzft) this.zza, iterable);
        return this;
    }

    public final zzfs zze(zzfw zzfwVar) {
        zzaH();
        zzft.zzk((zzft) this.zza, (zzfx) zzfwVar.zzaD());
        return this;
    }

    public final zzfs zzf(zzfx zzfxVar) {
        zzaH();
        zzft.zzk((zzft) this.zza, zzfxVar);
        return this;
    }

    public final zzfs zzg() {
        zzaH();
        ((zzft) this.zza).zze = zzlb.zzbH();
        return this;
    }

    public final zzfs zzh(int i2) {
        zzaH();
        zzft.zzo((zzft) this.zza, i2);
        return this;
    }

    public final zzfs zzi(String str) {
        zzaH();
        zzft.zzp((zzft) this.zza, str);
        return this;
    }

    public final zzfs zzj(int i2, zzfw zzfwVar) {
        zzaH();
        zzft.zzj((zzft) this.zza, i2, (zzfx) zzfwVar.zzaD());
        return this;
    }

    public final zzfs zzk(int i2, zzfx zzfxVar) {
        zzaH();
        zzft.zzj((zzft) this.zza, i2, zzfxVar);
        return this;
    }

    public final zzfs zzl(long j2) {
        zzaH();
        zzft.zzr((zzft) this.zza, j2);
        return this;
    }

    public final zzfs zzm(long j2) {
        zzaH();
        zzft.zzq((zzft) this.zza, j2);
        return this;
    }

    public final zzfx zzn(int i2) {
        return ((zzft) this.zza).zzg(i2);
    }

    public final String zzo() {
        return ((zzft) this.zza).zzh();
    }

    public final List zzp() {
        return Collections.unmodifiableList(((zzft) this.zza).zzi());
    }

    public final boolean zzq() {
        return ((zzft) this.zza).zzu();
    }
}
