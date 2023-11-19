package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0016J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\f\u0010%\u001a\u00020\u0006*\u00020\u0006H\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/foundation/text/TextController;", "Landroidx/compose/runtime/RememberObserver;", "state", "Landroidx/compose/foundation/text/TextState;", "(Landroidx/compose/foundation/text/TextState;)V", "coreModifiers", "Landroidx/compose/ui/Modifier;", "longPressDragObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "getLongPressDragObserver", "()Landroidx/compose/foundation/text/TextDragObserver;", "setLongPressDragObserver", "(Landroidx/compose/foundation/text/TextDragObserver;)V", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "modifiers", "getModifiers", "()Landroidx/compose/ui/Modifier;", "selectionModifiers", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "getState", "()Landroidx/compose/foundation/text/TextState;", "onAbandoned", "", "onForgotten", "onRemembered", "outOfBoundary", "", "start", "Landroidx/compose/ui/geometry/Offset;", "end", "outOfBoundary-0a9Yr6o", "(JJ)Z", "update", "drawTextAndSelectionBehind", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextController implements RememberObserver {
    @NotNull
    private final Modifier coreModifiers;
    public TextDragObserver longPressDragObserver;
    @NotNull
    private final MeasurePolicy measurePolicy;
    @NotNull
    private Modifier selectionModifiers;
    @Nullable
    private SelectionRegistrar selectionRegistrar;
    @NotNull
    private final TextState state;

    public TextController(@NotNull TextState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.TextController$measurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return IntSize.m3484getHeightimpl(TextDelegate.m582layoutNN6EwU$default(TextController.this.getState().getTextDelegate(), ConstraintsKt.Constraints(0, i2, 0, Integer.MAX_VALUE), intrinsicMeasureScope.getLayoutDirection(), null, 4, null).m3059getSizeYbymL2g());
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                TextController.this.getState().getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                return TextController.this.getState().getTextDelegate().getMaxIntrinsicWidth();
            }

            /* JADX WARN: Code restructure failed: missing block: B:9:0x0070, code lost:
                r4 = r5.selectionRegistrar;
             */
            @Override // androidx.compose.ui.layout.MeasurePolicy
            @org.jetbrains.annotations.NotNull
            /* renamed from: measure-3p2s80s */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public androidx.compose.ui.layout.MeasureResult mo6measure3p2s80s(@org.jetbrains.annotations.NotNull androidx.compose.ui.layout.MeasureScope r19, @org.jetbrains.annotations.NotNull java.util.List<? extends androidx.compose.ui.layout.Measurable> r20, long r21) {
                /*
                    Method dump skipped, instructions count: 361
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextController$measurePolicy$1.mo6measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                return IntSize.m3484getHeightimpl(TextDelegate.m582layoutNN6EwU$default(TextController.this.getState().getTextDelegate(), ConstraintsKt.Constraints(0, i2, 0, Integer.MAX_VALUE), intrinsicMeasureScope.getLayoutDirection(), null, 4, null).m3059getSizeYbymL2g());
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                TextController.this.getState().getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                return TextController.this.getState().getTextDelegate().getMinIntrinsicWidth();
            }
        };
        Modifier.Companion companion = Modifier.Companion;
        this.coreModifiers = SemanticsModifierKt.semantics$default(OnGloballyPositionedModifierKt.onGloballyPositioned(drawTextAndSelectionBehind(companion), new TextController$coreModifiers$1(this)), false, new TextController$coreModifiers$2(this), 1, null);
        this.selectionModifiers = companion;
    }

    @Stable
    private final Modifier drawTextAndSelectionBehind(Modifier modifier) {
        return DrawModifierKt.drawBehind(GraphicsLayerModifierKt.m1527graphicsLayer2Xn7asI$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 16383, null), new TextController$drawTextAndSelectionBehind$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: outOfBoundary-0a9Yr6o  reason: not valid java name */
    public final boolean m575outOfBoundary0a9Yr6o(long j2, long j3) {
        TextLayoutResult layoutResult = this.state.getLayoutResult();
        if (layoutResult == null) {
            return false;
        }
        int length = layoutResult.getLayoutInput().getText().getText().length();
        int m3058getOffsetForPositionk4lQ0M = layoutResult.m3058getOffsetForPositionk4lQ0M(j2);
        int m3058getOffsetForPositionk4lQ0M2 = layoutResult.m3058getOffsetForPositionk4lQ0M(j3);
        int i2 = length - 1;
        return (m3058getOffsetForPositionk4lQ0M >= i2 && m3058getOffsetForPositionk4lQ0M2 >= i2) || (m3058getOffsetForPositionk4lQ0M < 0 && m3058getOffsetForPositionk4lQ0M2 < 0);
    }

    @NotNull
    public final TextDragObserver getLongPressDragObserver() {
        TextDragObserver textDragObserver = this.longPressDragObserver;
        if (textDragObserver != null) {
            return textDragObserver;
        }
        Intrinsics.throwUninitializedPropertyAccessException("longPressDragObserver");
        return null;
    }

    @NotNull
    public final MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    @NotNull
    public final Modifier getModifiers() {
        return this.coreModifiers.then(this.selectionModifiers);
    }

    @NotNull
    public final TextState getState() {
        return this.state;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        SelectionRegistrar selectionRegistrar;
        Selectable selectable = this.state.getSelectable();
        if (selectable == null || (selectionRegistrar = this.selectionRegistrar) == null) {
            return;
        }
        selectionRegistrar.unsubscribe(selectable);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        SelectionRegistrar selectionRegistrar;
        Selectable selectable = this.state.getSelectable();
        if (selectable == null || (selectionRegistrar = this.selectionRegistrar) == null) {
            return;
        }
        selectionRegistrar.unsubscribe(selectable);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        SelectionRegistrar selectionRegistrar = this.selectionRegistrar;
        if (selectionRegistrar == null) {
            return;
        }
        getState().setSelectable(selectionRegistrar.subscribe(new MultiWidgetSelectionDelegate(getState().getSelectableId(), new TextController$onRemembered$1$1(this), new TextController$onRemembered$1$2(this))));
    }

    public final void setLongPressDragObserver(@NotNull TextDragObserver textDragObserver) {
        Intrinsics.checkNotNullParameter(textDragObserver, "<set-?>");
        this.longPressDragObserver = textDragObserver;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.text.TextController$update$mouseSelectionObserver$1, java.lang.Object] */
    public final void update(@Nullable final SelectionRegistrar selectionRegistrar) {
        Modifier modifier;
        this.selectionRegistrar = selectionRegistrar;
        if (selectionRegistrar == null) {
            modifier = Modifier.Companion;
        } else if (TouchMode_androidKt.isInTouchMode()) {
            setLongPressDragObserver(new TextDragObserver() { // from class: androidx.compose.foundation.text.TextController$update$1
                private long dragTotalDistance;
                private long lastPosition;

                {
                    Offset.Companion companion = Offset.Companion;
                    this.lastPosition = companion.m1177getZeroF1C5BW0();
                    this.dragTotalDistance = companion.m1177getZeroF1C5BW0();
                }

                public final long getDragTotalDistance() {
                    return this.dragTotalDistance;
                }

                public final long getLastPosition() {
                    return this.lastPosition;
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onCancel() {
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar, TextController.this.getState().getSelectableId())) {
                        selectionRegistrar.notifySelectionUpdateEnd();
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* renamed from: onDrag-k-4lQ0M  reason: not valid java name */
                public void mo576onDragk4lQ0M(long j2) {
                    boolean m575outOfBoundary0a9Yr6o;
                    LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                    if (layoutCoordinates == null) {
                        return;
                    }
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    TextController textController = TextController.this;
                    if (layoutCoordinates.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId())) {
                        setDragTotalDistance(Offset.m1166plusMKHz9U(getDragTotalDistance(), j2));
                        long m1166plusMKHz9U = Offset.m1166plusMKHz9U(getLastPosition(), getDragTotalDistance());
                        m575outOfBoundary0a9Yr6o = textController.m575outOfBoundary0a9Yr6o(getLastPosition(), m1166plusMKHz9U);
                        if (m575outOfBoundary0a9Yr6o || !selectionRegistrar2.mo671notifySelectionUpdate5iVPX68(layoutCoordinates, m1166plusMKHz9U, getLastPosition(), false, SelectionAdjustment.Companion.getCharacterWithWordAccelerate())) {
                            return;
                        }
                        setLastPosition(m1166plusMKHz9U);
                        setDragTotalDistance(Offset.Companion.m1177getZeroF1C5BW0());
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* renamed from: onStart-k-4lQ0M  reason: not valid java name */
                public void mo577onStartk4lQ0M(long j2) {
                    boolean m575outOfBoundary0a9Yr6o;
                    LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                    if (layoutCoordinates != null) {
                        TextController textController = TextController.this;
                        SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                        if (!layoutCoordinates.isAttached()) {
                            return;
                        }
                        m575outOfBoundary0a9Yr6o = textController.m575outOfBoundary0a9Yr6o(j2, j2);
                        if (m575outOfBoundary0a9Yr6o) {
                            selectionRegistrar2.notifySelectionUpdateSelectAll(textController.getState().getSelectableId());
                        } else {
                            selectionRegistrar2.mo672notifySelectionUpdateStartd4ec7I(layoutCoordinates, j2, SelectionAdjustment.Companion.getWord());
                        }
                        setLastPosition(j2);
                    }
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar, TextController.this.getState().getSelectableId())) {
                        this.dragTotalDistance = Offset.Companion.m1177getZeroF1C5BW0();
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onStop() {
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar, TextController.this.getState().getSelectableId())) {
                        selectionRegistrar.notifySelectionUpdateEnd();
                    }
                }

                public final void setDragTotalDistance(long j2) {
                    this.dragTotalDistance = j2;
                }

                public final void setLastPosition(long j2) {
                    this.lastPosition = j2;
                }
            });
            modifier = SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, getLongPressDragObserver(), new TextController$update$2(this, null));
        } else {
            ?? r0 = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.TextController$update$mouseSelectionObserver$1
                private long lastPosition = Offset.Companion.m1177getZeroF1C5BW0();

                public final long getLastPosition() {
                    return this.lastPosition;
                }

                @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
                /* renamed from: onDrag-3MmeM6k  reason: not valid java name */
                public boolean mo578onDrag3MmeM6k(long j2, @NotNull SelectionAdjustment adjustment) {
                    Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                    LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                    if (layoutCoordinates != null) {
                        SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                        TextController textController = TextController.this;
                        if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId())) {
                            return false;
                        }
                        if (selectionRegistrar2.mo671notifySelectionUpdate5iVPX68(layoutCoordinates, j2, getLastPosition(), false, adjustment)) {
                            setLastPosition(j2);
                        }
                    }
                    return true;
                }

                @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
                /* renamed from: onExtend-k-4lQ0M  reason: not valid java name */
                public boolean mo579onExtendk4lQ0M(long j2) {
                    LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                    if (layoutCoordinates == null) {
                        return false;
                    }
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    TextController textController = TextController.this;
                    if (layoutCoordinates.isAttached()) {
                        if (selectionRegistrar2.mo671notifySelectionUpdate5iVPX68(layoutCoordinates, j2, getLastPosition(), false, SelectionAdjustment.Companion.getNone())) {
                            setLastPosition(j2);
                        }
                        return SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId());
                    }
                    return false;
                }

                @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
                /* renamed from: onExtendDrag-k-4lQ0M  reason: not valid java name */
                public boolean mo580onExtendDragk4lQ0M(long j2) {
                    LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                    if (layoutCoordinates == null) {
                        return true;
                    }
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    TextController textController = TextController.this;
                    if (layoutCoordinates.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId())) {
                        if (selectionRegistrar2.mo671notifySelectionUpdate5iVPX68(layoutCoordinates, j2, getLastPosition(), false, SelectionAdjustment.Companion.getNone())) {
                            setLastPosition(j2);
                            return true;
                        }
                        return true;
                    }
                    return false;
                }

                @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
                /* renamed from: onStart-3MmeM6k  reason: not valid java name */
                public boolean mo581onStart3MmeM6k(long j2, @NotNull SelectionAdjustment adjustment) {
                    Intrinsics.checkNotNullParameter(adjustment, "adjustment");
                    LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                    if (layoutCoordinates == null) {
                        return false;
                    }
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    TextController textController = TextController.this;
                    if (layoutCoordinates.isAttached()) {
                        selectionRegistrar2.mo672notifySelectionUpdateStartd4ec7I(layoutCoordinates, j2, adjustment);
                        setLastPosition(j2);
                        return SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId());
                    }
                    return false;
                }

                public final void setLastPosition(long j2) {
                    this.lastPosition = j2;
                }
            };
            modifier = PointerIconKt.pointerHoverIcon$default(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, (Object) r0, new TextController$update$3(r0, null)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
        }
        this.selectionModifiers = modifier;
    }
}
