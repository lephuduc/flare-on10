package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/lazy/layout/NoItemsProvider;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemsProvider;", "()V", "itemsCount", "", "getItemsCount", "()I", "keyToIndexMap", "", "", "getKeyToIndexMap", "()Ljava/util/Map;", "getContent", "Lkotlin/Function0;", "", FirebaseAnalytics.Param.INDEX, "getKey", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
final class NoItemsProvider implements LazyLayoutItemsProvider {
    @NotNull
    public static final NoItemsProvider INSTANCE = new NoItemsProvider();
    private static final int itemsCount = 0;

    private NoItemsProvider() {
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemsProvider
    @NotNull
    public Function0<Unit> getContent(int i2) {
        throw new IllegalStateException("No items".toString());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemsProvider
    public /* bridge */ /* synthetic */ Function2 getContent(int i2) {
        return (Function2) getContent(i2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemsProvider
    public int getItemsCount() {
        return itemsCount;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemsProvider
    @NotNull
    public Object getKey(int i2) {
        throw new IllegalStateException("No items".toString());
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemsProvider
    @NotNull
    public Map<Object, Integer> getKeyToIndexMap() {
        throw new IllegalStateException("No items".toString());
    }
}
