package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
final class zad implements zah {
    public final /* synthetic */ FrameLayout zaa;
    public final /* synthetic */ LayoutInflater zab;
    public final /* synthetic */ ViewGroup zac;
    public final /* synthetic */ Bundle zad;
    public final /* synthetic */ DeferredLifecycleHelper zae;

    public zad(DeferredLifecycleHelper deferredLifecycleHelper, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.zae = deferredLifecycleHelper;
        this.zaa = frameLayout;
        this.zab = layoutInflater;
        this.zac = viewGroup;
        this.zad = bundle;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 2;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate lifecycleDelegate2;
        this.zaa.removeAllViews();
        FrameLayout frameLayout = this.zaa;
        lifecycleDelegate2 = this.zae.zaa;
        frameLayout.addView(lifecycleDelegate2.onCreateView(this.zab, this.zac, this.zad));
    }
}
