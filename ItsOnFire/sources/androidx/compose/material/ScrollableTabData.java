package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.unit.Density;
import j.l;
import j.u0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\t\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002J,\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/compose/material/ScrollableTabData;", "", "Landroidx/compose/material/TabPosition;", "Landroidx/compose/ui/unit/Density;", "density", "", "edgeOffset", "", "tabPositions", "calculateTabOffset", "selectedTab", "", "onLaidOut", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "Lj/u0;", "coroutineScope", "Lj/u0;", "Ljava/lang/Integer;", "<init>", "(Landroidx/compose/foundation/ScrollState;Lj/u0;)V", "material_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class ScrollableTabData {
    @NotNull
    private final u0 coroutineScope;
    @NotNull
    private final ScrollState scrollState;
    @Nullable
    private Integer selectedTab;

    public ScrollableTabData(@NotNull ScrollState scrollState, @NotNull u0 coroutineScope) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.scrollState = scrollState;
        this.coroutineScope = coroutineScope;
    }

    private final int calculateTabOffset(TabPosition tabPosition, Density density, int i2, List<TabPosition> list) {
        Object last;
        int coerceAtLeast;
        int coerceIn;
        last = CollectionsKt___CollectionsKt.last((List<? extends Object>) list);
        int mo271roundToPx0680j_4 = density.mo271roundToPx0680j_4(((TabPosition) last).m989getRightD9Ej5fM()) + i2;
        int maxValue = mo271roundToPx0680j_4 - this.scrollState.getMaxValue();
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mo271roundToPx0680j_4 - maxValue, 0);
        coerceIn = RangesKt___RangesKt.coerceIn(density.mo271roundToPx0680j_4(tabPosition.m988getLeftD9Ej5fM()) - ((maxValue / 2) - (density.mo271roundToPx0680j_4(tabPosition.m990getWidthD9Ej5fM()) / 2)), 0, coerceAtLeast);
        return coerceIn;
    }

    public final void onLaidOut(@NotNull Density density, int i2, @NotNull List<TabPosition> tabPositions, int i3) {
        Object orNull;
        int calculateTabOffset;
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
        Integer num = this.selectedTab;
        if (num != null && num.intValue() == i3) {
            return;
        }
        this.selectedTab = Integer.valueOf(i3);
        orNull = CollectionsKt___CollectionsKt.getOrNull(tabPositions, i3);
        TabPosition tabPosition = (TabPosition) orNull;
        if (tabPosition == null || this.scrollState.getValue() == (calculateTabOffset = calculateTabOffset(tabPosition, density, i2, tabPositions))) {
            return;
        }
        l.f(this.coroutineScope, null, null, new ScrollableTabData$onLaidOut$1$1(this, calculateTabOffset, null), 3, null);
    }
}
