package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$createModifier$alpha$2 extends Lambda implements Function3<Transition.Segment<EnterExitState>, Composer, Integer, FiniteAnimationSpec<Float>> {
    public final /* synthetic */ EnterTransition $enter;
    public final /* synthetic */ ExitTransition $exit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createModifier$alpha$2(EnterTransition enterTransition, ExitTransition exitTransition) {
        super(3);
        this.$enter = enterTransition;
        this.$exit = exitTransition;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r1 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r1 == null) goto L10;
     */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> invoke(@org.jetbrains.annotations.NotNull androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState> r3, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r4, int r5) {
        /*
            r2 = this;
            java.lang.String r5 = "$this$animateFloat"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
            r5 = -9520302(0xffffffffff6ebb52, float:-3.1732889E38)
            r4.startReplaceableGroup(r5)
            androidx.compose.animation.EnterExitState r5 = androidx.compose.animation.EnterExitState.PreEnter
            androidx.compose.animation.EnterExitState r0 = androidx.compose.animation.EnterExitState.Visible
            boolean r5 = r3.isTransitioningTo(r5, r0)
            r1 = 0
            if (r5 == 0) goto L2a
            androidx.compose.animation.EnterTransition r2 = r2.$enter
            androidx.compose.animation.TransitionData r2 = r2.getData$animation_release()
            androidx.compose.animation.Fade r2 = r2.getFade()
            if (r2 != 0) goto L23
            goto L27
        L23:
            androidx.compose.animation.core.FiniteAnimationSpec r1 = r2.getAnimationSpec()
        L27:
            if (r1 != 0) goto L49
            goto L45
        L2a:
            androidx.compose.animation.EnterExitState r5 = androidx.compose.animation.EnterExitState.PostExit
            boolean r3 = r3.isTransitioningTo(r0, r5)
            if (r3 == 0) goto L45
            androidx.compose.animation.ExitTransition r2 = r2.$exit
            androidx.compose.animation.TransitionData r2 = r2.getData$animation_release()
            androidx.compose.animation.Fade r2 = r2.getFade()
            if (r2 != 0) goto L3f
            goto L43
        L3f:
            androidx.compose.animation.core.FiniteAnimationSpec r1 = r2.getAnimationSpec()
        L43:
            if (r1 != 0) goto L49
        L45:
            androidx.compose.animation.core.SpringSpec r1 = androidx.compose.animation.EnterExitTransitionKt.access$getDefaultAlphaAndScaleSpring$p()
        L49:
            r4.endReplaceableGroup()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt$createModifier$alpha$2.invoke(androidx.compose.animation.core.Transition$Segment, androidx.compose.runtime.Composer, int):androidx.compose.animation.core.FiniteAnimationSpec");
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Float> invoke(Transition.Segment<EnterExitState> segment, Composer composer, Integer num) {
        return invoke(segment, composer, num.intValue());
    }
}
