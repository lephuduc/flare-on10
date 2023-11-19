package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import h.c;

/* loaded from: classes.dex */
public final class ProviderOfLazy<T> implements c<Lazy<T>> {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private final c<T> provider;

    private ProviderOfLazy(c<T> cVar) {
        this.provider = cVar;
    }

    public static <T> c<Lazy<T>> create(c<T> cVar) {
        return new ProviderOfLazy((c) Preconditions.checkNotNull(cVar));
    }

    @Override // h.c
    public Lazy<T> get() {
        return DoubleCheck.lazy(this.provider);
    }
}
