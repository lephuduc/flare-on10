package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import h.c;

/* loaded from: classes.dex */
public final class SchedulingModule_WorkSchedulerFactory implements Factory<WorkScheduler> {
    private final c<Clock> clockProvider;
    private final c<SchedulerConfig> configProvider;
    private final c<Context> contextProvider;
    private final c<EventStore> eventStoreProvider;

    public SchedulingModule_WorkSchedulerFactory(c<Context> cVar, c<EventStore> cVar2, c<SchedulerConfig> cVar3, c<Clock> cVar4) {
        this.contextProvider = cVar;
        this.eventStoreProvider = cVar2;
        this.configProvider = cVar3;
        this.clockProvider = cVar4;
    }

    public static SchedulingModule_WorkSchedulerFactory create(c<Context> cVar, c<EventStore> cVar2, c<SchedulerConfig> cVar3, c<Clock> cVar4) {
        return new SchedulingModule_WorkSchedulerFactory(cVar, cVar2, cVar3, cVar4);
    }

    public static WorkScheduler workScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig, Clock clock) {
        return (WorkScheduler) Preconditions.checkNotNull(SchedulingModule.workScheduler(context, eventStore, schedulerConfig, clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.c
    public WorkScheduler get() {
        return workScheduler(this.contextProvider.get(), this.eventStoreProvider.get(), this.configProvider.get(), this.clockProvider.get());
    }
}
