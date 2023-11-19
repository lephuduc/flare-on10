package com.google.android.gms.internal.base;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes.dex */
public final class zal {
    public static final int zaa;

    static {
        int i2 = 33554432;
        if (Build.VERSION.SDK_INT < 31) {
            String str = Build.VERSION.CODENAME;
            if (str.length() != 1 || str.charAt(0) < 'S' || str.charAt(0) > 'Z') {
                i2 = 0;
            }
        }
        zaa = i2;
    }

    public static PendingIntent zaa(Context context, int i2, Intent intent, int i3) {
        return PendingIntent.getActivity(context, i2, intent, i3);
    }
}
