package androidx.compose.runtime.snapshots;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0002\u0010\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0002J\b\u0010\u0018\u001a\u00020\tH\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "id", "", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "readObserver", "Lkotlin/Function1;", "", "", "writeObserver", "parent", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "deactivated", "", "getParent", "()Landroidx/compose/runtime/snapshots/MutableSnapshot;", "root", "Landroidx/compose/runtime/snapshots/Snapshot;", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "apply", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "deactivate", "dispose", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class NestedMutableSnapshot extends MutableSnapshot {
    private boolean deactivated;
    @NotNull
    private final MutableSnapshot parent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedMutableSnapshot(int i2, @NotNull SnapshotIdSet invalid, @Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function12, @NotNull MutableSnapshot parent) {
        super(i2, invalid, function1, function12);
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        parent.nestedActivated$runtime_release(this);
    }

    private final void deactivate() {
        if (this.deactivated) {
            return;
        }
        this.deactivated = true;
        this.parent.nestedDeactivated$runtime_release(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e A[Catch: all -> 0x00bf, TryCatch #0 {, blocks: (B:13:0x002d, B:15:0x0032, B:18:0x0039, B:22:0x0057, B:24:0x0061, B:25:0x006d, B:27:0x0074, B:29:0x007e, B:30:0x0085, B:26:0x0071), top: B:39:0x002d }] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.Set] */
    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult apply() {
        /*
            r6 = this;
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r6.parent
            boolean r0 = r0.getApplied$runtime_release()
            if (r0 != 0) goto Lc2
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r6.parent
            boolean r0 = r0.getDisposed$runtime_release()
            if (r0 == 0) goto L12
            goto Lc2
        L12:
            java.util.Set r0 = r6.getModified$runtime_release()
            int r1 = r6.getId()
            if (r0 == 0) goto L27
            androidx.compose.runtime.snapshots.MutableSnapshot r2 = r6.parent
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = r2.getInvalid$runtime_release()
            java.util.Map r2 = androidx.compose.runtime.snapshots.SnapshotKt.access$optimisticMerges(r2, r6, r3)
            goto L28
        L27:
            r2 = 0
        L28:
            java.lang.Object r3 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
            monitor-enter(r3)
            androidx.compose.runtime.snapshots.SnapshotKt.access$validateOpen(r6)     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto L71
            int r4 = r0.size()     // Catch: java.lang.Throwable -> Lbf
            if (r4 != 0) goto L39
            goto L71
        L39:
            androidx.compose.runtime.snapshots.MutableSnapshot r4 = r6.getParent()     // Catch: java.lang.Throwable -> Lbf
            int r4 = r4.getId()     // Catch: java.lang.Throwable -> Lbf
            androidx.compose.runtime.snapshots.MutableSnapshot r5 = r6.getParent()     // Catch: java.lang.Throwable -> Lbf
            androidx.compose.runtime.snapshots.SnapshotIdSet r5 = r5.getInvalid$runtime_release()     // Catch: java.lang.Throwable -> Lbf
            androidx.compose.runtime.snapshots.SnapshotApplyResult r2 = r6.innerApply$runtime_release(r4, r2, r5)     // Catch: java.lang.Throwable -> Lbf
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Success r4 = androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.INSTANCE     // Catch: java.lang.Throwable -> Lbf
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)     // Catch: java.lang.Throwable -> Lbf
            if (r4 != 0) goto L57
            monitor-exit(r3)
            return r2
        L57:
            androidx.compose.runtime.snapshots.MutableSnapshot r2 = r6.getParent()     // Catch: java.lang.Throwable -> Lbf
            java.util.Set r2 = r2.getModified$runtime_release()     // Catch: java.lang.Throwable -> Lbf
            if (r2 != 0) goto L6d
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> Lbf
            r2.<init>()     // Catch: java.lang.Throwable -> Lbf
            androidx.compose.runtime.snapshots.MutableSnapshot r4 = r6.getParent()     // Catch: java.lang.Throwable -> Lbf
            r4.setModified(r2)     // Catch: java.lang.Throwable -> Lbf
        L6d:
            r2.addAll(r0)     // Catch: java.lang.Throwable -> Lbf
            goto L74
        L71:
            r6.close$runtime_release()     // Catch: java.lang.Throwable -> Lbf
        L74:
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r6.getParent()     // Catch: java.lang.Throwable -> Lbf
            int r0 = r0.getId()     // Catch: java.lang.Throwable -> Lbf
            if (r0 >= r1) goto L85
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r6.getParent()     // Catch: java.lang.Throwable -> Lbf
            r0.advance$runtime_release()     // Catch: java.lang.Throwable -> Lbf
        L85:
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r6.getParent()     // Catch: java.lang.Throwable -> Lbf
            androidx.compose.runtime.snapshots.MutableSnapshot r2 = r6.getParent()     // Catch: java.lang.Throwable -> Lbf
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.getInvalid$runtime_release()     // Catch: java.lang.Throwable -> Lbf
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.clear(r1)     // Catch: java.lang.Throwable -> Lbf
            androidx.compose.runtime.snapshots.SnapshotIdSet r4 = r6.getPreviousIds$runtime_release()     // Catch: java.lang.Throwable -> Lbf
            androidx.compose.runtime.snapshots.SnapshotIdSet r2 = r2.andNot(r4)     // Catch: java.lang.Throwable -> Lbf
            r0.setInvalid$runtime_release(r2)     // Catch: java.lang.Throwable -> Lbf
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r6.getParent()     // Catch: java.lang.Throwable -> Lbf
            r0.recordPrevious$runtime_release(r1)     // Catch: java.lang.Throwable -> Lbf
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r6.getParent()     // Catch: java.lang.Throwable -> Lbf
            androidx.compose.runtime.snapshots.SnapshotIdSet r1 = r6.getPreviousIds$runtime_release()     // Catch: java.lang.Throwable -> Lbf
            r0.recordPreviousList$runtime_release(r1)     // Catch: java.lang.Throwable -> Lbf
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r3)
            r0 = 1
            r6.setApplied$runtime_release(r0)
            r6.deactivate()
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Success r6 = androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.INSTANCE
            return r6
        Lbf:
            r6 = move-exception
            monitor-exit(r3)
            throw r6
        Lc2:
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Failure r0 = new androidx.compose.runtime.snapshots.SnapshotApplyResult$Failure
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.NestedMutableSnapshot.apply():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime_release()) {
            return;
        }
        super.dispose();
        deactivate();
    }

    @NotNull
    public final MutableSnapshot getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot getRoot() {
        return this.parent.getRoot();
    }
}
