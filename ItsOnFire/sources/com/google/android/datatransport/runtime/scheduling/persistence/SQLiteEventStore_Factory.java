package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;

/* loaded from: classes.dex */
public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {
    private final h.c<Clock> clockProvider;
    private final h.c<EventStoreConfig> configProvider;
    private final h.c<String> packageNameProvider;
    private final h.c<SchemaManager> schemaManagerProvider;
    private final h.c<Clock> wallClockProvider;

    public SQLiteEventStore_Factory(h.c<Clock> cVar, h.c<Clock> cVar2, h.c<EventStoreConfig> cVar3, h.c<SchemaManager> cVar4, h.c<String> cVar5) {
        this.wallClockProvider = cVar;
        this.clockProvider = cVar2;
        this.configProvider = cVar3;
        this.schemaManagerProvider = cVar4;
        this.packageNameProvider = cVar5;
    }

    public static SQLiteEventStore_Factory create(h.c<Clock> cVar, h.c<Clock> cVar2, h.c<EventStoreConfig> cVar3, h.c<SchemaManager> cVar4, h.c<String> cVar5) {
        return new SQLiteEventStore_Factory(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static SQLiteEventStore newInstance(Clock clock, Clock clock2, Object obj, Object obj2, h.c<String> cVar) {
        return new SQLiteEventStore(clock, clock2, (EventStoreConfig) obj, (SchemaManager) obj2, cVar);
    }

    @Override // h.c
    public SQLiteEventStore get() {
        return newInstance(this.wallClockProvider.get(), this.clockProvider.get(), this.configProvider.get(), this.schemaManagerProvider.get(), this.packageNameProvider);
    }
}
