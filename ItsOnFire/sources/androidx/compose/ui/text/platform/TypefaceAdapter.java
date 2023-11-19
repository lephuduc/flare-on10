package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.appcompat.R;
import androidx.collection.LruCache;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.DefaultFontFamily;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontMatcher;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.text.font.ResourceFont;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0010\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J?\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00172\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/platform/TypefaceAdapter;", "", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "(Landroidx/compose/ui/text/font/FontMatcher;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "getResourceLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "create", "Landroid/graphics/Typeface;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "create-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/FontListFontFamily;", "create-xC2X5gM", "(ILandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontListFontFamily;I)Landroid/graphics/Typeface;", "genericFontFamily", "", "create-RetOiIg", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "CacheKey", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public class TypefaceAdapter {
    @NotNull
    private final FontMatcher fontMatcher;
    @NotNull
    private final Font.ResourceLoader resourceLoader;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final FontWeight ANDROID_BOLD = FontWeight.Companion.getW600();
    @NotNull
    private static final LruCache<CacheKey, Typeface> typefaceCache = new LruCache<>(16);

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B,\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\u0015\u001a\u00020\u0007HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u0019\u0010\u0017\u001a\u00020\tHÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ@\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/text/platform/TypefaceAdapter$CacheKey;", "", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontStyle-_-LCdwA", "()I", "I", "getFontSynthesis-GVVA2EU", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "component1", "component2", "component3", "component3-_-LCdwA", "component4", "component4-GVVA2EU", "copy", "copy-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/ui/text/platform/TypefaceAdapter$CacheKey;", "equals", "", "other", "hashCode", "", "toString", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class CacheKey {
        @Nullable
        private final FontFamily fontFamily;
        private final int fontStyle;
        private final int fontSynthesis;
        @NotNull
        private final FontWeight fontWeight;

        private CacheKey(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3) {
            this.fontFamily = fontFamily;
            this.fontWeight = fontWeight;
            this.fontStyle = i2;
            this.fontSynthesis = i3;
        }

        public /* synthetic */ CacheKey(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? null : fontFamily, fontWeight, i2, i3, null);
        }

        public /* synthetic */ CacheKey(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(fontFamily, fontWeight, i2, i3);
        }

        /* renamed from: copy-DPcqOEQ$default  reason: not valid java name */
        public static /* synthetic */ CacheKey m3207copyDPcqOEQ$default(CacheKey cacheKey, FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                fontFamily = cacheKey.fontFamily;
            }
            if ((i4 & 2) != 0) {
                fontWeight = cacheKey.fontWeight;
            }
            if ((i4 & 4) != 0) {
                i2 = cacheKey.fontStyle;
            }
            if ((i4 & 8) != 0) {
                i3 = cacheKey.fontSynthesis;
            }
            return cacheKey.m3210copyDPcqOEQ(fontFamily, fontWeight, i2, i3);
        }

        @Nullable
        public final FontFamily component1() {
            return this.fontFamily;
        }

        @NotNull
        public final FontWeight component2() {
            return this.fontWeight;
        }

        /* renamed from: component3-_-LCdwA  reason: not valid java name */
        public final int m3208component3_LCdwA() {
            return this.fontStyle;
        }

        /* renamed from: component4-GVVA2EU  reason: not valid java name */
        public final int m3209component4GVVA2EU() {
            return this.fontSynthesis;
        }

        @NotNull
        /* renamed from: copy-DPcqOEQ  reason: not valid java name */
        public final CacheKey m3210copyDPcqOEQ(@Nullable FontFamily fontFamily, @NotNull FontWeight fontWeight, int i2, int i3) {
            Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
            return new CacheKey(fontFamily, fontWeight, i2, i3, null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CacheKey) {
                CacheKey cacheKey = (CacheKey) obj;
                return Intrinsics.areEqual(this.fontFamily, cacheKey.fontFamily) && Intrinsics.areEqual(this.fontWeight, cacheKey.fontWeight) && FontStyle.m3112equalsimpl0(this.fontStyle, cacheKey.fontStyle) && FontSynthesis.m3121equalsimpl0(this.fontSynthesis, cacheKey.fontSynthesis);
            }
            return false;
        }

        @Nullable
        public final FontFamily getFontFamily() {
            return this.fontFamily;
        }

        /* renamed from: getFontStyle-_-LCdwA  reason: not valid java name */
        public final int m3211getFontStyle_LCdwA() {
            return this.fontStyle;
        }

        /* renamed from: getFontSynthesis-GVVA2EU  reason: not valid java name */
        public final int m3212getFontSynthesisGVVA2EU() {
            return this.fontSynthesis;
        }

        @NotNull
        public final FontWeight getFontWeight() {
            return this.fontWeight;
        }

        public int hashCode() {
            FontFamily fontFamily = this.fontFamily;
            return ((((((fontFamily == null ? 0 : fontFamily.hashCode()) * 31) + this.fontWeight.hashCode()) * 31) + FontStyle.m3113hashCodeimpl(this.fontStyle)) * 31) + FontSynthesis.m3122hashCodeimpl(this.fontSynthesis);
        }

        @NotNull
        public String toString() {
            return "CacheKey(fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontStyle=" + ((Object) FontStyle.m3114toStringimpl(this.fontStyle)) + ", fontSynthesis=" + ((Object) FontSynthesis.m3125toStringimpl(this.fontSynthesis)) + ')';
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J;\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/platform/TypefaceAdapter$Companion;", "", "()V", "ANDROID_BOLD", "Landroidx/compose/ui/text/font/FontWeight;", "typefaceCache", "Landroidx/collection/LruCache;", "Landroidx/compose/ui/text/platform/TypefaceAdapter$CacheKey;", "Landroid/graphics/Typeface;", "getTypefaceCache", "()Landroidx/collection/LruCache;", "getTypefaceStyle", "", "fontWeight", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "getTypefaceStyle-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)I", "isBold", "", "isItalic", "synthesize", "typeface", "font", "Landroidx/compose/ui/text/font/Font;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "synthesize-Wqqsr6A", "(Landroid/graphics/Typeface;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int getTypefaceStyle(boolean z, boolean z2) {
            if (z2 && z) {
                return 3;
            }
            if (z) {
                return 1;
            }
            return z2 ? 2 : 0;
        }

        @NotNull
        public final LruCache<CacheKey, Typeface> getTypefaceCache() {
            return TypefaceAdapter.typefaceCache;
        }

        /* renamed from: getTypefaceStyle-FO1MlWM  reason: not valid java name */
        public final int m3213getTypefaceStyleFO1MlWM(@NotNull FontWeight fontWeight, int i2) {
            Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
            return getTypefaceStyle(fontWeight.compareTo(TypefaceAdapter.ANDROID_BOLD) >= 0, FontStyle.m3112equalsimpl0(i2, FontStyle.Companion.m3116getItalic_LCdwA()));
        }

        @NotNull
        /* renamed from: synthesize-Wqqsr6A  reason: not valid java name */
        public final Typeface m3214synthesizeWqqsr6A(@NotNull Typeface typeface, @NotNull Font font, @NotNull FontWeight fontWeight, int i2, int i3) {
            Intrinsics.checkNotNullParameter(typeface, "typeface");
            Intrinsics.checkNotNullParameter(font, "font");
            Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
            boolean z = true;
            boolean z2 = FontSynthesis.m3124isWeightOnimpl$ui_text_release(i3) && fontWeight.compareTo(TypefaceAdapter.ANDROID_BOLD) >= 0 && font.getWeight().compareTo(TypefaceAdapter.ANDROID_BOLD) < 0;
            if (!FontSynthesis.m3123isStyleOnimpl$ui_text_release(i3) || FontStyle.m3112equalsimpl0(i2, font.mo3097getStyle_LCdwA())) {
                z = false;
            }
            if (z || z2) {
                return TypefaceAdapterHelperMethods.INSTANCE.create(typeface, z2 ? fontWeight.getWeight() : font.getWeight().getWeight(), z ? FontStyle.m3112equalsimpl0(i2, FontStyle.Companion.m3116getItalic_LCdwA()) : FontStyle.m3112equalsimpl0(font.mo3097getStyle_LCdwA(), FontStyle.Companion.m3116getItalic_LCdwA()));
            }
            return typeface;
        }
    }

    public TypefaceAdapter(@NotNull FontMatcher fontMatcher, @NotNull Font.ResourceLoader resourceLoader) {
        Intrinsics.checkNotNullParameter(fontMatcher, "fontMatcher");
        Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
        this.fontMatcher = fontMatcher;
        this.resourceLoader = resourceLoader;
    }

    public /* synthetic */ TypefaceAdapter(FontMatcher fontMatcher, Font.ResourceLoader resourceLoader, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new FontMatcher() : fontMatcher, resourceLoader);
    }

    /* renamed from: create-DPcqOEQ$default  reason: not valid java name */
    public static /* synthetic */ Typeface m3201createDPcqOEQ$default(TypefaceAdapter typefaceAdapter, FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                fontFamily = null;
            }
            if ((i4 & 2) != 0) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            if ((i4 & 4) != 0) {
                i2 = FontStyle.Companion.m3117getNormal_LCdwA();
            }
            if ((i4 & 8) != 0) {
                i3 = FontSynthesis.Companion.m3127getAllGVVA2EU();
            }
            return typefaceAdapter.m3206createDPcqOEQ(fontFamily, fontWeight, i2, i3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create-DPcqOEQ");
    }

    /* renamed from: create-RetOiIg  reason: not valid java name */
    private final Typeface m3202createRetOiIg(String str, FontWeight fontWeight, int i2) {
        FontStyle.Companion companion = FontStyle.Companion;
        if (FontStyle.m3112equalsimpl0(i2, companion.m3117getNormal_LCdwA()) && Intrinsics.areEqual(fontWeight, FontWeight.Companion.getNormal())) {
            if (str == null || str.length() == 0) {
                Typeface DEFAULT = Typeface.DEFAULT;
                Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
                return DEFAULT;
            }
        }
        Typeface familyTypeface = str == null ? Typeface.DEFAULT : Typeface.create(str, 0);
        TypefaceAdapterHelperMethods typefaceAdapterHelperMethods = TypefaceAdapterHelperMethods.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(familyTypeface, "familyTypeface");
        return typefaceAdapterHelperMethods.create(familyTypeface, fontWeight.getWeight(), FontStyle.m3112equalsimpl0(i2, companion.m3116getItalic_LCdwA()));
    }

    /* renamed from: create-RetOiIg$default  reason: not valid java name */
    public static /* synthetic */ Typeface m3203createRetOiIg$default(TypefaceAdapter typefaceAdapter, String str, FontWeight fontWeight, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                str = null;
            }
            if ((i3 & 2) != 0) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            if ((i3 & 4) != 0) {
                i2 = FontStyle.Companion.m3117getNormal_LCdwA();
            }
            return typefaceAdapter.m3202createRetOiIg(str, fontWeight, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create-RetOiIg");
    }

    /* renamed from: create-xC2X5gM  reason: not valid java name */
    private final Typeface m3204createxC2X5gM(int i2, FontWeight fontWeight, FontListFontFamily fontListFontFamily, int i3) {
        Typeface typeface;
        Font m3107matchFontRetOiIg = this.fontMatcher.m3107matchFontRetOiIg(fontListFontFamily, fontWeight, i2);
        try {
            if (m3107matchFontRetOiIg instanceof ResourceFont) {
                typeface = (Typeface) this.resourceLoader.load(m3107matchFontRetOiIg);
            } else if (!(m3107matchFontRetOiIg instanceof AndroidFont)) {
                throw new IllegalStateException(Intrinsics.stringPlus("Unknown font type: ", m3107matchFontRetOiIg));
            } else {
                typeface = ((AndroidFont) m3107matchFontRetOiIg).getTypeface();
            }
            Typeface typeface2 = typeface;
            return (FontSynthesis.m3121equalsimpl0(i3, FontSynthesis.Companion.m3128getNoneGVVA2EU()) || (Intrinsics.areEqual(fontWeight, m3107matchFontRetOiIg.getWeight()) && FontStyle.m3112equalsimpl0(i2, m3107matchFontRetOiIg.mo3097getStyle_LCdwA()))) ? typeface2 : Companion.m3214synthesizeWqqsr6A(typeface2, m3107matchFontRetOiIg, fontWeight, i2, i3);
        } catch (Exception e2) {
            throw new IllegalStateException(Intrinsics.stringPlus("Cannot create Typeface from ", m3107matchFontRetOiIg), e2);
        }
    }

    /* renamed from: create-xC2X5gM$default  reason: not valid java name */
    public static /* synthetic */ Typeface m3205createxC2X5gM$default(TypefaceAdapter typefaceAdapter, int i2, FontWeight fontWeight, FontListFontFamily fontListFontFamily, int i3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                i2 = FontStyle.Companion.m3117getNormal_LCdwA();
            }
            if ((i4 & 2) != 0) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            if ((i4 & 8) != 0) {
                i3 = FontSynthesis.Companion.m3127getAllGVVA2EU();
            }
            return typefaceAdapter.m3204createxC2X5gM(i2, fontWeight, fontListFontFamily, i3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create-xC2X5gM");
    }

    @NotNull
    /* renamed from: create-DPcqOEQ  reason: not valid java name */
    public Typeface m3206createDPcqOEQ(@Nullable FontFamily fontFamily, @NotNull FontWeight fontWeight, int i2, int i3) {
        Typeface mo3193getNativeTypefacePYhJU0U;
        String str;
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        CacheKey cacheKey = new CacheKey(fontFamily, fontWeight, i2, i3, null);
        LruCache<CacheKey, Typeface> lruCache = typefaceCache;
        Typeface typeface = lruCache.get(cacheKey);
        if (typeface != null) {
            return typeface;
        }
        if (fontFamily instanceof FontListFontFamily) {
            mo3193getNativeTypefacePYhJU0U = m3204createxC2X5gM(i2, fontWeight, (FontListFontFamily) fontFamily, i3);
        } else {
            if (fontFamily instanceof GenericFontFamily) {
                str = ((GenericFontFamily) fontFamily).getName();
            } else {
                boolean z = true;
                if (!(fontFamily instanceof DefaultFontFamily) && fontFamily != null) {
                    z = false;
                }
                if (z) {
                    str = null;
                } else if (!(fontFamily instanceof LoadedFontFamily)) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    mo3193getNativeTypefacePYhJU0U = ((AndroidTypeface) ((LoadedFontFamily) fontFamily).getTypeface()).mo3193getNativeTypefacePYhJU0U(fontWeight, i2, i3);
                }
            }
            mo3193getNativeTypefacePYhJU0U = m3202createRetOiIg(str, fontWeight, i2);
        }
        lruCache.put(cacheKey, mo3193getNativeTypefacePYhJU0U);
        return mo3193getNativeTypefacePYhJU0U;
    }

    @NotNull
    public final FontMatcher getFontMatcher() {
        return this.fontMatcher;
    }

    @NotNull
    public final Font.ResourceLoader getResourceLoader() {
        return this.resourceLoader;
    }
}
