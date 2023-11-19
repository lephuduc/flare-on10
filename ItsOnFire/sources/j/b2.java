package j;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0005*\u0010\b\u0007\u0010\n\"\u00020\u00012\u00020\u0001B\u0002\b\t¨\u0006\u000b"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "Lj/z1;", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "(Ljava/util/concurrent/ExecutorService;)Lj/z1;", "Ljava/util/concurrent/Executor;", "Lj/o0;", "c", "(Ljava/util/concurrent/Executor;)Lj/o0;", "b", "Lj/c2;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class b2 {
    @c2
    public static /* synthetic */ void a() {
    }

    @NotNull
    public static final Executor b(@NotNull o0 o0Var) {
        Executor q2;
        z1 z1Var = o0Var instanceof z1 ? (z1) o0Var : null;
        return (z1Var == null || (q2 = z1Var.q()) == null) ? new l1(o0Var) : q2;
    }

    @JvmName(name = Constants.MessagePayloadKeys.FROM)
    @NotNull
    public static final o0 c(@NotNull Executor executor) {
        o0 o0Var;
        l1 l1Var = executor instanceof l1 ? (l1) executor : null;
        return (l1Var == null || (o0Var = l1Var.f470j) == null) ? new a2(executor) : o0Var;
    }

    @JvmName(name = Constants.MessagePayloadKeys.FROM)
    @NotNull
    public static final z1 d(@NotNull ExecutorService executorService) {
        return new a2(executorService);
    }
}
