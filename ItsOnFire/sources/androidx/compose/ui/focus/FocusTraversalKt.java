package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.node.ModifiedFocusNode;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u0003H\u0000\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0003H\u0000\u001a+\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"invalidFocusDirection", "", "findActiveFocusNode", "Landroidx/compose/ui/node/ModifiedFocusNode;", "findActiveParent", "focusSearch", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "focusSearch--OM-vw8", "(Landroidx/compose/ui/node/ModifiedFocusNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/node/ModifiedFocusNode;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class FocusTraversalKt {
    @NotNull
    private static final String invalidFocusDirection = "Invalid FocusDirection";

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Rtl.ordinal()] = 1;
            iArr[LayoutDirection.Ltr.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            iArr2[FocusStateImpl.Active.ordinal()] = 1;
            iArr2[FocusStateImpl.Captured.ordinal()] = 2;
            iArr2[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr2[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr2[FocusStateImpl.Inactive.ordinal()] = 5;
            iArr2[FocusStateImpl.Deactivated.ordinal()] = 6;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Nullable
    public static final ModifiedFocusNode findActiveFocusNode(@NotNull ModifiedFocusNode modifiedFocusNode) {
        Intrinsics.checkNotNullParameter(modifiedFocusNode, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[modifiedFocusNode.getFocusState().ordinal()]) {
            case 1:
            case 2:
                return modifiedFocusNode;
            case 3:
            case 4:
                ModifiedFocusNode focusedChild = modifiedFocusNode.getFocusedChild();
                if (focusedChild != null) {
                    return findActiveFocusNode(focusedChild);
                }
                break;
            case 5:
            case 6:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    @Nullable
    public static final ModifiedFocusNode findActiveParent(@NotNull ModifiedFocusNode modifiedFocusNode) {
        Intrinsics.checkNotNullParameter(modifiedFocusNode, "<this>");
        ModifiedFocusNode findParentFocusNode$ui_release = modifiedFocusNode.findParentFocusNode$ui_release();
        if (findParentFocusNode$ui_release == null) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$1[modifiedFocusNode.getFocusState().ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                return findActiveParent(findParentFocusNode$ui_release);
            case 3:
                return modifiedFocusNode;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Nullable
    /* renamed from: focusSearch--OM-vw8  reason: not valid java name */
    public static final ModifiedFocusNode m1120focusSearchOMvw8(@NotNull ModifiedFocusNode focusSearch, int i2, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(focusSearch, "$this$focusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m1104equalsimpl0(i2, companion.m1113getNextdhqQ8s()) ? true : FocusDirection.m1104equalsimpl0(i2, companion.m1115getPreviousdhqQ8s())) {
            return OneDimensionalFocusSearchKt.m1121oneDimensionalFocusSearchMxy_nc0(focusSearch, i2);
        }
        if (!(FocusDirection.m1104equalsimpl0(i2, companion.m1112getLeftdhqQ8s()) ? true : FocusDirection.m1104equalsimpl0(i2, companion.m1116getRightdhqQ8s()) ? true : FocusDirection.m1104equalsimpl0(i2, companion.m1117getUpdhqQ8s()) ? true : FocusDirection.m1104equalsimpl0(i2, companion.m1110getDowndhqQ8s()))) {
            if (!FocusDirection.m1104equalsimpl0(i2, companion.m1111getIndhqQ8s())) {
                if (FocusDirection.m1104equalsimpl0(i2, companion.m1114getOutdhqQ8s())) {
                    ModifiedFocusNode findActiveFocusNode = findActiveFocusNode(focusSearch);
                    ModifiedFocusNode findActiveParent = findActiveFocusNode == null ? null : findActiveParent(findActiveFocusNode);
                    if (Intrinsics.areEqual(findActiveParent, focusSearch)) {
                        return null;
                    }
                    return findActiveParent;
                }
                throw new IllegalStateException(invalidFocusDirection.toString());
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                i2 = companion.m1112getLeftdhqQ8s();
            } else if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                i2 = companion.m1116getRightdhqQ8s();
            }
            focusSearch = findActiveFocusNode(focusSearch);
            if (focusSearch == null) {
                return null;
            }
        }
        return TwoDimensionalFocusSearchKt.m1126twoDimensionalFocusSearchMxy_nc0(focusSearch, i2);
    }
}
