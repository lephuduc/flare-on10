package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aA\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"horizontal", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getHorizontal", "(Landroidx/compose/ui/layout/AlignmentLine;)Z", "alignmentLineOffsetMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "alignmentLine", "before", "Landroidx/compose/ui/unit/Dp;", "after", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "alignmentLineOffsetMeasure-tjqqzMA", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/AlignmentLine;FFLandroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "paddingFrom", "Landroidx/compose/ui/Modifier;", "paddingFrom-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/TextUnit;", "paddingFrom-Y_r0B1c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;JJ)Landroidx/compose/ui/Modifier;", "paddingFromBaseline", "top", "bottom", "paddingFromBaseline-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "paddingFromBaseline-wCyjxdI", "(Landroidx/compose/ui/Modifier;JJ)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AlignmentLineKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: alignmentLineOffsetMeasure-tjqqzMA  reason: not valid java name */
    public static final MeasureResult m303alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, AlignmentLine alignmentLine, float f2, float f3, Measurable measurable, long j2) {
        int coerceIn;
        int coerceIn2;
        Placeable mo2758measureBRTryo0 = measurable.mo2758measureBRTryo0(getHorizontal(alignmentLine) ? Constraints.m3284copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null) : Constraints.m3284copyZbe2FdA$default(j2, 0, 0, 0, 0, 14, null));
        int i2 = mo2758measureBRTryo0.get(alignmentLine);
        if (i2 == Integer.MIN_VALUE) {
            i2 = 0;
        }
        int height = getHorizontal(alignmentLine) ? mo2758measureBRTryo0.getHeight() : mo2758measureBRTryo0.getWidth();
        int m3292getMaxHeightimpl = getHorizontal(alignmentLine) ? Constraints.m3292getMaxHeightimpl(j2) : Constraints.m3293getMaxWidthimpl(j2);
        Dp.Companion companion = Dp.Companion;
        int i3 = m3292getMaxHeightimpl - height;
        coerceIn = RangesKt___RangesKt.coerceIn((!Dp.m3330equalsimpl0(f2, companion.m3345getUnspecifiedD9Ej5fM()) ? measureScope.mo271roundToPx0680j_4(f2) : 0) - i2, 0, i3);
        coerceIn2 = RangesKt___RangesKt.coerceIn(((!Dp.m3330equalsimpl0(f3, companion.m3345getUnspecifiedD9Ej5fM()) ? measureScope.mo271roundToPx0680j_4(f3) : 0) - height) + i2, 0, i3 - coerceIn);
        int width = getHorizontal(alignmentLine) ? mo2758measureBRTryo0.getWidth() : Math.max(mo2758measureBRTryo0.getWidth() + coerceIn + coerceIn2, Constraints.m3295getMinWidthimpl(j2));
        int max = getHorizontal(alignmentLine) ? Math.max(mo2758measureBRTryo0.getHeight() + coerceIn + coerceIn2, Constraints.m3294getMinHeightimpl(j2)) : mo2758measureBRTryo0.getHeight();
        return MeasureScope.DefaultImpls.layout$default(measureScope, width, max, null, new AlignmentLineKt$alignmentLineOffsetMeasure$1(alignmentLine, f2, coerceIn, width, coerceIn2, mo2758measureBRTryo0, max), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    @Stable
    @NotNull
    /* renamed from: paddingFrom-4j6BHR0  reason: not valid java name */
    public static final Modifier m304paddingFrom4j6BHR0(@NotNull Modifier paddingFrom, @NotNull AlignmentLine alignmentLine, float f2, float f3) {
        Intrinsics.checkNotNullParameter(paddingFrom, "$this$paddingFrom");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return paddingFrom.then(new AlignmentLineOffsetDp(alignmentLine, f2, f3, InspectableValueKt.isDebugInspectorInfoEnabled() ? new AlignmentLineKt$paddingFrom4j6BHR0$$inlined$debugInspectorInfo$1(alignmentLine, f2, f3) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFrom-4j6BHR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m305paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = Dp.Companion.m3345getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 4) != 0) {
            f3 = Dp.Companion.m3345getUnspecifiedD9Ej5fM();
        }
        return m304paddingFrom4j6BHR0(modifier, alignmentLine, f2, f3);
    }

    @Stable
    @NotNull
    /* renamed from: paddingFrom-Y_r0B1c  reason: not valid java name */
    public static final Modifier m306paddingFromY_r0B1c(@NotNull Modifier paddingFrom, @NotNull AlignmentLine alignmentLine, long j2, long j3) {
        Intrinsics.checkNotNullParameter(paddingFrom, "$this$paddingFrom");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return paddingFrom.then(new AlignmentLineOffsetTextUnit(alignmentLine, j2, j3, InspectableValueKt.isDebugInspectorInfoEnabled() ? new AlignmentLineKt$paddingFromY_r0B1c$$inlined$debugInspectorInfo$1(alignmentLine, j2, j3) : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFrom-Y_r0B1c$default  reason: not valid java name */
    public static /* synthetic */ Modifier m307paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j2, long j3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = TextUnit.Companion.m3517getUnspecifiedXSAIIZE();
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            j3 = TextUnit.Companion.m3517getUnspecifiedXSAIIZE();
        }
        return m306paddingFromY_r0B1c(modifier, alignmentLine, j4, j3);
    }

    @Stable
    @NotNull
    /* renamed from: paddingFromBaseline-VpY3zN4  reason: not valid java name */
    public static final Modifier m308paddingFromBaselineVpY3zN4(@NotNull Modifier paddingFromBaseline, float f2, float f3) {
        Intrinsics.checkNotNullParameter(paddingFromBaseline, "$this$paddingFromBaseline");
        Dp.Companion companion = Dp.Companion;
        return paddingFromBaseline.then(!Dp.m3330equalsimpl0(f3, companion.m3345getUnspecifiedD9Ej5fM()) ? m305paddingFrom4j6BHR0$default(paddingFromBaseline, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f3, 2, null) : Modifier.Companion).then(!Dp.m3330equalsimpl0(f2, companion.m3345getUnspecifiedD9Ej5fM()) ? m305paddingFrom4j6BHR0$default(paddingFromBaseline, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), f2, 0.0f, 4, null) : Modifier.Companion);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4$default  reason: not valid java name */
    public static /* synthetic */ Modifier m309paddingFromBaselineVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = Dp.Companion.m3345getUnspecifiedD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.Companion.m3345getUnspecifiedD9Ej5fM();
        }
        return m308paddingFromBaselineVpY3zN4(modifier, f2, f3);
    }

    @Stable
    @NotNull
    /* renamed from: paddingFromBaseline-wCyjxdI  reason: not valid java name */
    public static final Modifier m310paddingFromBaselinewCyjxdI(@NotNull Modifier paddingFromBaseline, long j2, long j3) {
        Intrinsics.checkNotNullParameter(paddingFromBaseline, "$this$paddingFromBaseline");
        return paddingFromBaseline.then(!TextUnitKt.m3524isUnspecifiedR2X_6o(j3) ? m307paddingFromY_r0B1c$default(paddingFromBaseline, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j3, 2, null) : Modifier.Companion).then(!TextUnitKt.m3524isUnspecifiedR2X_6o(j2) ? m307paddingFromY_r0B1c$default(paddingFromBaseline, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), j2, 0L, 4, null) : Modifier.Companion);
    }

    /* renamed from: paddingFromBaseline-wCyjxdI$default  reason: not valid java name */
    public static /* synthetic */ Modifier m311paddingFromBaselinewCyjxdI$default(Modifier modifier, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = TextUnit.Companion.m3517getUnspecifiedXSAIIZE();
        }
        if ((i2 & 2) != 0) {
            j3 = TextUnit.Companion.m3517getUnspecifiedXSAIIZE();
        }
        return m310paddingFromBaselinewCyjxdI(modifier, j2, j3);
    }
}
