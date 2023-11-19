package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ'\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001aJ\u000e\u0010/\u001a\u00020!2\u0006\u0010.\u001a\u00020\u001aJ\u000e\u00100\u001a\u00020!2\u0006\u0010.\u001a\u00020\u001aJ\u0016\u00101\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\nJ\u000e\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u001aJ\u0018\u00105\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u001a2\b\b\u0002\u00106\u001a\u00020\nJ\u000e\u00107\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001aJ\u000e\u00108\u001a\u00020\u001a2\u0006\u00109\u001a\u00020\u0010J\u000e\u0010:\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u001aJ\u000e\u0010;\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u001aJ\u000e\u0010<\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u001aJ\u000e\u0010=\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u001aJ\u001b\u0010>\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bA\u0010BJ\u000e\u0010C\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001aJ\u0016\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020\u001aJ\u001e\u0010H\u001a\u00020I2\u0006\u0010.\u001a\u00020\u001aø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bJ\u0010KJ\b\u0010L\u001a\u00020\u001aH\u0016J\u000e\u0010M\u001a\u00020\n2\u0006\u00104\u001a\u00020\u001aJ\b\u0010N\u001a\u00020OH\u0016R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0015\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 ¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "", "layoutInput", "Landroidx/compose/ui/text/TextLayoutInput;", "multiParagraph", "Landroidx/compose/ui/text/MultiParagraph;", "size", "Landroidx/compose/ui/unit/IntSize;", "(Landroidx/compose/ui/text/TextLayoutInput;Landroidx/compose/ui/text/MultiParagraph;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "didOverflowHeight", "", "getDidOverflowHeight", "()Z", "didOverflowWidth", "getDidOverflowWidth", "firstBaseline", "", "getFirstBaseline", "()F", "hasVisualOverflow", "getHasVisualOverflow", "lastBaseline", "getLastBaseline", "getLayoutInput", "()Landroidx/compose/ui/text/TextLayoutInput;", "lineCount", "", "getLineCount", "()I", "getMultiParagraph", "()Landroidx/compose/ui/text/MultiParagraph;", "placeholderRects", "", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "()Ljava/util/List;", "getSize-YbymL2g", "()J", "J", "copy", "copy-O0kMr_c", "(Landroidx/compose/ui/text/TextLayoutInput;J)Landroidx/compose/ui/text/TextLayoutResult;", "equals", "other", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineBottom", "lineIndex", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", "vertical", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "getWordBoundary", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "hashCode", "isLineEllipsized", "toString", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextLayoutResult {
    private final float firstBaseline;
    private final float lastBaseline;
    @NotNull
    private final TextLayoutInput layoutInput;
    @NotNull
    private final MultiParagraph multiParagraph;
    @NotNull
    private final List<Rect> placeholderRects;
    private final long size;

    private TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j2) {
        this.layoutInput = textLayoutInput;
        this.multiParagraph = multiParagraph;
        this.size = j2;
        this.firstBaseline = multiParagraph.getFirstBaseline();
        this.lastBaseline = multiParagraph.getLastBaseline();
        this.placeholderRects = multiParagraph.getPlaceholderRects();
    }

    public /* synthetic */ TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textLayoutInput, multiParagraph, j2);
    }

    /* renamed from: copy-O0kMr_c$default  reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m3056copyO0kMr_c$default(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            textLayoutInput = textLayoutResult.layoutInput;
        }
        if ((i2 & 2) != 0) {
            j2 = textLayoutResult.m3059getSizeYbymL2g();
        }
        return textLayoutResult.m3057copyO0kMr_c(textLayoutInput, j2);
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResult textLayoutResult, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        return textLayoutResult.getLineEnd(i2, z);
    }

    @NotNull
    /* renamed from: copy-O0kMr_c  reason: not valid java name */
    public final TextLayoutResult m3057copyO0kMr_c(@NotNull TextLayoutInput layoutInput, long j2) {
        Intrinsics.checkNotNullParameter(layoutInput, "layoutInput");
        return new TextLayoutResult(layoutInput, this.multiParagraph, j2, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextLayoutResult) {
            TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
            if (Intrinsics.areEqual(this.layoutInput, textLayoutResult.layoutInput) && Intrinsics.areEqual(this.multiParagraph, textLayoutResult.multiParagraph) && IntSize.m3483equalsimpl0(m3059getSizeYbymL2g(), textLayoutResult.m3059getSizeYbymL2g())) {
                if (this.firstBaseline == textLayoutResult.firstBaseline) {
                    return ((this.lastBaseline > textLayoutResult.lastBaseline ? 1 : (this.lastBaseline == textLayoutResult.lastBaseline ? 0 : -1)) == 0) && Intrinsics.areEqual(this.placeholderRects, textLayoutResult.placeholderRects);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @NotNull
    public final ResolvedTextDirection getBidiRunDirection(int i2) {
        return this.multiParagraph.getBidiRunDirection(i2);
    }

    @NotNull
    public final Rect getBoundingBox(int i2) {
        return this.multiParagraph.getBoundingBox(i2);
    }

    @NotNull
    public final Rect getCursorRect(int i2) {
        return this.multiParagraph.getCursorRect(i2);
    }

    public final boolean getDidOverflowHeight() {
        return this.multiParagraph.getDidExceedMaxLines() || ((float) IntSize.m3484getHeightimpl(m3059getSizeYbymL2g())) < this.multiParagraph.getHeight();
    }

    public final boolean getDidOverflowWidth() {
        return ((float) IntSize.m3485getWidthimpl(m3059getSizeYbymL2g())) < this.multiParagraph.getWidth();
    }

    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public final boolean getHasVisualOverflow() {
        return getDidOverflowWidth() || getDidOverflowHeight();
    }

    public final float getHorizontalPosition(int i2, boolean z) {
        return this.multiParagraph.getHorizontalPosition(i2, z);
    }

    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    @NotNull
    public final TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final float getLineBottom(int i2) {
        return this.multiParagraph.getLineBottom(i2);
    }

    public final int getLineCount() {
        return this.multiParagraph.getLineCount();
    }

    public final int getLineEnd(int i2, boolean z) {
        return this.multiParagraph.getLineEnd(i2, z);
    }

    public final int getLineForOffset(int i2) {
        return this.multiParagraph.getLineForOffset(i2);
    }

    public final int getLineForVerticalPosition(float f2) {
        return this.multiParagraph.getLineForVerticalPosition(f2);
    }

    public final float getLineLeft(int i2) {
        return this.multiParagraph.getLineLeft(i2);
    }

    public final float getLineRight(int i2) {
        return this.multiParagraph.getLineRight(i2);
    }

    public final int getLineStart(int i2) {
        return this.multiParagraph.getLineStart(i2);
    }

    public final float getLineTop(int i2) {
        return this.multiParagraph.getLineTop(i2);
    }

    @NotNull
    public final MultiParagraph getMultiParagraph() {
        return this.multiParagraph;
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M  reason: not valid java name */
    public final int m3058getOffsetForPositionk4lQ0M(long j2) {
        return this.multiParagraph.m2999getOffsetForPositionk4lQ0M(j2);
    }

    @NotNull
    public final ResolvedTextDirection getParagraphDirection(int i2) {
        return this.multiParagraph.getParagraphDirection(i2);
    }

    @NotNull
    public final Path getPathForRange(int i2, int i3) {
        return this.multiParagraph.getPathForRange(i2, i3);
    }

    @NotNull
    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    public final long m3059getSizeYbymL2g() {
        return this.size;
    }

    /* renamed from: getWordBoundary--jx7JFs  reason: not valid java name */
    public final long m3060getWordBoundaryjx7JFs(int i2) {
        return this.multiParagraph.m3000getWordBoundaryjx7JFs(i2);
    }

    public int hashCode() {
        return (((((((((this.layoutInput.hashCode() * 31) + this.multiParagraph.hashCode()) * 31) + IntSize.m3486hashCodeimpl(m3059getSizeYbymL2g())) * 31) + Float.hashCode(this.firstBaseline)) * 31) + Float.hashCode(this.lastBaseline)) * 31) + this.placeholderRects.hashCode();
    }

    public final boolean isLineEllipsized(int i2) {
        return this.multiParagraph.isLineEllipsized(i2);
    }

    @NotNull
    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.layoutInput + ", multiParagraph=" + this.multiParagraph + ", size=" + ((Object) IntSize.m3488toStringimpl(m3059getSizeYbymL2g())) + ", firstBaseline=" + this.firstBaseline + ", lastBaseline=" + this.lastBaseline + ", placeholderRects=" + this.placeholderRects + ')';
    }
}
