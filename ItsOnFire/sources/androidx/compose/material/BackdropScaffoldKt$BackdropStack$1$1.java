package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BackdropScaffoldKt$BackdropStack$1$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ Function2<Composer, Integer, Unit> $backLayer;
    public final /* synthetic */ Function1<Constraints, Constraints> $calculateBackLayerConstraints;
    public final /* synthetic */ Function4<Constraints, Float, Composer, Integer, Unit> $frontLayer;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        public final /* synthetic */ Placeable $backLayerPlaceable;
        public final /* synthetic */ List<Placeable> $placeables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Placeable placeable, List<? extends Placeable> list) {
            super(1);
            this.$backLayerPlaceable = placeable;
            this.$placeables = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Placeable.PlacementScope layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.placeRelative$default(layout, this.$backLayerPlaceable, 0, 0, 0.0f, 4, null);
            List<Placeable> list = this.$placeables;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Placeable.PlacementScope.placeRelative$default(layout, list.get(i2), 0, 0, 0.0f, 4, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BackdropScaffoldKt$BackdropStack$1$1(Function2<? super Composer, ? super Integer, Unit> function2, Function1<? super Constraints, Constraints> function1, Function4<? super Constraints, ? super Float, ? super Composer, ? super Integer, Unit> function4, int i2) {
        super(2);
        this.$backLayer = function2;
        this.$calculateBackLayerConstraints = function1;
        this.$frontLayer = function4;
        this.$$dirty = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m706invoke0kLqBqw(subcomposeMeasureScope, constraints.m3299unboximpl());
    }

    @NotNull
    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m706invoke0kLqBqw(@NotNull SubcomposeMeasureScope SubcomposeLayout, long j2) {
        Object first;
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) SubcomposeLayout.subcompose(BackdropLayers.Back, this.$backLayer));
        Placeable mo2758measureBRTryo0 = ((Measurable) first).mo2758measureBRTryo0(this.$calculateBackLayerConstraints.invoke(Constraints.m3281boximpl(j2)).m3299unboximpl());
        List<Measurable> subcompose = SubcomposeLayout.subcompose(BackdropLayers.Front, ComposableLambdaKt.composableLambdaInstance(-985548218, true, new BackdropScaffoldKt$BackdropStack$1$1$placeables$1(this.$frontLayer, j2, mo2758measureBRTryo0.getHeight(), this.$$dirty)));
        ArrayList arrayList = new ArrayList(subcompose.size());
        int size = subcompose.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(subcompose.get(i2).mo2758measureBRTryo0(j2));
        }
        int max = Math.max(Constraints.m3295getMinWidthimpl(j2), mo2758measureBRTryo0.getWidth());
        int max2 = Math.max(Constraints.m3294getMinHeightimpl(j2), mo2758measureBRTryo0.getHeight());
        int size2 = arrayList.size();
        int i3 = max;
        int i4 = max2;
        for (int i5 = 0; i5 < size2; i5++) {
            Placeable placeable = (Placeable) arrayList.get(i5);
            i3 = Math.max(i3, placeable.getWidth());
            i4 = Math.max(i4, placeable.getHeight());
        }
        return MeasureScope.DefaultImpls.layout$default(SubcomposeLayout, i3, i4, null, new AnonymousClass2(mo2758measureBRTryo0, arrayList), 4, null);
    }
}
