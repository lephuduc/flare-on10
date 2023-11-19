package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.R;
import androidx.compose.ui.layout.MeasureResult;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u00012\u00020\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureResult;", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutInfo;", "visibleItemsInfo", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemInfo;", "getVisibleItemsInfo", "()Ljava/util/List;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public interface LazyLayoutMeasureResult extends MeasureResult, LazyLayoutInfo {
    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutInfo
    @NotNull
    List<LazyLayoutItemInfo> getVisibleItemsInfo();
}
