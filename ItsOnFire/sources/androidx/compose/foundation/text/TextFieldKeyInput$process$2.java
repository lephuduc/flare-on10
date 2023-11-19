package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class TextFieldKeyInput$process$2 extends Lambda implements Function1<TextFieldPreparedSelection, Unit> {
    public final /* synthetic */ KeyCommand $command;
    public final /* synthetic */ Ref.BooleanRef $consumed;
    public final /* synthetic */ TextFieldKeyInput this$0;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<TextFieldPreparedSelection, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
            invoke2(textFieldPreparedSelection);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull TextFieldPreparedSelection collapseLeftOr) {
            Intrinsics.checkNotNullParameter(collapseLeftOr, "$this$collapseLeftOr");
            collapseLeftOr.moveCursorLeft();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<TextFieldPreparedSelection, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
            invoke2(textFieldPreparedSelection);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull TextFieldPreparedSelection collapseRightOr) {
            Intrinsics.checkNotNullParameter(collapseRightOr, "$this$collapseRightOr");
            collapseRightOr.moveCursorRight();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends Lambda implements Function1<TextFieldPreparedSelection, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
            invoke2(textFieldPreparedSelection);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull TextFieldPreparedSelection deleteIfSelectedOr) {
            Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
            deleteIfSelectedOr.moveCursorPrev().selectMovement().deleteSelected();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends Lambda implements Function1<TextFieldPreparedSelection, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
            invoke2(textFieldPreparedSelection);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull TextFieldPreparedSelection deleteIfSelectedOr) {
            Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
            deleteIfSelectedOr.moveCursorNext().selectMovement().deleteSelected();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends Lambda implements Function1<TextFieldPreparedSelection, Unit> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
            invoke2(textFieldPreparedSelection);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull TextFieldPreparedSelection deleteIfSelectedOr) {
            Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
            deleteIfSelectedOr.moveCursorPrevByWord().selectMovement().deleteSelected();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$6  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends Lambda implements Function1<TextFieldPreparedSelection, Unit> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
            invoke2(textFieldPreparedSelection);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull TextFieldPreparedSelection deleteIfSelectedOr) {
            Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
            deleteIfSelectedOr.moveCursorNextByWord().selectMovement().deleteSelected();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$7  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends Lambda implements Function1<TextFieldPreparedSelection, Unit> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        public AnonymousClass7() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
            invoke2(textFieldPreparedSelection);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull TextFieldPreparedSelection deleteIfSelectedOr) {
            Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
            deleteIfSelectedOr.moveCursorToLineStart().selectMovement().deleteSelected();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$8  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass8 extends Lambda implements Function1<TextFieldPreparedSelection, Unit> {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        public AnonymousClass8() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
            invoke2(textFieldPreparedSelection);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull TextFieldPreparedSelection deleteIfSelectedOr) {
            Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
            deleteIfSelectedOr.moveCursorToLineEnd().selectMovement().deleteSelected();
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KeyCommand.values().length];
            iArr[KeyCommand.COPY.ordinal()] = 1;
            iArr[KeyCommand.PASTE.ordinal()] = 2;
            iArr[KeyCommand.CUT.ordinal()] = 3;
            iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
            iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
            iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
            iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
            iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
            iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
            iArr[KeyCommand.UP.ordinal()] = 10;
            iArr[KeyCommand.DOWN.ordinal()] = 11;
            iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
            iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
            iArr[KeyCommand.LINE_START.ordinal()] = 14;
            iArr[KeyCommand.LINE_END.ordinal()] = 15;
            iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
            iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
            iArr[KeyCommand.HOME.ordinal()] = 18;
            iArr[KeyCommand.END.ordinal()] = 19;
            iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
            iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
            iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
            iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
            iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
            iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
            iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
            iArr[KeyCommand.TAB.ordinal()] = 27;
            iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
            iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
            iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
            iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
            iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
            iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
            iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
            iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
            iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
            iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
            iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
            iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
            iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
            iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
            iArr[KeyCommand.SELECT_END.ordinal()] = 44;
            iArr[KeyCommand.DESELECT.ordinal()] = 45;
            iArr[KeyCommand.UNDO.ordinal()] = 46;
            iArr[KeyCommand.REDO.ordinal()] = 47;
            iArr[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldKeyInput$process$2(KeyCommand keyCommand, TextFieldKeyInput textFieldKeyInput, Ref.BooleanRef booleanRef) {
        super(1);
        this.$command = keyCommand;
        this.this$0 = textFieldKeyInput;
        this.$consumed = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
        invoke2(textFieldPreparedSelection);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull TextFieldPreparedSelection commandExecutionContext) {
        Function1<? super TextFieldPreparedSelection, Unit> function1;
        TextFieldKeyInput textFieldKeyInput;
        CommitTextCommand commitTextCommand;
        TextFieldPreparedSelection moveCursorLeft;
        TextFieldPreparedSelection moveCursorUpByPage;
        TextFieldValue undo;
        Intrinsics.checkNotNullParameter(commandExecutionContext, "$this$commandExecutionContext");
        switch (WhenMappings.$EnumSwitchMapping$0[this.$command.ordinal()]) {
            case 1:
                this.this$0.getSelectionManager().copy$foundation_release(false);
                return;
            case 2:
                this.this$0.getSelectionManager().paste$foundation_release();
                return;
            case 3:
                this.this$0.getSelectionManager().cut$foundation_release();
                return;
            case 4:
                commandExecutionContext.collapseLeftOr(AnonymousClass1.INSTANCE);
                return;
            case 5:
                commandExecutionContext.collapseRightOr(AnonymousClass2.INSTANCE);
                return;
            case 6:
                commandExecutionContext.moveCursorLeftByWord();
                return;
            case 7:
                commandExecutionContext.moveCursorRightByWord();
                return;
            case 8:
                commandExecutionContext.moveCursorPrevByParagraph();
                return;
            case 9:
                commandExecutionContext.moveCursorNextByParagraph();
                return;
            case 10:
                commandExecutionContext.moveCursorUpByLine();
                return;
            case 11:
                commandExecutionContext.moveCursorDownByLine();
                return;
            case 12:
                commandExecutionContext.moveCursorUpByPage();
                return;
            case 13:
                commandExecutionContext.moveCursorDownByPage();
                return;
            case 14:
                commandExecutionContext.moveCursorToLineStart();
                return;
            case 15:
                commandExecutionContext.moveCursorToLineEnd();
                return;
            case 16:
                commandExecutionContext.moveCursorToLineLeftSide();
                return;
            case 17:
                commandExecutionContext.moveCursorToLineRightSide();
                return;
            case 18:
                commandExecutionContext.moveCursorToHome();
                return;
            case 19:
                commandExecutionContext.moveCursorToEnd();
                return;
            case 20:
                function1 = AnonymousClass3.INSTANCE;
                commandExecutionContext.deleteIfSelectedOr(function1);
                return;
            case 21:
                function1 = AnonymousClass4.INSTANCE;
                commandExecutionContext.deleteIfSelectedOr(function1);
                return;
            case 22:
                function1 = AnonymousClass5.INSTANCE;
                commandExecutionContext.deleteIfSelectedOr(function1);
                return;
            case 23:
                function1 = AnonymousClass6.INSTANCE;
                commandExecutionContext.deleteIfSelectedOr(function1);
                return;
            case 24:
                function1 = AnonymousClass7.INSTANCE;
                commandExecutionContext.deleteIfSelectedOr(function1);
                return;
            case 25:
                function1 = AnonymousClass8.INSTANCE;
                commandExecutionContext.deleteIfSelectedOr(function1);
                return;
            case 26:
                if (!this.this$0.getSingleLine()) {
                    textFieldKeyInput = this.this$0;
                    commitTextCommand = new CommitTextCommand("\n", 1);
                    textFieldKeyInput.apply(commitTextCommand);
                    return;
                }
                this.$consumed.element = false;
                return;
            case 27:
                if (!this.this$0.getSingleLine()) {
                    textFieldKeyInput = this.this$0;
                    commitTextCommand = new CommitTextCommand("\t", 1);
                    textFieldKeyInput.apply(commitTextCommand);
                    return;
                }
                this.$consumed.element = false;
                return;
            case 28:
                commandExecutionContext.selectAll();
                return;
            case 29:
                moveCursorLeft = commandExecutionContext.moveCursorLeft();
                moveCursorUpByPage = moveCursorLeft;
                moveCursorUpByPage.selectMovement();
                return;
            case 30:
                moveCursorLeft = commandExecutionContext.moveCursorRight();
                moveCursorUpByPage = moveCursorLeft;
                moveCursorUpByPage.selectMovement();
                return;
            case 31:
                moveCursorLeft = commandExecutionContext.moveCursorLeftByWord();
                moveCursorUpByPage = moveCursorLeft;
                moveCursorUpByPage.selectMovement();
                return;
            case 32:
                moveCursorLeft = commandExecutionContext.moveCursorRightByWord();
                moveCursorUpByPage = moveCursorLeft;
                moveCursorUpByPage.selectMovement();
                return;
            case 33:
                moveCursorLeft = commandExecutionContext.moveCursorPrevByParagraph();
                moveCursorUpByPage = moveCursorLeft;
                moveCursorUpByPage.selectMovement();
                return;
            case 34:
                moveCursorLeft = commandExecutionContext.moveCursorNextByParagraph();
                moveCursorUpByPage = moveCursorLeft;
                moveCursorUpByPage.selectMovement();
                return;
            case 35:
                moveCursorLeft = commandExecutionContext.moveCursorToLineStart();
                moveCursorUpByPage = moveCursorLeft;
                moveCursorUpByPage.selectMovement();
                return;
            case 36:
                moveCursorLeft = commandExecutionContext.moveCursorToLineEnd();
                moveCursorUpByPage = moveCursorLeft;
                moveCursorUpByPage.selectMovement();
                return;
            case 37:
                moveCursorLeft = commandExecutionContext.moveCursorToLineLeftSide();
                moveCursorUpByPage = moveCursorLeft;
                moveCursorUpByPage.selectMovement();
                return;
            case 38:
                moveCursorLeft = commandExecutionContext.moveCursorToLineRightSide();
                moveCursorUpByPage = moveCursorLeft;
                moveCursorUpByPage.selectMovement();
                return;
            case 39:
                moveCursorLeft = commandExecutionContext.moveCursorUpByLine();
                moveCursorUpByPage = moveCursorLeft;
                moveCursorUpByPage.selectMovement();
                return;
            case 40:
                moveCursorLeft = commandExecutionContext.moveCursorDownByLine();
                moveCursorUpByPage = moveCursorLeft;
                moveCursorUpByPage.selectMovement();
                return;
            case 41:
                moveCursorUpByPage = commandExecutionContext.moveCursorUpByPage();
                moveCursorUpByPage.selectMovement();
                return;
            case 42:
                moveCursorUpByPage = commandExecutionContext.moveCursorDownByPage();
                moveCursorUpByPage.selectMovement();
                return;
            case 43:
                moveCursorLeft = commandExecutionContext.moveCursorToHome();
                moveCursorUpByPage = moveCursorLeft;
                moveCursorUpByPage.selectMovement();
                return;
            case 44:
                moveCursorLeft = commandExecutionContext.moveCursorToEnd();
                moveCursorUpByPage = moveCursorLeft;
                moveCursorUpByPage.selectMovement();
                return;
            case 45:
                commandExecutionContext.deselect();
                return;
            case 46:
                UndoManager undoManager = this.this$0.getUndoManager();
                if (undoManager != null) {
                    undoManager.makeSnapshot(commandExecutionContext.getValue());
                }
                UndoManager undoManager2 = this.this$0.getUndoManager();
                if (undoManager2 == null || (undo = undoManager2.undo()) == null) {
                    return;
                }
                this.this$0.getState().getOnValueChange().invoke(undo);
                return;
            case 47:
                UndoManager undoManager3 = this.this$0.getUndoManager();
                if (undoManager3 == null || (undo = undoManager3.redo()) == null) {
                    return;
                }
                this.this$0.getState().getOnValueChange().invoke(undo);
                return;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                KeyEventHelpers_androidKt.showCharacterPalette();
                return;
            default:
                return;
        }
    }
}
