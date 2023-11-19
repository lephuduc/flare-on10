package androidx.compose.runtime;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\t\u0010\t\u001a\u00020\nH\u0096\u0002J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"androidx/compose/runtime/SlotWriter$groupSlots$1", "", "", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "hasNext", "", "next", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.appcompat.R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class SlotWriter$groupSlots$1 implements Iterator<Object>, KMappedMarker {
    public final /* synthetic */ int $end;
    public final /* synthetic */ int $start;
    private int current;
    public final /* synthetic */ SlotWriter this$0;

    public SlotWriter$groupSlots$1(int i2, int i3, SlotWriter slotWriter) {
        this.$start = i2;
        this.$end = i3;
        this.this$0 = slotWriter;
        this.current = i2;
    }

    public final int getCurrent() {
        return this.current;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.current < this.$end;
    }

    @Override // java.util.Iterator
    @Nullable
    public Object next() {
        Object[] objArr;
        int dataIndexToDataAddress;
        if (hasNext()) {
            objArr = this.this$0.slots;
            SlotWriter slotWriter = this.this$0;
            int i2 = this.current;
            this.current = i2 + 1;
            dataIndexToDataAddress = slotWriter.dataIndexToDataAddress(i2);
            return objArr[dataIndexToDataAddress];
        }
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setCurrent(int i2) {
        this.current = i2;
    }
}
