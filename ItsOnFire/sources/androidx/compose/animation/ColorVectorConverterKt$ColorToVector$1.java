package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/AnimationVector4D;", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ColorVectorConverterKt$ColorToVector$1 extends Lambda implements Function1<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> {
    public static final ColorVectorConverterKt$ColorToVector$1 INSTANCE = new ColorVectorConverterKt$ColorToVector$1();

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector4D;", "color", "Landroidx/compose/ui/graphics/Color;", "invoke-8_81llA", "(J)Landroidx/compose/animation/core/AnimationVector4D;"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Color, AnimationVector4D> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ AnimationVector4D invoke(Color color) {
            return m37invoke8_81llA(color.m1402unboximpl());
        }

        @NotNull
        /* renamed from: invoke-8_81llA  reason: not valid java name */
        public final AnimationVector4D m37invoke8_81llA(long j2) {
            float[] fArr;
            float multiplyColumn;
            float[] fArr2;
            float multiplyColumn2;
            float[] fArr3;
            float multiplyColumn3;
            long m1389convertvNxB06k = Color.m1389convertvNxB06k(j2, ColorSpaces.INSTANCE.getCieXyz());
            float m1398getRedimpl = Color.m1398getRedimpl(m1389convertvNxB06k);
            float m1397getGreenimpl = Color.m1397getGreenimpl(m1389convertvNxB06k);
            float m1395getBlueimpl = Color.m1395getBlueimpl(m1389convertvNxB06k);
            fArr = ColorVectorConverterKt.M1;
            multiplyColumn = ColorVectorConverterKt.multiplyColumn(0, m1398getRedimpl, m1397getGreenimpl, m1395getBlueimpl, fArr);
            double d2 = 0.33333334f;
            float pow = (float) Math.pow(multiplyColumn, d2);
            fArr2 = ColorVectorConverterKt.M1;
            multiplyColumn2 = ColorVectorConverterKt.multiplyColumn(1, m1398getRedimpl, m1397getGreenimpl, m1395getBlueimpl, fArr2);
            fArr3 = ColorVectorConverterKt.M1;
            multiplyColumn3 = ColorVectorConverterKt.multiplyColumn(2, m1398getRedimpl, m1397getGreenimpl, m1395getBlueimpl, fArr3);
            return new AnimationVector4D(Color.m1394getAlphaimpl(j2), pow, (float) Math.pow(multiplyColumn2, d2), (float) Math.pow(multiplyColumn3, d2));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/Color;", "it", "Landroidx/compose/animation/core/AnimationVector4D;", "invoke-vNxB06k", "(Landroidx/compose/animation/core/AnimationVector4D;)J"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<AnimationVector4D, Color> {
        public final /* synthetic */ ColorSpace $colorSpace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ColorSpace colorSpace) {
            super(1);
            this.$colorSpace = colorSpace;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Color invoke(AnimationVector4D animationVector4D) {
            return Color.m1382boximpl(m38invokevNxB06k(animationVector4D));
        }

        /* renamed from: invoke-vNxB06k  reason: not valid java name */
        public final long m38invokevNxB06k(@NotNull AnimationVector4D it) {
            float[] fArr;
            float multiplyColumn;
            float[] fArr2;
            float multiplyColumn2;
            float[] fArr3;
            float multiplyColumn3;
            float coerceIn;
            float coerceIn2;
            float coerceIn3;
            float coerceIn4;
            Intrinsics.checkNotNullParameter(it, "it");
            double d2 = 3.0f;
            float pow = (float) Math.pow(it.getV2(), d2);
            float pow2 = (float) Math.pow(it.getV3(), d2);
            float pow3 = (float) Math.pow(it.getV4(), d2);
            fArr = ColorVectorConverterKt.InverseM1;
            multiplyColumn = ColorVectorConverterKt.multiplyColumn(0, pow, pow2, pow3, fArr);
            fArr2 = ColorVectorConverterKt.InverseM1;
            multiplyColumn2 = ColorVectorConverterKt.multiplyColumn(1, pow, pow2, pow3, fArr2);
            fArr3 = ColorVectorConverterKt.InverseM1;
            multiplyColumn3 = ColorVectorConverterKt.multiplyColumn(2, pow, pow2, pow3, fArr3);
            coerceIn = RangesKt___RangesKt.coerceIn(it.getV1(), 0.0f, 1.0f);
            coerceIn2 = RangesKt___RangesKt.coerceIn(multiplyColumn, -2.0f, 2.0f);
            coerceIn3 = RangesKt___RangesKt.coerceIn(multiplyColumn2, -2.0f, 2.0f);
            coerceIn4 = RangesKt___RangesKt.coerceIn(multiplyColumn3, -2.0f, 2.0f);
            return Color.m1389convertvNxB06k(ColorKt.Color(coerceIn2, coerceIn3, coerceIn4, coerceIn, ColorSpaces.INSTANCE.getCieXyz()), this.$colorSpace);
        }
    }

    public ColorVectorConverterKt$ColorToVector$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final TwoWayConverter<Color, AnimationVector4D> invoke(@NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        return VectorConvertersKt.TwoWayConverter(AnonymousClass1.INSTANCE, new AnonymousClass2(colorSpace));
    }
}
