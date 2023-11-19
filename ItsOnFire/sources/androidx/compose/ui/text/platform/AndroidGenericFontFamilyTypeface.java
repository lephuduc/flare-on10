package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.annotation.GuardedBy;
import androidx.appcompat.R;
import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J-\u0010\u000e\u001a\n \u000f*\u0004\u0018\u00010\u000b0\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidGenericFontFamilyTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "fontFamily", "Landroidx/compose/ui/text/font/GenericFontFamily;", "(Landroidx/compose/ui/text/font/GenericFontFamily;)V", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "lock", "", "nativeTypeface", "Landroid/graphics/Typeface;", "styledCache", "Landroidx/collection/SparseArrayCompat;", "buildStyledTypeface", "kotlin.jvm.PlatformType", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "buildStyledTypeface-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "getNativeTypeface", "synthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "getOrPut", "getOrPut-FO1MlWM", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidGenericFontFamilyTypeface implements AndroidTypeface {
    @NotNull
    private final FontFamily fontFamily;
    @NotNull
    private final Object lock;
    @NotNull
    private final Typeface nativeTypeface;
    @GuardedBy("lock")
    @NotNull
    private final SparseArrayCompat<Typeface> styledCache;

    public AndroidGenericFontFamilyTypeface(@NotNull GenericFontFamily fontFamily) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        this.fontFamily = fontFamily;
        Typeface create = Typeface.create(fontFamily.getName(), 0);
        Intrinsics.checkNotNull(create);
        this.nativeTypeface = create;
        this.lock = new Object();
        this.styledCache = new SparseArrayCompat<>(4);
    }

    /* renamed from: buildStyledTypeface-FO1MlWM  reason: not valid java name */
    private final Typeface m3194buildStyledTypefaceFO1MlWM(FontWeight fontWeight, int i2) {
        return TypefaceAdapterHelperMethods.INSTANCE.create(this.nativeTypeface, fontWeight.getWeight(), FontStyle.m3112equalsimpl0(i2, FontStyle.Companion.m3116getItalic_LCdwA()));
    }

    @Override // androidx.compose.ui.text.font.Typeface
    @NotNull
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    @NotNull
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo3193getNativeTypefacePYhJU0U(@NotNull FontWeight fontWeight, int i2, int i3) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return m3195getOrPutFO1MlWM(fontWeight, i2);
    }

    @NotNull
    /* renamed from: getOrPut-FO1MlWM  reason: not valid java name */
    public final Typeface m3195getOrPutFO1MlWM(@NotNull FontWeight fontWeight, int i2) {
        Typeface typeface;
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        int weight = (fontWeight.getWeight() << 1) | (FontStyle.m3112equalsimpl0(i2, FontStyle.Companion.m3116getItalic_LCdwA()) ? 1 : 0);
        synchronized (this.lock) {
            typeface = this.styledCache.get(weight);
            if (typeface == null) {
                typeface = m3194buildStyledTypefaceFO1MlWM(fontWeight, i2);
                this.styledCache.append(weight, typeface);
                Intrinsics.checkNotNullExpressionValue(typeface, "buildStyledTypeface(font…nd(key, it)\n            }");
            }
        }
        return typeface;
    }
}
