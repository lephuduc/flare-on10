package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.Wrapper_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0003RSTB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J*\u0010*\u001a\u00020+2\u001d\u0010,\u001a\u0019\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001d¢\u0006\u0002\b!H\u0002ø\u0001\u0000J\u0010\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0004H\u0002J\u0010\u0010/\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J\r\u00100\u001a\u00020\"H\u0000¢\u0006\u0002\b1J\u0010\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\tH\u0002J\r\u00104\u001a\u00020\"H\u0000¢\u0006\u0002\b5J\u0017\u00106\u001a\u00020\"2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\"07H\u0082\bJ\b\u00108\u001a\u00020\"H\u0002J\"\u00109\u001a\u00020\"2\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\b\b\u0002\u0010<\u001a\u00020\u0004H\u0002J(\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u00012\u0011\u0010@\u001a\r\u0012\u0004\u0012\u00020\"07¢\u0006\u0002\bA¢\u0006\u0002\u0010BJ\u0018\u0010C\u001a\u00020\"2\u0006\u00103\u001a\u00020\t2\u0006\u0010D\u001a\u00020\u0013H\u0002J2\u0010C\u001a\u00020\"2\u0006\u00103\u001a\u00020\t2\b\u0010?\u001a\u0004\u0018\u00010\u00012\u0011\u0010@\u001a\r\u0012\u0004\u0012\u00020\"07¢\u0006\u0002\bAH\u0002¢\u0006\u0002\u0010EJ2\u0010C\u001a\b\u0012\u0004\u0012\u00020G0F2\b\u0010?\u001a\u0004\u0018\u00010\u00012\u0011\u0010@\u001a\r\u0012\u0004\u0012\u00020\"07¢\u0006\u0002\bAH\u0000¢\u0006\u0004\bH\u0010IJ:\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010K2\u0006\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\u000b2\u0011\u0010O\u001a\r\u0012\u0004\u0012\u00020\"07¢\u0006\u0002\bAH\u0002¢\u0006\u0002\u0010PJ\u0012\u0010Q\u001a\u00020\t2\b\u0010?\u001a\u0004\u0018\u00010\u0001H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\t0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00060\u001bR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000RE\u0010\u001c\u001a0\u0012\u0004\u0012\u00020\t\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001d¢\u0006\u0002\b!\u0012\u0004\u0012\u00020\"0\u001d¢\u0006\u0002\b!X\u0080\u0004ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R%\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\"0&¢\u0006\u0002\b!X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001c\u0010)\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\t0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006U"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState;", "", "()V", "maxSlotsToRetainForReuse", "", "(I)V", "NoIntrinsicsMessage", "", "_root", "Landroidx/compose/ui/node/LayoutNode;", "compositionContext", "Landroidx/compose/runtime/CompositionContext;", "getCompositionContext$ui_release", "()Landroidx/compose/runtime/CompositionContext;", "setCompositionContext$ui_release", "(Landroidx/compose/runtime/CompositionContext;)V", "currentIndex", "nodeToNodeState", "", "Landroidx/compose/ui/layout/SubcomposeLayoutState$NodeState;", "precomposeMap", "precomposedCount", "reusableCount", "root", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "scope", "Landroidx/compose/ui/layout/SubcomposeLayoutState$Scope;", "setMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "", "getSetMeasurePolicy$ui_release", "()Lkotlin/jvm/functions/Function2;", "setRoot", "Lkotlin/Function1;", "getSetRoot$ui_release", "()Lkotlin/jvm/functions/Function1;", "slotIdToNode", "createMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "block", "createNodeAt", FirebaseAnalytics.Param.INDEX, "disposeAfterIndex", "disposeCurrentNodes", "disposeCurrentNodes$ui_release", "disposeNode", "node", "forceRecomposeChildren", "forceRecomposeChildren$ui_release", "ignoreRemeasureRequests", "Lkotlin/Function0;", "makeSureStateIsConsistent", "move", Constants.MessagePayloadKeys.FROM, "to", "count", "precompose", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "slotId", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "subcompose", "nodeState", "(Landroidx/compose/ui/node/LayoutNode;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "", "Landroidx/compose/ui/layout/Measurable;", "subcompose$ui_release", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "subcomposeInto", "Landroidx/compose/runtime/Composition;", "existing", "container", "parent", "composable", "(Landroidx/compose/runtime/Composition;Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/Composition;", "takeNodeFromReusables", "NodeState", "PrecomposedSlotHandle", "Scope", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SubcomposeLayoutState {
    public static final int $stable = 8;
    @NotNull
    private final String NoIntrinsicsMessage;
    @Nullable
    private LayoutNode _root;
    @Nullable
    private CompositionContext compositionContext;
    private int currentIndex;
    private final int maxSlotsToRetainForReuse;
    @NotNull
    private final Map<LayoutNode, NodeState> nodeToNodeState;
    @NotNull
    private final Map<Object, LayoutNode> precomposeMap;
    private int precomposedCount;
    private int reusableCount;
    @NotNull
    private final Scope scope;
    @NotNull
    private final Function2<LayoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, Unit> setMeasurePolicy;
    @NotNull
    private final Function1<LayoutNode, Unit> setRoot;
    @NotNull
    private final Map<Object, LayoutNode> slotIdToNode;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B.\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR'\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState$NodeState;", "", "slotId", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "composition", "Landroidx/compose/runtime/Composition;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composition;)V", "getComposition", "()Landroidx/compose/runtime/Composition;", "setComposition", "(Landroidx/compose/runtime/Composition;)V", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "forceRecompose", "", "getForceRecompose", "()Z", "setForceRecompose", "(Z)V", "getSlotId", "()Ljava/lang/Object;", "setSlotId", "(Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class NodeState {
        @Nullable
        private Composition composition;
        @NotNull
        private Function2<? super Composer, ? super Integer, Unit> content;
        private boolean forceRecompose;
        @Nullable
        private Object slotId;

        public NodeState(@Nullable Object obj, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composition composition) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.slotId = obj;
            this.content = content;
            this.composition = composition;
        }

        public /* synthetic */ NodeState(Object obj, Function2 function2, Composition composition, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, function2, (i2 & 4) != 0 ? null : composition);
        }

        @Nullable
        public final Composition getComposition() {
            return this.composition;
        }

        @NotNull
        public final Function2<Composer, Integer, Unit> getContent() {
            return this.content;
        }

        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        @Nullable
        public final Object getSlotId() {
            return this.slotId;
        }

        public final void setComposition(@Nullable Composition composition) {
            this.composition = composition;
        }

        public final void setContent(@NotNull Function2<? super Composer, ? super Integer, Unit> function2) {
            Intrinsics.checkNotNullParameter(function2, "<set-?>");
            this.content = function2;
        }

        public final void setForceRecompose(boolean z) {
            this.forceRecompose = z;
        }

        public final void setSlotId(@Nullable Object obj) {
            this.slotId = obj;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "", "dispose", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public interface PrecomposedSlotHandle {
        void dispose();
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0002\b\u001aH\u0016¢\u0006\u0002\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState$Scope;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "(Landroidx/compose/ui/layout/SubcomposeLayoutState;)V", "density", "", "getDensity", "()F", "setDensity", "(F)V", "fontScale", "getFontScale", "setFontScale", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "subcompose", "", "Landroidx/compose/ui/layout/Measurable;", "slotId", "", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public final class Scope implements SubcomposeMeasureScope {
        private float density;
        private float fontScale;
        @NotNull
        private LayoutDirection layoutDirection;
        public final /* synthetic */ SubcomposeLayoutState this$0;

        public Scope(SubcomposeLayoutState this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
            this.layoutDirection = LayoutDirection.Rtl;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        @NotNull
        public LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        @NotNull
        public MeasureResult layout(int i2, int i3, @NotNull Map<AlignmentLine, Integer> map, @NotNull Function1<? super Placeable.PlacementScope, Unit> function1) {
            return SubcomposeMeasureScope.DefaultImpls.layout(this, i2, i3, map, function1);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: roundToPx--R2X_6o */
        public int mo270roundToPxR2X_6o(long j2) {
            return SubcomposeMeasureScope.DefaultImpls.m2836roundToPxR2X_6o(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: roundToPx-0680j_4 */
        public int mo271roundToPx0680j_4(float f2) {
            return SubcomposeMeasureScope.DefaultImpls.m2837roundToPx0680j_4(this, f2);
        }

        public void setDensity(float f2) {
            this.density = f2;
        }

        public void setFontScale(float f2) {
            this.fontScale = f2;
        }

        public void setLayoutDirection(@NotNull LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
            this.layoutDirection = layoutDirection;
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        @NotNull
        public List<Measurable> subcompose(@Nullable Object obj, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return this.this$0.subcompose$ui_release(obj, content);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDp-GaN1DYA */
        public float mo272toDpGaN1DYA(long j2) {
            return SubcomposeMeasureScope.DefaultImpls.m2838toDpGaN1DYA(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo273toDpu2uoSUM(float f2) {
            return SubcomposeMeasureScope.DefaultImpls.m2839toDpu2uoSUM(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo274toDpu2uoSUM(int i2) {
            return SubcomposeMeasureScope.DefaultImpls.m2840toDpu2uoSUM((SubcomposeMeasureScope) this, i2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDpSize-k-rfVVM */
        public long mo275toDpSizekrfVVM(long j2) {
            return SubcomposeMeasureScope.DefaultImpls.m2841toDpSizekrfVVM(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toPx--R2X_6o */
        public float mo276toPxR2X_6o(long j2) {
            return SubcomposeMeasureScope.DefaultImpls.m2842toPxR2X_6o(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toPx-0680j_4 */
        public float mo277toPx0680j_4(float f2) {
            return SubcomposeMeasureScope.DefaultImpls.m2843toPx0680j_4(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        @NotNull
        public Rect toRect(@NotNull DpRect dpRect) {
            return SubcomposeMeasureScope.DefaultImpls.toRect(this, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSize-XkaWNTQ */
        public long mo278toSizeXkaWNTQ(long j2) {
            return SubcomposeMeasureScope.DefaultImpls.m2844toSizeXkaWNTQ(this, j2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSp-0xMU5do */
        public long mo279toSp0xMU5do(float f2) {
            return SubcomposeMeasureScope.DefaultImpls.m2845toSp0xMU5do(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo280toSpkPz2Gy4(float f2) {
            return SubcomposeMeasureScope.DefaultImpls.m2846toSpkPz2Gy4(this, f2);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo281toSpkPz2Gy4(int i2) {
            return SubcomposeMeasureScope.DefaultImpls.m2847toSpkPz2Gy4((SubcomposeMeasureScope) this, i2);
        }
    }

    public SubcomposeLayoutState() {
        this(0);
    }

    public SubcomposeLayoutState(int i2) {
        this.maxSlotsToRetainForReuse = i2;
        this.setRoot = new SubcomposeLayoutState$setRoot$1(this);
        this.setMeasurePolicy = new SubcomposeLayoutState$setMeasurePolicy$1(this);
        this.nodeToNodeState = new LinkedHashMap();
        this.slotIdToNode = new LinkedHashMap();
        this.scope = new Scope(this);
        this.precomposeMap = new LinkedHashMap();
        this.NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasurePolicy createMeasurePolicy(final Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> function2) {
        final String str = this.NoIntrinsicsMessage;
        return new LayoutNode.NoIntrinsicsMeasurePolicy(str) { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$createMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope receiver, @NotNull List<? extends Measurable> measurables, long j2) {
                SubcomposeLayoutState.Scope scope;
                SubcomposeLayoutState.Scope scope2;
                SubcomposeLayoutState.Scope scope3;
                SubcomposeLayoutState.Scope scope4;
                final int i2;
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                scope = SubcomposeLayoutState.this.scope;
                scope.setLayoutDirection(receiver.getLayoutDirection());
                scope2 = SubcomposeLayoutState.this.scope;
                scope2.setDensity(receiver.getDensity());
                scope3 = SubcomposeLayoutState.this.scope;
                scope3.setFontScale(receiver.getFontScale());
                SubcomposeLayoutState.this.currentIndex = 0;
                Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function22 = function2;
                scope4 = SubcomposeLayoutState.this.scope;
                final MeasureResult invoke = function22.invoke(scope4, Constraints.m3281boximpl(j2));
                i2 = SubcomposeLayoutState.this.currentIndex;
                final SubcomposeLayoutState subcomposeLayoutState = SubcomposeLayoutState.this;
                return new MeasureResult() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$createMeasurePolicy$1$measure$1
                    @Override // androidx.compose.ui.layout.MeasureResult
                    @NotNull
                    public Map<AlignmentLine, Integer> getAlignmentLines() {
                        return MeasureResult.this.getAlignmentLines();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return MeasureResult.this.getHeight();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return MeasureResult.this.getWidth();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        int i3;
                        subcomposeLayoutState.currentIndex = i2;
                        MeasureResult.this.placeChildren();
                        SubcomposeLayoutState subcomposeLayoutState2 = subcomposeLayoutState;
                        i3 = subcomposeLayoutState2.currentIndex;
                        subcomposeLayoutState2.disposeAfterIndex(i3);
                    }
                };
            }
        };
    }

    private final LayoutNode createNodeAt(int i2) {
        LayoutNode layoutNode = new LayoutNode(true);
        LayoutNode root = getRoot();
        root.ignoreRemeasureRequests = true;
        getRoot().insertAt$ui_release(i2, layoutNode);
        root.ignoreRemeasureRequests = false;
        return layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposeAfterIndex(int i2) {
        int size = getRoot().getFoldedChildren$ui_release().size() - this.precomposedCount;
        int max = Math.max(i2, size - this.maxSlotsToRetainForReuse);
        int i3 = size - max;
        this.reusableCount = i3;
        int i4 = i3 + max;
        int i5 = max;
        while (i5 < i4) {
            int i6 = i5 + 1;
            NodeState nodeState = this.nodeToNodeState.get(getRoot().getFoldedChildren$ui_release().get(i5));
            Intrinsics.checkNotNull(nodeState);
            this.slotIdToNode.remove(nodeState.getSlotId());
            i5 = i6;
        }
        int i7 = max - i2;
        if (i7 > 0) {
            LayoutNode root = getRoot();
            root.ignoreRemeasureRequests = true;
            int i8 = i2 + i7;
            for (int i9 = i2; i9 < i8; i9++) {
                disposeNode(getRoot().getFoldedChildren$ui_release().get(i9));
            }
            getRoot().removeAt$ui_release(i2, i7);
            root.ignoreRemeasureRequests = false;
        }
        makeSureStateIsConsistent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposeNode(LayoutNode layoutNode) {
        NodeState remove = this.nodeToNodeState.remove(layoutNode);
        Intrinsics.checkNotNull(remove);
        NodeState nodeState = remove;
        Composition composition = nodeState.getComposition();
        Intrinsics.checkNotNull(composition);
        composition.dispose();
        this.slotIdToNode.remove(nodeState.getSlotId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNode getRoot() {
        LayoutNode layoutNode = this._root;
        if (layoutNode != null) {
            return layoutNode;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void ignoreRemeasureRequests(Function0<Unit> function0) {
        LayoutNode root = getRoot();
        root.ignoreRemeasureRequests = true;
        function0.invoke();
        root.ignoreRemeasureRequests = false;
    }

    private final void makeSureStateIsConsistent() {
        if (this.nodeToNodeState.size() == getRoot().getFoldedChildren$ui_release().size()) {
            return;
        }
        throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.size() + ") and the children count on the SubcomposeLayout (" + getRoot().getFoldedChildren$ui_release().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void move(int i2, int i3, int i4) {
        LayoutNode root = getRoot();
        root.ignoreRemeasureRequests = true;
        getRoot().move$ui_release(i2, i3, i4);
        root.ignoreRemeasureRequests = false;
    }

    public static /* synthetic */ void move$default(SubcomposeLayoutState subcomposeLayoutState, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i4 = 1;
        }
        subcomposeLayoutState.move(i2, i3, i4);
    }

    private final void subcompose(LayoutNode layoutNode, NodeState nodeState) {
        layoutNode.withNoSnapshotReadObservation$ui_release(new SubcomposeLayoutState$subcompose$2(this, nodeState, layoutNode));
    }

    private final void subcompose(LayoutNode layoutNode, Object obj, Function2<? super Composer, ? super Integer, Unit> function2) {
        Map<LayoutNode, NodeState> map = this.nodeToNodeState;
        NodeState nodeState = map.get(layoutNode);
        if (nodeState == null) {
            nodeState = new NodeState(obj, ComposableSingletons$SubcomposeLayoutKt.INSTANCE.m2748getLambda1$ui_release(), null, 4, null);
            map.put(layoutNode, nodeState);
        }
        NodeState nodeState2 = nodeState;
        Composition composition = nodeState2.getComposition();
        boolean hasInvalidations = composition == null ? true : composition.getHasInvalidations();
        if (nodeState2.getContent() != function2 || hasInvalidations || nodeState2.getForceRecompose()) {
            nodeState2.setContent(function2);
            subcompose(layoutNode, nodeState2);
            nodeState2.setForceRecompose(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Composition subcomposeInto(Composition composition, LayoutNode layoutNode, CompositionContext compositionContext, Function2<? super Composer, ? super Integer, Unit> function2) {
        if (composition == null || composition.isDisposed()) {
            composition = Wrapper_androidKt.createSubcomposition(layoutNode, compositionContext);
        }
        composition.setContent(function2);
        return composition;
    }

    private final LayoutNode takeNodeFromReusables(Object obj) {
        Object value;
        if (this.reusableCount > 0) {
            int size = getRoot().getFoldedChildren$ui_release().size() - this.precomposedCount;
            int i2 = size - this.reusableCount;
            int i3 = i2;
            while (true) {
                value = MapsKt__MapsKt.getValue(this.nodeToNodeState, getRoot().getFoldedChildren$ui_release().get(i3));
                NodeState nodeState = (NodeState) value;
                if (Intrinsics.areEqual(nodeState.getSlotId(), obj)) {
                    break;
                } else if (i3 == size - 1) {
                    nodeState.setSlotId(obj);
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 != i2) {
                move(i3, i2, 1);
            }
            this.reusableCount--;
            return getRoot().getFoldedChildren$ui_release().get(i2);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void disposeCurrentNodes$ui_release() {
        for (NodeState nodeState : this.nodeToNodeState.values()) {
            Composition composition = nodeState.getComposition();
            if (composition != null) {
                composition.dispose();
            }
        }
        this.nodeToNodeState.clear();
        this.slotIdToNode.clear();
    }

    public final void forceRecomposeChildren$ui_release() {
        LayoutNode layoutNode = this._root;
        if (layoutNode != null) {
            for (Map.Entry<LayoutNode, NodeState> entry : this.nodeToNodeState.entrySet()) {
                entry.getValue().setForceRecompose(true);
            }
            if (layoutNode.getLayoutState$ui_release() != LayoutNode.LayoutState.NeedsRemeasure) {
                layoutNode.requestRemeasure$ui_release();
            }
        }
    }

    @Nullable
    public final CompositionContext getCompositionContext$ui_release() {
        return this.compositionContext;
    }

    @NotNull
    public final Function2<LayoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, Unit> getSetMeasurePolicy$ui_release() {
        return this.setMeasurePolicy;
    }

    @NotNull
    public final Function1<LayoutNode, Unit> getSetRoot$ui_release() {
        return this.setRoot;
    }

    @NotNull
    public final PrecomposedSlotHandle precompose(@Nullable final Object obj, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        makeSureStateIsConsistent();
        if (!this.slotIdToNode.containsKey(obj)) {
            Map<Object, LayoutNode> map = this.precomposeMap;
            LayoutNode layoutNode = map.get(obj);
            if (layoutNode == null) {
                if (this.reusableCount > 0) {
                    layoutNode = takeNodeFromReusables(obj);
                    move(getRoot().getFoldedChildren$ui_release().indexOf(layoutNode), getRoot().getFoldedChildren$ui_release().size(), 1);
                } else {
                    layoutNode = createNodeAt(getRoot().getFoldedChildren$ui_release().size());
                }
                this.precomposedCount++;
                map.put(obj, layoutNode);
            }
            subcompose(layoutNode, obj, content);
        }
        return new PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.SubcomposeLayoutState$precompose$1
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void dispose() {
                Map map2;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                map2 = SubcomposeLayoutState.this.precomposeMap;
                LayoutNode layoutNode2 = (LayoutNode) map2.remove(obj);
                if (layoutNode2 != null) {
                    int indexOf = SubcomposeLayoutState.this.getRoot().getFoldedChildren$ui_release().indexOf(layoutNode2);
                    if (!(indexOf != -1)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    i2 = SubcomposeLayoutState.this.reusableCount;
                    i3 = SubcomposeLayoutState.this.maxSlotsToRetainForReuse;
                    if (i2 < i3) {
                        int size = SubcomposeLayoutState.this.getRoot().getFoldedChildren$ui_release().size();
                        i6 = SubcomposeLayoutState.this.precomposedCount;
                        int i9 = size - i6;
                        i7 = SubcomposeLayoutState.this.reusableCount;
                        SubcomposeLayoutState.this.move(indexOf, i9 - i7, 1);
                        SubcomposeLayoutState subcomposeLayoutState = SubcomposeLayoutState.this;
                        i8 = subcomposeLayoutState.reusableCount;
                        subcomposeLayoutState.reusableCount = i8 + 1;
                    } else {
                        SubcomposeLayoutState subcomposeLayoutState2 = SubcomposeLayoutState.this;
                        LayoutNode root = subcomposeLayoutState2.getRoot();
                        root.ignoreRemeasureRequests = true;
                        subcomposeLayoutState2.disposeNode(layoutNode2);
                        subcomposeLayoutState2.getRoot().removeAt$ui_release(indexOf, 1);
                        root.ignoreRemeasureRequests = false;
                    }
                    i4 = SubcomposeLayoutState.this.precomposedCount;
                    if (!(i4 > 0)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    SubcomposeLayoutState subcomposeLayoutState3 = SubcomposeLayoutState.this;
                    i5 = subcomposeLayoutState3.precomposedCount;
                    subcomposeLayoutState3.precomposedCount = i5 - 1;
                }
            }
        };
    }

    public final void setCompositionContext$ui_release(@Nullable CompositionContext compositionContext) {
        this.compositionContext = compositionContext;
    }

    @NotNull
    public final List<Measurable> subcompose$ui_release(@Nullable Object obj, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        makeSureStateIsConsistent();
        LayoutNode.LayoutState layoutState$ui_release = getRoot().getLayoutState$ui_release();
        if (layoutState$ui_release == LayoutNode.LayoutState.Measuring || layoutState$ui_release == LayoutNode.LayoutState.LayingOut) {
            Map<Object, LayoutNode> map = this.slotIdToNode;
            LayoutNode layoutNode = map.get(obj);
            if (layoutNode == null) {
                layoutNode = this.precomposeMap.remove(obj);
                if (layoutNode != null) {
                    int i2 = this.precomposedCount;
                    if (!(i2 > 0)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    this.precomposedCount = i2 - 1;
                } else {
                    layoutNode = this.reusableCount > 0 ? takeNodeFromReusables(obj) : createNodeAt(this.currentIndex);
                }
                map.put(obj, layoutNode);
            }
            LayoutNode layoutNode2 = layoutNode;
            int indexOf = getRoot().getFoldedChildren$ui_release().indexOf(layoutNode2);
            int i3 = this.currentIndex;
            if (indexOf >= i3) {
                if (i3 != indexOf) {
                    move$default(this, indexOf, i3, 0, 4, null);
                }
                this.currentIndex++;
                subcompose(layoutNode2, obj, content);
                return layoutNode2.getChildren$ui_release();
            }
            throw new IllegalArgumentException("Key " + obj + " was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
        }
        throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
    }
}
