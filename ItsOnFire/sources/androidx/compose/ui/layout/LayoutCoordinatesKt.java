package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0002H\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u0012\u0010\t\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u001a\u0012\u0010\n\u001a\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsInRoot", "boundsInWindow", "findRoot", "positionInParent", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInRoot", "positionInWindow", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LayoutCoordinatesKt {
    @NotNull
    public static final Rect boundsInParent(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        Rect localBoundingBoxOf$default = parentLayoutCoordinates != null ? LayoutCoordinates.DefaultImpls.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null) : null;
        return localBoundingBoxOf$default == null ? new Rect(0.0f, 0.0f, IntSize.m3485getWidthimpl(layoutCoordinates.mo2772getSizeYbymL2g()), IntSize.m3484getHeightimpl(layoutCoordinates.mo2772getSizeYbymL2g())) : localBoundingBoxOf$default;
    }

    @NotNull
    public static final Rect boundsInRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return LayoutCoordinates.DefaultImpls.localBoundingBoxOf$default(findRoot(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    @NotNull
    public static final Rect boundsInWindow(@NotNull LayoutCoordinates layoutCoordinates) {
        float minOf;
        float minOf2;
        float maxOf;
        float maxOf2;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates findRoot = findRoot(layoutCoordinates);
        Rect boundsInRoot = boundsInRoot(layoutCoordinates);
        long mo2775localToWindowMKHz9U = findRoot.mo2775localToWindowMKHz9U(OffsetKt.Offset(boundsInRoot.getLeft(), boundsInRoot.getTop()));
        long mo2775localToWindowMKHz9U2 = findRoot.mo2775localToWindowMKHz9U(OffsetKt.Offset(boundsInRoot.getRight(), boundsInRoot.getTop()));
        long mo2775localToWindowMKHz9U3 = findRoot.mo2775localToWindowMKHz9U(OffsetKt.Offset(boundsInRoot.getRight(), boundsInRoot.getBottom()));
        long mo2775localToWindowMKHz9U4 = findRoot.mo2775localToWindowMKHz9U(OffsetKt.Offset(boundsInRoot.getLeft(), boundsInRoot.getBottom()));
        minOf = ComparisonsKt___ComparisonsJvmKt.minOf(Offset.m1161getXimpl(mo2775localToWindowMKHz9U), Offset.m1161getXimpl(mo2775localToWindowMKHz9U2), Offset.m1161getXimpl(mo2775localToWindowMKHz9U4), Offset.m1161getXimpl(mo2775localToWindowMKHz9U3));
        minOf2 = ComparisonsKt___ComparisonsJvmKt.minOf(Offset.m1162getYimpl(mo2775localToWindowMKHz9U), Offset.m1162getYimpl(mo2775localToWindowMKHz9U2), Offset.m1162getYimpl(mo2775localToWindowMKHz9U4), Offset.m1162getYimpl(mo2775localToWindowMKHz9U3));
        maxOf = ComparisonsKt___ComparisonsJvmKt.maxOf(Offset.m1161getXimpl(mo2775localToWindowMKHz9U), Offset.m1161getXimpl(mo2775localToWindowMKHz9U2), Offset.m1161getXimpl(mo2775localToWindowMKHz9U4), Offset.m1161getXimpl(mo2775localToWindowMKHz9U3));
        maxOf2 = ComparisonsKt___ComparisonsJvmKt.maxOf(Offset.m1162getYimpl(mo2775localToWindowMKHz9U), Offset.m1162getYimpl(mo2775localToWindowMKHz9U2), Offset.m1162getYimpl(mo2775localToWindowMKHz9U4), Offset.m1162getYimpl(mo2775localToWindowMKHz9U3));
        return new Rect(minOf, minOf2, maxOf, maxOf2);
    }

    @NotNull
    public static final LayoutCoordinates findRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        LayoutNodeWrapper layoutNodeWrapper;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        do {
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        } while (layoutCoordinates != null);
        LayoutNodeWrapper layoutNodeWrapper2 = layoutCoordinates2 instanceof LayoutNodeWrapper ? (LayoutNodeWrapper) layoutCoordinates2 : null;
        if (layoutNodeWrapper2 == null) {
            return layoutCoordinates2;
        }
        do {
            layoutNodeWrapper = layoutNodeWrapper2;
            layoutNodeWrapper2 = layoutNodeWrapper2.getWrappedBy$ui_release();
        } while (layoutNodeWrapper2 != null);
        return layoutNodeWrapper;
    }

    public static final long positionInParent(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        Offset m1150boximpl = parentLayoutCoordinates == null ? null : Offset.m1150boximpl(parentLayoutCoordinates.mo2773localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m1177getZeroF1C5BW0()));
        return m1150boximpl == null ? Offset.Companion.m1177getZeroF1C5BW0() : m1150boximpl.m1171unboximpl();
    }

    public static final long positionInRoot(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return layoutCoordinates.mo2774localToRootMKHz9U(Offset.Companion.m1177getZeroF1C5BW0());
    }

    public static final long positionInWindow(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return layoutCoordinates.mo2775localToWindowMKHz9U(Offset.Companion.m1177getZeroF1C5BW0());
    }
}
