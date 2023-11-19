package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.internal.SignInClientImpl;

/* loaded from: classes.dex */
final class zaa extends Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ SignInClientImpl buildClient(Context context, Looper looper, ClientSettings clientSettings, SignInOptions signInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new SignInClientImpl(context, looper, true, clientSettings, SignInClientImpl.createBundleFromClientSettings(clientSettings), connectionCallbacks, onConnectionFailedListener);
    }
}
