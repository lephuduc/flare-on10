package com.google.android.datatransport.runtime.dagger.internal;

import h.c;

/* loaded from: classes.dex */
public final class SingleCheck<T> implements c<T> {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile c<T> provider;

    private SingleCheck(c<T> cVar) {
        this.provider = cVar;
    }

    public static <P extends c<T>, T> c<T> provider(P p2) {
        return ((p2 instanceof SingleCheck) || (p2 instanceof DoubleCheck)) ? p2 : new SingleCheck((c) Preconditions.checkNotNull(p2));
    }

    @Override // h.c
    public T get() {
        T t2 = (T) this.instance;
        if (t2 == UNINITIALIZED) {
            c<T> cVar = this.provider;
            if (cVar == null) {
                return (T) this.instance;
            }
            T t3 = cVar.get();
            this.instance = t3;
            this.provider = null;
            return t3;
        }
        return t2;
    }
}
