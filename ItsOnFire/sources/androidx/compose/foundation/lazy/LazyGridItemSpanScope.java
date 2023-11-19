package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import kotlin.Metadata;

@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/lazy/LazyGridItemSpanScope;", "", "itemColumn", "", "getItemColumn$annotations", "()V", "getItemColumn", "()I", "itemRow", "getItemRow$annotations", "getItemRow", "maxCurrentLineSpan", "getMaxCurrentLineSpan$annotations", "getMaxCurrentLineSpan", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public interface LazyGridItemSpanScope {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @ExperimentalFoundationApi
        public static /* synthetic */ void getItemColumn$annotations() {
        }

        @ExperimentalFoundationApi
        public static /* synthetic */ void getItemRow$annotations() {
        }

        @ExperimentalFoundationApi
        public static /* synthetic */ void getMaxCurrentLineSpan$annotations() {
        }
    }

    int getItemColumn();

    int getItemRow();

    int getMaxCurrentLineSpan();
}
