package androidx.compose.ui.viewinterop;

import androidx.appcompat.R;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Ref;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidView_androidKt$AndroidView$2$5 extends Lambda implements Function2<LayoutNode, Function1<? super T, ? extends Unit>, Unit> {
    public final /* synthetic */ Ref<ViewFactoryHolder<T>> $viewFactoryHolderRef;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$AndroidView$2$5(Ref<ViewFactoryHolder<T>> ref) {
        super(2);
        this.$viewFactoryHolderRef = ref;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode, Object obj) {
        invoke(layoutNode, (Function1) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull LayoutNode set, @NotNull Function1<? super T, Unit> it) {
        Intrinsics.checkNotNullParameter(set, "$this$set");
        Intrinsics.checkNotNullParameter(it, "it");
        Object value = this.$viewFactoryHolderRef.getValue();
        Intrinsics.checkNotNull(value);
        ((ViewFactoryHolder) value).setUpdateBlock(it);
    }
}
