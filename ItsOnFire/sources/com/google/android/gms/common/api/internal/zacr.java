package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class zacr implements Runnable {
    public final /* synthetic */ com.google.android.gms.signin.internal.zak zaa;
    public final /* synthetic */ zact zab;

    public zacr(zact zactVar, com.google.android.gms.signin.internal.zak zakVar) {
        this.zab = zactVar;
        this.zaa = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zact.zad(this.zab, this.zaa);
    }
}
