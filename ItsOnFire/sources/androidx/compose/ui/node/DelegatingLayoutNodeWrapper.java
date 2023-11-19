package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollDelegatingWrapper;
import androidx.compose.ui.input.pointer.PointerInputFilter;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.semantics.SemanticsWrapper;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\n\u0010%\u001a\u0004\u0018\u00010&H\u0016J\n\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0012\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010*\u001a\u00020\bH\u0016J\n\u0010+\u001a\u0004\u0018\u00010(H\u0016J\n\u0010,\u001a\u0004\u0018\u00010-H\u0016J\n\u0010.\u001a\u0004\u0018\u00010&H\u0016J\n\u0010/\u001a\u0004\u0018\u00010(H\u0016J\n\u00100\u001a\u0004\u0018\u00010-H\u0016J;\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u000207062\u0006\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;Je\u0010<\u001a\u000202\"\u0004\b\u0001\u0010\u00012\u0006\u00103\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u0002H\u0001062\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\b2\u0006\u00109\u001a\u00020\b2\u0006\u0010?\u001a\u0002H\u00012\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002020AH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010CJ3\u0010D\u001a\u0002022\u0006\u00103\u001a\u0002042\f\u0010E\u001a\b\u0012\u0004\u0012\u00020F062\u0006\u00109\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\"2\u0006\u0010J\u001a\u00020\"H\u0016J\u0010\u0010K\u001a\u00020\"2\u0006\u0010L\u001a\u00020\"H\u0016J\u001d\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020PH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bQ\u0010RJ\u0010\u0010S\u001a\u00020\"2\u0006\u0010J\u001a\u00020\"H\u0016J\u0010\u0010T\u001a\u00020\"2\u0006\u0010L\u001a\u00020\"H\u0016J\b\u0010U\u001a\u000202H\u0016J\u0010\u0010V\u001a\u0002022\u0006\u0010W\u001a\u00020XH\u0016J@\u0010Y\u001a\u0002022\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]2\u0019\u0010^\u001a\u0015\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u000202\u0018\u00010A¢\u0006\u0002\b`H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\ba\u0010bJ\u000e\u0010c\u001a\u0002022\u0006\u0010\u0005\u001a\u00020\u0002J\b\u0010d\u001a\u00020\bH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u00028\u0000X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000bR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003@VX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006e"}, d2 = {"Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "T", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "wrapped", "modifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/Modifier$Element;)V", "isChained", "", "()Z", "setChained", "(Z)V", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope", "()Landroidx/compose/ui/layout/MeasureScope;", "getModifier", "()Landroidx/compose/ui/Modifier$Element;", "setModifier", "(Landroidx/compose/ui/Modifier$Element;)V", "Landroidx/compose/ui/Modifier$Element;", "parentData", "", "getParentData", "()Ljava/lang/Object;", "toBeReusedForSameModifier", "getToBeReusedForSameModifier", "setToBeReusedForSameModifier", "<set-?>", "getWrapped$ui_release", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "setWrapped", "(Landroidx/compose/ui/node/LayoutNodeWrapper;)V", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "findLastFocusWrapper", "Landroidx/compose/ui/node/ModifiedFocusNode;", "findLastKeyInputWrapper", "Landroidx/compose/ui/node/ModifiedKeyInputNode;", "findNextFocusWrapper", "excludeDeactivated", "findNextKeyInputWrapper", "findNextNestedScrollWrapper", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;", "findPreviousFocusWrapper", "findPreviousKeyInputWrapper", "findPreviousNestedScrollWrapper", "hitTest", "", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitTestResult", "Landroidx/compose/ui/node/HitTestResult;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "isTouchEvent", "isInLayer", "hitTest-M_7yMNQ", "(JLandroidx/compose/ui/node/HitTestResult;ZZ)V", "hitTestInMinimumTouchTarget", "forceParentIntercept", "useTouchSize", FirebaseAnalytics.Param.CONTENT, "block", "Lkotlin/Function1;", "hitTestInMinimumTouchTarget-7362WCg", "(JLandroidx/compose/ui/node/HitTestResult;ZZZLjava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "hitTestSemantics", "hitSemanticsWrappers", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "hitTestSemantics-9KIMszo", "(JLandroidx/compose/ui/node/HitTestResult;Z)V", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "onInitialize", "performDraw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "placeAt", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "", "layerBlock", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "setModifierTo", "shouldSharePointerInputWithSiblings", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public class DelegatingLayoutNodeWrapper<T extends Modifier.Element> extends LayoutNodeWrapper {
    private boolean isChained;
    @NotNull
    private T modifier;
    private boolean toBeReusedForSameModifier;
    @NotNull
    private LayoutNodeWrapper wrapped;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelegatingLayoutNodeWrapper(@NotNull LayoutNodeWrapper wrapped, @NotNull T modifier) {
        super(wrapped.getLayoutNode$ui_release());
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.wrapped = wrapped;
        this.modifier = modifier;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public int calculateAlignmentLine(@NotNull AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return getWrapped$ui_release().get(alignmentLine);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedFocusNode findLastFocusWrapper() {
        ModifiedFocusNode modifiedFocusNode = null;
        for (ModifiedFocusNode findNextFocusWrapper = findNextFocusWrapper(false); findNextFocusWrapper != null; findNextFocusWrapper = findNextFocusWrapper.getWrapped$ui_release().findNextFocusWrapper(false)) {
            modifiedFocusNode = findNextFocusWrapper;
        }
        return modifiedFocusNode;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedKeyInputNode findLastKeyInputWrapper() {
        ModifiedKeyInputNode findPreviousKeyInputWrapper = getLayoutNode$ui_release().getInnerLayoutNodeWrapper$ui_release().findPreviousKeyInputWrapper();
        if (findPreviousKeyInputWrapper != this) {
            return findPreviousKeyInputWrapper;
        }
        return null;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedFocusNode findNextFocusWrapper(boolean z) {
        return getWrapped$ui_release().findNextFocusWrapper(z);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public ModifiedKeyInputNode findNextKeyInputWrapper() {
        return getWrapped$ui_release().findNextKeyInputWrapper();
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @Nullable
    public NestedScrollDelegatingWrapper findNextNestedScrollWrapper() {
        return getWrapped$ui_release().findNextNestedScrollWrapper();
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

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @NotNull
    public MeasureScope getMeasureScope() {
        return getWrapped$ui_release().getMeasureScope();
    }

    @NotNull
    public T getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        return getWrapped$ui_release().getParentData();
    }

    public final boolean getToBeReusedForSameModifier() {
        return this.toBeReusedForSameModifier;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    @NotNull
    public LayoutNodeWrapper getWrapped$ui_release() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    /* renamed from: hitTest-M_7yMNQ  reason: not valid java name */
    public void mo2849hitTestM_7yMNQ(long j2, @NotNull HitTestResult<PointerInputFilter> hitTestResult, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        boolean m2886withinLayerBoundsk4lQ0M = m2886withinLayerBoundsk4lQ0M(j2);
        if (!m2886withinLayerBoundsk4lQ0M) {
            if (!z) {
                return;
            }
            float m2879distanceInMinimumTouchTargettz77jQw = m2879distanceInMinimumTouchTargettz77jQw(j2, m2881getMinimumTouchTargetSizeNHjbRc());
            if (!((Float.isInfinite(m2879distanceInMinimumTouchTargettz77jQw) || Float.isNaN(m2879distanceInMinimumTouchTargettz77jQw)) ? false : true)) {
                return;
            }
        }
        getWrapped$ui_release().mo2849hitTestM_7yMNQ(getWrapped$ui_release().m2880fromParentPositionMKHz9U(j2), hitTestResult, z, z2 && m2886withinLayerBoundsk4lQ0M);
    }

    /* renamed from: hitTestInMinimumTouchTarget-7362WCg  reason: not valid java name */
    public final <T> void m2850hitTestInMinimumTouchTarget7362WCg(long j2, @NotNull HitTestResult<T> hitTestResult, boolean z, boolean z2, boolean z3, T t2, @NotNull Function1<? super Boolean, Unit> block) {
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean z4 = true;
        if (!m2886withinLayerBoundsk4lQ0M(j2)) {
            if (z2) {
                float m2879distanceInMinimumTouchTargettz77jQw = m2879distanceInMinimumTouchTargettz77jQw(j2, m2881getMinimumTouchTargetSizeNHjbRc());
                if (Float.isInfinite(m2879distanceInMinimumTouchTargettz77jQw) || Float.isNaN(m2879distanceInMinimumTouchTargettz77jQw)) {
                    z4 = false;
                }
                if (z4 && hitTestResult.isHitInMinimumTouchTargetBetter(m2879distanceInMinimumTouchTargettz77jQw, false)) {
                    hitTestResult.hitInMinimumTouchTarget(t2, m2879distanceInMinimumTouchTargettz77jQw, false, new DelegatingLayoutNodeWrapper$hitTestInMinimumTouchTarget$1(block));
                }
            }
        } else if (m2883isPointerInBoundsk4lQ0M(j2)) {
            hitTestResult.hit(t2, z3, new DelegatingLayoutNodeWrapper$hitTestInMinimumTouchTarget$2(block, z3));
        } else {
            float m2879distanceInMinimumTouchTargettz77jQw2 = !z2 ? Float.POSITIVE_INFINITY : m2879distanceInMinimumTouchTargettz77jQw(j2, m2881getMinimumTouchTargetSizeNHjbRc());
            if (Float.isInfinite(m2879distanceInMinimumTouchTargettz77jQw2) || Float.isNaN(m2879distanceInMinimumTouchTargettz77jQw2)) {
                z4 = false;
            }
            if (z4 && hitTestResult.isHitInMinimumTouchTargetBetter(m2879distanceInMinimumTouchTargettz77jQw2, z3)) {
                hitTestResult.hitInMinimumTouchTarget(t2, m2879distanceInMinimumTouchTargettz77jQw2, z3, new DelegatingLayoutNodeWrapper$hitTestInMinimumTouchTarget$3(block, z3));
            } else if (z) {
                hitTestResult.speculativeHit(t2, m2879distanceInMinimumTouchTargettz77jQw2, z3, new DelegatingLayoutNodeWrapper$hitTestInMinimumTouchTarget$4(block, z3));
            } else {
                block.invoke(Boolean.valueOf(z3));
            }
        }
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    /* renamed from: hitTestSemantics-9KIMszo  reason: not valid java name */
    public void mo2851hitTestSemantics9KIMszo(long j2, @NotNull HitTestResult<SemanticsWrapper> hitSemanticsWrappers, boolean z) {
        Intrinsics.checkNotNullParameter(hitSemanticsWrappers, "hitSemanticsWrappers");
        boolean m2886withinLayerBoundsk4lQ0M = m2886withinLayerBoundsk4lQ0M(j2);
        boolean z2 = true;
        if (!m2886withinLayerBoundsk4lQ0M) {
            float m2879distanceInMinimumTouchTargettz77jQw = m2879distanceInMinimumTouchTargettz77jQw(j2, m2881getMinimumTouchTargetSizeNHjbRc());
            if (!((Float.isInfinite(m2879distanceInMinimumTouchTargettz77jQw) || Float.isNaN(m2879distanceInMinimumTouchTargettz77jQw)) ? false : true)) {
                return;
            }
        }
        long m2880fromParentPositionMKHz9U = getWrapped$ui_release().m2880fromParentPositionMKHz9U(j2);
        if (!z || !m2886withinLayerBoundsk4lQ0M) {
            z2 = false;
        }
        getWrapped$ui_release().mo2851hitTestSemantics9KIMszo(m2880fromParentPositionMKHz9U, hitSemanticsWrappers, z2);
    }

    public final boolean isChained() {
        return this.isChained;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i2) {
        return getWrapped$ui_release().maxIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i2) {
        return getWrapped$ui_release().maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @NotNull
    /* renamed from: measure-BRTryo0 */
    public Placeable mo2758measureBRTryo0(long j2) {
        LayoutNodeWrapper.m2875access$setMeasurementConstraintsBRTryo0(this, j2);
        final Placeable mo2758measureBRTryo0 = getWrapped$ui_release().mo2758measureBRTryo0(j2);
        setMeasureResult$ui_release(new MeasureResult(this) { // from class: androidx.compose.ui.node.DelegatingLayoutNodeWrapper$measure$1$1
            @NotNull
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            public final /* synthetic */ DelegatingLayoutNodeWrapper<T> this$0;
            private final int width;

            {
                Map<AlignmentLine, Integer> emptyMap;
                this.this$0 = this;
                this.width = this.getWrapped$ui_release().getMeasureResult().getWidth();
                this.height = this.getWrapped$ui_release().getMeasureResult().getHeight();
                emptyMap = MapsKt__MapsKt.emptyMap();
                this.alignmentLines = emptyMap;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            @NotNull
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                long m2795getApparentToRealOffsetnOccac;
                Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
                Placeable placeable = mo2758measureBRTryo0;
                m2795getApparentToRealOffsetnOccac = this.this$0.m2795getApparentToRealOffsetnOccac();
                Placeable.PlacementScope.m2800place70tqf50$default(companion, placeable, IntOffsetKt.IntOffset(-IntOffset.m3443getXimpl(m2795getApparentToRealOffsetnOccac), -IntOffset.m3444getYimpl(m2795getApparentToRealOffsetnOccac)), 0.0f, 2, null);
            }
        });
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i2) {
        return getWrapped$ui_release().minIntrinsicHeight(i2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i2) {
        return getWrapped$ui_release().minIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void onInitialize() {
        super.onInitialize();
        getWrapped$ui_release().setWrappedBy$ui_release(this);
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void performDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getWrapped$ui_release().draw(canvas);
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
        onPlaced();
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
        int m3485getWidthimpl = IntSize.m3485getWidthimpl(m2796getMeasuredSizeYbymL2g());
        LayoutDirection layoutDirection = getMeasureScope().getLayoutDirection();
        int parentWidth = companion.getParentWidth();
        LayoutDirection parentLayoutDirection = companion.getParentLayoutDirection();
        Placeable.PlacementScope.parentWidth = m3485getWidthimpl;
        Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
        getMeasureResult().placeChildren();
        Placeable.PlacementScope.parentWidth = parentWidth;
        Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
    }

    public final void setChained(boolean z) {
        this.isChained = z;
    }

    public void setModifier(@NotNull T t2) {
        Intrinsics.checkNotNullParameter(t2, "<set-?>");
        this.modifier = t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setModifierTo(@NotNull Modifier.Element modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        if (modifier != getModifier()) {
            if (!Intrinsics.areEqual(JvmActuals_jvmKt.nativeClass(modifier), JvmActuals_jvmKt.nativeClass(getModifier()))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            setModifier(modifier);
        }
    }

    public final void setToBeReusedForSameModifier(boolean z) {
        this.toBeReusedForSameModifier = z;
    }

    public void setWrapped(@NotNull LayoutNodeWrapper layoutNodeWrapper) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper, "<set-?>");
        this.wrapped = layoutNodeWrapper;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public boolean shouldSharePointerInputWithSiblings() {
        return getWrapped$ui_release().shouldSharePointerInputWithSiblings();
    }
}
