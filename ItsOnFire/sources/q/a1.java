package q;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import j.i2;
import java.lang.Comparable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q.b1;

@i2
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u000e\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b3\u0010\bJ\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\u000f\u001a\u0004\u0018\u00018\u00002!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0013\u0010\u0012J&\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\tH\u0086\b¢\u0006\u0004\b\u0014\u0010\u0010J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00028\u00002\u0014\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\r0\tH\u0086\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u001d\u0010\u0012J\u0017\u0010 \u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\"\u0010\u0017J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u001eH\u0082\u0010¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u001eH\u0082\u0010¢\u0006\u0004\b%\u0010$J\u0017\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000&H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u001eH\u0002¢\u0006\u0004\b)\u0010*R \u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010+R$\u0010/\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u001e8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010$R\u0011\u00102\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lq/a1;", "Lq/b1;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "()V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "value", "", "predicate", "e", "(Lkotlin/jvm/functions/Function1;)Lq/b1;", "i", "()Lq/b1;", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "m", "node", "b", "(Lq/b1;)V", "cond", "c", "(Lq/b1;Lkotlin/jvm/functions/Function1;)Z", "k", "(Lq/b1;)Z", "f", "", FirebaseAnalytics.Param.INDEX, "l", "(I)Lq/b1;", "a", "q", "(I)V", "p", "", "j", "()[Lq/b1;", "r", "(II)V", "[Lq/b1;", "g", "()I", "o", "size", "h", "()Z", "isEmpty", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public class a1<T extends b1 & Comparable<? super T>> {
    @NotNull
    private volatile /* synthetic */ int _size = 0;
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public T[] f1968a;

    @PublishedApi
    public final void a(@NotNull T t2) {
        t2.b(this);
        T[] j2 = j();
        int g2 = g();
        o(g2 + 1);
        j2[g2] = t2;
        t2.setIndex(g2);
        q(g2);
    }

    public final void b(@NotNull T t2) {
        synchronized (this) {
            a(t2);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean c(@NotNull T t2, @NotNull Function1<? super T, Boolean> function1) {
        boolean z;
        synchronized (this) {
            try {
                if (function1.invoke(f()).booleanValue()) {
                    a(t2);
                    z = true;
                } else {
                    z = false;
                }
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return z;
    }

    public final void d() {
        synchronized (this) {
            T[] tArr = this.f1968a;
            if (tArr != null) {
                ArraysKt___ArraysJvmKt.fill$default(tArr, (Object) null, 0, 0, 6, (Object) null);
            }
            this._size = 0;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Nullable
    public final T e(@NotNull Function1<? super T, Boolean> function1) {
        T t2;
        synchronized (this) {
            int i2 = 0;
            int g2 = g();
            while (true) {
                if (i2 >= g2) {
                    break;
                }
                T[] tArr = this.f1968a;
                t2 = tArr != null ? tArr[i2] : null;
                Intrinsics.checkNotNull(t2);
                if (function1.invoke(t2).booleanValue()) {
                    break;
                }
                i2++;
            }
        }
        return t2;
    }

    @PublishedApi
    @Nullable
    public final T f() {
        T[] tArr = this.f1968a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int g() {
        return this._size;
    }

    public final boolean h() {
        return g() == 0;
    }

    @Nullable
    public final T i() {
        T f2;
        synchronized (this) {
            f2 = f();
        }
        return f2;
    }

    public final T[] j() {
        T[] tArr = this.f1968a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new b1[4];
            this.f1968a = tArr2;
            return tArr2;
        } else if (g() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, g() * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((b1[]) copyOf);
            this.f1968a = tArr3;
            return tArr3;
        } else {
            return tArr;
        }
    }

    public final boolean k(@NotNull T t2) {
        boolean z;
        synchronized (this) {
            if (t2.a() == null) {
                z = false;
            } else {
                l(t2.getIndex());
                z = true;
            }
        }
        return z;
    }

    @PublishedApi
    @NotNull
    public final T l(int i2) {
        T[] tArr = this.f1968a;
        Intrinsics.checkNotNull(tArr);
        o(g() - 1);
        if (i2 < g()) {
            r(i2, g());
            int i3 = (i2 - 1) / 2;
            if (i2 > 0) {
                T t2 = tArr[i2];
                Intrinsics.checkNotNull(t2);
                T t3 = tArr[i3];
                Intrinsics.checkNotNull(t3);
                if (((Comparable) t2).compareTo(t3) < 0) {
                    r(i2, i3);
                    q(i3);
                }
            }
            p(i2);
        }
        T t4 = tArr[g()];
        Intrinsics.checkNotNull(t4);
        t4.b(null);
        t4.setIndex(-1);
        tArr[g()] = null;
        return t4;
    }

    @Nullable
    public final T m(@NotNull Function1<? super T, Boolean> function1) {
        synchronized (this) {
            try {
                T f2 = f();
                if (f2 == null) {
                    InlineMarker.finallyStart(2);
                    InlineMarker.finallyEnd(2);
                    return null;
                }
                T l2 = function1.invoke(f2).booleanValue() ? l(0) : null;
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                return l2;
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
    }

    @Nullable
    public final T n() {
        T l2;
        synchronized (this) {
            l2 = g() > 0 ? l(0) : null;
        }
        return l2;
    }

    public final void o(int i2) {
        this._size = i2;
    }

    public final void p(int i2) {
        while (true) {
            int i3 = (i2 * 2) + 1;
            if (i3 >= g()) {
                return;
            }
            T[] tArr = this.f1968a;
            Intrinsics.checkNotNull(tArr);
            int i4 = i3 + 1;
            if (i4 < g()) {
                T t2 = tArr[i4];
                Intrinsics.checkNotNull(t2);
                T t3 = tArr[i3];
                Intrinsics.checkNotNull(t3);
                if (((Comparable) t2).compareTo(t3) < 0) {
                    i3 = i4;
                }
            }
            T t4 = tArr[i2];
            Intrinsics.checkNotNull(t4);
            T t5 = tArr[i3];
            Intrinsics.checkNotNull(t5);
            if (((Comparable) t4).compareTo(t5) <= 0) {
                return;
            }
            r(i2, i3);
            i2 = i3;
        }
    }

    public final void q(int i2) {
        while (i2 > 0) {
            T[] tArr = this.f1968a;
            Intrinsics.checkNotNull(tArr);
            int i3 = (i2 - 1) / 2;
            T t2 = tArr[i3];
            Intrinsics.checkNotNull(t2);
            T t3 = tArr[i2];
            Intrinsics.checkNotNull(t3);
            if (((Comparable) t2).compareTo(t3) <= 0) {
                return;
            }
            r(i2, i3);
            i2 = i3;
        }
    }

    public final void r(int i2, int i3) {
        T[] tArr = this.f1968a;
        Intrinsics.checkNotNull(tArr);
        T t2 = tArr[i3];
        Intrinsics.checkNotNull(t2);
        T t3 = tArr[i2];
        Intrinsics.checkNotNull(t3);
        tArr[i2] = t2;
        tArr[i3] = t3;
        t2.setIndex(i2);
        t3.setIndex(i3);
    }
}
