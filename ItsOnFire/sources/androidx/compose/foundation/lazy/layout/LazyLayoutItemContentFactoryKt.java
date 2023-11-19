package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"rememberItemContentFactory", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutState;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactoryKt {
    @Composable
    @NotNull
    public static final LazyLayoutItemContentFactory rememberItemContentFactory(@NotNull LazyLayoutState state, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(-2067463753);
        SaveableStateHolder rememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(composer, 0);
        Function0<LazyLayoutItemsProvider> itemsProvider$foundation_release = state.getItemsProvider$foundation_release();
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(itemsProvider$foundation_release);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyLayoutItemContentFactory(rememberSaveableStateHolder, itemsProvider$foundation_release);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) rememberedValue;
        composer.endReplaceableGroup();
        return lazyLayoutItemContentFactory;
    }
}
