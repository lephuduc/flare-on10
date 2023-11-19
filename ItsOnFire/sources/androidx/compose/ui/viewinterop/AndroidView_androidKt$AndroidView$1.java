package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.R;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Ref;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidView_androidKt$AndroidView$1 extends Lambda implements Function0<LayoutNode> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Function1<Context, T> $factory;
    public final /* synthetic */ CompositionContext $parentReference;
    public final /* synthetic */ String $stateKey;
    public final /* synthetic */ SaveableStateRegistry $stateRegistry;
    public final /* synthetic */ Ref<ViewFactoryHolder<T>> $viewFactoryHolderRef;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidView_androidKt$AndroidView$1(Context context, CompositionContext compositionContext, Function1<? super Context, ? extends T> function1, SaveableStateRegistry saveableStateRegistry, String str, Ref<ViewFactoryHolder<T>> ref) {
        super(0);
        this.$context = context;
        this.$parentReference = compositionContext;
        this.$factory = function1;
        this.$stateRegistry = saveableStateRegistry;
        this.$stateKey = str;
        this.$viewFactoryHolderRef = ref;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final LayoutNode invoke() {
        View typedView$ui_release;
        ViewFactoryHolder viewFactoryHolder = new ViewFactoryHolder(this.$context, this.$parentReference);
        viewFactoryHolder.setFactory(this.$factory);
        SaveableStateRegistry saveableStateRegistry = this.$stateRegistry;
        Object consumeRestored = saveableStateRegistry == null ? null : saveableStateRegistry.consumeRestored(this.$stateKey);
        SparseArray<Parcelable> sparseArray = consumeRestored instanceof SparseArray ? (SparseArray) consumeRestored : null;
        if (sparseArray != null && (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) != null) {
            typedView$ui_release.restoreHierarchyState(sparseArray);
        }
        this.$viewFactoryHolderRef.setValue(viewFactoryHolder);
        return viewFactoryHolder.getLayoutNode();
    }
}
