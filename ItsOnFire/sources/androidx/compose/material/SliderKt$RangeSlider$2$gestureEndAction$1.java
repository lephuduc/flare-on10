package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import j.l;
import j.u0;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt__RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$2$gestureEndAction$1 extends Lambda implements Function1<Boolean, Unit> {
    public final /* synthetic */ float $maxPx;
    public final /* synthetic */ float $minPx;
    public final /* synthetic */ Function0<Unit> $onValueChangeFinished;
    public final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
    public final /* synthetic */ MutableState<Float> $rawOffsetEnd;
    public final /* synthetic */ MutableState<Float> $rawOffsetStart;
    public final /* synthetic */ u0 $scope;
    public final /* synthetic */ List<Float> $tickFractions;
    public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1", f = "Slider.kt", i = {}, l = {309}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ float $current;
        public final /* synthetic */ boolean $isStart;
        public final /* synthetic */ float $maxPx;
        public final /* synthetic */ float $minPx;
        public final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        public final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
        public final /* synthetic */ MutableState<Float> $rawOffsetEnd;
        public final /* synthetic */ MutableState<Float> $rawOffsetStart;
        public final /* synthetic */ float $target;
        public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;
        public int label;

        @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
        /* renamed from: androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00371 extends Lambda implements Function1<Animatable<Float, AnimationVector1D>, Unit> {
            public final /* synthetic */ boolean $isStart;
            public final /* synthetic */ float $maxPx;
            public final /* synthetic */ float $minPx;
            public final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
            public final /* synthetic */ MutableState<Float> $rawOffsetEnd;
            public final /* synthetic */ MutableState<Float> $rawOffsetStart;
            public final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00371(boolean z, MutableState<Float> mutableState, MutableState<Float> mutableState2, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, float f2, float f3, ClosedFloatingPointRange<Float> closedFloatingPointRange) {
                super(1);
                this.$isStart = z;
                this.$rawOffsetStart = mutableState;
                this.$rawOffsetEnd = mutableState2;
                this.$onValueChangeState = state;
                this.$minPx = f2;
                this.$maxPx = f3;
                this.$valueRange = closedFloatingPointRange;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable) {
                invoke2(animatable);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Animatable<Float, AnimationVector1D> animateTo) {
                ClosedFloatingPointRange rangeTo;
                ClosedFloatingPointRange<Float> invoke$scaleToUserValue;
                Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                (this.$isStart ? this.$rawOffsetStart : this.$rawOffsetEnd).setValue(animateTo.getValue());
                float f2 = this.$minPx;
                float f3 = this.$maxPx;
                ClosedFloatingPointRange<Float> closedFloatingPointRange = this.$valueRange;
                rangeTo = RangesKt__RangesKt.rangeTo(this.$rawOffsetStart.getValue().floatValue(), this.$rawOffsetEnd.getValue().floatValue());
                invoke$scaleToUserValue = SliderKt$RangeSlider$2.invoke$scaleToUserValue(f2, f3, closedFloatingPointRange, rangeTo);
                this.$onValueChangeState.getValue().invoke(invoke$scaleToUserValue);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(float f2, float f3, Function0<Unit> function0, boolean z, MutableState<Float> mutableState, MutableState<Float> mutableState2, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, float f4, float f5, ClosedFloatingPointRange<Float> closedFloatingPointRange, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$current = f2;
            this.$target = f3;
            this.$onValueChangeFinished = function0;
            this.$isStart = z;
            this.$rawOffsetStart = mutableState;
            this.$rawOffsetEnd = mutableState2;
            this.$onValueChangeState = state;
            this.$minPx = f4;
            this.$maxPx = f5;
            this.$valueRange = closedFloatingPointRange;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$current, this.$target, this.$onValueChangeFinished, this.$isStart, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull u0 u0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(u0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            TweenSpec tweenSpec;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable Animatable$default = AnimatableKt.Animatable$default(this.$current, 0.0f, 2, null);
                Float boxFloat = Boxing.boxFloat(this.$target);
                tweenSpec = SliderKt.SliderToTickAnimation;
                Float boxFloat2 = Boxing.boxFloat(0.0f);
                C00371 c00371 = new C00371(this.$isStart, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange);
                this.label = 1;
                if (Animatable$default.animateTo(boxFloat, tweenSpec, boxFloat2, c00371, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            Function0<Unit> function0 = this.$onValueChangeFinished;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$2$gestureEndAction$1(MutableState<Float> mutableState, MutableState<Float> mutableState2, List<Float> list, float f2, float f3, Function0<Unit> function0, u0 u0Var, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        super(1);
        this.$rawOffsetStart = mutableState;
        this.$rawOffsetEnd = mutableState2;
        this.$tickFractions = list;
        this.$minPx = f2;
        this.$maxPx = f3;
        this.$onValueChangeFinished = function0;
        this.$scope = u0Var;
        this.$onValueChangeState = state;
        this.$valueRange = closedFloatingPointRange;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        float snapValueToTick;
        float floatValue = (z ? this.$rawOffsetStart : this.$rawOffsetEnd).getValue().floatValue();
        snapValueToTick = SliderKt.snapValueToTick(floatValue, this.$tickFractions, this.$minPx, this.$maxPx);
        if (!(floatValue == snapValueToTick)) {
            l.f(this.$scope, null, null, new AnonymousClass1(floatValue, snapValueToTick, this.$onValueChangeFinished, z, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onValueChangeState, this.$minPx, this.$maxPx, this.$valueRange, null), 3, null);
            return;
        }
        Function0<Unit> function0 = this.$onValueChangeFinished;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }
}
