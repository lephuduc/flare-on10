package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableKt$draggable$1;
import androidx.compose.foundation.gestures.DraggableKt$draggable$2;
import androidx.compose.foundation.gestures.Orientation;
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
import kotlin.coroutines.Continuation;
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
public final class SliderKt$Slider$3 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ SliderColors $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ MutableInteractionSource $interactionSource;
    public final /* synthetic */ Function0<Unit> $onValueChangeFinished;
    public final /* synthetic */ State<Function1<Float, Unit>> $onValueChangeState;
    public final /* synthetic */ List<Float> $tickFractions;
    public final /* synthetic */ float $value;
    public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.material.SliderKt$Slider$3$1  reason: invalid class name */
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
            return Float.valueOf(SliderKt$Slider$3.invoke$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f2));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f2) {
            return invoke(f2.floatValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$Slider$3(ClosedFloatingPointRange<Float> closedFloatingPointRange, int i2, float f2, MutableInteractionSource mutableInteractionSource, boolean z, List<Float> list, SliderColors sliderColors, State<? extends Function1<? super Float, Unit>> state, Function0<Unit> function0) {
        super(3);
        this.$valueRange = closedFloatingPointRange;
        this.$$dirty = i2;
        this.$value = f2;
        this.$interactionSource = mutableInteractionSource;
        this.$enabled = z;
        this.$tickFractions = list;
        this.$colors = sliderColors;
        this.$onValueChangeState = state;
        this.$onValueChangeFinished = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToOffset(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f2, float f3, float f4) {
        float scale;
        scale = SliderKt.scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f4, f2, f3);
        return scale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToUserValue(float f2, float f3, ClosedFloatingPointRange<Float> closedFloatingPointRange, float f4) {
        float scale;
        scale = SliderKt.scale(f2, f3, f4, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        return scale;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer, int i2) {
        int i3;
        Continuation continuation;
        Modifier sliderPressModifier;
        Modifier draggable;
        float coerceIn;
        float calcFraction;
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
        boolean z = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        float m3293getMaxWidthimpl = Constraints.m3293getMaxWidthimpl(BoxWithConstraints.mo340getConstraintsmsEJaDk());
        composer.startReplaceableGroup(-723524056);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        u0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        float f2 = this.$value;
        ClosedFloatingPointRange<Float> closedFloatingPointRange = this.$valueRange;
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(invoke$scaleToOffset(closedFloatingPointRange, 0.0f, m3293getMaxWidthimpl, f2)), null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue2;
        Object valueOf = Float.valueOf(0.0f);
        Object valueOf2 = Float.valueOf(m3293getMaxWidthimpl);
        ClosedFloatingPointRange<Float> closedFloatingPointRange2 = this.$valueRange;
        State<Function1<Float, Unit>> state = this.$onValueChangeState;
        composer.startReplaceableGroup(-3686095);
        boolean changed = composer.changed(valueOf) | composer.changed(valueOf2) | composer.changed(closedFloatingPointRange2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == companion.getEmpty()) {
            continuation = null;
            rememberedValue3 = new SliderDraggableState(new SliderKt$Slider$3$draggableState$1$1(mutableState, 0.0f, m3293getMaxWidthimpl, state, closedFloatingPointRange2));
            composer.updateRememberedValue(rememberedValue3);
        } else {
            continuation = null;
        }
        composer.endReplaceableGroup();
        SliderDraggableState sliderDraggableState = (SliderDraggableState) rememberedValue3;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$valueRange, 0.0f, m3293getMaxWidthimpl);
        ClosedFloatingPointRange<Float> closedFloatingPointRange3 = this.$valueRange;
        float f3 = this.$value;
        int i4 = this.$$dirty;
        Continuation continuation2 = continuation;
        SliderKt.CorrectValueSideEffect(anonymousClass1, closedFloatingPointRange3, mutableState, f3, composer, ((i4 >> 9) & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 384 | ((i4 << 9) & 7168));
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new SliderKt$Slider$3$gestureEndAction$1(mutableState, this.$tickFractions, 0.0f, m3293getMaxWidthimpl, coroutineScope, sliderDraggableState, this.$onValueChangeFinished), composer, 0);
        Modifier.Companion companion2 = Modifier.Companion;
        sliderPressModifier = SliderKt.sliderPressModifier(companion2, sliderDraggableState, this.$interactionSource, m3293getMaxWidthimpl, z, mutableState, rememberUpdatedState, this.$enabled);
        Orientation orientation = Orientation.Horizontal;
        boolean isDragging = sliderDraggableState.isDragging();
        boolean z2 = this.$enabled;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        composer.startReplaceableGroup(-3686930);
        boolean changed2 = composer.changed(rememberUpdatedState);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed2 || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new SliderKt$Slider$3$drag$1$1(rememberUpdatedState, continuation2);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        draggable = DraggableKt.draggable(companion2, sliderDraggableState, orientation, (r20 & 4) != 0 ? true : z2, (r20 & 8) != 0 ? null : mutableInteractionSource, (r20 & 16) != 0 ? false : isDragging, (r20 & 32) != 0 ? new DraggableKt$draggable$1(null) : null, (r20 & 64) != 0 ? new DraggableKt$draggable$2(null) : (Function3) rememberedValue4, (r20 & 128) != 0 ? false : z);
        coerceIn = RangesKt___RangesKt.coerceIn(this.$value, this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue());
        calcFraction = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), coerceIn);
        boolean z3 = this.$enabled;
        List<Float> list = this.$tickFractions;
        SliderColors sliderColors = this.$colors;
        MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
        Modifier then = sliderPressModifier.then(draggable);
        int i5 = this.$$dirty;
        SliderKt.SliderImpl(z3, calcFraction, list, sliderColors, m3293getMaxWidthimpl, mutableInteractionSource2, then, composer, ((i5 >> 9) & 14) | 512 | ((i5 >> 15) & 7168) | ((i5 >> 6) & 458752));
    }
}
