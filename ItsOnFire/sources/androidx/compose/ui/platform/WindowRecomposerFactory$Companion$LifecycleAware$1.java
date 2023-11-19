package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "rootView", "Landroidx/compose/runtime/Recomposer;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class WindowRecomposerFactory$Companion$LifecycleAware$1 implements WindowRecomposerFactory {
    public static final WindowRecomposerFactory$Companion$LifecycleAware$1 INSTANCE = new WindowRecomposerFactory$Companion$LifecycleAware$1();

    @Override // androidx.compose.ui.platform.WindowRecomposerFactory
    @NotNull
    public final Recomposer createRecomposer(@NotNull View rootView) {
        Recomposer createLifecycleAwareViewTreeRecomposer;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        createLifecycleAwareViewTreeRecomposer = WindowRecomposer_androidKt.createLifecycleAwareViewTreeRecomposer(rootView);
        return createLifecycleAwareViewTreeRecomposer;
    }
}
