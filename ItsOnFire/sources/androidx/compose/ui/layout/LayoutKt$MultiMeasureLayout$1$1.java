package androidx.compose.ui.layout;

import androidx.appcompat.R;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LayoutKt$MultiMeasureLayout$1$1 extends Lambda implements Function1<LayoutNode, Unit> {
    public static final LayoutKt$MultiMeasureLayout$1$1 INSTANCE = new LayoutKt$MultiMeasureLayout$1$1();

    public LayoutKt$MultiMeasureLayout$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
        invoke2(layoutNode);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull LayoutNode init) {
        Intrinsics.checkNotNullParameter(init, "$this$init");
        init.setCanMultiMeasure$ui_release(true);
    }
}
