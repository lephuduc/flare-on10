package j;

import androidx.appcompat.R;
import j.n2;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@i2
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'¨\u0006\u0005"}, d2 = {"Lj/f3;", "Lj/n2;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "R", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface f3 extends n2 {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class a {
        public static <R> R b(@NotNull f3 f3Var, R r2, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) n2.a.d(f3Var, r2, function2);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E c(@NotNull f3 f3Var, @NotNull CoroutineContext.Key<E> key) {
            return (E) n2.a.e(f3Var, key);
        }

        @NotNull
        public static CoroutineContext d(@NotNull f3 f3Var, @NotNull CoroutineContext.Key<?> key) {
            return n2.a.g(f3Var, key);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static n2 e(@NotNull f3 f3Var, @NotNull n2 n2Var) {
            return n2.a.h(f3Var, n2Var);
        }

        @NotNull
        public static CoroutineContext f(@NotNull f3 f3Var, @NotNull CoroutineContext coroutineContext) {
            return n2.a.i(f3Var, coroutineContext);
        }
    }

    @i2
    @NotNull
    CancellationException R();
}
