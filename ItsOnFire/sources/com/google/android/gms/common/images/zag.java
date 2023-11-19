package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zak;

/* loaded from: classes.dex */
public abstract class zag {
    public final zad zaa;
    public int zab;

    public zag(Uri uri, int i2) {
        this.zab = 0;
        this.zaa = new zad(uri);
        this.zab = i2;
    }

    public abstract void zaa(@Nullable Drawable drawable, boolean z, boolean z2, boolean z3);

    public final void zab(Context context, zak zakVar, boolean z) {
        int i2 = this.zab;
        zaa(i2 != 0 ? context.getResources().getDrawable(i2) : null, z, false, false);
    }

    public final void zac(Context context, Bitmap bitmap, boolean z) {
        Asserts.checkNotNull(bitmap);
        zaa(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
