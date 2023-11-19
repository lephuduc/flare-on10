package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ComposerImpl$doCompose$2$5 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    public final /* synthetic */ ComposerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComposerImpl$doCompose$2$5(Function2<? super Composer, ? super Integer, Unit> function2, ComposerImpl composerImpl) {
        super(0);
        this.$content = function2;
        this.this$0 = composerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$content == null) {
            this.this$0.skipCurrentGroup();
            return;
        }
        this.this$0.startGroup(200, ComposerKt.getInvocation());
        ComposerKt.invokeComposable(this.this$0, this.$content);
        this.this$0.endGroup();
    }
}
