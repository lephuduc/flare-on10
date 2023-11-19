package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aä\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u001323\b\u0002\u0010\u001c\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001d¢\u0006\u0002\b\u001e¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001eH\u0001¢\u0006\u0002\u0010\"\u001a\u001d\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010'\u001a\u0015\u0010(\u001a\u00020\u00012\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\u0010)\u001a[\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u00101\u001a\u000202H\u0002ø\u0001\u0000\u001a \u00103\u001a\u00020\u00012\u0006\u0010-\u001a\u00020.2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0013H\u0002\u001a\u001c\u00107\u001a\u00020\u0007*\u00020\u00072\u0006\u0010-\u001a\u00020.2\u0006\u0010$\u001a\u00020%H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"CoreTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "softWrap", "", "maxLines", "", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "enabled", "readOnly", "decorationBox", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", "name", "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SelectionToolbarAndHandles", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "show", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "notifyTextInputServiceOnFocusChange", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "onImeActionPerformed", "Landroidx/compose/ui/text/input/ImeAction;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "tapToFocus", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "allowKeyboard", "previewKeyEventToDeselectOnBack", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class CoreTextFieldKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0308 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x034b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0134  */
    /* JADX WARN: Type inference failed for: r1v31, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v22, types: [androidx.compose.ui.text.input.TransformedText] */
    /* JADX WARN: Type inference failed for: r9v23 */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CoreTextField(@org.jetbrains.annotations.NotNull androidx.compose.ui.text.input.TextFieldValue r42, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r43, @org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r44, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.TextStyle r45, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.VisualTransformation r46, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r47, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r48, @org.jetbrains.annotations.Nullable androidx.compose.ui.graphics.Brush r49, boolean r50, int r51, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.input.ImeOptions r52, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r53, boolean r54, boolean r55, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r56, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r57, int r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 1949
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, boolean, int, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.text.KeyboardActions, boolean, boolean, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SelectionToolbarAndHandles(androidx.compose.foundation.text.selection.TextFieldSelectionManager r6, boolean r7, androidx.compose.runtime.Composer r8, int r9) {
        /*
            r0 = -498401361(0xffffffffe24affaf, float:-9.3616656E20)
            androidx.compose.runtime.Composer r8 = r8.startRestartGroup(r0)
            if (r7 == 0) goto Lb7
            androidx.compose.foundation.text.TextFieldState r0 = r6.getState$foundation_release()
            r1 = 0
            if (r0 != 0) goto L11
            goto L1c
        L11:
            androidx.compose.foundation.text.TextLayoutResultProxy r0 = r0.getLayoutResult()
            if (r0 != 0) goto L18
            goto L1c
        L18:
            androidx.compose.ui.text.TextLayoutResult r1 = r0.getValue()
        L1c:
            if (r1 != 0) goto L20
            goto Lba
        L20:
            androidx.compose.ui.text.input.TextFieldValue r0 = r6.getValue$foundation_release()
            long r2 = r0.m3187getSelectiond9O1mEE()
            boolean r0 = androidx.compose.ui.text.TextRange.m3069getCollapsedimpl(r2)
            r2 = 0
            if (r0 != 0) goto L97
            androidx.compose.ui.text.input.OffsetMapping r0 = r6.getOffsetMapping$foundation_release()
            androidx.compose.ui.text.input.TextFieldValue r3 = r6.getValue$foundation_release()
            long r3 = r3.m3187getSelectiond9O1mEE()
            int r3 = androidx.compose.ui.text.TextRange.m3075getStartimpl(r3)
            int r0 = r0.originalToTransformed(r3)
            androidx.compose.ui.text.input.OffsetMapping r3 = r6.getOffsetMapping$foundation_release()
            androidx.compose.ui.text.input.TextFieldValue r4 = r6.getValue$foundation_release()
            long r4 = r4.m3187getSelectiond9O1mEE()
            int r4 = androidx.compose.ui.text.TextRange.m3070getEndimpl(r4)
            int r3 = r3.originalToTransformed(r4)
            androidx.compose.ui.text.style.ResolvedTextDirection r0 = r1.getBidiRunDirection(r0)
            r4 = 1
            int r3 = r3 - r4
            int r3 = java.lang.Math.max(r3, r2)
            androidx.compose.ui.text.style.ResolvedTextDirection r1 = r1.getBidiRunDirection(r3)
            r3 = -498400769(0xffffffffe24b01ff, float:-9.362082E20)
            r8.startReplaceableGroup(r3)
            androidx.compose.foundation.text.TextFieldState r3 = r6.getState$foundation_release()
            if (r3 != 0) goto L73
        L71:
            r3 = r2
            goto L7a
        L73:
            boolean r3 = r3.getShowSelectionHandleStart()
            if (r3 != r4) goto L71
            r3 = r4
        L7a:
            r5 = 518(0x206, float:7.26E-43)
            if (r3 == 0) goto L81
            androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.TextFieldSelectionHandle(r4, r0, r6, r8, r5)
        L81:
            r8.endReplaceableGroup()
            androidx.compose.foundation.text.TextFieldState r0 = r6.getState$foundation_release()
            if (r0 != 0) goto L8c
        L8a:
            r4 = r2
            goto L92
        L8c:
            boolean r0 = r0.getShowSelectionHandleEnd()
            if (r0 != r4) goto L8a
        L92:
            if (r4 == 0) goto L97
            androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.TextFieldSelectionHandle(r2, r1, r6, r8, r5)
        L97:
            androidx.compose.foundation.text.TextFieldState r0 = r6.getState$foundation_release()
            if (r0 != 0) goto L9e
            goto Lba
        L9e:
            boolean r1 = r6.isTextChanged$foundation_release()
            if (r1 == 0) goto La7
            r0.setShowFloatingToolbar(r2)
        La7:
            boolean r1 = r0.getHasFocus()
            if (r1 == 0) goto Lba
            boolean r0 = r0.getShowFloatingToolbar()
            if (r0 == 0) goto Lb7
            r6.showSelectionToolbar$foundation_release()
            goto Lba
        Lb7:
            r6.hideSelectionToolbar$foundation_release()
        Lba:
            androidx.compose.runtime.ScopeUpdateScope r8 = r8.endRestartGroup()
            if (r8 != 0) goto Lc1
            goto Lc9
        Lc1:
            androidx.compose.foundation.text.CoreTextFieldKt$SelectionToolbarAndHandles$2 r0 = new androidx.compose.foundation.text.CoreTextFieldKt$SelectionToolbarAndHandles$2
            r0.<init>(r6, r7, r9)
            r8.updateScope(r0)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.SelectionToolbarAndHandles(androidx.compose.foundation.text.selection.TextFieldSelectionManager, boolean, androidx.compose.runtime.Composer, int):void");
    }

    @Composable
    public static final void TextFieldCursorHandle(@NotNull TextFieldSelectionManager manager, @Nullable Composer composer, int i2) {
        TextLayoutResultProxy layoutResult;
        int coerceIn;
        Intrinsics.checkNotNullParameter(manager, "manager");
        Composer startRestartGroup = composer.startRestartGroup(-1260650262);
        int originalToTransformed = manager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m3075getStartimpl(manager.getValue$foundation_release().m3187getSelectiond9O1mEE()));
        startRestartGroup.startReplaceableGroup(-3686930);
        boolean changed = startRestartGroup.changed(manager);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = manager.cursorDragObserver$foundation_release();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
        TextFieldState state$foundation_release = manager.getState$foundation_release();
        TextLayoutResult value = (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) ? null : layoutResult.getValue();
        if (value != null) {
            coerceIn = RangesKt___RangesKt.coerceIn(originalToTransformed, 0, value.getLayoutInput().getText().length());
            Rect cursorRect = value.getCursorRect(coerceIn);
            AndroidCursorHandle_androidKt.m520CursorHandleULxng0E(OffsetKt.Offset(cursorRect.getLeft() + (((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo277toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness()) / 2), cursorRect.getBottom()), SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, textDragObserver, new CoreTextFieldKt$TextFieldCursorHandle$1$1(textDragObserver, null)), null, startRestartGroup, 384);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new CoreTextFieldKt$TextFieldCursorHandle$2(manager, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyTextInputServiceOnFocusChange(TextInputService textInputService, TextFieldState textFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, Function1<? super TextFieldValue, Unit> function1, Function1<? super ImeAction, Unit> function12, OffsetMapping offsetMapping) {
        TextInputSession textInputSession;
        TextLayoutResultProxy layoutResult;
        if (textFieldState.getHasFocus()) {
            TextFieldDelegate.Companion companion = TextFieldDelegate.Companion;
            textInputSession = companion.onFocus$foundation_release(textInputService, textFieldValue, textFieldState.getProcessor(), imeOptions, function1, function12);
            LayoutCoordinates layoutCoordinates = textFieldState.getLayoutCoordinates();
            if (layoutCoordinates != null && (layoutResult = textFieldState.getLayoutResult()) != null) {
                companion.notifyFocusedRect$foundation_release(textFieldValue, textFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, textInputSession, textFieldState.getHasFocus(), offsetMapping);
            }
        } else {
            TextInputSession inputSession = textFieldState.getInputSession();
            if (inputSession != null) {
                TextFieldDelegate.Companion.onBlur$foundation_release(inputSession, textFieldState.getProcessor(), function1);
            }
            textInputSession = null;
        }
        textFieldState.setInputSession(textInputSession);
    }

    private static final Modifier previewKeyEventToDeselectOnBack(Modifier modifier, TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new CoreTextFieldKt$previewKeyEventToDeselectOnBack$1(textFieldState, textFieldSelectionManager));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tapToFocus(TextFieldState textFieldState, FocusRequester focusRequester, boolean z) {
        TextInputSession inputSession;
        if (!textFieldState.getHasFocus()) {
            focusRequester.requestFocus();
        } else if (!z || (inputSession = textFieldState.getInputSession()) == null) {
        } else {
            inputSession.showSoftwareKeyboard();
        }
    }
}
