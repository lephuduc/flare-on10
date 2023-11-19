package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcs extends zzdu {
    public final /* synthetic */ Boolean zza;
    public final /* synthetic */ zzef zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcs(zzef zzefVar, Boolean bool) {
        super(zzefVar, true);
        this.zzb = zzefVar;
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() throws RemoteException {
        zzcc zzccVar;
        zzcc zzccVar2;
        if (this.zza != null) {
            zzccVar2 = this.zzb.zzj;
            ((zzcc) Preconditions.checkNotNull(zzccVar2)).setMeasurementEnabled(this.zza.booleanValue(), this.zzh);
            return;
        }
        zzccVar = this.zzb.zzj;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).clearMeasurementEnabled(this.zzh);
    }
}
