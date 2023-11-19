package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001Bg\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016B%\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0019J\u0010\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\rH\u0016J\u0010\u0010O\u001a\u0002082\u0006\u0010N\u001a\u00020\rH\u0016J\u0010\u0010P\u001a\u0002082\u0006\u0010N\u001a\u00020\rH\u0016J\u0018\u0010Q\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\r2\u0006\u0010R\u001a\u00020\u000fH\u0016J\u0010\u0010S\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\rH\u0016J\u0018\u0010U\u001a\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010V\u001a\u00020\u000fH\u0016J\u0010\u0010W\u001a\u00020\r2\u0006\u0010N\u001a\u00020\rH\u0016J\u0010\u0010X\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\u0011H\u0016J\u0010\u0010Z\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\rH\u0016J\u0010\u0010[\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\rH\u0016J\u0010\u0010\\\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\rH\u0016J\u0010\u0010]\u001a\u00020\r2\u0006\u0010T\u001a\u00020\rH\u0016J\u0010\u0010^\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\rH\u0016J\u0010\u0010_\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\rH\u0016J\u001d\u0010`\u001a\u00020\r2\u0006\u0010a\u001a\u00020bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001a\u00020M2\u0006\u0010N\u001a\u00020\rH\u0016J\u0018\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020\r2\u0006\u0010i\u001a\u00020\rH\u0016J \u0010H\u001a\u00020j2\u0006\u0010N\u001a\u00020\rH\u0016ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bk\u0010lJ\u0015\u0010m\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020\rH\u0001¢\u0006\u0002\bnJ\u0010\u0010o\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020\rH\u0016J9\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020u2\b\u0010v\u001a\u0004\u0018\u00010w2\b\u0010x\u001a\u0004\u0018\u00010yH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bz\u0010{R\u001a\u0010\u001a\u001a\u00020\u001b8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010&R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010&R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u0014\u00103\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010&R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020<8@X\u0081\u0004¢\u0006\f\u0012\u0004\b=\u0010\u001d\u001a\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020A8@X\u0081\u0004¢\u0006\f\u0012\u0004\bB\u0010\u001d\u001a\u0004\bC\u0010DR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010&R\u001b\u0010F\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bH\u0010I\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006|"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidParagraph;", "Landroidx/compose/ui/text/Paragraph;", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "maxLines", "", "ellipsis", "", "width", "", "typefaceAdapter", "Landroidx/compose/ui/text/platform/TypefaceAdapter;", "density", "Landroidx/compose/ui/unit/Density;", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;IZFLandroidx/compose/ui/text/platform/TypefaceAdapter;Landroidx/compose/ui/unit/Density;)V", "paragraphIntrinsics", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "(Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;IZF)V", "charSequence", "", "getCharSequence$ui_text_release$annotations", "()V", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "didExceedMaxLines", "getDidExceedMaxLines", "()Z", "getEllipsis", "firstBaseline", "getFirstBaseline", "()F", "height", "getHeight", "lastBaseline", "getLastBaseline", "layout", "Landroidx/compose/ui/text/android/TextLayout;", "lineCount", "getLineCount", "()I", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "getMaxLines", "minIntrinsicWidth", "getMinIntrinsicWidth", "getParagraphIntrinsics", "()Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "placeholderRects", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "()Ljava/util/List;", "textLocale", "Ljava/util/Locale;", "getTextLocale$ui_text_release$annotations", "getTextLocale$ui_text_release", "()Ljava/util/Locale;", "textPaint", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release$annotations", "getTextPaint$ui_text_release", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getWidth", "wordBoundary", "Landroidx/compose/ui/text/android/selection/WordBoundary;", "getWordBoundary", "()Landroidx/compose/ui/text/android/selection/WordBoundary;", "wordBoundary$delegate", "Lkotlin/Lazy;", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineBottom", "lineIndex", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", "vertical", "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineWidth", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "isEllipsisApplied", "isEllipsisApplied$ui_text_release", "isLineEllipsized", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "color", "Landroidx/compose/ui/graphics/Color;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidParagraph implements Paragraph {
    private final boolean ellipsis;
    @NotNull
    private final TextLayout layout;
    private final int maxLines;
    @NotNull
    private final AndroidParagraphIntrinsics paragraphIntrinsics;
    @NotNull
    private final List<Rect> placeholderRects;
    private final float width;
    @NotNull
    private final Lazy wordBoundary$delegate;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            iArr[ResolvedTextDirection.Ltr.ordinal()] = 1;
            iArr[ResolvedTextDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidParagraph(@NotNull AndroidParagraphIntrinsics paragraphIntrinsics, int i2, boolean z, float f2) {
        int m3199toLayoutAlignAMY3VfE;
        List<Rect> list;
        Rect rect;
        float horizontalPosition;
        float lineBaseline;
        float lineTop;
        float f3;
        Lazy lazy;
        Intrinsics.checkNotNullParameter(paragraphIntrinsics, "paragraphIntrinsics");
        this.paragraphIntrinsics = paragraphIntrinsics;
        this.maxLines = i2;
        this.ellipsis = z;
        this.width = f2;
        if ((i2 >= 1 ? (byte) 1 : (byte) 0) == 0) {
            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
        }
        if ((getWidth() >= 0.0f ? (byte) 1 : (byte) 0) == 0) {
            throw new IllegalArgumentException("width should not be negative".toString());
        }
        TextStyle style = paragraphIntrinsics.getStyle();
        m3199toLayoutAlignAMY3VfE = AndroidParagraph_androidKt.m3199toLayoutAlignAMY3VfE(style.m3093getTextAlignbuA522U());
        TextAlign m3093getTextAlignbuA522U = style.m3093getTextAlignbuA522U();
        this.layout = new TextLayout(paragraphIntrinsics.getCharSequence$ui_text_release(), getWidth(), getTextPaint$ui_text_release(), m3199toLayoutAlignAMY3VfE, z ? TextUtils.TruncateAt.END : null, paragraphIntrinsics.getTextDirectionHeuristic$ui_text_release(), 1.0f, 0.0f, false, i2, 0, 0, m3093getTextAlignbuA522U == null ? false : TextAlign.m3242equalsimpl0(m3093getTextAlignbuA522U.m3245unboximpl(), TextAlign.Companion.m3248getJustifye0LSkKk()) ? 1 : 0, null, null, paragraphIntrinsics.getLayoutIntrinsics$ui_text_release(), 28032, null);
        CharSequence charSequence$ui_text_release = paragraphIntrinsics.getCharSequence$ui_text_release();
        if (charSequence$ui_text_release instanceof Spanned) {
            Object[] spans = ((Spanned) charSequence$ui_text_release).getSpans(0, charSequence$ui_text_release.length(), PlaceholderSpan.class);
            Intrinsics.checkNotNullExpressionValue(spans, "getSpans(0, length, PlaceholderSpan::class.java)");
            ArrayList arrayList = new ArrayList(spans.length);
            int length = spans.length;
            int i3 = 0;
            while (i3 < length) {
                Object obj = spans[i3];
                i3++;
                PlaceholderSpan placeholderSpan = (PlaceholderSpan) obj;
                Spanned spanned = (Spanned) charSequence$ui_text_release;
                int spanStart = spanned.getSpanStart(placeholderSpan);
                int spanEnd = spanned.getSpanEnd(placeholderSpan);
                int lineForOffset = this.layout.getLineForOffset(spanStart);
                boolean z2 = this.layout.getLineEllipsisCount(lineForOffset) > 0 && spanEnd > this.layout.getLineEllipsisOffset(lineForOffset);
                boolean z3 = spanEnd > this.layout.getLineEnd(lineForOffset);
                if (z2 || z3) {
                    rect = null;
                } else {
                    int i4 = WhenMappings.$EnumSwitchMapping$0[getBidiRunDirection(spanStart).ordinal()];
                    if (i4 == 1) {
                        horizontalPosition = getHorizontalPosition(spanStart, true);
                    } else if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        horizontalPosition = getHorizontalPosition(spanStart, true) - placeholderSpan.getWidthPx();
                    }
                    float widthPx = placeholderSpan.getWidthPx() + horizontalPosition;
                    TextLayout textLayout = this.layout;
                    switch (placeholderSpan.getVerticalAlign()) {
                        case 0:
                            lineBaseline = textLayout.getLineBaseline(lineForOffset);
                            lineTop = lineBaseline - placeholderSpan.getHeightPx();
                            break;
                        case 1:
                            lineTop = textLayout.getLineTop(lineForOffset);
                            break;
                        case 2:
                            lineBaseline = textLayout.getLineBottom(lineForOffset);
                            lineTop = lineBaseline - placeholderSpan.getHeightPx();
                            break;
                        case 3:
                            lineTop = ((textLayout.getLineTop(lineForOffset) + textLayout.getLineBottom(lineForOffset)) - placeholderSpan.getHeightPx()) / 2;
                            break;
                        case 4:
                            f3 = placeholderSpan.getFontMetrics().ascent;
                            lineTop = f3 + textLayout.getLineBaseline(lineForOffset);
                            break;
                        case 5:
                            lineTop = (placeholderSpan.getFontMetrics().descent + textLayout.getLineBaseline(lineForOffset)) - placeholderSpan.getHeightPx();
                            break;
                        case 6:
                            Paint.FontMetricsInt fontMetrics = placeholderSpan.getFontMetrics();
                            f3 = ((fontMetrics.ascent + fontMetrics.descent) - placeholderSpan.getHeightPx()) / 2;
                            lineTop = f3 + textLayout.getLineBaseline(lineForOffset);
                            break;
                        default:
                            throw new IllegalStateException("unexpected verticalAlignment");
                    }
                    rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                }
                arrayList.add(rect);
            }
            list = arrayList;
        } else {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        this.placeholderRects = list;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new AndroidParagraph$wordBoundary$2(this));
        this.wordBoundary$delegate = lazy;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndroidParagraph(@NotNull String text, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, int i2, boolean z, float f2, @NotNull TypefaceAdapter typefaceAdapter, @NotNull Density density) {
        this(new AndroidParagraphIntrinsics(text, style, spanStyles, placeholders, typefaceAdapter, density), i2, z, f2);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(typefaceAdapter, "typefaceAdapter");
        Intrinsics.checkNotNullParameter(density, "density");
    }

    @VisibleForTesting
    public static /* synthetic */ void getCharSequence$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTextLocale$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTextPaint$ui_text_release$annotations() {
    }

    private final WordBoundary getWordBoundary() {
        return (WordBoundary) this.wordBoundary$delegate.getValue();
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public ResolvedTextDirection getBidiRunDirection(int i2) {
        return this.layout.isRtlCharAt(i2) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public Rect getBoundingBox(int i2) {
        float primaryHorizontal = this.layout.getPrimaryHorizontal(i2);
        float primaryHorizontal2 = this.layout.getPrimaryHorizontal(i2 + 1);
        int lineForOffset = this.layout.getLineForOffset(i2);
        return new Rect(primaryHorizontal, this.layout.getLineTop(lineForOffset), primaryHorizontal2, this.layout.getLineBottom(lineForOffset));
    }

    @NotNull
    public final CharSequence getCharSequence$ui_text_release() {
        return this.paragraphIntrinsics.getCharSequence$ui_text_release();
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public Rect getCursorRect(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 <= getCharSequence$ui_text_release().length()) {
            z = true;
        }
        if (z) {
            float primaryHorizontal = this.layout.getPrimaryHorizontal(i2);
            int lineForOffset = this.layout.getLineForOffset(i2);
            return new Rect(primaryHorizontal, this.layout.getLineTop(lineForOffset), primaryHorizontal, this.layout.getLineBottom(lineForOffset));
        }
        throw new AssertionError("offset(" + i2 + ") is out of bounds (0," + getCharSequence$ui_text_release().length());
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean getDidExceedMaxLines() {
        return this.layout.getDidExceedMaxLines();
    }

    public final boolean getEllipsis() {
        return this.ellipsis;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getFirstBaseline() {
        return this.layout.getLineBaseline(0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHeight() {
        return this.layout.getHeight();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHorizontalPosition(int i2, boolean z) {
        TextLayout textLayout = this.layout;
        return z ? textLayout.getPrimaryHorizontal(i2) : textLayout.getSecondaryHorizontal(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLastBaseline() {
        TextLayout textLayout;
        int lineCount;
        if (this.maxLines < getLineCount()) {
            textLayout = this.layout;
            lineCount = this.maxLines;
        } else {
            textLayout = this.layout;
            lineCount = getLineCount();
        }
        return textLayout.getLineBaseline(lineCount - 1);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineBottom(int i2) {
        return this.layout.getLineBottom(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineEnd(int i2, boolean z) {
        TextLayout textLayout = this.layout;
        return z ? textLayout.getLineVisibleEnd(i2) : textLayout.getLineEnd(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForOffset(int i2) {
        return this.layout.getLineForOffset(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForVerticalPosition(float f2) {
        return this.layout.getLineForVertical((int) f2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineHeight(int i2) {
        return this.layout.getLineHeight(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineLeft(int i2) {
        return this.layout.getLineLeft(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineRight(int i2) {
        return this.layout.getLineRight(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineStart(int i2) {
        return this.layout.getLineStart(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineTop(int i2) {
        return this.layout.getLineTop(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineWidth(int i2) {
        return this.layout.getLineWidth(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMaxIntrinsicWidth() {
        return this.paragraphIntrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMinIntrinsicWidth() {
        return this.paragraphIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: getOffsetForPosition-k-4lQ0M */
    public int mo3002getOffsetForPositionk4lQ0M(long j2) {
        return this.layout.getOffsetForHorizontal(this.layout.getLineForVertical((int) Offset.m1162getYimpl(j2)), Offset.m1161getXimpl(j2));
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public ResolvedTextDirection getParagraphDirection(int i2) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(i2)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    @NotNull
    public final AndroidParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public Path getPathForRange(int i2, int i3) {
        boolean z = false;
        if (i2 >= 0 && i2 <= i3) {
            z = true;
        }
        if (z && i3 <= getCharSequence$ui_text_release().length()) {
            android.graphics.Path path = new android.graphics.Path();
            this.layout.getSelectionPath(i2, i3, path);
            return AndroidPath_androidKt.asComposePath(path);
        }
        throw new AssertionError("Start(" + i2 + ") or End(" + i3 + ") is out of Range(0.." + getCharSequence$ui_text_release().length() + "), or start > end!");
    }

    @Override // androidx.compose.ui.text.Paragraph
    @NotNull
    public List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    @NotNull
    public final Locale getTextLocale$ui_text_release() {
        Locale textLocale = this.paragraphIntrinsics.getTextPaint$ui_text_release().getTextLocale();
        Intrinsics.checkNotNullExpressionValue(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return textLocale;
    }

    @NotNull
    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint$ui_text_release();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getWidth() {
        return this.width;
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: getWordBoundary--jx7JFs */
    public long mo3003getWordBoundaryjx7JFs(int i2) {
        return TextRangeKt.TextRange(getWordBoundary().getWordStart(i2), getWordBoundary().getWordEnd(i2));
    }

    @VisibleForTesting
    public final boolean isEllipsisApplied$ui_text_release(int i2) {
        return this.layout.isEllipsisApplied(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean isLineEllipsized(int i2) {
        return this.layout.isLineEllipsized(i2);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-RPmYEkk */
    public void mo3004paintRPmYEkk(@NotNull Canvas canvas, long j2, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getTextPaint$ui_text_release().m3200setColor8_81llA(j2);
        getTextPaint$ui_text_release().setShadow(shadow);
        getTextPaint$ui_text_release().setTextDecoration(textDecoration);
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }
}
