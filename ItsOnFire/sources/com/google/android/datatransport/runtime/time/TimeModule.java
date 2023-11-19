package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;

@Module
/* loaded from: classes.dex */
public abstract class TimeModule {
    @Provides
    @WallTime
    public static Clock eventClock() {
        return new WallTimeClock();
    }

    @Provides
    @Monotonic
    public static Clock uptimeClock() {
        return new UptimeClock();
    }
}
