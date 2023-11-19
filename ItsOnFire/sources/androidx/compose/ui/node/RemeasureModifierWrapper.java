package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/RemeasureModifierWrapper;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/layout/OnRemeasuredModifier;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "modifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/layout/OnRemeasuredModifier;)V", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class RemeasureModifierWrapper extends DelegatingLayoutNodeWrapper<OnRemeasuredModifier> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemeasureModifierWrapper(@NotNull LayoutNodeWrapper wrapped, @NotNull OnRemeasuredModifier modifier) {
        super(wrapped, modifier);
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.layout.Measurable
    @NotNull
    /* renamed from: measure-BRTryo0 */
    public Placeable mo2758measureBRTryo0(long j2) {
        OwnerSnapshotObserver snapshotObserver;
        Placeable mo2758measureBRTryo0 = super.mo2758measureBRTryo0(j2);
        RemeasureModifierWrapper$measure$invokeRemeasureCallbacks$1 remeasureModifierWrapper$measure$invokeRemeasureCallbacks$1 = new RemeasureModifierWrapper$measure$invokeRemeasureCallbacks$1(this);
        Owner owner$ui_release = getLayoutNode$ui_release().getOwner$ui_release();
        Unit unit = null;
        if (owner$ui_release != null && (snapshotObserver = owner$ui_release.getSnapshotObserver()) != null) {
            snapshotObserver.withNoSnapshotReadObservation$ui_release(remeasureModifierWrapper$measure$invokeRemeasureCallbacks$1);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            remeasureModifierWrapper$measure$invokeRemeasureCallbacks$1.invoke();
        }
        return mo2758measureBRTryo0;
    }
}
