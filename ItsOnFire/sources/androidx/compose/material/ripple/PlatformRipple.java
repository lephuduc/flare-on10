package androidx.compose.material.ripple;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0002\u0010\tJ\r\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\fJI\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/ripple/PlatformRipple;", "Landroidx/compose/material/ripple/Ripple;", "bounded", "", "radius", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "(ZFLandroidx/compose/runtime/State;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "findNearestViewGroup", "Landroid/view/ViewGroup;", "(Landroidx/compose/runtime/Composer;I)Landroid/view/ViewGroup;", "rememberUpdatedRippleInstance", "Landroidx/compose/material/ripple/RippleIndicationInstance;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "rememberUpdatedRippleInstance-942rkJo", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleIndicationInstance;", "material-ripple_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class PlatformRipple extends Ripple {
    private PlatformRipple(boolean z, float f2, State<Color> state) {
        super(z, f2, state, null);
    }

    public /* synthetic */ PlatformRipple(boolean z, float f2, State state, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f2, state);
    }

    @Composable
    private final ViewGroup findNearestViewGroup(Composer composer, int i2) {
        composer.startReplaceableGroup(601470064);
        Object consume = composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        while (!(consume instanceof ViewGroup)) {
            ViewParent parent = ((View) consume).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + consume + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            Intrinsics.checkNotNullExpressionValue(parent, "parent");
            consume = parent;
        }
        ViewGroup viewGroup = (ViewGroup) consume;
        composer.endReplaceableGroup();
        return viewGroup;
    }

    @Override // androidx.compose.material.ripple.Ripple
    @Composable
    @NotNull
    /* renamed from: rememberUpdatedRippleInstance-942rkJo */
    public RippleIndicationInstance mo1037rememberUpdatedRippleInstance942rkJo(@NotNull InteractionSource interactionSource, boolean z, float f2, @NotNull State<Color> color, @NotNull State<RippleAlpha> rippleAlpha, @Nullable Composer composer, int i2) {
        RippleIndicationInstance rippleIndicationInstance;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        composer.startReplaceableGroup(1643266907);
        ViewGroup findNearestViewGroup = findNearestViewGroup(composer, (i2 >> 15) & 14);
        composer.startReplaceableGroup(1643267286);
        if (findNearestViewGroup.isInEditMode()) {
            composer.startReplaceableGroup(-3686552);
            boolean changed = composer.changed(this) | composer.changed(interactionSource);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new CommonRippleIndicationInstance(z, f2, color, rippleAlpha, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            rippleIndicationInstance = (CommonRippleIndicationInstance) rememberedValue;
            composer.endReplaceableGroup();
        } else {
            composer.endReplaceableGroup();
            RippleContainer rippleContainer = null;
            int i3 = 0;
            int childCount = findNearestViewGroup.getChildCount();
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                int i4 = i3 + 1;
                View childAt = findNearestViewGroup.getChildAt(i3);
                if (childAt instanceof RippleContainer) {
                    rippleContainer = childAt;
                    break;
                }
                i3 = i4;
            }
            if (rippleContainer == null) {
                Context context = findNearestViewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "view.context");
                rippleContainer = new RippleContainer(context);
                findNearestViewGroup.addView(rippleContainer);
            }
            composer.startReplaceableGroup(-3686095);
            boolean changed2 = composer.changed(this) | composer.changed(interactionSource) | composer.changed(rippleContainer);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new AndroidRippleIndicationInstance(z, f2, color, rippleAlpha, rippleContainer, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            rippleIndicationInstance = (AndroidRippleIndicationInstance) rememberedValue2;
        }
        composer.endReplaceableGroup();
        return rippleIndicationInstance;
    }
}
