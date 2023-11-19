package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TabRowKt$TabRow$2$1$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $divider;
    public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> $indicator;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $tabs;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.material.TabRowKt$TabRow$2$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        public final /* synthetic */ int $$dirty;
        public final /* synthetic */ long $constraints;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $divider;
        public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> $indicator;
        public final /* synthetic */ List<Placeable> $tabPlaceables;
        public final /* synthetic */ List<TabPosition> $tabPositions;
        public final /* synthetic */ int $tabRowHeight;
        public final /* synthetic */ int $tabRowWidth;
        public final /* synthetic */ int $tabWidth;
        public final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        /* renamed from: androidx.compose.material.TabRowKt$TabRow$2$1$1$1$3  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass3 extends Lambda implements Function2<Composer, Integer, Unit> {
            public final /* synthetic */ int $$dirty;
            public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> $indicator;
            public final /* synthetic */ List<TabPosition> $tabPositions;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass3(Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, List<TabPosition> list, int i2) {
                super(2);
                this.$indicator = function3;
                this.$tabPositions = list;
                this.$$dirty = i2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@Nullable Composer composer, int i2) {
                if (((i2 & 11) ^ 2) == 0 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    this.$indicator.invoke(this.$tabPositions, composer, Integer.valueOf(((this.$$dirty >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<? extends Placeable> list, SubcomposeMeasureScope subcomposeMeasureScope, Function2<? super Composer, ? super Integer, Unit> function2, int i2, long j2, int i3, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, List<TabPosition> list2, int i4, int i5) {
            super(1);
            this.$tabPlaceables = list;
            this.$this_SubcomposeLayout = subcomposeMeasureScope;
            this.$divider = function2;
            this.$tabWidth = i2;
            this.$constraints = j2;
            this.$tabRowHeight = i3;
            this.$indicator = function3;
            this.$tabPositions = list2;
            this.$$dirty = i4;
            this.$tabRowWidth = i5;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Placeable.PlacementScope layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            List<Placeable> list = this.$tabPlaceables;
            int i2 = this.$tabWidth;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Placeable.PlacementScope.placeRelative$default(layout, list.get(i3), i3 * i2, 0, 0.0f, 4, null);
            }
            List<Measurable> subcompose = this.$this_SubcomposeLayout.subcompose(TabSlots.Divider, this.$divider);
            long j2 = this.$constraints;
            int i4 = this.$tabRowHeight;
            int size2 = subcompose.size();
            for (int i5 = 0; i5 < size2; i5++) {
                Placeable mo2758measureBRTryo0 = subcompose.get(i5).mo2758measureBRTryo0(Constraints.m3284copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null));
                Placeable.PlacementScope.placeRelative$default(layout, mo2758measureBRTryo0, 0, i4 - mo2758measureBRTryo0.getHeight(), 0.0f, 4, null);
                i4 = i4;
                size2 = size2;
            }
            List<Measurable> subcompose2 = this.$this_SubcomposeLayout.subcompose(TabSlots.Indicator, ComposableLambdaKt.composableLambdaInstance(-985542172, true, new AnonymousClass3(this.$indicator, this.$tabPositions, this.$$dirty)));
            int i6 = this.$tabRowWidth;
            int i7 = this.$tabRowHeight;
            int size3 = subcompose2.size();
            for (int i8 = 0; i8 < size3; i8++) {
                Placeable.PlacementScope.placeRelative$default(layout, subcompose2.get(i8).mo2758measureBRTryo0(Constraints.Companion.m3301fixedJhjzzOo(i6, i7)), 0, 0, 0.0f, 4, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabRowKt$TabRow$2$1$1(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, int i2) {
        super(2);
        this.$tabs = function2;
        this.$divider = function22;
        this.$indicator = function3;
        this.$$dirty = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m1001invoke0kLqBqw(subcomposeMeasureScope, constraints.m3299unboximpl());
    }

    @NotNull
    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m1001invoke0kLqBqw(@NotNull SubcomposeMeasureScope SubcomposeLayout, long j2) {
        Object obj;
        int lastIndex;
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int m3293getMaxWidthimpl = Constraints.m3293getMaxWidthimpl(j2);
        List<Measurable> subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, this.$tabs);
        int size = subcompose.size();
        int i2 = m3293getMaxWidthimpl / size;
        ArrayList arrayList = new ArrayList(subcompose.size());
        int size2 = subcompose.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size2) {
            arrayList.add(subcompose.get(i4).mo2758measureBRTryo0(Constraints.m3284copyZbe2FdA$default(j2, i2, i2, 0, 0, 12, null)));
            i3 = i3;
            i4++;
            subcompose = subcompose;
        }
        int i5 = i3;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(i5);
            int height = ((Placeable) obj).getHeight();
            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            int i6 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    int i7 = i6 + 1;
                    Object obj2 = arrayList.get(i6);
                    int height2 = ((Placeable) obj2).getHeight();
                    if (height < height2) {
                        obj = obj2;
                        height = height2;
                    }
                    if (i6 == lastIndex) {
                        break;
                    }
                    i6 = i7;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        int height3 = placeable == null ? i5 : placeable.getHeight();
        ArrayList arrayList2 = new ArrayList(size);
        while (true) {
            int i8 = i5;
            if (i8 >= size) {
                return MeasureScope.DefaultImpls.layout$default(SubcomposeLayout, m3293getMaxWidthimpl, height3, null, new AnonymousClass1(arrayList, SubcomposeLayout, this.$divider, i2, j2, height3, this.$indicator, arrayList2, this.$$dirty, m3293getMaxWidthimpl), 4, null);
            }
            i5 = i8 + 1;
            arrayList2.add(new TabPosition(Dp.m3325constructorimpl(SubcomposeLayout.mo274toDpu2uoSUM(i2) * i8), SubcomposeLayout.mo274toDpu2uoSUM(i2), null));
        }
    }
}
