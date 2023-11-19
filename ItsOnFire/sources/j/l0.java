package j;

import androidx.appcompat.R;
import j.s3;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lj/l0;", "S", "Lj/s3;", "I", "Lkotlin/coroutines/CoroutineContext$Element;", "overwritingElement", "Lkotlin/coroutines/CoroutineContext;", "h", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@g1
@c2
/* loaded from: classes2.dex */
public interface l0<S> extends s3<S> {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class a {
        public static <S, R> R a(@NotNull l0<S> l0Var, R r2, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) s3.a.a(l0Var, r2, function2);
        }

        @Nullable
        public static <S, E extends CoroutineContext.Element> E b(@NotNull l0<S> l0Var, @NotNull CoroutineContext.Key<E> key) {
            return (E) s3.a.b(l0Var, key);
        }

        @NotNull
        public static <S> CoroutineContext c(@NotNull l0<S> l0Var, @NotNull CoroutineContext.Key<?> key) {
            return s3.a.c(l0Var, key);
        }

        @NotNull
        public static <S> CoroutineContext d(@NotNull l0<S> l0Var, @NotNull CoroutineContext coroutineContext) {
            return s3.a.d(l0Var, coroutineContext);
        }
    }

    @NotNull
    l0<S> I();

    @NotNull
    CoroutineContext h(@NotNull CoroutineContext.Element element);
}
