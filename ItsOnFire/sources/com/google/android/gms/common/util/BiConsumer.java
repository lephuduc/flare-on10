package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes.dex */
public interface BiConsumer<T, U> {
    @KeepForSdk
    void accept(@NonNull T t2, @NonNull U u2);
}
