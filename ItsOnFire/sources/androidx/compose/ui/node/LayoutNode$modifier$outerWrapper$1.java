package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusRequesterModifier;
import androidx.compose.ui.input.key.KeyInputModifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDelegatingWrapper;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsWrapper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "mod", "Landroidx/compose/ui/Modifier$Element;", "toWrap", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LayoutNode$modifier$outerWrapper$1 extends Lambda implements Function2<Modifier.Element, LayoutNodeWrapper, LayoutNodeWrapper> {
    public final /* synthetic */ LayoutNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNode$modifier$outerWrapper$1(LayoutNode layoutNode) {
        super(2);
        this.this$0 = layoutNode;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final LayoutNodeWrapper invoke(@NotNull Modifier.Element mod, @NotNull LayoutNodeWrapper toWrap) {
        DelegatingLayoutNodeWrapper reuseLayoutNodeWrapper;
        ModifierLocalConsumerNode modifierLocalConsumerNode;
        Intrinsics.checkNotNullParameter(mod, "mod");
        Intrinsics.checkNotNullParameter(toWrap, "toWrap");
        if (mod instanceof RemeasurementModifier) {
            ((RemeasurementModifier) mod).onRemeasurementAvailable(this.this$0);
        }
        if (mod instanceof DrawModifier) {
            DrawEntity drawEntity = new DrawEntity(toWrap, (DrawModifier) mod);
            drawEntity.setNext(toWrap.getDrawEntityHead());
            toWrap.setDrawEntityHead(drawEntity);
            drawEntity.onInitialize();
        }
        reuseLayoutNodeWrapper = this.this$0.reuseLayoutNodeWrapper(mod, toWrap);
        if (reuseLayoutNodeWrapper == null) {
            if (mod instanceof ModifierLocalProvider) {
                modifierLocalConsumerNode = new ModifierLocalProviderNode(toWrap, (ModifierLocalProvider) mod);
                modifierLocalConsumerNode.onInitialize();
                if (toWrap != modifierLocalConsumerNode.getWrapped$ui_release()) {
                    ((DelegatingLayoutNodeWrapper) modifierLocalConsumerNode.getWrapped$ui_release()).setChained(true);
                }
            } else {
                modifierLocalConsumerNode = toWrap;
            }
            if (mod instanceof ModifierLocalConsumer) {
                ModifierLocalConsumerNode modifierLocalConsumerNode2 = new ModifierLocalConsumerNode(modifierLocalConsumerNode, (ModifierLocalConsumer) mod);
                modifierLocalConsumerNode2.onInitialize();
                if (toWrap != modifierLocalConsumerNode2.getWrapped$ui_release()) {
                    ((DelegatingLayoutNodeWrapper) modifierLocalConsumerNode2.getWrapped$ui_release()).setChained(true);
                }
                modifierLocalConsumerNode = modifierLocalConsumerNode2;
            }
            if (mod instanceof FocusModifier) {
                ModifiedFocusNode modifiedFocusNode = new ModifiedFocusNode(modifierLocalConsumerNode, (FocusModifier) mod);
                modifiedFocusNode.onInitialize();
                if (toWrap != modifiedFocusNode.getWrapped$ui_release()) {
                    ((DelegatingLayoutNodeWrapper) modifiedFocusNode.getWrapped$ui_release()).setChained(true);
                }
                modifierLocalConsumerNode = modifiedFocusNode;
            }
            if (mod instanceof FocusEventModifier) {
                ModifiedFocusEventNode modifiedFocusEventNode = new ModifiedFocusEventNode(modifierLocalConsumerNode, (FocusEventModifier) mod);
                modifiedFocusEventNode.onInitialize();
                if (toWrap != modifiedFocusEventNode.getWrapped$ui_release()) {
                    ((DelegatingLayoutNodeWrapper) modifiedFocusEventNode.getWrapped$ui_release()).setChained(true);
                }
                modifierLocalConsumerNode = modifiedFocusEventNode;
            }
            if (mod instanceof FocusRequesterModifier) {
                ModifiedFocusRequesterNode modifiedFocusRequesterNode = new ModifiedFocusRequesterNode(modifierLocalConsumerNode, (FocusRequesterModifier) mod);
                modifiedFocusRequesterNode.onInitialize();
                if (toWrap != modifiedFocusRequesterNode.getWrapped$ui_release()) {
                    ((DelegatingLayoutNodeWrapper) modifiedFocusRequesterNode.getWrapped$ui_release()).setChained(true);
                }
                modifierLocalConsumerNode = modifiedFocusRequesterNode;
            }
            if (mod instanceof FocusOrderModifier) {
                ModifiedFocusOrderNode modifiedFocusOrderNode = new ModifiedFocusOrderNode(modifierLocalConsumerNode, (FocusOrderModifier) mod);
                modifiedFocusOrderNode.onInitialize();
                if (toWrap != modifiedFocusOrderNode.getWrapped$ui_release()) {
                    ((DelegatingLayoutNodeWrapper) modifiedFocusOrderNode.getWrapped$ui_release()).setChained(true);
                }
                modifierLocalConsumerNode = modifiedFocusOrderNode;
            }
            if (mod instanceof KeyInputModifier) {
                ModifiedKeyInputNode modifiedKeyInputNode = new ModifiedKeyInputNode(modifierLocalConsumerNode, (KeyInputModifier) mod);
                modifiedKeyInputNode.onInitialize();
                if (toWrap != modifiedKeyInputNode.getWrapped$ui_release()) {
                    ((DelegatingLayoutNodeWrapper) modifiedKeyInputNode.getWrapped$ui_release()).setChained(true);
                }
                modifierLocalConsumerNode = modifiedKeyInputNode;
            }
            if (mod instanceof PointerInputModifier) {
                PointerInputDelegatingWrapper pointerInputDelegatingWrapper = new PointerInputDelegatingWrapper(modifierLocalConsumerNode, (PointerInputModifier) mod);
                pointerInputDelegatingWrapper.onInitialize();
                if (toWrap != pointerInputDelegatingWrapper.getWrapped$ui_release()) {
                    ((DelegatingLayoutNodeWrapper) pointerInputDelegatingWrapper.getWrapped$ui_release()).setChained(true);
                }
                modifierLocalConsumerNode = pointerInputDelegatingWrapper;
            }
            if (mod instanceof NestedScrollModifier) {
                NestedScrollDelegatingWrapper nestedScrollDelegatingWrapper = new NestedScrollDelegatingWrapper(modifierLocalConsumerNode, (NestedScrollModifier) mod);
                nestedScrollDelegatingWrapper.onInitialize();
                if (toWrap != nestedScrollDelegatingWrapper.getWrapped$ui_release()) {
                    ((DelegatingLayoutNodeWrapper) nestedScrollDelegatingWrapper.getWrapped$ui_release()).setChained(true);
                }
                modifierLocalConsumerNode = nestedScrollDelegatingWrapper;
            }
            if (mod instanceof LayoutModifier) {
                ModifiedLayoutNode modifiedLayoutNode = new ModifiedLayoutNode(modifierLocalConsumerNode, (LayoutModifier) mod);
                modifiedLayoutNode.onInitialize();
                if (toWrap != modifiedLayoutNode.getWrapped$ui_release()) {
                    ((DelegatingLayoutNodeWrapper) modifiedLayoutNode.getWrapped$ui_release()).setChained(true);
                }
                modifierLocalConsumerNode = modifiedLayoutNode;
            }
            if (mod instanceof ParentDataModifier) {
                ModifiedParentDataNode modifiedParentDataNode = new ModifiedParentDataNode(modifierLocalConsumerNode, (ParentDataModifier) mod);
                modifiedParentDataNode.onInitialize();
                if (toWrap != modifiedParentDataNode.getWrapped$ui_release()) {
                    ((DelegatingLayoutNodeWrapper) modifiedParentDataNode.getWrapped$ui_release()).setChained(true);
                }
                modifierLocalConsumerNode = modifiedParentDataNode;
            }
            if (mod instanceof SemanticsModifier) {
                SemanticsWrapper semanticsWrapper = new SemanticsWrapper(modifierLocalConsumerNode, (SemanticsModifier) mod);
                semanticsWrapper.onInitialize();
                if (toWrap != semanticsWrapper.getWrapped$ui_release()) {
                    ((DelegatingLayoutNodeWrapper) semanticsWrapper.getWrapped$ui_release()).setChained(true);
                }
                modifierLocalConsumerNode = semanticsWrapper;
            }
            if (mod instanceof OnRemeasuredModifier) {
                RemeasureModifierWrapper remeasureModifierWrapper = new RemeasureModifierWrapper(modifierLocalConsumerNode, (OnRemeasuredModifier) mod);
                remeasureModifierWrapper.onInitialize();
                if (toWrap != remeasureModifierWrapper.getWrapped$ui_release()) {
                    ((DelegatingLayoutNodeWrapper) remeasureModifierWrapper.getWrapped$ui_release()).setChained(true);
                }
                modifierLocalConsumerNode = remeasureModifierWrapper;
            }
            if (mod instanceof OnPlacedModifier) {
                OnPlacedModifierWrapper onPlacedModifierWrapper = new OnPlacedModifierWrapper(modifierLocalConsumerNode, (OnPlacedModifier) mod);
                onPlacedModifierWrapper.onInitialize();
                if (toWrap != onPlacedModifierWrapper.getWrapped$ui_release()) {
                    ((DelegatingLayoutNodeWrapper) onPlacedModifierWrapper.getWrapped$ui_release()).setChained(true);
                }
                modifierLocalConsumerNode = onPlacedModifierWrapper;
            }
            if (mod instanceof OnGloballyPositionedModifier) {
                OnGloballyPositionedModifierWrapper onGloballyPositionedModifierWrapper = new OnGloballyPositionedModifierWrapper(modifierLocalConsumerNode, (OnGloballyPositionedModifier) mod);
                onGloballyPositionedModifierWrapper.onInitialize();
                if (toWrap != onGloballyPositionedModifierWrapper.getWrapped$ui_release()) {
                    ((DelegatingLayoutNodeWrapper) onGloballyPositionedModifierWrapper.getWrapped$ui_release()).setChained(true);
                }
                return onGloballyPositionedModifierWrapper;
            }
            return modifierLocalConsumerNode;
        }
        return reuseLayoutNodeWrapper;
    }
}
