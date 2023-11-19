package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes.dex */
public interface IFragmentWrapper extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        @NonNull
        public static IFragmentWrapper asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return queryLocalInterface instanceof IFragmentWrapper ? (IFragmentWrapper) queryLocalInterface : new zza(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean zza(int i2, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i3) throws RemoteException {
            IInterface zzg;
            int zzb;
            boolean zzs;
            switch (i2) {
                case 2:
                    zzg = zzg();
                    parcel2.writeNoException();
                    zzc.zzf(parcel2, zzg);
                    return true;
                case 3:
                    Bundle zzd = zzd();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, zzd);
                    return true;
                case 4:
                    zzb = zzb();
                    parcel2.writeNoException();
                    parcel2.writeInt(zzb);
                    return true;
                case 5:
                    zzg = zze();
                    parcel2.writeNoException();
                    zzc.zzf(parcel2, zzg);
                    return true;
                case 6:
                    zzg = zzh();
                    parcel2.writeNoException();
                    zzc.zzf(parcel2, zzg);
                    return true;
                case 7:
                    zzs = zzs();
                    parcel2.writeNoException();
                    zzc.zzc(parcel2, zzs);
                    return true;
                case 8:
                    String zzj = zzj();
                    parcel2.writeNoException();
                    parcel2.writeString(zzj);
                    return true;
                case 9:
                    zzg = zzf();
                    parcel2.writeNoException();
                    zzc.zzf(parcel2, zzg);
                    return true;
                case 10:
                    zzb = zzc();
                    parcel2.writeNoException();
                    parcel2.writeInt(zzb);
                    return true;
                case 11:
                    zzs = zzt();
                    parcel2.writeNoException();
                    zzc.zzc(parcel2, zzs);
                    return true;
                case 12:
                    zzg = zzi();
                    parcel2.writeNoException();
                    zzc.zzf(parcel2, zzg);
                    return true;
                case 13:
                    zzs = zzu();
                    parcel2.writeNoException();
                    zzc.zzc(parcel2, zzs);
                    return true;
                case 14:
                    zzs = zzv();
                    parcel2.writeNoException();
                    zzc.zzc(parcel2, zzs);
                    return true;
                case 15:
                    zzs = zzw();
                    parcel2.writeNoException();
                    zzc.zzc(parcel2, zzs);
                    return true;
                case 16:
                    zzs = zzx();
                    parcel2.writeNoException();
                    zzc.zzc(parcel2, zzs);
                    return true;
                case 17:
                    zzs = zzy();
                    parcel2.writeNoException();
                    zzc.zzc(parcel2, zzs);
                    return true;
                case 18:
                    zzs = zzz();
                    parcel2.writeNoException();
                    zzc.zzc(parcel2, zzs);
                    return true;
                case 19:
                    zzs = zzA();
                    parcel2.writeNoException();
                    zzc.zzc(parcel2, zzs);
                    return true;
                case 20:
                    IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzc.zzb(parcel);
                    zzk(asInterface);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean zzg2 = zzc.zzg(parcel);
                    zzc.zzb(parcel);
                    zzl(zzg2);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zzg3 = zzc.zzg(parcel);
                    zzc.zzb(parcel);
                    zzm(zzg3);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean zzg4 = zzc.zzg(parcel);
                    zzc.zzb(parcel);
                    zzn(zzg4);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    boolean zzg5 = zzc.zzg(parcel);
                    zzc.zzb(parcel);
                    zzo(zzg5);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    zzc.zzb(parcel);
                    zzp((Intent) zzc.zza(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    int readInt = parcel.readInt();
                    zzc.zzb(parcel);
                    zzq((Intent) zzc.zza(parcel, Intent.CREATOR), readInt);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzc.zzb(parcel);
                    zzr(asInterface2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean zzA() throws RemoteException;

    int zzb() throws RemoteException;

    int zzc() throws RemoteException;

    @Nullable
    Bundle zzd() throws RemoteException;

    @Nullable
    IFragmentWrapper zze() throws RemoteException;

    @Nullable
    IFragmentWrapper zzf() throws RemoteException;

    @NonNull
    IObjectWrapper zzg() throws RemoteException;

    @NonNull
    IObjectWrapper zzh() throws RemoteException;

    @NonNull
    IObjectWrapper zzi() throws RemoteException;

    @Nullable
    String zzj() throws RemoteException;

    void zzk(@NonNull IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzl(boolean z) throws RemoteException;

    void zzm(boolean z) throws RemoteException;

    void zzn(boolean z) throws RemoteException;

    void zzo(boolean z) throws RemoteException;

    void zzp(@NonNull Intent intent) throws RemoteException;

    void zzq(@NonNull Intent intent, int i2) throws RemoteException;

    void zzr(@NonNull IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzs() throws RemoteException;

    boolean zzt() throws RemoteException;

    boolean zzu() throws RemoteException;

    boolean zzv() throws RemoteException;

    boolean zzw() throws RemoteException;

    boolean zzx() throws RemoteException;

    boolean zzy() throws RemoteException;

    boolean zzz() throws RemoteException;
}
