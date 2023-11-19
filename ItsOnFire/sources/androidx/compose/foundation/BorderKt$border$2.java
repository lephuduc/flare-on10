package androidx.compose.foundation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class BorderKt$border$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public final /* synthetic */ Brush $brush;
    public final /* synthetic */ Shape $shape;
    public final /* synthetic */ float $width;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.BorderKt$border$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<CacheDrawScope, DrawResult> {
        public final /* synthetic */ Ref<BorderCache> $borderCacheRef;
        public final /* synthetic */ Brush $brush;
        public final /* synthetic */ Shape $shape;
        public final /* synthetic */ float $width;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f2, Shape shape, Ref<BorderCache> ref, Brush brush) {
            super(1);
            this.$width = f2;
            this.$shape = shape;
            this.$borderCacheRef = ref;
            this.$brush = brush;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
            DrawResult m160drawRectBorderNsqcLGU;
            DrawResult m161drawRoundRectBorderSYlcjDY;
            DrawResult drawGenericBorder;
            DrawResult drawContentWithoutBorder;
            Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
            if (!(drawWithCache.mo277toPx0680j_4(this.$width) >= 0.0f && Size.m1229getMinDimensionimpl(drawWithCache.m1094getSizeNHjbRc()) > 0.0f)) {
                drawContentWithoutBorder = BorderKt.drawContentWithoutBorder(drawWithCache);
                return drawContentWithoutBorder;
            }
            float f2 = 2;
            float min = Math.min(Dp.m3330equalsimpl0(this.$width, Dp.Companion.m3343getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(drawWithCache.mo277toPx0680j_4(this.$width)), (float) Math.ceil(Size.m1229getMinDimensionimpl(drawWithCache.m1094getSizeNHjbRc()) / f2));
            float f3 = min / f2;
            long Offset = OffsetKt.Offset(f3, f3);
            long Size = SizeKt.Size(Size.m1230getWidthimpl(drawWithCache.m1094getSizeNHjbRc()) - min, Size.m1227getHeightimpl(drawWithCache.m1094getSizeNHjbRc()) - min);
            boolean z = f2 * min > Size.m1229getMinDimensionimpl(drawWithCache.m1094getSizeNHjbRc());
            Outline mo209createOutlinePq9zytI = this.$shape.mo209createOutlinePq9zytI(drawWithCache.m1094getSizeNHjbRc(), drawWithCache.getLayoutDirection(), drawWithCache);
            if (mo209createOutlinePq9zytI instanceof Outline.Generic) {
                drawGenericBorder = BorderKt.drawGenericBorder(drawWithCache, this.$borderCacheRef, this.$brush, (Outline.Generic) mo209createOutlinePq9zytI, z, min);
                return drawGenericBorder;
            } else if (mo209createOutlinePq9zytI instanceof Outline.Rounded) {
                m161drawRoundRectBorderSYlcjDY = BorderKt.m161drawRoundRectBorderSYlcjDY(drawWithCache, this.$borderCacheRef, this.$brush, (Outline.Rounded) mo209createOutlinePq9zytI, Offset, Size, z, min);
                return m161drawRoundRectBorderSYlcjDY;
            } else if (mo209createOutlinePq9zytI instanceof Outline.Rectangle) {
                m160drawRectBorderNsqcLGU = BorderKt.m160drawRectBorderNsqcLGU(drawWithCache, this.$brush, Offset, Size, z, min);
                return m160drawRectBorderNsqcLGU;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderKt$border$2(float f2, Shape shape, Brush brush) {
        super(3);
        this.$width = f2;
        this.$shape = shape;
        this.$brush = brush;
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(1369505793);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Ref();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier then = composed.then(DrawModifierKt.drawWithCache(Modifier.Companion, new AnonymousClass1(this.$width, this.$shape, (Ref) rememberedValue, this.$brush)));
        composer.endReplaceableGroup();
        return then;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }
}
