package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.appcompat.R;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontMatcher;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB@\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\fø\u0001\u0000¢\u0006\u0002\u0010\rJ-\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0002\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u000b\u001a\u00020\f¢\u0006\n\n\u0002\b\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "fontFamily", "Landroidx/compose/ui/text/font/FontListFontFamily;", "context", "Landroid/content/Context;", "necessaryStyles", "", "Lkotlin/Pair;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroid/content/Context;Ljava/util/List;Landroidx/compose/ui/text/font/FontMatcher;)V", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "fontMatcher$1", "loadedTypefaces", "", "Landroidx/compose/ui/text/font/Font;", "Landroid/graphics/Typeface;", "getNativeTypeface", "fontWeight", "fontStyle", "synthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidFontListTypeface implements AndroidTypeface {
    @NotNull
    private static final Companion Companion = new Companion(null);
    @Deprecated
    @NotNull
    private static final FontMatcher fontMatcher = new FontMatcher();
    @NotNull
    private final FontFamily fontFamily;
    @NotNull
    private final FontMatcher fontMatcher$1;
    @NotNull
    private final Map<Font, Typeface> loadedTypefaces;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface$Companion;", "", "()V", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FontMatcher getFontMatcher() {
            return AndroidFontListTypeface.fontMatcher;
        }
    }

    public AndroidFontListTypeface(@NotNull FontListFontFamily fontFamily, @NotNull Context context, @Nullable List<Pair<FontWeight, FontStyle>> list, @NotNull FontMatcher fontMatcher2) {
        List<Font> list2;
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fontMatcher2, "fontMatcher");
        this.fontMatcher$1 = fontMatcher2;
        int i2 = 0;
        if (list == null) {
            list2 = null;
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i3 = 0;
            while (i3 < size) {
                int i4 = i3 + 1;
                Pair<FontWeight, FontStyle> pair = list.get(i3);
                arrayList.add(getFontMatcher().m3107matchFontRetOiIg(fontFamily, pair.component1(), pair.component2().m3115unboximpl()));
                i3 = i4;
            }
            list2 = CollectionsKt___CollectionsKt.toList(new LinkedHashSet(arrayList));
        }
        list2 = list2 == null ? fontFamily.getFonts() : list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size2 = list2.size();
        while (i2 < size2) {
            int i5 = i2 + 1;
            Font it = list2.get(i2);
            try {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                linkedHashMap.put(it, AndroidTypefaceCache.INSTANCE.getOrCreate(context, it));
                i2 = i5;
            } catch (Exception unused) {
                throw new IllegalStateException(Intrinsics.stringPlus("Cannot create Typeface from ", it));
            }
        }
        this.loadedTypefaces = linkedHashMap;
        this.fontFamily = fontFamily;
    }

    public /* synthetic */ AndroidFontListTypeface(FontListFontFamily fontListFontFamily, Context context, List list, FontMatcher fontMatcher2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontListFontFamily, context, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? fontMatcher : fontMatcher2);
    }

    @Override // androidx.compose.ui.text.font.Typeface
    @NotNull
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @NotNull
    public final FontMatcher getFontMatcher() {
        return this.fontMatcher$1;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    @NotNull
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo3193getNativeTypefacePYhJU0U(@NotNull FontWeight fontWeight, int i2, int i3) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        Font m3108matchFontRetOiIg = this.fontMatcher$1.m3108matchFontRetOiIg(this.loadedTypefaces.keySet(), fontWeight, i2);
        Typeface typeface = this.loadedTypefaces.get(m3108matchFontRetOiIg);
        if (typeface != null) {
            return ((Intrinsics.areEqual(m3108matchFontRetOiIg.getWeight(), fontWeight) && FontStyle.m3112equalsimpl0(m3108matchFontRetOiIg.mo3097getStyle_LCdwA(), i2)) || FontSynthesis.m3121equalsimpl0(i3, FontSynthesis.Companion.m3128getNoneGVVA2EU())) ? typeface : TypefaceAdapter.Companion.m3214synthesizeWqqsr6A(typeface, m3108matchFontRetOiIg, fontWeight, i2, i3);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
