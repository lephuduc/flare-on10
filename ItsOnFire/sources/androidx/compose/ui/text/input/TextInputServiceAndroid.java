package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.text.TextRange;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import l.n;
import l.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\bC\u0010DB\u0011\b\u0010\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\bC\u0010EJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bJI\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u000eH\u0016ø\u0001\u0000J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016J\u0013\u0010\u0018\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0016R\u0017\u0010!\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R(\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010*R%\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u000e8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010*R$\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\b0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006F"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "", "restartInput", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "createInputConnection", "", "isEditorFocused", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "onEditCommand", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "startInput", "stopInput", "showSoftwareKeyboard", "hideSoftwareKeyboard", "keyboardVisibilityEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "oldValue", "newValue", "updateState", "Landroidx/compose/ui/geometry/Rect;", "rect", "notifyFocusedRect", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroidx/compose/ui/text/input/InputMethodManager;", "inputMethodManager", "Landroidx/compose/ui/text/input/InputMethodManager;", "editorHasFocus", "Z", "Lkotlin/jvm/functions/Function1;", "<set-?>", "state", "Landroidx/compose/ui/text/input/TextFieldValue;", "getState$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "Landroidx/compose/ui/text/input/ImeOptions;", "Landroidx/compose/ui/text/input/RecordingInputConnection;", "ic", "Landroidx/compose/ui/text/input/RecordingInputConnection;", "Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection$delegate", "Lkotlin/Lazy;", "getBaseInputConnection", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroid/graphics/Rect;", "focusedRect", "Landroid/graphics/Rect;", "Ll/n;", "showKeyboardChannel", "Ll/n;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "layoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "<init>", "(Landroid/view/View;Landroidx/compose/ui/text/input/InputMethodManager;)V", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class TextInputServiceAndroid implements PlatformTextInputService {
    @NotNull
    private final Lazy baseInputConnection$delegate;
    private boolean editorHasFocus;
    @Nullable
    private Rect focusedRect;
    @Nullable
    private RecordingInputConnection ic;
    @NotNull
    private ImeOptions imeOptions;
    @NotNull
    private final InputMethodManager inputMethodManager;
    @NotNull
    private final ViewTreeObserver.OnGlobalLayoutListener layoutListener;
    @NotNull
    private Function1<? super List<? extends EditCommand>, Unit> onEditCommand;
    @NotNull
    private Function1<? super ImeAction, Unit> onImeActionPerformed;
    @NotNull
    private final n<Boolean> showKeyboardChannel;
    @NotNull
    private TextFieldValue state;
    @NotNull
    private final View view;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputServiceAndroid(@org.jetbrains.annotations.NotNull android.view.View r4) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.compose.ui.text.input.InputMethodManagerImpl r0 = new androidx.compose.ui.text.input.InputMethodManagerImpl
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "view.context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.<init>(r1)
            r3.<init>(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.TextInputServiceAndroid.<init>(android.view.View):void");
    }

    public TextInputServiceAndroid(@NotNull View view, @NotNull InputMethodManager inputMethodManager) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(inputMethodManager, "inputMethodManager");
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.onEditCommand = TextInputServiceAndroid$onEditCommand$1.INSTANCE;
        this.onImeActionPerformed = TextInputServiceAndroid$onImeActionPerformed$1.INSTANCE;
        this.state = new TextFieldValue("", TextRange.Companion.m3080getZerod9O1mEE(), (TextRange) null, 4, (DefaultConstructorMarker) null);
        this.imeOptions = ImeOptions.Companion.getDefault();
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new TextInputServiceAndroid$baseInputConnection$2(this));
        this.baseInputConnection$delegate = lazy;
        this.showKeyboardChannel = q.d(-1, null, null, 6, null);
        this.layoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.text.input.a
            {
                TextInputServiceAndroid.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                TextInputServiceAndroid.m3188layoutListener$lambda1(TextInputServiceAndroid.this);
            }
        };
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid.1
            {
                TextInputServiceAndroid.this = this;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@Nullable View view2) {
                View rootView;
                ViewTreeObserver viewTreeObserver;
                if (view2 == null || (rootView = view2.getRootView()) == null || (viewTreeObserver = rootView.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver.addOnGlobalLayoutListener(TextInputServiceAndroid.this.layoutListener);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@Nullable View view2) {
                View rootView;
                ViewTreeObserver viewTreeObserver;
                if (view2 == null || (rootView = view2.getRootView()) == null || (viewTreeObserver = rootView.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver.removeOnGlobalLayoutListener(TextInputServiceAndroid.this.layoutListener);
            }
        });
    }

    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection$delegate.getValue();
    }

    /* renamed from: layoutListener$lambda-1 */
    public static final void m3188layoutListener$lambda1(TextInputServiceAndroid this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Rect rect = this$0.focusedRect;
        if (rect == null) {
            return;
        }
        this$0.getView().requestRectangleOnScreen(new Rect(rect));
    }

    private final void restartInput() {
        this.inputMethodManager.restartInput(this.view);
    }

    /* renamed from: startInput$lambda-3 */
    public static final void m3189startInput$lambda3(TextInputServiceAndroid this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.restartInput();
        this$0.showSoftwareKeyboard();
    }

    @Nullable
    public final InputConnection createInputConnection(@NotNull EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        if (this.editorHasFocus) {
            TextInputServiceAndroid_androidKt.update(outAttrs, this.imeOptions, this.state);
            RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.state, new InputEventCallback2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$createInputConnection$1
                @Override // androidx.compose.ui.text.input.InputEventCallback2
                public void onEditCommands(@NotNull List<? extends EditCommand> editCommands) {
                    Function1 function1;
                    Intrinsics.checkNotNullParameter(editCommands, "editCommands");
                    function1 = TextInputServiceAndroid.this.onEditCommand;
                    function1.invoke(editCommands);
                }

                @Override // androidx.compose.ui.text.input.InputEventCallback2
                /* renamed from: onImeAction-KlQnJC8 */
                public void mo3155onImeActionKlQnJC8(int i2) {
                    Function1 function1;
                    function1 = TextInputServiceAndroid.this.onImeActionPerformed;
                    function1.invoke(ImeAction.m3134boximpl(i2));
                }

                @Override // androidx.compose.ui.text.input.InputEventCallback2
                public void onKeyEvent(@NotNull KeyEvent event) {
                    BaseInputConnection baseInputConnection;
                    Intrinsics.checkNotNullParameter(event, "event");
                    baseInputConnection = TextInputServiceAndroid.this.getBaseInputConnection();
                    baseInputConnection.sendKeyEvent(event);
                }
            }, this.imeOptions.getAutoCorrect());
            this.ic = recordingInputConnection;
            return recordingInputConnection;
        }
        return null;
    }

    @NotNull
    public final TextFieldValue getState$ui_release() {
        return this.state;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void hideSoftwareKeyboard() {
        this.showKeyboardChannel.T(Boolean.FALSE);
    }

    public final boolean isEditorFocused() {
        return this.editorHasFocus;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0095  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0052 -> B:50:0x0055). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object keyboardVisibilityEventLoop(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.text.input.TextInputServiceAndroid$keyboardVisibilityEventLoop$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.text.input.TextInputServiceAndroid$keyboardVisibilityEventLoop$1 r0 = (androidx.compose.ui.text.input.TextInputServiceAndroid$keyboardVisibilityEventLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.input.TextInputServiceAndroid$keyboardVisibilityEventLoop$1 r0 = new androidx.compose.ui.text.input.TextInputServiceAndroid$keyboardVisibilityEventLoop$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.L$1
            l.p r6 = (l.p) r6
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.text.input.TextInputServiceAndroid r2 = (androidx.compose.ui.text.input.TextInputServiceAndroid) r2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L55
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.ResultKt.throwOnFailure(r7)
            l.n<java.lang.Boolean> r7 = r6.showKeyboardChannel
            l.p r7 = r7.iterator()
            r5 = r7
            r7 = r6
            r6 = r5
        L45:
            r0.L$0 = r7
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r2 = r6.a(r0)
            if (r2 != r1) goto L52
            return r1
        L52:
            r5 = r2
            r2 = r7
            r7 = r5
        L55:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L95
            java.lang.Object r7 = r6.next()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            l.n<java.lang.Boolean> r4 = r2.showKeyboardChannel
            java.lang.Object r4 = r4.v()
            java.lang.Object r4 = l.r.h(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 != 0) goto L76
            goto L7a
        L76:
            boolean r7 = r4.booleanValue()
        L7a:
            if (r7 == 0) goto L86
            androidx.compose.ui.text.input.InputMethodManager r7 = r2.inputMethodManager
            android.view.View r4 = r2.getView()
            r7.showSoftInput(r4)
            goto L93
        L86:
            androidx.compose.ui.text.input.InputMethodManager r7 = r2.inputMethodManager
            android.view.View r4 = r2.getView()
            android.os.IBinder r4 = r4.getWindowToken()
            r7.hideSoftInputFromWindow(r4)
        L93:
            r7 = r2
            goto L45
        L95:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.TextInputServiceAndroid.keyboardVisibilityEventLoop(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void notifyFocusedRect(@NotNull androidx.compose.ui.geometry.Rect rect) {
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        int roundToInt4;
        Intrinsics.checkNotNullParameter(rect, "rect");
        roundToInt = MathKt__MathJVMKt.roundToInt(rect.getLeft());
        roundToInt2 = MathKt__MathJVMKt.roundToInt(rect.getTop());
        roundToInt3 = MathKt__MathJVMKt.roundToInt(rect.getRight());
        roundToInt4 = MathKt__MathJVMKt.roundToInt(rect.getBottom());
        Rect rect2 = new Rect(roundToInt, roundToInt2, roundToInt3, roundToInt4);
        this.focusedRect = rect2;
        if (this.ic == null) {
            getView().requestRectangleOnScreen(new Rect(rect2));
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void showSoftwareKeyboard() {
        this.showKeyboardChannel.T(Boolean.TRUE);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput(@NotNull TextFieldValue value, @NotNull ImeOptions imeOptions, @NotNull Function1<? super List<? extends EditCommand>, Unit> onEditCommand, @NotNull Function1<? super ImeAction, Unit> onImeActionPerformed) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(onEditCommand, "onEditCommand");
        Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
        this.editorHasFocus = true;
        this.state = value;
        this.imeOptions = imeOptions;
        this.onEditCommand = onEditCommand;
        this.onImeActionPerformed = onImeActionPerformed;
        this.view.post(new Runnable() { // from class: androidx.compose.ui.text.input.b
            {
                TextInputServiceAndroid.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TextInputServiceAndroid.m3189startInput$lambda3(TextInputServiceAndroid.this);
            }
        });
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void stopInput() {
        this.editorHasFocus = false;
        this.onEditCommand = TextInputServiceAndroid$stopInput$1.INSTANCE;
        this.onImeActionPerformed = TextInputServiceAndroid$stopInput$2.INSTANCE;
        this.focusedRect = null;
        restartInput();
        this.editorHasFocus = false;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateState(@Nullable TextFieldValue textFieldValue, @NotNull TextFieldValue newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        boolean z = true;
        boolean z2 = !TextRange.m3068equalsimpl0(this.state.m3187getSelectiond9O1mEE(), newValue.m3187getSelectiond9O1mEE());
        this.state = newValue;
        RecordingInputConnection recordingInputConnection = this.ic;
        if (recordingInputConnection != null) {
            recordingInputConnection.setMTextFieldValue$ui_release(newValue);
        }
        if (Intrinsics.areEqual(textFieldValue, newValue)) {
            if (z2) {
                InputMethodManager inputMethodManager = this.inputMethodManager;
                View view = this.view;
                int m3073getMinimpl = TextRange.m3073getMinimpl(newValue.m3187getSelectiond9O1mEE());
                int m3072getMaximpl = TextRange.m3072getMaximpl(newValue.m3187getSelectiond9O1mEE());
                TextRange m3186getCompositionMzsxiRA = this.state.m3186getCompositionMzsxiRA();
                int m3073getMinimpl2 = m3186getCompositionMzsxiRA == null ? -1 : TextRange.m3073getMinimpl(m3186getCompositionMzsxiRA.m3079unboximpl());
                TextRange m3186getCompositionMzsxiRA2 = this.state.m3186getCompositionMzsxiRA();
                inputMethodManager.updateSelection(view, m3073getMinimpl, m3072getMaximpl, m3073getMinimpl2, m3186getCompositionMzsxiRA2 == null ? -1 : TextRange.m3072getMaximpl(m3186getCompositionMzsxiRA2.m3079unboximpl()));
                return;
            }
            return;
        }
        boolean z3 = false;
        if (textFieldValue != null) {
            if (Intrinsics.areEqual(textFieldValue.getText(), newValue.getText()) && (!TextRange.m3068equalsimpl0(textFieldValue.m3187getSelectiond9O1mEE(), newValue.m3187getSelectiond9O1mEE()) || Intrinsics.areEqual(textFieldValue.m3186getCompositionMzsxiRA(), newValue.m3186getCompositionMzsxiRA()))) {
                z = false;
            }
            z3 = z;
        }
        if (z3) {
            restartInput();
            return;
        }
        RecordingInputConnection recordingInputConnection2 = this.ic;
        if (recordingInputConnection2 == null) {
            return;
        }
        recordingInputConnection2.updateInputState(this.state, this.inputMethodManager, this.view);
    }
}
