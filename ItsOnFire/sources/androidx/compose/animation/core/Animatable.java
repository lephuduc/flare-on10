package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004B-\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\tJ\\\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001062\u0006\u00107\u001a\u00028\u00002\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000092'\b\u0002\u0010:\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020<\u0018\u00010;¢\u0006\u0002\b=H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010>Jh\u0010?\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001062\u0006\u0010$\u001a\u00028\u00002\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000@2\b\b\u0002\u00107\u001a\u00028\u00002'\b\u0002\u0010:\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020<\u0018\u00010;¢\u0006\u0002\b=H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010AJ\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000CJ\u0015\u0010D\u001a\u00028\u00002\u0006\u0010.\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010EJ\b\u0010F\u001a\u00020<H\u0002J`\u0010G\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001062\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010I2\u0006\u00107\u001a\u00028\u00002%\u0010:\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020<\u0018\u00010;¢\u0006\u0002\b=H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010JJ\u0019\u0010K\u001a\u00020<2\u0006\u0010$\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010LJ\u0011\u0010M\u001a\u00020<H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010NJ#\u0010O\u001a\u00020<2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010+\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010PJ\u0019\u0010Q\u001a\u00028\u0001*\u00028\u00002\u0006\u0010.\u001a\u00020RH\u0002¢\u0006\u0002\u0010SR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00138F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001a\u001a\u0004\u0018\u00018\u00002\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001e\u001a\u00028\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u00028\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001fR\u0010\u0010#\u001a\u00028\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001fR+\u0010$\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0019\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010'R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R$\u0010+\u001a\u0004\u0018\u00018\u00002\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b,\u0010\u001cR\u0010\u0010-\u001a\u00028\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001fR\u0011\u0010.\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b/\u0010\u001cR\u0011\u00100\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b1\u0010\u001cR\u0011\u00102\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006T"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "", "initialValue", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "visibilityThreshold", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)V", "defaultSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "getDefaultSpringSpec$animation_core_release", "()Landroidx/compose/animation/core/SpringSpec;", "internalState", "Landroidx/compose/animation/core/AnimationState;", "getInternalState$animation_core_release", "()Landroidx/compose/animation/core/AnimationState;", "<set-?>", "", "isRunning", "()Z", "setRunning", "(Z)V", "isRunning$delegate", "Landroidx/compose/runtime/MutableState;", "lowerBound", "getLowerBound", "()Ljava/lang/Object;", "Ljava/lang/Object;", "lowerBoundVector", "Landroidx/compose/animation/core/AnimationVector;", "mutatorMutex", "Landroidx/compose/animation/core/MutatorMutex;", "negativeInfinityBounds", "positiveInfinityBounds", "targetValue", "getTargetValue", "setTargetValue", "(Ljava/lang/Object;)V", "targetValue$delegate", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "upperBound", "getUpperBound", "upperBoundVector", "value", "getValue", "velocity", "getVelocity", "velocityVector", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "animateDecay", "Landroidx/compose/animation/core/AnimationResult;", "initialVelocity", "animationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "Landroidx/compose/animation/core/AnimationSpec;", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asState", "Landroidx/compose/runtime/State;", "clampToBounds", "(Ljava/lang/Object;)Ljava/lang/Object;", "endAnimation", "runAnimation", "animation", "Landroidx/compose/animation/core/Animation;", "(Landroidx/compose/animation/core/Animation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBounds", "(Ljava/lang/Object;Ljava/lang/Object;)V", "createVector", "", "(Ljava/lang/Object;F)Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class Animatable<T, V extends AnimationVector> {
    public static final int $stable = 8;
    @NotNull
    private final SpringSpec<T> defaultSpringSpec;
    @NotNull
    private final AnimationState<T, V> internalState;
    @NotNull
    private final MutableState isRunning$delegate;
    @Nullable
    private T lowerBound;
    @NotNull
    private V lowerBoundVector;
    @NotNull
    private final MutatorMutex mutatorMutex;
    @NotNull
    private final V negativeInfinityBounds;
    @NotNull
    private final V positiveInfinityBounds;
    @NotNull
    private final MutableState targetValue$delegate;
    @NotNull
    private final TwoWayConverter<T, V> typeConverter;
    @Nullable
    private T upperBound;
    @NotNull
    private V upperBoundVector;
    @Nullable
    private final T visibilityThreshold;

    public Animatable(T t2, @NotNull TwoWayConverter<T, V> typeConverter, @Nullable T t3) {
        MutableState mutableStateOf$default;
        MutableState mutableStateOf$default2;
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        this.typeConverter = typeConverter;
        this.visibilityThreshold = t3;
        this.internalState = new AnimationState<>(typeConverter, t2, null, 0L, 0L, false, 60, null);
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isRunning$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t2, null, 2, null);
        this.targetValue$delegate = mutableStateOf$default2;
        this.mutatorMutex = new MutatorMutex();
        this.defaultSpringSpec = new SpringSpec<>(0.0f, 0.0f, t3, 3, null);
        V createVector = createVector(t2, Float.NEGATIVE_INFINITY);
        this.negativeInfinityBounds = createVector;
        V createVector2 = createVector(t2, Float.POSITIVE_INFINITY);
        this.positiveInfinityBounds = createVector2;
        this.lowerBoundVector = createVector;
        this.upperBoundVector = createVector2;
    }

    public /* synthetic */ Animatable(Object obj, TwoWayConverter twoWayConverter, Object obj2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, twoWayConverter, (i2 & 4) != 0 ? null : obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateDecay$default(Animatable animatable, Object obj, DecayAnimationSpec decayAnimationSpec, Function1 function1, Continuation continuation, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        return animatable.animateDecay(obj, decayAnimationSpec, function1, continuation);
    }

    public static /* synthetic */ Object animateTo$default(Animatable animatable, Object obj, AnimationSpec animationSpec, Object obj2, Function1 function1, Continuation continuation, int i2, Object obj3) {
        SpringSpec springSpec = animationSpec;
        if ((i2 & 2) != 0) {
            springSpec = animatable.getDefaultSpringSpec$animation_core_release();
        }
        AnimationSpec animationSpec2 = springSpec;
        Object obj4 = obj2;
        if ((i2 & 4) != 0) {
            obj4 = animatable.getVelocity();
        }
        Object obj5 = obj4;
        Function1 function12 = function1;
        if ((i2 & 8) != 0) {
            function12 = null;
        }
        return animatable.animateTo(obj, animationSpec2, obj5, function12, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T clampToBounds(T t2) {
        float coerceIn;
        if (Intrinsics.areEqual(this.lowerBoundVector, this.negativeInfinityBounds) && Intrinsics.areEqual(this.upperBoundVector, this.positiveInfinityBounds)) {
            return t2;
        }
        V invoke = this.typeConverter.getConvertToVector().invoke(t2);
        int size$animation_core_release = invoke.getSize$animation_core_release();
        int i2 = 0;
        boolean z = false;
        while (i2 < size$animation_core_release) {
            int i3 = i2 + 1;
            if (invoke.get$animation_core_release(i2) < this.lowerBoundVector.get$animation_core_release(i2) || invoke.get$animation_core_release(i2) > this.upperBoundVector.get$animation_core_release(i2)) {
                coerceIn = RangesKt___RangesKt.coerceIn(invoke.get$animation_core_release(i2), this.lowerBoundVector.get$animation_core_release(i2), this.upperBoundVector.get$animation_core_release(i2));
                invoke.set$animation_core_release(i2, coerceIn);
                z = true;
            }
            i2 = i3;
        }
        return z ? this.typeConverter.getConvertFromVector().invoke(invoke) : t2;
    }

    private final V createVector(T t2, float f2) {
        V invoke = this.typeConverter.getConvertToVector().invoke(t2);
        int size$animation_core_release = invoke.getSize$animation_core_release();
        for (int i2 = 0; i2 < size$animation_core_release; i2++) {
            invoke.set$animation_core_release(i2, f2);
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAnimation() {
        AnimationState<T, V> animationState = this.internalState;
        animationState.getVelocityVector().reset$animation_core_release();
        animationState.setLastFrameTimeNanos$animation_core_release(Long.MIN_VALUE);
        setRunning(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runAnimation(Animation<T, V> animation, T t2, Function1<? super Animatable<T, V>, Unit> function1, Continuation<? super AnimationResult<T, V>> continuation) {
        return MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$runAnimation$2(this, t2, animation, getInternalState$animation_core_release().getLastFrameTimeNanos(), function1, null), continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRunning(boolean z) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTargetValue(T t2) {
        this.targetValue$delegate.setValue(t2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateBounds$default(Animatable animatable, Object obj, Object obj2, int i2, Object obj3) {
        if ((i2 & 1) != 0) {
            obj = animatable.lowerBound;
        }
        if ((i2 & 2) != 0) {
            obj2 = animatable.upperBound;
        }
        animatable.updateBounds(obj, obj2);
    }

    @Nullable
    public final Object animateDecay(T t2, @NotNull DecayAnimationSpec<T> decayAnimationSpec, @Nullable Function1<? super Animatable<T, V>, Unit> function1, @NotNull Continuation<? super AnimationResult<T, V>> continuation) {
        return runAnimation(new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter) getTypeConverter(), (Object) getValue(), (AnimationVector) getTypeConverter().getConvertToVector().invoke(t2)), t2, function1, continuation);
    }

    @Nullable
    public final Object animateTo(T t2, @NotNull AnimationSpec<T> animationSpec, T t3, @Nullable Function1<? super Animatable<T, V>, Unit> function1, @NotNull Continuation<? super AnimationResult<T, V>> continuation) {
        return runAnimation(AnimationKt.TargetBasedAnimation(animationSpec, getTypeConverter(), getValue(), t2, t3), t3, function1, continuation);
    }

    @NotNull
    public final State<T> asState() {
        return this.internalState;
    }

    @NotNull
    public final SpringSpec<T> getDefaultSpringSpec$animation_core_release() {
        return this.defaultSpringSpec;
    }

    @NotNull
    public final AnimationState<T, V> getInternalState$animation_core_release() {
        return this.internalState;
    }

    @Nullable
    public final T getLowerBound() {
        return this.lowerBound;
    }

    public final T getTargetValue() {
        return this.targetValue$delegate.getValue();
    }

    @NotNull
    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Nullable
    public final T getUpperBound() {
        return this.upperBound;
    }

    public final T getValue() {
        return this.internalState.getValue();
    }

    public final T getVelocity() {
        return this.typeConverter.getConvertFromVector().invoke(getVelocityVector());
    }

    @NotNull
    public final V getVelocityVector() {
        return this.internalState.getVelocityVector();
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    @Nullable
    public final Object snapTo(T t2, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$snapTo$2(this, t2, null), continuation, 1, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return mutate$default == coroutine_suspended ? mutate$default : Unit.INSTANCE;
    }

    @Nullable
    public final Object stop(@NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$stop$2(this, null), continuation, 1, null);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return mutate$default == coroutine_suspended ? mutate$default : Unit.INSTANCE;
    }

    public final void updateBounds(@Nullable T t2, @Nullable T t3) {
        V invoke = t2 == null ? null : getTypeConverter().getConvertToVector().invoke(t2);
        if (invoke == null) {
            invoke = this.negativeInfinityBounds;
        }
        V invoke2 = t3 != null ? getTypeConverter().getConvertToVector().invoke(t3) : null;
        if (invoke2 == null) {
            invoke2 = this.positiveInfinityBounds;
        }
        int size$animation_core_release = invoke.getSize$animation_core_release();
        int i2 = 0;
        while (i2 < size$animation_core_release) {
            int i3 = i2 + 1;
            if (!(invoke.get$animation_core_release(i2) <= invoke2.get$animation_core_release(i2))) {
                throw new IllegalStateException(("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + invoke + " is greater than upper bound " + invoke2 + " on index " + i2).toString());
            }
            i2 = i3;
        }
        this.lowerBoundVector = invoke;
        this.upperBoundVector = invoke2;
        this.upperBound = t3;
        this.lowerBound = t2;
        if (isRunning()) {
            return;
        }
        T clampToBounds = clampToBounds(getValue());
        if (Intrinsics.areEqual(clampToBounds, getValue())) {
            return;
        }
        this.internalState.setValue$animation_core_release(clampToBounds);
    }
}
