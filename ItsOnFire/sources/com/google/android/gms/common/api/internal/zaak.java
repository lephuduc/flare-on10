package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zaak implements Runnable {
    public final /* synthetic */ zaaw zaa;

    public zaak(zaaw zaawVar) {
        this.zaa = zaawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GoogleApiAvailabilityLight googleApiAvailabilityLight;
        Context context;
        zaaw zaawVar = this.zaa;
        googleApiAvailabilityLight = zaawVar.zad;
        context = zaawVar.zac;
        googleApiAvailabilityLight.cancelAvailabilityErrorNotifications(context);
    }
}
