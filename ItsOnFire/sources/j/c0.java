package j;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.n2;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lj/c0;", "Lj/n2;", "", "complete", "", "exception", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface c0 extends n2 {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class a {
        public static <R> R b(@NotNull c0 c0Var, R r2, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) n2.a.d(c0Var, r2, function2);
        }

        @Nullable
        public static <E extends CoroutineContext.Element> E c(@NotNull c0 c0Var, @NotNull CoroutineContext.Key<E> key) {
            return (E) n2.a.e(c0Var, key);
        }

        @NotNull
        public static CoroutineContext d(@NotNull c0 c0Var, @NotNull CoroutineContext.Key<?> key) {
            return n2.a.g(c0Var, key);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static n2 e(@NotNull c0 c0Var, @NotNull n2 n2Var) {
            return n2.a.h(c0Var, n2Var);
        }

        @NotNull
        public static CoroutineContext f(@NotNull c0 c0Var, @NotNull CoroutineContext coroutineContext) {
            return n2.a.i(c0Var, coroutineContext);
        }
    }

    boolean complete();

    boolean d(@NotNull Throwable th);
}
