package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.GridCells;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyGridKt$LazyVerticalGrid$1 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ GridCells $cells;
    public final /* synthetic */ Function1<LazyGridScope, Unit> $content;
    public final /* synthetic */ PaddingValues $contentPadding;
    public final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    public final /* synthetic */ LazyListState $state;
    public final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridKt$LazyVerticalGrid$1(GridCells gridCells, LazyListState lazyListState, PaddingValues paddingValues, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Function1<? super LazyGridScope, Unit> function1, int i2) {
        super(3);
        this.$cells = gridCells;
        this.$state = lazyListState;
        this.$contentPadding = paddingValues;
        this.$verticalArrangement = vertical;
        this.$horizontalArrangement = horizontal;
        this.$content = function1;
        this.$$dirty = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i2 & 14) == 0) {
            i2 |= composer.changed(BoxWithConstraints) ? 4 : 2;
        }
        if (((i2 & 91) ^ 18) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        int max = Math.max((int) (BoxWithConstraints.mo342getMaxWidthD9Ej5fM() / ((GridCells.Adaptive) this.$cells).m420getMinSizeD9Ej5fM()), 1);
        LazyListState lazyListState = this.$state;
        PaddingValues paddingValues = this.$contentPadding;
        Arrangement.Vertical vertical = this.$verticalArrangement;
        Arrangement.Horizontal horizontal = this.$horizontalArrangement;
        Function1<LazyGridScope, Unit> function1 = this.$content;
        int i3 = this.$$dirty;
        LazyGridKt.FixedLazyGrid(max, null, lazyListState, paddingValues, vertical, horizontal, function1, composer, (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016), 2);
    }
}
