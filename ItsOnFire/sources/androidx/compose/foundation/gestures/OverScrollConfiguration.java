package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B&\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/gestures/OverScrollConfiguration;", "", "glowColor", "Landroidx/compose/ui/graphics/Color;", "forceShowAlways", "", "drawPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "(JZLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDrawPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "getForceShowAlways", "()Z", "getGlowColor-0d7_KjU", "()J", "J", "equals", "other", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class OverScrollConfiguration {
    @NotNull
    private final PaddingValues drawPadding;
    private final boolean forceShowAlways;
    private final long glowColor;

    private OverScrollConfiguration(long j2, boolean z, PaddingValues paddingValues) {
        this.glowColor = j2;
        this.forceShowAlways = z;
        this.drawPadding = paddingValues;
    }

    public /* synthetic */ OverScrollConfiguration(long j2, boolean z, PaddingValues paddingValues, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ColorKt.Color(4284900966L) : j2, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? PaddingKt.m359PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null) : paddingValues, null);
    }

    public /* synthetic */ OverScrollConfiguration(long j2, boolean z, PaddingValues paddingValues, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, z, paddingValues);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (Intrinsics.areEqual(OverScrollConfiguration.class, obj == null ? null : obj.getClass())) {
            if (obj != null) {
                OverScrollConfiguration overScrollConfiguration = (OverScrollConfiguration) obj;
                return Color.m1393equalsimpl0(m257getGlowColor0d7_KjU(), overScrollConfiguration.m257getGlowColor0d7_KjU()) && this.forceShowAlways == overScrollConfiguration.forceShowAlways && Intrinsics.areEqual(this.drawPadding, overScrollConfiguration.drawPadding);
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.foundation.gestures.OverScrollConfiguration");
        }
        return false;
    }

    @NotNull
    public final PaddingValues getDrawPadding() {
        return this.drawPadding;
    }

    public final boolean getForceShowAlways() {
        return this.forceShowAlways;
    }

    /* renamed from: getGlowColor-0d7_KjU  reason: not valid java name */
    public final long m257getGlowColor0d7_KjU() {
        return this.glowColor;
    }

    public int hashCode() {
        return (((Color.m1399hashCodeimpl(m257getGlowColor0d7_KjU()) * 31) + Boolean.hashCode(this.forceShowAlways)) * 31) + this.drawPadding.hashCode();
    }

    @NotNull
    public String toString() {
        return "OverScrollConfiguration(glowColor=" + ((Object) Color.m1400toStringimpl(m257getGlowColor0d7_KjU())) + ", forceShowAlways=" + this.forceShowAlways + ", drawPadding=" + this.drawPadding + ')';
    }
}
