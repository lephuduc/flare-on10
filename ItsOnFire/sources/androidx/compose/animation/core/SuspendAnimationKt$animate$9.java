package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SuspendAnimationKt$animate$9 extends Lambda implements Function1<Long, Unit> {
    public final /* synthetic */ Animation<T, V> $animation;
    public final /* synthetic */ Function1<AnimationScope<T, V>, Unit> $block;
    public final /* synthetic */ Ref.ObjectRef<AnimationScope<T, V>> $lateInitScope;
    public final /* synthetic */ AnimationState<T, V> $this_animate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SuspendAnimationKt$animate$9(Ref.ObjectRef<AnimationScope<T, V>> objectRef, Animation<T, V> animation, AnimationState<T, V> animationState, Function1<? super AnimationScope<T, V>, Unit> function1) {
        super(1);
        this.$lateInitScope = objectRef;
        this.$animation = animation;
        this.$this_animate = animationState;
        this.$block = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
        invoke(l2.longValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(long j2) {
        T t2 = this.$lateInitScope.element;
        Intrinsics.checkNotNull(t2);
        SuspendAnimationKt.doAnimationFrame((AnimationScope) t2, j2, this.$animation, this.$this_animate, this.$block);
    }
}
