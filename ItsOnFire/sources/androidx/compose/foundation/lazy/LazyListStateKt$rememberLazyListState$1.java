package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyListStateKt$rememberLazyListState$1 extends Lambda implements Function0<LazyListState> {
    public final /* synthetic */ int $initialFirstVisibleItemIndex;
    public final /* synthetic */ int $initialFirstVisibleItemScrollOffset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListStateKt$rememberLazyListState$1(int i2, int i3) {
        super(0);
        this.$initialFirstVisibleItemIndex = i2;
        this.$initialFirstVisibleItemScrollOffset = i3;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final LazyListState invoke() {
        return new LazyListState(this.$initialFirstVisibleItemIndex, this.$initialFirstVisibleItemScrollOffset);
    }
}
