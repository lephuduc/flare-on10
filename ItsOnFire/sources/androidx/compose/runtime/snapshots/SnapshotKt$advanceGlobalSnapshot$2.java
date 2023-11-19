package androidx.compose.runtime.snapshots;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SnapshotKt$advanceGlobalSnapshot$2 extends Lambda implements Function1<SnapshotIdSet, Unit> {
    public static final SnapshotKt$advanceGlobalSnapshot$2 INSTANCE = new SnapshotKt$advanceGlobalSnapshot$2();

    public SnapshotKt$advanceGlobalSnapshot$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SnapshotIdSet snapshotIdSet) {
        invoke2(snapshotIdSet);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull SnapshotIdSet it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }
}
