package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ScrollableKt$touchScrollable$2 extends Lambda implements Function1<PointerInputChange, Boolean> {
    public static final ScrollableKt$touchScrollable$2 INSTANCE = new ScrollableKt$touchScrollable$2();

    public ScrollableKt$touchScrollable$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull PointerInputChange down) {
        Intrinsics.checkNotNullParameter(down, "down");
        return Boolean.valueOf(!PointerType.m2716equalsimpl0(down.m2661getTypeT8wyACA(), PointerType.Companion.m2721getMouseT8wyACA()));
    }
}
