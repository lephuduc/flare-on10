package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.appcompat.R;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "setValue", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ObjectRef {
    @Nullable
    private Object value;

    public ObjectRef(@Nullable Object obj) {
        this.value = obj;
    }

    @Nullable
    public final Object getValue() {
        return this.value;
    }

    public final void setValue(@Nullable Object obj) {
        this.value = obj;
    }
}
