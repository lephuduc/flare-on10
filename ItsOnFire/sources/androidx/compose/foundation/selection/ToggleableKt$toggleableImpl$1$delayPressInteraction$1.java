package androidx.compose.foundation.selection;

import androidx.appcompat.R;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ToggleableKt$toggleableImpl$1$delayPressInteraction$1 extends Lambda implements Function0<Boolean> {
    public final /* synthetic */ Function0<Boolean> $isRootInScrollableContainer;
    public final /* synthetic */ MutableState<Boolean> $isToggleableInScrollableContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleableKt$toggleableImpl$1$delayPressInteraction$1(MutableState<Boolean> mutableState, Function0<Boolean> function0) {
        super(0);
        this.$isToggleableInScrollableContainer = mutableState;
        this.$isRootInScrollableContainer = function0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Boolean invoke() {
        return Boolean.valueOf(this.$isToggleableInScrollableContainer.getValue().booleanValue() || this.$isRootInScrollableContainer.invoke().booleanValue());
    }
}
