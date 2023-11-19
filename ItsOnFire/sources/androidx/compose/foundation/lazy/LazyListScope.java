package androidx.compose.foundation.lazy;

import androidx.appcompat.R;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@LazyScopeMarker
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J7\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\b\b¢\u0006\u0002\b\tH&¢\u0006\u0002\u0010\nJo\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2%\b\u0002\u0010\u0004\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000621\u0010\u0011\u001a-\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00030\u0012¢\u0006\u0002\b\b¢\u0006\u0002\b\tH&¢\u0006\u0002\u0010\u0013J7\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\b\b¢\u0006\u0002\b\tH'¢\u0006\u0002\u0010\n¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "", "item", "", "key", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", FirebaseAnalytics.Param.ITEMS, "count", "", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "itemContent", "Lkotlin/Function2;", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "stickyHeader", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public interface LazyListScope {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void item$default(LazyListScope lazyListScope, Object obj, Function3 function3, int i2, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
            }
            if ((i2 & 1) != 0) {
                obj = null;
            }
            lazyListScope.item(obj, function3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void items$default(LazyListScope lazyListScope, int i2, Function1 function1, Function4 function4, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
            }
            if ((i3 & 2) != 0) {
                function1 = null;
            }
            lazyListScope.items(i2, function1, function4);
        }

        public static /* synthetic */ void stickyHeader$default(LazyListScope lazyListScope, Object obj, Function3 function3, int i2, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
            }
            if ((i2 & 1) != 0) {
                obj = null;
            }
            lazyListScope.stickyHeader(obj, function3);
        }
    }

    void item(@Nullable Object obj, @NotNull Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> function3);

    void items(int i2, @Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4);

    @ExperimentalFoundationApi
    void stickyHeader(@Nullable Object obj, @NotNull Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> function3);
}
