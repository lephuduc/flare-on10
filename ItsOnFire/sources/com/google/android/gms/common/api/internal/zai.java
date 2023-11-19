package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class zai {
    public final int zac;

    public zai(int i2) {
        this.zac = i2;
    }

    public static /* bridge */ /* synthetic */ Status zah(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void zad(@NonNull Status status);

    public abstract void zae(@NonNull Exception exc);

    public abstract void zaf(zabq<?> zabqVar) throws DeadObjectException;

    public abstract void zag(@NonNull zaad zaadVar, boolean z);
}
