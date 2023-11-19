package androidx.compose.foundation.relocation;

import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalFoundationApi
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewData;", "", "bringRectangleOnScreenRequester", "Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;", "parent", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "(Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;Landroidx/compose/foundation/relocation/BringIntoViewResponder;Landroidx/compose/ui/layout/LayoutCoordinates;)V", "getBringRectangleOnScreenRequester", "()Landroidx/compose/foundation/relocation/BringRectangleOnScreenRequester;", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "getParent", "()Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "setParent", "(Landroidx/compose/foundation/relocation/BringIntoViewResponder;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
final class BringIntoViewData {
    @NotNull
    private final BringRectangleOnScreenRequester bringRectangleOnScreenRequester;
    @Nullable
    private LayoutCoordinates layoutCoordinates;
    @NotNull
    private BringIntoViewResponder parent;

    public BringIntoViewData(@NotNull BringRectangleOnScreenRequester bringRectangleOnScreenRequester, @NotNull BringIntoViewResponder parent, @Nullable LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(bringRectangleOnScreenRequester, "bringRectangleOnScreenRequester");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.bringRectangleOnScreenRequester = bringRectangleOnScreenRequester;
        this.parent = parent;
        this.layoutCoordinates = layoutCoordinates;
    }

    public /* synthetic */ BringIntoViewData(BringRectangleOnScreenRequester bringRectangleOnScreenRequester, BringIntoViewResponder bringIntoViewResponder, LayoutCoordinates layoutCoordinates, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bringRectangleOnScreenRequester, (i2 & 2) != 0 ? BringIntoViewResponder.Companion.getRootBringIntoViewResponder() : bringIntoViewResponder, (i2 & 4) != 0 ? null : layoutCoordinates);
    }

    public static /* synthetic */ BringIntoViewData copy$default(BringIntoViewData bringIntoViewData, BringRectangleOnScreenRequester bringRectangleOnScreenRequester, BringIntoViewResponder bringIntoViewResponder, LayoutCoordinates layoutCoordinates, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bringRectangleOnScreenRequester = bringIntoViewData.bringRectangleOnScreenRequester;
        }
        if ((i2 & 2) != 0) {
            bringIntoViewResponder = bringIntoViewData.parent;
        }
        if ((i2 & 4) != 0) {
            layoutCoordinates = bringIntoViewData.layoutCoordinates;
        }
        return bringIntoViewData.copy(bringRectangleOnScreenRequester, bringIntoViewResponder, layoutCoordinates);
    }

    @NotNull
    public final BringRectangleOnScreenRequester component1() {
        return this.bringRectangleOnScreenRequester;
    }

    @NotNull
    public final BringIntoViewResponder component2() {
        return this.parent;
    }

    @Nullable
    public final LayoutCoordinates component3() {
        return this.layoutCoordinates;
    }

    @NotNull
    public final BringIntoViewData copy(@NotNull BringRectangleOnScreenRequester bringRectangleOnScreenRequester, @NotNull BringIntoViewResponder parent, @Nullable LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(bringRectangleOnScreenRequester, "bringRectangleOnScreenRequester");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new BringIntoViewData(bringRectangleOnScreenRequester, parent, layoutCoordinates);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewData) {
            BringIntoViewData bringIntoViewData = (BringIntoViewData) obj;
            return Intrinsics.areEqual(this.bringRectangleOnScreenRequester, bringIntoViewData.bringRectangleOnScreenRequester) && Intrinsics.areEqual(this.parent, bringIntoViewData.parent) && Intrinsics.areEqual(this.layoutCoordinates, bringIntoViewData.layoutCoordinates);
        }
        return false;
    }

    @NotNull
    public final BringRectangleOnScreenRequester getBringRectangleOnScreenRequester() {
        return this.bringRectangleOnScreenRequester;
    }

    @Nullable
    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    @NotNull
    public final BringIntoViewResponder getParent() {
        return this.parent;
    }

    public int hashCode() {
        int hashCode = ((this.bringRectangleOnScreenRequester.hashCode() * 31) + this.parent.hashCode()) * 31;
        LayoutCoordinates layoutCoordinates = this.layoutCoordinates;
        return hashCode + (layoutCoordinates == null ? 0 : layoutCoordinates.hashCode());
    }

    public final void setLayoutCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }

    public final void setParent(@NotNull BringIntoViewResponder bringIntoViewResponder) {
        Intrinsics.checkNotNullParameter(bringIntoViewResponder, "<set-?>");
        this.parent = bringIntoViewResponder;
    }

    @NotNull
    public String toString() {
        return "BringIntoViewData(bringRectangleOnScreenRequester=" + this.bringRectangleOnScreenRequester + ", parent=" + this.parent + ", layoutCoordinates=" + this.layoutCoordinates + ')';
    }
}
