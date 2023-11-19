package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import h.c;

/* loaded from: classes.dex */
public final class CreationContextFactory_Factory implements Factory<CreationContextFactory> {
    private final c<Context> applicationContextProvider;
    private final c<Clock> monotonicClockProvider;
    private final c<Clock> wallClockProvider;

    public CreationContextFactory_Factory(c<Context> cVar, c<Clock> cVar2, c<Clock> cVar3) {
        this.applicationContextProvider = cVar;
        this.wallClockProvider = cVar2;
        this.monotonicClockProvider = cVar3;
    }

    public static CreationContextFactory_Factory create(c<Context> cVar, c<Clock> cVar2, c<Clock> cVar3) {
        return new CreationContextFactory_Factory(cVar, cVar2, cVar3);
    }

    public static CreationContextFactory newInstance(Context context, Clock clock, Clock clock2) {
        return new CreationContextFactory(context, clock, clock2);
    }

    @Override // h.c
    public CreationContextFactory get() {
        return newInstance(this.applicationContextProvider.get(), this.wallClockProvider.get(), this.monotonicClockProvider.get());
    }
}
