package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class Uploader_Factory implements Factory<Uploader> {
    private final h.c<BackendRegistry> backendRegistryProvider;
    private final h.c<ClientHealthMetricsStore> clientHealthMetricsStoreProvider;
    private final h.c<Clock> clockProvider;
    private final h.c<Context> contextProvider;
    private final h.c<EventStore> eventStoreProvider;
    private final h.c<Executor> executorProvider;
    private final h.c<SynchronizationGuard> guardProvider;
    private final h.c<Clock> uptimeClockProvider;
    private final h.c<WorkScheduler> workSchedulerProvider;

    public Uploader_Factory(h.c<Context> cVar, h.c<BackendRegistry> cVar2, h.c<EventStore> cVar3, h.c<WorkScheduler> cVar4, h.c<Executor> cVar5, h.c<SynchronizationGuard> cVar6, h.c<Clock> cVar7, h.c<Clock> cVar8, h.c<ClientHealthMetricsStore> cVar9) {
        this.contextProvider = cVar;
        this.backendRegistryProvider = cVar2;
        this.eventStoreProvider = cVar3;
        this.workSchedulerProvider = cVar4;
        this.executorProvider = cVar5;
        this.guardProvider = cVar6;
        this.clockProvider = cVar7;
        this.uptimeClockProvider = cVar8;
        this.clientHealthMetricsStoreProvider = cVar9;
    }

    public static Uploader_Factory create(h.c<Context> cVar, h.c<BackendRegistry> cVar2, h.c<EventStore> cVar3, h.c<WorkScheduler> cVar4, h.c<Executor> cVar5, h.c<SynchronizationGuard> cVar6, h.c<Clock> cVar7, h.c<Clock> cVar8, h.c<ClientHealthMetricsStore> cVar9) {
        return new Uploader_Factory(cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9);
    }

    public static Uploader newInstance(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock, Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        return new Uploader(context, backendRegistry, eventStore, workScheduler, executor, synchronizationGuard, clock, clock2, clientHealthMetricsStore);
    }

    @Override // h.c
    public Uploader get() {
        return newInstance(this.contextProvider.get(), this.backendRegistryProvider.get(), this.eventStoreProvider.get(), this.workSchedulerProvider.get(), this.executorProvider.get(), this.guardProvider.get(), this.clockProvider.get(), this.uptimeClockProvider.get(), this.clientHealthMetricsStoreProvider.get());
    }
}
