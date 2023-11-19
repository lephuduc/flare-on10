package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020/H\u0096\u0002J\u0010\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dH\u0016J\u0010\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u001dH\u0016J\u001d\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dH\u0016J\u0010\u00109\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u001dH\u0016J\b\u0010:\u001a\u00020\u0015H\u0002J@\u0010;\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u001b2\u0019\u0010>\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\u0002\b\u0016H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010@J@\u0010A\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u001b2\u0019\u0010>\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\u0002\b\u0016H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010@J\u0006\u0010C\u001a\u00020\u0015J\u001b\u0010D\u001a\u00020\t2\u0006\u00105\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bE\u0010FJ\u0006\u0010G\u001a\u00020\u0015R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000f8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0012\u001a\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013¢\u0006\u0002\b\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0017\u001a\u00020\u0018X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010)\u001a\u0004\u0018\u00010(2\b\u0010'\u001a\u0004\u0018\u00010(@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Landroidx/compose/ui/node/OuterMeasurablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "outerWrapper", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNodeWrapper;)V", "duringAlignmentLinesQuery", "", "getDuringAlignmentLinesQuery$ui_release", "()Z", "setDuringAlignmentLinesQuery$ui_release", "(Z)V", "lastConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastLayerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "lastPosition", "Landroidx/compose/ui/unit/IntOffset;", "J", "lastZIndex", "", "measuredHeight", "", "getMeasuredHeight", "()I", "measuredOnce", "measuredWidth", "getMeasuredWidth", "getOuterWrapper", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "setOuterWrapper", "(Landroidx/compose/ui/node/LayoutNodeWrapper;)V", "<set-?>", "", "parentData", "getParentData", "()Ljava/lang/Object;", "placedOnce", "get", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "onIntrinsicsQueried", "placeAt", "position", "zIndex", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeOuterWrapper", "placeOuterWrapper-f8xVGno", "recalculateParentData", "remeasure", "remeasure-BRTryo0", "(J)Z", "replace", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class OuterMeasurablePlaceable extends Placeable implements Measurable {
    private boolean duringAlignmentLinesQuery;
    @Nullable
    private Function1<? super GraphicsLayerScope, Unit> lastLayerBlock;
    private long lastPosition;
    private float lastZIndex;
    @NotNull
    private final LayoutNode layoutNode;
    private boolean measuredOnce;
    @NotNull
    private LayoutNodeWrapper outerWrapper;
    @Nullable
    private Object parentData;
    private boolean placedOnce;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 1;
            iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OuterMeasurablePlaceable(@NotNull LayoutNode layoutNode, @NotNull LayoutNodeWrapper outerWrapper) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Intrinsics.checkNotNullParameter(outerWrapper, "outerWrapper");
        this.layoutNode = layoutNode;
        this.outerWrapper = outerWrapper;
        this.lastPosition = IntOffset.Companion.m3453getZeronOccac();
    }

    private final void onIntrinsicsQueried() {
        this.layoutNode.requestRemeasure$ui_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: placeOuterWrapper-f8xVGno  reason: not valid java name */
    public final void m2891placeOuterWrapperf8xVGno(long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1) {
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
        if (function1 == null) {
            companion.m2804place70tqf50(getOuterWrapper(), j2, f2);
        } else {
            companion.m2809placeWithLayeraW9wM(getOuterWrapper(), j2, f2, function1);
        }
    }

    @Override // androidx.compose.ui.layout.Measured
    public int get(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        if ((parent$ui_release == null ? null : parent$ui_release.getLayoutState$ui_release()) == LayoutNode.LayoutState.Measuring) {
            this.layoutNode.getAlignmentLines$ui_release().setUsedDuringParentMeasurement$ui_release(true);
        } else {
            LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
            if ((parent$ui_release2 != null ? parent$ui_release2.getLayoutState$ui_release() : null) == LayoutNode.LayoutState.LayingOut) {
                this.layoutNode.getAlignmentLines$ui_release().setUsedDuringParentLayout$ui_release(true);
            }
        }
        this.duringAlignmentLinesQuery = true;
        int i2 = this.outerWrapper.get(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return i2;
    }

    public final boolean getDuringAlignmentLinesQuery$ui_release() {
        return this.duringAlignmentLinesQuery;
    }

    @Nullable
    /* renamed from: getLastConstraints-DWUhwKw  reason: not valid java name */
    public final Constraints m2892getLastConstraintsDWUhwKw() {
        if (this.measuredOnce) {
            return Constraints.m3281boximpl(m2797getMeasurementConstraintsmsEJaDk());
        }
        return null;
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return this.outerWrapper.getMeasuredHeight();
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return this.outerWrapper.getMeasuredWidth();
    }

    @NotNull
    public final LayoutNodeWrapper getOuterWrapper() {
        return this.outerWrapper;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        return this.parentData;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i2) {
        onIntrinsicsQueried();
        return this.outerWrapper.maxIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i2) {
        onIntrinsicsQueried();
        return this.outerWrapper.maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @NotNull
    /* renamed from: measure-BRTryo0 */
    public Placeable mo2758measureBRTryo0(long j2) {
        LayoutNode.UsageByParent usageByParent;
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        if (parent$ui_release != null) {
            if (!(this.layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.NotUsed || this.layoutNode.getCanMultiMeasure$ui_release())) {
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + this.layoutNode.getMeasuredByParent$ui_release() + ". Parent state " + parent$ui_release.getLayoutState$ui_release() + '.').toString());
            }
            LayoutNode layoutNode = this.layoutNode;
            int i2 = WhenMappings.$EnumSwitchMapping$0[parent$ui_release.getLayoutState$ui_release().ordinal()];
            if (i2 == 1) {
                usageByParent = LayoutNode.UsageByParent.InMeasureBlock;
            } else if (i2 != 2) {
                throw new IllegalStateException(Intrinsics.stringPlus("Measurable could be only measured from the parent's measure or layout block.Parents state is ", parent$ui_release.getLayoutState$ui_release()));
            } else {
                usageByParent = LayoutNode.UsageByParent.InLayoutBlock;
            }
            layoutNode.setMeasuredByParent$ui_release(usageByParent);
        } else {
            this.layoutNode.setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
        }
        m2893remeasureBRTryo0(j2);
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i2) {
        onIntrinsicsQueried();
        return this.outerWrapper.minIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i2) {
        onIntrinsicsQueried();
        return this.outerWrapper.minIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public void mo2759placeAtf8xVGno(long j2, float f2, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
        this.lastPosition = j2;
        this.lastZIndex = f2;
        this.lastLayerBlock = function1;
        LayoutNodeWrapper wrappedBy$ui_release = this.outerWrapper.getWrappedBy$ui_release();
        if (wrappedBy$ui_release != null && wrappedBy$ui_release.isShallowPlacing()) {
            m2891placeOuterWrapperf8xVGno(j2, f2, function1);
            return;
        }
        this.placedOnce = true;
        this.layoutNode.getAlignmentLines$ui_release().setUsedByModifierLayout$ui_release(false);
        LayoutNodeKt.requireOwner(this.layoutNode).getSnapshotObserver().observeLayoutModifierSnapshotReads$ui_release(this.layoutNode, new OuterMeasurablePlaceable$placeAt$1(this, j2, f2, function1));
    }

    public final void recalculateParentData() {
        this.parentData = this.outerWrapper.getParentData();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* renamed from: remeasure-BRTryo0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2893remeasureBRTryo0(long r9) {
        /*
            r8 = this;
            androidx.compose.ui.node.LayoutNode r0 = r8.layoutNode
            androidx.compose.ui.node.Owner r0 = androidx.compose.ui.node.LayoutNodeKt.requireOwner(r0)
            androidx.compose.ui.node.LayoutNode r1 = r8.layoutNode
            androidx.compose.ui.node.LayoutNode r1 = r1.getParent$ui_release()
            androidx.compose.ui.node.LayoutNode r2 = r8.layoutNode
            boolean r3 = r2.getCanMultiMeasure$ui_release()
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L21
            if (r1 == 0) goto L1f
            boolean r1 = r1.getCanMultiMeasure$ui_release()
            if (r1 == 0) goto L1f
            goto L21
        L1f:
            r1 = r5
            goto L22
        L21:
            r1 = r4
        L22:
            r2.setCanMultiMeasure$ui_release(r1)
            androidx.compose.ui.node.LayoutNode r1 = r8.layoutNode
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = r1.getLayoutState$ui_release()
            androidx.compose.ui.node.LayoutNode$LayoutState r2 = androidx.compose.ui.node.LayoutNode.LayoutState.NeedsRemeasure
            if (r1 == r2) goto L40
            long r1 = r8.m2797getMeasurementConstraintsmsEJaDk()
            boolean r1 = androidx.compose.ui.unit.Constraints.m3286equalsimpl0(r1, r9)
            if (r1 != 0) goto L3a
            goto L40
        L3a:
            androidx.compose.ui.node.LayoutNode r8 = r8.layoutNode
            r0.forceMeasureTheSubtree(r8)
            return r5
        L40:
            androidx.compose.ui.node.LayoutNode r1 = r8.layoutNode
            androidx.compose.ui.node.LayoutNodeAlignmentLines r1 = r1.getAlignmentLines$ui_release()
            r1.setUsedByModifierMeasurement$ui_release(r5)
            androidx.compose.ui.node.LayoutNode r1 = r8.layoutNode
            androidx.compose.runtime.collection.MutableVector r1 = r1.get_children$ui_release()
            int r2 = r1.getSize()
            if (r2 <= 0) goto L68
            java.lang.Object[] r1 = r1.getContent()
            r3 = r5
        L5a:
            r6 = r1[r3]
            androidx.compose.ui.node.LayoutNode r6 = (androidx.compose.ui.node.LayoutNode) r6
            androidx.compose.ui.node.LayoutNodeAlignmentLines r6 = r6.getAlignmentLines$ui_release()
            r6.setUsedDuringParentMeasurement$ui_release(r5)
            int r3 = r3 + r4
            if (r3 < r2) goto L5a
        L68:
            r8.measuredOnce = r4
            androidx.compose.ui.node.LayoutNode r1 = r8.layoutNode
            androidx.compose.ui.node.LayoutNode$LayoutState r2 = androidx.compose.ui.node.LayoutNode.LayoutState.Measuring
            r1.setLayoutState$ui_release(r2)
            r8.m2799setMeasurementConstraintsBRTryo0(r9)
            androidx.compose.ui.node.LayoutNodeWrapper r1 = r8.outerWrapper
            long r6 = r1.mo2772getSizeYbymL2g()
            androidx.compose.ui.node.OwnerSnapshotObserver r0 = r0.getSnapshotObserver()
            androidx.compose.ui.node.LayoutNode r1 = r8.layoutNode
            androidx.compose.ui.node.OuterMeasurablePlaceable$remeasure$2 r3 = new androidx.compose.ui.node.OuterMeasurablePlaceable$remeasure$2
            r3.<init>(r8, r9)
            r0.observeMeasureSnapshotReads$ui_release(r1, r3)
            androidx.compose.ui.node.LayoutNode r9 = r8.layoutNode
            androidx.compose.ui.node.LayoutNode$LayoutState r9 = r9.getLayoutState$ui_release()
            if (r9 != r2) goto L97
            androidx.compose.ui.node.LayoutNode r9 = r8.layoutNode
            androidx.compose.ui.node.LayoutNode$LayoutState r10 = androidx.compose.ui.node.LayoutNode.LayoutState.NeedsRelayout
            r9.setLayoutState$ui_release(r10)
        L97:
            androidx.compose.ui.node.LayoutNodeWrapper r9 = r8.outerWrapper
            long r9 = r9.mo2772getSizeYbymL2g()
            boolean r9 = androidx.compose.ui.unit.IntSize.m3483equalsimpl0(r9, r6)
            if (r9 == 0) goto Lbd
            androidx.compose.ui.node.LayoutNodeWrapper r9 = r8.outerWrapper
            int r9 = r9.getWidth()
            int r10 = r8.getWidth()
            if (r9 != r10) goto Lbd
            androidx.compose.ui.node.LayoutNodeWrapper r9 = r8.outerWrapper
            int r9 = r9.getHeight()
            int r10 = r8.getHeight()
            if (r9 == r10) goto Lbc
            goto Lbd
        Lbc:
            r4 = r5
        Lbd:
            androidx.compose.ui.node.LayoutNodeWrapper r9 = r8.outerWrapper
            int r9 = r9.getWidth()
            androidx.compose.ui.node.LayoutNodeWrapper r10 = r8.outerWrapper
            int r10 = r10.getHeight()
            long r9 = androidx.compose.ui.unit.IntSizeKt.IntSize(r9, r10)
            r8.m2798setMeasuredSizeozmzZPI(r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.OuterMeasurablePlaceable.m2893remeasureBRTryo0(long):boolean");
    }

    public final void replace() {
        if (!this.placedOnce) {
            throw new IllegalStateException("Check failed.".toString());
        }
        mo2759placeAtf8xVGno(this.lastPosition, this.lastZIndex, this.lastLayerBlock);
    }

    public final void setDuringAlignmentLinesQuery$ui_release(boolean z) {
        this.duringAlignmentLinesQuery = z;
    }

    public final void setOuterWrapper(@NotNull LayoutNodeWrapper layoutNodeWrapper) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper, "<set-?>");
        this.outerWrapper = layoutNodeWrapper;
    }
}
