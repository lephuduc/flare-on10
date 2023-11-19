package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
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

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ScaffoldKt$ScaffoldLayout$1$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $bottomBar;
    public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $fab;
    public final /* synthetic */ int $fabPosition;
    public final /* synthetic */ boolean $isFabDocked;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $snackbar;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        public final /* synthetic */ int $$dirty;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $bottomBar;
        public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $fab;
        public final /* synthetic */ int $fabPosition;
        public final /* synthetic */ boolean $isFabDocked;
        public final /* synthetic */ int $layoutHeight;
        public final /* synthetic */ int $layoutWidth;
        public final /* synthetic */ long $looseConstraints;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $snackbar;
        public final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $topBar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(SubcomposeMeasureScope subcomposeMeasureScope, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i2, int i3, boolean z, int i4, long j2, Function2<? super Composer, ? super Integer, Unit> function24, int i5, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3) {
            super(1);
            this.$this_SubcomposeLayout = subcomposeMeasureScope;
            this.$topBar = function2;
            this.$snackbar = function22;
            this.$fab = function23;
            this.$fabPosition = i2;
            this.$layoutWidth = i3;
            this.$isFabDocked = z;
            this.$layoutHeight = i4;
            this.$looseConstraints = j2;
            this.$bottomBar = function24;
            this.$$dirty = i5;
            this.$content = function3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Placeable.PlacementScope layout) {
            Object obj;
            int lastIndex;
            Object obj2;
            int lastIndex2;
            FabPlacement fabPlacement;
            Object obj3;
            int lastIndex3;
            int height;
            int height2;
            Integer valueOf;
            float f2;
            Object obj4;
            int lastIndex4;
            Object obj5;
            int lastIndex5;
            int i2;
            float f3;
            float f4;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            List<Measurable> subcompose = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.TopBar, this.$topBar);
            long j2 = this.$looseConstraints;
            ArrayList arrayList = new ArrayList(subcompose.size());
            int size = subcompose.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(subcompose.get(i3).mo2758measureBRTryo0(j2));
            }
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList.get(0);
                int height3 = ((Placeable) obj).getHeight();
                lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
                if (1 <= lastIndex) {
                    int i4 = 1;
                    while (true) {
                        int i5 = i4 + 1;
                        Object obj6 = arrayList.get(i4);
                        int height4 = ((Placeable) obj6).getHeight();
                        if (height3 < height4) {
                            obj = obj6;
                            height3 = height4;
                        }
                        if (i4 == lastIndex) {
                            break;
                        }
                        i4 = i5;
                    }
                }
            }
            Placeable placeable = (Placeable) obj;
            int height5 = placeable == null ? 0 : placeable.getHeight();
            List<Measurable> subcompose2 = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.Snackbar, this.$snackbar);
            long j3 = this.$looseConstraints;
            ArrayList arrayList2 = new ArrayList(subcompose2.size());
            int size2 = subcompose2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                arrayList2.add(subcompose2.get(i6).mo2758measureBRTryo0(j3));
            }
            if (arrayList2.isEmpty()) {
                obj2 = null;
            } else {
                obj2 = arrayList2.get(0);
                int height6 = ((Placeable) obj2).getHeight();
                lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList2);
                if (1 <= lastIndex2) {
                    int i7 = 1;
                    while (true) {
                        int i8 = i7 + 1;
                        Object obj7 = arrayList2.get(i7);
                        int height7 = ((Placeable) obj7).getHeight();
                        if (height6 < height7) {
                            obj2 = obj7;
                            height6 = height7;
                        }
                        if (i7 == lastIndex2) {
                            break;
                        }
                        i7 = i8;
                    }
                }
            }
            Placeable placeable2 = (Placeable) obj2;
            int height8 = placeable2 == null ? 0 : placeable2.getHeight();
            List<Measurable> subcompose3 = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.Fab, this.$fab);
            long j4 = this.$looseConstraints;
            ArrayList arrayList3 = new ArrayList();
            for (Measurable measurable : subcompose3) {
                Placeable mo2758measureBRTryo0 = measurable.mo2758measureBRTryo0(j4);
                if (!((mo2758measureBRTryo0.getHeight() == 0 || mo2758measureBRTryo0.getWidth() == 0) ? false : true)) {
                    mo2758measureBRTryo0 = null;
                }
                if (mo2758measureBRTryo0 != null) {
                    arrayList3.add(mo2758measureBRTryo0);
                }
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.isEmpty()) {
                    obj4 = null;
                } else {
                    obj4 = arrayList3.get(0);
                    int width = ((Placeable) obj4).getWidth();
                    lastIndex4 = CollectionsKt__CollectionsKt.getLastIndex(arrayList3);
                    if (1 <= lastIndex4) {
                        int i9 = 1;
                        while (true) {
                            int i10 = i9 + 1;
                            Object obj8 = arrayList3.get(i9);
                            int width2 = ((Placeable) obj8).getWidth();
                            if (width < width2) {
                                width = width2;
                                obj4 = obj8;
                            }
                            if (i9 == lastIndex4) {
                                break;
                            }
                            i9 = i10;
                        }
                    }
                }
                Intrinsics.checkNotNull(obj4);
                int width3 = ((Placeable) obj4).getWidth();
                if (arrayList3.isEmpty()) {
                    obj5 = null;
                } else {
                    obj5 = arrayList3.get(0);
                    int height9 = ((Placeable) obj5).getHeight();
                    lastIndex5 = CollectionsKt__CollectionsKt.getLastIndex(arrayList3);
                    if (1 <= lastIndex5) {
                        int i11 = 1;
                        while (true) {
                            int i12 = i11 + 1;
                            Object obj9 = arrayList3.get(i11);
                            int height10 = ((Placeable) obj9).getHeight();
                            if (height9 < height10) {
                                height9 = height10;
                                obj5 = obj9;
                            }
                            if (i11 == lastIndex5) {
                                break;
                            }
                            i11 = i12;
                        }
                    }
                }
                Intrinsics.checkNotNull(obj5);
                int height11 = ((Placeable) obj5).getHeight();
                if (!FabPosition.m850equalsimpl0(this.$fabPosition, FabPosition.Companion.m855getEnd5ygKITE())) {
                    i2 = (this.$layoutWidth - width3) / 2;
                } else if (this.$this_SubcomposeLayout.getLayoutDirection() == LayoutDirection.Ltr) {
                    int i13 = this.$layoutWidth;
                    SubcomposeMeasureScope subcomposeMeasureScope = this.$this_SubcomposeLayout;
                    f4 = ScaffoldKt.FabSpacing;
                    i2 = (i13 - subcomposeMeasureScope.mo271roundToPx0680j_4(f4)) - width3;
                } else {
                    SubcomposeMeasureScope subcomposeMeasureScope2 = this.$this_SubcomposeLayout;
                    f3 = ScaffoldKt.FabSpacing;
                    i2 = subcomposeMeasureScope2.mo271roundToPx0680j_4(f3);
                }
                fabPlacement = new FabPlacement(this.$isFabDocked, i2, width3, height11);
            } else {
                fabPlacement = null;
            }
            List<Measurable> subcompose4 = this.$this_SubcomposeLayout.subcompose(ScaffoldLayoutContent.BottomBar, ComposableLambdaKt.composableLambdaInstance(-985538854, true, new ScaffoldKt$ScaffoldLayout$1$1$1$bottomBarPlaceables$1(fabPlacement, this.$bottomBar, this.$$dirty)));
            long j5 = this.$looseConstraints;
            ArrayList arrayList4 = new ArrayList(subcompose4.size());
            int size3 = subcompose4.size();
            for (int i14 = 0; i14 < size3; i14++) {
                arrayList4.add(subcompose4.get(i14).mo2758measureBRTryo0(j5));
            }
            if (arrayList4.isEmpty()) {
                obj3 = null;
            } else {
                obj3 = arrayList4.get(0);
                int height12 = ((Placeable) obj3).getHeight();
                lastIndex3 = CollectionsKt__CollectionsKt.getLastIndex(arrayList4);
                if (1 <= lastIndex3) {
                    int i15 = 1;
                    while (true) {
                        int i16 = i15 + 1;
                        Object obj10 = arrayList4.get(i15);
                        int height13 = ((Placeable) obj10).getHeight();
                        if (height12 < height13) {
                            height12 = height13;
                            obj3 = obj10;
                        }
                        if (i15 == lastIndex3) {
                            break;
                        }
                        i15 = i16;
                    }
                }
            }
            Placeable placeable3 = (Placeable) obj3;
            int height14 = placeable3 == null ? 0 : placeable3.getHeight();
            if (fabPlacement == null) {
                valueOf = null;
            } else {
                SubcomposeMeasureScope subcomposeMeasureScope3 = this.$this_SubcomposeLayout;
                boolean z = this.$isFabDocked;
                if (height14 == 0) {
                    height = fabPlacement.getHeight();
                } else if (z) {
                    height2 = height14 + (fabPlacement.getHeight() / 2);
                    valueOf = Integer.valueOf(height2);
                } else {
                    height = fabPlacement.getHeight() + height14;
                }
                f2 = ScaffoldKt.FabSpacing;
                height2 = height + subcomposeMeasureScope3.mo271roundToPx0680j_4(f2);
                valueOf = Integer.valueOf(height2);
            }
            int intValue = height8 != 0 ? height8 + (valueOf == null ? height14 : valueOf.intValue()) : 0;
            int i17 = this.$layoutHeight - height5;
            SubcomposeMeasureScope subcomposeMeasureScope4 = this.$this_SubcomposeLayout;
            List<Measurable> subcompose5 = subcomposeMeasureScope4.subcompose(ScaffoldLayoutContent.MainContent, ComposableLambdaKt.composableLambdaInstance(-985545322, true, new ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1(subcomposeMeasureScope4, height14, this.$content, this.$$dirty)));
            long j6 = this.$looseConstraints;
            ArrayList arrayList5 = new ArrayList(subcompose5.size());
            int size4 = subcompose5.size();
            int i18 = 0;
            while (i18 < size4) {
                arrayList5.add(subcompose5.get(i18).mo2758measureBRTryo0(Constraints.m3284copyZbe2FdA$default(j6, 0, 0, 0, i17, 7, null)));
                i18++;
                i17 = i17;
                subcompose5 = subcompose5;
            }
            int i19 = 0;
            for (int size5 = arrayList5.size(); i19 < size5; size5 = size5) {
                Placeable.PlacementScope.place$default(layout, (Placeable) arrayList5.get(i19), 0, height5, 0.0f, 4, null);
                i19++;
            }
            int size6 = arrayList.size();
            for (int i20 = 0; i20 < size6; i20++) {
                Placeable.PlacementScope.place$default(layout, (Placeable) arrayList.get(i20), 0, 0, 0.0f, 4, null);
            }
            int i21 = this.$layoutHeight;
            int size7 = arrayList2.size();
            for (int i22 = 0; i22 < size7; i22++) {
                Placeable.PlacementScope.place$default(layout, (Placeable) arrayList2.get(i22), 0, i21 - intValue, 0.0f, 4, null);
            }
            int i23 = this.$layoutHeight;
            int size8 = arrayList4.size();
            for (int i24 = 0; i24 < size8; i24++) {
                Placeable.PlacementScope.place$default(layout, (Placeable) arrayList4.get(i24), 0, i23 - height14, 0.0f, 4, null);
            }
            if (fabPlacement == null) {
                return;
            }
            int i25 = this.$layoutHeight;
            int size9 = arrayList3.size();
            for (int i26 = 0; i26 < size9; i26++) {
                int left = fabPlacement.getLeft();
                Intrinsics.checkNotNull(valueOf);
                Placeable.PlacementScope.place$default(layout, (Placeable) arrayList3.get(i26), left, i25 - valueOf.intValue(), 0.0f, 4, null);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScaffoldKt$ScaffoldLayout$1$1(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i2, boolean z, Function2<? super Composer, ? super Integer, Unit> function24, int i3, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3) {
        super(2);
        this.$topBar = function2;
        this.$snackbar = function22;
        this.$fab = function23;
        this.$fabPosition = i2;
        this.$isFabDocked = z;
        this.$bottomBar = function24;
        this.$$dirty = i3;
        this.$content = function3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m945invoke0kLqBqw(subcomposeMeasureScope, constraints.m3299unboximpl());
    }

    @NotNull
    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m945invoke0kLqBqw(@NotNull SubcomposeMeasureScope SubcomposeLayout, long j2) {
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        int m3293getMaxWidthimpl = Constraints.m3293getMaxWidthimpl(j2);
        int m3292getMaxHeightimpl = Constraints.m3292getMaxHeightimpl(j2);
        return MeasureScope.DefaultImpls.layout$default(SubcomposeLayout, m3293getMaxWidthimpl, m3292getMaxHeightimpl, null, new AnonymousClass1(SubcomposeLayout, this.$topBar, this.$snackbar, this.$fab, this.$fabPosition, m3293getMaxWidthimpl, this.$isFabDocked, m3292getMaxHeightimpl, Constraints.m3284copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null), this.$bottomBar, this.$$dirty, this.$content), 4, null);
    }
}
