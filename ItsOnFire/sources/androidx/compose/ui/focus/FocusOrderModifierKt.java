package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.ModifiedFocusNode;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\t\u001a\u00020\n*\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f\u001a\u0012\u0010\t\u001a\u00020\n*\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0001\u001a+\u0010\t\u001a\u00020\n*\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"customFocusSearch", "Landroidx/compose/ui/focus/FocusRequester;", "Landroidx/compose/ui/node/ModifiedFocusNode;", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "customFocusSearch--OM-vw8", "(Landroidx/compose/ui/node/ModifiedFocusNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "focusOrder", "Landroidx/compose/ui/Modifier;", "focusOrderReceiver", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusOrder;", "", "Lkotlin/ExtensionFunctionType;", "focusRequester", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class FocusOrderModifierKt {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    /* renamed from: customFocusSearch--OM-vw8  reason: not valid java name */
    public static final FocusRequester m1119customFocusSearchOMvw8(@NotNull ModifiedFocusNode customFocusSearch, int i2, @NotNull LayoutDirection layoutDirection) {
        FocusRequester end;
        FocusRequester start;
        Intrinsics.checkNotNullParameter(customFocusSearch, "$this$customFocusSearch");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        FocusOrder focusOrder = new FocusOrder();
        LayoutNodeWrapper wrappedBy$ui_release = customFocusSearch.getWrappedBy$ui_release();
        if (wrappedBy$ui_release != null) {
            wrappedBy$ui_release.populateFocusOrder(focusOrder);
        }
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m1104equalsimpl0(i2, companion.m1113getNextdhqQ8s())) {
            return focusOrder.getNext();
        }
        if (FocusDirection.m1104equalsimpl0(i2, companion.m1115getPreviousdhqQ8s())) {
            return focusOrder.getPrevious();
        }
        if (FocusDirection.m1104equalsimpl0(i2, companion.m1117getUpdhqQ8s())) {
            return focusOrder.getUp();
        }
        if (FocusDirection.m1104equalsimpl0(i2, companion.m1110getDowndhqQ8s())) {
            return focusOrder.getDown();
        }
        if (FocusDirection.m1104equalsimpl0(i2, companion.m1112getLeftdhqQ8s())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                start = focusOrder.getStart();
            } else if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                start = focusOrder.getEnd();
            }
            if (Intrinsics.areEqual(start, FocusRequester.Companion.getDefault())) {
                start = null;
            }
            return start == null ? focusOrder.getLeft() : start;
        } else if (!FocusDirection.m1104equalsimpl0(i2, companion.m1116getRightdhqQ8s())) {
            if (FocusDirection.m1104equalsimpl0(i2, companion.m1111getIndhqQ8s()) || FocusDirection.m1104equalsimpl0(i2, companion.m1114getOutdhqQ8s())) {
                return FocusRequester.Companion.getDefault();
            }
            throw new IllegalStateException("invalid FocusDirection".toString());
        } else {
            int i4 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i4 == 1) {
                end = focusOrder.getEnd();
            } else if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                end = focusOrder.getStart();
            }
            if (Intrinsics.areEqual(end, FocusRequester.Companion.getDefault())) {
                end = null;
            }
            return end == null ? focusOrder.getRight() : end;
        }
    }

    @NotNull
    public static final Modifier focusOrder(@NotNull Modifier modifier, @NotNull FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        return FocusRequesterModifierKt.focusRequester(modifier, focusRequester);
    }

    @NotNull
    public static final Modifier focusOrder(@NotNull Modifier modifier, @NotNull FocusRequester focusRequester, @NotNull Function1<? super FocusOrder, Unit> focusOrderReceiver) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        Intrinsics.checkNotNullParameter(focusOrderReceiver, "focusOrderReceiver");
        return focusOrder(FocusRequesterModifierKt.focusRequester(modifier, focusRequester), focusOrderReceiver);
    }

    @NotNull
    public static final Modifier focusOrder(@NotNull Modifier modifier, @NotNull Function1<? super FocusOrder, Unit> focusOrderReceiver) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(focusOrderReceiver, "focusOrderReceiver");
        return modifier.then(new FocusOrderModifierImpl(focusOrderReceiver, InspectableValueKt.isDebugInspectorInfoEnabled() ? new FocusOrderModifierKt$focusOrder$$inlined$debugInspectorInfo$1(focusOrderReceiver) : InspectableValueKt.getNoInspectorInfo()));
    }
}
