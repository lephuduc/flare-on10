package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$2 extends Lambda implements Function0<Float> {
    public final /* synthetic */ LazyListState $state;
    public final /* synthetic */ State<LazyListItemsProvider> $stateOfItemsProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazySemanticsKt$lazyListSemantics$1$accessibilityScrollState$2(LazyListState lazyListState, State<? extends LazyListItemsProvider> state) {
        super(0);
        this.$state = lazyListState;
        this.$stateOfItemsProvider = state;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Float invoke() {
        float firstVisibleItemScrollOffset;
        if (this.$state.getCanScrollForward$foundation_release()) {
            firstVisibleItemScrollOffset = this.$stateOfItemsProvider.getValue().getItemsCount() + 1.0f;
        } else {
            firstVisibleItemScrollOffset = (this.$state.getFirstVisibleItemScrollOffset() / 100000.0f) + this.$state.getFirstVisibleItemIndex();
        }
        return Float.valueOf(firstVisibleItemScrollOffset);
    }
}
