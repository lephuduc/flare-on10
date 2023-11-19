package androidx.compose.material;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import j.u0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TabRowKt$ScrollableTabRow$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $divider;
    public final /* synthetic */ float $edgePadding;
    public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> $indicator;
    public final /* synthetic */ int $selectedTabIndex;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $tabs;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {
        public final /* synthetic */ int $$dirty;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $divider;
        public final /* synthetic */ float $edgePadding;
        public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> $indicator;
        public final /* synthetic */ ScrollableTabData $scrollableTabData;
        public final /* synthetic */ int $selectedTabIndex;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $tabs;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        /* renamed from: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$2  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
            public final /* synthetic */ int $$dirty;
            public final /* synthetic */ long $constraints;
            public final /* synthetic */ Function2<Composer, Integer, Unit> $divider;
            public final /* synthetic */ Function3<List<TabPosition>, Composer, Integer, Unit> $indicator;
            public final /* synthetic */ Ref.IntRef $layoutHeight;
            public final /* synthetic */ Ref.IntRef $layoutWidth;
            public final /* synthetic */ int $padding;
            public final /* synthetic */ ScrollableTabData $scrollableTabData;
            public final /* synthetic */ int $selectedTabIndex;
            public final /* synthetic */ List<Placeable> $tabPlaceables;
            public final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;

            @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
            /* renamed from: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$2$3  reason: invalid class name */
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
                        this.$indicator.invoke(this.$tabPositions, composer, Integer.valueOf(((this.$$dirty >> 12) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(int i2, List<? extends Placeable> list, SubcomposeMeasureScope subcomposeMeasureScope, Function2<? super Composer, ? super Integer, Unit> function2, ScrollableTabData scrollableTabData, int i3, long j2, Ref.IntRef intRef, Ref.IntRef intRef2, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, int i4) {
                super(1);
                this.$padding = i2;
                this.$tabPlaceables = list;
                this.$this_SubcomposeLayout = subcomposeMeasureScope;
                this.$divider = function2;
                this.$scrollableTabData = scrollableTabData;
                this.$selectedTabIndex = i3;
                this.$constraints = j2;
                this.$layoutWidth = intRef;
                this.$layoutHeight = intRef2;
                this.$indicator = function3;
                this.$$dirty = i4;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                ArrayList arrayList = new ArrayList();
                int i2 = this.$padding;
                List<Placeable> list = this.$tabPlaceables;
                SubcomposeMeasureScope subcomposeMeasureScope = this.$this_SubcomposeLayout;
                int size = list.size();
                int i3 = i2;
                for (int i4 = 0; i4 < size; i4++) {
                    Placeable placeable = list.get(i4);
                    Placeable.PlacementScope.placeRelative$default(layout, placeable, i3, 0, 0.0f, 4, null);
                    arrayList.add(new TabPosition(subcomposeMeasureScope.mo274toDpu2uoSUM(i3), subcomposeMeasureScope.mo274toDpu2uoSUM(placeable.getWidth()), null));
                    i3 += placeable.getWidth();
                }
                List<Measurable> subcompose = this.$this_SubcomposeLayout.subcompose(TabSlots.Divider, this.$divider);
                long j2 = this.$constraints;
                Ref.IntRef intRef = this.$layoutWidth;
                Ref.IntRef intRef2 = this.$layoutHeight;
                int size2 = subcompose.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    int i6 = intRef.element;
                    Placeable mo2758measureBRTryo0 = subcompose.get(i5).mo2758measureBRTryo0(Constraints.m3284copyZbe2FdA$default(j2, i6, i6, 0, 0, 8, null));
                    Placeable.PlacementScope.placeRelative$default(layout, mo2758measureBRTryo0, 0, intRef2.element - mo2758measureBRTryo0.getHeight(), 0.0f, 4, null);
                    intRef2 = intRef2;
                    intRef = intRef;
                    size2 = size2;
                }
                List<Measurable> subcompose2 = this.$this_SubcomposeLayout.subcompose(TabSlots.Indicator, ComposableLambdaKt.composableLambdaInstance(-985545011, true, new AnonymousClass3(this.$indicator, arrayList, this.$$dirty)));
                Ref.IntRef intRef3 = this.$layoutWidth;
                Ref.IntRef intRef4 = this.$layoutHeight;
                int size3 = subcompose2.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    Placeable.PlacementScope.placeRelative$default(layout, subcompose2.get(i7).mo2758measureBRTryo0(Constraints.Companion.m3301fixedJhjzzOo(intRef3.element, intRef4.element)), 0, 0, 0.0f, 4, null);
                }
                this.$scrollableTabData.onLaidOut(this.$this_SubcomposeLayout, this.$padding, arrayList, this.$selectedTabIndex);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(float f2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, ScrollableTabData scrollableTabData, int i2, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, int i3) {
            super(2);
            this.$edgePadding = f2;
            this.$tabs = function2;
            this.$divider = function22;
            this.$scrollableTabData = scrollableTabData;
            this.$selectedTabIndex = i2;
            this.$indicator = function3;
            this.$$dirty = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
            return m1000invoke0kLqBqw(subcomposeMeasureScope, constraints.m3299unboximpl());
        }

        @NotNull
        /* renamed from: invoke-0kLqBqw  reason: not valid java name */
        public final MeasureResult m1000invoke0kLqBqw(@NotNull SubcomposeMeasureScope SubcomposeLayout, long j2) {
            float f2;
            Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
            f2 = TabRowKt.ScrollableTabRowMinimumTabWidth;
            int mo271roundToPx0680j_4 = SubcomposeLayout.mo271roundToPx0680j_4(f2);
            int mo271roundToPx0680j_42 = SubcomposeLayout.mo271roundToPx0680j_4(this.$edgePadding);
            long m3284copyZbe2FdA$default = Constraints.m3284copyZbe2FdA$default(j2, mo271roundToPx0680j_4, 0, 0, 0, 14, null);
            List<Measurable> subcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, this.$tabs);
            ArrayList arrayList = new ArrayList(subcompose.size());
            int size = subcompose.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(subcompose.get(i2).mo2758measureBRTryo0(m3284copyZbe2FdA$default));
            }
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = mo271roundToPx0680j_42 * 2;
            Ref.IntRef intRef2 = new Ref.IntRef();
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Placeable placeable = (Placeable) arrayList.get(i3);
                intRef.element += placeable.getWidth();
                intRef2.element = Math.max(intRef2.element, placeable.getHeight());
            }
            return MeasureScope.DefaultImpls.layout$default(SubcomposeLayout, intRef.element, intRef2.element, null, new AnonymousClass2(mo271roundToPx0680j_42, arrayList, SubcomposeLayout, this.$divider, this.$scrollableTabData, this.$selectedTabIndex, j2, intRef, intRef2, this.$indicator, this.$$dirty), 4, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabRowKt$ScrollableTabRow$2(float f2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i2, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, int i3) {
        super(2);
        this.$edgePadding = f2;
        this.$tabs = function2;
        this.$divider = function22;
        this.$selectedTabIndex = i2;
        this.$indicator = function3;
        this.$$dirty = i3;
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
            return;
        }
        ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, composer, 0, 1);
        composer.startReplaceableGroup(-723524056);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        u0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-3686552);
        boolean changed = composer.changed(rememberScrollState) | composer.changed(coroutineScope);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new ScrollableTabData(rememberScrollState, coroutineScope);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        SubcomposeLayoutKt.SubcomposeLayout(ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null))), new AnonymousClass1(this.$edgePadding, this.$tabs, this.$divider, (ScrollableTabData) rememberedValue2, this.$selectedTabIndex, this.$indicator, this.$$dirty), composer, 0, 0);
    }
}
