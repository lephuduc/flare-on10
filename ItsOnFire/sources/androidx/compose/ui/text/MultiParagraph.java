package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BY\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014B)\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0017J\u000e\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u000bJ\u000e\u00109\u001a\u0002032\u0006\u00108\u001a\u00020\u000bJ\u000e\u0010:\u001a\u0002032\u0006\u00108\u001a\u00020\u000bJ\u0016\u0010;\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\rJ\u000e\u0010=\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u000bJ\u0018\u0010?\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000b2\b\b\u0002\u0010@\u001a\u00020\rJ\u000e\u0010A\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000bJ\u000e\u0010B\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020\u000fJ\u000e\u0010D\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u000bJ\u000e\u0010E\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u000bJ\u000e\u0010F\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u000bJ\u000e\u0010G\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000bJ\u000e\u0010H\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u000bJ\u000e\u0010I\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u000bJ\u001b\u0010J\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020Lø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bM\u0010NJ\u000e\u0010O\u001a\u0002072\u0006\u00108\u001a\u00020\u000bJ\u0016\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u000b2\u0006\u0010S\u001a\u00020\u000bJ\u001e\u0010T\u001a\u00020U2\u0006\u00108\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bV\u0010WJ\u000e\u0010X\u001a\u00020\r2\u0006\u0010>\u001a\u00020\u000bJ=\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\2\b\b\u0002\u0010]\u001a\u00020^2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010`2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001a\u00020Z2\u0006\u00108\u001a\u00020\u000bH\u0002J\u0010\u0010f\u001a\u00020Z2\u0006\u00108\u001a\u00020\u000bH\u0002J\u0010\u0010g\u001a\u00020Z2\u0006\u0010>\u001a\u00020\u000bH\u0002R\u0014\u0010\u0002\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0011\u0010&\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0011\u0010,\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001fR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0019\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u00101R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006h"}, d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "maxLines", "", "ellipsis", "", "width", "", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "intrinsics", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;IZF)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "didExceedMaxLines", "getDidExceedMaxLines", "()Z", "firstBaseline", "getFirstBaseline", "()F", "height", "getHeight", "getIntrinsics", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "lastBaseline", "getLastBaseline", "lineCount", "getLineCount", "()I", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "getMaxLines", "minIntrinsicWidth", "getMinIntrinsicWidth", "paragraphInfoList", "Landroidx/compose/ui/text/ParagraphInfo;", "getParagraphInfoList$ui_text_release", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "getWidth", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineBottom", "lineIndex", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", "vertical", "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineWidth", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "getWordBoundary", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "isLineEllipsized", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "color", "Landroidx/compose/ui/graphics/Color;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "decoration", "Landroidx/compose/ui/text/style/TextDecoration;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "requireIndexInRange", "requireIndexInRangeInclusiveEnd", "requireLineIndexInRange", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class MultiParagraph {
    private final boolean didExceedMaxLines;
    private final float height;
    @NotNull
    private final MultiParagraphIntrinsics intrinsics;
    private final int lineCount;
    private final int maxLines;
    @NotNull
    private final List<ParagraphInfo> paragraphInfoList;
    @NotNull
    private final List<Rect> placeholderRects;
    private final float width;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiParagraph(@NotNull AnnotatedString annotatedString, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, int i2, boolean z, float f2, @NotNull Density density, @NotNull Font.ResourceLoader resourceLoader) {
        this(new MultiParagraphIntrinsics(annotatedString, style, placeholders, density, resourceLoader), i2, z, f2);
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ MultiParagraph(androidx.compose.ui.text.AnnotatedString r11, androidx.compose.ui.text.TextStyle r12, java.util.List r13, int r14, boolean r15, float r16, androidx.compose.ui.unit.Density r17, androidx.compose.ui.text.font.Font.ResourceLoader r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19 & 4
            if (r0 == 0) goto La
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r4 = r0
            goto Lb
        La:
            r4 = r13
        Lb:
            r0 = r19 & 8
            if (r0 == 0) goto L14
            r0 = 2147483647(0x7fffffff, float:NaN)
            r5 = r0
            goto L15
        L14:
            r5 = r14
        L15:
            r0 = r19 & 16
            if (r0 == 0) goto L1c
            r0 = 0
            r6 = r0
            goto L1d
        L1c:
            r6 = r15
        L1d:
            r1 = r10
            r2 = r11
            r3 = r12
            r7 = r16
            r8 = r17
            r9 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.MultiParagraph.<init>(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.text.TextStyle, java.util.List, int, boolean, float, androidx.compose.ui.unit.Density, androidx.compose.ui.text.font.Font$ResourceLoader, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public MultiParagraph(@NotNull MultiParagraphIntrinsics intrinsics, int i2, boolean z, float f2) {
        boolean z2;
        int lastIndex;
        Intrinsics.checkNotNullParameter(intrinsics, "intrinsics");
        this.intrinsics = intrinsics;
        this.maxLines = i2;
        ArrayList arrayList = new ArrayList();
        List<ParagraphIntrinsicInfo> infoList$ui_text_release = intrinsics.getInfoList$ui_text_release();
        int size = infoList$ui_text_release.size();
        float f3 = 0.0f;
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            int i5 = i3 + 1;
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = infoList$ui_text_release.get(i3);
            Paragraph Paragraph = ParagraphKt.Paragraph(paragraphIntrinsicInfo.getIntrinsics(), this.maxLines - i4, z, f2);
            float height = f3 + Paragraph.getHeight();
            int lineCount = i4 + Paragraph.getLineCount();
            arrayList.add(new ParagraphInfo(Paragraph, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i4, lineCount, f3, height));
            if (Paragraph.getDidExceedMaxLines()) {
                i4 = lineCount;
            } else {
                i4 = lineCount;
                if (i4 == this.maxLines) {
                    lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this.intrinsics.getInfoList$ui_text_release());
                    if (i3 != lastIndex) {
                    }
                }
                i3 = i5;
                f3 = height;
            }
            z2 = true;
            f3 = height;
            break;
        }
        z2 = false;
        this.height = f3;
        this.lineCount = i4;
        this.didExceedMaxLines = z2;
        this.paragraphInfoList = arrayList;
        this.width = f2;
        List<Rect> arrayList2 = new ArrayList<>(arrayList.size());
        int size2 = arrayList.size();
        int i6 = 0;
        while (i6 < size2) {
            int i7 = i6 + 1;
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i6);
            List<Rect> placeholderRects = paragraphInfo.getParagraph().getPlaceholderRects();
            ArrayList arrayList3 = new ArrayList(placeholderRects.size());
            int size3 = placeholderRects.size();
            int i8 = 0;
            while (i8 < size3) {
                int i9 = i8 + 1;
                Rect rect = placeholderRects.get(i8);
                arrayList3.add(rect == null ? null : paragraphInfo.toGlobal(rect));
                i8 = i9;
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList2, arrayList3);
            i6 = i7;
        }
        if (arrayList2.size() < getIntrinsics().getPlaceholders().size()) {
            int size4 = getIntrinsics().getPlaceholders().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            int i10 = 0;
            while (i10 < size4) {
                i10++;
                arrayList4.add(null);
            }
            arrayList2 = CollectionsKt___CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4);
        }
        this.placeholderRects = arrayList2;
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i2, boolean z, float f2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, (i3 & 2) != 0 ? Integer.MAX_VALUE : i2, (i3 & 4) != 0 ? false : z, f2);
    }

    private final AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    public static /* synthetic */ int getLineEnd$default(MultiParagraph multiParagraph, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        return multiParagraph.getLineEnd(i2, z);
    }

    /* renamed from: paint-RPmYEkk$default  reason: not valid java name */
    public static /* synthetic */ void m2998paintRPmYEkk$default(MultiParagraph multiParagraph, Canvas canvas, long j2, Shadow shadow, TextDecoration textDecoration, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = Color.Companion.m1428getUnspecified0d7_KjU();
        }
        multiParagraph.m3001paintRPmYEkk(canvas, j2, (i2 & 4) != 0 ? null : shadow, (i2 & 8) != 0 ? null : textDecoration);
    }

    private final void requireIndexInRange(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 < getAnnotatedString().getText().length()) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i2 + ") is out of bounds [0, " + getAnnotatedString().length() + ')').toString());
    }

    private final void requireIndexInRangeInclusiveEnd(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 <= getAnnotatedString().getText().length()) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i2 + ") is out of bounds [0, " + getAnnotatedString().length() + ']').toString());
    }

    private final void requireLineIndexInRange(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 < this.lineCount) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("lineIndex(" + i2 + ") is out of bounds [0, " + i2 + ')').toString());
    }

    @NotNull
    public final ResolvedTextDirection getBidiRunDirection(int i2) {
        requireIndexInRangeInclusiveEnd(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i2 == getAnnotatedString().length() ? CollectionsKt__CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i2));
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(i2));
    }

    @NotNull
    public final Rect getBoundingBox(int i2) {
        requireIndexInRange(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i2));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(i2)));
    }

    @NotNull
    public final Rect getCursorRect(int i2) {
        requireIndexInRangeInclusiveEnd(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i2 == getAnnotatedString().length() ? CollectionsKt__CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i2));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getCursorRect(paragraphInfo.toLocalIndex(i2)));
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float getFirstBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).getParagraph().getFirstBaseline();
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getHorizontalPosition(int i2, boolean z) {
        requireIndexInRangeInclusiveEnd(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i2 == getAnnotatedString().length() ? CollectionsKt__CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i2));
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(i2), z);
    }

    @NotNull
    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final float getLastBaseline() {
        Object last;
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        last = CollectionsKt___CollectionsKt.last((List<? extends Object>) this.paragraphInfoList);
        ParagraphInfo paragraphInfo = (ParagraphInfo) last;
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLastBaseline());
    }

    public final float getLineBottom(int i2) {
        requireLineIndexInRange(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i2));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBottom(paragraphInfo.toLocalLineIndex(i2)));
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getLineEnd(int i2, boolean z) {
        requireLineIndexInRange(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i2));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineEnd(paragraphInfo.toLocalLineIndex(i2), z));
    }

    public final int getLineForOffset(int i2) {
        requireIndexInRangeInclusiveEnd(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i2 == getAnnotatedString().length() ? CollectionsKt__CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i2));
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(i2)));
    }

    public final int getLineForVerticalPosition(float f2) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(f2 <= 0.0f ? 0 : f2 >= this.height ? CollectionsKt__CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByY(this.paragraphInfoList, f2));
        return paragraphInfo.getLength() == 0 ? Math.max(0, paragraphInfo.getStartIndex() - 1) : paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(f2)));
    }

    public final float getLineHeight(int i2) {
        requireLineIndexInRange(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i2));
        return paragraphInfo.getParagraph().getLineHeight(paragraphInfo.toLocalLineIndex(i2));
    }

    public final float getLineLeft(int i2) {
        requireLineIndexInRange(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i2));
        return paragraphInfo.getParagraph().getLineLeft(paragraphInfo.toLocalLineIndex(i2));
    }

    public final float getLineRight(int i2) {
        requireLineIndexInRange(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i2));
        return paragraphInfo.getParagraph().getLineRight(paragraphInfo.toLocalLineIndex(i2));
    }

    public final int getLineStart(int i2) {
        requireLineIndexInRange(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i2));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineStart(paragraphInfo.toLocalLineIndex(i2)));
    }

    public final float getLineTop(int i2) {
        requireLineIndexInRange(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i2));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineTop(paragraphInfo.toLocalLineIndex(i2)));
    }

    public final float getLineWidth(int i2) {
        requireLineIndexInRange(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i2));
        return paragraphInfo.getParagraph().getLineWidth(paragraphInfo.toLocalLineIndex(i2));
    }

    public final float getMaxIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final float getMinIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M  reason: not valid java name */
    public final int m2999getOffsetForPositionk4lQ0M(long j2) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(Offset.m1162getYimpl(j2) <= 0.0f ? 0 : Offset.m1162getYimpl(j2) >= this.height ? CollectionsKt__CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Offset.m1162getYimpl(j2)));
        return paragraphInfo.getLength() == 0 ? Math.max(0, paragraphInfo.getStartIndex() - 1) : paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo3002getOffsetForPositionk4lQ0M(paragraphInfo.m3007toLocalMKHz9U(j2)));
    }

    @NotNull
    public final ResolvedTextDirection getParagraphDirection(int i2) {
        requireIndexInRangeInclusiveEnd(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i2 == getAnnotatedString().length() ? CollectionsKt__CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i2));
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(i2));
    }

    @NotNull
    public final List<ParagraphInfo> getParagraphInfoList$ui_text_release() {
        return this.paragraphInfoList;
    }

    @NotNull
    public final Path getPathForRange(int i2, int i3) {
        boolean z = true;
        if (!(i2 >= 0 && i2 <= i3) || i3 > getAnnotatedString().getText().length()) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Start(" + i2 + ") or End(" + i3 + ") is out of range [0.." + getAnnotatedString().getText().length() + "), or start > end!").toString());
        } else if (i2 == i3) {
            return AndroidPath_androidKt.Path();
        } else {
            int findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i2);
            Path Path = AndroidPath_androidKt.Path();
            int size = this.paragraphInfoList.size();
            while (findParagraphByIndex < size) {
                int i4 = findParagraphByIndex + 1;
                ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
                if (paragraphInfo.getStartIndex() >= i3) {
                    break;
                }
                if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                    Path.DefaultImpls.m1599addPathUv8p0NA$default(Path, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(i2), paragraphInfo.toLocalIndex(i3))), 0L, 2, null);
                }
                findParagraphByIndex = i4;
            }
            return Path;
        }
    }

    @NotNull
    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final float getWidth() {
        return this.width;
    }

    /* renamed from: getWordBoundary--jx7JFs  reason: not valid java name */
    public final long m3000getWordBoundaryjx7JFs(int i2) {
        requireIndexInRangeInclusiveEnd(i2);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(i2 == getAnnotatedString().length() ? CollectionsKt__CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i2));
        return paragraphInfo.m3006toGlobalGEjPoXI(paragraphInfo.getParagraph().mo3003getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(i2)));
    }

    public final boolean isLineEllipsized(int i2) {
        requireLineIndexInRange(i2);
        return this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i2)).getParagraph().isLineEllipsized(i2);
    }

    /* renamed from: paint-RPmYEkk  reason: not valid java name */
    public final void m3001paintRPmYEkk(@NotNull Canvas canvas, long j2, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            ParagraphInfo paragraphInfo = list.get(i2);
            paragraphInfo.getParagraph().mo3004paintRPmYEkk(canvas, j2, shadow, textDecoration);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
            i2 = i3;
        }
        canvas.restore();
    }
}
