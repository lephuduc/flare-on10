package androidx.compose.foundation.layout;

import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0012\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a.\u0010\u0018\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a.\u0010\u0019\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001a.\u0010\u001a\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u001ad\u0010\u001b\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u001d\u0010\u001d\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001e¢\u0006\u0002\b\u001f2\u001d\u0010 \u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001e¢\u0006\u0002\b\u001f2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0015H\u0002\u001aE\u0010#\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u001d\u0010\u001d\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001e¢\u0006\u0002\b\u001f2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0015H\u0002\u001at\u0010%\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u001d\u0010&\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001e¢\u0006\u0002\b\u001f2\u001d\u0010'\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001e¢\u0006\u0002\b\u001f2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0017H\u0002\u001aa\u0010*\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020\u00172*\u0010,\u001a&\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u0002010-2\u0006\u00102\u001a\u0002032\u0006\u0010 \u001a\u0002042\u0006\u0010\u0000\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106\"\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u001a\u0010\t\u001a\u00020\n*\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u001a\u0010\r\u001a\u00020\n*\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\f\"\u001a\u0010\u000e\u001a\u00020\u000f*\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "Landroidx/compose/foundation/layout/RowColumnParentData;", "getCrossAxisAlignment", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Landroidx/compose/foundation/layout/CrossAxisAlignment;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getData", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;", "fill", "", "getFill", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Z", "isRelative", ActivityChooserModel.ATTRIBUTE_WEIGHT, "", "getWeight", "(Landroidx/compose/foundation/layout/RowColumnParentData;)F", "MaxIntrinsicHeightMeasureBlock", "Lkotlin/Function3;", "", "", "orientation", "Landroidx/compose/foundation/layout/LayoutOrientation;", "MaxIntrinsicWidthMeasureBlock", "MinIntrinsicHeightMeasureBlock", "MinIntrinsicWidthMeasureBlock", "intrinsicCrossAxisSize", "children", "mainAxisSize", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "crossAxisSize", "mainAxisAvailable", "mainAxisSpacing", "intrinsicMainAxisSize", "crossAxisAvailable", "intrinsicSize", "intrinsicMainSize", "intrinsicCrossSize", "layoutOrientation", "intrinsicOrientation", "rowColumnMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "arrangement", "Lkotlin/Function5;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "", "arrangementSpacing", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/foundation/layout/SizeMode;", "rowColumnMeasurePolicy-TDGSqEk", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;)Landroidx/compose/ui/layout/MeasurePolicy;", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class RowColumnImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxHeight() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MaxIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxWidth() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinHeight() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMinHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> MinIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinWidth() : IntrinsicMeasureBlocks.INSTANCE.getVerticalMinWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CrossAxisAlignment getCrossAxisAlignment(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData == null) {
            return null;
        }
        return rowColumnParentData.getCrossAxisAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RowColumnParentData getData(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof RowColumnParentData) {
            return (RowColumnParentData) parentData;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getFill(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData == null) {
            return true;
        }
        return rowColumnParentData.getFill();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getWeight(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData == null) {
            return 0.0f;
        }
        return rowColumnParentData.getWeight();
    }

    private static final int intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function22, int i2, int i3) {
        int min = Math.min((list.size() - 1) * i3, i2);
        int size = list.size();
        int i4 = 0;
        float f2 = 0.0f;
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            int i7 = i5 + 1;
            IntrinsicMeasurable intrinsicMeasurable = list.get(i5);
            float weight = getWeight(getData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int min2 = Math.min(function2.invoke(intrinsicMeasurable, Integer.MAX_VALUE).intValue(), i2 - min);
                min += min2;
                i6 = Math.max(i6, function22.invoke(intrinsicMeasurable, Integer.valueOf(min2)).intValue());
            } else if (weight > 0.0f) {
                f2 += weight;
            }
            i5 = i7;
        }
        int roundToInt = f2 == 0.0f ? 0 : i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : MathKt__MathJVMKt.roundToInt(Math.max(i2 - min, 0) / f2);
        int size2 = list.size();
        while (i4 < size2) {
            int i8 = i4 + 1;
            IntrinsicMeasurable intrinsicMeasurable2 = list.get(i4);
            float weight2 = getWeight(getData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                i6 = Math.max(i6, function22.invoke(intrinsicMeasurable2, Integer.valueOf(roundToInt != Integer.MAX_VALUE ? MathKt__MathJVMKt.roundToInt(roundToInt * weight2) : Integer.MAX_VALUE)).intValue());
            }
            i4 = i8;
        }
        return i6;
    }

    private static final int intrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2, int i2, int i3) {
        int roundToInt;
        int roundToInt2;
        int size = list.size();
        float f2 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i4 >= size) {
                roundToInt = MathKt__MathJVMKt.roundToInt(i5 * f2);
                return roundToInt + i6 + ((list.size() - 1) * i3);
            }
            int i7 = i4 + 1;
            IntrinsicMeasurable intrinsicMeasurable = list.get(i4);
            float weight = getWeight(getData(intrinsicMeasurable));
            int intValue = function2.invoke(intrinsicMeasurable, Integer.valueOf(i2)).intValue();
            if (weight == 0.0f) {
                i6 += intValue;
            } else if (weight > 0.0f) {
                f2 += weight;
                roundToInt2 = MathKt__MathJVMKt.roundToInt(intValue / weight);
                i5 = Math.max(i5, roundToInt2);
            }
            i4 = i7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int intrinsicSize(List<? extends IntrinsicMeasurable> list, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function22, int i2, int i3, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        return layoutOrientation == layoutOrientation2 ? intrinsicMainAxisSize(list, function2, i2, i3) : intrinsicCrossAxisSize(list, function22, function2, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelative(RowColumnParentData rowColumnParentData) {
        CrossAxisAlignment crossAxisAlignment = getCrossAxisAlignment(rowColumnParentData);
        if (crossAxisAlignment == null) {
            return false;
        }
        return crossAxisAlignment.isRelative$foundation_layout_release();
    }

    @NotNull
    /* renamed from: rowColumnMeasurePolicy-TDGSqEk  reason: not valid java name */
    public static final MeasurePolicy m389rowColumnMeasurePolicyTDGSqEk(@NotNull final LayoutOrientation orientation, @NotNull final Function5<? super Integer, ? super int[], ? super LayoutDirection, ? super Density, ? super int[], Unit> arrangement, final float f2, @NotNull final SizeMode crossAxisSize, @NotNull final CrossAxisAlignment crossAxisAlignment) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(arrangement, "arrangement");
        Intrinsics.checkNotNullParameter(crossAxisSize, "crossAxisSize");
        Intrinsics.checkNotNullParameter(crossAxisAlignment, "crossAxisAlignment");
        return new MeasurePolicy() { // from class: androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Function3 MaxIntrinsicHeightMeasureBlock;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MaxIntrinsicHeightMeasureBlock = RowColumnImplKt.MaxIntrinsicHeightMeasureBlock(LayoutOrientation.this);
                return ((Number) MaxIntrinsicHeightMeasureBlock.invoke(measurables, Integer.valueOf(i2), Integer.valueOf(intrinsicMeasureScope.mo271roundToPx0680j_4(f2)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Function3 MaxIntrinsicWidthMeasureBlock;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MaxIntrinsicWidthMeasureBlock = RowColumnImplKt.MaxIntrinsicWidthMeasureBlock(LayoutOrientation.this);
                return ((Number) MaxIntrinsicWidthMeasureBlock.invoke(measurables, Integer.valueOf(i2), Integer.valueOf(intrinsicMeasureScope.mo271roundToPx0680j_4(f2)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope receiver, @NotNull List<? extends Measurable> list, long j2) {
                int i2;
                int coerceAtMost;
                float weight;
                int sign;
                int roundToInt;
                boolean fill;
                int i3;
                int i4;
                int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize;
                int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize;
                boolean isRelative;
                float weight2;
                int roundToInt2;
                int i5;
                CrossAxisAlignment crossAxisAlignment2;
                int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize2;
                float weight3;
                int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize2;
                int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize3;
                int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize3;
                boolean isRelative2;
                RowColumnParentData data;
                List<? extends Measurable> measurables = list;
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                OrientationIndependentConstraints orientationIndependentConstraints = new OrientationIndependentConstraints(j2, LayoutOrientation.this, null);
                int mo271roundToPx0680j_4 = receiver.mo271roundToPx0680j_4(f2);
                int size = list.size();
                Placeable[] placeableArr = new Placeable[size];
                int size2 = list.size();
                RowColumnParentData[] rowColumnParentDataArr = new RowColumnParentData[size2];
                for (int i6 = 0; i6 < size2; i6++) {
                    data = RowColumnImplKt.getData(measurables.get(i6));
                    rowColumnParentDataArr[i6] = data;
                }
                int size3 = list.size();
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                boolean z = false;
                float f3 = 0.0f;
                while (true) {
                    if (i9 >= size3) {
                        break;
                    }
                    int i12 = i9 + 1;
                    Measurable measurable = measurables.get(i9);
                    RowColumnParentData rowColumnParentData = rowColumnParentDataArr[i9];
                    weight3 = RowColumnImplKt.getWeight(rowColumnParentData);
                    if (weight3 > 0.0f) {
                        f3 += weight3;
                        i10++;
                        i9 = i12;
                    } else {
                        int mainAxisMax = orientationIndependentConstraints.getMainAxisMax();
                        int i13 = i8;
                        int i14 = i9;
                        int i15 = size3;
                        RowColumnParentData[] rowColumnParentDataArr2 = rowColumnParentDataArr;
                        Placeable mo2758measureBRTryo0 = measurable.mo2758measureBRTryo0(OrientationIndependentConstraints.copy$default(orientationIndependentConstraints, 0, mainAxisMax != Integer.MAX_VALUE ? mainAxisMax - i11 : Integer.MAX_VALUE, 0, 0, 8, null).m356toBoxConstraintsOenEA2s(LayoutOrientation.this));
                        rowColumnMeasurePolicy_TDGSqEk$mainAxisSize2 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(mo2758measureBRTryo0, LayoutOrientation.this);
                        int min = Math.min(mo271roundToPx0680j_4, (mainAxisMax - i11) - rowColumnMeasurePolicy_TDGSqEk$mainAxisSize2);
                        rowColumnMeasurePolicy_TDGSqEk$mainAxisSize3 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(mo2758measureBRTryo0, LayoutOrientation.this);
                        i11 += rowColumnMeasurePolicy_TDGSqEk$mainAxisSize3 + min;
                        rowColumnMeasurePolicy_TDGSqEk$crossAxisSize3 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(mo2758measureBRTryo0, LayoutOrientation.this);
                        i8 = Math.max(i13, rowColumnMeasurePolicy_TDGSqEk$crossAxisSize3);
                        if (!z) {
                            isRelative2 = RowColumnImplKt.isRelative(rowColumnParentData);
                            if (!isRelative2) {
                                z = false;
                                placeableArr[i14] = mo2758measureBRTryo0;
                                i7 = min;
                                i9 = i12;
                                size3 = i15;
                                rowColumnParentDataArr = rowColumnParentDataArr2;
                            }
                        }
                        z = true;
                        placeableArr[i14] = mo2758measureBRTryo0;
                        i7 = min;
                        i9 = i12;
                        size3 = i15;
                        rowColumnParentDataArr = rowColumnParentDataArr2;
                    }
                }
                int i16 = i8;
                RowColumnParentData[] rowColumnParentDataArr3 = rowColumnParentDataArr;
                if (i10 == 0) {
                    i11 -= i7;
                    i2 = i16;
                    coerceAtMost = 0;
                } else {
                    int i17 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
                    int i18 = mo271roundToPx0680j_4 * (i10 - 1);
                    int mainAxisMin = (((i17 <= 0 || orientationIndependentConstraints.getMainAxisMax() == Integer.MAX_VALUE) ? orientationIndependentConstraints.getMainAxisMin() : orientationIndependentConstraints.getMainAxisMax()) - i11) - i18;
                    float f4 = i17 > 0 ? mainAxisMin / f3 : 0.0f;
                    int i19 = 0;
                    int i20 = 0;
                    while (i19 < size2) {
                        RowColumnParentData rowColumnParentData2 = rowColumnParentDataArr3[i19];
                        i19++;
                        weight2 = RowColumnImplKt.getWeight(rowColumnParentData2);
                        roundToInt2 = MathKt__MathJVMKt.roundToInt(weight2 * f4);
                        i20 += roundToInt2;
                    }
                    int size4 = list.size();
                    int i21 = mainAxisMin - i20;
                    i2 = i16;
                    int i22 = 0;
                    int i23 = 0;
                    while (i22 < size4) {
                        int i24 = i22 + 1;
                        if (placeableArr[i22] == null) {
                            Measurable measurable2 = measurables.get(i22);
                            RowColumnParentData rowColumnParentData3 = rowColumnParentDataArr3[i22];
                            weight = RowColumnImplKt.getWeight(rowColumnParentData3);
                            if (!(weight > 0.0f)) {
                                throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                            }
                            sign = MathKt__MathJVMKt.getSign(i21);
                            int i25 = i21 - sign;
                            roundToInt = MathKt__MathJVMKt.roundToInt(weight * f4);
                            int max = Math.max(0, roundToInt + sign);
                            fill = RowColumnImplKt.getFill(rowColumnParentData3);
                            float f5 = f4;
                            if (!fill || max == Integer.MAX_VALUE) {
                                i3 = size4;
                                i4 = 0;
                            } else {
                                i4 = max;
                                i3 = size4;
                            }
                            Placeable mo2758measureBRTryo02 = measurable2.mo2758measureBRTryo0(new OrientationIndependentConstraints(i4, max, 0, orientationIndependentConstraints.getCrossAxisMax()).m356toBoxConstraintsOenEA2s(LayoutOrientation.this));
                            rowColumnMeasurePolicy_TDGSqEk$mainAxisSize = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(mo2758measureBRTryo02, LayoutOrientation.this);
                            i23 += rowColumnMeasurePolicy_TDGSqEk$mainAxisSize;
                            rowColumnMeasurePolicy_TDGSqEk$crossAxisSize = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(mo2758measureBRTryo02, LayoutOrientation.this);
                            i2 = Math.max(i2, rowColumnMeasurePolicy_TDGSqEk$crossAxisSize);
                            if (!z) {
                                isRelative = RowColumnImplKt.isRelative(rowColumnParentData3);
                                if (!isRelative) {
                                    z = false;
                                    placeableArr[i22] = mo2758measureBRTryo02;
                                    measurables = list;
                                    f4 = f5;
                                    i22 = i24;
                                    size4 = i3;
                                    i21 = i25;
                                }
                            }
                            z = true;
                            placeableArr[i22] = mo2758measureBRTryo02;
                            measurables = list;
                            f4 = f5;
                            i22 = i24;
                            size4 = i3;
                            i21 = i25;
                        } else {
                            measurables = list;
                            i22 = i24;
                        }
                    }
                    coerceAtMost = RangesKt___RangesKt.coerceAtMost(i23 + i18, orientationIndependentConstraints.getMainAxisMax() - i11);
                }
                Ref.IntRef intRef = new Ref.IntRef();
                if (z) {
                    int i26 = 0;
                    i5 = 0;
                    while (i26 < size) {
                        int i27 = i26 + 1;
                        Placeable placeable = placeableArr[i26];
                        Intrinsics.checkNotNull(placeable);
                        crossAxisAlignment2 = RowColumnImplKt.getCrossAxisAlignment(rowColumnParentDataArr3[i26]);
                        Integer calculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment2 == null ? null : crossAxisAlignment2.calculateAlignmentLinePosition$foundation_layout_release(placeable);
                        if (calculateAlignmentLinePosition$foundation_layout_release != null) {
                            int i28 = intRef.element;
                            int intValue = calculateAlignmentLinePosition$foundation_layout_release.intValue();
                            if (intValue == Integer.MIN_VALUE) {
                                intValue = 0;
                            }
                            intRef.element = Math.max(i28, intValue);
                            rowColumnMeasurePolicy_TDGSqEk$crossAxisSize2 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeable, LayoutOrientation.this);
                            LayoutOrientation layoutOrientation = LayoutOrientation.this;
                            int intValue2 = calculateAlignmentLinePosition$foundation_layout_release.intValue();
                            if (intValue2 == Integer.MIN_VALUE) {
                                intValue2 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeable, layoutOrientation);
                            }
                            i5 = Math.max(i5, rowColumnMeasurePolicy_TDGSqEk$crossAxisSize2 - intValue2);
                        }
                        i26 = i27;
                    }
                } else {
                    i5 = 0;
                }
                int max2 = Math.max(i11 + coerceAtMost, orientationIndependentConstraints.getMainAxisMin());
                int max3 = (orientationIndependentConstraints.getCrossAxisMax() == Integer.MAX_VALUE || crossAxisSize != SizeMode.Expand) ? Math.max(i2, Math.max(orientationIndependentConstraints.getCrossAxisMin(), intRef.element + i5)) : orientationIndependentConstraints.getCrossAxisMax();
                LayoutOrientation layoutOrientation2 = LayoutOrientation.this;
                LayoutOrientation layoutOrientation3 = LayoutOrientation.Horizontal;
                int i29 = layoutOrientation2 == layoutOrientation3 ? max2 : max3;
                int i30 = layoutOrientation2 == layoutOrientation3 ? max3 : max2;
                int size5 = list.size();
                int[] iArr = new int[size5];
                for (int i31 = 0; i31 < size5; i31++) {
                    iArr[i31] = 0;
                }
                return MeasureScope.DefaultImpls.layout$default(receiver, i29, i30, null, new RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4(list, placeableArr, arrangement, max2, receiver, iArr, LayoutOrientation.this, rowColumnParentDataArr3, crossAxisAlignment, max3, intRef), 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Function3 MinIntrinsicHeightMeasureBlock;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MinIntrinsicHeightMeasureBlock = RowColumnImplKt.MinIntrinsicHeightMeasureBlock(LayoutOrientation.this);
                return ((Number) MinIntrinsicHeightMeasureBlock.invoke(measurables, Integer.valueOf(i2), Integer.valueOf(intrinsicMeasureScope.mo271roundToPx0680j_4(f2)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Function3 MinIntrinsicWidthMeasureBlock;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MinIntrinsicWidthMeasureBlock = RowColumnImplKt.MinIntrinsicWidthMeasureBlock(LayoutOrientation.this);
                return ((Number) MinIntrinsicWidthMeasureBlock.invoke(measurables, Integer.valueOf(i2), Integer.valueOf(intrinsicMeasureScope.mo271roundToPx0680j_4(f2)))).intValue();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }
}
