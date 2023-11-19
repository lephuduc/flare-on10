package androidx.compose.runtime;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003J\t\u0010\n\u001a\u00020\u000bH\u0096\u0002J\u0011\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003H\u0096\u0002J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"androidx/compose/runtime/GroupIterator$next$1$data$1", "", "", "", FirebaseAnalytics.Param.INDEX, "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "iterator", "next", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class GroupIterator$next$1$data$1 implements Iterable<Object>, Iterator<Object>, KMappedMarker {
    public final /* synthetic */ int $end;
    public final /* synthetic */ int $start;
    private int index;
    public final /* synthetic */ GroupIterator this$0;

    public GroupIterator$next$1$data$1(int i2, int i3, GroupIterator groupIterator) {
        this.$start = i2;
        this.$end = i3;
        this.this$0 = groupIterator;
        this.index = i2;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.$end;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Object> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    @Nullable
    public Object next() {
        int i2 = this.index;
        Object obj = (i2 < 0 || i2 >= this.this$0.getTable().getSlots().length) ? null : this.this$0.getTable().getSlots()[this.index];
        setIndex(getIndex() + 1);
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setIndex(int i2) {
        this.index = i2;
    }
}
