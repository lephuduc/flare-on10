package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import h.f;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Module
/* loaded from: classes.dex */
abstract class ExecutionModule {
    @Provides
    @f
    public static Executor executor() {
        return new SafeLoggingExecutor(Executors.newSingleThreadExecutor());
    }
}
