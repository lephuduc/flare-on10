package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u0015*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\u001c\u0010\u001b\u001a\u00020\u0015*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0015H\u0016J)\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010\u0018\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u001c\u0010%\u001a\u00020\u0015*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\u001c\u0010&\u001a\u00020\u0015*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0015H\u0016R\u001c\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(FFLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMinHeight-D9Ej5fM", "()F", "F", "getMinWidth-D9Ej5fM", "equals", "", "other", "", "hashCode", "", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class UnspecifiedConstraintsModifier extends InspectorValueInfo implements LayoutModifier {
    private final float minHeight;
    private final float minWidth;

    private UnspecifiedConstraintsModifier(float f2, float f3, Function1<? super InspectorInfo, Unit> function1) {
        super(function1);
        this.minWidth = f2;
        this.minHeight = f3;
    }

    public /* synthetic */ UnspecifiedConstraintsModifier(float f2, float f3, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Dp.Companion.m3345getUnspecifiedD9Ej5fM() : f2, (i2 & 2) != 0 ? Dp.Companion.m3345getUnspecifiedD9Ej5fM() : f3, function1, null);
    }

    public /* synthetic */ UnspecifiedConstraintsModifier(float f2, float f3, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return LayoutModifier.DefaultImpls.all(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return LayoutModifier.DefaultImpls.any(this, function1);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof UnspecifiedConstraintsModifier) {
            UnspecifiedConstraintsModifier unspecifiedConstraintsModifier = (UnspecifiedConstraintsModifier) obj;
            return Dp.m3330equalsimpl0(m419getMinWidthD9Ej5fM(), unspecifiedConstraintsModifier.m419getMinWidthD9Ej5fM()) && Dp.m3330equalsimpl0(m418getMinHeightD9Ej5fM(), unspecifiedConstraintsModifier.m418getMinHeightD9Ej5fM());
        }
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldIn(R r2, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
        return (R) LayoutModifier.DefaultImpls.foldIn(this, r2, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldOut(R r2, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
        return (R) LayoutModifier.DefaultImpls.foldOut(this, r2, function2);
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public final float m418getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public final float m419getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    public int hashCode() {
        return (Dp.m3331hashCodeimpl(m419getMinWidthD9Ej5fM()) * 31) + Dp.m3331hashCodeimpl(m418getMinHeightD9Ej5fM());
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(measurable.maxIntrinsicHeight(i2), !Dp.m3330equalsimpl0(m418getMinHeightD9Ej5fM(), Dp.Companion.m3345getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo271roundToPx0680j_4(m418getMinHeightD9Ej5fM()) : 0);
        return coerceAtLeast;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(measurable.maxIntrinsicWidth(i2), !Dp.m3330equalsimpl0(m419getMinWidthD9Ej5fM(), Dp.Companion.m3345getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo271roundToPx0680j_4(m419getMinWidthD9Ej5fM()) : 0);
        return coerceAtLeast;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo21measure3p2s80s(@NotNull MeasureScope receiver, @NotNull Measurable measurable, long j2) {
        int m3295getMinWidthimpl;
        int m3294getMinHeightimpl;
        int coerceAtMost;
        int coerceAtMost2;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        float m419getMinWidthD9Ej5fM = m419getMinWidthD9Ej5fM();
        Dp.Companion companion = Dp.Companion;
        if (Dp.m3330equalsimpl0(m419getMinWidthD9Ej5fM, companion.m3345getUnspecifiedD9Ej5fM()) || Constraints.m3295getMinWidthimpl(j2) != 0) {
            m3295getMinWidthimpl = Constraints.m3295getMinWidthimpl(j2);
        } else {
            coerceAtMost2 = RangesKt___RangesKt.coerceAtMost(receiver.mo271roundToPx0680j_4(m419getMinWidthD9Ej5fM()), Constraints.m3293getMaxWidthimpl(j2));
            m3295getMinWidthimpl = RangesKt___RangesKt.coerceAtLeast(coerceAtMost2, 0);
        }
        int m3293getMaxWidthimpl = Constraints.m3293getMaxWidthimpl(j2);
        if (Dp.m3330equalsimpl0(m418getMinHeightD9Ej5fM(), companion.m3345getUnspecifiedD9Ej5fM()) || Constraints.m3294getMinHeightimpl(j2) != 0) {
            m3294getMinHeightimpl = Constraints.m3294getMinHeightimpl(j2);
        } else {
            coerceAtMost = RangesKt___RangesKt.coerceAtMost(receiver.mo271roundToPx0680j_4(m418getMinHeightD9Ej5fM()), Constraints.m3292getMaxHeightimpl(j2));
            m3294getMinHeightimpl = RangesKt___RangesKt.coerceAtLeast(coerceAtMost, 0);
        }
        Placeable mo2758measureBRTryo0 = measurable.mo2758measureBRTryo0(ConstraintsKt.Constraints(m3295getMinWidthimpl, m3293getMaxWidthimpl, m3294getMinHeightimpl, Constraints.m3292getMaxHeightimpl(j2)));
        return MeasureScope.DefaultImpls.layout$default(receiver, mo2758measureBRTryo0.getWidth(), mo2758measureBRTryo0.getHeight(), null, new UnspecifiedConstraintsModifier$measure$1(mo2758measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(measurable.minIntrinsicHeight(i2), !Dp.m3330equalsimpl0(m418getMinHeightD9Ej5fM(), Dp.Companion.m3345getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo271roundToPx0680j_4(m418getMinHeightD9Ej5fM()) : 0);
        return coerceAtLeast;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(measurable.minIntrinsicWidth(i2), !Dp.m3330equalsimpl0(m419getMinWidthD9Ej5fM(), Dp.Companion.m3345getUnspecifiedD9Ej5fM()) ? intrinsicMeasureScope.mo271roundToPx0680j_4(m419getMinWidthD9Ej5fM()) : 0);
        return coerceAtLeast;
    }

    @Override // androidx.compose.ui.Modifier
    @NotNull
    public Modifier then(@NotNull Modifier modifier) {
        return LayoutModifier.DefaultImpls.then(this, modifier);
    }
}
