package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.node.Ref;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyListItemsProviderImplKt$rememberStateOfItemsProvider$2$1 extends Lambda implements Function0<LazyListItemsProvider> {
    public final /* synthetic */ Ref<LazyItemScopeImpl> $itemScope;
    public final /* synthetic */ State<Function1<LazyListScope, Unit>> $latestContent;
    public final /* synthetic */ MutableState<IntRange> $nearestItemsRangeState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyListItemsProviderImplKt$rememberStateOfItemsProvider$2$1(State<? extends Function1<? super LazyListScope, Unit>> state, Ref<LazyItemScopeImpl> ref, MutableState<IntRange> mutableState) {
        super(0);
        this.$latestContent = state;
        this.$itemScope = ref;
        this.$nearestItemsRangeState = mutableState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final LazyListItemsProvider invoke() {
        LazyListScopeImpl lazyListScopeImpl = new LazyListScopeImpl();
        this.$latestContent.getValue().invoke(lazyListScopeImpl);
        return new LazyListItemsProviderImpl(this.$itemScope, lazyListScopeImpl.getIntervals(), lazyListScopeImpl.getHeaderIndexes(), this.$nearestItemsRangeState.getValue());
    }
}
