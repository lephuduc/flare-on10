package androidx.compose.ui.semantics;

import androidx.appcompat.R;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatingLayoutNodeWrapper;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0006\u0010\u001a\u001a\u00020\u001bR\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsWrapper;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "semanticsModifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/semantics/SemanticsModifier;)V", "useMinimumTouchTarget", "", "getUseMinimumTouchTarget", "()Z", "collapsedSemanticsConfiguration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "detach", "", "hitTestSemantics", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitSemanticsWrappers", "Landroidx/compose/ui/node/HitTestResult;", "isInLayer", "hitTestSemantics-9KIMszo", "(JLandroidx/compose/ui/node/HitTestResult;Z)V", "onModifierChanged", "toString", "", "touchBoundsInRoot", "Landroidx/compose/ui/geometry/Rect;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SemanticsWrapper extends DelegatingLayoutNodeWrapper<SemanticsModifier> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SemanticsWrapper(@NotNull LayoutNodeWrapper wrapped, @NotNull SemanticsModifier semanticsModifier) {
        super(wrapped, semanticsModifier);
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        Intrinsics.checkNotNullParameter(semanticsModifier, "semanticsModifier");
    }

    private final boolean getUseMinimumTouchTarget() {
        return SemanticsConfigurationKt.getOrNull(getModifier().getSemanticsConfiguration(), SemanticsActions.INSTANCE.getOnClick()) != null;
    }

    @NotNull
    public final SemanticsConfiguration collapsedSemanticsConfiguration() {
        SemanticsWrapper semanticsWrapper;
        LayoutNodeWrapper wrapped$ui_release = getWrapped$ui_release();
        while (true) {
            if (wrapped$ui_release == null) {
                semanticsWrapper = null;
                break;
            } else if (wrapped$ui_release instanceof SemanticsWrapper) {
                semanticsWrapper = (SemanticsWrapper) wrapped$ui_release;
                break;
            } else {
                wrapped$ui_release = wrapped$ui_release.getWrapped$ui_release();
            }
        }
        if (semanticsWrapper == null || getModifier().getSemanticsConfiguration().isClearingSemantics()) {
            return getModifier().getSemanticsConfiguration();
        }
        SemanticsConfiguration copy = getModifier().getSemanticsConfiguration().copy();
        copy.collapsePeer$ui_release(semanticsWrapper.collapsedSemanticsConfiguration());
        return copy;
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void detach() {
        super.detach();
        Owner owner$ui_release = getLayoutNode$ui_release().getOwner$ui_release();
        if (owner$ui_release == null) {
            return;
        }
        owner$ui_release.onSemanticsChange();
    }

    @Override // androidx.compose.ui.node.DelegatingLayoutNodeWrapper, androidx.compose.ui.node.LayoutNodeWrapper
    /* renamed from: hitTestSemantics-9KIMszo */
    public void mo2851hitTestSemantics9KIMszo(long j2, @NotNull HitTestResult<SemanticsWrapper> hitSemanticsWrappers, boolean z) {
        Intrinsics.checkNotNullParameter(hitSemanticsWrappers, "hitSemanticsWrappers");
        m2850hitTestInMinimumTouchTarget7362WCg(j2, hitSemanticsWrappers, false, true, z, this, new SemanticsWrapper$hitTestSemantics$1(this, j2, hitSemanticsWrappers));
    }

    @Override // androidx.compose.ui.node.LayoutNodeWrapper
    public void onModifierChanged() {
        super.onModifierChanged();
        Owner owner$ui_release = getLayoutNode$ui_release().getOwner$ui_release();
        if (owner$ui_release == null) {
            return;
        }
        owner$ui_release.onSemanticsChange();
    }

    @NotNull
    public String toString() {
        return super.toString() + " id: " + getModifier().getId() + " config: " + getModifier().getSemanticsConfiguration();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.node.LayoutNodeWrapper] */
    /* JADX WARN: Type inference failed for: r6v7 */
    @NotNull
    public final Rect touchBoundsInRoot() {
        if (isAttached()) {
            if (getUseMinimumTouchTarget()) {
                LayoutCoordinates findRoot = LayoutCoordinatesKt.findRoot(this);
                MutableRect rectCache = getRectCache();
                long m2878calculateMinimumTouchTargetPaddingE7KxVPU = m2878calculateMinimumTouchTargetPaddingE7KxVPU(m2881getMinimumTouchTargetSizeNHjbRc());
                rectCache.setLeft(-Size.m1230getWidthimpl(m2878calculateMinimumTouchTargetPaddingE7KxVPU));
                rectCache.setTop(-Size.m1227getHeightimpl(m2878calculateMinimumTouchTargetPaddingE7KxVPU));
                rectCache.setRight(getMeasuredWidth() + Size.m1230getWidthimpl(m2878calculateMinimumTouchTargetPaddingE7KxVPU));
                rectCache.setBottom(getMeasuredHeight() + Size.m1227getHeightimpl(m2878calculateMinimumTouchTargetPaddingE7KxVPU));
                ?? r6 = this;
                while (r6 != findRoot) {
                    r6.rectInParent$ui_release(rectCache, false, true);
                    if (!rectCache.isEmpty()) {
                        LayoutNodeWrapper wrappedBy$ui_release = r6.getWrappedBy$ui_release();
                        Intrinsics.checkNotNull(wrappedBy$ui_release);
                        r6 = wrappedBy$ui_release;
                    }
                }
                return MutableRectKt.toRect(rectCache);
            }
            return LayoutCoordinatesKt.boundsInRoot(this);
        }
        return Rect.Companion.getZero();
    }
}
