package androidx.compose.foundation.lazy;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", FirebaseAnalytics.Param.INDEX, "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 176)
/* loaded from: classes.dex */
public final class LazyDslKt$items$3 extends Lambda implements Function1<Integer, Object> {
    public final /* synthetic */ T[] $items;
    public final /* synthetic */ Function1<T, Object> $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyDslKt$items$3(Function1<? super T, ? extends Object> function1, T[] tArr) {
        super(1);
        this.$key = function1;
        this.$items = tArr;
    }

    @NotNull
    public final Object invoke(int i2) {
        return this.$key.invoke(this.$items[i2]);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}
