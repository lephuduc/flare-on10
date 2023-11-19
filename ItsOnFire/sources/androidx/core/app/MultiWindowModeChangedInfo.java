package androidx.core.app;

import android.content.res.Configuration;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class MultiWindowModeChangedInfo {
    private final boolean mIsInMultiWindowMode;
    private final Configuration mNewConfig;

    public MultiWindowModeChangedInfo(boolean z) {
        this.mIsInMultiWindowMode = z;
        this.mNewConfig = null;
    }

    @RequiresApi(26)
    public MultiWindowModeChangedInfo(boolean z, @NonNull Configuration configuration) {
        this.mIsInMultiWindowMode = z;
        this.mNewConfig = configuration;
    }

    @NonNull
    @RequiresApi(26)
    public Configuration getNewConfig() {
        Configuration configuration = this.mNewConfig;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }

    public boolean isInMultiWindowMode() {
        return this.mIsInMultiWindowMode;
    }
}
