package com.google.firebase.messaging;

import android.content.Intent;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FcmLifecycleCallbacks f318j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Intent f319k;

    public /* synthetic */ f(FcmLifecycleCallbacks fcmLifecycleCallbacks, Intent intent) {
        this.f318j = fcmLifecycleCallbacks;
        this.f319k = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f318j.lambda$onActivityCreated$0(this.f319k);
    }
}
