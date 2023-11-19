package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zak;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
final class zac implements Runnable {
    public final /* synthetic */ ImageManager zaa;
    private final Uri zab;
    @Nullable
    private final Bitmap zac;
    private final CountDownLatch zad;

    public zac(ImageManager imageManager, @Nullable Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
        this.zaa = imageManager;
        this.zab = uri;
        this.zac = bitmap;
        this.zad = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        Object obj;
        HashSet hashSet;
        ArrayList arrayList;
        Map map2;
        zak zakVar;
        Map map3;
        Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
        Bitmap bitmap = this.zac;
        map = this.zaa.zai;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) map.remove(this.zab);
        if (imageReceiver != null) {
            arrayList = imageReceiver.zac;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                zag zagVar = (zag) arrayList.get(i2);
                Bitmap bitmap2 = this.zac;
                if (bitmap2 == null || bitmap == null) {
                    map2 = this.zaa.zaj;
                    map2.put(this.zab, Long.valueOf(SystemClock.elapsedRealtime()));
                    ImageManager imageManager = this.zaa;
                    Context context = imageManager.zad;
                    zakVar = imageManager.zag;
                    zagVar.zab(context, zakVar, false);
                } else {
                    zagVar.zac(this.zaa.zad, bitmap2, false);
                }
                if (!(zagVar instanceof zaf)) {
                    map3 = this.zaa.zah;
                    map3.remove(zagVar);
                }
            }
        }
        this.zad.countDown();
        obj = ImageManager.zaa;
        synchronized (obj) {
            hashSet = ImageManager.zab;
            hashSet.remove(this.zab);
        }
    }
}
