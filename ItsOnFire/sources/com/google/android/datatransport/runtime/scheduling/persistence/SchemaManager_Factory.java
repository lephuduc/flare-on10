package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;

/* loaded from: classes.dex */
public final class SchemaManager_Factory implements Factory<SchemaManager> {
    private final h.c<Context> contextProvider;
    private final h.c<String> dbNameProvider;
    private final h.c<Integer> schemaVersionProvider;

    public SchemaManager_Factory(h.c<Context> cVar, h.c<String> cVar2, h.c<Integer> cVar3) {
        this.contextProvider = cVar;
        this.dbNameProvider = cVar2;
        this.schemaVersionProvider = cVar3;
    }

    public static SchemaManager_Factory create(h.c<Context> cVar, h.c<String> cVar2, h.c<Integer> cVar3) {
        return new SchemaManager_Factory(cVar, cVar2, cVar3);
    }

    public static SchemaManager newInstance(Context context, String str, int i2) {
        return new SchemaManager(context, str, i2);
    }

    @Override // h.c
    public SchemaManager get() {
        return newInstance(this.contextProvider.get(), this.dbNameProvider.get(), this.schemaVersionProvider.get().intValue());
    }
}
