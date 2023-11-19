package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class ScrollableKt$touchScrollable$1 extends Lambda implements Function2<Composer, Integer, PointerAwareDraggableState> {
    public final /* synthetic */ ScrollDraggableState $draggableState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$touchScrollable$1(ScrollDraggableState scrollDraggableState) {
        super(2);
        this.$draggableState = scrollDraggableState;
    }

    @Composable
    @NotNull
    public final PointerAwareDraggableState invoke(@Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-971263152);
        ScrollDraggableState scrollDraggableState = this.$draggableState;
        composer.endReplaceableGroup();
        return scrollDraggableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ PointerAwareDraggableState invoke(Composer composer, Integer num) {
        return invoke(composer, num.intValue());
    }
}
