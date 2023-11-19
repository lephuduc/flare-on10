package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import j.u0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$2 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ SliderColors $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ MutableInteractionSource $endInteractionSource;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ Function0<Unit> $onValueChangeFinished;
    public final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
    public final /* synthetic */ MutableInteractionSource $startInteractionSource;
    public final /* synthetic */ List<Float> $tickFractions;
    public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;
    public final /* synthetic */ ClosedFloatingPointRange<Float> $values;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Float, Float> {
        public final /* synthetic */ float $maxPx;
        public final /* synthetic */ float $minPx;
        public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f2, float f3) {
            super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;FFF)F", 0);
            this.$valueRange = closedFloatingPointRange;
            this.$minPx = f2;
            this.$maxPx = f3;
        }

        @NotNull
        public final Float invoke(float f2) {
            return Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f2));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f2) {
            return invoke(f2.floatValue());
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Float, Float> {
        public final /* synthetic */ float $maxPx;
        public final /* synthetic */ float $minPx;
        public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f2, float f3) {
            super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;FFF)F", 0);
            this.$valueRange = closedFloatingPointRange;
            this.$minPx = f2;
            this.$maxPx = f3;
        }

        @NotNull
        public final Float invoke(float f2) {
            return Float.valueOf(SliderKt$RangeSlider$2.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f2));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f2) {
            return invoke(f2.floatValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2(ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i2, Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, List<Float> list, SliderColors sliderColors, Function0<Unit> function0) {
        super(3);
        this.$valueRange = closedFloatingPointRange;
        this.$values = closedFloatingPointRange2;
        this.$$dirty = i2;
        this.$modifier = modifier;
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$enabled = z;
        this.$onValueChangeState = state;
        this.$tickFractions = list;
        this.$colors = sliderColors;
        this.$onValueChangeFinished = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToOffset(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f2, float f3, float f4) {
        float scale;
        scale = SliderKt.scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f4, f2, f3);
        return scale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClosedFloatingPointRange<Float> invoke$scaleToUserValue(float f2, float f3, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
        ClosedFloatingPointRange<Float> scale;
        scale = SliderKt.scale(f2, f3, closedFloatingPointRange2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        return scale;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Composable
    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer, int i2) {
        int i3;
        Modifier rangeSliderPressDragModifier;
        float coerceIn;
        float coerceIn2;
        float calcFraction;
        float calcFraction2;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i2 & 14) == 0) {
            i3 = i2 | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (((i3 & 91) ^ 18) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        int i4 = 0;
        boolean z = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        float m3293getMaxWidthimpl = Constraints.m3293getMaxWidthimpl(BoxWithConstraints.mo340getConstraintsmsEJaDk());
        ClosedFloatingPointRange<Float> closedFloatingPointRange = this.$values;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2 = this.$valueRange;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(closedFloatingPointRange2, 0.0f, m3293getMaxWidthimpl, closedFloatingPointRange.getStart().floatValue())), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        ClosedFloatingPointRange<Float> closedFloatingPointRange3 = this.$values;
        ClosedFloatingPointRange<Float> closedFloatingPointRange4 = this.$valueRange;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(closedFloatingPointRange4, 0.0f, m3293getMaxWidthimpl, closedFloatingPointRange3.getEndInclusive().floatValue())), null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) rememberedValue2;
        SliderKt.CorrectValueSideEffect(new AnonymousClass1(this.$valueRange, 0.0f, m3293getMaxWidthimpl), this.$valueRange, mutableState, this.$values.getStart().floatValue(), composer, ((this.$$dirty >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 384);
        SliderKt.CorrectValueSideEffect(new AnonymousClass2(this.$valueRange, 0.0f, m3293getMaxWidthimpl), this.$valueRange, mutableState2, this.$values.getEndInclusive().floatValue(), composer, ((this.$$dirty >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 384);
        composer.startReplaceableGroup(-723524056);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue3 = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        u0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue3).getCoroutineScope();
        composer.endReplaceableGroup();
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new SliderKt$RangeSlider$2$gestureEndAction$1(mutableState, mutableState2, this.$tickFractions, 0.0f, m3293getMaxWidthimpl, this.$onValueChangeFinished, coroutineScope, this.$onValueChangeState, this.$valueRange), composer, 0);
        Modifier modifier = this.$modifier;
        MutableInteractionSource mutableInteractionSource = this.$startInteractionSource;
        MutableInteractionSource mutableInteractionSource2 = this.$endInteractionSource;
        boolean z2 = this.$enabled;
        ClosedFloatingPointRange<Float> closedFloatingPointRange5 = this.$valueRange;
        State<Function1<ClosedFloatingPointRange<Float>, Unit>> state = this.$onValueChangeState;
        ClosedFloatingPointRange<Float> closedFloatingPointRange6 = this.$valueRange;
        Object[] objArr = {mutableState, Float.valueOf(0.0f), mutableState2, Float.valueOf(m3293getMaxWidthimpl), state, closedFloatingPointRange6};
        composer.startReplaceableGroup(-3685570);
        boolean z3 = false;
        while (i4 < 6) {
            Object obj = objArr[i4];
            i4++;
            z3 |= composer.changed(obj);
        }
        Object rememberedValue4 = composer.rememberedValue();
        if (z3 || rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = new SliderKt$RangeSlider$2$pressDrag$1$1(mutableState, 0.0f, mutableState2, m3293getMaxWidthimpl, state, closedFloatingPointRange6);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        rangeSliderPressDragModifier = SliderKt.rangeSliderPressDragModifier(modifier, mutableInteractionSource, mutableInteractionSource2, mutableState, mutableState2, z2, z, m3293getMaxWidthimpl, closedFloatingPointRange5, rememberUpdatedState, rememberedValue4);
        coerceIn = RangesKt___RangesKt.coerceIn(this.$values.getStart().floatValue(), this.$valueRange.getStart().floatValue(), this.$values.getEndInclusive().floatValue());
        coerceIn2 = RangesKt___RangesKt.coerceIn(this.$values.getEndInclusive().floatValue(), this.$values.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue());
        calcFraction = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), coerceIn);
        calcFraction2 = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), coerceIn2);
        boolean z4 = this.$enabled;
        List<Float> list = this.$tickFractions;
        SliderColors sliderColors = this.$colors;
        MutableInteractionSource mutableInteractionSource3 = this.$startInteractionSource;
        MutableInteractionSource mutableInteractionSource4 = this.$endInteractionSource;
        Modifier then = rangeSliderPressDragModifier.then(this.$modifier);
        int i5 = this.$$dirty;
        SliderKt.RangeSliderImpl(z4, calcFraction, calcFraction2, list, sliderColors, m3293getMaxWidthimpl, mutableInteractionSource3, mutableInteractionSource4, then, composer, 14159872 | ((i5 >> 9) & 14) | ((i5 >> 9) & 57344));
    }
}
