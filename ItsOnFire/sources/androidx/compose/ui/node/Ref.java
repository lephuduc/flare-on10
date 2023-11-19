package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/node/Ref;", "T", "", "()V", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class Ref<T> {
    public static final int $stable = 8;
    @Nullable
    private T value;

    @Nullable
    public final T getValue() {
        return this.value;
    }

    public final void setValue(@Nullable T t2) {
        this.value = t2;
    }
}
