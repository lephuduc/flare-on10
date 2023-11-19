package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public interface zam {
    ExecutorService zaa(ThreadFactory threadFactory, int i2);

    ExecutorService zab(int i2, int i3);

    ExecutorService zac(int i2, ThreadFactory threadFactory, int i3);
}
