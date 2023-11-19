package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.node.Ref;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a*\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\t\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000\u001aB\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0001¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"ExtraItemsNearTheSlidingWindow", "", "VisibleItemsSlidingWindowSize", "calculateNearestItemsRange", "Lkotlin/ranges/IntRange;", "firstVisibleItem", "generateKeyToIndexMap", "", "", "range", "list", "Landroidx/compose/foundation/lazy/list/IntervalList;", "Landroidx/compose/foundation/lazy/list/LazyListIntervalContent;", "rememberStateOfItemsProvider", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "Lkotlin/ExtensionFunctionType;", "itemScope", "Landroidx/compose/ui/node/Ref;", "Landroidx/compose/foundation/lazy/list/LazyItemScopeImpl;", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/node/Ref;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyListItemsProviderImplKt {
    private static final int ExtraItemsNearTheSlidingWindow = 100;
    private static final int VisibleItemsSlidingWindowSize = 30;

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRange calculateNearestItemsRange(int i2) {
        IntRange until;
        int i3 = VisibleItemsSlidingWindowSize;
        int i4 = (i2 / i3) * i3;
        int i5 = ExtraItemsNearTheSlidingWindow;
        until = RangesKt___RangesKt.until(Math.max(i4 - i5, 0), i4 + i3 + i5);
        return until;
    }

    @NotNull
    public static final Map<Object, Integer> generateKeyToIndexMap(@NotNull IntRange range, @NotNull IntervalList<LazyListIntervalContent> list) {
        Map<Object, Integer> emptyMap;
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(list, "list");
        int first = range.getFirst();
        if (first >= 0) {
            int min = Math.min(range.getLast(), list.getTotalSize() - 1);
            if (min < first) {
                emptyMap = MapsKt__MapsKt.emptyMap();
                return emptyMap;
            }
            HashMap hashMap = new HashMap();
            int intervalIndexForItemIndex = IntervalListKt.intervalIndexForItemIndex(list, first);
            while (first <= min) {
                IntervalHolder<LazyListIntervalContent> intervalHolder = list.getIntervals().get(intervalIndexForItemIndex);
                Function1<Integer, Object> key = intervalHolder.getContent().getKey();
                if (key != null) {
                    int startIndex = first - intervalHolder.getStartIndex();
                    if (startIndex == intervalHolder.getSize()) {
                        intervalIndexForItemIndex++;
                    } else {
                        hashMap.put(key.invoke(Integer.valueOf(startIndex)), Integer.valueOf(first));
                        first++;
                    }
                } else {
                    intervalIndexForItemIndex++;
                    first = intervalHolder.getStartIndex() + intervalHolder.getSize();
                }
            }
            return hashMap;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Composable
    @NotNull
    public static final State<LazyListItemsProvider> rememberStateOfItemsProvider(@NotNull LazyListState state, @NotNull Function1<? super LazyListScope, Unit> content, @NotNull Ref<LazyItemScopeImpl> itemScope, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(itemScope, "itemScope");
        composer.startReplaceableGroup(112461157);
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composer, (i2 >> 3) & 14);
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(state);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(calculateNearestItemsRange(state.m435getFirstVisibleItemIndexNonObservableAUyieIw$foundation_release()), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        EffectsKt.LaunchedEffect(mutableState, new LazyListItemsProviderImplKt$rememberStateOfItemsProvider$1(state, mutableState, null), composer, 0);
        composer.startReplaceableGroup(-3686930);
        boolean changed2 = composer.changed(mutableState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new LazyListItemsProviderImplKt$rememberStateOfItemsProvider$2$1(rememberUpdatedState, itemScope, mutableState));
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        State<LazyListItemsProvider> state2 = (State) rememberedValue2;
        composer.endReplaceableGroup();
        return state2;
    }
}
