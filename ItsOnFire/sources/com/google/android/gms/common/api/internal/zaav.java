package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
abstract class zaav implements Runnable {
    public final /* synthetic */ zaaw zab;

    @Override // java.lang.Runnable
    @WorkerThread
    public final void run() {
        Lock lock;
        Lock lock2;
        zabi zabiVar;
        lock = this.zab.zab;
        lock.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    zaa();
                }
            } catch (RuntimeException e2) {
                zabiVar = this.zab.zaa;
                zabiVar.zam(e2);
            }
        } finally {
            lock2 = this.zab.zab;
            lock2.unlock();
        }
    }

    @WorkerThread
    public abstract void zaa();
}
