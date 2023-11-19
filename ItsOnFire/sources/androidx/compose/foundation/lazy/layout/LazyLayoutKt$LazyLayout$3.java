package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.R;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyLayoutKt$LazyLayout$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function0<LazyLayoutItemsProvider> $itemsProvider;
    public final /* synthetic */ LazyMeasurePolicy $measurePolicy;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ LazyLayoutPrefetchPolicy $prefetchPolicy;
    public final /* synthetic */ LazyLayoutState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutKt$LazyLayout$3(Function0<? extends LazyLayoutItemsProvider> function0, Modifier modifier, LazyLayoutState lazyLayoutState, LazyLayoutPrefetchPolicy lazyLayoutPrefetchPolicy, LazyMeasurePolicy lazyMeasurePolicy, int i2, int i3) {
        super(2);
        this.$itemsProvider = function0;
        this.$modifier = modifier;
        this.$state = lazyLayoutState;
        this.$prefetchPolicy = lazyLayoutPrefetchPolicy;
        this.$measurePolicy = lazyMeasurePolicy;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        LazyLayoutKt.LazyLayout(this.$itemsProvider, this.$modifier, this.$state, this.$prefetchPolicy, this.$measurePolicy, composer, this.$$changed | 1, this.$$default);
    }
}
