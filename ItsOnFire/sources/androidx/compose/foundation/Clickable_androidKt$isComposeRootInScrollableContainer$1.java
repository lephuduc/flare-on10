package androidx.compose.foundation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class Clickable_androidKt$isComposeRootInScrollableContainer$1 extends Lambda implements Function0<Boolean> {
    public final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Clickable_androidKt$isComposeRootInScrollableContainer$1(View view) {
        super(0);
        this.$view = view;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Boolean invoke() {
        boolean isInScrollableViewGroup;
        isInScrollableViewGroup = Clickable_androidKt.isInScrollableViewGroup(this.$view);
        return Boolean.valueOf(isInScrollableViewGroup);
    }
}
