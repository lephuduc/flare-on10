package com.google.firebase.installations.remote;

import androidx.annotation.GuardedBy;
import com.google.firebase.installations.Utils;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class RequestLimiter {
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS = TimeUnit.HOURS.toMillis(24);
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS = TimeUnit.MINUTES.toMillis(30);
    @GuardedBy("this")
    private int attemptCount;
    @GuardedBy("this")
    private long nextRequestTime;
    private final Utils utils;

    public RequestLimiter() {
        this.utils = Utils.getInstance();
    }

    public RequestLimiter(Utils utils) {
        this.utils = utils;
    }

    private synchronized long getBackoffDuration(int i2) {
        if (isRetryableError(i2)) {
            return (long) Math.min(Math.pow(2.0d, this.attemptCount) + this.utils.getRandomDelayForSyncPrevention(), MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS);
        }
        return MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS;
    }

    private static boolean isRetryableError(int i2) {
        return i2 == 429 || (i2 >= 500 && i2 < 600);
    }

    private static boolean isSuccessfulOrRequiresNewFidCreation(int i2) {
        return (i2 >= 200 && i2 < 300) || i2 == 401 || i2 == 404;
    }

    private synchronized void resetBackoffStrategy() {
        this.attemptCount = 0;
    }

    public synchronized boolean isRequestAllowed() {
        boolean z;
        if (this.attemptCount != 0) {
            z = this.utils.currentTimeInMillis() > this.nextRequestTime;
        }
        return z;
    }

    public synchronized void setNextRequestTime(int i2) {
        if (isSuccessfulOrRequiresNewFidCreation(i2)) {
            resetBackoffStrategy();
            return;
        }
        this.attemptCount++;
        this.nextRequestTime = this.utils.currentTimeInMillis() + getBackoffDuration(i2);
    }
}
