package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/EnterExitState;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ExpandShrinkModifier$sizeTransitionSpec$1 extends Lambda implements Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntSize>> {
    public final /* synthetic */ ExpandShrinkModifier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandShrinkModifier$sizeTransitionSpec$1(ExpandShrinkModifier expandShrinkModifier) {
        super(1);
        this.this$0 = expandShrinkModifier;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r3 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r3 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
        r2 = r3.getAnimationSpec();
     */
    @Override // kotlin.jvm.functions.Function1
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize> invoke(@org.jetbrains.annotations.NotNull androidx.compose.animation.core.Transition.Segment<androidx.compose.animation.EnterExitState> r4) {
        /*
            r3 = this;
            java.lang.String r0 = "$this$null"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.compose.animation.EnterExitState r0 = androidx.compose.animation.EnterExitState.PreEnter
            androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.Visible
            boolean r0 = r4.isTransitioningTo(r0, r1)
            r2 = 0
            if (r0 == 0) goto L24
            androidx.compose.animation.ExpandShrinkModifier r3 = r3.this$0
            androidx.compose.runtime.State r3 = r3.getExpand()
            java.lang.Object r3 = r3.getValue()
            androidx.compose.animation.ChangeSize r3 = (androidx.compose.animation.ChangeSize) r3
            if (r3 != 0) goto L1f
            goto L3f
        L1f:
            androidx.compose.animation.core.FiniteAnimationSpec r2 = r3.getAnimationSpec()
            goto L3f
        L24:
            androidx.compose.animation.EnterExitState r0 = androidx.compose.animation.EnterExitState.PostExit
            boolean r4 = r4.isTransitioningTo(r1, r0)
            if (r4 == 0) goto L3b
            androidx.compose.animation.ExpandShrinkModifier r3 = r3.this$0
            androidx.compose.runtime.State r3 = r3.getShrink()
            java.lang.Object r3 = r3.getValue()
            androidx.compose.animation.ChangeSize r3 = (androidx.compose.animation.ChangeSize) r3
            if (r3 != 0) goto L1f
            goto L3f
        L3b:
            androidx.compose.animation.core.SpringSpec r2 = androidx.compose.animation.EnterExitTransitionKt.access$getDefaultSizeAnimationSpec$p()
        L3f:
            if (r2 != 0) goto L45
            androidx.compose.animation.core.SpringSpec r2 = androidx.compose.animation.EnterExitTransitionKt.access$getDefaultSizeAnimationSpec$p()
        L45:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.ExpandShrinkModifier$sizeTransitionSpec$1.invoke(androidx.compose.animation.core.Transition$Segment):androidx.compose.animation.core.FiniteAnimationSpec");
    }
}
