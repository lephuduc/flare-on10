package q;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.s3;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0006\u001a\u00020\u00052\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lq/c1;", "", "Lj/s3;", "element", "value", "", "a", "Lkotlin/coroutines/CoroutineContext;", "context", "b", "Lkotlin/coroutines/CoroutineContext;", "", "[Ljava/lang/Object;", "values", "c", "[Lj/s3;", "elements", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "I", "i", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "<init>", "(Lkotlin/coroutines/CoroutineContext;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class c1 {
    @JvmField
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineContext f1995a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f1996b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final s3<Object>[] f1997c;

    /* renamed from: d  reason: collision with root package name */
    public int f1998d;

    public c1(@NotNull CoroutineContext coroutineContext, int i2) {
        this.f1995a = coroutineContext;
        this.f1996b = new Object[i2];
        this.f1997c = new s3[i2];
    }

    public final void a(@NotNull s3<?> s3Var, @Nullable Object obj) {
        Object[] objArr = this.f1996b;
        int i2 = this.f1998d;
        objArr[i2] = obj;
        s3<Object>[] s3VarArr = this.f1997c;
        this.f1998d = i2 + 1;
        s3VarArr[i2] = s3Var;
    }

    public final void b(@NotNull CoroutineContext coroutineContext) {
        int length = this.f1997c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            s3<Object> s3Var = this.f1997c[length];
            Intrinsics.checkNotNull(s3Var);
            s3Var.K(coroutineContext, this.f1996b[length]);
            if (i2 < 0) {
                return;
            }
            length = i2;
        }
    }
}
