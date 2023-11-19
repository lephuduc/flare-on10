package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/EmptyLazyLayoutInfo;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutInfo;", "()V", "visibleItemsInfo", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemInfo;", "getVisibleItemsInfo", "()Ljava/util/List;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
final class EmptyLazyLayoutInfo implements LazyLayoutInfo {
    @NotNull
    public static final EmptyLazyLayoutInfo INSTANCE = new EmptyLazyLayoutInfo();
    @NotNull
    private static final List<LazyLayoutItemInfo> visibleItemsInfo;

    static {
        List<LazyLayoutItemInfo> emptyList;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        visibleItemsInfo = emptyList;
    }

    private EmptyLazyLayoutInfo() {
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutInfo
    @NotNull
    public List<LazyLayoutItemInfo> getVisibleItemsInfo() {
        return visibleItemsInfo;
    }
}
