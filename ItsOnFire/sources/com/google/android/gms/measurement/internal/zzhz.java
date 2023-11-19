package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import j.y0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhz implements zzlo {
    public final /* synthetic */ zzik zza;

    public zzhz(zzik zzikVar) {
        this.zza = zzikVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlo
    public final void zza(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        zzik zzikVar = this.zza;
        if (isEmpty) {
            zzikVar.zzD(y0.f581c, "_err", bundle);
        } else {
            zzikVar.zzF(y0.f581c, "_err", bundle, str);
        }
    }
}
