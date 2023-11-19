package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 W2\u00020\u0001:\u0001WB\u0017\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006BÖ\u0001\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'ø\u0001\u0000¢\u0006\u0002\u0010(Já\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bK\u0010LJ\u0013\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010P\u001a\u00020QH\u0016J\u0010\u0010R\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\u0005H\u0007J\u0010\u0010R\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\u0003H\u0007J\u0014\u0010R\u001a\u00020\u00002\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0000H\u0007J\u0011\u0010S\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\u0005H\u0087\u0002J\u0011\u0010S\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\u0003H\u0087\u0002J\u0011\u0010S\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\u0000H\u0087\u0002J\b\u0010T\u001a\u00020\u0005H\u0007J\b\u0010U\u001a\u00020\u0003H\u0007J\b\u0010V\u001a\u00020\u0014H\u0016R\u001c\u0010\u001c\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001c\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010+\u001a\u0004\b.\u0010*R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001c\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010+\u001a\u0004\b3\u0010*R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u001c\u0010\u0015\u001a\u00020\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010+\u001a\u0004\b:\u0010*R\u001c\u0010%\u001a\u00020\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010+\u001a\u0004\b;\u0010*R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u001c\u0010!\u001a\u0004\u0018\u00010\"ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u001c\u0010#\u001a\u0004\u0018\u00010$ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bH\u0010I\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", "", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "paragraphStyle", "Landroidx/compose/ui/text/ParagraphStyle;", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;)V", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "background", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground-0d7_KjU", "()J", "J", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "getColor-0d7_KjU", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontFeatureSettings", "()Ljava/lang/String;", "getFontSize-XSAIIZE", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getLetterSpacing-XSAIIZE", "getLineHeight-XSAIIZE", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "copy", "copy-HL5avdY", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/TextStyle;", "equals", "", "other", "hashCode", "", "merge", "plus", "toParagraphStyle", "toSpanStyle", "toString", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextStyle {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final TextStyle Default = new TextStyle(0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, 0, null, 262143, null);
    private final long background;
    @Nullable
    private final BaselineShift baselineShift;
    private final long color;
    @Nullable
    private final FontFamily fontFamily;
    @Nullable
    private final String fontFeatureSettings;
    private final long fontSize;
    @Nullable
    private final FontStyle fontStyle;
    @Nullable
    private final FontSynthesis fontSynthesis;
    @Nullable
    private final FontWeight fontWeight;
    private final long letterSpacing;
    private final long lineHeight;
    @Nullable
    private final LocaleList localeList;
    @Nullable
    private final Shadow shadow;
    @Nullable
    private final TextAlign textAlign;
    @Nullable
    private final TextDecoration textDecoration;
    @Nullable
    private final TextDirection textDirection;
    @Nullable
    private final TextGeometricTransform textGeometricTransform;
    @Nullable
    private final TextIndent textIndent;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/TextStyle$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/TextStyle;", "getDefault$annotations", "getDefault", "()Landroidx/compose/ui/text/TextStyle;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }

        @NotNull
        public final TextStyle getDefault() {
            return TextStyle.Default;
        }
    }

    private TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent) {
        this.color = j2;
        this.fontSize = j3;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = str;
        this.letterSpacing = j4;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j5;
        this.textDecoration = textDecoration;
        this.shadow = shadow;
        this.textAlign = textAlign;
        this.textDirection = textDirection;
        this.lineHeight = j6;
        this.textIndent = textIndent;
        if (TextUnitKt.m3524isUnspecifiedR2X_6o(m3092getLineHeightXSAIIZE())) {
            return;
        }
        if (TextUnit.m3506getValueimpl(m3092getLineHeightXSAIIZE()) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + TextUnit.m3506getValueimpl(m3092getLineHeightXSAIIZE()) + ')').toString());
    }

    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Color.Companion.m1428getUnspecified0d7_KjU() : j2, (i2 & 2) != 0 ? TextUnit.Companion.m3517getUnspecifiedXSAIIZE() : j3, (i2 & 4) != 0 ? null : fontWeight, (i2 & 8) != 0 ? null : fontStyle, (i2 & 16) != 0 ? null : fontSynthesis, (i2 & 32) != 0 ? null : fontFamily, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? TextUnit.Companion.m3517getUnspecifiedXSAIIZE() : j4, (i2 & 256) != 0 ? null : baselineShift, (i2 & 512) != 0 ? null : textGeometricTransform, (i2 & 1024) != 0 ? null : localeList, (i2 & 2048) != 0 ? Color.Companion.m1428getUnspecified0d7_KjU() : j5, (i2 & 4096) != 0 ? null : textDecoration, (i2 & 8192) != 0 ? null : shadow, (i2 & 16384) != 0 ? null : textAlign, (i2 & 32768) != 0 ? null : textDirection, (i2 & 65536) != 0 ? TextUnit.Companion.m3517getUnspecifiedXSAIIZE() : j6, (i2 & 131072) != 0 ? null : textIndent, null);
    }

    public /* synthetic */ TextStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long j6, TextIndent textIndent, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, textAlign, textDirection, j6, textIndent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStyle(@NotNull SpanStyle spanStyle, @NotNull ParagraphStyle paragraphStyle) {
        this(spanStyle.m3046getColor0d7_KjU(), spanStyle.m3047getFontSizeXSAIIZE(), spanStyle.getFontWeight(), spanStyle.m3048getFontStyle4Lr2A7w(), spanStyle.m3049getFontSynthesisZQGJjVo(), spanStyle.getFontFamily(), spanStyle.getFontFeatureSettings(), spanStyle.m3050getLetterSpacingXSAIIZE(), spanStyle.m3045getBaselineShift5SSeXJ0(), spanStyle.getTextGeometricTransform(), spanStyle.getLocaleList(), spanStyle.m3044getBackground0d7_KjU(), spanStyle.getTextDecoration(), spanStyle.getShadow(), paragraphStyle.m3011getTextAlignbuA522U(), paragraphStyle.m3012getTextDirectionmmuk1to(), paragraphStyle.m3010getLineHeightXSAIIZE(), paragraphStyle.getTextIndent(), null);
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        Intrinsics.checkNotNullParameter(paragraphStyle, "paragraphStyle");
    }

    public static /* synthetic */ TextStyle merge$default(TextStyle textStyle, TextStyle textStyle2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textStyle2 = null;
        }
        return textStyle.merge(textStyle2);
    }

    @NotNull
    /* renamed from: copy-HL5avdY  reason: not valid java name */
    public final TextStyle m3084copyHL5avdY(long j2, long j3, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String str, long j4, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long j5, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable TextAlign textAlign, @Nullable TextDirection textDirection, long j6, @Nullable TextIndent textIndent) {
        return new TextStyle(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow, textAlign, textDirection, j6, textIndent, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextStyle) {
            TextStyle textStyle = (TextStyle) obj;
            return Color.m1393equalsimpl0(m3087getColor0d7_KjU(), textStyle.m3087getColor0d7_KjU()) && TextUnit.m3503equalsimpl0(m3088getFontSizeXSAIIZE(), textStyle.m3088getFontSizeXSAIIZE()) && Intrinsics.areEqual(this.fontWeight, textStyle.fontWeight) && Intrinsics.areEqual(m3089getFontStyle4Lr2A7w(), textStyle.m3089getFontStyle4Lr2A7w()) && Intrinsics.areEqual(m3090getFontSynthesisZQGJjVo(), textStyle.m3090getFontSynthesisZQGJjVo()) && Intrinsics.areEqual(this.fontFamily, textStyle.fontFamily) && Intrinsics.areEqual(this.fontFeatureSettings, textStyle.fontFeatureSettings) && TextUnit.m3503equalsimpl0(m3091getLetterSpacingXSAIIZE(), textStyle.m3091getLetterSpacingXSAIIZE()) && Intrinsics.areEqual(m3086getBaselineShift5SSeXJ0(), textStyle.m3086getBaselineShift5SSeXJ0()) && Intrinsics.areEqual(this.textGeometricTransform, textStyle.textGeometricTransform) && Intrinsics.areEqual(this.localeList, textStyle.localeList) && Color.m1393equalsimpl0(m3085getBackground0d7_KjU(), textStyle.m3085getBackground0d7_KjU()) && Intrinsics.areEqual(this.textDecoration, textStyle.textDecoration) && Intrinsics.areEqual(this.shadow, textStyle.shadow) && Intrinsics.areEqual(m3093getTextAlignbuA522U(), textStyle.m3093getTextAlignbuA522U()) && Intrinsics.areEqual(m3094getTextDirectionmmuk1to(), textStyle.m3094getTextDirectionmmuk1to()) && TextUnit.m3503equalsimpl0(m3092getLineHeightXSAIIZE(), textStyle.m3092getLineHeightXSAIIZE()) && Intrinsics.areEqual(this.textIndent, textStyle.textIndent);
        }
        return false;
    }

    /* renamed from: getBackground-0d7_KjU  reason: not valid java name */
    public final long m3085getBackground0d7_KjU() {
        return this.background;
    }

    @Nullable
    /* renamed from: getBaselineShift-5SSeXJ0  reason: not valid java name */
    public final BaselineShift m3086getBaselineShift5SSeXJ0() {
        return this.baselineShift;
    }

    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public final long m3087getColor0d7_KjU() {
        return this.color;
    }

    @Nullable
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Nullable
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* renamed from: getFontSize-XSAIIZE  reason: not valid java name */
    public final long m3088getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    @Nullable
    /* renamed from: getFontStyle-4Lr2A7w  reason: not valid java name */
    public final FontStyle m3089getFontStyle4Lr2A7w() {
        return this.fontStyle;
    }

    @Nullable
    /* renamed from: getFontSynthesis-ZQGJjVo  reason: not valid java name */
    public final FontSynthesis m3090getFontSynthesisZQGJjVo() {
        return this.fontSynthesis;
    }

    @Nullable
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: getLetterSpacing-XSAIIZE  reason: not valid java name */
    public final long m3091getLetterSpacingXSAIIZE() {
        return this.letterSpacing;
    }

    /* renamed from: getLineHeight-XSAIIZE  reason: not valid java name */
    public final long m3092getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    @Nullable
    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    @Nullable
    public final Shadow getShadow() {
        return this.shadow;
    }

    @Nullable
    /* renamed from: getTextAlign-buA522U  reason: not valid java name */
    public final TextAlign m3093getTextAlignbuA522U() {
        return this.textAlign;
    }

    @Nullable
    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    @Nullable
    /* renamed from: getTextDirection-mmuk1to  reason: not valid java name */
    public final TextDirection m3094getTextDirectionmmuk1to() {
        return this.textDirection;
    }

    @Nullable
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    @Nullable
    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    public int hashCode() {
        int m1399hashCodeimpl = ((Color.m1399hashCodeimpl(m3087getColor0d7_KjU()) * 31) + TextUnit.m3507hashCodeimpl(m3088getFontSizeXSAIIZE())) * 31;
        FontWeight fontWeight = this.fontWeight;
        int hashCode = (m1399hashCodeimpl + (fontWeight == null ? 0 : fontWeight.hashCode())) * 31;
        FontStyle m3089getFontStyle4Lr2A7w = m3089getFontStyle4Lr2A7w();
        int m3113hashCodeimpl = (hashCode + (m3089getFontStyle4Lr2A7w == null ? 0 : FontStyle.m3113hashCodeimpl(m3089getFontStyle4Lr2A7w.m3115unboximpl()))) * 31;
        FontSynthesis m3090getFontSynthesisZQGJjVo = m3090getFontSynthesisZQGJjVo();
        int m3122hashCodeimpl = (m3113hashCodeimpl + (m3090getFontSynthesisZQGJjVo == null ? 0 : FontSynthesis.m3122hashCodeimpl(m3090getFontSynthesisZQGJjVo.m3126unboximpl()))) * 31;
        FontFamily fontFamily = this.fontFamily;
        int hashCode2 = (m3122hashCodeimpl + (fontFamily == null ? 0 : fontFamily.hashCode())) * 31;
        String str = this.fontFeatureSettings;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + TextUnit.m3507hashCodeimpl(m3091getLetterSpacingXSAIIZE())) * 31;
        BaselineShift m3086getBaselineShift5SSeXJ0 = m3086getBaselineShift5SSeXJ0();
        int m3229hashCodeimpl = (hashCode3 + (m3086getBaselineShift5SSeXJ0 == null ? 0 : BaselineShift.m3229hashCodeimpl(m3086getBaselineShift5SSeXJ0.m3231unboximpl()))) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int hashCode4 = (m3229hashCodeimpl + (textGeometricTransform == null ? 0 : textGeometricTransform.hashCode())) * 31;
        LocaleList localeList = this.localeList;
        int hashCode5 = (((hashCode4 + (localeList == null ? 0 : localeList.hashCode())) * 31) + Color.m1399hashCodeimpl(m3085getBackground0d7_KjU())) * 31;
        TextDecoration textDecoration = this.textDecoration;
        int hashCode6 = (hashCode5 + (textDecoration == null ? 0 : textDecoration.hashCode())) * 31;
        Shadow shadow = this.shadow;
        int hashCode7 = (hashCode6 + (shadow == null ? 0 : shadow.hashCode())) * 31;
        TextAlign m3093getTextAlignbuA522U = m3093getTextAlignbuA522U();
        int m3243hashCodeimpl = (hashCode7 + (m3093getTextAlignbuA522U == null ? 0 : TextAlign.m3243hashCodeimpl(m3093getTextAlignbuA522U.m3245unboximpl()))) * 31;
        TextDirection m3094getTextDirectionmmuk1to = m3094getTextDirectionmmuk1to();
        int m3256hashCodeimpl = (((m3243hashCodeimpl + (m3094getTextDirectionmmuk1to == null ? 0 : TextDirection.m3256hashCodeimpl(m3094getTextDirectionmmuk1to.m3258unboximpl()))) * 31) + TextUnit.m3507hashCodeimpl(m3092getLineHeightXSAIIZE())) * 31;
        TextIndent textIndent = this.textIndent;
        return m3256hashCodeimpl + (textIndent != null ? textIndent.hashCode() : 0);
    }

    @Stable
    @NotNull
    public final TextStyle merge(@NotNull ParagraphStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new TextStyle(toSpanStyle(), toParagraphStyle().merge(other));
    }

    @Stable
    @NotNull
    public final TextStyle merge(@NotNull SpanStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new TextStyle(toSpanStyle().merge(other), toParagraphStyle());
    }

    @Stable
    @NotNull
    public final TextStyle merge(@Nullable TextStyle textStyle) {
        return (textStyle == null || Intrinsics.areEqual(textStyle, Default)) ? this : new TextStyle(toSpanStyle().merge(textStyle.toSpanStyle()), toParagraphStyle().merge(textStyle.toParagraphStyle()));
    }

    @Stable
    @NotNull
    public final TextStyle plus(@NotNull ParagraphStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return merge(other);
    }

    @Stable
    @NotNull
    public final TextStyle plus(@NotNull SpanStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return merge(other);
    }

    @Stable
    @NotNull
    public final TextStyle plus(@NotNull TextStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return merge(other);
    }

    @Stable
    @NotNull
    public final ParagraphStyle toParagraphStyle() {
        return new ParagraphStyle(m3093getTextAlignbuA522U(), m3094getTextDirectionmmuk1to(), m3092getLineHeightXSAIIZE(), this.textIndent, null);
    }

    @Stable
    @NotNull
    public final SpanStyle toSpanStyle() {
        return new SpanStyle(m3087getColor0d7_KjU(), m3088getFontSizeXSAIIZE(), this.fontWeight, m3089getFontStyle4Lr2A7w(), m3090getFontSynthesisZQGJjVo(), this.fontFamily, this.fontFeatureSettings, m3091getLetterSpacingXSAIIZE(), m3086getBaselineShift5SSeXJ0(), this.textGeometricTransform, this.localeList, m3085getBackground0d7_KjU(), this.textDecoration, this.shadow, null);
    }

    @NotNull
    public String toString() {
        return "TextStyle(color=" + ((Object) Color.m1400toStringimpl(m3087getColor0d7_KjU())) + ", fontSize=" + ((Object) TextUnit.m3513toStringimpl(m3088getFontSizeXSAIIZE())) + ", fontWeight=" + this.fontWeight + ", fontStyle=" + m3089getFontStyle4Lr2A7w() + ", fontSynthesis=" + m3090getFontSynthesisZQGJjVo() + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + ((Object) this.fontFeatureSettings) + ", letterSpacing=" + ((Object) TextUnit.m3513toStringimpl(m3091getLetterSpacingXSAIIZE())) + ", baselineShift=" + m3086getBaselineShift5SSeXJ0() + ", textGeometricTransform=" + this.textGeometricTransform + ", localeList=" + this.localeList + ", background=" + ((Object) Color.m1400toStringimpl(m3085getBackground0d7_KjU())) + ", textDecoration=" + this.textDecoration + ", shadow=" + this.shadow + ", textAlign=" + m3093getTextAlignbuA522U() + ", textDirection=" + m3094getTextDirectionmmuk1to() + ", lineHeight=" + ((Object) TextUnit.m3513toStringimpl(m3092getLineHeightXSAIIZE())) + ", textIndent=" + this.textIndent + ')';
    }
}
