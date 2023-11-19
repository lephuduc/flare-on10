package k;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.messaging.Constants;
import j.m1;
import j.q;
import j.r;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0001\u001a\u0013\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002\u001a\u001e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002\"\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroid/os/Handler;", "", "name", "Lk/e;", "g", "(Landroid/os/Handler;Ljava/lang/String;)Lk/e;", "Landroid/os/Looper;", "", "async", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj/q;", "cont", "", "l", "Landroid/view/Choreographer;", "choreographer", "j", "a", "J", "MAX_DELAY", "b", "Lk/e;", "getMain$annotations", "()V", "Main", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final long f604a = 4611686018427387903L;
    @JvmField
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public static final e f605b;
    @Nullable
    private static volatile Choreographer choreographer;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "run", "()V", "j/k3$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class a implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ q f606j;

        public a(q qVar) {
            this.f606j = qVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.l(this.f606j);
        }
    }

    static {
        Object m3581constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m3581constructorimpl = Result.m3581constructorimpl(new d(d(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m3581constructorimpl = Result.m3581constructorimpl(ResultKt.createFailure(th));
        }
        f605b = Result.m3587isFailureimpl(m3581constructorimpl) ? null : m3581constructorimpl;
    }

    @VisibleForTesting
    @NotNull
    public static final Handler d(@NotNull Looper looper, boolean z) {
        if (z) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        return new Handler(looper);
    }

    @Nullable
    public static final Object e(@NotNull Continuation<? super Long> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        Continuation intercepted2;
        Object coroutine_suspended2;
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            intercepted2 = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
            r rVar = new r(intercepted2, 1);
            rVar.E();
            j(choreographer2, rVar);
            Object x = rVar.x();
            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (x == coroutine_suspended2) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return x;
        }
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        r rVar2 = new r(intercepted, 1);
        rVar2.E();
        m1.e().dispatch(EmptyCoroutineContext.INSTANCE, new a(rVar2));
        Object x2 = rVar2.x();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (x2 == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return x2;
    }

    @JvmOverloads
    @JvmName(name = Constants.MessagePayloadKeys.FROM)
    @NotNull
    public static final e f(@NotNull Handler handler) {
        return h(handler, null, 1, null);
    }

    @JvmOverloads
    @JvmName(name = Constants.MessagePayloadKeys.FROM)
    @NotNull
    public static final e g(@NotNull Handler handler, @Nullable String str) {
        return new d(handler, str);
    }

    public static /* synthetic */ e h(Handler handler, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        return g(handler, str);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void i() {
    }

    public static final void j(Choreographer choreographer2, final q<? super Long> qVar) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: k.f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                g.k(q.this, j2);
            }
        });
    }

    public static final void k(q qVar, long j2) {
        qVar.t(m1.e(), Long.valueOf(j2));
    }

    public static final void l(q<? super Long> qVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            Intrinsics.checkNotNull(choreographer2);
            choreographer = choreographer2;
        }
        j(choreographer2, qVar);
    }
}
