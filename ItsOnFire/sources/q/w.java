package q;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\fJ-\u0010\u0007\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0003\u0018\u0001*\u00060\u0001j\u0002`\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bJ\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0014J\u000f\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Lq/w;", "Lq/y;", "Lkotlinx/coroutines/internal/Node;", "T", "Lkotlin/Function1;", "", "block", "g0", "", "i0", "X", "j0", "()V", "", "h0", "()Z", "isEmpty", "V", "isRemoved", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public class w extends y {
    @Override // q.y
    public boolean V() {
        return false;
    }

    @Override // q.y
    @Nullable
    public y X() {
        return null;
    }

    @Override // q.y
    public /* bridge */ /* synthetic */ boolean Y() {
        return ((Boolean) i0()).booleanValue();
    }

    public final /* synthetic */ <T extends y> void g0(Function1<? super T, Unit> function1) {
        for (y yVar = (y) Q(); !Intrinsics.areEqual(yVar, this); yVar = yVar.R()) {
            Intrinsics.reifiedOperationMarker(3, "T");
            if (yVar instanceof y) {
                function1.invoke(yVar);
            }
        }
    }

    public final boolean h0() {
        return Q() == this;
    }

    @NotNull
    public final Void i0() {
        throw new IllegalStateException("head cannot be removed".toString());
    }

    public final void j0() {
        y yVar = (y) Q();
        y yVar2 = this;
        while (!Intrinsics.areEqual(yVar, this)) {
            y R = yVar.R();
            yVar.f0(yVar2, R);
            yVar2 = yVar;
            yVar = R;
        }
        f0(yVar2, (y) Q());
    }
}
