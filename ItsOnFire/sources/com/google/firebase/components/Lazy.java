package com.google.firebase.components;

import androidx.annotation.VisibleForTesting;
import com.google.firebase.inject.Provider;

/* loaded from: classes.dex */
public class Lazy<T> implements Provider<T> {
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance;
    private volatile Provider<T> provider;

    public Lazy(Provider<T> provider) {
        this.instance = UNINITIALIZED;
        this.provider = provider;
    }

    public Lazy(T t2) {
        this.instance = UNINITIALIZED;
        this.instance = t2;
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
        T t2 = (T) this.instance;
        Object obj = UNINITIALIZED;
        if (t2 == obj) {
            synchronized (this) {
                t2 = this.instance;
                if (t2 == obj) {
                    t2 = this.provider.get();
                    this.instance = t2;
                    this.provider = null;
                }
            }
        }
        return t2;
    }

    @VisibleForTesting
    public boolean isInitialized() {
        return this.instance != UNINITIALIZED;
    }
}
