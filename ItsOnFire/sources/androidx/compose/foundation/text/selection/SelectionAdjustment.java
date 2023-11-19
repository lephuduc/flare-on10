package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ?\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "", "adjust", "Landroidx/compose/ui/text/TextRange;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "newRawSelectionRange", "previousHandleOffset", "", "isStartHandle", "", "previousSelectionRange", "adjust-ZXO7KMw", "(Landroidx/compose/ui/text/TextLayoutResult;JIZLandroidx/compose/ui/text/TextRange;)J", "Companion", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public interface SelectionAdjustment {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J9\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u0015H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionAdjustment$Companion;", "", "()V", "Character", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "getCharacter", "()Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "CharacterWithWordAccelerate", "getCharacterWithWordAccelerate", "None", "getNone", "Paragraph", "getParagraph", "Word", "getWord", "adjustByBoundary", "Landroidx/compose/ui/text/TextRange;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "newRawSelection", "boundaryFun", "Lkotlin/Function1;", "", "adjustByBoundary--Dv-ylE", "(Landroidx/compose/ui/text/TextLayoutResult;JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @NotNull
        private static final SelectionAdjustment None = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$None$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo641adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j2, int i2, boolean z, @Nullable TextRange textRange) {
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                return j2;
            }
        };
        @NotNull
        private static final SelectionAdjustment Character = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Character$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo641adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j2, int i2, boolean z, @Nullable TextRange textRange) {
                int lastIndex;
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                if (TextRange.m3069getCollapsedimpl(j2)) {
                    boolean m3074getReversedimpl = textRange == null ? false : TextRange.m3074getReversedimpl(textRange.m3079unboximpl());
                    int m3075getStartimpl = TextRange.m3075getStartimpl(j2);
                    lastIndex = StringsKt__StringsKt.getLastIndex(textLayoutResult.getLayoutInput().getText());
                    return SelectionAdjustmentKt.ensureAtLeastOneChar(m3075getStartimpl, lastIndex, z, m3074getReversedimpl);
                }
                return j2;
            }
        };
        @NotNull
        private static final SelectionAdjustment Word = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Word$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo641adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j2, int i2, boolean z, @Nullable TextRange textRange) {
                long m643adjustByBoundaryDvylE;
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                m643adjustByBoundaryDvylE = SelectionAdjustment.Companion.$$INSTANCE.m643adjustByBoundaryDvylE(textLayoutResult, j2, new SelectionAdjustment$Companion$Word$1$adjust$1(textLayoutResult));
                return m643adjustByBoundaryDvylE;
            }
        };
        @NotNull
        private static final SelectionAdjustment Paragraph = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$Paragraph$1
            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo641adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j2, int i2, boolean z, @Nullable TextRange textRange) {
                long m643adjustByBoundaryDvylE;
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                m643adjustByBoundaryDvylE = SelectionAdjustment.Companion.$$INSTANCE.m643adjustByBoundaryDvylE(textLayoutResult, j2, new SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1(textLayoutResult.getLayoutInput().getText()));
                return m643adjustByBoundaryDvylE;
            }
        };
        @NotNull
        private static final SelectionAdjustment CharacterWithWordAccelerate = new SelectionAdjustment() { // from class: androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$CharacterWithWordAccelerate$1
            private final boolean isAtWordBoundary(TextLayoutResult textLayoutResult, int i2) {
                long m3060getWordBoundaryjx7JFs = textLayoutResult.m3060getWordBoundaryjx7JFs(i2);
                return i2 == TextRange.m3075getStartimpl(m3060getWordBoundaryjx7JFs) || i2 == TextRange.m3070getEndimpl(m3060getWordBoundaryjx7JFs);
            }

            private final boolean isExpanding(int i2, int i3, boolean z, boolean z2) {
                if (i3 == -1) {
                    return true;
                }
                if (i2 == i3) {
                    return false;
                }
                if (z ^ z2) {
                    if (i2 < i3) {
                        return true;
                    }
                } else if (i2 > i3) {
                    return true;
                }
                return false;
            }

            private final int snapToWordBoundary(TextLayoutResult textLayoutResult, int i2, int i3, int i4, boolean z, boolean z2) {
                long m3060getWordBoundaryjx7JFs = textLayoutResult.m3060getWordBoundaryjx7JFs(i2);
                int m3075getStartimpl = textLayoutResult.getLineForOffset(TextRange.m3075getStartimpl(m3060getWordBoundaryjx7JFs)) == i3 ? TextRange.m3075getStartimpl(m3060getWordBoundaryjx7JFs) : textLayoutResult.getLineStart(i3);
                int m3070getEndimpl = textLayoutResult.getLineForOffset(TextRange.m3070getEndimpl(m3060getWordBoundaryjx7JFs)) == i3 ? TextRange.m3070getEndimpl(m3060getWordBoundaryjx7JFs) : TextLayoutResult.getLineEnd$default(textLayoutResult, i3, false, 2, null);
                if (m3075getStartimpl == i4) {
                    return m3070getEndimpl;
                }
                if (m3070getEndimpl == i4) {
                    return m3075getStartimpl;
                }
                int i5 = (m3075getStartimpl + m3070getEndimpl) / 2;
                if (z ^ z2) {
                    if (i2 <= i5) {
                        return m3075getStartimpl;
                    }
                } else if (i2 < i5) {
                    return m3075getStartimpl;
                }
                return m3070getEndimpl;
            }

            private final int updateSelectionBoundary(TextLayoutResult textLayoutResult, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
                if (i2 == i3) {
                    return i4;
                }
                int lineForOffset = textLayoutResult.getLineForOffset(i2);
                return (lineForOffset == textLayoutResult.getLineForOffset(i4) && !(isExpanding(i2, i3, z, z2) && isAtWordBoundary(textLayoutResult, i4))) ? i2 : snapToWordBoundary(textLayoutResult, i2, lineForOffset, i5, z, z2);
            }

            @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
            /* renamed from: adjust-ZXO7KMw */
            public long mo641adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j2, int i2, boolean z, @Nullable TextRange textRange) {
                int updateSelectionBoundary;
                int i3;
                int lastIndex;
                Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
                if (textRange == null) {
                    return SelectionAdjustment.Companion.$$INSTANCE.getWord().mo641adjustZXO7KMw(textLayoutResult, j2, i2, z, textRange);
                }
                if (TextRange.m3069getCollapsedimpl(j2)) {
                    int m3075getStartimpl = TextRange.m3075getStartimpl(j2);
                    lastIndex = StringsKt__StringsKt.getLastIndex(textLayoutResult.getLayoutInput().getText());
                    return SelectionAdjustmentKt.ensureAtLeastOneChar(m3075getStartimpl, lastIndex, z, TextRange.m3074getReversedimpl(textRange.m3079unboximpl()));
                }
                if (z) {
                    i3 = updateSelectionBoundary(textLayoutResult, TextRange.m3075getStartimpl(j2), i2, TextRange.m3075getStartimpl(textRange.m3079unboximpl()), TextRange.m3070getEndimpl(j2), true, TextRange.m3074getReversedimpl(j2));
                    updateSelectionBoundary = TextRange.m3070getEndimpl(j2);
                } else {
                    int m3075getStartimpl2 = TextRange.m3075getStartimpl(j2);
                    updateSelectionBoundary = updateSelectionBoundary(textLayoutResult, TextRange.m3070getEndimpl(j2), i2, TextRange.m3070getEndimpl(textRange.m3079unboximpl()), TextRange.m3075getStartimpl(j2), false, TextRange.m3074getReversedimpl(j2));
                    i3 = m3075getStartimpl2;
                }
                return TextRangeKt.TextRange(i3, updateSelectionBoundary);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: adjustByBoundary--Dv-ylE  reason: not valid java name */
        public final long m643adjustByBoundaryDvylE(TextLayoutResult textLayoutResult, long j2, Function1<? super Integer, TextRange> function1) {
            int lastIndex;
            int coerceIn;
            int coerceIn2;
            if (textLayoutResult.getLayoutInput().getText().length() == 0) {
                return TextRange.Companion.m3080getZerod9O1mEE();
            }
            lastIndex = StringsKt__StringsKt.getLastIndex(textLayoutResult.getLayoutInput().getText());
            coerceIn = RangesKt___RangesKt.coerceIn(TextRange.m3075getStartimpl(j2), 0, lastIndex);
            long m3079unboximpl = function1.invoke(Integer.valueOf(coerceIn)).m3079unboximpl();
            coerceIn2 = RangesKt___RangesKt.coerceIn(TextRange.m3070getEndimpl(j2), 0, lastIndex);
            long m3079unboximpl2 = function1.invoke(Integer.valueOf(coerceIn2)).m3079unboximpl();
            return TextRangeKt.TextRange(TextRange.m3074getReversedimpl(j2) ? TextRange.m3070getEndimpl(m3079unboximpl) : TextRange.m3075getStartimpl(m3079unboximpl), TextRange.m3074getReversedimpl(j2) ? TextRange.m3075getStartimpl(m3079unboximpl2) : TextRange.m3070getEndimpl(m3079unboximpl2));
        }

        @NotNull
        public final SelectionAdjustment getCharacter() {
            return Character;
        }

        @NotNull
        public final SelectionAdjustment getCharacterWithWordAccelerate() {
            return CharacterWithWordAccelerate;
        }

        @NotNull
        public final SelectionAdjustment getNone() {
            return None;
        }

        @NotNull
        public final SelectionAdjustment getParagraph() {
            return Paragraph;
        }

        @NotNull
        public final SelectionAdjustment getWord() {
            return Word;
        }
    }

    /* renamed from: adjust-ZXO7KMw  reason: not valid java name */
    long mo641adjustZXO7KMw(@NotNull TextLayoutResult textLayoutResult, long j2, int i2, boolean z, @Nullable TextRange textRange);
}
