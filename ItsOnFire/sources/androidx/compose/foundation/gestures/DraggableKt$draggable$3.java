package androidx.compose.foundation.gestures;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/gestures/PointerAwareDraggableState;", "invoke", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/PointerAwareDraggableState;"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class DraggableKt$draggable$3 extends Lambda implements Function2<Composer, Integer, PointerAwareDraggableState> {
    public final /* synthetic */ DraggableState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableKt$draggable$3(DraggableState draggableState) {
        super(2);
        this.$state = draggableState;
    }

    @Composable
    @NotNull
    public final PointerAwareDraggableState invoke(@Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-1197727804);
        DraggableState draggableState = this.$state;
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(draggableState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new IgnorePointerDraggableState(draggableState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        IgnorePointerDraggableState ignorePointerDraggableState = (IgnorePointerDraggableState) rememberedValue;
        composer.endReplaceableGroup();
        return ignorePointerDraggableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ PointerAwareDraggableState invoke(Composer composer, Integer num) {
        return invoke(composer, num.intValue());
    }
}
