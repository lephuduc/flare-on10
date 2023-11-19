package androidx.compose.ui.semantics;

import androidx.appcompat.R;
import androidx.compose.ui.node.HitTestResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "inLayer", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SemanticsWrapper$hitTestSemantics$1 extends Lambda implements Function1<Boolean, Unit> {
    public final /* synthetic */ HitTestResult<SemanticsWrapper> $hitSemanticsWrappers;
    public final /* synthetic */ long $pointerPosition;
    public final /* synthetic */ SemanticsWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SemanticsWrapper$hitTestSemantics$1(SemanticsWrapper semanticsWrapper, long j2, HitTestResult<SemanticsWrapper> hitTestResult) {
        super(1);
        this.this$0 = semanticsWrapper;
        this.$pointerPosition = j2;
        this.$hitSemanticsWrappers = hitTestResult;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        this.this$0.getWrapped$ui_release().mo2851hitTestSemantics9KIMszo(this.this$0.getWrapped$ui_release().m2880fromParentPositionMKHz9U(this.$pointerPosition), this.$hitSemanticsWrappers, z);
    }
}
