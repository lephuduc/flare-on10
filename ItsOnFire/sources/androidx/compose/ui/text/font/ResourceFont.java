package androidx.compose.ui.text.font;

import androidx.appcompat.R;
import androidx.appcompat.widget.ActivityChooserModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B&\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ1\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0006\u001a\u00020\u0007X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/font/ResourceFont;", "Landroidx/compose/ui/text/font/Font;", "resId", "", ActivityChooserModel.ATTRIBUTE_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "(ILandroidx/compose/ui/text/font/FontWeight;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getResId", "()I", "getStyle-_-LCdwA", "I", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "copy", "copy-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/ResourceFont;", "equals", "", "other", "", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ResourceFont implements Font {
    private final int resId;
    private final int style;
    @NotNull
    private final FontWeight weight;

    private ResourceFont(int i2, FontWeight fontWeight, int i3) {
        this.resId = i2;
        this.weight = fontWeight;
        this.style = i3;
    }

    public /* synthetic */ ResourceFont(int i2, FontWeight fontWeight, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (i4 & 2) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i4 & 4) != 0 ? FontStyle.Companion.m3117getNormal_LCdwA() : i3, null);
    }

    public /* synthetic */ ResourceFont(int i2, FontWeight fontWeight, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, fontWeight, i3);
    }

    /* renamed from: copy-RetOiIg$default  reason: not valid java name */
    public static /* synthetic */ ResourceFont m3131copyRetOiIg$default(ResourceFont resourceFont, int i2, FontWeight fontWeight, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = resourceFont.resId;
        }
        if ((i4 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i4 & 4) != 0) {
            i3 = resourceFont.mo3097getStyle_LCdwA();
        }
        return resourceFont.m3132copyRetOiIg(i2, fontWeight, i3);
    }

    @NotNull
    /* renamed from: copy-RetOiIg  reason: not valid java name */
    public final ResourceFont m3132copyRetOiIg(int i2, @NotNull FontWeight weight, int i3) {
        Intrinsics.checkNotNullParameter(weight, "weight");
        return new ResourceFont(i2, weight, i3, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ResourceFont) {
            ResourceFont resourceFont = (ResourceFont) obj;
            return this.resId == resourceFont.resId && Intrinsics.areEqual(getWeight(), resourceFont.getWeight()) && FontStyle.m3112equalsimpl0(mo3097getStyle_LCdwA(), resourceFont.mo3097getStyle_LCdwA());
        }
        return false;
    }

    public final int getResId() {
        return this.resId;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA */
    public int mo3097getStyle_LCdwA() {
        return this.style;
    }

    @Override // androidx.compose.ui.text.font.Font
    @NotNull
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((this.resId * 31) + getWeight().hashCode()) * 31) + FontStyle.m3113hashCodeimpl(mo3097getStyle_LCdwA());
    }

    @NotNull
    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m3114toStringimpl(mo3097getStyle_LCdwA())) + ')';
    }
}
