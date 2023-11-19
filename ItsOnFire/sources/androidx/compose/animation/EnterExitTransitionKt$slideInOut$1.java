package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$slideInOut$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    public final /* synthetic */ String $labelPrefix;
    public final /* synthetic */ State<Slide> $slideIn;
    public final /* synthetic */ State<Slide> $slideOut;
    public final /* synthetic */ Transition<EnterExitState> $transition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$slideInOut$1(Transition<EnterExitState> transition, State<Slide> state, State<Slide> state2, String str) {
        super(3);
        this.$transition = transition;
        this.$slideIn = state;
        this.$slideOut = state2;
        this.$labelPrefix = str;
    }

    /* renamed from: invoke$lambda-1  reason: not valid java name */
    private static final boolean m66invoke$lambda1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* renamed from: invoke$lambda-2  reason: not valid java name */
    private static final void m67invoke$lambda2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.Modifier invoke(@org.jetbrains.annotations.NotNull androidx.compose.ui.Modifier r9, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r10, int r11) {
        /*
            r8 = this;
            java.lang.String r11 = "$this$composed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r11)
            r11 = 905898856(0x35feeb68, float:1.8992987E-6)
            r10.startReplaceableGroup(r11)
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r11 = r8.$transition
            r0 = -3686930(0xffffffffffc7bdee, float:NaN)
            r10.startReplaceableGroup(r0)
            boolean r11 = r10.changed(r11)
            java.lang.Object r1 = r10.rememberedValue()
            if (r11 != 0) goto L25
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r11 = r11.getEmpty()
            if (r1 != r11) goto L30
        L25:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r1 = 2
            r2 = 0
            androidx.compose.runtime.MutableState r1 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(r11, r2, r1, r2)
            r10.updateRememberedValue(r1)
        L30:
            r10.endReplaceableGroup()
            androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r11 = r8.$transition
            java.lang.Object r11 = r11.getCurrentState()
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r8.$transition
            java.lang.Object r2 = r2.getTargetState()
            if (r11 != r2) goto L4d
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r11 = r8.$transition
            boolean r11 = r11.isSeeking()
            if (r11 != 0) goto L4d
            r11 = 0
            goto L5e
        L4d:
            androidx.compose.runtime.State<androidx.compose.animation.Slide> r11 = r8.$slideIn
            java.lang.Object r11 = r11.getValue()
            if (r11 != 0) goto L5d
            androidx.compose.runtime.State<androidx.compose.animation.Slide> r11 = r8.$slideOut
            java.lang.Object r11 = r11.getValue()
            if (r11 == 0) goto L61
        L5d:
            r11 = 1
        L5e:
            m67invoke$lambda2(r1, r11)
        L61:
            boolean r11 = m66invoke$lambda1(r1)
            if (r11 == 0) goto Lc3
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r1 = r8.$transition
            androidx.compose.ui.unit.IntOffset$Companion r11 = androidx.compose.ui.unit.IntOffset.Companion
            androidx.compose.animation.core.TwoWayConverter r2 = androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(r11)
            java.lang.String r11 = r8.$labelPrefix
            r3 = -3687241(0xffffffffffc7bcb7, float:NaN)
            r10.startReplaceableGroup(r3)
            java.lang.Object r3 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r7.getEmpty()
            if (r3 != r4) goto L8c
            java.lang.String r3 = " slide"
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r11, r3)
            r10.updateRememberedValue(r3)
        L8c:
            r10.endReplaceableGroup()
            java.lang.String r3 = (java.lang.String) r3
            r5 = 448(0x1c0, float:6.28E-43)
            r6 = 0
            r4 = r10
            androidx.compose.animation.core.Transition$DeferredAnimation r11 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(r1, r2, r3, r4, r5, r6)
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r1 = r8.$transition
            androidx.compose.runtime.State<androidx.compose.animation.Slide> r2 = r8.$slideIn
            androidx.compose.runtime.State<androidx.compose.animation.Slide> r8 = r8.$slideOut
            r10.startReplaceableGroup(r0)
            boolean r0 = r10.changed(r1)
            java.lang.Object r1 = r10.rememberedValue()
            if (r0 != 0) goto Lb2
            java.lang.Object r0 = r7.getEmpty()
            if (r1 != r0) goto Lba
        Lb2:
            androidx.compose.animation.SlideModifier r1 = new androidx.compose.animation.SlideModifier
            r1.<init>(r11, r2, r8)
            r10.updateRememberedValue(r1)
        Lba:
            r10.endReplaceableGroup()
            androidx.compose.animation.SlideModifier r1 = (androidx.compose.animation.SlideModifier) r1
            androidx.compose.ui.Modifier r9 = r9.then(r1)
        Lc3:
            r10.endReplaceableGroup()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt$slideInOut$1.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }
}
