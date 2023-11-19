package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldTransitionScope$Transition$indicatorWidth$2 extends Lambda implements Function3<Transition.Segment<InputPhase>, Composer, Integer, FiniteAnimationSpec<Dp>> {
    public static final TextFieldTransitionScope$Transition$indicatorWidth$2 INSTANCE = new TextFieldTransitionScope$Transition$indicatorWidth$2();

    public TextFieldTransitionScope$Transition$indicatorWidth$2() {
        super(3);
    }

    @Composable
    @NotNull
    public final FiniteAnimationSpec<Dp> invoke(@NotNull Transition.Segment<InputPhase> animateDp, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(animateDp, "$this$animateDp");
        composer.startReplaceableGroup(337280971);
        TweenSpec tween$default = AnimationSpecKt.tween$default(TextFieldImplKt.AnimationDuration, 0, null, 6, null);
        composer.endReplaceableGroup();
        return tween$default;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ FiniteAnimationSpec<Dp> invoke(Transition.Segment<InputPhase> segment, Composer composer, Integer num) {
        return invoke(segment, composer, num.intValue());
    }
}
