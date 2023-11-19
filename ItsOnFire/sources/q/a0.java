package q;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\"\u0004\b\u0001\u0010\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lq/a0;", "", "E", "", "b", "()V", "element", "", "a", "(Ljava/lang/Object;)Z", "g", "()Ljava/lang/Object;", "R", "Lkotlin/Function1;", "transform", "", "f", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "()Z", "e", "isEmpty", "", "c", "()I", "size", "singleConsumer", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public class a0<E> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1967a = AtomicReferenceFieldUpdater.newUpdater(a0.class, Object.class, "_cur");
    @NotNull
    private volatile /* synthetic */ Object _cur;

    public a0(boolean z) {
        this._cur = new b0(8, z);
    }

    public final boolean a(@NotNull E e2) {
        while (true) {
            b0 b0Var = (b0) this._cur;
            int a2 = b0Var.a(e2);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                androidx.concurrent.futures.a.a(f1967a, this, b0Var, b0Var.k());
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            b0 b0Var = (b0) this._cur;
            if (b0Var.d()) {
                return;
            }
            androidx.concurrent.futures.a.a(f1967a, this, b0Var, b0Var.k());
        }
    }

    public final int c() {
        return ((b0) this._cur).f();
    }

    public final boolean d() {
        return ((b0) this._cur).g();
    }

    public final boolean e() {
        return ((b0) this._cur).h();
    }

    @NotNull
    public final <R> List<R> f(@NotNull Function1<? super E, ? extends R> function1) {
        return ((b0) this._cur).i(function1);
    }

    @Nullable
    public final E g() {
        while (true) {
            b0 b0Var = (b0) this._cur;
            E e2 = (E) b0Var.l();
            if (e2 != b0.f1985t) {
                return e2;
            }
            androidx.concurrent.futures.a.a(f1967a, this, b0Var, b0Var.k());
        }
    }
}
