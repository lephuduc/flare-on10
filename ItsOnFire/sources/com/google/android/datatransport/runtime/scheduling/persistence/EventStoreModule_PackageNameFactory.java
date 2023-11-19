package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

/* loaded from: classes.dex */
public final class EventStoreModule_PackageNameFactory implements Factory<String> {
    private final h.c<Context> contextProvider;

    public EventStoreModule_PackageNameFactory(h.c<Context> cVar) {
        this.contextProvider = cVar;
    }

    public static EventStoreModule_PackageNameFactory create(h.c<Context> cVar) {
        return new EventStoreModule_PackageNameFactory(cVar);
    }

    public static String packageName(Context context) {
        return (String) Preconditions.checkNotNull(EventStoreModule.packageName(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.c
    public String get() {
        return packageName(this.contextProvider.get());
    }
}
