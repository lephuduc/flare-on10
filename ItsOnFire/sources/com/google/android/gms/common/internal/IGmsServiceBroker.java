package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: classes.dex */
public interface IGmsServiceBroker extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IGmsServiceBroker {
        public Stub() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        @Override // android.os.IInterface
        @NonNull
        @CanIgnoreReturnValue
        @KeepForSdk
        public IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x009d, code lost:
            if (r5.readInt() != 0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00ba, code lost:
            if (r5.readInt() != 0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00cb, code lost:
            if (r5.readInt() != 0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00d2, code lost:
            if (r5.readInt() != 0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00e2, code lost:
            if (r5.readInt() != 0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00e4, code lost:
            r3 = (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(r5);
         */
        @Override // android.os.Binder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onTransact(int r4, @androidx.annotation.NonNull android.os.Parcel r5, @androidx.annotation.Nullable android.os.Parcel r6, int r7) throws android.os.RemoteException {
            /*
                Method dump skipped, instructions count: 278
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.IGmsServiceBroker.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    @KeepForSdk
    void getService(@NonNull IGmsCallbacks iGmsCallbacks, @Nullable GetServiceRequest getServiceRequest) throws RemoteException;
}
