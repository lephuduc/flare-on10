package com.google.android.datatransport.runtime.dagger.internal;

import h.c;

/* loaded from: classes.dex */
public final class DelegateFactory<T> implements Factory<T> {
    private c<T> delegate;

    public static <T> void setDelegate(c<T> cVar, c<T> cVar2) {
        Preconditions.checkNotNull(cVar2);
        DelegateFactory delegateFactory = (DelegateFactory) cVar;
        if (delegateFactory.delegate != null) {
            throw new IllegalStateException();
        }
        delegateFactory.delegate = cVar2;
    }

    @Override // h.c
    public T get() {
        c<T> cVar = this.delegate;
        if (cVar != null) {
            return cVar.get();
        }
        throw new IllegalStateException();
    }

    public c<T> getDelegate() {
        return (c) Preconditions.checkNotNull(this.delegate);
    }

    @Deprecated
    public void setDelegatedProvider(c<T> cVar) {
        setDelegate(this, cVar);
    }
}
