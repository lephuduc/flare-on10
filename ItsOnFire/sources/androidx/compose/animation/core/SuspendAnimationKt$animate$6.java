package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX WARN: Incorrect field signature: TV; */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SuspendAnimationKt$animate$6 extends Lambda implements Function1<Long, Unit> {
    public final /* synthetic */ Animation<T, V> $animation;
    public final /* synthetic */ Function1<AnimationScope<T, V>, Unit> $block;
    public final /* synthetic */ T $initialValue;
    public final /* synthetic */ AnimationVector $initialVelocityVector;
    public final /* synthetic */ Ref.ObjectRef<AnimationScope<T, V>> $lateInitScope;
    public final /* synthetic */ AnimationState<T, V> $this_animate;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.animation.core.SuspendAnimationKt$animate$6$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ AnimationState<T, V> $this_animate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnimationState<T, V> animationState) {
            super(0);
            this.$this_animate = animationState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$this_animate.setRunning$animation_core_release(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/internal/Ref$ObjectRef<Landroidx/compose/animation/core/AnimationScope<TT;TV;>;>;TT;Landroidx/compose/animation/core/Animation<TT;TV;>;TV;Landroidx/compose/animation/core/AnimationState<TT;TV;>;Lkotlin/jvm/functions/Function1<-Landroidx/compose/animation/core/AnimationScope<TT;TV;>;Lkotlin/Unit;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendAnimationKt$animate$6(Ref.ObjectRef objectRef, Object obj, Animation animation, AnimationVector animationVector, AnimationState animationState, Function1 function1) {
        super(1);
        this.$lateInitScope = objectRef;
        this.$initialValue = obj;
        this.$animation = animation;
        this.$initialVelocityVector = animationVector;
        this.$this_animate = animationState;
        this.$block = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
        invoke(l2.longValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [T, androidx.compose.animation.core.AnimationScope] */
    public final void invoke(long j2) {
        Ref.ObjectRef<AnimationScope<T, V>> objectRef = this.$lateInitScope;
        ?? animationScope = new AnimationScope(this.$initialValue, this.$animation.getTypeConverter(), this.$initialVelocityVector, j2, this.$animation.getTargetValue(), j2, true, new AnonymousClass1(this.$this_animate));
        SuspendAnimationKt.doAnimationFrame(animationScope, j2, this.$animation, this.$this_animate, this.$block);
        objectRef.element = animationScope;
    }
}
