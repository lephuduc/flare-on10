package n;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\u0014\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000\u001a\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¨\u0006\b"}, d2 = {"Lkotlin/coroutines/Continuation;", "frame", "", "b", "c", "T", "completion", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class j {
    @NotNull
    public static final <T> Continuation<T> a(@NotNull Continuation<? super T> continuation) {
        return h.f1013a.F(continuation);
    }

    public static final void b(@NotNull Continuation<?> continuation) {
        h.f1013a.G(continuation);
    }

    public static final void c(@NotNull Continuation<?> continuation) {
        h.f1013a.H(continuation);
    }
}
