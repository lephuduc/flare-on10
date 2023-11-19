package j;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import j.n2;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b5\u0010%J\b\u0010\u0004\u001a\u00020\u0003H\u0017J\u0013\u0010\u0006\u001a\u00020\u0005H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\n\u001a\u00060\bj\u0002`\tH\u0017J1\u0010\u0013\u001a\u00020\u00122'\u0010\u0011\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\u000bj\u0002`\u0010H\u0017JA\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032'\u0010\u0011\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\u000bj\u0002`\u0010H\u0017J\u0018\u0010\u0017\u001a\u00020\u00052\u000e\u0010\u000f\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0017J\u0012\u0010\u0018\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0017J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017J\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u0014\u0010!\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u001a\u0010)\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010#R\u001a\u0010*\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010#R\u001a\u00100\u001a\u00020,8VX\u0097\u0004¢\u0006\f\u0012\u0004\b/\u0010%\u001a\u0004\b-\u0010.R \u00104\u001a\b\u0012\u0004\u0012\u00020\u0002018VX\u0097\u0004¢\u0006\f\u0012\u0004\b3\u0010%\u001a\u0004\b\u001f\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Lj/b3;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lj/n2;", "", "start", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "u", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lj/p1;", "H", "onCancelling", "invokeImmediately", "r", "cancel", "a", "Lj/y;", "child", "Lj/w;", "X", "", "toString", "k", "Ljava/lang/String;", "message", "b", "()Z", "isActive$annotations", "()V", "isActive", "e", "isCompleted$annotations", "isCompleted", "isCancelled", "isCancelled$annotations", "Lt/c;", "N", "()Lt/c;", "getOnJoin$annotations", "onJoin", "Lkotlin/sequences/Sequence;", "()Lkotlin/sequences/Sequence;", "getChildren$annotations", "children", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class b3 extends AbstractCoroutineContextElement implements n2 {
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public static final b3 f403j = new b3();
    @NotNull

    /* renamed from: k  reason: collision with root package name */
    public static final String f404k = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    public b3() {
        super(n2.f488b);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = f404k)
    public static /* synthetic */ void q() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = f404k)
    public static /* synthetic */ void s() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = f404k)
    public static /* synthetic */ void t() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = f404k)
    public static /* synthetic */ void v() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = f404k)
    public static /* synthetic */ void w() {
    }

    @Override // j.n2
    @Deprecated(level = DeprecationLevel.WARNING, message = f404k)
    @NotNull
    public p1 H(@NotNull Function1<? super Throwable, Unit> function1) {
        return c3.f407j;
    }

    @Override // j.n2
    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    public n2 M(@NotNull n2 n2Var) {
        return n2.a.h(this, n2Var);
    }

    @Override // j.n2
    @NotNull
    public t.c N() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // j.n2
    @Deprecated(level = DeprecationLevel.WARNING, message = f404k)
    @NotNull
    public w X(@NotNull y yVar) {
        return c3.f407j;
    }

    @Override // j.n2
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean a(Throwable th) {
        return false;
    }

    @Override // j.n2
    public boolean b() {
        return true;
    }

    @Override // j.n2
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        cancel(null);
    }

    @Override // j.n2
    @Deprecated(level = DeprecationLevel.WARNING, message = f404k)
    public void cancel(@Nullable CancellationException cancellationException) {
    }

    @Override // j.n2
    public boolean e() {
        return false;
    }

    @Override // j.n2
    public boolean isCancelled() {
        return false;
    }

    @Override // j.n2
    @NotNull
    public Sequence<n2> k() {
        Sequence<n2> emptySequence;
        emptySequence = SequencesKt__SequencesKt.emptySequence();
        return emptySequence;
    }

    @Override // j.n2
    @Deprecated(level = DeprecationLevel.WARNING, message = f404k)
    @Nullable
    public Object n(@NotNull Continuation<? super Unit> continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // j.n2
    @Deprecated(level = DeprecationLevel.WARNING, message = f404k)
    @NotNull
    public p1 r(boolean z, boolean z2, @NotNull Function1<? super Throwable, Unit> function1) {
        return c3.f407j;
    }

    @Override // j.n2
    @Deprecated(level = DeprecationLevel.WARNING, message = f404k)
    public boolean start() {
        return false;
    }

    @NotNull
    public String toString() {
        return "NonCancellable";
    }

    @Override // j.n2
    @Deprecated(level = DeprecationLevel.WARNING, message = f404k)
    @NotNull
    public CancellationException u() {
        throw new IllegalStateException("This job is always active");
    }
}
