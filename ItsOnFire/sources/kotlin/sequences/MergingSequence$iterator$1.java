package kotlin.sequences;

import androidx.appcompat.R;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0007\u001a\u00020\bH\u0096\u0002J\u000e\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u000b"}, d2 = {"kotlin/sequences/MergingSequence$iterator$1", "", "iterator1", "getIterator1", "()Ljava/util/Iterator;", "iterator2", "getIterator2", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class MergingSequence$iterator$1 implements Iterator<V>, KMappedMarker {
    @NotNull
    private final Iterator<T1> iterator1;
    @NotNull
    private final Iterator<T2> iterator2;
    public final /* synthetic */ MergingSequence<T1, T2, V> this$0;

    public MergingSequence$iterator$1(MergingSequence<T1, T2, V> mergingSequence) {
        Sequence sequence;
        Sequence sequence2;
        this.this$0 = mergingSequence;
        sequence = ((MergingSequence) mergingSequence).sequence1;
        this.iterator1 = sequence.iterator();
        sequence2 = ((MergingSequence) mergingSequence).sequence2;
        this.iterator2 = sequence2.iterator();
    }

    @NotNull
    public final Iterator<T1> getIterator1() {
        return this.iterator1;
    }

    @NotNull
    public final Iterator<T2> getIterator2() {
        return this.iterator2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator1.hasNext() && this.iterator2.hasNext();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [V, java.lang.Object] */
    @Override // java.util.Iterator
    public V next() {
        Function2 function2;
        function2 = ((MergingSequence) this.this$0).transform;
        return function2.invoke(this.iterator1.next(), this.iterator2.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
