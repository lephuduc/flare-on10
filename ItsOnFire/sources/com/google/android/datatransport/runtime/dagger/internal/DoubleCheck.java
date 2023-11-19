package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import h.c;

/* loaded from: classes.dex */
public final class DoubleCheck<T> implements c<T>, Lazy<T> {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile c<T> provider;

    private DoubleCheck(c<T> cVar) {
        this.provider = cVar;
    }

    public static <P extends c<T>, T> Lazy<T> lazy(P p2) {
        return p2 instanceof Lazy ? (Lazy) p2 : new DoubleCheck((c) Preconditions.checkNotNull(p2));
    }

    public static <P extends c<T>, T> c<T> provider(P p2) {
        Preconditions.checkNotNull(p2);
        return p2 instanceof DoubleCheck ? p2 : new DoubleCheck(p2);
    }

    public static Object reentrantCheck(Object obj, Object obj2) {
        if (!((obj == UNINITIALIZED || (obj instanceof MemoizedSentinel)) ? false : true) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // h.c
    public T get() {
        T t2 = (T) this.instance;
        Object obj = UNINITIALIZED;
        if (t2 == obj) {
            synchronized (this) {
                t2 = this.instance;
                if (t2 == obj) {
                    t2 = this.provider.get();
                    this.instance = reentrantCheck(this.instance, t2);
                    this.provider = null;
                }
            }
        }
        return t2;
    }
}
