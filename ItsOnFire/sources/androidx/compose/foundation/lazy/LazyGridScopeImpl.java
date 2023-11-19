package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.list.IntervalHolder;
import androidx.compose.foundation.lazy.list.IntervalListKt;
import androidx.compose.foundation.lazy.list.MutableIntervalList;
import androidx.compose.runtime.Composer;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001:\u0002@AB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d2\u0006\u0010#\u001a\u00020\u0003H\u0002J3\u0010$\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)\u0012\u0004\u0012\u00020\u00030&0%2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,J=\u0010-\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)\u0012\u0004\u0012\u00020\u00030&0%2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,H\u0002J(\u0010.\u001a\r\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,H\u0002¢\u0006\u0002\u0010/JI\u00100\u001a\u00020(2\u0019\u00101\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u000102¢\u0006\u0002\b\t2\u001c\u00103\u001a\u0018\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020(02¢\u0006\u0002\b)¢\u0006\u0002\b\tH\u0016ø\u0001\u0000¢\u0006\u0002\u00104Jl\u00105\u001a\u00020(2\u0006\u00106\u001a\u00020\u00032\u001f\u00101\u001a\u001b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t21\u00107\u001a-\u0012\u0004\u0012\u00020,\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020(0\u0006¢\u0006\u0002\b)¢\u0006\u0002\b\tH\u0016ø\u0001\u0000¢\u0006\u0002\u0010;J(\u0010<\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u0003H\u0002R(\u0010\u0005\u001a\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tX\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u000ej\b\u0012\u0004\u0012\u00020\u0003`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006B"}, d2 = {"Landroidx/compose/foundation/lazy/LazyGridScopeImpl;", "Landroidx/compose/foundation/lazy/LazyGridScope;", "nColumns", "", "(I)V", "DefaultSpan", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/GridItemSpan;", "Lkotlin/ExtensionFunctionType;", "bucketSize", "getBucketSize", "()I", "bucketStartItemIndex", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "cachedBucket", "", "cachedBucketIndex", "hasCustomSpans", "", "getHasCustomSpans$foundation_release", "()Z", "setHasCustomSpans$foundation_release", "(Z)V", "intervals", "Landroidx/compose/foundation/lazy/list/MutableIntervalList;", "Landroidx/compose/foundation/lazy/LazyGridScopeImpl$IntervalData;", "lastInterval", "Landroidx/compose/foundation/lazy/list/IntervalHolder;", "lastLineIndex", "lastLineStartItemIndex", "totalSize", "getTotalSize", "cachedIntervalForIndex", "itemIndex", "contentFor", "", "Lkotlin/Pair;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "lineIndex", "scope", "Landroidx/compose/foundation/lazy/LazyItemScope;", "contentForLineStartingWith", "contentOf", "(ILandroidx/compose/foundation/lazy/LazyItemScope;)Lkotlin/jvm/functions/Function2;", "item", "span", "Lkotlin/Function1;", FirebaseAnalytics.Param.CONTENT, "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", FirebaseAnalytics.Param.ITEMS, "count", "itemContent", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function4;)V", "spanOf", "row", "column", "maxSpan", "IntervalData", "LazyGridItemSpanScopeImpl", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyGridScopeImpl implements LazyGridScope {
    @NotNull
    private final Function2<LazyGridItemSpanScope, Integer, GridItemSpan> DefaultSpan;
    @NotNull
    private final ArrayList<Integer> bucketStartItemIndex;
    @NotNull
    private final List<Integer> cachedBucket;
    private int cachedBucketIndex;
    private boolean hasCustomSpans;
    @NotNull
    private final MutableIntervalList<IntervalData> intervals = new MutableIntervalList<>();
    @Nullable
    private IntervalHolder<IntervalData> lastInterval;
    private int lastLineIndex;
    private int lastLineStartItemIndex;
    private final int nColumns;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BQ\u0012(\u0010\u0002\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b0\u0003¢\u0006\u0002\b\t\u0012\u001d\u0010\n\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0002\u0010\rR3\u0010\u0002\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b0\u0003¢\u0006\u0002\b\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR+\u0010\n\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u0003¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/lazy/LazyGridScopeImpl$IntervalData;", "", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "span", "Landroidx/compose/foundation/lazy/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/GridItemSpan;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "getContent", "()Lkotlin/jvm/functions/Function2;", "getSpan", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class IntervalData {
        @NotNull
        private final Function2<LazyItemScope, Integer, Function2<Composer, Integer, Unit>> content;
        @NotNull
        private final Function2<LazyGridItemSpanScope, Integer, GridItemSpan> span;

        /* JADX WARN: Multi-variable type inference failed */
        public IntervalData(@NotNull Function2<? super LazyItemScope, ? super Integer, ? extends Function2<? super Composer, ? super Integer, Unit>> content, @NotNull Function2<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> span) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(span, "span");
            this.content = content;
            this.span = span;
        }

        @NotNull
        public final Function2<LazyItemScope, Integer, Function2<Composer, Integer, Unit>> getContent() {
            return this.content;
        }

        @NotNull
        public final Function2<LazyGridItemSpanScope, Integer, GridItemSpan> getSpan() {
            return this.span;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/lazy/LazyGridScopeImpl$LazyGridItemSpanScopeImpl;", "Landroidx/compose/foundation/lazy/LazyGridItemSpanScope;", "()V", "itemColumn", "", "getItemColumn", "()I", "setItemColumn", "(I)V", "itemRow", "getItemRow", "setItemRow", "maxCurrentLineSpan", "getMaxCurrentLineSpan", "setMaxCurrentLineSpan", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class LazyGridItemSpanScopeImpl implements LazyGridItemSpanScope {
        @NotNull
        public static final LazyGridItemSpanScopeImpl INSTANCE = new LazyGridItemSpanScopeImpl();
        private static int itemColumn;
        private static int itemRow;
        private static int maxCurrentLineSpan;

        private LazyGridItemSpanScopeImpl() {
        }

        @Override // androidx.compose.foundation.lazy.LazyGridItemSpanScope
        public int getItemColumn() {
            return itemColumn;
        }

        @Override // androidx.compose.foundation.lazy.LazyGridItemSpanScope
        public int getItemRow() {
            return itemRow;
        }

        @Override // androidx.compose.foundation.lazy.LazyGridItemSpanScope
        public int getMaxCurrentLineSpan() {
            return maxCurrentLineSpan;
        }

        public void setItemColumn(int i2) {
            itemColumn = i2;
        }

        public void setItemRow(int i2) {
            itemRow = i2;
        }

        public void setMaxCurrentLineSpan(int i2) {
            maxCurrentLineSpan = i2;
        }
    }

    public LazyGridScopeImpl(int i2) {
        this.nColumns = i2;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        this.bucketStartItemIndex = arrayList;
        this.cachedBucketIndex = -1;
        this.cachedBucket = new ArrayList();
        this.DefaultSpan = LazyGridScopeImpl$DefaultSpan$1.INSTANCE;
    }

    private final IntervalHolder<IntervalData> cachedIntervalForIndex(int i2) {
        IntervalHolder<IntervalData> intervalHolder = this.lastInterval;
        if (intervalHolder != null) {
            int startIndex = intervalHolder.getStartIndex();
            boolean z = false;
            if (i2 < intervalHolder.getStartIndex() + intervalHolder.getSize() && startIndex <= i2) {
                z = true;
            }
            if (z) {
                return intervalHolder;
            }
        }
        IntervalHolder<IntervalData> intervalForIndex = IntervalListKt.intervalForIndex(this.intervals, i2);
        this.lastInterval = intervalForIndex;
        return intervalForIndex;
    }

    private final List<Pair<Function2<Composer, Integer, Unit>, Integer>> contentForLineStartingWith(int i2, int i3, LazyItemScope lazyItemScope) {
        ArrayList arrayList = new ArrayList(this.nColumns);
        int i4 = 0;
        while (i4 < this.nColumns && i2 < getTotalSize()) {
            int spanOf = spanOf(i2, i3, i4, this.nColumns - i4);
            arrayList.add(TuplesKt.to(contentOf(i2, lazyItemScope), Integer.valueOf(spanOf)));
            i2++;
            i4 += spanOf;
        }
        return arrayList;
    }

    private final Function2<Composer, Integer, Unit> contentOf(int i2, LazyItemScope lazyItemScope) {
        IntervalHolder<IntervalData> cachedIntervalForIndex = cachedIntervalForIndex(i2);
        return cachedIntervalForIndex.getContent().getContent().invoke(lazyItemScope, Integer.valueOf(i2 - cachedIntervalForIndex.getStartIndex()));
    }

    private final int getBucketSize() {
        return ((int) Math.sqrt((getTotalSize() * 1.0d) / this.nColumns)) + 1;
    }

    private final int spanOf(int i2, int i3, int i4, int i5) {
        int coerceIn;
        IntervalHolder<IntervalData> cachedIntervalForIndex = cachedIntervalForIndex(i2);
        LazyGridItemSpanScopeImpl lazyGridItemSpanScopeImpl = LazyGridItemSpanScopeImpl.INSTANCE;
        lazyGridItemSpanScopeImpl.setItemRow(i3);
        lazyGridItemSpanScopeImpl.setItemColumn(i4);
        lazyGridItemSpanScopeImpl.setMaxCurrentLineSpan(i5);
        coerceIn = RangesKt___RangesKt.coerceIn(GridItemSpan.m425getCurrentLineSpanimpl(cachedIntervalForIndex.getContent().getSpan().invoke(lazyGridItemSpanScopeImpl, Integer.valueOf(i2 - cachedIntervalForIndex.getStartIndex())).m428unboximpl()), 1, i5);
        return coerceIn;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a A[LOOP:0: B:35:0x009a->B:64:0x009a, LOOP_START, PHI: r1 r3 
      PHI: (r1v10 int) = (r1v9 int), (r1v11 int) binds: [B:34:0x0098, B:64:0x009a] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v7 int) = (r3v6 int), (r3v8 int) binds: [B:34:0x0098, B:64:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<kotlin.Pair<kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>, java.lang.Integer>> contentFor(int r10, @org.jetbrains.annotations.NotNull androidx.compose.foundation.lazy.LazyItemScope r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyGridScopeImpl.contentFor(int, androidx.compose.foundation.lazy.LazyItemScope):java.util.List");
    }

    public final boolean getHasCustomSpans$foundation_release() {
        return this.hasCustomSpans;
    }

    public final int getTotalSize() {
        return this.intervals.getTotalSize();
    }

    @Override // androidx.compose.foundation.lazy.LazyGridScope
    public void item(@Nullable Function1<? super LazyGridItemSpanScope, GridItemSpan> function1, @NotNull Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        MutableIntervalList<IntervalData> mutableIntervalList = this.intervals;
        LazyGridScopeImpl$item$1 lazyGridScopeImpl$item$1 = new LazyGridScopeImpl$item$1(content);
        Function2<LazyGridItemSpanScope, Integer, GridItemSpan> lazyGridScopeImpl$item$2$1 = function1 == null ? null : new LazyGridScopeImpl$item$2$1(function1);
        if (lazyGridScopeImpl$item$2$1 == null) {
            lazyGridScopeImpl$item$2$1 = this.DefaultSpan;
        }
        mutableIntervalList.add(1, new IntervalData(lazyGridScopeImpl$item$1, lazyGridScopeImpl$item$2$1));
        if (function1 != null) {
            this.hasCustomSpans = true;
        }
    }

    @Override // androidx.compose.foundation.lazy.LazyGridScope
    public void items(int i2, @Nullable Function2<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> function2, @NotNull Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        this.intervals.add(i2, new IntervalData(new LazyGridScopeImpl$items$1(itemContent), function2 == null ? this.DefaultSpan : function2));
        if (function2 != null) {
            this.hasCustomSpans = true;
        }
    }

    public final void setHasCustomSpans$foundation_release(boolean z) {
        this.hasCustomSpans = z;
    }
}
