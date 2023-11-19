package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import h.c;

/* loaded from: classes.dex */
public final class SchedulingConfigModule_ConfigFactory implements Factory<SchedulerConfig> {
    private final c<Clock> clockProvider;

    public SchedulingConfigModule_ConfigFactory(c<Clock> cVar) {
        this.clockProvider = cVar;
    }

    public static SchedulerConfig config(Clock clock) {
        return (SchedulerConfig) Preconditions.checkNotNull(SchedulingConfigModule.config(clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static SchedulingConfigModule_ConfigFactory create(c<Clock> cVar) {
        return new SchedulingConfigModule_ConfigFactory(cVar);
    }

    @Override // h.c
    public SchedulerConfig get() {
        return config(this.clockProvider.get());
    }
}
