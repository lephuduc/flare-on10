package a;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0000a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // a.a
        public void cancel(String str, int i2, String str2) throws RemoteException {
        }

        @Override // a.a
        public void cancelAll(String str) throws RemoteException {
        }

        @Override // a.a
        public void notify(String str, int i2, String str2, Notification notification) throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements a {
        private static final String DESCRIPTOR = "android.support.v4.app.INotificationSideChannel";
        public static final int TRANSACTION_cancel = 2;
        public static final int TRANSACTION_cancelAll = 3;
        public static final int TRANSACTION_notify = 1;

        /* renamed from: a.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0001a implements a {

            /* renamed from: b  reason: collision with root package name */
            public static a f25b;

            /* renamed from: a  reason: collision with root package name */
            public IBinder f26a;

            public C0001a(IBinder iBinder) {
                this.f26a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f26a;
            }

            public String b() {
                return b.DESCRIPTOR;
            }

            @Override // a.a
            public void cancel(String str, int i2, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    if (this.f26a.transact(2, obtain, null, 1) || b.getDefaultImpl() == null) {
                        return;
                    }
                    b.getDefaultImpl().cancel(str, i2, str2);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // a.a
            public void cancelAll(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    if (this.f26a.transact(3, obtain, null, 1) || b.getDefaultImpl() == null) {
                        return;
                    }
                    b.getDefaultImpl().cancelAll(str);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // a.a
            public void notify(String str, int i2, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f26a.transact(1, obtain, null, 1) || b.getDefaultImpl() == null) {
                        return;
                    }
                    b.getDefaultImpl().notify(str, i2, str2, notification);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, DESCRIPTOR);
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0001a(iBinder) : (a) queryLocalInterface;
        }

        public static a getDefaultImpl() {
            return C0001a.f25b;
        }

        public static boolean setDefaultImpl(a aVar) {
            if (C0001a.f25b == null) {
                if (aVar != null) {
                    C0001a.f25b = aVar;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            if (i2 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                notify(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i2 == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                cancel(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            } else if (i2 == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                cancelAll(parcel.readString());
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void cancel(String str, int i2, String str2) throws RemoteException;

    void cancelAll(String str) throws RemoteException;

    void notify(String str, int i2, String str2, Notification notification) throws RemoteException;
}