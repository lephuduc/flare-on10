package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0046a implements a {
        @Override // b.a
        public void a(int i2, Bundle bundle) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final String f144a = "android.support.v4.os.IResultReceiver";

        /* renamed from: b  reason: collision with root package name */
        public static final int f145b = 1;

        /* renamed from: b.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0047a implements a {

            /* renamed from: b  reason: collision with root package name */
            public static a f146b;

            /* renamed from: a  reason: collision with root package name */
            public IBinder f147a;

            public C0047a(IBinder iBinder) {
                this.f147a = iBinder;
            }

            @Override // b.a
            public void a(int i2, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.f144a);
                    obtain.writeInt(i2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f147a.transact(1, obtain, null, 1) || b.c() == null) {
                        return;
                    }
                    b.c().a(i2, bundle);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f147a;
            }

            public String b() {
                return b.f144a;
            }
        }

        public b() {
            attachInterface(this, f144a);
        }

        public static a b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f144a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0047a(iBinder) : (a) queryLocalInterface;
        }

        public static a c() {
            return C0047a.f146b;
        }

        public static boolean d(a aVar) {
            if (C0047a.f146b == null) {
                if (aVar != null) {
                    C0047a.f146b = aVar;
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
                parcel.enforceInterface(f144a);
                a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString(f144a);
                return true;
            }
        }
    }

    void a(int i2, Bundle bundle) throws RemoteException;
}
