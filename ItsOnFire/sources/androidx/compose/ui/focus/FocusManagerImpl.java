package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.node.ModifiedFocusNode;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0006\u0010\u0013\u001a\u00020\u0010J\u001d\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/focus/FocusManagerImpl;", "Landroidx/compose/ui/focus/FocusManager;", "focusModifier", "Landroidx/compose/ui/focus/FocusModifier;", "(Landroidx/compose/ui/focus/FocusModifier;)V", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "clearFocus", "", "force", "", "fetchUpdatedFocusProperties", "moveFocus", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "moveFocus-3ESFkO8", "(I)Z", "releaseFocus", "takeFocus", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class FocusManagerImpl implements FocusManager {
    @NotNull
    private final FocusModifier focusModifier;
    public LayoutDirection layoutDirection;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            iArr[FocusStateImpl.Captured.ordinal()] = 3;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 4;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FocusManagerImpl() {
        this(null, 1, null);
    }

    public FocusManagerImpl(@NotNull FocusModifier focusModifier) {
        Intrinsics.checkNotNullParameter(focusModifier, "focusModifier");
        this.focusModifier = focusModifier;
    }

    public /* synthetic */ FocusManagerImpl(FocusModifier focusModifier, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new FocusModifier(FocusStateImpl.Inactive, null, 2, null) : focusModifier);
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public void clearFocus(boolean z) {
        FocusStateImpl focusStateImpl;
        FocusStateImpl focusState = this.focusModifier.getFocusState();
        if (FocusTransactionsKt.clearFocus(this.focusModifier.getFocusNode(), z)) {
            FocusModifier focusModifier = this.focusModifier;
            switch (WhenMappings.$EnumSwitchMapping$0[focusState.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    focusStateImpl = FocusStateImpl.Active;
                    break;
                case 4:
                case 5:
                    focusStateImpl = FocusStateImpl.Deactivated;
                    break;
                case 6:
                    focusStateImpl = FocusStateImpl.Inactive;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            focusModifier.setFocusState(focusStateImpl);
        }
    }

    public final void fetchUpdatedFocusProperties() {
        FocusManagerKt.access$updateProperties(this.focusModifier.getFocusNode());
    }

    @NotNull
    public final LayoutDirection getLayoutDirection() {
        LayoutDirection layoutDirection = this.layoutDirection;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
        return null;
    }

    @NotNull
    public final Modifier getModifier() {
        return FocusModifierKt.focusTarget(Modifier.Companion, this.focusModifier);
    }

    @Override // androidx.compose.ui.focus.FocusManager
    /* renamed from: moveFocus-3ESFkO8 */
    public boolean mo1118moveFocus3ESFkO8(int i2) {
        ModifiedFocusNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.focusModifier.getFocusNode());
        if (findActiveFocusNode == null) {
            return false;
        }
        FocusRequester m1119customFocusSearchOMvw8 = FocusOrderModifierKt.m1119customFocusSearchOMvw8(findActiveFocusNode, i2, getLayoutDirection());
        if (!Intrinsics.areEqual(m1119customFocusSearchOMvw8, FocusRequester.Companion.getDefault())) {
            m1119customFocusSearchOMvw8.requestFocus();
            return true;
        }
        ModifiedFocusNode m1120focusSearchOMvw8 = FocusTraversalKt.m1120focusSearchOMvw8(this.focusModifier.getFocusNode(), i2, getLayoutDirection());
        if (Intrinsics.areEqual(m1120focusSearchOMvw8, findActiveFocusNode)) {
            return false;
        }
        if (m1120focusSearchOMvw8 != null) {
            if (m1120focusSearchOMvw8.findParentFocusNode$ui_release() != null) {
                FocusTransactionsKt.requestFocus(m1120focusSearchOMvw8);
                return true;
            }
            throw new IllegalStateException("Move focus landed at the root.".toString());
        } else if (!this.focusModifier.getFocusState().getHasFocus() || this.focusModifier.getFocusState().isFocused()) {
            return false;
        } else {
            FocusDirection.Companion companion = FocusDirection.Companion;
            if (FocusDirection.m1104equalsimpl0(i2, companion.m1113getNextdhqQ8s()) ? true : FocusDirection.m1104equalsimpl0(i2, companion.m1115getPreviousdhqQ8s())) {
                clearFocus(false);
                if (this.focusModifier.getFocusState().isFocused()) {
                    return mo1118moveFocus3ESFkO8(i2);
                }
                return false;
            }
            return false;
        }
    }

    public final void releaseFocus() {
        FocusTransactionsKt.clearFocus(this.focusModifier.getFocusNode(), true);
    }

    public final void setLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    public final void takeFocus() {
        if (this.focusModifier.getFocusState() == FocusStateImpl.Inactive) {
            this.focusModifier.setFocusState(FocusStateImpl.Active);
        }
    }
}
