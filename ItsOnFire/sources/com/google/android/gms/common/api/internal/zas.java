package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class zas {
    public final /* synthetic */ BasePendingResult zaa;

    public /* synthetic */ zas(BasePendingResult basePendingResult, zar zarVar) {
        this.zaa = basePendingResult;
    }

    public final void finalize() throws Throwable {
        BasePendingResult.zal(BasePendingResult.zaj(this.zaa));
        super.finalize();
    }
}
