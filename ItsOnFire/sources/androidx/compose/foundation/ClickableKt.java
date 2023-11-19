package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import j.v0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0001¢\u0006\u0002\u0010\u0007\u001aW\u0010\b\u001a\u00020\t*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0014\u001aE\u0010\b\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0015\u001a\u0089\u0001\u0010\u0016\u001a\u00020\t*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u001a\u001aw\u0010\u0016\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u001b\u001a\u007f\u0010\u001c\u001a\u00020\t*\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u001e\u001aQ\u0010\u001f\u001a\u00020\u0001*\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00130$H\u0080@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"PressedInteractionSourceDisposableEffect", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "pressedInteraction", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)V", "clickable", "Landroidx/compose/ui/Modifier;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "onClick", "Lkotlin/Function0;", "clickable-O2vRcR0", "clickable-XHw0xAI", "combinedClickable", "onLongClickLabel", "onLongClick", "onDoubleClick", "combinedClickable-XVZzFYc", "combinedClickable-cJG_KMw", "genericClickableWithoutGesture", "gestureModifiers", "genericClickableWithoutGesture-BI-LeDI", "handlePressInteraction", "Landroidx/compose/foundation/gestures/PressGestureScope;", "pressPoint", "Landroidx/compose/ui/geometry/Offset;", "delayPressInteraction", "Landroidx/compose/runtime/State;", "handlePressInteraction-EPk0efs", "(Landroidx/compose/foundation/gestures/PressGestureScope;JLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ClickableKt {
    @Composable
    public static final void PressedInteractionSourceDisposableEffect(@NotNull MutableInteractionSource interactionSource, @NotNull MutableState<PressInteraction.Press> pressedInteraction, @Nullable Composer composer, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(pressedInteraction, "pressedInteraction");
        Composer startRestartGroup = composer.startRestartGroup(1115975634);
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(interactionSource) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & androidx.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i3 |= startRestartGroup.changed(pressedInteraction) ? 32 : 16;
        }
        if (((i3 & 91) ^ 18) == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            startRestartGroup.startReplaceableGroup(-3686552);
            boolean changed = startRestartGroup.changed(pressedInteraction) | startRestartGroup.changed(interactionSource);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ClickableKt$PressedInteractionSourceDisposableEffect$1$1(pressedInteraction, interactionSource);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(interactionSource, (Function1) rememberedValue, startRestartGroup, i3 & 14);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ClickableKt$PressedInteractionSourceDisposableEffect$2(interactionSource, pressedInteraction, i2));
    }

    @NotNull
    /* renamed from: clickable-O2vRcR0 */
    public static final Modifier m167clickableO2vRcR0(@NotNull Modifier clickable, @NotNull MutableInteractionSource interactionSource, @Nullable Indication indication, boolean z, @Nullable String str, @Nullable Role role, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(clickable, "$this$clickable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(clickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ClickableKt$clickableO2vRcR0$$inlined$debugInspectorInfo$1(z, str, role, onClick, indication, interactionSource) : InspectableValueKt.getNoInspectorInfo(), new ClickableKt$clickable$4(onClick, z, interactionSource, indication, str, role));
    }

    /* renamed from: clickable-O2vRcR0$default */
    public static /* synthetic */ Modifier m168clickableO2vRcR0$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return m167clickableO2vRcR0(modifier, mutableInteractionSource, indication, z, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : role, function0);
    }

    @NotNull
    /* renamed from: clickable-XHw0xAI */
    public static final Modifier m169clickableXHw0xAI(@NotNull Modifier clickable, boolean z, @Nullable String str, @Nullable Role role, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(clickable, "$this$clickable");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(clickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ClickableKt$clickableXHw0xAI$$inlined$debugInspectorInfo$1(z, str, role, onClick) : InspectableValueKt.getNoInspectorInfo(), new ClickableKt$clickable$2(z, str, role, onClick));
    }

    /* renamed from: clickable-XHw0xAI$default */
    public static /* synthetic */ Modifier m170clickableXHw0xAI$default(Modifier modifier, boolean z, String str, Role role, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            role = null;
        }
        return m169clickableXHw0xAI(modifier, z, str, role, function0);
    }

    @ExperimentalFoundationApi
    @NotNull
    /* renamed from: combinedClickable-XVZzFYc */
    public static final Modifier m171combinedClickableXVZzFYc(@NotNull Modifier combinedClickable, @NotNull MutableInteractionSource interactionSource, @Nullable Indication indication, boolean z, @Nullable String str, @Nullable Role role, @Nullable String str2, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(combinedClickable, "$this$combinedClickable");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(combinedClickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ClickableKt$combinedClickableXVZzFYc$$inlined$debugInspectorInfo$1(z, str, role, onClick, function02, function0, str2, indication, interactionSource) : InspectableValueKt.getNoInspectorInfo(), new ClickableKt$combinedClickable$4(onClick, function0, function02, z, interactionSource, indication, str, role, str2));
    }

    @ExperimentalFoundationApi
    @NotNull
    /* renamed from: combinedClickable-cJG_KMw */
    public static final Modifier m173combinedClickablecJG_KMw(@NotNull Modifier combinedClickable, boolean z, @Nullable String str, @Nullable Role role, @Nullable String str2, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(combinedClickable, "$this$combinedClickable");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed(combinedClickable, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ClickableKt$combinedClickablecJG_KMw$$inlined$debugInspectorInfo$1(z, str, role, onClick, function02, function0, str2) : InspectableValueKt.getNoInspectorInfo(), new ClickableKt$combinedClickable$2(z, str, role, str2, function0, function02, onClick));
    }

    @NotNull
    /* renamed from: genericClickableWithoutGesture-BI-LeDI */
    public static final Modifier m175genericClickableWithoutGestureBILeDI(@NotNull Modifier genericClickableWithoutGesture, @NotNull Modifier gestureModifiers, @NotNull MutableInteractionSource interactionSource, @Nullable Indication indication, boolean z, @Nullable String str, @Nullable Role role, @Nullable String str2, @Nullable Function0<Unit> function0, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(genericClickableWithoutGesture, "$this$genericClickableWithoutGesture");
        Intrinsics.checkNotNullParameter(gestureModifiers, "gestureModifiers");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return FocusableKt.focusableInNonTouchMode(HoverableKt.hoverable(IndicationKt.indication(genericClickableWithoutGesture_BI_LeDI$detectClickFromKey(genericClickableWithoutGesture_BI_LeDI$clickSemantics(genericClickableWithoutGesture, role, str, function0, str2, z, onClick), z, onClick), interactionSource, indication), interactionSource, z), z, interactionSource).then(gestureModifiers);
    }

    private static final Modifier genericClickableWithoutGesture_BI_LeDI$clickSemantics(Modifier modifier, Role role, String str, Function0<Unit> function0, String str2, boolean z, Function0<Unit> function02) {
        return SemanticsModifierKt.semantics(modifier, true, new ClickableKt$genericClickableWithoutGesture$clickSemantics$1(role, str, function0, str2, z, function02));
    }

    private static final Modifier genericClickableWithoutGesture_BI_LeDI$detectClickFromKey(Modifier modifier, boolean z, Function0<Unit> function0) {
        return KeyInputModifierKt.onKeyEvent(modifier, new ClickableKt$genericClickableWithoutGesture$detectClickFromKey$1(z, function0));
    }

    @Nullable
    /* renamed from: handlePressInteraction-EPk0efs */
    public static final Object m177handlePressInteractionEPk0efs(@NotNull PressGestureScope pressGestureScope, long j2, @NotNull MutableInteractionSource mutableInteractionSource, @NotNull MutableState<PressInteraction.Press> mutableState, @NotNull State<? extends Function0<Boolean>> state, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object g2 = v0.g(new ClickableKt$handlePressInteraction$2(pressGestureScope, j2, mutableInteractionSource, mutableState, state, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return g2 == coroutine_suspended ? g2 : Unit.INSTANCE;
    }
}
