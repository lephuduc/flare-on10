package j;

import androidx.appcompat.R;
import j.n2;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H'¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H'R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lj/c1;", "T", "Lj/n2;", "x", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "()Ljava/lang/Object;", "", "l", "Lt/d;", "j", "()Lt/d;", "onAwait", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface c1<T> extends n2 {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class a {
        public static <T, R> R b(@NotNull c1<? extends T> c1Var, R r2, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) n2.a.d(c1Var, r2, function2);
        }

        @Nullable
        public static <T, E extends CoroutineContext.Element> E c(@NotNull c1<? extends T> c1Var, @NotNull CoroutineContext.Key<E> key) {
            return (E) n2.a.e(c1Var, key);
        }

        @NotNull
        public static <T> CoroutineContext d(@NotNull c1<? extends T> c1Var, @NotNull CoroutineContext.Key<?> key) {
            return n2.a.g(c1Var, key);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static <T> n2 e(@NotNull c1<? extends T> c1Var, @NotNull n2 n2Var) {
            return n2.a.h(c1Var, n2Var);
        }

        @NotNull
        public static <T> CoroutineContext f(@NotNull c1<? extends T> c1Var, @NotNull CoroutineContext coroutineContext) {
            return n2.a.i(c1Var, coroutineContext);
        }
    }

    @c2
    T g();

    @NotNull
    t.d<T> j();

    @c2
    @Nullable
    Throwable l();

    @Nullable
    Object x(@NotNull Continuation<? super T> continuation);
}
