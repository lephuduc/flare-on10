package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import java.util.Arrays;

/* loaded from: classes.dex */
final class AutoValue_BackendRequest extends BackendRequest {
    private final Iterable<EventInternal> events;
    private final byte[] extras;

    /* loaded from: classes.dex */
    public static final class Builder extends BackendRequest.Builder {
        private Iterable<EventInternal> events;
        private byte[] extras;

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public BackendRequest build() {
            String str = "";
            if (this.events == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new AutoValue_BackendRequest(this.events, this.extras);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public BackendRequest.Builder setEvents(Iterable<EventInternal> iterable) {
            if (iterable != null) {
                this.events = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public BackendRequest.Builder setExtras(@Nullable byte[] bArr) {
            this.extras = bArr;
            return this;
        }
    }

    private AutoValue_BackendRequest(Iterable<EventInternal> iterable, @Nullable byte[] bArr) {
        this.events = iterable;
        this.extras = bArr;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BackendRequest) {
            BackendRequest backendRequest = (BackendRequest) obj;
            if (this.events.equals(backendRequest.getEvents())) {
                if (Arrays.equals(this.extras, backendRequest instanceof AutoValue_BackendRequest ? ((AutoValue_BackendRequest) backendRequest).extras : backendRequest.getExtras())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public Iterable<EventInternal> getEvents() {
        return this.events;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    @Nullable
    public byte[] getExtras() {
        return this.extras;
    }

    public int hashCode() {
        return Arrays.hashCode(this.extras) ^ ((this.events.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "BackendRequest{events=" + this.events + ", extras=" + Arrays.toString(this.extras) + "}";
    }
}
