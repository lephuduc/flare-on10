package v;

import androidx.appcompat.R;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j.b0;
import j.c1;
import j.c2;
import j.i2;
import j.n2;
import j.p1;
import j.q;
import j.r;
import j.w;
import j.y;
import j.z;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u001a(\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002\u001a#\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"T", "Lj/c1;", "Lcom/google/android/gms/tasks/Task;", "g", "c", "Lcom/google/android/gms/tasks/CancellationTokenSource;", "cancellationTokenSource", GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG, "e", "i", "(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/CancellationTokenSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "kotlinx-coroutines-play-services"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class c {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ CancellationTokenSource f2252j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CancellationTokenSource cancellationTokenSource) {
            super(1);
            this.f2252j = cancellationTokenSource;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th) {
            this.f2252j.cancel();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0089\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001J\u0013\u0010\u0006\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bH\u0097\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0097\u0001J\u0019\u0010\t\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0096\u0001J8\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00102\u0006\u0010\u0011\u001a\u00028\u00012\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00028\u00010\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u001a\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u0017*\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0096\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00060\u000ej\u0002`\u000fH\u0097\u0001J\u0010\u0010\u001d\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0097\u0001JB\u0010(\u001a\u00020'2\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2'\u0010&\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\b0\"j\u0002`%H\u0097\u0001J2\u0010)\u001a\u00020'2'\u0010&\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\b0\"j\u0002`%H\u0096\u0001J\u0013\u0010*\u001a\u00020\bH\u0096Aø\u0001\u0000¢\u0006\u0004\b*\u0010\u0007J\u0015\u0010,\u001a\u00020+2\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0096\u0001J\u0011\u0010.\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0096\u0003J\u0011\u00101\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0097\u0003J\t\u00102\u001a\u00020\fH\u0096\u0001R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020/038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00109\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010:\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u00108R\u0014\u0010<\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u00108R\u0018\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00188\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000?8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010E\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006G"}, d2 = {"v/c$b", "Lj/c1;", "Lj/y;", "child", "Lj/w;", "X", "x", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cancel", "", "cause", "", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "R", "initial", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "get", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "u", "g", "()Ljava/lang/Object;", "l", "onCancelling", "invokeImmediately", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lj/p1;", "r", "H", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Lkotlin/coroutines/CoroutineContext;", "minusKey", "context", "plus", "Lj/n2;", "other", "M", "start", "Lkotlin/sequences/Sequence;", "k", "()Lkotlin/sequences/Sequence;", "children", "b", "()Z", "isActive", "isCancelled", "e", "isCompleted", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "Lt/d;", "j", "()Lt/d;", "onAwait", "Lt/c;", "N", "()Lt/c;", "onJoin", "kotlinx-coroutines-play-services"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public static final class b implements c1<T> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ z<T> f2253j;

        public b(z<T> zVar) {
            this.f2253j = zVar;
        }

        @Override // j.n2
        @NotNull
        public p1 H(@NotNull Function1<? super Throwable, Unit> function1) {
            return this.f2253j.H(function1);
        }

        @Override // j.n2
        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public n2 M(@NotNull n2 n2Var) {
            return this.f2253j.M(n2Var);
        }

        @Override // j.n2
        @NotNull
        public t.c N() {
            return this.f2253j.N();
        }

        @Override // j.n2
        @i2
        @NotNull
        public w X(@NotNull y yVar) {
            return this.f2253j.X(yVar);
        }

        @Override // j.n2
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public /* synthetic */ boolean a(Throwable th) {
            return this.f2253j.a(th);
        }

        @Override // j.n2
        public boolean b() {
            return this.f2253j.b();
        }

        @Override // j.n2
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public /* synthetic */ void cancel() {
            this.f2253j.cancel();
        }

        @Override // j.n2
        public void cancel(@Nullable CancellationException cancellationException) {
            this.f2253j.cancel(cancellationException);
        }

        @Override // j.n2
        public boolean e() {
            return this.f2253j.e();
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public <R> R fold(R r2, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) this.f2253j.fold(r2, function2);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
        @Override // j.c1
        @c2
        public T g() {
            return this.f2253j.g();
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        @Nullable
        public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
            return (E) this.f2253j.get(key);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element
        @NotNull
        public CoroutineContext.Key<?> getKey() {
            return this.f2253j.getKey();
        }

        @Override // j.n2
        public boolean isCancelled() {
            return this.f2253j.isCancelled();
        }

        @Override // j.c1
        @NotNull
        public t.d<T> j() {
            return this.f2253j.j();
        }

        @Override // j.n2
        @NotNull
        public Sequence<n2> k() {
            return this.f2253j.k();
        }

        @Override // j.c1
        @c2
        @Nullable
        public Throwable l() {
            return this.f2253j.l();
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        @NotNull
        public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
            return this.f2253j.minusKey(key);
        }

        @Override // j.n2
        @Nullable
        public Object n(@NotNull Continuation<? super Unit> continuation) {
            return this.f2253j.n(continuation);
        }

        @Override // kotlin.coroutines.CoroutineContext
        @NotNull
        public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
            return this.f2253j.plus(coroutineContext);
        }

        @Override // j.n2
        @i2
        @NotNull
        public p1 r(boolean z, boolean z2, @NotNull Function1<? super Throwable, Unit> function1) {
            return this.f2253j.r(z, z2, function1);
        }

        @Override // j.n2
        public boolean start() {
            return this.f2253j.start();
        }

        @Override // j.n2
        @i2
        @NotNull
        public CancellationException u() {
            return this.f2253j.u();
        }

        @Override // j.c1
        @Nullable
        public Object x(@NotNull Continuation<? super T> continuation) {
            return this.f2253j.x(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: v.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0101c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ CancellationTokenSource f2254j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ c1<T> f2255k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ TaskCompletionSource<T> f2256l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0101c(CancellationTokenSource cancellationTokenSource, c1<? extends T> c1Var, TaskCompletionSource<T> taskCompletionSource) {
            super(1);
            this.f2254j = cancellationTokenSource;
            this.f2255k = c1Var;
            this.f2256l = taskCompletionSource;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th) {
            if (th instanceof CancellationException) {
                this.f2254j.cancel();
                return;
            }
            Throwable l2 = this.f2255k.l();
            if (l2 == null) {
                this.f2256l.setResult(this.f2255k.g());
                return;
            }
            TaskCompletionSource<T> taskCompletionSource = this.f2256l;
            Exception exc = l2 instanceof Exception ? (Exception) l2 : null;
            if (exc == null) {
                exc = new RuntimeExecutionException(l2);
            }
            taskCompletionSource.setException(exc);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "it", "Lcom/google/android/gms/tasks/Task;", "kotlin.jvm.PlatformType", "onComplete"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class d<TResult> implements OnCompleteListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q<T> f2257a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(q<? super T> qVar) {
            this.f2257a = qVar;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(@NotNull Task<T> task) {
            Object createFailure;
            Continuation continuation;
            Exception exception = task.getException();
            if (exception == null) {
                boolean isCanceled = task.isCanceled();
                q<T> qVar = this.f2257a;
                if (isCanceled) {
                    q.a.a(qVar, null, 1, null);
                    return;
                }
                Result.Companion companion = Result.Companion;
                createFailure = task.getResult();
                continuation = qVar;
            } else {
                Continuation continuation2 = this.f2257a;
                Result.Companion companion2 = Result.Companion;
                createFailure = ResultKt.createFailure(exception);
                continuation = continuation2;
            }
            continuation.resumeWith(Result.m3581constructorimpl(createFailure));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ CancellationTokenSource f2258j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CancellationTokenSource cancellationTokenSource) {
            super(1);
            this.f2258j = cancellationTokenSource;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th) {
            this.f2258j.cancel();
        }
    }

    @NotNull
    public static final <T> c1<T> c(@NotNull Task<T> task) {
        return e(task, null);
    }

    @c2
    @NotNull
    public static final <T> c1<T> d(@NotNull Task<T> task, @NotNull CancellationTokenSource cancellationTokenSource) {
        return e(task, cancellationTokenSource);
    }

    public static final <T> c1<T> e(Task<T> task, CancellationTokenSource cancellationTokenSource) {
        final z c2 = b0.c(null, 1, null);
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception != null) {
                c2.d(exception);
            } else if (task.isCanceled()) {
                n2.a.b(c2, null, 1, null);
            } else {
                c2.P(task.getResult());
            }
        } else {
            task.addOnCompleteListener(v.a.f2250j, new OnCompleteListener() { // from class: v.b
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    c.f(z.this, task2);
                }
            });
        }
        if (cancellationTokenSource != null) {
            c2.H(new a(cancellationTokenSource));
        }
        return new b(c2);
    }

    public static final void f(z zVar, Task task) {
        Exception exception = task.getException();
        if (exception != null) {
            zVar.d(exception);
        } else if (task.isCanceled()) {
            n2.a.b(zVar, null, 1, null);
        } else {
            zVar.P(task.getResult());
        }
    }

    @NotNull
    public static final <T> Task<T> g(@NotNull c1<? extends T> c1Var) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        c1Var.H(new C0101c(cancellationTokenSource, c1Var, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @c2
    @Nullable
    public static final <T> Object h(@NotNull Task<T> task, @NotNull CancellationTokenSource cancellationTokenSource, @NotNull Continuation<? super T> continuation) {
        return j(task, cancellationTokenSource, continuation);
    }

    @Nullable
    public static final <T> Object i(@NotNull Task<T> task, @NotNull Continuation<? super T> continuation) {
        return j(task, null, continuation);
    }

    public static final <T> Object j(Task<T> task, CancellationTokenSource cancellationTokenSource, Continuation<? super T> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception == null) {
                if (task.isCanceled()) {
                    throw new CancellationException("Task " + task + " was cancelled normally.");
                }
                return task.getResult();
            }
            throw exception;
        }
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        r rVar = new r(intercepted, 1);
        rVar.E();
        task.addOnCompleteListener(v.a.f2250j, new d(rVar));
        if (cancellationTokenSource != null) {
            rVar.A(new e(cancellationTokenSource));
        }
        Object x = rVar.x();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (x == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return x;
    }
}
