package androidx.compose.ui.viewinterop;

import androidx.appcompat.R;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidViewHolder$runUpdate$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ AndroidViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$runUpdate$1(AndroidViewHolder androidViewHolder) {
        super(0);
        this.this$0 = androidViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean z;
        SnapshotStateObserver snapshotStateObserver;
        Function1 function1;
        z = this.this$0.hasUpdateBlock;
        if (z) {
            snapshotStateObserver = this.this$0.snapshotObserver;
            AndroidViewHolder androidViewHolder = this.this$0;
            function1 = androidViewHolder.onCommitAffectingUpdate;
            snapshotStateObserver.observeReads(androidViewHolder, function1, this.this$0.getUpdate());
        }
    }
}
