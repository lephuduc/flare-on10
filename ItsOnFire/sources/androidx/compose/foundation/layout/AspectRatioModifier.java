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
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B.\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\u0010\fJ\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0019\u0010\u0018\u001a\u00020\u0019*\u00020\u001aH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001d\u001a\u00020\u0015*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015H\u0016J\u001c\u0010\"\u001a\u00020\u0015*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0015H\u0016J)\u0010$\u001a\u00020%*\u00020&2\u0006\u0010\u001f\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001aH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u001c\u0010+\u001a\u00020\u0015*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015H\u0016J\u001c\u0010,\u001a\u00020\u0015*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0015H\u0016J#\u0010-\u001a\u00020\u0019*\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100J#\u00101\u001a\u00020\u0019*\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00100J#\u00103\u001a\u00020\u0019*\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00100J#\u00105\u001a\u00020\u0019*\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00100R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "aspectRatio", "", "matchHeightConstraintsFirst", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(FZLkotlin/jvm/functions/Function1;)V", "getAspectRatio", "()F", "getMatchHeightConstraintsFirst", "()Z", "equals", "other", "", "hashCode", "", "toString", "", "findSize", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/Constraints;", "findSize-ToXhtMw", "(J)J", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "tryMaxHeight", "enforceConstraints", "tryMaxHeight-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxWidth-JN-0ABg", "tryMinHeight", "tryMinHeight-JN-0ABg", "tryMinWidth", "tryMinWidth-JN-0ABg", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
final class AspectRatioModifier extends InspectorValueInfo implements LayoutModifier {
    private final float aspectRatio;
    private final boolean matchHeightConstraintsFirst;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioModifier(float f2, boolean z, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.aspectRatio = f2;
        this.matchHeightConstraintsFirst = z;
        if (f2 > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + getAspectRatio() + " must be > 0").toString());
    }

    /* renamed from: findSize-ToXhtMw  reason: not valid java name */
    private final long m330findSizeToXhtMw(long j2) {
        if (this.matchHeightConstraintsFirst) {
            long m332tryMaxHeightJN0ABg$default = m332tryMaxHeightJN0ABg$default(this, j2, false, 1, null);
            IntSize.Companion companion = IntSize.Companion;
            if (!IntSize.m3483equalsimpl0(m332tryMaxHeightJN0ABg$default, companion.m3490getZeroYbymL2g())) {
                return m332tryMaxHeightJN0ABg$default;
            }
            long m334tryMaxWidthJN0ABg$default = m334tryMaxWidthJN0ABg$default(this, j2, false, 1, null);
            if (!IntSize.m3483equalsimpl0(m334tryMaxWidthJN0ABg$default, companion.m3490getZeroYbymL2g())) {
                return m334tryMaxWidthJN0ABg$default;
            }
            long m336tryMinHeightJN0ABg$default = m336tryMinHeightJN0ABg$default(this, j2, false, 1, null);
            if (!IntSize.m3483equalsimpl0(m336tryMinHeightJN0ABg$default, companion.m3490getZeroYbymL2g())) {
                return m336tryMinHeightJN0ABg$default;
            }
            long m338tryMinWidthJN0ABg$default = m338tryMinWidthJN0ABg$default(this, j2, false, 1, null);
            if (!IntSize.m3483equalsimpl0(m338tryMinWidthJN0ABg$default, companion.m3490getZeroYbymL2g())) {
                return m338tryMinWidthJN0ABg$default;
            }
            long m331tryMaxHeightJN0ABg = m331tryMaxHeightJN0ABg(j2, false);
            if (!IntSize.m3483equalsimpl0(m331tryMaxHeightJN0ABg, companion.m3490getZeroYbymL2g())) {
                return m331tryMaxHeightJN0ABg;
            }
            long m333tryMaxWidthJN0ABg = m333tryMaxWidthJN0ABg(j2, false);
            if (!IntSize.m3483equalsimpl0(m333tryMaxWidthJN0ABg, companion.m3490getZeroYbymL2g())) {
                return m333tryMaxWidthJN0ABg;
            }
            long m335tryMinHeightJN0ABg = m335tryMinHeightJN0ABg(j2, false);
            if (!IntSize.m3483equalsimpl0(m335tryMinHeightJN0ABg, companion.m3490getZeroYbymL2g())) {
                return m335tryMinHeightJN0ABg;
            }
            long m337tryMinWidthJN0ABg = m337tryMinWidthJN0ABg(j2, false);
            if (!IntSize.m3483equalsimpl0(m337tryMinWidthJN0ABg, companion.m3490getZeroYbymL2g())) {
                return m337tryMinWidthJN0ABg;
            }
        } else {
            long m334tryMaxWidthJN0ABg$default2 = m334tryMaxWidthJN0ABg$default(this, j2, false, 1, null);
            IntSize.Companion companion2 = IntSize.Companion;
            if (!IntSize.m3483equalsimpl0(m334tryMaxWidthJN0ABg$default2, companion2.m3490getZeroYbymL2g())) {
                return m334tryMaxWidthJN0ABg$default2;
            }
            long m332tryMaxHeightJN0ABg$default2 = m332tryMaxHeightJN0ABg$default(this, j2, false, 1, null);
            if (!IntSize.m3483equalsimpl0(m332tryMaxHeightJN0ABg$default2, companion2.m3490getZeroYbymL2g())) {
                return m332tryMaxHeightJN0ABg$default2;
            }
            long m338tryMinWidthJN0ABg$default2 = m338tryMinWidthJN0ABg$default(this, j2, false, 1, null);
            if (!IntSize.m3483equalsimpl0(m338tryMinWidthJN0ABg$default2, companion2.m3490getZeroYbymL2g())) {
                return m338tryMinWidthJN0ABg$default2;
            }
            long m336tryMinHeightJN0ABg$default2 = m336tryMinHeightJN0ABg$default(this, j2, false, 1, null);
            if (!IntSize.m3483equalsimpl0(m336tryMinHeightJN0ABg$default2, companion2.m3490getZeroYbymL2g())) {
                return m336tryMinHeightJN0ABg$default2;
            }
            long m333tryMaxWidthJN0ABg2 = m333tryMaxWidthJN0ABg(j2, false);
            if (!IntSize.m3483equalsimpl0(m333tryMaxWidthJN0ABg2, companion2.m3490getZeroYbymL2g())) {
                return m333tryMaxWidthJN0ABg2;
            }
            long m331tryMaxHeightJN0ABg2 = m331tryMaxHeightJN0ABg(j2, false);
            if (!IntSize.m3483equalsimpl0(m331tryMaxHeightJN0ABg2, companion2.m3490getZeroYbymL2g())) {
                return m331tryMaxHeightJN0ABg2;
            }
            long m337tryMinWidthJN0ABg2 = m337tryMinWidthJN0ABg(j2, false);
            if (!IntSize.m3483equalsimpl0(m337tryMinWidthJN0ABg2, companion2.m3490getZeroYbymL2g())) {
                return m337tryMinWidthJN0ABg2;
            }
            long m335tryMinHeightJN0ABg2 = m335tryMinHeightJN0ABg(j2, false);
            if (!IntSize.m3483equalsimpl0(m335tryMinHeightJN0ABg2, companion2.m3490getZeroYbymL2g())) {
                return m335tryMinHeightJN0ABg2;
            }
        }
        return IntSize.Companion.m3490getZeroYbymL2g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
        r2 = kotlin.math.MathKt__MathJVMKt.roundToInt(r0 * r2.aspectRatio);
     */
    /* renamed from: tryMaxHeight-JN-0ABg  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long m331tryMaxHeightJN0ABg(long r3, boolean r5) {
        /*
            r2 = this;
            int r0 = androidx.compose.ui.unit.Constraints.m3292getMaxHeightimpl(r3)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L20
            float r1 = (float) r0
            float r2 = r2.aspectRatio
            float r1 = r1 * r2
            int r2 = kotlin.math.MathKt.roundToInt(r1)
            if (r2 <= 0) goto L20
            long r0 = androidx.compose.ui.unit.IntSizeKt.IntSize(r2, r0)
            if (r5 == 0) goto L1f
            boolean r2 = androidx.compose.ui.unit.ConstraintsKt.m3308isSatisfiedBy4WqzIAM(r3, r0)
            if (r2 == 0) goto L20
        L1f:
            return r0
        L20:
            androidx.compose.ui.unit.IntSize$Companion r2 = androidx.compose.ui.unit.IntSize.Companion
            long r2 = r2.m3490getZeroYbymL2g()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.AspectRatioModifier.m331tryMaxHeightJN0ABg(long, boolean):long");
    }

    /* renamed from: tryMaxHeight-JN-0ABg$default  reason: not valid java name */
    public static /* synthetic */ long m332tryMaxHeightJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m331tryMaxHeightJN0ABg(j2, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
        r2 = kotlin.math.MathKt__MathJVMKt.roundToInt(r0 / r2.aspectRatio);
     */
    /* renamed from: tryMaxWidth-JN-0ABg  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long m333tryMaxWidthJN0ABg(long r3, boolean r5) {
        /*
            r2 = this;
            int r0 = androidx.compose.ui.unit.Constraints.m3293getMaxWidthimpl(r3)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L20
            float r1 = (float) r0
            float r2 = r2.aspectRatio
            float r1 = r1 / r2
            int r2 = kotlin.math.MathKt.roundToInt(r1)
            if (r2 <= 0) goto L20
            long r0 = androidx.compose.ui.unit.IntSizeKt.IntSize(r0, r2)
            if (r5 == 0) goto L1f
            boolean r2 = androidx.compose.ui.unit.ConstraintsKt.m3308isSatisfiedBy4WqzIAM(r3, r0)
            if (r2 == 0) goto L20
        L1f:
            return r0
        L20:
            androidx.compose.ui.unit.IntSize$Companion r2 = androidx.compose.ui.unit.IntSize.Companion
            long r2 = r2.m3490getZeroYbymL2g()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.AspectRatioModifier.m333tryMaxWidthJN0ABg(long, boolean):long");
    }

    /* renamed from: tryMaxWidth-JN-0ABg$default  reason: not valid java name */
    public static /* synthetic */ long m334tryMaxWidthJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m333tryMaxWidthJN0ABg(j2, z);
    }

    /* renamed from: tryMinHeight-JN-0ABg  reason: not valid java name */
    private final long m335tryMinHeightJN0ABg(long j2, boolean z) {
        int roundToInt;
        int m3294getMinHeightimpl = Constraints.m3294getMinHeightimpl(j2);
        roundToInt = MathKt__MathJVMKt.roundToInt(m3294getMinHeightimpl * this.aspectRatio);
        if (roundToInt > 0) {
            long IntSize = IntSizeKt.IntSize(roundToInt, m3294getMinHeightimpl);
            if (!z || ConstraintsKt.m3308isSatisfiedBy4WqzIAM(j2, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m3490getZeroYbymL2g();
    }

    /* renamed from: tryMinHeight-JN-0ABg$default  reason: not valid java name */
    public static /* synthetic */ long m336tryMinHeightJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m335tryMinHeightJN0ABg(j2, z);
    }

    /* renamed from: tryMinWidth-JN-0ABg  reason: not valid java name */
    private final long m337tryMinWidthJN0ABg(long j2, boolean z) {
        int roundToInt;
        int m3295getMinWidthimpl = Constraints.m3295getMinWidthimpl(j2);
        roundToInt = MathKt__MathJVMKt.roundToInt(m3295getMinWidthimpl / this.aspectRatio);
        if (roundToInt > 0) {
            long IntSize = IntSizeKt.IntSize(m3295getMinWidthimpl, roundToInt);
            if (!z || ConstraintsKt.m3308isSatisfiedBy4WqzIAM(j2, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m3490getZeroYbymL2g();
    }

    /* renamed from: tryMinWidth-JN-0ABg$default  reason: not valid java name */
    public static /* synthetic */ long m338tryMinWidthJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m337tryMinWidthJN0ABg(j2, z);
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
        if (this == obj) {
            return true;
        }
        AspectRatioModifier aspectRatioModifier = obj instanceof AspectRatioModifier ? (AspectRatioModifier) obj : null;
        if (aspectRatioModifier == null) {
            return false;
        }
        return ((this.aspectRatio > aspectRatioModifier.aspectRatio ? 1 : (this.aspectRatio == aspectRatioModifier.aspectRatio ? 0 : -1)) == 0) && this.matchHeightConstraintsFirst == ((AspectRatioModifier) obj).matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldIn(R r2, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
        return (R) LayoutModifier.DefaultImpls.foldIn(this, r2, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldOut(R r2, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
        return (R) LayoutModifier.DefaultImpls.foldOut(this, r2, function2);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    public int hashCode() {
        return (Float.hashCode(this.aspectRatio) * 31) + Boolean.hashCode(this.matchHeightConstraintsFirst);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        int roundToInt;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (i2 != Integer.MAX_VALUE) {
            roundToInt = MathKt__MathJVMKt.roundToInt(i2 / this.aspectRatio);
            return roundToInt;
        }
        return measurable.maxIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        int roundToInt;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (i2 != Integer.MAX_VALUE) {
            roundToInt = MathKt__MathJVMKt.roundToInt(i2 * this.aspectRatio);
            return roundToInt;
        }
        return measurable.maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo21measure3p2s80s(@NotNull MeasureScope receiver, @NotNull Measurable measurable, long j2) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m330findSizeToXhtMw = m330findSizeToXhtMw(j2);
        if (!IntSize.m3483equalsimpl0(m330findSizeToXhtMw, IntSize.Companion.m3490getZeroYbymL2g())) {
            j2 = Constraints.Companion.m3301fixedJhjzzOo(IntSize.m3485getWidthimpl(m330findSizeToXhtMw), IntSize.m3484getHeightimpl(m330findSizeToXhtMw));
        }
        Placeable mo2758measureBRTryo0 = measurable.mo2758measureBRTryo0(j2);
        return MeasureScope.DefaultImpls.layout$default(receiver, mo2758measureBRTryo0.getWidth(), mo2758measureBRTryo0.getHeight(), null, new AspectRatioModifier$measure$1(mo2758measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        int roundToInt;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (i2 != Integer.MAX_VALUE) {
            roundToInt = MathKt__MathJVMKt.roundToInt(i2 / this.aspectRatio);
            return roundToInt;
        }
        return measurable.minIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        int roundToInt;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (i2 != Integer.MAX_VALUE) {
            roundToInt = MathKt__MathJVMKt.roundToInt(i2 * this.aspectRatio);
            return roundToInt;
        }
        return measurable.minIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.Modifier
    @NotNull
    public Modifier then(@NotNull Modifier modifier) {
        return LayoutModifier.DefaultImpls.then(this, modifier);
    }

    @NotNull
    public String toString() {
        return "AspectRatioModifier(aspectRatio=" + this.aspectRatio + ')';
    }
}
