package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import h.c;

/* loaded from: classes.dex */
public final class TransportRuntime_Factory implements Factory<TransportRuntime> {
    private final c<Clock> eventClockProvider;
    private final c<WorkInitializer> initializerProvider;
    private final c<Scheduler> schedulerProvider;
    private final c<Uploader> uploaderProvider;
    private final c<Clock> uptimeClockProvider;

    public TransportRuntime_Factory(c<Clock> cVar, c<Clock> cVar2, c<Scheduler> cVar3, c<Uploader> cVar4, c<WorkInitializer> cVar5) {
        this.eventClockProvider = cVar;
        this.uptimeClockProvider = cVar2;
        this.schedulerProvider = cVar3;
        this.uploaderProvider = cVar4;
        this.initializerProvider = cVar5;
    }

    public static TransportRuntime_Factory create(c<Clock> cVar, c<Clock> cVar2, c<Scheduler> cVar3, c<Uploader> cVar4, c<WorkInitializer> cVar5) {
        return new TransportRuntime_Factory(cVar, cVar2, cVar3, cVar4, cVar5);
    }

    public static TransportRuntime newInstance(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        return new TransportRuntime(clock, clock2, scheduler, uploader, workInitializer);
    }

    @Override // h.c
    public TransportRuntime get() {
        return newInstance(this.eventClockProvider.get(), this.uptimeClockProvider.get(), this.schedulerProvider.get(), this.uploaderProvider.get(), this.initializerProvider.get());
    }
}
