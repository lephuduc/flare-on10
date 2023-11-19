package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import h.c;

/* loaded from: classes.dex */
public final class MetadataBackendRegistry_Factory implements Factory<MetadataBackendRegistry> {
    private final c<Context> applicationContextProvider;
    private final c<CreationContextFactory> creationContextFactoryProvider;

    public MetadataBackendRegistry_Factory(c<Context> cVar, c<CreationContextFactory> cVar2) {
        this.applicationContextProvider = cVar;
        this.creationContextFactoryProvider = cVar2;
    }

    public static MetadataBackendRegistry_Factory create(c<Context> cVar, c<CreationContextFactory> cVar2) {
        return new MetadataBackendRegistry_Factory(cVar, cVar2);
    }

    public static MetadataBackendRegistry newInstance(Context context, Object obj) {
        return new MetadataBackendRegistry(context, (CreationContextFactory) obj);
    }

    @Override // h.c
    public MetadataBackendRegistry get() {
        return newInstance(this.applicationContextProvider.get(), this.creationContextFactoryProvider.get());
    }
}
