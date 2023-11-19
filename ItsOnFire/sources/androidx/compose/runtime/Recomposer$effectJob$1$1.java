package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import j.n2;
import j.q;
import j.y1;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o.e0;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class Recomposer$effectJob$1$1 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$effectJob$1$1(Recomposer recomposer) {
        super(1);
        this.this$0 = recomposer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th) {
        n2 n2Var;
        q qVar;
        e0 e0Var;
        e0 e0Var2;
        boolean z;
        q qVar2;
        q qVar3;
        CancellationException a2 = y1.a("Recomposer effect job completed", th);
        Object obj = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        synchronized (obj) {
            n2Var = recomposer.runnerJob;
            qVar = null;
            if (n2Var != null) {
                e0Var2 = recomposer._state;
                e0Var2.setValue(Recomposer.State.ShuttingDown);
                z = recomposer.isClosed;
                if (z) {
                    qVar2 = recomposer.workContinuation;
                    if (qVar2 != null) {
                        qVar3 = recomposer.workContinuation;
                        recomposer.workContinuation = null;
                        n2Var.H(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                        qVar = qVar3;
                    }
                } else {
                    n2Var.cancel(a2);
                }
                qVar3 = null;
                recomposer.workContinuation = null;
                n2Var.H(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                qVar = qVar3;
            } else {
                recomposer.closeCause = a2;
                e0Var = recomposer._state;
                e0Var.setValue(Recomposer.State.ShutDown);
                Unit unit = Unit.INSTANCE;
            }
        }
        if (qVar == null) {
            return;
        }
        Result.Companion companion = Result.Companion;
        qVar.resumeWith(Result.m3581constructorimpl(Unit.INSTANCE));
    }
}
