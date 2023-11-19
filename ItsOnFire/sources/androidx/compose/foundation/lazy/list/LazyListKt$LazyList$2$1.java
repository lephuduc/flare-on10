package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemsProvider;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyListKt$LazyList$2$1 extends Lambda implements Function0<LazyLayoutItemsProvider> {
    public final /* synthetic */ State<LazyListItemsProvider> $stateOfItemsProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyListKt$LazyList$2$1(State<? extends LazyListItemsProvider> state) {
        super(0);
        this.$stateOfItemsProvider = state;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final LazyLayoutItemsProvider invoke() {
        return this.$stateOfItemsProvider.getValue();
    }
}
