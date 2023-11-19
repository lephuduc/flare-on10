package androidx.compose.ui.input.key;

import androidx.appcompat.R;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.node.ModifiedFocusNode;
import androidx.compose.ui.node.ModifiedKeyInputNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B4\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001b\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputModifier;", "Landroidx/compose/ui/Modifier$Element;", "onKeyEvent", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "onPreviewKeyEvent", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "keyInputNode", "Landroidx/compose/ui/node/ModifiedKeyInputNode;", "getKeyInputNode", "()Landroidx/compose/ui/node/ModifiedKeyInputNode;", "setKeyInputNode", "(Landroidx/compose/ui/node/ModifiedKeyInputNode;)V", "getOnKeyEvent", "()Lkotlin/jvm/functions/Function1;", "getOnPreviewKeyEvent", "processKeyInput", "keyEvent", "processKeyInput-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class KeyInputModifier implements Modifier.Element {
    public ModifiedKeyInputNode keyInputNode;
    @Nullable
    private final Function1<KeyEvent, Boolean> onKeyEvent;
    @Nullable
    private final Function1<KeyEvent, Boolean> onPreviewKeyEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputModifier(@Nullable Function1<? super KeyEvent, Boolean> function1, @Nullable Function1<? super KeyEvent, Boolean> function12) {
        this.onKeyEvent = function1;
        this.onPreviewKeyEvent = function12;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return Modifier.Element.DefaultImpls.all(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
        return Modifier.Element.DefaultImpls.any(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldIn(R r2, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
        return (R) Modifier.Element.DefaultImpls.foldIn(this, r2, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public <R> R foldOut(R r2, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
        return (R) Modifier.Element.DefaultImpls.foldOut(this, r2, function2);
    }

    @NotNull
    public final ModifiedKeyInputNode getKeyInputNode() {
        ModifiedKeyInputNode modifiedKeyInputNode = this.keyInputNode;
        if (modifiedKeyInputNode != null) {
            return modifiedKeyInputNode;
        }
        Intrinsics.throwUninitializedPropertyAccessException("keyInputNode");
        return null;
    }

    @Nullable
    public final Function1<KeyEvent, Boolean> getOnKeyEvent() {
        return this.onKeyEvent;
    }

    @Nullable
    public final Function1<KeyEvent, Boolean> getOnPreviewKeyEvent() {
        return this.onPreviewKeyEvent;
    }

    /* renamed from: processKeyInput-ZmokQxo  reason: not valid java name */
    public final boolean m2554processKeyInputZmokQxo(@NotNull android.view.KeyEvent keyEvent) {
        ModifiedFocusNode findActiveFocusNode;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        ModifiedFocusNode findPreviousFocusWrapper = getKeyInputNode().findPreviousFocusWrapper();
        ModifiedKeyInputNode modifiedKeyInputNode = null;
        if (findPreviousFocusWrapper != null && (findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(findPreviousFocusWrapper)) != null) {
            modifiedKeyInputNode = findActiveFocusNode.findLastKeyInputWrapper();
        }
        if (modifiedKeyInputNode != null) {
            if (modifiedKeyInputNode.m2889propagatePreviewKeyEventZmokQxo(keyEvent)) {
                return true;
            }
            return modifiedKeyInputNode.m2888propagateKeyEventZmokQxo(keyEvent);
        }
        throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.".toString());
    }

    public final void setKeyInputNode(@NotNull ModifiedKeyInputNode modifiedKeyInputNode) {
        Intrinsics.checkNotNullParameter(modifiedKeyInputNode, "<set-?>");
        this.keyInputNode = modifiedKeyInputNode;
    }

    @Override // androidx.compose.ui.Modifier
    @NotNull
    public Modifier then(@NotNull Modifier modifier) {
        return Modifier.Element.DefaultImpls.then(this, modifier);
    }
}
