package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistryModule;
import com.google.android.datatransport.runtime.dagger.BindsInstance;
import com.google.android.datatransport.runtime.dagger.Component;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule;
import com.google.android.datatransport.runtime.time.TimeModule;
import h.f;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
@f
@Component(modules = {BackendRegistryModule.class, EventStoreModule.class, ExecutionModule.class, SchedulingModule.class, SchedulingConfigModule.class, TimeModule.class})
/* loaded from: classes.dex */
public abstract class TransportRuntimeComponent implements Closeable {

    @Component.Builder
    /* loaded from: classes.dex */
    public interface Builder {
        TransportRuntimeComponent build();

        @BindsInstance
        Builder setApplicationContext(Context context);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        getEventStore().close();
    }

    public abstract EventStore getEventStore();

    public abstract TransportRuntime getTransportRuntime();
}
