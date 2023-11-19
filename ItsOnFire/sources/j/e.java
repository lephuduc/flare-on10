package j;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\b\u0004B\u001d\u0012\u0014\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\n\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lj/e;", "T", "", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lj/c1;", "a", "[Lj/c1;", "deferreds", "<init>", "([Lj/c1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class e<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f416b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount");
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final c1<T>[] f417a;
    @NotNull
    public volatile /* synthetic */ int notCompletedCount;

    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R<\u0010\u001b\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00152\u0012\u0010\u0016\u001a\u000e\u0018\u00010\u0014R\b\u0012\u0004\u0012\u00028\u00000\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lj/e$a;", "Lj/u2;", "", "cause", "", "g0", "(Ljava/lang/Throwable;)V", "Lj/q;", "", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "Lj/q;", "continuation", "Lj/p1;", "o", "Lj/p1;", "k0", "()Lj/p1;", "m0", "(Lj/p1;)V", "handle", "Lj/e$b;", "Lj/e;", "value", "j0", "()Lj/e$b;", "l0", "(Lj/e$b;)V", "disposer", "<init>", "(Lj/e;Lj/q;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public final class a extends u2 {
        @NotNull
        private volatile /* synthetic */ Object _disposer = null;
        @NotNull

        /* renamed from: n  reason: collision with root package name */
        public final q<List<? extends T>> f418n;

        /* renamed from: o  reason: collision with root package name */
        public p1 f419o;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull q<? super List<? extends T>> qVar) {
            this.f418n = qVar;
        }

        @Override // j.g0
        public void g0(@Nullable Throwable th) {
            if (th != null) {
                Object B = this.f418n.B(th);
                if (B != null) {
                    this.f418n.Z(B);
                    e<T>.b j0 = j0();
                    if (j0 != null) {
                        j0.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (e.f416b.decrementAndGet(e.this) == 0) {
                q<List<? extends T>> qVar = this.f418n;
                c1[] c1VarArr = e.this.f417a;
                ArrayList arrayList = new ArrayList(c1VarArr.length);
                for (c1 c1Var : c1VarArr) {
                    arrayList.add(c1Var.g());
                }
                Result.Companion companion = Result.Companion;
                qVar.resumeWith(Result.m3581constructorimpl(arrayList));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            g0(th);
            return Unit.INSTANCE;
        }

        @Nullable
        public final e<T>.b j0() {
            return (b) this._disposer;
        }

        @NotNull
        public final p1 k0() {
            p1 p1Var = this.f419o;
            if (p1Var != null) {
                return p1Var;
            }
            Intrinsics.throwUninitializedPropertyAccessException("handle");
            return null;
        }

        public final void l0(@Nullable e<T>.b bVar) {
            this._disposer = bVar;
        }

        public final void m0(@NotNull p1 p1Var) {
            this.f419o = p1Var;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R$\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f0\nR\b\u0012\u0004\u0012\u00028\u00000\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lj/e$b;", "Lj/o;", "", "b", "", "cause", "a", "", "toString", "", "Lj/e$a;", "Lj/e;", "j", "[Lj/e$a;", "nodes", "<init>", "(Lj/e;[Lj/e$a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes2.dex */
    public final class b extends o {
        @NotNull

        /* renamed from: j  reason: collision with root package name */
        public final e<T>.a[] f421j;

        public b(@NotNull e<T>.a[] aVarArr) {
            this.f421j = aVarArr;
        }

        @Override // j.p
        public void a(@Nullable Throwable th) {
            b();
        }

        public final void b() {
            for (e<T>.a aVar : this.f421j) {
                aVar.k0().dispose();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            a(th);
            return Unit.INSTANCE;
        }

        @NotNull
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f421j + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull c1<? extends T>[] c1VarArr) {
        this.f417a = c1VarArr;
        this.notCompletedCount = c1VarArr.length;
    }

    @Nullable
    public final Object b(@NotNull Continuation<? super List<? extends T>> continuation) {
        Continuation intercepted;
        Object coroutine_suspended;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        r rVar = new r(intercepted, 1);
        rVar.E();
        int length = this.f417a.length;
        a[] aVarArr = new a[length];
        for (int i2 = 0; i2 < length; i2++) {
            c1 c1Var = this.f417a[i2];
            c1Var.start();
            a aVar = new a(rVar);
            aVar.m0(c1Var.H(aVar));
            Unit unit = Unit.INSTANCE;
            aVarArr[i2] = aVar;
        }
        e<T>.b bVar = new b(aVarArr);
        for (int i3 = 0; i3 < length; i3++) {
            aVarArr[i3].l0(bVar);
        }
        if (rVar.e()) {
            bVar.b();
        } else {
            rVar.A(bVar);
        }
        Object x = rVar.x();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (x == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return x;
    }
}
