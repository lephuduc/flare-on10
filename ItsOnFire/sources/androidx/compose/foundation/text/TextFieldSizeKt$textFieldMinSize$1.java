package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldSizeKt$textFieldMinSize$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public final /* synthetic */ TextStyle $style;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {
        public final /* synthetic */ TextFieldSize $minSizeState;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
        /* renamed from: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00211 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
            public final /* synthetic */ Placeable $measured;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00211(Placeable placeable) {
                super(1);
                this.$measured = placeable;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(layout, this.$measured, 0, 0, 0.0f, 4, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldSize textFieldSize) {
            super(3);
            this.$minSizeState = textFieldSize;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
            return m612invoke3p2s80s(measureScope, measurable, constraints.m3299unboximpl());
        }

        @NotNull
        /* renamed from: invoke-3p2s80s  reason: not valid java name */
        public final MeasureResult m612invoke3p2s80s(@NotNull MeasureScope layout, @NotNull Measurable measurable, long j2) {
            int coerceIn;
            int coerceIn2;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            SizeKt.m391defaultMinSizeVpY3zN4$default(Modifier.Companion, 0.0f, 0.0f, 3, null);
            long m611getMinSizeYbymL2g = this.$minSizeState.m611getMinSizeYbymL2g();
            coerceIn = RangesKt___RangesKt.coerceIn(IntSize.m3485getWidthimpl(m611getMinSizeYbymL2g), Constraints.m3295getMinWidthimpl(j2), Constraints.m3293getMaxWidthimpl(j2));
            coerceIn2 = RangesKt___RangesKt.coerceIn(IntSize.m3484getHeightimpl(m611getMinSizeYbymL2g), Constraints.m3294getMinHeightimpl(j2), Constraints.m3292getMaxHeightimpl(j2));
            Placeable mo2758measureBRTryo0 = measurable.mo2758measureBRTryo0(Constraints.m3284copyZbe2FdA$default(j2, coerceIn, 0, coerceIn2, 0, 10, null));
            return MeasureScope.DefaultImpls.layout$default(layout, mo2758measureBRTryo0.getWidth(), mo2758measureBRTryo0.getHeight(), null, new C00211(mo2758measureBRTryo0), 4, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSizeKt$textFieldMinSize$1(TextStyle textStyle) {
        super(3);
        this.$style = textStyle;
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(31601380);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Font.ResourceLoader resourceLoader = (Font.ResourceLoader) composer.consume(CompositionLocalsKt.getLocalFontLoader());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        TextStyle textStyle = this.$style;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextFieldSize(layoutDirection, density, resourceLoader, textStyle);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TextFieldSize textFieldSize = (TextFieldSize) rememberedValue;
        textFieldSize.update(layoutDirection, density, resourceLoader, this.$style);
        Modifier layout = LayoutModifierKt.layout(Modifier.Companion, new AnonymousClass1(textFieldSize));
        composer.endReplaceableGroup();
        return layout;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }
}
