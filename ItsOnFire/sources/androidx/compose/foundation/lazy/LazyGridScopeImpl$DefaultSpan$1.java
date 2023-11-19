package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/GridItemSpan;", "Landroidx/compose/foundation/lazy/LazyGridItemSpanScope;", "it", "", "invoke-OHRMr_U", "(Landroidx/compose/foundation/lazy/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyGridScopeImpl$DefaultSpan$1 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
    public static final LazyGridScopeImpl$DefaultSpan$1 INSTANCE = new LazyGridScopeImpl$DefaultSpan$1();

    public LazyGridScopeImpl$DefaultSpan$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
        return GridItemSpan.m421boximpl(m433invokeOHRMr_U(lazyGridItemSpanScope, num.intValue()));
    }

    /* renamed from: invoke-OHRMr_U  reason: not valid java name */
    public final long m433invokeOHRMr_U(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i2) {
        Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
        return LazyGridSpanKt.GridItemSpan(1);
    }
}
