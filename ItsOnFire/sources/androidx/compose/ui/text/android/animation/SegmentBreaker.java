package androidx.compose.ui.text.android.animation;

import android.text.Layout;
import androidx.appcompat.R;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import androidx.compose.ui.text.android.LayoutCompatKt;
import androidx.compose.ui.text.android.LayoutHelper;
import androidx.core.app.NotificationCompat;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InternalPlatformTextApi
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/android/animation/SegmentBreaker;", "", "()V", "breakInWords", "", "", "layoutHelper", "Landroidx/compose/ui/text/android/LayoutHelper;", "breakOffsets", "segmentType", "Landroidx/compose/ui/text/android/animation/SegmentType;", "breakSegmentWithChar", "Landroidx/compose/ui/text/android/animation/Segment;", "dropSpaces", "", "breakSegmentWithDocument", "breakSegmentWithLine", "breakSegmentWithParagraph", "breakSegmentWithWord", "breakSegments", "breakWithBreakIterator", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "", "breaker", "Ljava/text/BreakIterator;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SegmentBreaker {
    @NotNull
    public static final SegmentBreaker INSTANCE = new SegmentBreaker();

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentType.values().length];
            iArr[SegmentType.Document.ordinal()] = 1;
            iArr[SegmentType.Paragraph.ordinal()] = 2;
            iArr[SegmentType.Line.ordinal()] = 3;
            iArr[SegmentType.Word.ordinal()] = 4;
            iArr[SegmentType.Character.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SegmentBreaker() {
    }

    private final List<Integer> breakInWords(LayoutHelper layoutHelper) {
        List<Integer> list;
        CharSequence text = layoutHelper.getLayout().getText();
        Intrinsics.checkNotNullExpressionValue(text, "text");
        BreakIterator lineInstance = BreakIterator.getLineInstance(Locale.getDefault());
        Intrinsics.checkNotNullExpressionValue(lineInstance, "getLineInstance(Locale.getDefault())");
        List<Integer> breakWithBreakIterator = breakWithBreakIterator(text, lineInstance);
        TreeSet treeSet = new TreeSet();
        int size = breakWithBreakIterator.size();
        for (int i2 = 0; i2 < size; i2++) {
            treeSet.add(Integer.valueOf(breakWithBreakIterator.get(i2).intValue()));
        }
        int paragraphCount = layoutHelper.getParagraphCount();
        int i3 = 0;
        while (i3 < paragraphCount) {
            int i4 = i3 + 1;
            Bidi analyzeBidi = layoutHelper.analyzeBidi(i3);
            if (analyzeBidi != null) {
                int paragraphStart = layoutHelper.getParagraphStart(i3);
                int runCount = analyzeBidi.getRunCount();
                for (int i5 = 0; i5 < runCount; i5++) {
                    treeSet.add(Integer.valueOf(analyzeBidi.getRunStart(i5) + paragraphStart));
                }
            }
            i3 = i4;
        }
        list = CollectionsKt___CollectionsKt.toList(treeSet);
        return list;
    }

    private final List<Segment> breakSegmentWithChar(LayoutHelper layoutHelper, boolean z) {
        int lastIndex;
        ArrayList arrayList = new ArrayList();
        List<Integer> breakOffsets = breakOffsets(layoutHelper, SegmentType.Character);
        if (breakOffsets.size() == 0 || breakOffsets.size() == 1) {
            CollectionsKt__CollectionsKt.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            boolean z2 = false;
            Integer num = breakOffsets.get(0);
            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(breakOffsets);
            int i2 = 0;
            while (i2 < lastIndex) {
                i2++;
                Integer num2 = breakOffsets.get(i2);
                int intValue = num2.intValue();
                int intValue2 = num.intValue();
                Layout layout = layoutHelper.getLayout();
                if (!z || intValue != intValue2 + 1 || !layoutHelper.isLineEndSpace(layout.getText().charAt(intValue2))) {
                    int lineForOffset = LayoutCompatKt.getLineForOffset(layout, intValue2, z2);
                    boolean z3 = layout.getParagraphDirection(lineForOffset) == -1 ? true : z2;
                    boolean isRtlCharAt = layout.isRtlCharAt(intValue2);
                    int ceil = (int) Math.ceil(layoutHelper.getHorizontalPosition(intValue2, isRtlCharAt == z3 ? true : z2, z2));
                    int ceil2 = (int) Math.ceil(layoutHelper.getHorizontalPosition(intValue, isRtlCharAt == z3, true));
                    arrayList.add(new Segment(intValue2, intValue, Math.min(ceil, ceil2), layout.getLineTop(lineForOffset), Math.max(ceil, ceil2), layout.getLineBottom(lineForOffset)));
                }
                arrayList2.add(Unit.INSTANCE);
                num = num2;
                z2 = false;
            }
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithDocument(LayoutHelper layoutHelper) {
        List<Segment> listOf;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new Segment(0, layoutHelper.getLayout().getText().length(), 0, 0, layoutHelper.getLayout().getWidth(), layoutHelper.getLayout().getHeight()));
        return listOf;
    }

    private final List<Segment> breakSegmentWithLine(LayoutHelper layoutHelper, boolean z) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int lineCount = layoutHelper.getLayout().getLineCount();
        int i2 = 0;
        while (i2 < lineCount) {
            int i3 = i2 + 1;
            arrayList.add(new Segment(layout.getLineStart(i2), layout.getLineEnd(i2), z ? (int) Math.ceil(layout.getLineLeft(i2)) : 0, layout.getLineTop(i2), z ? (int) Math.ceil(layout.getLineRight(i2)) : layout.getWidth(), layout.getLineBottom(i2)));
            i2 = i3;
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithParagraph(LayoutHelper layoutHelper) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i2 = 0; i2 < paragraphCount; i2++) {
            int paragraphStart = layoutHelper.getParagraphStart(i2);
            int paragraphEnd = layoutHelper.getParagraphEnd(i2);
            arrayList.add(new Segment(paragraphStart, paragraphEnd, 0, layout.getLineTop(LayoutCompatKt.getLineForOffset(layout, paragraphStart, false)), layout.getWidth(), layout.getLineBottom(LayoutCompatKt.getLineForOffset(layout, paragraphEnd, true))));
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithWord(LayoutHelper layoutHelper, boolean z) {
        List<Segment> emptyList;
        int lastIndex;
        int i2;
        Layout layout = layoutHelper.getLayout();
        int ceil = (int) Math.ceil(layout.getPaint().measureText(" "));
        List<Integer> breakOffsets = breakOffsets(layoutHelper, SegmentType.Word);
        if (breakOffsets.size() != 0) {
            boolean z2 = true;
            if (breakOffsets.size() != 1) {
                ArrayList arrayList = new ArrayList();
                boolean z3 = false;
                Integer num = breakOffsets.get(0);
                lastIndex = CollectionsKt__CollectionsKt.getLastIndex(breakOffsets);
                int i3 = 0;
                while (i3 < lastIndex) {
                    i3++;
                    Integer num2 = breakOffsets.get(i3);
                    int intValue = num2.intValue();
                    int intValue2 = num.intValue();
                    int lineForOffset = LayoutCompatKt.getLineForOffset(layout, intValue2, z3);
                    boolean z4 = layout.getParagraphDirection(lineForOffset) == -1 ? z2 : z3;
                    boolean isRtlCharAt = layout.isRtlCharAt(intValue2);
                    int ceil2 = (int) Math.ceil(layoutHelper.getHorizontalPosition(intValue2, isRtlCharAt == z4 ? z2 : z3, z3));
                    int ceil3 = (int) Math.ceil(layoutHelper.getHorizontalPosition(intValue, isRtlCharAt == z4 ? z2 : false, z2));
                    int min = Math.min(ceil2, ceil3);
                    int max = Math.max(ceil2, ceil3);
                    if (z && intValue != 0 && layout.getText().charAt(intValue - 1) == ' ') {
                        i2 = lineForOffset;
                        if (layout.getLineEnd(i2) != intValue) {
                            if (isRtlCharAt) {
                                min += ceil;
                            } else {
                                max -= ceil;
                            }
                        }
                    } else {
                        i2 = lineForOffset;
                    }
                    arrayList.add(new Segment(intValue2, intValue, min, layout.getLineTop(i2), max, layout.getLineBottom(i2)));
                    num = num2;
                    z2 = true;
                    z3 = false;
                }
                return arrayList;
            }
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    private final List<Integer> breakWithBreakIterator(CharSequence charSequence, BreakIterator breakIterator) {
        List<Integer> mutableListOf;
        CharSequenceCharacterIterator charSequenceCharacterIterator = new CharSequenceCharacterIterator(charSequence, 0, charSequence.length());
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(0);
        breakIterator.setText(charSequenceCharacterIterator);
        while (breakIterator.next() != -1) {
            mutableListOf.add(Integer.valueOf(breakIterator.current()));
        }
        return mutableListOf;
    }

    @NotNull
    public final List<Integer> breakOffsets(@NotNull LayoutHelper layoutHelper, @NotNull SegmentType segmentType) {
        List<Integer> listOf;
        List<Integer> mutableListOf;
        List<Integer> mutableListOf2;
        Intrinsics.checkNotNullParameter(layoutHelper, "layoutHelper");
        Intrinsics.checkNotNullParameter(segmentType, "segmentType");
        Layout layout = layoutHelper.getLayout();
        CharSequence text = layout.getText();
        int i2 = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, Integer.valueOf(text.length())});
            return listOf;
        } else if (i2 == 2) {
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(0);
            int paragraphCount = layoutHelper.getParagraphCount();
            while (i3 < paragraphCount) {
                mutableListOf.add(Integer.valueOf(layoutHelper.getParagraphEnd(i3)));
                i3++;
            }
            return mutableListOf;
        } else if (i2 == 3) {
            mutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(0);
            int lineCount = layout.getLineCount();
            while (i3 < lineCount) {
                mutableListOf2.add(Integer.valueOf(layout.getLineEnd(i3)));
                i3++;
            }
            return mutableListOf2;
        } else if (i2 != 4) {
            if (i2 == 5) {
                Intrinsics.checkNotNullExpressionValue(text, "text");
                BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.getDefault());
                Intrinsics.checkNotNullExpressionValue(characterInstance, "getCharacterInstance(Locale.getDefault())");
                return breakWithBreakIterator(text, characterInstance);
            }
            throw new NoWhenBranchMatchedException();
        } else {
            return breakInWords(layoutHelper);
        }
    }

    @NotNull
    public final List<Segment> breakSegments(@NotNull LayoutHelper layoutHelper, @NotNull SegmentType segmentType, boolean z) {
        Intrinsics.checkNotNullParameter(layoutHelper, "layoutHelper");
        Intrinsics.checkNotNullParameter(segmentType, "segmentType");
        int i2 = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return breakSegmentWithChar(layoutHelper, z);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return breakSegmentWithWord(layoutHelper, z);
                }
                return breakSegmentWithLine(layoutHelper, z);
            }
            return breakSegmentWithParagraph(layoutHelper);
        }
        return breakSegmentWithDocument(layoutHelper);
    }
}
