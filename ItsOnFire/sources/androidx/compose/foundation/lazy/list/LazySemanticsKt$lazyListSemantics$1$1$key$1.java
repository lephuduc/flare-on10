package androidx.compose.foundation.lazy.list;

import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public /* synthetic */ class LazySemanticsKt$lazyListSemantics$1$1$key$1 extends FunctionReferenceImpl implements Function1<Integer, Object> {
    public LazySemanticsKt$lazyListSemantics$1$1$key$1(Object obj) {
        super(1, obj, LazyListItemsProvider.class, "getKey", "getKey(I)Ljava/lang/Object;", 0);
    }

    @NotNull
    public final Object invoke(int i2) {
        return ((LazyListItemsProvider) this.receiver).getKey(i2);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}
