package androidx.compose.foundation.text.selection;

import androidx.appcompat.R;
import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b(\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002B2\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\fø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0002J$\u0010(\u001a\u00028\u00002\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020+0*¢\u0006\u0002\b,¢\u0006\u0002\u0010-J$\u0010.\u001a\u00028\u00002\u0017\u0010)\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020+0*¢\u0006\u0002\b,¢\u0006\u0002\u0010-J\u000b\u0010/\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u00101\u001a\u00028\u0000¢\u0006\u0002\u00100J\b\u00102\u001a\u00020&H\u0002J\b\u00103\u001a\u00020&H\u0002J\b\u00104\u001a\u000205H\u0002J\u000b\u00106\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u00107\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u00108\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u00109\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010:\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010;\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010<\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010=\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010>\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010?\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010@\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010A\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010B\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010C\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010D\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010E\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010F\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010G\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010H\u001a\u00028\u0000¢\u0006\u0002\u00100J\u000b\u0010I\u001a\u00028\u0000¢\u0006\u0002\u00100J\u0010\u0010J\u001a\u00020+2\u0006\u0010'\u001a\u00020&H\u0004J\u0018\u0010K\u001a\u00020+2\u0006\u0010L\u001a\u00020&2\u0006\u0010M\u001a\u00020&H\u0004J\b\u0010N\u001a\u00020&H\u0002J\b\u0010O\u001a\u00020&H\u0002J\b\u0010P\u001a\u00020&H\u0002J>\u0010Q\u001a\u00028\u0000\"\u0004\b\u0001\u0010R*\u0002HR2\b\b\u0002\u0010S\u001a\u0002052\u0017\u0010T\u001a\u0013\u0012\u0004\u0012\u0002HR\u0012\u0004\u0012\u00020+0*¢\u0006\u0002\b,H\u0084\bø\u0001\u0003¢\u0006\u0002\u0010UJ\u0016\u0010V\u001a\u00020&*\u00020\b2\b\b\u0002\u0010W\u001a\u00020&H\u0002J\u0016\u0010X\u001a\u00020&*\u00020\b2\b\b\u0002\u0010W\u001a\u00020&H\u0002J\u0016\u0010Y\u001a\u00020&*\u00020\b2\b\b\u0002\u0010W\u001a\u00020&H\u0002J\u0016\u0010Z\u001a\u00020&*\u00020\b2\b\b\u0002\u0010W\u001a\u00020&H\u0002J\u0014\u0010[\u001a\u00020&*\u00020\b2\u0006\u0010\\\u001a\u00020&H\u0002R\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R%\u0010\u001b\u001a\u00020\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u0016\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006]"}, d2 = {"Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "T", "", "originalText", "Landroidx/compose/ui/text/AnnotatedString;", "originalSelection", "Landroidx/compose/ui/text/TextRange;", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "state", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "annotatedString", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "setAnnotatedString", "(Landroidx/compose/ui/text/AnnotatedString;)V", "getLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "getOriginalSelection-d9O1mEE", "()J", "J", "getOriginalText", "selection", "getSelection-d9O1mEE", "setSelection-5zc-tL8", "(J)V", "getState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", NotificationCompat.MessagingStyle.Message.KEY_TEXT, "", "getText$foundation_release", "()Ljava/lang/String;", "charOffset", "", "offset", "collapseLeftOr", "or", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "collapseRightOr", "deleteSelected", "()Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "deselect", "getParagraphEnd", "getParagraphStart", "isLtr", "", "moveCursorDownByLine", "moveCursorLeft", "moveCursorLeftByWord", "moveCursorNext", "moveCursorNextByParagraph", "moveCursorNextByWord", "moveCursorPrev", "moveCursorPrevByParagraph", "moveCursorPrevByWord", "moveCursorRight", "moveCursorRightByWord", "moveCursorToEnd", "moveCursorToHome", "moveCursorToLineEnd", "moveCursorToLineLeftSide", "moveCursorToLineRightSide", "moveCursorToLineStart", "moveCursorUpByLine", "selectAll", "selectMovement", "setCursor", "setSelection", "start", "end", "transformedEndOffset", "transformedMaxOffset", "transformedMinOffset", "apply", "U", "resetCachedX", "block", "(Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "getLineEndByOffset", "currentOffset", "getLineStartByOffset", "getNextWordOffset", "getPrevWordOffset", "jumpByLinesOffset", "linesAmount", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public abstract class BaseTextPreparedSelection<T extends BaseTextPreparedSelection<T>> {
    @NotNull
    private AnnotatedString annotatedString;
    @Nullable
    private final TextLayoutResult layoutResult;
    @NotNull
    private final OffsetMapping offsetMapping;
    private final long originalSelection;
    @NotNull
    private final AnnotatedString originalText;
    private long selection;
    @NotNull
    private final TextPreparedSelectionState state;

    private BaseTextPreparedSelection(AnnotatedString annotatedString, long j2, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState) {
        this.originalText = annotatedString;
        this.originalSelection = j2;
        this.layoutResult = textLayoutResult;
        this.offsetMapping = offsetMapping;
        this.state = textPreparedSelectionState;
        this.selection = m628getOriginalSelectiond9O1mEE();
        this.annotatedString = annotatedString;
    }

    public /* synthetic */ BaseTextPreparedSelection(AnnotatedString annotatedString, long j2, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j2, textLayoutResult, offsetMapping, textPreparedSelectionState);
    }

    public static /* synthetic */ BaseTextPreparedSelection apply$default(BaseTextPreparedSelection baseTextPreparedSelection, Object obj, boolean z, Function1 block, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 1) != 0) {
                z = true;
            }
            Intrinsics.checkNotNullParameter(block, "block");
            if (z) {
                baseTextPreparedSelection.getState().resetCachedX();
            }
            if (baseTextPreparedSelection.getText$foundation_release().length() > 0) {
                block.invoke(obj);
            }
            if (obj != null) {
                return (BaseTextPreparedSelection) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
    }

    private final int charOffset(int i2) {
        int coerceAtMost;
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(i2, getText$foundation_release().length() - 1);
        return coerceAtMost;
    }

    private final int getLineEndByOffset(TextLayoutResult textLayoutResult, int i2) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i2), true));
    }

    public static /* synthetic */ int getLineEndByOffset$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i2 = baseTextPreparedSelection.transformedMaxOffset();
            }
            return baseTextPreparedSelection.getLineEndByOffset(textLayoutResult, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffset");
    }

    private final int getLineStartByOffset(TextLayoutResult textLayoutResult, int i2) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i2)));
    }

    public static /* synthetic */ int getLineStartByOffset$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i2 = baseTextPreparedSelection.transformedMinOffset();
            }
            return baseTextPreparedSelection.getLineStartByOffset(textLayoutResult, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffset");
    }

    private final int getNextWordOffset(TextLayoutResult textLayoutResult, int i2) {
        if (i2 >= this.originalText.length()) {
            return this.originalText.length();
        }
        long m3060getWordBoundaryjx7JFs = textLayoutResult.m3060getWordBoundaryjx7JFs(charOffset(i2));
        return TextRange.m3070getEndimpl(m3060getWordBoundaryjx7JFs) <= i2 ? getNextWordOffset(textLayoutResult, i2 + 1) : this.offsetMapping.transformedToOriginal(TextRange.m3070getEndimpl(m3060getWordBoundaryjx7JFs));
    }

    public static /* synthetic */ int getNextWordOffset$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i2 = baseTextPreparedSelection.transformedEndOffset();
            }
            return baseTextPreparedSelection.getNextWordOffset(textLayoutResult, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffset");
    }

    private final int getParagraphEnd() {
        return StringHelpersKt.findParagraphEnd(getText$foundation_release(), TextRange.m3072getMaximpl(m629getSelectiond9O1mEE()));
    }

    private final int getParagraphStart() {
        return StringHelpersKt.findParagraphStart(getText$foundation_release(), TextRange.m3073getMinimpl(m629getSelectiond9O1mEE()));
    }

    private final int getPrevWordOffset(TextLayoutResult textLayoutResult, int i2) {
        if (i2 < 0) {
            return 0;
        }
        long m3060getWordBoundaryjx7JFs = textLayoutResult.m3060getWordBoundaryjx7JFs(charOffset(i2));
        return TextRange.m3075getStartimpl(m3060getWordBoundaryjx7JFs) >= i2 ? getPrevWordOffset(textLayoutResult, i2 - 1) : this.offsetMapping.transformedToOriginal(TextRange.m3075getStartimpl(m3060getWordBoundaryjx7JFs));
    }

    public static /* synthetic */ int getPrevWordOffset$default(BaseTextPreparedSelection baseTextPreparedSelection, TextLayoutResult textLayoutResult, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i2 = baseTextPreparedSelection.transformedEndOffset();
            }
            return baseTextPreparedSelection.getPrevWordOffset(textLayoutResult, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
    }

    private final boolean isLtr() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        return (textLayoutResult == null ? null : textLayoutResult.getParagraphDirection(TextRange.m3070getEndimpl(m629getSelectiond9O1mEE()))) != ResolvedTextDirection.Rtl;
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i2) {
        int transformedEndOffset = transformedEndOffset();
        if (this.state.getCachedX() == null) {
            this.state.setCachedX(Float.valueOf(textLayoutResult.getCursorRect(transformedEndOffset).getLeft()));
        }
        int lineForOffset = textLayoutResult.getLineForOffset(transformedEndOffset) + i2;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return getText$foundation_release().length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset) - 1;
        Float cachedX = this.state.getCachedX();
        Intrinsics.checkNotNull(cachedX);
        float floatValue = cachedX.floatValue();
        if ((!isLtr() || floatValue < textLayoutResult.getLineRight(lineForOffset)) && (isLtr() || floatValue > textLayoutResult.getLineLeft(lineForOffset))) {
            return getOffsetMapping().transformedToOriginal(textLayoutResult.m3058getOffsetForPositionk4lQ0M(OffsetKt.Offset(cachedX.floatValue(), lineBottom)));
        }
        return textLayoutResult.getLineEnd(lineForOffset, true);
    }

    private final int transformedEndOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m3070getEndimpl(m629getSelectiond9O1mEE()));
    }

    private final int transformedMaxOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m3072getMaximpl(m629getSelectiond9O1mEE()));
    }

    private final int transformedMinOffset() {
        return this.offsetMapping.originalToTransformed(TextRange.m3073getMinimpl(m629getSelectiond9O1mEE()));
    }

    @NotNull
    public final <U> T apply(U u2, boolean z, @NotNull Function1<? super U, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (z) {
            getState().resetCachedX();
        }
        if (getText$foundation_release().length() > 0) {
            block.invoke(u2);
        }
        if (u2 != null) {
            return (T) u2;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
    }

    @NotNull
    public final T collapseLeftOr(@NotNull Function1<? super T, Unit> or) {
        Intrinsics.checkNotNullParameter(or, "or");
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (TextRange.m3069getCollapsedimpl(m629getSelectiond9O1mEE())) {
                or.invoke(this);
            } else {
                boolean isLtr = isLtr();
                long m629getSelectiond9O1mEE = m629getSelectiond9O1mEE();
                setCursor(isLtr ? TextRange.m3073getMinimpl(m629getSelectiond9O1mEE) : TextRange.m3072getMaximpl(m629getSelectiond9O1mEE));
            }
        }
        return this;
    }

    @NotNull
    public final T collapseRightOr(@NotNull Function1<? super T, Unit> or) {
        Intrinsics.checkNotNullParameter(or, "or");
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (TextRange.m3069getCollapsedimpl(m629getSelectiond9O1mEE())) {
                or.invoke(this);
            } else {
                boolean isLtr = isLtr();
                long m629getSelectiond9O1mEE = m629getSelectiond9O1mEE();
                setCursor(isLtr ? TextRange.m3072getMaximpl(m629getSelectiond9O1mEE) : TextRange.m3073getMinimpl(m629getSelectiond9O1mEE));
            }
        }
        return this;
    }

    @NotNull
    public final T deleteSelected() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            int length = getText$foundation_release().length();
            setAnnotatedString(getAnnotatedString().subSequence(Math.max(0, TextRange.m3073getMinimpl(m629getSelectiond9O1mEE()) - length), TextRange.m3073getMinimpl(m629getSelectiond9O1mEE())).plus(getAnnotatedString().subSequence(TextRange.m3072getMaximpl(m629getSelectiond9O1mEE()), Math.min(TextRange.m3072getMaximpl(m629getSelectiond9O1mEE()) + length, getText$foundation_release().length()))));
            setCursor(TextRange.m3073getMinimpl(m629getSelectiond9O1mEE()));
        }
        return this;
    }

    @NotNull
    public final T deselect() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(TextRange.m3070getEndimpl(m629getSelectiond9O1mEE()));
        }
        return this;
    }

    @NotNull
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    @Nullable
    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult;
    }

    @NotNull
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    /* renamed from: getOriginalSelection-d9O1mEE  reason: not valid java name */
    public final long m628getOriginalSelectiond9O1mEE() {
        return this.originalSelection;
    }

    @NotNull
    public final AnnotatedString getOriginalText() {
        return this.originalText;
    }

    /* renamed from: getSelection-d9O1mEE  reason: not valid java name */
    public final long m629getSelectiond9O1mEE() {
        return this.selection;
    }

    @NotNull
    public final TextPreparedSelectionState getState() {
        return this.state;
    }

    @NotNull
    public final String getText$foundation_release() {
        return this.annotatedString.getText();
    }

    @NotNull
    public final T moveCursorDownByLine() {
        TextLayoutResult layoutResult;
        if ((getText$foundation_release().length() > 0) && (layoutResult = getLayoutResult()) != null) {
            setCursor(jumpByLinesOffset(layoutResult, 1));
        }
        return this;
    }

    @NotNull
    public final T moveCursorLeft() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorPrev();
            } else {
                moveCursorNext();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorLeftByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorPrevByWord();
            } else {
                moveCursorNextByWord();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorNext() {
        int findFollowingBreak;
        getState().resetCachedX();
        if ((getText$foundation_release().length() > 0) && (findFollowingBreak = StringHelpers_androidKt.findFollowingBreak(getAnnotatedString().getText(), TextRange.m3070getEndimpl(m629getSelectiond9O1mEE()))) != -1) {
            setCursor(findFollowingBreak);
        }
        return this;
    }

    @NotNull
    public final T moveCursorNextByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(getParagraphEnd());
        }
        return this;
    }

    @NotNull
    public final T moveCursorNextByWord() {
        TextLayoutResult layoutResult;
        getState().resetCachedX();
        if ((getText$foundation_release().length() > 0) && (layoutResult = getLayoutResult()) != null) {
            setCursor(getNextWordOffset$default(this, layoutResult, 0, 1, null));
        }
        return this;
    }

    @NotNull
    public final T moveCursorPrev() {
        int findPrecedingBreak;
        getState().resetCachedX();
        if ((getText$foundation_release().length() > 0) && (findPrecedingBreak = StringHelpers_androidKt.findPrecedingBreak(getAnnotatedString().getText(), TextRange.m3070getEndimpl(m629getSelectiond9O1mEE()))) != -1) {
            setCursor(findPrecedingBreak);
        }
        return this;
    }

    @NotNull
    public final T moveCursorPrevByParagraph() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(getParagraphStart());
        }
        return this;
    }

    @NotNull
    public final T moveCursorPrevByWord() {
        TextLayoutResult layoutResult;
        getState().resetCachedX();
        if ((getText$foundation_release().length() > 0) && (layoutResult = getLayoutResult()) != null) {
            setCursor(getPrevWordOffset$default(this, layoutResult, 0, 1, null));
        }
        return this;
    }

    @NotNull
    public final T moveCursorRight() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorNext();
            } else {
                moveCursorPrev();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorRightByWord() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorNextByWord();
            } else {
                moveCursorPrevByWord();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorToEnd() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(getText$foundation_release().length());
        }
        return this;
    }

    @NotNull
    public final T moveCursorToHome() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setCursor(0);
        }
        return this;
    }

    @NotNull
    public final T moveCursorToLineEnd() {
        TextLayoutResult layoutResult;
        getState().resetCachedX();
        if ((getText$foundation_release().length() > 0) && (layoutResult = getLayoutResult()) != null) {
            setCursor(getLineEndByOffset$default(this, layoutResult, 0, 1, null));
        }
        return this;
    }

    @NotNull
    public final T moveCursorToLineLeftSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorToLineStart();
            } else {
                moveCursorToLineEnd();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorToLineRightSide() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            if (isLtr()) {
                moveCursorToLineEnd();
            } else {
                moveCursorToLineStart();
            }
        }
        return this;
    }

    @NotNull
    public final T moveCursorToLineStart() {
        TextLayoutResult layoutResult;
        getState().resetCachedX();
        if ((getText$foundation_release().length() > 0) && (layoutResult = getLayoutResult()) != null) {
            setCursor(getLineStartByOffset$default(this, layoutResult, 0, 1, null));
        }
        return this;
    }

    @NotNull
    public final T moveCursorUpByLine() {
        TextLayoutResult layoutResult;
        if ((getText$foundation_release().length() > 0) && (layoutResult = getLayoutResult()) != null) {
            setCursor(jumpByLinesOffset(layoutResult, -1));
        }
        return this;
    }

    @NotNull
    public final T selectAll() {
        getState().resetCachedX();
        if (getText$foundation_release().length() > 0) {
            setSelection(0, getText$foundation_release().length());
        }
        return this;
    }

    @NotNull
    public final T selectMovement() {
        if (getText$foundation_release().length() > 0) {
            m630setSelection5zctL8(TextRangeKt.TextRange(TextRange.m3075getStartimpl(m628getOriginalSelectiond9O1mEE()), TextRange.m3070getEndimpl(m629getSelectiond9O1mEE())));
        }
        return this;
    }

    public final void setAnnotatedString(@NotNull AnnotatedString annotatedString) {
        Intrinsics.checkNotNullParameter(annotatedString, "<set-?>");
        this.annotatedString = annotatedString;
    }

    public final void setCursor(int i2) {
        setSelection(i2, i2);
    }

    public final void setSelection(int i2, int i3) {
        m630setSelection5zctL8(TextRangeKt.TextRange(i2, i3));
    }

    /* renamed from: setSelection-5zc-tL8  reason: not valid java name */
    public final void m630setSelection5zctL8(long j2) {
        this.selection = j2;
    }
}
