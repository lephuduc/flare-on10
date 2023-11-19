package com.google.android.gms.internal.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes.dex */
public final class zza {
    public static final int zza;

    static {
        int i2 = 33554432;
        if (Build.VERSION.SDK_INT < 31) {
            String str = Build.VERSION.CODENAME;
            if (str.length() != 1 || str.charAt(0) < 'S' || str.charAt(0) > 'Z') {
                i2 = 0;
            }
        }
        zza = i2;
    }

    public static PendingIntent zza(Context context, int i2, Intent intent, int i3) {
        return PendingIntent.getBroadcast(context, 0, intent, i3);
    }
}
