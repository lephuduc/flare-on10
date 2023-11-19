package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.Lazy_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.node.Ref;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ \u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0002\b\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\nH\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/lazy/list/LazyListItemsProviderImpl;", "Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;", "itemScope", "Landroidx/compose/ui/node/Ref;", "Landroidx/compose/foundation/lazy/list/LazyItemScopeImpl;", "list", "Landroidx/compose/foundation/lazy/list/IntervalList;", "Landroidx/compose/foundation/lazy/list/LazyListIntervalContent;", "headerIndexes", "", "", "nearestItemsRange", "Lkotlin/ranges/IntRange;", "(Landroidx/compose/ui/node/Ref;Landroidx/compose/foundation/lazy/list/IntervalList;Ljava/util/List;Lkotlin/ranges/IntRange;)V", "getHeaderIndexes", "()Ljava/util/List;", "itemsCount", "getItemsCount", "()I", "keyToIndexMap", "", "", "getKeyToIndexMap", "()Ljava/util/Map;", "getContent", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", FirebaseAnalytics.Param.INDEX, "(I)Lkotlin/jvm/functions/Function2;", "getKey", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyListItemsProviderImpl implements LazyListItemsProvider {
    @NotNull
    private final List<Integer> headerIndexes;
    @NotNull
    private final Ref<LazyItemScopeImpl> itemScope;
    @NotNull
    private final Map<Object, Integer> keyToIndexMap;
    @NotNull
    private final IntervalList<LazyListIntervalContent> list;

    public LazyListItemsProviderImpl(@NotNull Ref<LazyItemScopeImpl> itemScope, @NotNull IntervalList<LazyListIntervalContent> list, @NotNull List<Integer> headerIndexes, @NotNull IntRange nearestItemsRange) {
        Intrinsics.checkNotNullParameter(itemScope, "itemScope");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(headerIndexes, "headerIndexes");
        Intrinsics.checkNotNullParameter(nearestItemsRange, "nearestItemsRange");
        this.itemScope = itemScope;
        this.list = list;
        this.headerIndexes = headerIndexes;
        this.keyToIndexMap = LazyListItemsProviderImplKt.generateKeyToIndexMap(nearestItemsRange, list);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemsProvider
    @NotNull
    public Function2<Composer, Integer, Unit> getContent(int i2) {
        IntervalHolder intervalForIndex = IntervalListKt.intervalForIndex(this.list, i2);
        Function2<LazyItemScope, Integer, Function2<Composer, Integer, Unit>> content = ((LazyListIntervalContent) intervalForIndex.getContent()).getContent();
        LazyItemScopeImpl value = this.itemScope.getValue();
        Intrinsics.checkNotNull(value);
        return content.invoke(value, Integer.valueOf(i2 - intervalForIndex.getStartIndex()));
    }

    @Override // androidx.compose.foundation.lazy.list.LazyListItemsProvider
    @NotNull
    public List<Integer> getHeaderIndexes() {
        return this.headerIndexes;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemsProvider
    public int getItemsCount() {
        return this.list.getTotalSize();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemsProvider
    @NotNull
    public Object getKey(int i2) {
        IntervalHolder intervalForIndex = IntervalListKt.intervalForIndex(this.list, i2);
        int startIndex = i2 - intervalForIndex.getStartIndex();
        Function1<Integer, Object> key = ((LazyListIntervalContent) intervalForIndex.getContent()).getKey();
        Object invoke = key == null ? null : key.invoke(Integer.valueOf(startIndex));
        return invoke == null ? Lazy_androidKt.getDefaultLazyKeyFor(i2) : invoke;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemsProvider
    @NotNull
    public Map<Object, Integer> getKeyToIndexMap() {
        return this.keyToIndexMap;
    }
}
