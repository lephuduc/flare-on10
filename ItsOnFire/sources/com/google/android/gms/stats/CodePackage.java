package com.google.android.gms.stats;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@ShowFirstParty
@KeepForSdk
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface CodePackage {
    @NonNull
    @KeepForSdk
    public static final String COMMON = "COMMON";
    @NonNull
    @KeepForSdk
    public static final String DRIVE = "DRIVE";
    @NonNull
    @KeepForSdk
    public static final String FITNESS = "FITNESS";
    @NonNull
    @KeepForSdk
    public static final String GCM = "GCM";
    @NonNull
    @KeepForSdk
    public static final String ICING = "ICING";
    @NonNull
    @KeepForSdk
    public static final String LOCATION = "LOCATION";
    @NonNull
    @KeepForSdk
    public static final String LOCATION_SHARING = "LOCATION_SHARING";
    @NonNull
    @KeepForSdk
    public static final String OTA = "OTA";
    @NonNull
    @KeepForSdk
    public static final String REMINDERS = "REMINDERS";
    @NonNull
    @KeepForSdk
    public static final String SECURITY = "SECURITY";
}
