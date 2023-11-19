package q;

import j.c4;
import j.i2;
import j.n2;
import j.t1;
import j.u3;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aW\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0012\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\t0\rH\u0000\u001a;\u0010\u0017\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u0082\b\"\u001a\u0010\u001d\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001b\u0010\u001c\"\u001a\u0010\u001f\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u0012\u0004\b\u001e\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"T", "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", "result", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "onCancellation", "f", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Lq/l;", "", "h", "", "contState", "", "mode", "doYield", "Lkotlin/Function0;", "block", "b", "Lq/r0;", "a", "Lq/r0;", "getUNDEFINED$annotations", "()V", "UNDEFINED", "getREUSABLE_CLAIMED$annotations", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class m {
    @NotNull

    /* renamed from: a */
    public static final r0 f2028a = new r0("UNDEFINED");
    @JvmField
    @NotNull

    /* renamed from: b */
    public static final r0 f2029b = new r0("REUSABLE_CLAIMED");

    public static final /* synthetic */ r0 a() {
        return f2028a;
    }

    public static final boolean b(l<?> lVar, Object obj, int i2, boolean z, Function0<Unit> function0) {
        t1 b2 = u3.f529a.b();
        if (z && b2.C()) {
            return false;
        }
        if (b2.B()) {
            lVar.f2025o = obj;
            lVar.f450l = i2;
            b2.v(lVar);
            return true;
        }
        b2.y(true);
        try {
            function0.invoke();
            do {
            } while (b2.E());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }

    public static /* synthetic */ boolean c(l lVar, Object obj, int i2, boolean z, Function0 function0, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        t1 b2 = u3.f529a.b();
        if (z && b2.C()) {
            return false;
        }
        if (b2.B()) {
            lVar.f2025o = obj;
            lVar.f450l = i2;
            b2.v(lVar);
            return true;
        }
        b2.y(true);
        try {
            function0.invoke();
            do {
            } while (b2.E());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void e() {
    }

    @i2
    public static final <T> void f(@NotNull Continuation<? super T> continuation, @NotNull Object obj, @Nullable Function1<? super Throwable, Unit> function1) {
        boolean z;
        if (!(continuation instanceof l)) {
            continuation.resumeWith(obj);
            return;
        }
        l lVar = (l) continuation;
        Object c2 = j.k0.c(obj, function1);
        if (lVar.f2023m.isDispatchNeeded(lVar.getContext())) {
            lVar.f2025o = c2;
            lVar.f450l = 1;
            lVar.f2023m.dispatch(lVar.getContext(), lVar);
            return;
        }
        t1 b2 = u3.f529a.b();
        if (b2.B()) {
            lVar.f2025o = c2;
            lVar.f450l = 1;
            b2.v(lVar);
            return;
        }
        b2.y(true);
        try {
            n2 n2Var = (n2) lVar.getContext().get(n2.f488b);
            if (n2Var == null || n2Var.b()) {
                z = false;
            } else {
                CancellationException u2 = n2Var.u();
                lVar.d(c2, u2);
                Result.Companion companion = Result.Companion;
                lVar.resumeWith(Result.m3581constructorimpl(ResultKt.createFailure(u2)));
                z = true;
            }
            if (!z) {
                Continuation<T> continuation2 = lVar.f2024n;
                Object obj2 = lVar.f2026p;
                CoroutineContext context = continuation2.getContext();
                Object c3 = w0.c(context, obj2);
                c4<?> g2 = c3 != w0.f2057a ? j.n0.g(continuation2, context, c3) : null;
                lVar.f2024n.resumeWith(obj);
                Unit unit = Unit.INSTANCE;
                if (g2 == null || g2.y1()) {
                    w0.a(context, c3);
                }
            }
            do {
            } while (b2.E());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void g(Continuation continuation, Object obj, Function1 function1, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        f(continuation, obj, function1);
    }

    public static final boolean h(@NotNull l<? super Unit> lVar) {
        Unit unit = Unit.INSTANCE;
        t1 b2 = u3.f529a.b();
        if (b2.C()) {
            return false;
        }
        if (b2.B()) {
            lVar.f2025o = unit;
            lVar.f450l = 1;
            b2.v(lVar);
            return true;
        }
        b2.y(true);
        try {
            lVar.run();
            do {
            } while (b2.E());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
