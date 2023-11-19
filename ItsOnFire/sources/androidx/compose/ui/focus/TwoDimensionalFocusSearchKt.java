package androidx.compose.ui.focus;

import androidx.appcompat.R;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.ModifiedFocusNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\u001a5\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\f\u001a\f\u0010\u0012\u001a\u00020\u0006*\u00020\u0006H\u0002\u001a1\u0010\u0013\u001a\u0004\u0018\u00010\u0014*\b\u0012\u0004\u0012\u00020\u00140\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\f\u0010\u0019\u001a\u00020\u0006*\u00020\u0006H\u0002\u001a#\u0010\u001a\u001a\u0004\u0018\u00010\u0014*\u00020\u00142\u0006\u0010\t\u001a\u00020\nH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"InvalidFocusDirection", "", "NoActiveChild", "beamBeats", "", "source", "Landroidx/compose/ui/geometry/Rect;", "rect1", "rect2", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "beamBeats-I7lrPNg", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;I)Z", "isBetterCandidate", "proposedCandidate", "currentCandidate", "focusedRect", "isBetterCandidate-I7lrPNg", "bottomRight", "findBestCandidate", "Landroidx/compose/ui/node/ModifiedFocusNode;", "", "focusRect", "findBestCandidate-4WY_MpI", "(Ljava/util/List;Landroidx/compose/ui/geometry/Rect;I)Landroidx/compose/ui/node/ModifiedFocusNode;", "topLeft", "twoDimensionalFocusSearch", "twoDimensionalFocusSearch-Mxy_nc0", "(Landroidx/compose/ui/node/ModifiedFocusNode;I)Landroidx/compose/ui/node/ModifiedFocusNode;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TwoDimensionalFocusSearchKt {
    @NotNull
    private static final String InvalidFocusDirection = "This function should only be used for 2-D focus search";
    @NotNull
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Inactive.ordinal()] = 1;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 2;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Active.ordinal()] = 5;
            iArr[FocusStateImpl.Captured.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: beamBeats-I7lrPNg  reason: not valid java name */
    private static final boolean m1122beamBeatsI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i2) {
        if (beamBeats_I7lrPNg$inSourceBeam(rect3, i2, rect) || !beamBeats_I7lrPNg$inSourceBeam(rect2, i2, rect)) {
            return false;
        }
        if (beamBeats_I7lrPNg$isInDirectionOfSearch(rect3, i2, rect)) {
            FocusDirection.Companion companion = FocusDirection.Companion;
            if (!FocusDirection.m1104equalsimpl0(i2, companion.m1112getLeftdhqQ8s()) && !FocusDirection.m1104equalsimpl0(i2, companion.m1116getRightdhqQ8s()) && m1123beamBeats_I7lrPNg$majorAxisDistance2(rect2, i2, rect) >= beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect3, i2, rect)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean beamBeats_I7lrPNg$inSourceBeam(Rect rect, int i2, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (!(FocusDirection.m1104equalsimpl0(i2, companion.m1112getLeftdhqQ8s()) ? true : FocusDirection.m1104equalsimpl0(i2, companion.m1116getRightdhqQ8s()))) {
            if (!(FocusDirection.m1104equalsimpl0(i2, companion.m1117getUpdhqQ8s()) ? true : FocusDirection.m1104equalsimpl0(i2, companion.m1110getDowndhqQ8s()))) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            if (rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight()) {
                return true;
            }
        } else if (rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom()) {
            return true;
        }
        return false;
    }

    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(Rect rect, int i2, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m1104equalsimpl0(i2, companion.m1112getLeftdhqQ8s())) {
            if (rect2.getLeft() >= rect.getRight()) {
                return true;
            }
        } else if (FocusDirection.m1104equalsimpl0(i2, companion.m1116getRightdhqQ8s())) {
            if (rect2.getRight() <= rect.getLeft()) {
                return true;
            }
        } else if (FocusDirection.m1104equalsimpl0(i2, companion.m1117getUpdhqQ8s())) {
            if (rect2.getTop() >= rect.getBottom()) {
                return true;
            }
        } else if (!FocusDirection.m1104equalsimpl0(i2, companion.m1110getDowndhqQ8s())) {
            throw new IllegalStateException(InvalidFocusDirection.toString());
        } else {
            if (rect2.getBottom() <= rect.getTop()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: beamBeats_I7lrPNg$majorAxisDistance-2  reason: not valid java name */
    private static final float m1123beamBeats_I7lrPNg$majorAxisDistance2(Rect rect, int i2, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f2;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (!FocusDirection.m1104equalsimpl0(i2, companion.m1112getLeftdhqQ8s())) {
            if (FocusDirection.m1104equalsimpl0(i2, companion.m1116getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m1104equalsimpl0(i2, companion.m1117getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else if (!FocusDirection.m1104equalsimpl0(i2, companion.m1110getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            } else {
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f2 = top - bottom;
            return Math.max(0.0f, f2);
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f2 = top2 - bottom2;
        return Math.max(0.0f, f2);
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(Rect rect, int i2, Rect rect2) {
        float bottom;
        float bottom2;
        float top;
        float top2;
        float f2;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (!FocusDirection.m1104equalsimpl0(i2, companion.m1112getLeftdhqQ8s())) {
            if (FocusDirection.m1104equalsimpl0(i2, companion.m1116getRightdhqQ8s())) {
                bottom = rect.getRight();
                bottom2 = rect2.getRight();
            } else if (FocusDirection.m1104equalsimpl0(i2, companion.m1117getUpdhqQ8s())) {
                top = rect2.getTop();
                top2 = rect.getTop();
            } else if (!FocusDirection.m1104equalsimpl0(i2, companion.m1110getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            } else {
                bottom = rect.getBottom();
                bottom2 = rect2.getBottom();
            }
            f2 = bottom - bottom2;
            return Math.max(1.0f, f2);
        }
        top = rect2.getLeft();
        top2 = rect.getLeft();
        f2 = top - top2;
        return Math.max(1.0f, f2);
    }

    private static final Rect bottomRight(Rect rect) {
        return new Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* renamed from: findBestCandidate-4WY_MpI  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final androidx.compose.ui.node.ModifiedFocusNode m1124findBestCandidate4WY_MpI(java.util.List<androidx.compose.ui.node.ModifiedFocusNode> r7, androidx.compose.ui.geometry.Rect r8, int r9) {
        /*
            androidx.compose.ui.focus.FocusDirection$Companion r0 = androidx.compose.ui.focus.FocusDirection.Companion
            int r1 = r0.m1112getLeftdhqQ8s()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.m1104equalsimpl0(r9, r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            float r0 = r8.getWidth()
            float r1 = (float) r3
            float r0 = r0 + r1
        L14:
            androidx.compose.ui.geometry.Rect r0 = r8.translate(r0, r2)
            goto L52
        L19:
            int r1 = r0.m1116getRightdhqQ8s()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.m1104equalsimpl0(r9, r1)
            if (r1 == 0) goto L2b
            float r0 = r8.getWidth()
            float r1 = (float) r3
            float r0 = r0 + r1
            float r0 = -r0
            goto L14
        L2b:
            int r1 = r0.m1117getUpdhqQ8s()
            boolean r1 = androidx.compose.ui.focus.FocusDirection.m1104equalsimpl0(r9, r1)
            if (r1 == 0) goto L40
            float r0 = r8.getHeight()
            float r1 = (float) r3
            float r0 = r0 + r1
        L3b:
            androidx.compose.ui.geometry.Rect r0 = r8.translate(r2, r0)
            goto L52
        L40:
            int r0 = r0.m1110getDowndhqQ8s()
            boolean r0 = androidx.compose.ui.focus.FocusDirection.m1104equalsimpl0(r9, r0)
            if (r0 == 0) goto L71
            float r0 = r8.getHeight()
            float r1 = (float) r3
            float r0 = r0 + r1
            float r0 = -r0
            goto L3b
        L52:
            r1 = 0
            r2 = 0
            int r3 = r7.size()
        L58:
            if (r2 >= r3) goto L70
            int r4 = r2 + 1
            java.lang.Object r2 = r7.get(r2)
            androidx.compose.ui.node.ModifiedFocusNode r2 = (androidx.compose.ui.node.ModifiedFocusNode) r2
            androidx.compose.ui.geometry.Rect r5 = r2.focusRect()
            boolean r6 = m1125isBetterCandidateI7lrPNg(r5, r0, r8, r9)
            if (r6 == 0) goto L6e
            r1 = r2
            r0 = r5
        L6e:
            r2 = r4
            goto L58
        L70:
            return r1
        L71:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "This function should only be used for 2-D focus search"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt.m1124findBestCandidate4WY_MpI(java.util.List, androidx.compose.ui.geometry.Rect, int):androidx.compose.ui.node.ModifiedFocusNode");
    }

    /* renamed from: isBetterCandidate-I7lrPNg  reason: not valid java name */
    private static final boolean m1125isBetterCandidateI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i2) {
        if (isBetterCandidate_I7lrPNg$isCandidate(rect, i2, rect3)) {
            if (!isBetterCandidate_I7lrPNg$isCandidate(rect2, i2, rect3) || m1122beamBeatsI7lrPNg(rect3, rect, rect2, i2)) {
                return true;
            }
            if (!m1122beamBeatsI7lrPNg(rect3, rect2, rect, i2) && isBetterCandidate_I7lrPNg$weightedDistance(i2, rect3, rect) < isBetterCandidate_I7lrPNg$weightedDistance(i2, rect3, rect2)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(Rect rect, int i2, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m1104equalsimpl0(i2, companion.m1112getLeftdhqQ8s())) {
            if ((rect2.getRight() > rect.getRight() || rect2.getLeft() >= rect.getRight()) && rect2.getLeft() > rect.getLeft()) {
                return true;
            }
        } else if (FocusDirection.m1104equalsimpl0(i2, companion.m1116getRightdhqQ8s())) {
            if ((rect2.getLeft() < rect.getLeft() || rect2.getRight() <= rect.getLeft()) && rect2.getRight() < rect.getRight()) {
                return true;
            }
        } else if (FocusDirection.m1104equalsimpl0(i2, companion.m1117getUpdhqQ8s())) {
            if ((rect2.getBottom() > rect.getBottom() || rect2.getTop() >= rect.getBottom()) && rect2.getTop() > rect.getTop()) {
                return true;
            }
        } else if (!FocusDirection.m1104equalsimpl0(i2, companion.m1110getDowndhqQ8s())) {
            throw new IllegalStateException(InvalidFocusDirection.toString());
        } else {
            if ((rect2.getTop() < rect.getTop() || rect2.getBottom() <= rect.getTop()) && rect2.getBottom() < rect.getBottom()) {
                return true;
            }
        }
        return false;
    }

    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(Rect rect, int i2, Rect rect2) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f2;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (!FocusDirection.m1104equalsimpl0(i2, companion.m1112getLeftdhqQ8s())) {
            if (FocusDirection.m1104equalsimpl0(i2, companion.m1116getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m1104equalsimpl0(i2, companion.m1117getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else if (!FocusDirection.m1104equalsimpl0(i2, companion.m1110getDowndhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            } else {
                top = rect.getTop();
                bottom = rect2.getBottom();
            }
            f2 = top - bottom;
            return Math.max(0.0f, f2);
        }
        top2 = rect2.getLeft();
        bottom2 = rect.getRight();
        f2 = top2 - bottom2;
        return Math.max(0.0f, f2);
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect rect, int i2, Rect rect2) {
        float f2;
        float left;
        float left2;
        float width;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m1104equalsimpl0(i2, companion.m1112getLeftdhqQ8s()) ? true : FocusDirection.m1104equalsimpl0(i2, companion.m1116getRightdhqQ8s())) {
            f2 = 2;
            left = rect2.getTop() + (rect2.getHeight() / f2);
            left2 = rect.getTop();
            width = rect.getHeight();
        } else {
            if (!(FocusDirection.m1104equalsimpl0(i2, companion.m1117getUpdhqQ8s()) ? true : FocusDirection.m1104equalsimpl0(i2, companion.m1110getDowndhqQ8s()))) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            f2 = 2;
            left = rect2.getLeft() + (rect2.getWidth() / f2);
            left2 = rect.getLeft();
            width = rect.getWidth();
        }
        return left - (left2 + (width / f2));
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int i2, Rect rect, Rect rect2) {
        long abs = Math.abs(isBetterCandidate_I7lrPNg$majorAxisDistance(rect2, i2, rect));
        long abs2 = Math.abs(isBetterCandidate_I7lrPNg$minorAxisDistance(rect2, i2, rect));
        return (13 * abs * abs) + (abs2 * abs2);
    }

    private static final Rect topLeft(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    @Nullable
    /* renamed from: twoDimensionalFocusSearch-Mxy_nc0  reason: not valid java name */
    public static final ModifiedFocusNode m1126twoDimensionalFocusSearchMxy_nc0(@NotNull ModifiedFocusNode twoDimensionalFocusSearch, int i2) {
        ModifiedFocusNode m1126twoDimensionalFocusSearchMxy_nc0;
        Rect bottomRight;
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(twoDimensionalFocusSearch, "$this$twoDimensionalFocusSearch");
        switch (WhenMappings.$EnumSwitchMapping$0[twoDimensionalFocusSearch.getFocusState().ordinal()]) {
            case 1:
                return twoDimensionalFocusSearch;
            case 2:
                return null;
            case 3:
            case 4:
                ModifiedFocusNode focusedChild = twoDimensionalFocusSearch.getFocusedChild();
                if (focusedChild != null) {
                    if (focusedChild.getFocusState() != FocusStateImpl.ActiveParent || (m1126twoDimensionalFocusSearchMxy_nc0 = m1126twoDimensionalFocusSearchMxy_nc0(focusedChild, i2)) == null) {
                        ModifiedFocusNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(twoDimensionalFocusSearch);
                        Rect focusRect = findActiveFocusNode != null ? findActiveFocusNode.focusRect() : null;
                        if (focusRect != null) {
                            return m1124findBestCandidate4WY_MpI(twoDimensionalFocusSearch.focusableChildren(true), focusRect, i2);
                        }
                        throw new IllegalStateException(NoActiveChild.toString());
                    }
                    return m1126twoDimensionalFocusSearchMxy_nc0;
                }
                throw new IllegalStateException(NoActiveChild.toString());
            case 5:
            case 6:
                List<ModifiedFocusNode> focusableChildren = twoDimensionalFocusSearch.focusableChildren(true);
                if (focusableChildren.size() <= 1) {
                    firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) focusableChildren);
                    return (ModifiedFocusNode) firstOrNull;
                }
                FocusDirection.Companion companion = FocusDirection.Companion;
                if (FocusDirection.m1104equalsimpl0(i2, companion.m1116getRightdhqQ8s()) ? true : FocusDirection.m1104equalsimpl0(i2, companion.m1110getDowndhqQ8s())) {
                    bottomRight = topLeft(twoDimensionalFocusSearch.focusRect());
                } else {
                    if (!(FocusDirection.m1104equalsimpl0(i2, companion.m1112getLeftdhqQ8s()) ? true : FocusDirection.m1104equalsimpl0(i2, companion.m1117getUpdhqQ8s()))) {
                        throw new IllegalStateException(InvalidFocusDirection.toString());
                    }
                    bottomRight = bottomRight(twoDimensionalFocusSearch.focusRect());
                }
                return m1124findBestCandidate4WY_MpI(focusableChildren, bottomRight, i2);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
