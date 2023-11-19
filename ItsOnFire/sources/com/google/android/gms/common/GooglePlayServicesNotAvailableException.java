package com.google.android.gms.common;

/* loaded from: classes.dex */
public final class GooglePlayServicesNotAvailableException extends Exception {
    public final int errorCode;

    public GooglePlayServicesNotAvailableException(int i2) {
        this.errorCode = i2;
    }
}
