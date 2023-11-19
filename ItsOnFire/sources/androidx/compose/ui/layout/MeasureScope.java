package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JG\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0016¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "layout", "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "placementBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public interface MeasureScope extends IntrinsicMeasureScope {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @NotNull
        public static MeasureResult layout(@NotNull final MeasureScope measureScope, final int i2, final int i3, @NotNull final Map<AlignmentLine, Integer> alignmentLines, @NotNull final Function1<? super Placeable.PlacementScope, Unit> placementBlock) {
            Intrinsics.checkNotNullParameter(measureScope, "this");
            Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
            Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
            return new MeasureResult(i2, i3, alignmentLines, measureScope, placementBlock) { // from class: androidx.compose.ui.layout.MeasureScope$layout$1
                public final /* synthetic */ Map<AlignmentLine, Integer> $alignmentLines;
                public final /* synthetic */ int $height;
                public final /* synthetic */ Function1<Placeable.PlacementScope, Unit> $placementBlock;
                public final /* synthetic */ int $width;
                @NotNull
                private final Map<AlignmentLine, Integer> alignmentLines;
                private final int height;
                public final /* synthetic */ MeasureScope this$0;
                private final int width;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.$width = i2;
                    this.$height = i3;
                    this.$alignmentLines = alignmentLines;
                    this.this$0 = measureScope;
                    this.$placementBlock = placementBlock;
                    this.width = i2;
                    this.height = i3;
                    this.alignmentLines = alignmentLines;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                @NotNull
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return this.alignmentLines;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return this.height;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return this.width;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                    Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
                    int i4 = this.$width;
                    LayoutDirection layoutDirection = this.this$0.getLayoutDirection();
                    Function1<Placeable.PlacementScope, Unit> function1 = this.$placementBlock;
                    int parentWidth = companion.getParentWidth();
                    LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
                    Placeable.PlacementScope.parentWidth = i4;
                    Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
                    function1.invoke(companion);
                    Placeable.PlacementScope.parentWidth = parentWidth;
                    Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i2, int i3, Map map, Function1 function1, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 4) != 0) {
                    map = MapsKt__MapsKt.emptyMap();
                }
                return measureScope.layout(i2, i3, map, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }

        @Stable
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m2779roundToPxR2X_6o(@NotNull MeasureScope measureScope, long j2) {
            Intrinsics.checkNotNullParameter(measureScope, "this");
            return IntrinsicMeasureScope.DefaultImpls.m2760roundToPxR2X_6o(measureScope, j2);
        }

        @Stable
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m2780roundToPx0680j_4(@NotNull MeasureScope measureScope, float f2) {
            Intrinsics.checkNotNullParameter(measureScope, "this");
            return IntrinsicMeasureScope.DefaultImpls.m2761roundToPx0680j_4(measureScope, f2);
        }

        @Stable
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m2781toDpGaN1DYA(@NotNull MeasureScope measureScope, long j2) {
            Intrinsics.checkNotNullParameter(measureScope, "this");
            return IntrinsicMeasureScope.DefaultImpls.m2762toDpGaN1DYA(measureScope, j2);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m2782toDpu2uoSUM(@NotNull MeasureScope measureScope, float f2) {
            Intrinsics.checkNotNullParameter(measureScope, "this");
            return IntrinsicMeasureScope.DefaultImpls.m2763toDpu2uoSUM(measureScope, f2);
        }

        @Stable
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m2783toDpu2uoSUM(@NotNull MeasureScope measureScope, int i2) {
            Intrinsics.checkNotNullParameter(measureScope, "this");
            return IntrinsicMeasureScope.DefaultImpls.m2764toDpu2uoSUM((IntrinsicMeasureScope) measureScope, i2);
        }

        @Stable
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m2784toDpSizekrfVVM(@NotNull MeasureScope measureScope, long j2) {
            Intrinsics.checkNotNullParameter(measureScope, "this");
            return IntrinsicMeasureScope.DefaultImpls.m2765toDpSizekrfVVM(measureScope, j2);
        }

        @Stable
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m2785toPxR2X_6o(@NotNull MeasureScope measureScope, long j2) {
            Intrinsics.checkNotNullParameter(measureScope, "this");
            return IntrinsicMeasureScope.DefaultImpls.m2766toPxR2X_6o(measureScope, j2);
        }

        @Stable
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m2786toPx0680j_4(@NotNull MeasureScope measureScope, float f2) {
            Intrinsics.checkNotNullParameter(measureScope, "this");
            return IntrinsicMeasureScope.DefaultImpls.m2767toPx0680j_4(measureScope, f2);
        }

        @Stable
        @NotNull
        public static Rect toRect(@NotNull MeasureScope measureScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(measureScope, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return IntrinsicMeasureScope.DefaultImpls.toRect(measureScope, receiver);
        }

        @Stable
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m2787toSizeXkaWNTQ(@NotNull MeasureScope measureScope, long j2) {
            Intrinsics.checkNotNullParameter(measureScope, "this");
            return IntrinsicMeasureScope.DefaultImpls.m2768toSizeXkaWNTQ(measureScope, j2);
        }

        @Stable
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m2788toSp0xMU5do(@NotNull MeasureScope measureScope, float f2) {
            Intrinsics.checkNotNullParameter(measureScope, "this");
            return IntrinsicMeasureScope.DefaultImpls.m2769toSp0xMU5do(measureScope, f2);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m2789toSpkPz2Gy4(@NotNull MeasureScope measureScope, float f2) {
            Intrinsics.checkNotNullParameter(measureScope, "this");
            return IntrinsicMeasureScope.DefaultImpls.m2770toSpkPz2Gy4(measureScope, f2);
        }

        @Stable
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m2790toSpkPz2Gy4(@NotNull MeasureScope measureScope, int i2) {
            Intrinsics.checkNotNullParameter(measureScope, "this");
            return IntrinsicMeasureScope.DefaultImpls.m2771toSpkPz2Gy4((IntrinsicMeasureScope) measureScope, i2);
        }
    }

    @NotNull
    MeasureResult layout(int i2, int i3, @NotNull Map<AlignmentLine, Integer> map, @NotNull Function1<? super Placeable.PlacementScope, Unit> function1);
}
