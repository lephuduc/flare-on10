package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;

/* loaded from: classes.dex */
public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {
    private static final InstanceFactory<Object> NULL_INSTANCE_FACTORY = new InstanceFactory<>(null);
    private final T instance;

    private InstanceFactory(T t2) {
        this.instance = t2;
    }

    public static <T> Factory<T> create(T t2) {
        return new InstanceFactory(Preconditions.checkNotNull(t2, "instance cannot be null"));
    }

    public static <T> Factory<T> createNullable(T t2) {
        return t2 == null ? nullInstanceFactory() : new InstanceFactory(t2);
    }

    private static <T> InstanceFactory<T> nullInstanceFactory() {
        return (InstanceFactory<T>) NULL_INSTANCE_FACTORY;
    }

    @Override // h.c
    public T get() {
        return this.instance;
    }
}
