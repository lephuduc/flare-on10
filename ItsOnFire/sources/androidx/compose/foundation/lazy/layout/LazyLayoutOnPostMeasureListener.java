package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutOnPostMeasureListener;", "", "onPostMeasure", "", "result", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureResult;", "placeablesProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPlaceablesProvider;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public interface LazyLayoutOnPostMeasureListener {
    void onPostMeasure(@NotNull LazyLayoutMeasureResult lazyLayoutMeasureResult, @NotNull LazyLayoutPlaceablesProvider lazyLayoutPlaceablesProvider);
}
