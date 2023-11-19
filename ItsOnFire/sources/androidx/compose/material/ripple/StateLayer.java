package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b!\u0010\"J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J'\u0010\u000f\u001a\u00020\u0006*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/material/ripple/StateLayer;", "", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "Lj/u0;", "scope", "", "handleInteraction", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/Color;", "color", "drawStateLayer-H2RKhps", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJ)V", "drawStateLayer", "", "bounded", "Z", "Landroidx/compose/runtime/State;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "animatedAlpha", "Landroidx/compose/animation/core/Animatable;", "", "interactions", "Ljava/util/List;", "currentInteraction", "Landroidx/compose/foundation/interaction/Interaction;", "<init>", "(ZLandroidx/compose/runtime/State;)V", "material-ripple_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class StateLayer {
    @NotNull
    private final Animatable<Float, AnimationVector1D> animatedAlpha;
    private final boolean bounded;
    @Nullable
    private Interaction currentInteraction;
    @NotNull
    private final List<Interaction> interactions;
    @NotNull
    private final State<RippleAlpha> rippleAlpha;

    public StateLayer(boolean z, @NotNull State<RippleAlpha> rippleAlpha) {
        Intrinsics.checkNotNullParameter(rippleAlpha, "rippleAlpha");
        this.bounded = z;
        this.rippleAlpha = rippleAlpha;
        this.animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.interactions = new ArrayList();
    }

    /* renamed from: drawStateLayer-H2RKhps  reason: not valid java name */
    public final void m1049drawStateLayerH2RKhps(@NotNull DrawScope receiver, float f2, long j2) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        float m1040getRippleEndRadiuscSwnlzA = Float.isNaN(f2) ? RippleAnimationKt.m1040getRippleEndRadiuscSwnlzA(receiver, this.bounded, receiver.mo1780getSizeNHjbRc()) : receiver.mo277toPx0680j_4(f2);
        float floatValue = this.animatedAlpha.getValue().floatValue();
        if (floatValue > 0.0f) {
            long m1391copywmQWz5c$default = Color.m1391copywmQWz5c$default(j2, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (!this.bounded) {
                DrawScope.DefaultImpls.m1815drawCircleVaOC9Bg$default(receiver, m1391copywmQWz5c$default, m1040getRippleEndRadiuscSwnlzA, 0L, 0.0f, null, null, 0, androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMajor, null);
                return;
            }
            float m1230getWidthimpl = Size.m1230getWidthimpl(receiver.mo1780getSizeNHjbRc());
            float m1227getHeightimpl = Size.m1227getHeightimpl(receiver.mo1780getSizeNHjbRc());
            int m1381getIntersectrtfAjoo = ClipOp.Companion.m1381getIntersectrtfAjoo();
            DrawContext drawContext = receiver.getDrawContext();
            long mo1786getSizeNHjbRc = drawContext.mo1786getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo1789clipRectN_I0leg(0.0f, 0.0f, m1230getWidthimpl, m1227getHeightimpl, m1381getIntersectrtfAjoo);
            DrawScope.DefaultImpls.m1815drawCircleVaOC9Bg$default(receiver, m1391copywmQWz5c$default, m1040getRippleEndRadiuscSwnlzA, 0L, 0.0f, null, null, 0, androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMajor, null);
            drawContext.getCanvas().restore();
            drawContext.mo1787setSizeuvyYCjk(mo1786getSizeNHjbRc);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleInteraction(@org.jetbrains.annotations.NotNull androidx.compose.foundation.interaction.Interaction r10, @org.jetbrains.annotations.NotNull j.u0 r11) {
        /*
            r9 = this;
            java.lang.String r0 = "interaction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            boolean r0 = r10 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter
            if (r0 == 0) goto L14
        Le:
            java.util.List<androidx.compose.foundation.interaction.Interaction> r1 = r9.interactions
            r1.add(r10)
            goto L59
        L14:
            boolean r1 = r10 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit
            if (r1 == 0) goto L25
            java.util.List<androidx.compose.foundation.interaction.Interaction> r1 = r9.interactions
            r2 = r10
            androidx.compose.foundation.interaction.HoverInteraction$Exit r2 = (androidx.compose.foundation.interaction.HoverInteraction.Exit) r2
            androidx.compose.foundation.interaction.HoverInteraction$Enter r2 = r2.getEnter()
        L21:
            r1.remove(r2)
            goto L59
        L25:
            boolean r1 = r10 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus
            if (r1 == 0) goto L2a
            goto Le
        L2a:
            boolean r1 = r10 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus
            if (r1 == 0) goto L38
            java.util.List<androidx.compose.foundation.interaction.Interaction> r1 = r9.interactions
            r2 = r10
            androidx.compose.foundation.interaction.FocusInteraction$Unfocus r2 = (androidx.compose.foundation.interaction.FocusInteraction.Unfocus) r2
            androidx.compose.foundation.interaction.FocusInteraction$Focus r2 = r2.getFocus()
            goto L21
        L38:
            boolean r1 = r10 instanceof androidx.compose.foundation.interaction.DragInteraction.Start
            if (r1 == 0) goto L3d
            goto Le
        L3d:
            boolean r1 = r10 instanceof androidx.compose.foundation.interaction.DragInteraction.Stop
            if (r1 == 0) goto L4b
            java.util.List<androidx.compose.foundation.interaction.Interaction> r1 = r9.interactions
            r2 = r10
            androidx.compose.foundation.interaction.DragInteraction$Stop r2 = (androidx.compose.foundation.interaction.DragInteraction.Stop) r2
            androidx.compose.foundation.interaction.DragInteraction$Start r2 = r2.getStart()
            goto L21
        L4b:
            boolean r1 = r10 instanceof androidx.compose.foundation.interaction.DragInteraction.Cancel
            if (r1 == 0) goto Lbf
            java.util.List<androidx.compose.foundation.interaction.Interaction> r1 = r9.interactions
            r2 = r10
            androidx.compose.foundation.interaction.DragInteraction$Cancel r2 = (androidx.compose.foundation.interaction.DragInteraction.Cancel) r2
            androidx.compose.foundation.interaction.DragInteraction$Start r2 = r2.getStart()
            goto L21
        L59:
            java.util.List<androidx.compose.foundation.interaction.Interaction> r1 = r9.interactions
            java.lang.Object r1 = kotlin.collections.CollectionsKt.lastOrNull(r1)
            androidx.compose.foundation.interaction.Interaction r1 = (androidx.compose.foundation.interaction.Interaction) r1
            androidx.compose.foundation.interaction.Interaction r2 = r9.currentInteraction
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r1)
            if (r2 != 0) goto Lbf
            r2 = 0
            if (r1 == 0) goto Laa
            if (r0 == 0) goto L7b
            androidx.compose.runtime.State<androidx.compose.material.ripple.RippleAlpha> r10 = r9.rippleAlpha
            java.lang.Object r10 = r10.getValue()
            androidx.compose.material.ripple.RippleAlpha r10 = (androidx.compose.material.ripple.RippleAlpha) r10
            float r10 = r10.getHoveredAlpha()
            goto L9e
        L7b:
            boolean r0 = r10 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus
            if (r0 == 0) goto L8c
            androidx.compose.runtime.State<androidx.compose.material.ripple.RippleAlpha> r10 = r9.rippleAlpha
            java.lang.Object r10 = r10.getValue()
            androidx.compose.material.ripple.RippleAlpha r10 = (androidx.compose.material.ripple.RippleAlpha) r10
            float r10 = r10.getFocusedAlpha()
            goto L9e
        L8c:
            boolean r10 = r10 instanceof androidx.compose.foundation.interaction.DragInteraction.Start
            if (r10 == 0) goto L9d
            androidx.compose.runtime.State<androidx.compose.material.ripple.RippleAlpha> r10 = r9.rippleAlpha
            java.lang.Object r10 = r10.getValue()
            androidx.compose.material.ripple.RippleAlpha r10 = (androidx.compose.material.ripple.RippleAlpha) r10
            float r10 = r10.getDraggedAlpha()
            goto L9e
        L9d:
            r10 = 0
        L9e:
            androidx.compose.animation.core.AnimationSpec r0 = androidx.compose.material.ripple.RippleKt.access$incomingStateLayerAnimationSpecFor(r1)
            r4 = 0
            r5 = 0
            androidx.compose.material.ripple.StateLayer$handleInteraction$1 r6 = new androidx.compose.material.ripple.StateLayer$handleInteraction$1
            r6.<init>(r9, r10, r0, r2)
            goto Lb7
        Laa:
            androidx.compose.foundation.interaction.Interaction r10 = r9.currentInteraction
            androidx.compose.animation.core.AnimationSpec r10 = androidx.compose.material.ripple.RippleKt.access$outgoingStateLayerAnimationSpecFor(r10)
            r4 = 0
            r5 = 0
            androidx.compose.material.ripple.StateLayer$handleInteraction$2 r6 = new androidx.compose.material.ripple.StateLayer$handleInteraction$2
            r6.<init>(r9, r10, r2)
        Lb7:
            r7 = 3
            r8 = 0
            r3 = r11
            j.j.e(r3, r4, r5, r6, r7, r8)
            r9.currentInteraction = r1
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.StateLayer.handleInteraction(androidx.compose.foundation.interaction.Interaction, j.u0):void");
    }
}
