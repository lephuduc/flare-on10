package androidx.compose.ui.platform;

import androidx.appcompat.R;
import androidx.compose.ui.input.InputMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/InputMode;", "invoke-iuPiT84", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidComposeView$_inputModeManager$1 extends Lambda implements Function1<InputMode, Boolean> {
    public final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$_inputModeManager$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(InputMode inputMode) {
        return m2915invokeiuPiT84(inputMode.m1943unboximpl());
    }

    @NotNull
    /* renamed from: invoke-iuPiT84  reason: not valid java name */
    public final Boolean m2915invokeiuPiT84(int i2) {
        InputMode.Companion companion = InputMode.Companion;
        return Boolean.valueOf(InputMode.m1940equalsimpl0(i2, companion.m1945getTouchaOaMEAU()) ? this.this$0.isInTouchMode() : InputMode.m1940equalsimpl0(i2, companion.m1944getKeyboardaOaMEAU()) ? this.this$0.isInTouchMode() ? this.this$0.requestFocusFromTouch() : true : false);
    }
}
