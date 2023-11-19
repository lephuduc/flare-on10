package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.ui.node.ModifiedFocusNode;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0002H\u0002\u001a\u0016\u0010\u0006\u001a\u00020\u0004*\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\t\u001a\u00020\u0004*\u00020\u0002H\u0000\u001a\f\u0010\n\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0014\u0010\u000b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002\u001a\f\u0010\u000f\u001a\u00020\u0004*\u00020\u0002H\u0002¨\u0006\u0010"}, d2 = {"activateNode", "", "Landroidx/compose/ui/node/ModifiedFocusNode;", "captureFocus", "", "clearChildFocus", "clearFocus", "forcedClear", "deactivateNode", "freeFocus", "grantFocus", "grantFocusToChild", "childNode", "requestFocus", "requestFocusForChild", "requestFocusForOwner", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class FocusTransactionsKt {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.Captured.ordinal()] = 2;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void activateNode(@NotNull ModifiedFocusNode modifiedFocusNode) {
        FocusStateImpl focusStateImpl;
        Intrinsics.checkNotNullParameter(modifiedFocusNode, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode.getFocusState().ordinal()];
        if (i2 == 3) {
            focusStateImpl = FocusStateImpl.Inactive;
        } else if (i2 != 4) {
            return;
        } else {
            focusStateImpl = FocusStateImpl.ActiveParent;
        }
        modifiedFocusNode.setFocusState(focusStateImpl);
    }

    public static final boolean captureFocus(@NotNull ModifiedFocusNode modifiedFocusNode) {
        Intrinsics.checkNotNullParameter(modifiedFocusNode, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode.getFocusState().ordinal()]) {
            case 1:
                modifiedFocusNode.setFocusState(FocusStateImpl.Captured);
                return true;
            case 2:
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final boolean clearChildFocus(ModifiedFocusNode modifiedFocusNode) {
        ModifiedFocusNode focusedChild = modifiedFocusNode.getFocusedChild();
        if (focusedChild != null) {
            if (clearFocus$default(focusedChild, false, 1, null)) {
                modifiedFocusNode.setFocusedChild(null);
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (clearChildFocus(r3) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean clearFocus(@org.jetbrains.annotations.NotNull androidx.compose.ui.node.ModifiedFocusNode r3, boolean r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.compose.ui.focus.FocusStateImpl r0 = r3.getFocusState()
            int[] r1 = androidx.compose.ui.focus.FocusTransactionsKt.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 1
            switch(r0) {
                case 1: goto L36;
                case 2: goto L2e;
                case 3: goto L3b;
                case 4: goto L23;
                case 5: goto L1c;
                case 6: goto L3b;
                default: goto L16;
            }
        L16:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L1c:
            boolean r4 = clearChildFocus(r3)
            if (r4 == 0) goto L2c
            goto L36
        L23:
            boolean r4 = clearChildFocus(r3)
            if (r4 == 0) goto L2c
            androidx.compose.ui.focus.FocusStateImpl r4 = androidx.compose.ui.focus.FocusStateImpl.Deactivated
            goto L38
        L2c:
            r4 = r1
            goto L3c
        L2e:
            if (r4 == 0) goto L3c
            androidx.compose.ui.focus.FocusStateImpl r0 = androidx.compose.ui.focus.FocusStateImpl.Inactive
            r3.setFocusState(r0)
            goto L3c
        L36:
            androidx.compose.ui.focus.FocusStateImpl r4 = androidx.compose.ui.focus.FocusStateImpl.Inactive
        L38:
            r3.setFocusState(r4)
        L3b:
            r4 = r2
        L3c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTransactionsKt.clearFocus(androidx.compose.ui.node.ModifiedFocusNode, boolean):boolean");
    }

    public static /* synthetic */ boolean clearFocus$default(ModifiedFocusNode modifiedFocusNode, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return clearFocus(modifiedFocusNode, z);
    }

    public static final void deactivateNode(@NotNull ModifiedFocusNode modifiedFocusNode) {
        FocusManager focusManager;
        FocusStateImpl focusStateImpl;
        Intrinsics.checkNotNullParameter(modifiedFocusNode, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode.getFocusState().ordinal()];
        if (i2 == 1 || i2 == 2) {
            Owner owner$ui_release = modifiedFocusNode.getLayoutNode$ui_release().getOwner$ui_release();
            if (owner$ui_release != null && (focusManager = owner$ui_release.getFocusManager()) != null) {
                focusManager.clearFocus(true);
            }
        } else if (i2 == 5) {
            focusStateImpl = FocusStateImpl.DeactivatedParent;
            modifiedFocusNode.setFocusState(focusStateImpl);
        } else if (i2 != 6) {
            return;
        }
        focusStateImpl = FocusStateImpl.Deactivated;
        modifiedFocusNode.setFocusState(focusStateImpl);
    }

    public static final boolean freeFocus(@NotNull ModifiedFocusNode modifiedFocusNode) {
        Intrinsics.checkNotNullParameter(modifiedFocusNode, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode.getFocusState().ordinal()]) {
            case 1:
                return true;
            case 2:
                modifiedFocusNode.setFocusState(FocusStateImpl.Active);
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final void grantFocus(ModifiedFocusNode modifiedFocusNode) {
        FocusStateImpl focusStateImpl;
        switch (WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode.getFocusState().ordinal()]) {
            case 1:
            case 5:
            case 6:
                focusStateImpl = FocusStateImpl.Active;
                break;
            case 2:
                focusStateImpl = FocusStateImpl.Captured;
                break;
            case 3:
            case 4:
                throw new IllegalStateException("Granting focus to a deactivated node.".toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        modifiedFocusNode.setFocusState(focusStateImpl);
    }

    private static final boolean grantFocusToChild(ModifiedFocusNode modifiedFocusNode, ModifiedFocusNode modifiedFocusNode2) {
        grantFocus(modifiedFocusNode2);
        modifiedFocusNode.setFocusedChild(modifiedFocusNode2);
        return true;
    }

    public static final void requestFocus(@NotNull ModifiedFocusNode modifiedFocusNode) {
        Intrinsics.checkNotNullParameter(modifiedFocusNode, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode.getFocusState().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                modifiedFocusNode.sendOnFocusEvent(modifiedFocusNode.getFocusState());
                return;
            case 5:
                if (!clearChildFocus(modifiedFocusNode)) {
                    return;
                }
                break;
            case 6:
                ModifiedFocusNode findParentFocusNode$ui_release = modifiedFocusNode.findParentFocusNode$ui_release();
                if (findParentFocusNode$ui_release != null) {
                    requestFocusForChild(findParentFocusNode$ui_release, modifiedFocusNode);
                    return;
                } else if (!requestFocusForOwner(modifiedFocusNode)) {
                    return;
                }
                break;
            default:
                return;
        }
        grantFocus(modifiedFocusNode);
    }

    private static final boolean requestFocusForChild(ModifiedFocusNode modifiedFocusNode, ModifiedFocusNode modifiedFocusNode2) {
        if (modifiedFocusNode.focusableChildren(false).contains(modifiedFocusNode2)) {
            switch (WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode.getFocusState().ordinal()]) {
                case 1:
                    modifiedFocusNode.setFocusState(FocusStateImpl.ActiveParent);
                    break;
                case 2:
                    return false;
                case 3:
                    activateNode(modifiedFocusNode);
                    boolean requestFocusForChild = requestFocusForChild(modifiedFocusNode, modifiedFocusNode2);
                    deactivateNode(modifiedFocusNode);
                    return requestFocusForChild;
                case 4:
                    if (modifiedFocusNode.getFocusedChild() != null && !clearChildFocus(modifiedFocusNode)) {
                        return false;
                    }
                    break;
                case 5:
                    if (!clearChildFocus(modifiedFocusNode)) {
                        return false;
                    }
                    break;
                case 6:
                    ModifiedFocusNode findParentFocusNode$ui_release = modifiedFocusNode.findParentFocusNode$ui_release();
                    if (findParentFocusNode$ui_release == null && requestFocusForOwner(modifiedFocusNode)) {
                        modifiedFocusNode.setFocusState(FocusStateImpl.Active);
                    } else if (findParentFocusNode$ui_release == null || !requestFocusForChild(findParentFocusNode$ui_release, modifiedFocusNode)) {
                        return false;
                    }
                    return requestFocusForChild(modifiedFocusNode, modifiedFocusNode2);
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return grantFocusToChild(modifiedFocusNode, modifiedFocusNode2);
        }
        throw new IllegalStateException("Non child node cannot request focus.".toString());
    }

    private static final boolean requestFocusForOwner(ModifiedFocusNode modifiedFocusNode) {
        Owner owner$ui_release = modifiedFocusNode.getLayoutNode$ui_release().getOwner$ui_release();
        Boolean valueOf = owner$ui_release == null ? null : Boolean.valueOf(owner$ui_release.requestFocus());
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        throw new IllegalStateException("Owner not initialized.".toString());
    }
}
