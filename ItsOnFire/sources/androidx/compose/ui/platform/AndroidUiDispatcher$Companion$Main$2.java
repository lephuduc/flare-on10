package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.appcompat.R;
import androidx.core.os.HandlerCompat;
import j.m1;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidUiDispatcher$Companion$Main$2 extends Lambda implements Function0<CoroutineContext> {
    public static final AndroidUiDispatcher$Companion$Main$2 INSTANCE = new AndroidUiDispatcher$Companion$Main$2();

    public AndroidUiDispatcher$Companion$Main$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final CoroutineContext invoke() {
        boolean isMainThread;
        isMainThread = AndroidUiDispatcher_androidKt.isMainThread();
        Choreographer choreographer = isMainThread ? Choreographer.getInstance() : (Choreographer) j.j.f(m1.e(), new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null));
        Intrinsics.checkNotNullExpressionValue(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
        Handler createAsync = HandlerCompat.createAsync(Looper.getMainLooper());
        Intrinsics.checkNotNullExpressionValue(createAsync, "createAsync(Looper.getMainLooper())");
        AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, createAsync, null);
        return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
    }
}
