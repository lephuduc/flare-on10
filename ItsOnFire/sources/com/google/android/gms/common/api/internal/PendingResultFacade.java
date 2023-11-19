package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.TransformedResult;
import java.util.concurrent.TimeUnit;

@KeepForSdk
/* loaded from: classes.dex */
public abstract class PendingResultFacade<A extends Result, B extends Result> extends PendingResult<B> {
    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(@NonNull PendingResult.StatusListener statusListener) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @NonNull
    public final B await() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @NonNull
    public final B await(long j2, @NonNull TimeUnit timeUnit) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void cancel() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(@NonNull ResultCallback<? super B> resultCallback) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(@NonNull ResultCallback<? super B> resultCallback, long j2, @NonNull TimeUnit timeUnit) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @NonNull
    public final <S extends Result> TransformedResult<S> then(@NonNull ResultTransform<? super B, ? extends S> resultTransform) {
        throw null;
    }
}
