package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class InfiniteTransitionKt$animateValue$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ InfiniteRepeatableSpec<T> $animationSpec;
    public final /* synthetic */ T $initialValue;
    public final /* synthetic */ T $targetValue;
    public final /* synthetic */ InfiniteTransition.TransitionAnimationState<T, V> $transitionAnimation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransitionKt$animateValue$1(T t2, InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState, T t3, InfiniteRepeatableSpec<T> infiniteRepeatableSpec) {
        super(0);
        this.$initialValue = t2;
        this.$transitionAnimation = transitionAnimationState;
        this.$targetValue = t3;
        this.$animationSpec = infiniteRepeatableSpec;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (Intrinsics.areEqual(this.$initialValue, this.$transitionAnimation.getInitialValue()) && Intrinsics.areEqual(this.$targetValue, this.$transitionAnimation.getTargetValue())) {
            return;
        }
        this.$transitionAnimation.updateValues(this.$initialValue, this.$targetValue, this.$animationSpec);
    }
}
