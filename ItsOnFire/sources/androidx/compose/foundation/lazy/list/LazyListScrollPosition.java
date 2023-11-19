package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J#\u0010\u0018\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0005J%\u0010\u001b\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u0005J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R)\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u001e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/foundation/lazy/list/LazyListScrollPosition;", "", "initialIndex", "", "initialScrollOffset", "(II)V", "hadFirstNotEmptyLayout", "", "<set-?>", "Landroidx/compose/foundation/lazy/list/DataIndex;", FirebaseAnalytics.Param.INDEX, "getIndex-AUyieIw", "()I", "I", "indexState", "Landroidx/compose/runtime/MutableState;", "lastKnownFirstItemKey", "observableIndex", "getObservableIndex", "observableScrollOffset", "getObservableScrollOffset", "scrollOffset", "getScrollOffset", "scrollOffsetState", "requestPosition", "", "requestPosition-NTjDD6g", "update", "update-NTjDD6g", "updateFromMeasureResult", "measureResult", "Landroidx/compose/foundation/lazy/list/LazyListMeasureResult;", "updateScrollPositionIfTheFirstItemWasMoved", "itemsProvider", "Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyListScrollPosition {
    @NotNull
    private static final Companion Companion = new Companion(null);
    private boolean hadFirstNotEmptyLayout;
    private int index;
    @NotNull
    private final MutableState<Integer> indexState;
    @Nullable
    private Object lastKnownFirstItemKey;
    private int scrollOffset;
    @NotNull
    private final MutableState<Integer> scrollOffsetState;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/list/LazyListScrollPosition$Companion;", "", "()V", "findLazyListIndexByKey", "Landroidx/compose/foundation/lazy/list/DataIndex;", "key", "lastKnownIndex", "itemsProvider", "Landroidx/compose/foundation/lazy/list/LazyListItemsProvider;", "findLazyListIndexByKey-M1M1bNc", "(Ljava/lang/Object;ILandroidx/compose/foundation/lazy/list/LazyListItemsProvider;)I", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: findLazyListIndexByKey-M1M1bNc  reason: not valid java name */
        public final int m478findLazyListIndexByKeyM1M1bNc(Object obj, int i2, LazyListItemsProvider lazyListItemsProvider) {
            Integer num;
            return obj == null ? i2 : ((i2 >= lazyListItemsProvider.getItemsCount() || !Intrinsics.areEqual(obj, lazyListItemsProvider.getKey(i2))) && (num = lazyListItemsProvider.getKeyToIndexMap().get(obj)) != null) ? DataIndex.m444constructorimpl(num.intValue()) : i2;
        }
    }

    public LazyListScrollPosition() {
        this(0, 0, 3, null);
    }

    public LazyListScrollPosition(int i2, int i3) {
        MutableState<Integer> mutableStateOf$default;
        MutableState<Integer> mutableStateOf$default2;
        this.index = DataIndex.m444constructorimpl(i2);
        this.scrollOffset = i3;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(m475getIndexAUyieIw()), null, 2, null);
        this.indexState = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(this.scrollOffset), null, 2, null);
        this.scrollOffsetState = mutableStateOf$default2;
    }

    public /* synthetic */ LazyListScrollPosition(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3);
    }

    /* renamed from: update-NTjDD6g  reason: not valid java name */
    private final void m474updateNTjDD6g(int i2, int i3) {
        if (!(((float) i2) >= 0.0f)) {
            throw new IllegalArgumentException(("Index should be non-negative (" + i2 + ')').toString());
        }
        if (!DataIndex.m447equalsimpl0(i2, m475getIndexAUyieIw())) {
            this.index = i2;
            this.indexState.setValue(Integer.valueOf(i2));
        }
        if (i3 != this.scrollOffset) {
            this.scrollOffset = i3;
            this.scrollOffsetState.setValue(Integer.valueOf(i3));
        }
    }

    /* renamed from: getIndex-AUyieIw  reason: not valid java name */
    public final int m475getIndexAUyieIw() {
        return this.index;
    }

    public final int getObservableIndex() {
        return this.indexState.getValue().intValue();
    }

    public final int getObservableScrollOffset() {
        return this.scrollOffsetState.getValue().intValue();
    }

    public final int getScrollOffset() {
        return this.scrollOffset;
    }

    /* renamed from: requestPosition-NTjDD6g  reason: not valid java name */
    public final void m476requestPositionNTjDD6g(int i2, int i3) {
        m474updateNTjDD6g(i2, i3);
        this.lastKnownFirstItemKey = null;
    }

    public final void updateFromMeasureResult(@NotNull LazyListMeasureResult measureResult) {
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        LazyMeasuredItem firstVisibleItem = measureResult.getFirstVisibleItem();
        this.lastKnownFirstItemKey = firstVisibleItem == null ? null : firstVisibleItem.getKey();
        if (this.hadFirstNotEmptyLayout || measureResult.getTotalItemsCount() > 0) {
            this.hadFirstNotEmptyLayout = true;
            int firstVisibleItemScrollOffset = measureResult.getFirstVisibleItemScrollOffset();
            if (((float) firstVisibleItemScrollOffset) >= 0.0f) {
                LazyMeasuredItem firstVisibleItem2 = measureResult.getFirstVisibleItem();
                m474updateNTjDD6g(DataIndex.m444constructorimpl(firstVisibleItem2 != null ? firstVisibleItem2.getIndex() : 0), firstVisibleItemScrollOffset);
                return;
            }
            throw new IllegalStateException(("scrollOffset should be non-negative (" + firstVisibleItemScrollOffset + ')').toString());
        }
    }

    public final void updateScrollPositionIfTheFirstItemWasMoved(@NotNull LazyListItemsProvider itemsProvider) {
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        m474updateNTjDD6g(Companion.m478findLazyListIndexByKeyM1M1bNc(this.lastKnownFirstItemKey, m475getIndexAUyieIw(), itemsProvider), this.scrollOffset);
    }
}
