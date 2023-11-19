package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import androidx.appcompat.R;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchPolicy;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 42\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00014B-\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0018\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0012H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0012H\u0016J\b\u0010%\u001a\u00020#H\u0016J\b\u0010&\u001a\u00020#H\u0016J\u0018\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020#H\u0016J\u0018\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0018H\u0002J\u0010\u00101\u001a\u00020#2\u0006\u00100\u001a\u00020\u0018H\u0016J\b\u00102\u001a\u00020#H\u0016J\u0010\u00103\u001a\u00020#2\u0006\u00100\u001a\u00020\u0018H\u0016R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutOnPostMeasureListener;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy$Subscriber;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "prefetchPolicy", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutState;", "subcomposeLayoutState", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "itemContentFactory", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "view", "Landroid/view/View;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchPolicy;Landroidx/compose/foundation/lazy/layout/LazyLayoutState;Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroid/view/View;)V", "averagePrecomposeTimeNs", "", "averagePremeasureTimeNs", "choreographer", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "indexToPrefetch", "", "isActive", "", "precomposedSlotHandle", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "prefetchScheduled", "premeasuringIsNeeded", "calculateAverageTime", "new", "current", "doFrame", "", "frameTimeNanos", "onAbandoned", "onForgotten", "onPostMeasure", "result", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureResult;", "placeablesProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;", "onRemembered", "precompose", "itemsProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemsProvider;", FirebaseAnalytics.Param.INDEX, "removeFromPrefetch", "run", "scheduleForPrefetch", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyLayoutPrefetcher implements RememberObserver, LazyLayoutOnPostMeasureListener, LazyLayoutPrefetchPolicy.Subscriber, Runnable, Choreographer.FrameCallback {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static long frameIntervalNs;
    private long averagePrecomposeTimeNs;
    private long averagePremeasureTimeNs;
    private final Choreographer choreographer;
    private int indexToPrefetch;
    private boolean isActive;
    @NotNull
    private final LazyLayoutItemContentFactory itemContentFactory;
    @Nullable
    private SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle;
    @NotNull
    private final LazyLayoutPrefetchPolicy prefetchPolicy;
    private boolean prefetchScheduled;
    private boolean premeasuringIsNeeded;
    @NotNull
    private final LazyLayoutState state;
    @NotNull
    private final SubcomposeLayoutState subcomposeLayoutState;
    @NotNull
    private final View view;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher$Companion;", "", "()V", "frameIntervalNs", "", "calculateFrameIntervalIfNeeded", "", "view", "Landroid/view/View;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void calculateFrameIntervalIfNeeded(View view) {
            if (LazyLayoutPrefetcher.frameIntervalNs == 0) {
                Display display = view.getDisplay();
                float f2 = 60.0f;
                if (!view.isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                LazyLayoutPrefetcher.frameIntervalNs = 1000000000 / f2;
            }
        }
    }

    public LazyLayoutPrefetcher(@NotNull LazyLayoutPrefetchPolicy prefetchPolicy, @NotNull LazyLayoutState state, @NotNull SubcomposeLayoutState subcomposeLayoutState, @NotNull LazyLayoutItemContentFactory itemContentFactory, @NotNull View view) {
        Intrinsics.checkNotNullParameter(prefetchPolicy, "prefetchPolicy");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subcomposeLayoutState, "subcomposeLayoutState");
        Intrinsics.checkNotNullParameter(itemContentFactory, "itemContentFactory");
        Intrinsics.checkNotNullParameter(view, "view");
        this.prefetchPolicy = prefetchPolicy;
        this.state = state;
        this.subcomposeLayoutState = subcomposeLayoutState;
        this.itemContentFactory = itemContentFactory;
        this.view = view;
        this.indexToPrefetch = -1;
        this.choreographer = Choreographer.getInstance();
        Companion.calculateFrameIntervalIfNeeded(view);
    }

    private final long calculateAverageTime(long j2, long j3) {
        if (j3 == 0) {
            return j2;
        }
        long j4 = 4;
        return (j2 / j4) + ((j3 / j4) * 3);
    }

    private final SubcomposeLayoutState.PrecomposedSlotHandle precompose(LazyLayoutItemsProvider lazyLayoutItemsProvider, int i2) {
        Object key = lazyLayoutItemsProvider.getKey(i2);
        return this.subcomposeLayoutState.precompose(key, this.itemContentFactory.getContent(i2, key));
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j2) {
        if (this.isActive) {
            this.view.post(this);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.isActive = false;
        this.prefetchPolicy.setPrefetcher$foundation_release(null);
        this.state.setOnPostMeasureListener$foundation_release(null);
        this.view.removeCallbacks(this);
        this.choreographer.removeFrameCallback(this);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutOnPostMeasureListener
    public void onPostMeasure(@NotNull LazyLayoutMeasureResult result, @NotNull LazyLayoutPlaceablesProvider placeablesProvider) {
        boolean z;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(placeablesProvider, "placeablesProvider");
        int i2 = this.indexToPrefetch;
        if (!this.premeasuringIsNeeded || i2 == -1) {
            return;
        }
        if (!this.isActive) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i2 < this.state.getItemsProvider$foundation_release().invoke().getItemsCount()) {
            List<LazyLayoutItemInfo> visibleItemsInfo = result.getVisibleItemsInfo();
            int size = visibleItemsInfo.size();
            int i3 = 0;
            while (true) {
                z = true;
                if (i3 >= size) {
                    z = false;
                    break;
                }
                int i4 = i3 + 1;
                if (visibleItemsInfo.get(i3).getIndex() == i2) {
                    break;
                }
                i3 = i4;
            }
            if (z) {
                this.premeasuringIsNeeded = false;
            } else {
                placeablesProvider.m438getAndMeasure0kLqBqw(i2, this.prefetchPolicy.m439getConstraintsmsEJaDk());
            }
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.prefetchPolicy.setPrefetcher$foundation_release(this);
        this.state.setOnPostMeasureListener$foundation_release(this);
        this.isActive = true;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchPolicy.Subscriber
    public void removeFromPrefetch(int i2) {
        if (i2 == this.indexToPrefetch) {
            SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = this.precomposedSlotHandle;
            if (precomposedSlotHandle != null) {
                precomposedSlotHandle.dispose();
            }
            this.indexToPrefetch = -1;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Choreographer choreographer;
        if (this.indexToPrefetch != -1 && this.prefetchScheduled && this.isActive) {
            boolean z = true;
            if (this.precomposedSlotHandle == null) {
                Trace.beginSection("compose:lazylist:prefetch:compose");
                try {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(this.view.getDrawingTime()) + frameIntervalNs;
                    long nanoTime = System.nanoTime();
                    if (nanoTime <= nanos && this.averagePrecomposeTimeNs + nanoTime >= nanos) {
                        choreographer = this.choreographer;
                        choreographer.postFrameCallback(this);
                        Unit unit = Unit.INSTANCE;
                    }
                    int i2 = this.indexToPrefetch;
                    LazyLayoutItemsProvider invoke = this.state.getItemsProvider$foundation_release().invoke();
                    if (this.view.getWindowVisibility() == 0) {
                        if (i2 < 0 || i2 >= invoke.getItemsCount()) {
                            z = false;
                        }
                        if (z) {
                            this.precomposedSlotHandle = precompose(invoke, i2);
                            this.averagePrecomposeTimeNs = calculateAverageTime(System.nanoTime() - nanoTime, this.averagePrecomposeTimeNs);
                            choreographer = this.choreographer;
                            choreographer.postFrameCallback(this);
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                    this.prefetchScheduled = false;
                    Unit unit22 = Unit.INSTANCE;
                } finally {
                }
            } else {
                Trace.beginSection("compose:lazylist:prefetch:measure");
                try {
                    long nanos2 = TimeUnit.MILLISECONDS.toNanos(this.view.getDrawingTime()) + frameIntervalNs;
                    long nanoTime2 = System.nanoTime();
                    if (nanoTime2 <= nanos2 && this.averagePremeasureTimeNs + nanoTime2 >= nanos2) {
                        this.choreographer.postFrameCallback(this);
                        Unit unit3 = Unit.INSTANCE;
                    }
                    if (this.view.getWindowVisibility() == 0) {
                        this.premeasuringIsNeeded = true;
                        this.state.remeasure();
                        this.averagePremeasureTimeNs = calculateAverageTime(System.nanoTime() - nanoTime2, this.averagePremeasureTimeNs);
                    }
                    this.prefetchScheduled = false;
                    Unit unit32 = Unit.INSTANCE;
                } finally {
                }
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchPolicy.Subscriber
    public void scheduleForPrefetch(int i2) {
        this.indexToPrefetch = i2;
        this.precomposedSlotHandle = null;
        this.premeasuringIsNeeded = false;
        if (this.prefetchScheduled) {
            return;
        }
        this.prefetchScheduled = true;
        this.view.post(this);
    }
}
