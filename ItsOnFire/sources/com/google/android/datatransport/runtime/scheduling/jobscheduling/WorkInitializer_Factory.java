package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class WorkInitializer_Factory implements Factory<WorkInitializer> {
    private final h.c<Executor> executorProvider;
    private final h.c<SynchronizationGuard> guardProvider;
    private final h.c<WorkScheduler> schedulerProvider;
    private final h.c<EventStore> storeProvider;

    public WorkInitializer_Factory(h.c<Executor> cVar, h.c<EventStore> cVar2, h.c<WorkScheduler> cVar3, h.c<SynchronizationGuard> cVar4) {
        this.executorProvider = cVar;
        this.storeProvider = cVar2;
        this.schedulerProvider = cVar3;
        this.guardProvider = cVar4;
    }

    public static WorkInitializer_Factory create(h.c<Executor> cVar, h.c<EventStore> cVar2, h.c<WorkScheduler> cVar3, h.c<SynchronizationGuard> cVar4) {
        return new WorkInitializer_Factory(cVar, cVar2, cVar3, cVar4);
    }

    public static WorkInitializer newInstance(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        return new WorkInitializer(executor, eventStore, workScheduler, synchronizationGuard);
    }

    @Override // h.c
    public WorkInitializer get() {
        return newInstance(this.executorProvider.get(), this.storeProvider.get(), this.schedulerProvider.get(), this.guardProvider.get());
    }
}
