package androidx.compose.ui.node;

import androidx.appcompat.R;
import androidx.compose.ui.input.pointer.PointerInputFilter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "inLayer", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class PointerInputDelegatingWrapper$hitTest$1 extends Lambda implements Function1<Boolean, Unit> {
    public final /* synthetic */ HitTestResult<PointerInputFilter> $hitTestResult;
    public final /* synthetic */ boolean $isTouchEvent;
    public final /* synthetic */ long $pointerPosition;
    public final /* synthetic */ PointerInputDelegatingWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInputDelegatingWrapper$hitTest$1(PointerInputDelegatingWrapper pointerInputDelegatingWrapper, long j2, HitTestResult<PointerInputFilter> hitTestResult, boolean z) {
        super(1);
        this.this$0 = pointerInputDelegatingWrapper;
        this.$pointerPosition = j2;
        this.$hitTestResult = hitTestResult;
        this.$isTouchEvent = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        this.this$0.m2903hitTestChildM_7yMNQ(this.$pointerPosition, this.$hitTestResult, this.$isTouchEvent, z);
    }
}
