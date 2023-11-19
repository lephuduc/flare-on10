package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.node.ModifiedFocusNode;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B(\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0019\b\u0002\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\u0010\nJ\u0010\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020 H\u0016R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "initialFocus", "Landroidx/compose/ui/focus/FocusStateImpl;", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/focus/FocusStateImpl;Lkotlin/jvm/functions/Function1;)V", "focusNode", "Landroidx/compose/ui/node/ModifiedFocusNode;", "getFocusNode", "()Landroidx/compose/ui/node/ModifiedFocusNode;", "setFocusNode", "(Landroidx/compose/ui/node/ModifiedFocusNode;)V", "focusState", "getFocusState", "()Landroidx/compose/ui/focus/FocusStateImpl;", "setFocusState", "(Landroidx/compose/ui/focus/FocusStateImpl;)V", "focusedChild", "getFocusedChild", "setFocusedChild", "hasFocusListeners", "", "getHasFocusListeners", "()Z", "setHasFocusListeners", "(Z)V", "modifierLocalReadScope", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "getModifierLocalReadScope", "()Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "setModifierLocalReadScope", "(Landroidx/compose/ui/modifier/ModifierLocalReadScope;)V", "onModifierLocalsUpdated", "scope", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class FocusModifier extends InspectorValueInfo implements ModifierLocalConsumer {
    public ModifiedFocusNode focusNode;
    @NotNull
    private FocusStateImpl focusState;
    @Nullable
    private ModifiedFocusNode focusedChild;
    private boolean hasFocusListeners;
    public ModifierLocalReadScope modifierLocalReadScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusModifier(@NotNull FocusStateImpl initialFocus, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(initialFocus, "initialFocus");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.focusState = initialFocus;
    }

    public /* synthetic */ FocusModifier(FocusStateImpl focusStateImpl, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(focusStateImpl, (i2 & 2) != 0 ? InspectableValueKt.getNoInspectorInfo() : function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return ModifierLocalConsumer.DefaultImpls.all(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return ModifierLocalConsumer.DefaultImpls.any(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldIn(R r2, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
        return (R) ModifierLocalConsumer.DefaultImpls.foldIn(this, r2, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldOut(R r2, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
        return (R) ModifierLocalConsumer.DefaultImpls.foldOut(this, r2, function2);
    }

    @NotNull
    public final ModifiedFocusNode getFocusNode() {
        ModifiedFocusNode modifiedFocusNode = this.focusNode;
        if (modifiedFocusNode != null) {
            return modifiedFocusNode;
        }
        Intrinsics.throwUninitializedPropertyAccessException("focusNode");
        return null;
    }

    @NotNull
    public final FocusStateImpl getFocusState() {
        return this.focusState;
    }

    @Nullable
    public final ModifiedFocusNode getFocusedChild() {
        return this.focusedChild;
    }

    public final boolean getHasFocusListeners() {
        return this.hasFocusListeners;
    }

    @NotNull
    public final ModifierLocalReadScope getModifierLocalReadScope() {
        ModifierLocalReadScope modifierLocalReadScope = this.modifierLocalReadScope;
        if (modifierLocalReadScope != null) {
            return modifierLocalReadScope;
        }
        Intrinsics.throwUninitializedPropertyAccessException("modifierLocalReadScope");
        return null;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        setModifierLocalReadScope(scope);
        setHasFocusListeners(((Boolean) scope.getCurrent(FocusModifierKt.getModifierLocalHasFocusEventListener())).booleanValue());
        FocusPropertiesKt.setUpdatedProperties(getFocusNode(), (FocusProperties) scope.getCurrent(FocusPropertiesKt.getModifierLocalFocusProperties()));
    }

    public final void setFocusNode(@NotNull ModifiedFocusNode modifiedFocusNode) {
        Intrinsics.checkNotNullParameter(modifiedFocusNode, "<set-?>");
        this.focusNode = modifiedFocusNode;
    }

    public final void setFocusState(@NotNull FocusStateImpl focusStateImpl) {
        Intrinsics.checkNotNullParameter(focusStateImpl, "<set-?>");
        this.focusState = focusStateImpl;
    }

    public final void setFocusedChild(@Nullable ModifiedFocusNode modifiedFocusNode) {
        this.focusedChild = modifiedFocusNode;
    }

    public final void setHasFocusListeners(boolean z) {
        this.hasFocusListeners = z;
    }

    public final void setModifierLocalReadScope(@NotNull ModifierLocalReadScope modifierLocalReadScope) {
        Intrinsics.checkNotNullParameter(modifierLocalReadScope, "<set-?>");
        this.modifierLocalReadScope = modifierLocalReadScope;
    }

    @Override // androidx.compose.ui.Modifier
    @NotNull
    public Modifier then(@NotNull Modifier modifier) {
        return ModifierLocalConsumer.DefaultImpls.then(this, modifier);
    }
}
