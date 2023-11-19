package q;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\u0004H\u0002R\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lq/a;", "", "T", "element", "", "a", "(Ljava/lang/Object;)V", "e", "()Ljava/lang/Object;", "b", "c", "", "[Ljava/lang/Object;", "elements", "", "I", "head", "tail", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "()Z", "isEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public class a<T> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public Object[] f1964a = new Object[16];

    /* renamed from: b  reason: collision with root package name */
    public int f1965b;

    /* renamed from: c  reason: collision with root package name */
    public int f1966c;

    public final void a(@NotNull T t2) {
        Object[] objArr = this.f1964a;
        int i2 = this.f1966c;
        objArr[i2] = t2;
        int length = (objArr.length - 1) & (i2 + 1);
        this.f1966c = length;
        if (length == this.f1965b) {
            c();
        }
    }

    public final void b() {
        this.f1965b = 0;
        this.f1966c = 0;
        this.f1964a = new Object[this.f1964a.length];
    }

    public final void c() {
        Object[] objArr = this.f1964a;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        ArraysKt___ArraysJvmKt.copyInto$default(objArr, objArr2, 0, this.f1965b, 0, 10, (Object) null);
        Object[] objArr3 = this.f1964a;
        int length2 = objArr3.length;
        int i2 = this.f1965b;
        ArraysKt___ArraysJvmKt.copyInto$default(objArr3, objArr2, length2 - i2, 0, i2, 4, (Object) null);
        this.f1964a = objArr2;
        this.f1965b = 0;
        this.f1966c = length;
    }

    public final boolean d() {
        return this.f1965b == this.f1966c;
    }

    @Nullable
    public final T e() {
        int i2 = this.f1965b;
        if (i2 == this.f1966c) {
            return null;
        }
        Object[] objArr = this.f1964a;
        T t2 = (T) objArr[i2];
        objArr[i2] = null;
        this.f1965b = (i2 + 1) & (objArr.length - 1);
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}
