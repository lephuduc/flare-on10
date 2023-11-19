package androidx.compose.ui.platform;

import androidx.appcompat.R;
import androidx.compose.runtime.collection.MutableVector;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0002J\r\u0010\u000f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/WeakCache;", "T", "", "()V", "referenceQueue", "Ljava/lang/ref/ReferenceQueue;", "size", "", "getSize", "()I", "values", "Landroidx/compose/runtime/collection/MutableVector;", "Ljava/lang/ref/Reference;", "clearWeakReferences", "", "pop", "()Ljava/lang/Object;", "push", "element", "(Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class WeakCache<T> {
    @NotNull
    private final MutableVector<Reference<T>> values = new MutableVector<>(new Reference[16], 0);
    @NotNull
    private final ReferenceQueue<T> referenceQueue = new ReferenceQueue<>();

    private final void clearWeakReferences() {
        Reference<? extends T> poll;
        do {
            poll = this.referenceQueue.poll();
            if (poll != null) {
                this.values.remove(poll);
                continue;
            }
        } while (poll != null);
    }

    public final int getSize() {
        clearWeakReferences();
        return this.values.getSize();
    }

    @Nullable
    public final T pop() {
        clearWeakReferences();
        while (this.values.isNotEmpty()) {
            MutableVector<Reference<T>> mutableVector = this.values;
            T t2 = mutableVector.removeAt(mutableVector.getSize() - 1).get();
            if (t2 != null) {
                return t2;
            }
        }
        return null;
    }

    public final void push(T t2) {
        clearWeakReferences();
        this.values.add(new WeakReference(t2, this.referenceQueue));
    }
}
