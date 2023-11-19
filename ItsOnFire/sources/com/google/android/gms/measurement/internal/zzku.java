package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzku extends zzkt {
    private boolean zza;

    public zzku(zzlh zzlhVar) {
        super(zzlhVar);
        this.zzf.zzM();
    }

    public final void zzW() {
        if (!zzY()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzX() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzb();
        this.zzf.zzH();
        this.zza = true;
    }

    public final boolean zzY() {
        return this.zza;
    }

    public abstract boolean zzb();
}
