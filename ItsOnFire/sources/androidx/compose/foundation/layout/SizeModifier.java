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
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\u001b\u001a\u00020\u001a*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\u001c\u0010 \u001a\u00020\u001a*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001aH\u0016J)\u0010\"\u001a\u00020#*\u00020$2\u0006\u0010\u001d\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0012H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u001c\u0010)\u001a\u00020\u001a*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\u001c\u0010*\u001a\u00020\u001a*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001aH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0010R\u0019\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0010R\u0019\u0010\u0005\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0010R\u0019\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0010R!\u0010\u0011\u001a\u00020\u0012*\u00020\u00138BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/foundation/layout/SizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "maxWidth", "maxHeight", "enforceIncoming", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "targetConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/Density;", "getTargetConstraints-OenEA2s", "(Landroidx/compose/ui/unit/Density;)J", "equals", "other", "", "hashCode", "", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SizeModifier extends InspectorValueInfo implements LayoutModifier {
    private final boolean enforceIncoming;
    private final float maxHeight;
    private final float maxWidth;
    private final float minHeight;
    private final float minWidth;

    private SizeModifier(float f2, float f3, float f4, float f5, boolean z, Function1<? super InspectorInfo, Unit> function1) {
        super(function1);
        this.minWidth = f2;
        this.minHeight = f3;
        this.maxWidth = f4;
        this.maxHeight = f5;
        this.enforceIncoming = z;
    }

    public /* synthetic */ SizeModifier(float f2, float f3, float f4, float f5, boolean z, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Dp.Companion.m3345getUnspecifiedD9Ej5fM() : f2, (i2 & 2) != 0 ? Dp.Companion.m3345getUnspecifiedD9Ej5fM() : f3, (i2 & 4) != 0 ? Dp.Companion.m3345getUnspecifiedD9Ej5fM() : f4, (i2 & 8) != 0 ? Dp.Companion.m3345getUnspecifiedD9Ej5fM() : f5, z, function1, null);
    }

    public /* synthetic */ SizeModifier(float f2, float f3, float f4, float f5, boolean z, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, z, function1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
        if (r5 != Integer.MAX_VALUE) goto L11;
     */
    /* renamed from: getTargetConstraints-OenEA2s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long m417getTargetConstraintsOenEA2s(androidx.compose.ui.unit.Density r8) {
        /*
            r7 = this;
            float r0 = r7.maxWidth
            androidx.compose.ui.unit.Dp$Companion r1 = androidx.compose.ui.unit.Dp.Companion
            float r2 = r1.m3345getUnspecifiedD9Ej5fM()
            boolean r0 = androidx.compose.ui.unit.Dp.m3330equalsimpl0(r0, r2)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r0 != 0) goto L30
            float r0 = r7.maxWidth
            androidx.compose.ui.unit.Dp r0 = androidx.compose.ui.unit.Dp.m3323boximpl(r0)
            float r4 = (float) r3
            float r4 = androidx.compose.ui.unit.Dp.m3325constructorimpl(r4)
            androidx.compose.ui.unit.Dp r4 = androidx.compose.ui.unit.Dp.m3323boximpl(r4)
            java.lang.Comparable r0 = kotlin.ranges.RangesKt.coerceAtLeast(r0, r4)
            androidx.compose.ui.unit.Dp r0 = (androidx.compose.ui.unit.Dp) r0
            float r0 = r0.m3339unboximpl()
            int r0 = r8.mo271roundToPx0680j_4(r0)
            goto L31
        L30:
            r0 = r2
        L31:
            float r4 = r7.maxHeight
            float r5 = r1.m3345getUnspecifiedD9Ej5fM()
            boolean r4 = androidx.compose.ui.unit.Dp.m3330equalsimpl0(r4, r5)
            if (r4 != 0) goto L5b
            float r4 = r7.maxHeight
            androidx.compose.ui.unit.Dp r4 = androidx.compose.ui.unit.Dp.m3323boximpl(r4)
            float r5 = (float) r3
            float r5 = androidx.compose.ui.unit.Dp.m3325constructorimpl(r5)
            androidx.compose.ui.unit.Dp r5 = androidx.compose.ui.unit.Dp.m3323boximpl(r5)
            java.lang.Comparable r4 = kotlin.ranges.RangesKt.coerceAtLeast(r4, r5)
            androidx.compose.ui.unit.Dp r4 = (androidx.compose.ui.unit.Dp) r4
            float r4 = r4.m3339unboximpl()
            int r4 = r8.mo271roundToPx0680j_4(r4)
            goto L5c
        L5b:
            r4 = r2
        L5c:
            float r5 = r7.minWidth
            float r6 = r1.m3345getUnspecifiedD9Ej5fM()
            boolean r5 = androidx.compose.ui.unit.Dp.m3330equalsimpl0(r5, r6)
            if (r5 != 0) goto L79
            float r5 = r7.minWidth
            int r5 = r8.mo271roundToPx0680j_4(r5)
            int r5 = kotlin.ranges.RangesKt.coerceAtMost(r5, r0)
            int r5 = kotlin.ranges.RangesKt.coerceAtLeast(r5, r3)
            if (r5 == r2) goto L79
            goto L7a
        L79:
            r5 = r3
        L7a:
            float r6 = r7.minHeight
            float r1 = r1.m3345getUnspecifiedD9Ej5fM()
            boolean r1 = androidx.compose.ui.unit.Dp.m3330equalsimpl0(r6, r1)
            if (r1 != 0) goto L97
            float r7 = r7.minHeight
            int r7 = r8.mo271roundToPx0680j_4(r7)
            int r7 = kotlin.ranges.RangesKt.coerceAtMost(r7, r4)
            int r7 = kotlin.ranges.RangesKt.coerceAtLeast(r7, r3)
            if (r7 == r2) goto L97
            r3 = r7
        L97:
            long r7 = androidx.compose.ui.unit.ConstraintsKt.Constraints(r5, r0, r3, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.SizeModifier.m417getTargetConstraintsOenEA2s(androidx.compose.ui.unit.Density):long");
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
        if (obj instanceof SizeModifier) {
            SizeModifier sizeModifier = (SizeModifier) obj;
            return Dp.m3330equalsimpl0(this.minWidth, sizeModifier.minWidth) && Dp.m3330equalsimpl0(this.minHeight, sizeModifier.minHeight) && Dp.m3330equalsimpl0(this.maxWidth, sizeModifier.maxWidth) && Dp.m3330equalsimpl0(this.maxHeight, sizeModifier.maxHeight) && this.enforceIncoming == sizeModifier.enforceIncoming;
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

    public int hashCode() {
        return ((((((Dp.m3331hashCodeimpl(this.minWidth) * 31) + Dp.m3331hashCodeimpl(this.minHeight)) * 31) + Dp.m3331hashCodeimpl(this.maxWidth)) * 31) + Dp.m3331hashCodeimpl(this.maxHeight)) * 31;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m417getTargetConstraintsOenEA2s = m417getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m3290getHasFixedHeightimpl(m417getTargetConstraintsOenEA2s) ? Constraints.m3292getMaxHeightimpl(m417getTargetConstraintsOenEA2s) : ConstraintsKt.m3306constrainHeightK40F9xA(m417getTargetConstraintsOenEA2s, measurable.maxIntrinsicHeight(i2));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m417getTargetConstraintsOenEA2s = m417getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m3291getHasFixedWidthimpl(m417getTargetConstraintsOenEA2s) ? Constraints.m3293getMaxWidthimpl(m417getTargetConstraintsOenEA2s) : ConstraintsKt.m3307constrainWidthK40F9xA(m417getTargetConstraintsOenEA2s, measurable.maxIntrinsicWidth(i2));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo21measure3p2s80s(@NotNull MeasureScope receiver, @NotNull Measurable measurable, long j2) {
        long Constraints;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m417getTargetConstraintsOenEA2s = m417getTargetConstraintsOenEA2s(receiver);
        if (this.enforceIncoming) {
            Constraints = ConstraintsKt.m3305constrainN9IONVI(j2, m417getTargetConstraintsOenEA2s);
        } else {
            float f2 = this.minWidth;
            Dp.Companion companion = Dp.Companion;
            Constraints = ConstraintsKt.Constraints(!Dp.m3330equalsimpl0(f2, companion.m3345getUnspecifiedD9Ej5fM()) ? Constraints.m3295getMinWidthimpl(m417getTargetConstraintsOenEA2s) : RangesKt___RangesKt.coerceAtMost(Constraints.m3295getMinWidthimpl(j2), Constraints.m3293getMaxWidthimpl(m417getTargetConstraintsOenEA2s)), !Dp.m3330equalsimpl0(this.maxWidth, companion.m3345getUnspecifiedD9Ej5fM()) ? Constraints.m3293getMaxWidthimpl(m417getTargetConstraintsOenEA2s) : RangesKt___RangesKt.coerceAtLeast(Constraints.m3293getMaxWidthimpl(j2), Constraints.m3295getMinWidthimpl(m417getTargetConstraintsOenEA2s)), !Dp.m3330equalsimpl0(this.minHeight, companion.m3345getUnspecifiedD9Ej5fM()) ? Constraints.m3294getMinHeightimpl(m417getTargetConstraintsOenEA2s) : RangesKt___RangesKt.coerceAtMost(Constraints.m3294getMinHeightimpl(j2), Constraints.m3292getMaxHeightimpl(m417getTargetConstraintsOenEA2s)), !Dp.m3330equalsimpl0(this.maxHeight, companion.m3345getUnspecifiedD9Ej5fM()) ? Constraints.m3292getMaxHeightimpl(m417getTargetConstraintsOenEA2s) : RangesKt___RangesKt.coerceAtLeast(Constraints.m3292getMaxHeightimpl(j2), Constraints.m3294getMinHeightimpl(m417getTargetConstraintsOenEA2s)));
        }
        Placeable mo2758measureBRTryo0 = measurable.mo2758measureBRTryo0(Constraints);
        return MeasureScope.DefaultImpls.layout$default(receiver, mo2758measureBRTryo0.getWidth(), mo2758measureBRTryo0.getHeight(), null, new SizeModifier$measure$1(mo2758measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m417getTargetConstraintsOenEA2s = m417getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m3290getHasFixedHeightimpl(m417getTargetConstraintsOenEA2s) ? Constraints.m3292getMaxHeightimpl(m417getTargetConstraintsOenEA2s) : ConstraintsKt.m3306constrainHeightK40F9xA(m417getTargetConstraintsOenEA2s, measurable.minIntrinsicHeight(i2));
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m417getTargetConstraintsOenEA2s = m417getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m3291getHasFixedWidthimpl(m417getTargetConstraintsOenEA2s) ? Constraints.m3293getMaxWidthimpl(m417getTargetConstraintsOenEA2s) : ConstraintsKt.m3307constrainWidthK40F9xA(m417getTargetConstraintsOenEA2s, measurable.minIntrinsicWidth(i2));
    }

    @Override // androidx.compose.ui.Modifier
    @NotNull
    public Modifier then(@NotNull Modifier modifier) {
        return LayoutModifier.DefaultImpls.then(this, modifier);
    }
}
