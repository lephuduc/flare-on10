package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.appcompat.R;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "owner", "Landroidx/compose/ui/node/Owner;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class AndroidViewHolder$layoutNode$1$4 extends Lambda implements Function1<Owner, Unit> {
    public final /* synthetic */ AndroidViewHolder $this_run;
    public final /* synthetic */ Ref.ObjectRef<View> $viewRemovedOnDetach;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$layoutNode$1$4(AndroidViewHolder androidViewHolder, Ref.ObjectRef<View> objectRef) {
        super(1);
        this.$this_run = androidViewHolder;
        this.$viewRemovedOnDetach = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Owner owner) {
        invoke2(owner);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, android.view.View] */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Owner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
        if (androidComposeView != null) {
            androidComposeView.removeAndroidView(this.$this_run);
        }
        this.$viewRemovedOnDetach.element = this.$this_run.getView();
        this.$this_run.setView$ui_release(null);
    }
}
