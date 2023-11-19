package androidx.compose.ui.text.android;

import android.text.Layout;
import androidx.annotation.IntRange;
import androidx.appcompat.R;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InternalPlatformTextApi
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001'B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\rJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aJ\u0010\u0010\u001e\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\rJ\u0010\u0010\u001f\u001a\u00020\r2\b\b\u0001\u0010\u0018\u001a\u00020\rJ\u0010\u0010 \u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\rJ\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u00020\u001a2\b\b\u0001\u0010\u0015\u001a\u00020\rJ\u0010\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper;", "", "layout", "Landroid/text/Layout;", "(Landroid/text/Layout;)V", "bidiProcessedParagraphs", "", "getLayout", "()Landroid/text/Layout;", "paragraphBidi", "", "Ljava/text/Bidi;", "paragraphCount", "", "getParagraphCount", "()I", "paragraphEnds", "", "tmpBuffer", "", "analyzeBidi", "paragraphIndex", "getDownstreamHorizontal", "", "offset", "primary", "", "getHorizontalPosition", "usePrimaryDirection", "upstream", "getParagraphEnd", "getParagraphForOffset", "getParagraphStart", "isLineEndSpace", "c", "", "isRtlParagraph", "lineEndToVisibleEnd", "lineEnd", "BidiRun", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LayoutHelper {
    @NotNull
    private final boolean[] bidiProcessedParagraphs;
    @NotNull
    private final Layout layout;
    @NotNull
    private final List<Bidi> paragraphBidi;
    private final int paragraphCount;
    @NotNull
    private final List<Integer> paragraphEnds;
    @Nullable
    private char[] tmpBuffer;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "", "start", "", "end", "isRtl", "", "(IIZ)V", "getEnd", "()I", "()Z", "getStart", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class BidiRun {
        private final int end;
        private final boolean isRtl;
        private final int start;

        public BidiRun(int i2, int i3, boolean z) {
            this.start = i2;
            this.end = i3;
            this.isRtl = z;
        }

        public static /* synthetic */ BidiRun copy$default(BidiRun bidiRun, int i2, int i3, boolean z, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = bidiRun.start;
            }
            if ((i4 & 2) != 0) {
                i3 = bidiRun.end;
            }
            if ((i4 & 4) != 0) {
                z = bidiRun.isRtl;
            }
            return bidiRun.copy(i2, i3, z);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final boolean component3() {
            return this.isRtl;
        }

        @NotNull
        public final BidiRun copy(int i2, int i3, boolean z) {
            return new BidiRun(i2, i3, z);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BidiRun) {
                BidiRun bidiRun = (BidiRun) obj;
                return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
            }
            return false;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31;
            boolean z = this.isRtl;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            return hashCode + i2;
        }

        public final boolean isRtl() {
            return this.isRtl;
        }

        @NotNull
        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }
    }

    public LayoutHelper(@NotNull Layout layout) {
        int indexOf$default;
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        do {
            CharSequence text = this.layout.getText();
            Intrinsics.checkNotNullExpressionValue(text, "layout.text");
            indexOf$default = StringsKt__StringsKt.indexOf$default(text, '\n', i3, false, 4, (Object) null);
            i3 = indexOf$default < 0 ? this.layout.getText().length() : indexOf$default + 1;
            arrayList.add(Integer.valueOf(i3));
        } while (i3 < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        while (i2 < size) {
            i2++;
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    private final float getDownstreamHorizontal(int i2, boolean z) {
        Layout layout = this.layout;
        return z ? layout.getPrimaryHorizontal(i2) : layout.getSecondaryHorizontal(i2);
    }

    private final int lineEndToVisibleEnd(int i2) {
        while (i2 > 0 && isLineEndSpace(this.layout.getText().charAt(i2 - 1))) {
            i2--;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r0.getRunCount() == 1) goto L25;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.text.Bidi analyzeBidi(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.bidiProcessedParagraphs
            boolean r0 = r0[r12]
            if (r0 == 0) goto Lf
            java.util.List<java.text.Bidi> r11 = r11.paragraphBidi
            java.lang.Object r11 = r11.get(r12)
            java.text.Bidi r11 = (java.text.Bidi) r11
            return r11
        Lf:
            r0 = 0
            if (r12 != 0) goto L14
            r1 = r0
            goto L22
        L14:
            java.util.List<java.lang.Integer> r1 = r11.paragraphEnds
            int r2 = r12 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List<java.lang.Integer> r2 = r11.paragraphEnds
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.tmpBuffer
            if (r3 == 0) goto L37
            int r4 = r3.length
            if (r4 >= r8) goto L39
        L37:
            char[] r3 = new char[r8]
        L39:
            r10 = r3
            android.text.Layout r3 = r11.layout
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            boolean r9 = r11.isRtlParagraph(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L60
        L5f:
            r0 = r1
        L60:
            java.util.List<java.text.Bidi> r3 = r11.paragraphBidi
            r3.set(r12, r0)
            boolean[] r3 = r11.bidiProcessedParagraphs
            r3[r12] = r2
            if (r0 == 0) goto L72
            char[] r12 = r11.tmpBuffer
            if (r10 != r12) goto L71
            r10 = r1
            goto L72
        L71:
            r10 = r12
        L72:
            r11.tmpBuffer = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.LayoutHelper.analyzeBidi(int):java.text.Bidi");
    }

    public final float getHorizontalPosition(int i2, boolean z, boolean z2) {
        int lastIndex;
        int lastIndex2;
        int lineForOffset = LayoutCompatKt.getLineForOffset(this.layout, i2, z2);
        int lineStart = this.layout.getLineStart(lineForOffset);
        int lineEnd = this.layout.getLineEnd(lineForOffset);
        if (i2 == lineStart || i2 == lineEnd) {
            if (i2 == 0 || i2 == this.layout.getText().length()) {
                return getDownstreamHorizontal(i2, z);
            }
            int paragraphForOffset = getParagraphForOffset(i2);
            boolean isRtlParagraph = isRtlParagraph(paragraphForOffset);
            Bidi analyzeBidi = analyzeBidi(paragraphForOffset);
            Bidi createLineBidi = analyzeBidi == null ? null : analyzeBidi.createLineBidi(lineStart, lineEndToVisibleEnd(lineEnd));
            boolean z3 = false;
            if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
                boolean isRtlCharAt = this.layout.isRtlCharAt(lineStart);
                if (z || isRtlParagraph == isRtlCharAt) {
                    isRtlParagraph = !isRtlParagraph;
                }
                if (i2 == lineStart) {
                    z3 = isRtlParagraph;
                } else if (!isRtlParagraph) {
                    z3 = true;
                }
                Layout layout = this.layout;
                return z3 ? layout.getLineLeft(lineForOffset) : layout.getLineRight(lineForOffset);
            }
            int runCount = createLineBidi.getRunCount();
            BidiRun[] bidiRunArr = new BidiRun[runCount];
            for (int i3 = 0; i3 < runCount; i3++) {
                bidiRunArr[i3] = new BidiRun(createLineBidi.getRunStart(i3) + lineStart, createLineBidi.getRunLimit(i3) + lineStart, createLineBidi.getRunLevel(i3) % 2 == 1);
            }
            int runCount2 = createLineBidi.getRunCount();
            byte[] bArr = new byte[runCount2];
            for (int i4 = 0; i4 < runCount2; i4++) {
                bArr[i4] = (byte) createLineBidi.getRunLevel(i4);
            }
            Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
            int i5 = -1;
            if (i2 == lineStart) {
                int i6 = 0;
                while (true) {
                    if (i6 >= runCount) {
                        break;
                    }
                    int i7 = i6 + 1;
                    if (bidiRunArr[i6].getStart() == i2) {
                        i5 = i6;
                        break;
                    }
                    i6 = i7;
                }
                BidiRun bidiRun = bidiRunArr[i5];
                if (z || isRtlParagraph == bidiRun.isRtl()) {
                    isRtlParagraph = !isRtlParagraph;
                }
                if (i5 == 0 && isRtlParagraph) {
                    return this.layout.getLineLeft(lineForOffset);
                }
                lastIndex2 = ArraysKt___ArraysKt.getLastIndex(bidiRunArr);
                if (i5 != lastIndex2 || isRtlParagraph) {
                    Layout layout2 = this.layout;
                    return isRtlParagraph ? layout2.getPrimaryHorizontal(bidiRunArr[i5 - 1].getStart()) : layout2.getPrimaryHorizontal(bidiRunArr[i5 + 1].getStart());
                }
                return this.layout.getLineRight(lineForOffset);
            }
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    break;
                }
                int i9 = i8 + 1;
                if (bidiRunArr[i8].getEnd() == i2) {
                    i5 = i8;
                    break;
                }
                i8 = i9;
            }
            BidiRun bidiRun2 = bidiRunArr[i5];
            if (!z && isRtlParagraph != bidiRun2.isRtl()) {
                isRtlParagraph = !isRtlParagraph;
            }
            if (i5 == 0 && isRtlParagraph) {
                return this.layout.getLineLeft(lineForOffset);
            }
            lastIndex = ArraysKt___ArraysKt.getLastIndex(bidiRunArr);
            if (i5 != lastIndex || isRtlParagraph) {
                Layout layout3 = this.layout;
                return isRtlParagraph ? layout3.getPrimaryHorizontal(bidiRunArr[i5 - 1].getEnd()) : layout3.getPrimaryHorizontal(bidiRunArr[i5 + 1].getEnd());
            }
            return this.layout.getLineRight(lineForOffset);
        }
        return getDownstreamHorizontal(i2, z);
    }

    @NotNull
    public final Layout getLayout() {
        return this.layout;
    }

    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    public final int getParagraphEnd(@IntRange(from = 0) int i2) {
        return this.paragraphEnds.get(i2).intValue();
    }

    public final int getParagraphForOffset(@IntRange(from = 0) int i2) {
        int binarySearch$default;
        binarySearch$default = CollectionsKt__CollectionsKt.binarySearch$default(this.paragraphEnds, Integer.valueOf(i2), 0, 0, 6, (Object) null);
        return binarySearch$default < 0 ? -(binarySearch$default + 1) : binarySearch$default + 1;
    }

    public final int getParagraphStart(@IntRange(from = 0) int i2) {
        if (i2 == 0) {
            return 0;
        }
        return this.paragraphEnds.get(i2 - 1).intValue();
    }

    public final boolean isLineEndSpace(char c2) {
        if (c2 == ' ' || c2 == '\n' || c2 == 5760) {
            return true;
        }
        return ((8192 <= c2 && c2 < 8203) && c2 != 8199) || c2 == 8287 || c2 == 12288;
    }

    public final boolean isRtlParagraph(@IntRange(from = 0) int i2) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(getParagraphStart(i2))) == -1;
    }
}
