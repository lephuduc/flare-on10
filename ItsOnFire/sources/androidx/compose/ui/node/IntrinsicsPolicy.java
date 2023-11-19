package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.layout.MeasurePolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010\u0010\u001a\u00020\tH\u0002J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/node/IntrinsicsPolicy;", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "measurePolicyState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/layout/MeasurePolicy;", "pendingMeasurePolicy", "maxIntrinsicHeight", "", "width", "maxIntrinsicWidth", "height", "measurePolicyFromState", "minIntrinsicHeight", "minIntrinsicWidth", "updateFrom", "", "measurePolicy", "Companion", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class IntrinsicsPolicy {
    @NotNull
    private static final Companion Companion = new Companion(null);
    @Deprecated
    @NotNull
    private static final String NoPolicyError = "Intrinsic size is queried but there is no measure policy in place.";
    @NotNull
    private final LayoutNode layoutNode;
    @Nullable
    private MutableState<MeasurePolicy> measurePolicyState;
    @Nullable
    private MeasurePolicy pendingMeasurePolicy;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/IntrinsicsPolicy$Companion;", "", "()V", "NoPolicyError", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public IntrinsicsPolicy(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
    }

    private final MeasurePolicy measurePolicyFromState() {
        MutableState<MeasurePolicy> mutableState = this.measurePolicyState;
        if (mutableState == null) {
            MeasurePolicy measurePolicy = this.pendingMeasurePolicy;
            if (measurePolicy == null) {
                throw new IllegalStateException(NoPolicyError.toString());
            }
            mutableState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(measurePolicy, null, 2, null);
        }
        this.measurePolicyState = mutableState;
        return mutableState.getValue();
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final int maxIntrinsicHeight(int i2) {
        return measurePolicyFromState().maxIntrinsicHeight(getLayoutNode().getMeasureScope$ui_release(), getLayoutNode().getChildren$ui_release(), i2);
    }

    public final int maxIntrinsicWidth(int i2) {
        return measurePolicyFromState().maxIntrinsicWidth(getLayoutNode().getMeasureScope$ui_release(), getLayoutNode().getChildren$ui_release(), i2);
    }

    public final int minIntrinsicHeight(int i2) {
        return measurePolicyFromState().minIntrinsicHeight(getLayoutNode().getMeasureScope$ui_release(), getLayoutNode().getChildren$ui_release(), i2);
    }

    public final int minIntrinsicWidth(int i2) {
        return measurePolicyFromState().minIntrinsicWidth(getLayoutNode().getMeasureScope$ui_release(), getLayoutNode().getChildren$ui_release(), i2);
    }

    public final void updateFrom(@NotNull MeasurePolicy measurePolicy) {
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        MutableState<MeasurePolicy> mutableState = this.measurePolicyState;
        if (mutableState == null) {
            this.pendingMeasurePolicy = measurePolicy;
            return;
        }
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(measurePolicy);
    }
}
