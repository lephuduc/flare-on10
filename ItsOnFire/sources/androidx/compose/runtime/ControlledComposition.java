package androidx.compose.runtime;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\b\u0010\u0007\u001a\u00020\bH&J \u0010\t\u001a\u00020\b2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\fH&¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\bH&J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&J\u0016\u0010\u0013\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH&J\b\u0010\u0015\u001a\u00020\u0003H&J\u0016\u0010\u0016\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0012H&J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0012H&J\b\u0010\u001a\u001a\u00020\bH'R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/Composition;", "hasPendingChanges", "", "getHasPendingChanges", "()Z", "isComposing", "applyChanges", "", "composeContent", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;)V", "invalidateAll", "observesAnyOf", "values", "", "", "prepareCompose", "block", "recompose", "recordModificationsOf", "recordReadOf", "value", "recordWriteOf", "verifyConsistent", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public interface ControlledComposition extends Composition {
    void applyChanges();

    void composeContent(@NotNull Function2<? super Composer, ? super Integer, Unit> function2);

    boolean getHasPendingChanges();

    void invalidateAll();

    boolean isComposing();

    boolean observesAnyOf(@NotNull Set<? extends Object> set);

    void prepareCompose(@NotNull Function0<Unit> function0);

    boolean recompose();

    void recordModificationsOf(@NotNull Set<? extends Object> set);

    void recordReadOf(@NotNull Object obj);

    void recordWriteOf(@NotNull Object obj);

    @InternalComposeApi
    void verifyConsistent();
}
