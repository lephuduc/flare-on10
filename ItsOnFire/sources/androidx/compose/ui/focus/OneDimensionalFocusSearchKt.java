package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.node.ModifiedFocusNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0004H\u0002\u001aE\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\u0006\u0010\t\u001a\u0002H\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00060\u000bH\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010\f\u001aE\u0010\r\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\u0006\u0010\t\u001a\u0002H\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00060\u000bH\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010\f\u001a\u000e\u0010\u000e\u001a\u0004\u0018\u00010\u0004*\u00020\u0004H\u0002\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0004H\u0002\u001a#\u0010\u0011\u001a\u0004\u0018\u00010\u0004*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"InvalidFocusDirection", "", "NoActiveChild", "backwardFocusSearch", "Landroidx/compose/ui/node/ModifiedFocusNode;", "forEachItemAfter", "", "T", "", "item", "action", "Lkotlin/Function1;", "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "forEachItemBefore", "forwardFocusSearch", "isRoot", "", "oneDimensionalFocusSearch", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "oneDimensionalFocusSearch-Mxy_nc0", "(Landroidx/compose/ui/node/ModifiedFocusNode;I)Landroidx/compose/ui/node/ModifiedFocusNode;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class OneDimensionalFocusSearchKt {
    @NotNull
    private static final String InvalidFocusDirection = "This function should only be used for 1-D focus search";
    @NotNull
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 2;
            iArr[FocusStateImpl.Active.ordinal()] = 3;
            iArr[FocusStateImpl.Captured.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final ModifiedFocusNode backwardFocusSearch(ModifiedFocusNode modifiedFocusNode) {
        ModifiedFocusNode backwardFocusSearch;
        ModifiedFocusNode backwardFocusSearch2;
        ModifiedFocusNode backwardFocusSearch3;
        ModifiedFocusNode backwardFocusSearch4;
        Object lastOrNull;
        ModifiedFocusNode backwardFocusSearch5;
        Object lastOrNull2;
        FocusStateImpl focusState = modifiedFocusNode.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        boolean z = false;
        switch (iArr[focusState.ordinal()]) {
            case 1:
                ModifiedFocusNode focusedChild = modifiedFocusNode.getFocusedChild();
                if (focusedChild != null) {
                    switch (iArr[focusedChild.getFocusState().ordinal()]) {
                        case 1:
                            ModifiedFocusNode backwardFocusSearch6 = backwardFocusSearch(focusedChild);
                            return backwardFocusSearch6 == null ? focusedChild : backwardFocusSearch6;
                        case 2:
                            ModifiedFocusNode backwardFocusSearch7 = backwardFocusSearch(focusedChild);
                            if (backwardFocusSearch7 == null) {
                                List<ModifiedFocusNode> focusableChildren = modifiedFocusNode.focusableChildren(false);
                                int size = focusableChildren.size() - 1;
                                if (size >= 0) {
                                    while (true) {
                                        int i2 = size - 1;
                                        if (z && (backwardFocusSearch = backwardFocusSearch(focusableChildren.get(size))) != null) {
                                            return backwardFocusSearch;
                                        }
                                        if (Intrinsics.areEqual(focusableChildren.get(size), focusedChild)) {
                                            z = true;
                                        }
                                        if (i2 >= 0) {
                                            size = i2;
                                        }
                                    }
                                }
                                if (isRoot(modifiedFocusNode)) {
                                    return null;
                                }
                                return modifiedFocusNode;
                            }
                            return backwardFocusSearch7;
                        case 3:
                        case 4:
                            List<ModifiedFocusNode> focusableChildren2 = modifiedFocusNode.focusableChildren(false);
                            int size2 = focusableChildren2.size() - 1;
                            if (size2 >= 0) {
                                while (true) {
                                    int i3 = size2 - 1;
                                    if (z && (backwardFocusSearch2 = backwardFocusSearch(focusableChildren2.get(size2))) != null) {
                                        return backwardFocusSearch2;
                                    }
                                    if (Intrinsics.areEqual(focusableChildren2.get(size2), focusedChild)) {
                                        z = true;
                                    }
                                    if (i3 >= 0) {
                                        size2 = i3;
                                    }
                                }
                            }
                            if (isRoot(modifiedFocusNode)) {
                                return null;
                            }
                            return modifiedFocusNode;
                        case 5:
                        case 6:
                            throw new IllegalStateException(NoActiveChild.toString());
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                throw new IllegalStateException(NoActiveChild.toString());
            case 2:
                ModifiedFocusNode focusedChild2 = modifiedFocusNode.getFocusedChild();
                if (focusedChild2 != null) {
                    switch (iArr[focusedChild2.getFocusState().ordinal()]) {
                        case 1:
                            ModifiedFocusNode backwardFocusSearch8 = backwardFocusSearch(focusedChild2);
                            return backwardFocusSearch8 == null ? focusedChild2 : backwardFocusSearch8;
                        case 2:
                            ModifiedFocusNode backwardFocusSearch9 = backwardFocusSearch(focusedChild2);
                            if (backwardFocusSearch9 == null) {
                                List<ModifiedFocusNode> focusableChildren3 = modifiedFocusNode.focusableChildren(false);
                                int size3 = focusableChildren3.size() - 1;
                                if (size3 >= 0) {
                                    while (true) {
                                        int i4 = size3 - 1;
                                        if (z && (backwardFocusSearch3 = backwardFocusSearch(focusableChildren3.get(size3))) != null) {
                                            return backwardFocusSearch3;
                                        }
                                        if (Intrinsics.areEqual(focusableChildren3.get(size3), focusedChild2)) {
                                            z = true;
                                        }
                                        if (i4 >= 0) {
                                            size3 = i4;
                                        }
                                    }
                                }
                                return null;
                            }
                            return backwardFocusSearch9;
                        case 3:
                        case 4:
                            List<ModifiedFocusNode> focusableChildren4 = modifiedFocusNode.focusableChildren(false);
                            int size4 = focusableChildren4.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i5 = size4 - 1;
                                    if (z && (backwardFocusSearch4 = backwardFocusSearch(focusableChildren4.get(size4))) != null) {
                                        return backwardFocusSearch4;
                                    }
                                    if (Intrinsics.areEqual(focusableChildren4.get(size4), focusedChild2)) {
                                        z = true;
                                    }
                                    if (i5 >= 0) {
                                        size4 = i5;
                                    }
                                }
                            }
                            return null;
                        case 5:
                        case 6:
                            throw new IllegalStateException(NoActiveChild.toString());
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                throw new IllegalStateException(NoActiveChild.toString());
            case 3:
            case 4:
            case 6:
                lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) modifiedFocusNode.focusableChildren(true));
                ModifiedFocusNode modifiedFocusNode2 = (ModifiedFocusNode) lastOrNull;
                return (modifiedFocusNode2 == null || (backwardFocusSearch5 = backwardFocusSearch(modifiedFocusNode2)) == null) ? modifiedFocusNode : backwardFocusSearch5;
            case 5:
                lastOrNull2 = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) modifiedFocusNode.focusableChildren(true));
                ModifiedFocusNode modifiedFocusNode3 = (ModifiedFocusNode) lastOrNull2;
                if (modifiedFocusNode3 == null) {
                    return null;
                }
                return backwardFocusSearch(modifiedFocusNode3);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final <T> void forEachItemAfter(List<? extends T> list, T t2, Function1<? super T, Unit> function1) {
        int size = list.size();
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (z) {
                function1.invoke((T) list.get(i2));
            }
            if (Intrinsics.areEqual(list.get(i2), t2)) {
                z = true;
            }
            i2 = i3;
        }
    }

    private static final <T> void forEachItemBefore(List<? extends T> list, T t2, Function1<? super T, Unit> function1) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        boolean z = false;
        while (true) {
            int i2 = size - 1;
            if (z) {
                function1.invoke((T) list.get(size));
            }
            if (Intrinsics.areEqual(list.get(size), t2)) {
                z = true;
            }
            if (i2 < 0) {
                return;
            }
            size = i2;
        }
    }

    private static final ModifiedFocusNode forwardFocusSearch(ModifiedFocusNode modifiedFocusNode) {
        ModifiedFocusNode forwardFocusSearch;
        int i2 = 0;
        switch (WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode.getFocusState().ordinal()]) {
            case 1:
            case 2:
                ModifiedFocusNode focusedChild = modifiedFocusNode.getFocusedChild();
                if (focusedChild != null) {
                    ModifiedFocusNode forwardFocusSearch2 = forwardFocusSearch(focusedChild);
                    if (forwardFocusSearch2 == null) {
                        List<ModifiedFocusNode> focusableChildren = modifiedFocusNode.focusableChildren(false);
                        int size = focusableChildren.size();
                        boolean z = false;
                        while (i2 < size) {
                            int i3 = i2 + 1;
                            if (z && (forwardFocusSearch = forwardFocusSearch(focusableChildren.get(i2))) != null) {
                                return forwardFocusSearch;
                            }
                            if (Intrinsics.areEqual(focusableChildren.get(i2), focusedChild)) {
                                z = true;
                            }
                            i2 = i3;
                        }
                        return null;
                    }
                    return forwardFocusSearch2;
                }
                throw new IllegalStateException(NoActiveChild.toString());
            case 3:
            case 4:
            case 5:
                List<ModifiedFocusNode> focusableChildren2 = modifiedFocusNode.focusableChildren(false);
                int size2 = focusableChildren2.size();
                while (i2 < size2) {
                    int i4 = i2 + 1;
                    ModifiedFocusNode forwardFocusSearch3 = forwardFocusSearch(focusableChildren2.get(i2));
                    if (forwardFocusSearch3 != null) {
                        return forwardFocusSearch3;
                    }
                    i2 = i4;
                }
                return null;
            case 6:
                return modifiedFocusNode;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final boolean isRoot(ModifiedFocusNode modifiedFocusNode) {
        return modifiedFocusNode.findParentFocusNode$ui_release() == null;
    }

    @Nullable
    /* renamed from: oneDimensionalFocusSearch-Mxy_nc0  reason: not valid java name */
    public static final ModifiedFocusNode m1121oneDimensionalFocusSearchMxy_nc0(@NotNull ModifiedFocusNode oneDimensionalFocusSearch, int i2) {
        Intrinsics.checkNotNullParameter(oneDimensionalFocusSearch, "$this$oneDimensionalFocusSearch");
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m1104equalsimpl0(i2, companion.m1113getNextdhqQ8s())) {
            return forwardFocusSearch(oneDimensionalFocusSearch);
        }
        if (FocusDirection.m1104equalsimpl0(i2, companion.m1115getPreviousdhqQ8s())) {
            return backwardFocusSearch(oneDimensionalFocusSearch);
        }
        throw new IllegalStateException(InvalidFocusDirection.toString());
    }
}
