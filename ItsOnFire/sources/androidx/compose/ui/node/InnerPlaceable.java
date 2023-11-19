package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.input.nestedscroll.NestedScrollDelegatingWrapper;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 x2\u00020\u00012\u00020\u0002:\u0001xB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\u001bH\u0016J\n\u0010 \u001a\u0004\u0018\u00010!H\u0016J\n\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0016J\n\u0010#\u001a\u0004\u0018\u00010\u001bH\u0016J\n\u0010$\u001a\u0004\u0018\u00010!H\u0016J\b\u0010%\u001a\u00020&H\u0014Jy\u0010'\u001a\u00020(\"\u0004\b\u0000\u0010)2\u0006\u0010*\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u0002H)0-2\u0006\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u001e25\u00100\u001a1\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020+\u0012\n\u0012\b\u0012\u0004\u0012\u0002H)0-\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020(01¢\u0006\u0002\b2H\u0082\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104J;\u0010'\u001a\u00020(2\u0006\u0010*\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u0002050-2\u0006\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u001eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107J3\u00108\u001a\u00020(2\u0006\u0010*\u001a\u00020+2\f\u00109\u001a\b\u0012\u0004\u0012\u00020:0-2\u0006\u0010/\u001a\u00020\u001eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u0015H\u0016J\u0010\u0010?\u001a\u00020\u00152\u0006\u0010@\u001a\u00020\u0015H\u0016J\u001d\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u0015H\u0016J\u0010\u0010H\u001a\u00020\u00152\u0006\u0010@\u001a\u00020\u0015H\u0016J\u0010\u0010I\u001a\u00020(2\u0006\u0010J\u001a\u00020KH\u0016J@\u0010L\u001a\u00020(2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u00072\u0019\u0010P\u001a\u0015\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020(\u0018\u00010Q¢\u0006\u0002\b2H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020(2\u0006\u0010V\u001a\u00020WH\u0016J\b\u0010X\u001a\u00020\u001eH\u0016J\u001a\u0010Y\u001a\u00020\u0015*\u00020ZH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b[\u0010\\J\u001a\u0010Y\u001a\u00020\u0015*\u00020]H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b^\u0010_J\u001a\u0010`\u001a\u00020Z*\u00020]H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\ba\u0010bJ\u001d\u0010`\u001a\u00020Z*\u00020\u0007H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bc\u0010dJ\u001d\u0010`\u001a\u00020Z*\u00020\u0015H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bc\u0010eJ\u001a\u0010f\u001a\u00020g*\u00020hH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bi\u0010jJ\u001a\u0010k\u001a\u00020\u0007*\u00020ZH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bl\u0010dJ\u001a\u0010k\u001a\u00020\u0007*\u00020]H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bm\u0010bJ\r\u0010n\u001a\u00020o*\u00020pH\u0097\u0001J\u001a\u0010q\u001a\u00020h*\u00020gH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\br\u0010jJ\u001a\u0010s\u001a\u00020]*\u00020ZH\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bt\u0010uJ\u001d\u0010s\u001a\u00020]*\u00020\u0007H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bv\u0010uJ\u001d\u0010s\u001a\u00020]*\u00020\u0015H\u0097\u0001ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bv\u0010wR\u0014\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006y"}, d2 = {"Landroidx/compose/ui/node/InnerPlaceable;", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "Landroidx/compose/ui/unit/Density;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope", "()Landroidx/compose/ui/layout/MeasureScope;", "parentData", "", "getParentData", "()Ljava/lang/Object;", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "findLastFocusWrapper", "Landroidx/compose/ui/node/ModifiedFocusNode;", "findLastKeyInputWrapper", "Landroidx/compose/ui/node/ModifiedKeyInputNode;", "findNextFocusWrapper", "excludeDeactivated", "", "findNextKeyInputWrapper", "findNextNestedScrollWrapper", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;", "findPreviousFocusWrapper", "findPreviousKeyInputWrapper", "findPreviousNestedScrollWrapper", "getWrappedByCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "hitTest", "", "T", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "isTouchEvent", "isInLayer", "childHitTest", "Lkotlin/Function5;", "Lkotlin/ExtensionFunctionType;", "hitTest-ULxng0E", "(JLandroidx/compose/ui/node/HitTestResult;ZZLkotlin/jvm/functions/Function5;)V", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "hitTest-M_7yMNQ", "(JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTestSemantics", "hitSemanticsWrappers", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "hitTestSemantics-9KIMszo", "(JLandroidx/compose/ui/node/HitTestResult;Z)V", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "performDraw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "placeAt", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "propagateFocusEvent", "focusState", "Landroidx/compose/ui/focus/FocusState;", "shouldSharePointerInputWithSiblings", "roundToPx", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class InnerPlaceable extends LayoutNodeWrapper implements Density {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Paint innerBoundsPaint;
    private final /* synthetic */ MeasureScope $$delegate_0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/InnerPlaceable$Companion;", "", "()V", "innerBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getInnerBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Paint getInnerBoundsPaint() {
            return InnerPlaceable.innerBoundsPaint;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.Active.ordinal()] = 1;
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            iArr[FocusStateImpl.Captured.ordinal()] = 3;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo1282setColor8_81llA(Color.Companion.m1426getRed0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.mo1286setStylek9PVt8s(PaintingStyle.Companion.m1597getStrokeTiuSbCo());
        innerBoundsPaint = Paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InnerPlaceable(@NotNull LayoutNode layoutNode) {
        super(layoutNode);
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.$$delegate_0 = layoutNode.getMeasureScope$ui_release();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f A[EDGE_INSN: B:39:0x008f->B:37:0x008f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* renamed from: hitTest-ULxng0E  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <T> void m2864hitTestULxng0E(long r16, androidx.compose.ui.node.HitTestResult<T> r18, boolean r19, boolean r20, kotlin.jvm.functions.Function5<? super androidx.compose.ui.node.LayoutNode, ? super androidx.compose.ui.geometry.Offset, ? super androidx.compose.ui.node.HitTestResult<T>, ? super java.lang.Boolean, ? super java.lang.Boolean, kotlin.Unit> r21) {
        /*
            r15 = this;
            boolean r0 = r15.m2886withinLayerBoundsk4lQ0M(r16)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lf
            r0 = r15
            r5 = r16
            r3 = r20
        Ld:
            r4 = r2
            goto L35
        Lf:
            if (r19 == 0) goto L2f
            long r3 = r15.m2881getMinimumTouchTargetSizeNHjbRc()
            r0 = r15
            r5 = r16
            float r3 = r15.m2879distanceInMinimumTouchTargettz77jQw(r5, r3)
            boolean r4 = java.lang.Float.isInfinite(r3)
            if (r4 != 0) goto L2a
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L2a
            r3 = r2
            goto L2b
        L2a:
            r3 = r1
        L2b:
            if (r3 == 0) goto L32
            r3 = r1
            goto Ld
        L2f:
            r0 = r15
            r5 = r16
        L32:
            r3 = r20
            r4 = r1
        L35:
            if (r4 == 0) goto L94
            int r4 = androidx.compose.ui.node.HitTestResult.access$getHitDepth$p(r18)
            androidx.compose.ui.node.LayoutNode r0 = r15.getLayoutNode$ui_release()
            androidx.compose.runtime.collection.MutableVector r0 = r0.getZSortedChildren()
            int r7 = r0.getSize()
            if (r7 <= 0) goto L8f
            int r7 = r7 - r2
            java.lang.Object[] r0 = r0.getContent()
        L4e:
            r8 = r0[r7]
            androidx.compose.ui.node.LayoutNode r8 = (androidx.compose.ui.node.LayoutNode) r8
            boolean r9 = r8.isPlaced()
            if (r9 == 0) goto L87
            androidx.compose.ui.geometry.Offset r11 = androidx.compose.ui.geometry.Offset.m1150boximpl(r16)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r19)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            r9 = r21
            r10 = r8
            r12 = r18
            r9.invoke(r10, r11, r12, r13, r14)
            boolean r9 = r18.hasHit()
            if (r9 != 0) goto L74
        L72:
            r8 = r2
            goto L83
        L74:
            androidx.compose.ui.node.LayoutNodeWrapper r8 = r8.getOuterLayoutNodeWrapper$ui_release()
            boolean r8 = r8.shouldSharePointerInputWithSiblings()
            if (r8 == 0) goto L82
            r18.acceptHits()
            goto L72
        L82:
            r8 = r1
        L83:
            if (r8 != 0) goto L87
            r8 = r2
            goto L88
        L87:
            r8 = r1
        L88:
            if (r8 == 0) goto L8b
            goto L8f
        L8b:
            int r7 = r7 + (-1)
            if (r7 >= 0) goto L4e
        L8f:
            r0 = r18
            androidx.compose.ui.node.HitTestResult.access$setHitDepth$p(r0, r4)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.InnerPlaceable.m2864hitTestULxng0E(long, androidx.compose.ui.node.HitTestResult, boolean, boolean, kotlin.jvm.functions.Function5):void");
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        Integer num = getLayoutNode$ui_release().calculateAlignmentLines$ui_release().get(alignmentLine);
        if (num == null) {
            return Integer.MIN_VALUE;
        }
        return num.intValue();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedFocusNode findLastFocusWrapper() {
        return findPreviousFocusWrapper();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedKeyInputNode findLastKeyInputWrapper() {
        return findPreviousKeyInputWrapper();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedFocusNode findNextFocusWrapper(boolean z) {
        return null;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedKeyInputNode findNextKeyInputWrapper() {
        return null;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public NestedScrollDelegatingWrapper findNextNestedScrollWrapper() {
        return null;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedFocusNode findPreviousFocusWrapper() {
        LayoutNodeWrapper wrappedBy$ui_release = getWrappedBy$ui_release();
        if (wrappedBy$ui_release == null) {
            return null;
        }
        return wrappedBy$ui_release.findPreviousFocusWrapper();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedKeyInputNode findPreviousKeyInputWrapper() {
        LayoutNodeWrapper wrappedBy$ui_release = getWrappedBy$ui_release();
        if (wrappedBy$ui_release == null) {
            return null;
        }
        return wrappedBy$ui_release.findPreviousKeyInputWrapper();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public NestedScrollDelegatingWrapper findPreviousNestedScrollWrapper() {
        LayoutNodeWrapper wrappedBy$ui_release = getWrappedBy$ui_release();
        if (wrappedBy$ui_release == null) {
            return null;
        }
        return wrappedBy$ui_release.findPreviousNestedScrollWrapper();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @NotNull
    public MeasureScope getMeasureScope() {
        return getLayoutNode$ui_release().getMeasureScope$ui_release();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        return null;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @NotNull
    public LayoutCoordinates getWrappedByCoordinates() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092 A[EDGE_INSN: B:39:0x0092->B:37:0x0092 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    /* renamed from: hitTest-M_7yMNQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2849hitTestM_7yMNQ(long r17, @org.jetbrains.annotations.NotNull androidx.compose.ui.node.HitTestResult<androidx.compose.ui.input.pointer.PointerInputFilter> r19, boolean r20, boolean r21) {
        /*
            r16 = this;
            r6 = r19
            java.lang.String r0 = "hitTestResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r16.m2886withinLayerBoundsk4lQ0M(r17)
            r7 = 0
            r8 = 1
            if (r0 == 0) goto L17
            r2 = r16
            r9 = r17
            r11 = r21
        L15:
            r0 = r8
            goto L3f
        L17:
            if (r20 == 0) goto L38
            long r0 = r16.m2881getMinimumTouchTargetSizeNHjbRc()
            r2 = r16
            r9 = r17
            float r0 = r2.m2879distanceInMinimumTouchTargettz77jQw(r9, r0)
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L33
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L33
            r0 = r8
            goto L34
        L33:
            r0 = r7
        L34:
            if (r0 == 0) goto L3c
            r11 = r7
            goto L15
        L38:
            r2 = r16
            r9 = r17
        L3c:
            r11 = r21
            r0 = r7
        L3f:
            if (r0 == 0) goto L95
            int r12 = androidx.compose.ui.node.HitTestResult.access$getHitDepth$p(r19)
            androidx.compose.ui.node.LayoutNode r0 = r16.getLayoutNode$ui_release()
            androidx.compose.runtime.collection.MutableVector r0 = r0.getZSortedChildren()
            int r1 = r0.getSize()
            if (r1 <= 0) goto L92
            int r1 = r1 - r8
            java.lang.Object[] r13 = r0.getContent()
            r14 = r1
        L59:
            r0 = r13[r14]
            r15 = r0
            androidx.compose.ui.node.LayoutNode r15 = (androidx.compose.ui.node.LayoutNode) r15
            boolean r0 = r15.isPlaced()
            if (r0 == 0) goto L8a
            r0 = r15
            r1 = r17
            r3 = r19
            r4 = r20
            r5 = r11
            r0.m2869hitTestM_7yMNQ$ui_release(r1, r3, r4, r5)
            boolean r0 = r19.hasHit()
            if (r0 != 0) goto L77
        L75:
            r0 = r8
            goto L86
        L77:
            androidx.compose.ui.node.LayoutNodeWrapper r0 = r15.getOuterLayoutNodeWrapper$ui_release()
            boolean r0 = r0.shouldSharePointerInputWithSiblings()
            if (r0 == 0) goto L85
            r19.acceptHits()
            goto L75
        L85:
            r0 = r7
        L86:
            if (r0 != 0) goto L8a
            r0 = r8
            goto L8b
        L8a:
            r0 = r7
        L8b:
            if (r0 == 0) goto L8e
            goto L92
        L8e:
            int r14 = r14 + (-1)
            if (r14 >= 0) goto L59
        L92:
            androidx.compose.ui.node.HitTestResult.access$setHitDepth$p(r6, r12)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.InnerPlaceable.mo2849hitTestM_7yMNQ(long, androidx.compose.ui.node.HitTestResult, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b A[EDGE_INSN: B:36:0x007b->B:34:0x007b ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    /* renamed from: hitTestSemantics-9KIMszo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2851hitTestSemantics9KIMszo(long r12, @org.jetbrains.annotations.NotNull androidx.compose.ui.node.HitTestResult<androidx.compose.ui.semantics.SemanticsWrapper> r14, boolean r15) {
        /*
            r11 = this;
            java.lang.String r0 = "hitSemanticsWrappers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            boolean r0 = r11.m2886withinLayerBoundsk4lQ0M(r12)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lf
        Ld:
            r0 = r2
            goto L2b
        Lf:
            long r3 = r11.m2881getMinimumTouchTargetSizeNHjbRc()
            float r0 = r11.m2879distanceInMinimumTouchTargettz77jQw(r12, r3)
            boolean r3 = java.lang.Float.isInfinite(r0)
            if (r3 != 0) goto L25
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L25
            r0 = r2
            goto L26
        L25:
            r0 = r1
        L26:
            if (r0 == 0) goto L2a
            r15 = r1
            goto Ld
        L2a:
            r0 = r1
        L2b:
            if (r0 == 0) goto L7e
            int r0 = androidx.compose.ui.node.HitTestResult.access$getHitDepth$p(r14)
            androidx.compose.ui.node.LayoutNode r11 = r11.getLayoutNode$ui_release()
            androidx.compose.runtime.collection.MutableVector r11 = r11.getZSortedChildren()
            int r3 = r11.getSize()
            if (r3 <= 0) goto L7b
            int r3 = r3 - r2
            java.lang.Object[] r11 = r11.getContent()
            r9 = r3
        L45:
            r3 = r11[r9]
            r10 = r3
            androidx.compose.ui.node.LayoutNode r10 = (androidx.compose.ui.node.LayoutNode) r10
            boolean r3 = r10.isPlaced()
            if (r3 == 0) goto L73
            r7 = 1
            r3 = r10
            r4 = r12
            r6 = r14
            r8 = r15
            r3.m2870hitTestSemanticsM_7yMNQ$ui_release(r4, r6, r7, r8)
            boolean r3 = r14.hasHit()
            if (r3 != 0) goto L60
        L5e:
            r3 = r2
            goto L6f
        L60:
            androidx.compose.ui.node.LayoutNodeWrapper r3 = r10.getOuterLayoutNodeWrapper$ui_release()
            boolean r3 = r3.shouldSharePointerInputWithSiblings()
            if (r3 == 0) goto L6e
            r14.acceptHits()
            goto L5e
        L6e:
            r3 = r1
        L6f:
            if (r3 != 0) goto L73
            r3 = r2
            goto L74
        L73:
            r3 = r1
        L74:
            if (r3 == 0) goto L77
            goto L7b
        L77:
            int r9 = r9 + (-1)
            if (r9 >= 0) goto L45
        L7b:
            androidx.compose.ui.node.HitTestResult.access$setHitDepth$p(r14, r0)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.InnerPlaceable.mo2851hitTestSemantics9KIMszo(long, androidx.compose.ui.node.HitTestResult, boolean):void");
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i2) {
        return getLayoutNode$ui_release().getIntrinsicsPolicy$ui_release().maxIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i2) {
        return getLayoutNode$ui_release().getIntrinsicsPolicy$ui_release().maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @NotNull
    /* renamed from: measure-BRTryo0 */
    public Placeable mo2758measureBRTryo0(long j2) {
        m2799setMeasurementConstraintsBRTryo0(j2);
        MutableVector<LayoutNode> mutableVector = getLayoutNode$ui_release().get_children$ui_release();
        int size = mutableVector.getSize();
        if (size <= 0) {
            getLayoutNode$ui_release().handleMeasureResult$ui_release(getLayoutNode$ui_release().getMeasurePolicy().mo6measure3p2s80s(getLayoutNode$ui_release().getMeasureScope$ui_release(), getLayoutNode$ui_release().getChildren$ui_release(), j2));
            return this;
        }
        int i2 = 0;
        LayoutNode[] content = mutableVector.getContent();
        do {
            content[i2].setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
            i2++;
        } while (i2 < size);
        getLayoutNode$ui_release().handleMeasureResult$ui_release(getLayoutNode$ui_release().getMeasurePolicy().mo6measure3p2s80s(getLayoutNode$ui_release().getMeasureScope$ui_release(), getLayoutNode$ui_release().getChildren$ui_release(), j2));
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i2) {
        return getLayoutNode$ui_release().getIntrinsicsPolicy$ui_release().minIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i2) {
        return getLayoutNode$ui_release().getIntrinsicsPolicy$ui_release().minIntrinsicWidth(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void performDraw(@org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.Canvas r7) {
        /*
            r6 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            androidx.compose.ui.node.LayoutNode r0 = r6.getLayoutNode$ui_release()
            androidx.compose.ui.node.Owner r0 = androidx.compose.ui.node.LayoutNodeKt.requireOwner(r0)
            androidx.compose.ui.node.LayoutNode r1 = r6.getLayoutNode$ui_release()
            androidx.compose.runtime.collection.MutableVector r1 = r1.getZSortedChildren()
            int r2 = r1.getSize()
            if (r2 <= 0) goto L31
            r3 = 0
            java.lang.Object[] r1 = r1.getContent()
        L20:
            r4 = r1[r3]
            androidx.compose.ui.node.LayoutNode r4 = (androidx.compose.ui.node.LayoutNode) r4
            boolean r5 = r4.isPlaced()
            if (r5 == 0) goto L2d
            r4.draw$ui_release(r7)
        L2d:
            int r3 = r3 + 1
            if (r3 < r2) goto L20
        L31:
            boolean r0 = r0.getShowLayoutBounds()
            if (r0 == 0) goto L3c
            androidx.compose.ui.graphics.Paint r0 = androidx.compose.ui.node.InnerPlaceable.innerBoundsPaint
            r6.drawBorder(r7, r0)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.InnerPlaceable.performDraw(androidx.compose.ui.graphics.Canvas):void");
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper, androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo2759placeAtf8xVGno(long j2, float f2, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
        super.mo2759placeAtf8xVGno(j2, f2, function1);
        LayoutNodeWrapper wrappedBy$ui_release = getWrappedBy$ui_release();
        boolean z = false;
        if (wrappedBy$ui_release != null && wrappedBy$ui_release.isShallowPlacing()) {
            z = true;
        }
        if (z) {
            return;
        }
        getLayoutNode$ui_release().onNodePlaced$ui_release();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void propagateFocusEvent(@NotNull FocusState focusState) {
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        int i2 = 0;
        List<ModifiedFocusNode> focusableChildren = focusableChildren(false);
        int size = focusableChildren.size();
        ModifiedFocusNode modifiedFocusNode = null;
        Boolean bool = null;
        while (i2 < size) {
            int i3 = i2 + 1;
            ModifiedFocusNode modifiedFocusNode2 = focusableChildren.get(i2);
            switch (WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode2.getFocusState().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    bool = Boolean.FALSE;
                    modifiedFocusNode = modifiedFocusNode2;
                    break;
                case 5:
                    if (bool != null) {
                        break;
                    } else {
                        bool = Boolean.TRUE;
                        break;
                    }
                case 6:
                    bool = Boolean.FALSE;
                    break;
            }
            i2 = i3;
        }
        FocusStateImpl focusState2 = modifiedFocusNode != null ? modifiedFocusNode.getFocusState() : null;
        if (focusState2 == null) {
            focusState2 = Intrinsics.areEqual(bool, Boolean.TRUE) ? FocusStateImpl.Deactivated : FocusStateImpl.Inactive;
        }
        super.propagateFocusEvent(focusState2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo270roundToPxR2X_6o(long j2) {
        return this.$$delegate_0.mo270roundToPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo271roundToPx0680j_4(float f2) {
        return this.$$delegate_0.mo271roundToPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public boolean shouldSharePointerInputWithSiblings() {
        return false;
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo272toDpGaN1DYA(long j2) {
        return this.$$delegate_0.mo272toDpGaN1DYA(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo273toDpu2uoSUM(float f2) {
        return this.$$delegate_0.mo273toDpu2uoSUM(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo274toDpu2uoSUM(int i2) {
        return this.$$delegate_0.mo274toDpu2uoSUM(i2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo275toDpSizekrfVVM(long j2) {
        return this.$$delegate_0.mo275toDpSizekrfVVM(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo276toPxR2X_6o(long j2) {
        return this.$$delegate_0.mo276toPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo277toPx0680j_4(float f2) {
        return this.$$delegate_0.mo277toPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @NotNull
    public Rect toRect(@NotNull DpRect dpRect) {
        Intrinsics.checkNotNullParameter(dpRect, "<this>");
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo278toSizeXkaWNTQ(long j2) {
        return this.$$delegate_0.mo278toSizeXkaWNTQ(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo279toSp0xMU5do(float f2) {
        return this.$$delegate_0.mo279toSp0xMU5do(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo280toSpkPz2Gy4(float f2) {
        return this.$$delegate_0.mo280toSpkPz2Gy4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo281toSpkPz2Gy4(int i2) {
        return this.$$delegate_0.mo281toSpkPz2Gy4(i2);
    }
}
