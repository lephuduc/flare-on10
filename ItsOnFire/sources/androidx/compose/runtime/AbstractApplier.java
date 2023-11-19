package androidx.compose.runtime;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u000fH$J\b\u0010\u0013\u001a\u00020\u000fH\u0016J*\u0010\u0014\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0004J\"\u0010\u0019\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0004R&\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000@TX\u0096\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/AbstractApplier;", "T", "Landroidx/compose/runtime/Applier;", "root", "(Ljava/lang/Object;)V", "<set-?>", "current", "getCurrent", "()Ljava/lang/Object;", "setCurrent", "Ljava/lang/Object;", "getRoot", "stack", "", "clear", "", "down", "node", "onClear", "up", "move", Constants.MessagePayloadKeys.FROM, "", "to", "count", "remove", FirebaseAnalytics.Param.INDEX, "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public abstract class AbstractApplier<T> implements Applier<T> {
    public static final int $stable = 8;
    private T current;
    private final T root;
    @NotNull
    private final List<T> stack = new ArrayList();

    public AbstractApplier(T t2) {
        this.root = t2;
        this.current = t2;
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        this.stack.clear();
        setCurrent(this.root);
        onClear();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(T t2) {
        this.stack.add(getCurrent());
        setCurrent(t2);
    }

    @Override // androidx.compose.runtime.Applier
    public T getCurrent() {
        return this.current;
    }

    public final T getRoot() {
        return this.root;
    }

    public final void move(@NotNull List<T> list, int i2, int i3, int i4) {
        List mutableList;
        Intrinsics.checkNotNullParameter(list, "<this>");
        int i5 = i2 > i3 ? i3 : i3 - i4;
        if (i4 != 1) {
            List<T> subList = list.subList(i2, i4 + i2);
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) subList);
            subList.clear();
            list.addAll(i5, mutableList);
        } else if (i2 == i3 + 1 || i2 == i3 - 1) {
            list.set(i2, list.set(i3, list.get(i2)));
        } else {
            list.add(i5, list.remove(i2));
        }
    }

    @Override // androidx.compose.runtime.Applier
    public void onBeginChanges() {
        Applier.DefaultImpls.onBeginChanges(this);
    }

    public abstract void onClear();

    @Override // androidx.compose.runtime.Applier
    public void onEndChanges() {
        Applier.DefaultImpls.onEndChanges(this);
    }

    public final void remove(@NotNull List<T> list, int i2, int i3) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i3 == 1) {
            list.remove(i2);
        } else {
            list.subList(i2, i3 + i2).clear();
        }
    }

    public void setCurrent(T t2) {
        this.current = t2;
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        if (!(!this.stack.isEmpty())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        List<T> list = this.stack;
        setCurrent(list.remove(list.size() - 1));
    }
}
