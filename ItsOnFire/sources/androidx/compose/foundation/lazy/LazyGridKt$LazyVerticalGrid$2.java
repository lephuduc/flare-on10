package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyGridKt$LazyVerticalGrid$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ GridCells $cells;
    public final /* synthetic */ Function1<LazyGridScope, Unit> $content;
    public final /* synthetic */ PaddingValues $contentPadding;
    public final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    public final /* synthetic */ Modifier $modifier;
    public final /* synthetic */ LazyListState $state;
    public final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridKt$LazyVerticalGrid$2(GridCells gridCells, Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Function1<? super LazyGridScope, Unit> function1, int i2, int i3) {
        super(2);
        this.$cells = gridCells;
        this.$modifier = modifier;
        this.$state = lazyListState;
        this.$contentPadding = paddingValues;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
        this.$content = function1;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        LazyGridKt.LazyVerticalGrid(this.$cells, this.$modifier, this.$state, this.$contentPadding, this.$verticalArrangement, this.$horizontalArrangement, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
