package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000J\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroidx/compose/material/ElevationDefaults;", "", "()V", "incomingAnimationSpecForInteraction", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/ui/unit/Dp;", "interaction", "Landroidx/compose/foundation/interaction/Interaction;", "outgoingAnimationSpecForInteraction", "material_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ElevationDefaults {
    @NotNull
    public static final ElevationDefaults INSTANCE = new ElevationDefaults();

    private ElevationDefaults() {
    }

    @Nullable
    public final AnimationSpec<Dp> incomingAnimationSpecForInteraction(@NotNull Interaction interaction) {
        TweenSpec tweenSpec;
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        if ((interaction instanceof PressInteraction.Press) || (interaction instanceof DragInteraction.Start) || (interaction instanceof HoverInteraction.Enter) || (interaction instanceof FocusInteraction.Focus)) {
            tweenSpec = ElevationKt.DefaultIncomingSpec;
            return tweenSpec;
        }
        return null;
    }

    @Nullable
    public final AnimationSpec<Dp> outgoingAnimationSpecForInteraction(@NotNull Interaction interaction) {
        TweenSpec tweenSpec;
        TweenSpec tweenSpec2;
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        if (!(interaction instanceof PressInteraction.Press) && !(interaction instanceof DragInteraction.Start)) {
            if (interaction instanceof HoverInteraction.Enter) {
                tweenSpec = ElevationKt.HoveredOutgoingSpec;
                return tweenSpec;
            } else if (!(interaction instanceof FocusInteraction.Focus)) {
                return null;
            }
        }
        tweenSpec2 = ElevationKt.DefaultOutgoingSpec;
        return tweenSpec2;
    }
}
