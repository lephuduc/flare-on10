package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/LazyListState;", "it", "", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class LazyListState$Companion$Saver$2 extends Lambda implements Function1<List<? extends Integer>, LazyListState> {
    public static final LazyListState$Companion$Saver$2 INSTANCE = new LazyListState$Companion$Saver$2();

    public LazyListState$Companion$Saver$2() {
        super(1);
    }

    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final LazyListState invoke2(@NotNull List<Integer> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new LazyListState(it.get(0).intValue(), it.get(1).intValue());
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ LazyListState invoke(List<? extends Integer> list) {
        return invoke2((List<Integer>) list);
    }
}
