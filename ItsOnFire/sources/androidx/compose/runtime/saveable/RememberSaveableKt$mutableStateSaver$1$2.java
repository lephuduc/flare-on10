package androidx.compose.runtime.saveable;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/MutableState;", "T", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class RememberSaveableKt$mutableStateSaver$1$2 extends Lambda implements Function1<MutableState<Object>, MutableState<T>> {
    public final /* synthetic */ Saver<T, Object> $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$mutableStateSaver$1$2(Saver<T, Object> saver) {
        super(1);
        this.$this_with = saver;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final MutableState<T> invoke(@NotNull MutableState<Object> it) {
        Object obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof SnapshotMutableState) {
            if (it.getValue() != null) {
                Saver<T, Object> saver = this.$this_with;
                Object value = it.getValue();
                Intrinsics.checkNotNull(value);
                obj = saver.restore(value);
            } else {
                obj = null;
            }
            return SnapshotStateKt.mutableStateOf(obj, ((SnapshotMutableState) it).getPolicy());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
