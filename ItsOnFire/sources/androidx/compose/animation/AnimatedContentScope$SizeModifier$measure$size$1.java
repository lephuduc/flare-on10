package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AnimatedContentScope$SizeModifier$measure$size$1 extends Lambda implements Function1<Transition.Segment<S>, FiniteAnimationSpec<IntSize>> {
    public final /* synthetic */ AnimatedContentScope<S> this$0;
    public final /* synthetic */ AnimatedContentScope<S>.SizeModifier this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentScope$SizeModifier$measure$size$1(AnimatedContentScope<S> animatedContentScope, AnimatedContentScope<S>.SizeModifier sizeModifier) {
        super(1);
        this.this$0 = animatedContentScope;
        this.this$1 = sizeModifier;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final FiniteAnimationSpec<IntSize> invoke(@NotNull Transition.Segment<S> animate) {
        Intrinsics.checkNotNullParameter(animate, "$this$animate");
        State state = (State) this.this$0.getTargetSizeMap$animation_release().get(animate.getInitialState());
        IntSize intSize = state == null ? null : (IntSize) state.getValue();
        long m3490getZeroYbymL2g = intSize == null ? IntSize.Companion.m3490getZeroYbymL2g() : intSize.m3489unboximpl();
        State state2 = (State) this.this$0.getTargetSizeMap$animation_release().get(animate.getTargetState());
        IntSize intSize2 = state2 == null ? null : (IntSize) state2.getValue();
        long m3490getZeroYbymL2g2 = intSize2 == null ? IntSize.Companion.m3490getZeroYbymL2g() : intSize2.m3489unboximpl();
        SizeTransform value = this.this$1.getSizeTransform().getValue();
        FiniteAnimationSpec<IntSize> mo87createAnimationSpecTemP2vQ = value == null ? null : value.mo87createAnimationSpecTemP2vQ(m3490getZeroYbymL2g, m3490getZeroYbymL2g2);
        return mo87createAnimationSpecTemP2vQ == null ? AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null) : mo87createAnimationSpecTemP2vQ;
    }
}
