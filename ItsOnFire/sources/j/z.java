package j;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.c1;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lj/z;", "T", "Lj/c1;", "value", "", "P", "(Ljava/lang/Object;)Z", "", "exception", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface z<T> extends c1<T> {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class a {
        public static <T, R> R b(@NotNull z<T> zVar, R r2, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) c1.a.b(zVar, r2, function2);
        }

        @Nullable
        public static <T, E extends CoroutineContext.Element> E c(@NotNull z<T> zVar, @NotNull CoroutineContext.Key<E> key) {
            return (E) c1.a.c(zVar, key);
        }

        @NotNull
        public static <T> CoroutineContext d(@NotNull z<T> zVar, @NotNull CoroutineContext.Key<?> key) {
            return c1.a.d(zVar, key);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static <T> n2 e(@NotNull z<T> zVar, @NotNull n2 n2Var) {
            return c1.a.e(zVar, n2Var);
        }

        @NotNull
        public static <T> CoroutineContext f(@NotNull z<T> zVar, @NotNull CoroutineContext coroutineContext) {
            return c1.a.f(zVar, coroutineContext);
        }
    }

    boolean P(T t2);

    boolean d(@NotNull Throwable th);
}
