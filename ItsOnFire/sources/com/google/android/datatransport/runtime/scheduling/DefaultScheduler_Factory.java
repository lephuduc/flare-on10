package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import h.c;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class DefaultScheduler_Factory implements Factory<DefaultScheduler> {
    private final c<BackendRegistry> backendRegistryProvider;
    private final c<EventStore> eventStoreProvider;
    private final c<Executor> executorProvider;
    private final c<SynchronizationGuard> guardProvider;
    private final c<WorkScheduler> workSchedulerProvider;

    public DefaultScheduler_Factory(c<Executor> cVar, c<BackendRegistry> cVar2, c<WorkScheduler> cVar3, c<EventStore> cVar4, c<SynchronizationGuard> cVar5) {
        this.executorProvider = cVar;
        this.backendRegistryProvider = cVar2;
        this.workSchedulerProvider = cVar3;
        this.eventStoreProvider = cVar4;
        this.guardProvider = cVar5;
    }

    public static DefaultScheduler_Factory create(c<Executor> cVar, c<BackendRegistry> cVar2, c<WorkScheduler> cVar3, c<EventStore> cVar4, c<SynchronizationGuard> cVar5) {
        return new DefaultScheduler_Factory(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static DefaultScheduler newInstance(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        return new DefaultScheduler(executor, backendRegistry, workScheduler, eventStore, synchronizationGuard);
    }

    @Override // h.c
    public DefaultScheduler get() {
        return newInstance(this.executorProvider.get(), this.backendRegistryProvider.get(), this.workSchedulerProvider.get(), this.eventStoreProvider.get(), this.guardProvider.get());
    }
}
