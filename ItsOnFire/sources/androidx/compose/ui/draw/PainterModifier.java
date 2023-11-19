package androidx.compose.ui.draw;

import androidx.appcompat.R;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BX\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\u0010\u0015J\u001d\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\u001d\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u0010(J\b\u00102\u001a\u000203H\u0016J\f\u00104\u001a\u00020\u0013*\u000205H\u0016J\u0019\u00106\u001a\u00020\u0007*\u00020%H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u00020\u0007*\u00020%H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u00108J\u001c\u0010;\u001a\u00020-*\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020-H\u0016J\u001c\u0010@\u001a\u00020-*\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010A\u001a\u00020-H\u0016J)\u0010B\u001a\u00020C*\u00020D2\u0006\u0010=\u001a\u00020E2\u0006\u00100\u001a\u00020/H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bF\u0010GJ\u001c\u0010H\u001a\u00020-*\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020-H\u0016J\u001c\u0010I\u001a\u00020-*\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010A\u001a\u00020-H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"Landroidx/compose/ui/draw/PainterModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Lkotlin/jvm/functions/Function1;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "getAlpha", "()F", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "getSizeToIntrinsics", "()Z", "useIntrinsicSize", "getUseIntrinsicSize", "calculateScaledSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "equals", "other", "", "hashCode", "", "modifyConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "toString", "", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "hasSpecifiedAndFiniteHeight", "hasSpecifiedAndFiniteHeight-uvyYCjk", "(J)Z", "hasSpecifiedAndFiniteWidth", "hasSpecifiedAndFiniteWidth-uvyYCjk", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class PainterModifier extends InspectorValueInfo implements LayoutModifier, DrawModifier {
    @NotNull
    private final Alignment alignment;
    private final float alpha;
    @Nullable
    private final ColorFilter colorFilter;
    @NotNull
    private final ContentScale contentScale;
    @NotNull
    private final Painter painter;
    private final boolean sizeToIntrinsics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PainterModifier(@NotNull Painter painter, boolean z, @NotNull Alignment alignment, @NotNull ContentScale contentScale, float f2, @Nullable ColorFilter colorFilter, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.painter = painter;
        this.sizeToIntrinsics = z;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f2;
        this.colorFilter = colorFilter;
    }

    public /* synthetic */ PainterModifier(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(painter, z, (i2 & 4) != 0 ? Alignment.Companion.getCenter() : alignment, (i2 & 8) != 0 ? ContentScale.Companion.getInside() : contentScale, (i2 & 16) != 0 ? 1.0f : f2, (i2 & 32) != 0 ? null : colorFilter, function1);
    }

    /* renamed from: calculateScaledSize-E7KxVPU  reason: not valid java name */
    private final long m1095calculateScaledSizeE7KxVPU(long j2) {
        if (getUseIntrinsicSize()) {
            long Size = SizeKt.Size(!m1097hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.mo1874getIntrinsicSizeNHjbRc()) ? Size.m1230getWidthimpl(j2) : Size.m1230getWidthimpl(this.painter.mo1874getIntrinsicSizeNHjbRc()), !m1096hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.mo1874getIntrinsicSizeNHjbRc()) ? Size.m1227getHeightimpl(j2) : Size.m1227getHeightimpl(this.painter.mo1874getIntrinsicSizeNHjbRc()));
            if (!(Size.m1230getWidthimpl(j2) == 0.0f)) {
                if (!(Size.m1227getHeightimpl(j2) == 0.0f)) {
                    return ScaleFactorKt.m2834timesUQTWf7w(Size, this.contentScale.mo2749computeScaleFactorH7hwNQA(Size, j2));
                }
            }
            return Size.Companion.m1239getZeroNHjbRc();
        }
        return j2;
    }

    private final boolean getUseIntrinsicSize() {
        if (this.sizeToIntrinsics) {
            if (this.painter.mo1874getIntrinsicSizeNHjbRc() != Size.Companion.m1238getUnspecifiedNHjbRc()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk  reason: not valid java name */
    private final boolean m1096hasSpecifiedAndFiniteHeightuvyYCjk(long j2) {
        if (!Size.m1226equalsimpl0(j2, Size.Companion.m1238getUnspecifiedNHjbRc())) {
            float m1227getHeightimpl = Size.m1227getHeightimpl(j2);
            if ((Float.isInfinite(m1227getHeightimpl) || Float.isNaN(m1227getHeightimpl)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk  reason: not valid java name */
    private final boolean m1097hasSpecifiedAndFiniteWidthuvyYCjk(long j2) {
        if (!Size.m1226equalsimpl0(j2, Size.Companion.m1238getUnspecifiedNHjbRc())) {
            float m1230getWidthimpl = Size.m1230getWidthimpl(j2);
            if ((Float.isInfinite(m1230getWidthimpl) || Float.isNaN(m1230getWidthimpl)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: modifyConstraints-ZezNO4M  reason: not valid java name */
    private final long m1098modifyConstraintsZezNO4M(long j2) {
        int roundToInt;
        int roundToInt2;
        boolean z = true;
        boolean z2 = Constraints.m3289getHasBoundedWidthimpl(j2) && Constraints.m3288getHasBoundedHeightimpl(j2);
        if (!Constraints.m3291getHasFixedWidthimpl(j2) || !Constraints.m3290getHasFixedHeightimpl(j2)) {
            z = false;
        }
        if ((getUseIntrinsicSize() || !z2) && !z) {
            long mo1874getIntrinsicSizeNHjbRc = this.painter.mo1874getIntrinsicSizeNHjbRc();
            long m1095calculateScaledSizeE7KxVPU = m1095calculateScaledSizeE7KxVPU(SizeKt.Size(ConstraintsKt.m3307constrainWidthK40F9xA(j2, m1097hasSpecifiedAndFiniteWidthuvyYCjk(mo1874getIntrinsicSizeNHjbRc) ? MathKt__MathJVMKt.roundToInt(Size.m1230getWidthimpl(mo1874getIntrinsicSizeNHjbRc)) : Constraints.m3295getMinWidthimpl(j2)), ConstraintsKt.m3306constrainHeightK40F9xA(j2, m1096hasSpecifiedAndFiniteHeightuvyYCjk(mo1874getIntrinsicSizeNHjbRc) ? MathKt__MathJVMKt.roundToInt(Size.m1227getHeightimpl(mo1874getIntrinsicSizeNHjbRc)) : Constraints.m3294getMinHeightimpl(j2))));
            roundToInt = MathKt__MathJVMKt.roundToInt(Size.m1230getWidthimpl(m1095calculateScaledSizeE7KxVPU));
            int m3307constrainWidthK40F9xA = ConstraintsKt.m3307constrainWidthK40F9xA(j2, roundToInt);
            roundToInt2 = MathKt__MathJVMKt.roundToInt(Size.m1227getHeightimpl(m1095calculateScaledSizeE7KxVPU));
            return Constraints.m3284copyZbe2FdA$default(j2, m3307constrainWidthK40F9xA, 0, ConstraintsKt.m3306constrainHeightK40F9xA(j2, roundToInt2), 0, 10, null);
        }
        return Constraints.m3284copyZbe2FdA$default(j2, Constraints.m3293getMaxWidthimpl(j2), 0, Constraints.m3292getMaxHeightimpl(j2), 0, 10, null);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return LayoutModifier.DefaultImpls.all(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return LayoutModifier.DefaultImpls.any(this, function1);
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        long m1239getZeroNHjbRc;
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        int roundToInt4;
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        long mo1874getIntrinsicSizeNHjbRc = this.painter.mo1874getIntrinsicSizeNHjbRc();
        float m1230getWidthimpl = m1097hasSpecifiedAndFiniteWidthuvyYCjk(mo1874getIntrinsicSizeNHjbRc) ? Size.m1230getWidthimpl(mo1874getIntrinsicSizeNHjbRc) : Size.m1230getWidthimpl(contentDrawScope.mo1780getSizeNHjbRc());
        if (!m1096hasSpecifiedAndFiniteHeightuvyYCjk(mo1874getIntrinsicSizeNHjbRc)) {
            mo1874getIntrinsicSizeNHjbRc = contentDrawScope.mo1780getSizeNHjbRc();
        }
        long Size = SizeKt.Size(m1230getWidthimpl, Size.m1227getHeightimpl(mo1874getIntrinsicSizeNHjbRc));
        if (!(Size.m1230getWidthimpl(contentDrawScope.mo1780getSizeNHjbRc()) == 0.0f)) {
            if (!(Size.m1227getHeightimpl(contentDrawScope.mo1780getSizeNHjbRc()) == 0.0f)) {
                m1239getZeroNHjbRc = ScaleFactorKt.m2834timesUQTWf7w(Size, this.contentScale.mo2749computeScaleFactorH7hwNQA(Size, contentDrawScope.mo1780getSizeNHjbRc()));
                long j2 = m1239getZeroNHjbRc;
                Alignment alignment = this.alignment;
                roundToInt = MathKt__MathJVMKt.roundToInt(Size.m1230getWidthimpl(j2));
                roundToInt2 = MathKt__MathJVMKt.roundToInt(Size.m1227getHeightimpl(j2));
                long IntSize = IntSizeKt.IntSize(roundToInt, roundToInt2);
                roundToInt3 = MathKt__MathJVMKt.roundToInt(Size.m1230getWidthimpl(contentDrawScope.mo1780getSizeNHjbRc()));
                roundToInt4 = MathKt__MathJVMKt.roundToInt(Size.m1227getHeightimpl(contentDrawScope.mo1780getSizeNHjbRc()));
                long mo1079alignKFBX0sM = alignment.mo1079alignKFBX0sM(IntSize, IntSizeKt.IntSize(roundToInt3, roundToInt4), contentDrawScope.getLayoutDirection());
                float m3443getXimpl = IntOffset.m3443getXimpl(mo1079alignKFBX0sM);
                float m3444getYimpl = IntOffset.m3444getYimpl(mo1079alignKFBX0sM);
                contentDrawScope.getDrawContext().getTransform().translate(m3443getXimpl, m3444getYimpl);
                getPainter().m1880drawx_KDEd0(contentDrawScope, j2, getAlpha(), getColorFilter());
                contentDrawScope.getDrawContext().getTransform().translate(-m3443getXimpl, -m3444getYimpl);
                contentDrawScope.drawContent();
            }
        }
        m1239getZeroNHjbRc = Size.Companion.m1239getZeroNHjbRc();
        long j22 = m1239getZeroNHjbRc;
        Alignment alignment2 = this.alignment;
        roundToInt = MathKt__MathJVMKt.roundToInt(Size.m1230getWidthimpl(j22));
        roundToInt2 = MathKt__MathJVMKt.roundToInt(Size.m1227getHeightimpl(j22));
        long IntSize2 = IntSizeKt.IntSize(roundToInt, roundToInt2);
        roundToInt3 = MathKt__MathJVMKt.roundToInt(Size.m1230getWidthimpl(contentDrawScope.mo1780getSizeNHjbRc()));
        roundToInt4 = MathKt__MathJVMKt.roundToInt(Size.m1227getHeightimpl(contentDrawScope.mo1780getSizeNHjbRc()));
        long mo1079alignKFBX0sM2 = alignment2.mo1079alignKFBX0sM(IntSize2, IntSizeKt.IntSize(roundToInt3, roundToInt4), contentDrawScope.getLayoutDirection());
        float m3443getXimpl2 = IntOffset.m3443getXimpl(mo1079alignKFBX0sM2);
        float m3444getYimpl2 = IntOffset.m3444getYimpl(mo1079alignKFBX0sM2);
        contentDrawScope.getDrawContext().getTransform().translate(m3443getXimpl2, m3444getYimpl2);
        getPainter().m1880drawx_KDEd0(contentDrawScope, j22, getAlpha(), getColorFilter());
        contentDrawScope.getDrawContext().getTransform().translate(-m3443getXimpl2, -m3444getYimpl2);
        contentDrawScope.drawContent();
    }

    public boolean equals(@Nullable Object obj) {
        PainterModifier painterModifier = obj instanceof PainterModifier ? (PainterModifier) obj : null;
        if (painterModifier != null && Intrinsics.areEqual(this.painter, painterModifier.painter) && this.sizeToIntrinsics == painterModifier.sizeToIntrinsics && Intrinsics.areEqual(this.alignment, painterModifier.alignment) && Intrinsics.areEqual(this.contentScale, painterModifier.contentScale)) {
            return ((this.alpha > painterModifier.alpha ? 1 : (this.alpha == painterModifier.alpha ? 0 : -1)) == 0) && Intrinsics.areEqual(this.colorFilter, painterModifier.colorFilter);
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

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @Nullable
    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @NotNull
    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    @NotNull
    public final Painter getPainter() {
        return this.painter;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    public int hashCode() {
        int hashCode = ((((((((this.painter.hashCode() * 31) + Boolean.hashCode(this.sizeToIntrinsics)) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        return hashCode + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        int roundToInt;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (getUseIntrinsicSize()) {
            int maxIntrinsicHeight = measurable.maxIntrinsicHeight(Constraints.m3293getMaxWidthimpl(m1098modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null))));
            roundToInt = MathKt__MathJVMKt.roundToInt(Size.m1227getHeightimpl(m1095calculateScaledSizeE7KxVPU(SizeKt.Size(i2, maxIntrinsicHeight))));
            return Math.max(roundToInt, maxIntrinsicHeight);
        }
        return measurable.maxIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        int roundToInt;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (getUseIntrinsicSize()) {
            int maxIntrinsicWidth = measurable.maxIntrinsicWidth(Constraints.m3292getMaxHeightimpl(m1098modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null))));
            roundToInt = MathKt__MathJVMKt.roundToInt(Size.m1230getWidthimpl(m1095calculateScaledSizeE7KxVPU(SizeKt.Size(maxIntrinsicWidth, i2))));
            return Math.max(roundToInt, maxIntrinsicWidth);
        }
        return measurable.maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo21measure3p2s80s(@NotNull MeasureScope receiver, @NotNull Measurable measurable, long j2) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable mo2758measureBRTryo0 = measurable.mo2758measureBRTryo0(m1098modifyConstraintsZezNO4M(j2));
        return MeasureScope.DefaultImpls.layout$default(receiver, mo2758measureBRTryo0.getWidth(), mo2758measureBRTryo0.getHeight(), null, new PainterModifier$measure$1(mo2758measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        int roundToInt;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (getUseIntrinsicSize()) {
            int minIntrinsicHeight = measurable.minIntrinsicHeight(Constraints.m3293getMaxWidthimpl(m1098modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null))));
            roundToInt = MathKt__MathJVMKt.roundToInt(Size.m1227getHeightimpl(m1095calculateScaledSizeE7KxVPU(SizeKt.Size(i2, minIntrinsicHeight))));
            return Math.max(roundToInt, minIntrinsicHeight);
        }
        return measurable.minIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i2) {
        int roundToInt;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (getUseIntrinsicSize()) {
            int minIntrinsicWidth = measurable.minIntrinsicWidth(Constraints.m3292getMaxHeightimpl(m1098modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null))));
            roundToInt = MathKt__MathJVMKt.roundToInt(Size.m1230getWidthimpl(m1095calculateScaledSizeE7KxVPU(SizeKt.Size(minIntrinsicWidth, i2))));
            return Math.max(roundToInt, minIntrinsicWidth);
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
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
