package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import j.l;
import j.u0;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SliderKt$Slider$3$gestureEndAction$1 extends Lambda implements Function1<Float, Unit> {
    public final /* synthetic */ SliderDraggableState $draggableState;
    public final /* synthetic */ float $maxPx;
    public final /* synthetic */ float $minPx;
    public final /* synthetic */ Function0<Unit> $onValueChangeFinished;
    public final /* synthetic */ MutableState<Float> $rawOffset;
    public final /* synthetic */ u0 $scope;
    public final /* synthetic */ List<Float> $tickFractions;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    @DebugMetadata(c = "androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1", f = "Slider.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<u0, Continuation<? super Unit>, Object> {
        public final /* synthetic */ float $current;
        public final /* synthetic */ SliderDraggableState $draggableState;
        public final /* synthetic */ Function0<Unit> $onValueChangeFinished;
        public final /* synthetic */ float $target;
        public final /* synthetic */ float $velocity;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SliderDraggableState sliderDraggableState, float f2, float f3, float f4, Function0<Unit> function0, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$draggableState = sliderDraggableState;
            this.$current = f2;
            this.$target = f3;
            this.$velocity = f4;
            this.$onValueChangeFinished = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$draggableState, this.$current, this.$target, this.$velocity, this.$onValueChangeFinished, continuation);
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
            Object animateToTarget;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                SliderDraggableState sliderDraggableState = this.$draggableState;
                float f2 = this.$current;
                float f3 = this.$target;
                float f4 = this.$velocity;
                this.label = 1;
                animateToTarget = SliderKt.animateToTarget(sliderDraggableState, f2, f3, f4, this);
                if (animateToTarget == coroutine_suspended) {
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
    public SliderKt$Slider$3$gestureEndAction$1(MutableState<Float> mutableState, List<Float> list, float f2, float f3, u0 u0Var, SliderDraggableState sliderDraggableState, Function0<Unit> function0) {
        super(1);
        this.$rawOffset = mutableState;
        this.$tickFractions = list;
        this.$minPx = f2;
        this.$maxPx = f3;
        this.$scope = u0Var;
        this.$draggableState = sliderDraggableState;
        this.$onValueChangeFinished = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
        invoke(f2.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(float f2) {
        float snapValueToTick;
        Function0<Unit> function0;
        float floatValue = this.$rawOffset.getValue().floatValue();
        snapValueToTick = SliderKt.snapValueToTick(floatValue, this.$tickFractions, this.$minPx, this.$maxPx);
        if (!(floatValue == snapValueToTick)) {
            l.f(this.$scope, null, null, new AnonymousClass1(this.$draggableState, floatValue, snapValueToTick, f2, this.$onValueChangeFinished, null), 3, null);
        } else if (this.$draggableState.isDragging() || (function0 = this.$onValueChangeFinished) == null) {
        } else {
            function0.invoke();
        }
    }
}
