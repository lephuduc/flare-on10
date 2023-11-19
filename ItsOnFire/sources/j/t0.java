package j;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lj/t0;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "", "toString", "q", "name", "s", "", "hashCode", "", "other", "", "equals", "j", "Ljava/lang/String;", "v", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "k", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class t0 extends AbstractCoroutineContextElement {
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public static final a f514k = new a(null);
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public final String f515j;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lj/t0$a;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lj/t0;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class a implements CoroutineContext.Key<t0> {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public t0(@NotNull String str) {
        super(f514k);
        this.f515j = str;
    }

    public static /* synthetic */ t0 t(t0 t0Var, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = t0Var.f515j;
        }
        return t0Var.s(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && Intrinsics.areEqual(this.f515j, ((t0) obj).f515j);
    }

    public int hashCode() {
        return this.f515j.hashCode();
    }

    @NotNull
    public final String q() {
        return this.f515j;
    }

    @NotNull
    public final t0 s(@NotNull String str) {
        return new t0(str);
    }

    @NotNull
    public String toString() {
        return "CoroutineName(" + this.f515j + ')';
    }

    @NotNull
    public final String v() {
        return this.f515j;
    }
}
