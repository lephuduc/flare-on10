package b;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import b.a;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: j  reason: collision with root package name */
    public final boolean f148j;

    /* renamed from: k  reason: collision with root package name */
    public final Handler f149k;

    /* renamed from: l  reason: collision with root package name */
    public b.a f150l;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    /* renamed from: b.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class BinderC0048b extends a.b {
        public BinderC0048b() {
        }

        @Override // b.a
        public void a(int i2, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f149k;
            if (handler != null) {
                handler.post(new c(i2, bundle));
            } else {
                bVar.a(i2, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        public final int f152j;

        /* renamed from: k  reason: collision with root package name */
        public final Bundle f153k;

        public c(int i2, Bundle bundle) {
            this.f152j = i2;
            this.f153k = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f152j, this.f153k);
        }
    }

    public b(Handler handler) {
        this.f148j = true;
        this.f149k = handler;
    }

    public b(Parcel parcel) {
        this.f148j = false;
        this.f149k = null;
        this.f150l = a.b.b(parcel.readStrongBinder());
    }

    public void a(int i2, Bundle bundle) {
    }

    public void b(int i2, Bundle bundle) {
        if (this.f148j) {
            Handler handler = this.f149k;
            if (handler != null) {
                handler.post(new c(i2, bundle));
                return;
            } else {
                a(i2, bundle);
                return;
            }
        }
        b.a aVar = this.f150l;
        if (aVar != null) {
            try {
                aVar.a(i2, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        synchronized (this) {
            if (this.f150l == null) {
                this.f150l = new BinderC0048b();
            }
            parcel.writeStrongBinder(this.f150l.asBinder());
        }
    }
}
