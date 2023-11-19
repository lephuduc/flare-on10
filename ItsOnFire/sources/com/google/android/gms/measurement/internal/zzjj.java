package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjj extends zzan {
    public final /* synthetic */ zzjz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjj(zzjz zzjzVar, zzgy zzgyVar) {
        super(zzgyVar);
        this.zza = zzjzVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzan
    public final void zzc() {
        zzjz zzjzVar = this.zza;
        zzjzVar.zzg();
        if (zzjzVar.zzL()) {
            zzjzVar.zzt.zzaA().zzj().zza("Inactivity, disconnecting from the service");
            zzjzVar.zzs();
        }
    }
}
