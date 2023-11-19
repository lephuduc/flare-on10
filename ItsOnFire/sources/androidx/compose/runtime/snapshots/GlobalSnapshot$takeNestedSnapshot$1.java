package androidx.compose.runtime.snapshots;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class GlobalSnapshot$takeNestedSnapshot$1 extends Lambda implements Function1<SnapshotIdSet, ReadonlySnapshot> {
    public final /* synthetic */ Function1<Object, Unit> $readObserver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshot$takeNestedSnapshot$1(Function1<Object, Unit> function1) {
        super(1);
        this.$readObserver = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final ReadonlySnapshot invoke(@NotNull SnapshotIdSet invalid) {
        int i2;
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        synchronized (SnapshotKt.getLock()) {
            i2 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i2 + 1;
        }
        return new ReadonlySnapshot(i2, invalid, this.$readObserver);
    }
}
