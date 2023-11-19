package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007J1\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u001c\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000e\u0010\t\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/Placeholder;", "", "width", "Landroidx/compose/ui/unit/TextUnit;", "height", "placeholderVerticalAlign", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "(JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHeight-XSAIIZE", "()J", "J", "getPlaceholderVerticalAlign-J6kI3mc", "()I", "I", "getWidth-XSAIIZE", "copy", "copy-K8Q-__8", "(JJI)Landroidx/compose/ui/text/Placeholder;", "equals", "", "other", "hashCode", "", "toString", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class Placeholder {
    private final long height;
    private final int placeholderVerticalAlign;
    private final long width;

    private Placeholder(long j2, long j3, int i2) {
        this.width = j2;
        this.height = j3;
        this.placeholderVerticalAlign = i2;
        if (!(!TextUnitKt.m3524isUnspecifiedR2X_6o(m3017getWidthXSAIIZE()))) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified".toString());
        }
        if (!(!TextUnitKt.m3524isUnspecifiedR2X_6o(m3015getHeightXSAIIZE()))) {
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified".toString());
        }
    }

    public /* synthetic */ Placeholder(long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, i2);
    }

    /* renamed from: copy-K8Q-__8$default  reason: not valid java name */
    public static /* synthetic */ Placeholder m3013copyK8Q__8$default(Placeholder placeholder, long j2, long j3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j2 = placeholder.m3017getWidthXSAIIZE();
        }
        long j4 = j2;
        if ((i3 & 2) != 0) {
            j3 = placeholder.m3015getHeightXSAIIZE();
        }
        long j5 = j3;
        if ((i3 & 4) != 0) {
            i2 = placeholder.m3016getPlaceholderVerticalAlignJ6kI3mc();
        }
        return placeholder.m3014copyK8Q__8(j4, j5, i2);
    }

    @NotNull
    /* renamed from: copy-K8Q-__8  reason: not valid java name */
    public final Placeholder m3014copyK8Q__8(long j2, long j3, int i2) {
        return new Placeholder(j2, j3, i2, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Placeholder) {
            Placeholder placeholder = (Placeholder) obj;
            return TextUnit.m3503equalsimpl0(m3017getWidthXSAIIZE(), placeholder.m3017getWidthXSAIIZE()) && TextUnit.m3503equalsimpl0(m3015getHeightXSAIIZE(), placeholder.m3015getHeightXSAIIZE()) && PlaceholderVerticalAlign.m3021equalsimpl0(m3016getPlaceholderVerticalAlignJ6kI3mc(), placeholder.m3016getPlaceholderVerticalAlignJ6kI3mc());
        }
        return false;
    }

    /* renamed from: getHeight-XSAIIZE  reason: not valid java name */
    public final long m3015getHeightXSAIIZE() {
        return this.height;
    }

    /* renamed from: getPlaceholderVerticalAlign-J6kI3mc  reason: not valid java name */
    public final int m3016getPlaceholderVerticalAlignJ6kI3mc() {
        return this.placeholderVerticalAlign;
    }

    /* renamed from: getWidth-XSAIIZE  reason: not valid java name */
    public final long m3017getWidthXSAIIZE() {
        return this.width;
    }

    public int hashCode() {
        return (((TextUnit.m3507hashCodeimpl(m3017getWidthXSAIIZE()) * 31) + TextUnit.m3507hashCodeimpl(m3015getHeightXSAIIZE())) * 31) + PlaceholderVerticalAlign.m3022hashCodeimpl(m3016getPlaceholderVerticalAlignJ6kI3mc());
    }

    @NotNull
    public String toString() {
        return "Placeholder(width=" + ((Object) TextUnit.m3513toStringimpl(m3017getWidthXSAIIZE())) + ", height=" + ((Object) TextUnit.m3513toStringimpl(m3015getHeightXSAIIZE())) + ", placeholderVerticalAlign=" + ((Object) PlaceholderVerticalAlign.m3023toStringimpl(m3016getPlaceholderVerticalAlignJ6kI3mc())) + ')';
    }
}
