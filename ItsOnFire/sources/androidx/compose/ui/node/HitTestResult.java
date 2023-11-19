package androidx.compose.ui.node;

import androidx.appcompat.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002=>B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\u0018\u0010\u001b\u001a\u00020\u001cH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020\u0014J)\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110'¢\u0006\u0002\u0010(J1\u0010)\u001a\u00020\u00112\u0006\u0010$\u001a\u00028\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010%\u001a\u00020\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110'¢\u0006\u0002\u0010,J\u0015\u0010-\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\u0014H\u0016J\u0016\u00100\u001a\u00020\u00142\u0006\u0010*\u001a\u00020+2\u0006\u0010%\u001a\u00020\u0014J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0096\u0002J\u0015\u00103\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010.J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0016J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00028\u0000052\u0006\u0010 \u001a\u00020\u0007H\u0016J\b\u00106\u001a\u00020\u0011H\u0002J\u001a\u00107\u001a\u00020\u00112\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00110'H\u0086\bø\u0001\u0003J1\u00109\u001a\u00020\u00112\u0006\u0010$\u001a\u00028\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010%\u001a\u00020\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110'¢\u0006\u0002\u0010,J\u001e\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000f\u0082\u0002\u0016\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006?"}, d2 = {"Landroidx/compose/ui/node/HitTestResult;", "T", "", "()V", "distanceFromEdgeAndInLayer", "", "hitDepth", "", "<set-?>", "size", "getSize", "()I", "values", "", "", "[Ljava/lang/Object;", "acceptHits", "", "clear", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "ensureContainerSize", "findBestHitDistance", "Landroidx/compose/ui/node/DistanceAndInLayer;", "findBestHitDistance-ptXAw2c", "()J", "get", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Object;", "hasHit", "hit", "node", "isInLayer", "childHitTest", "Lkotlin/Function0;", "(Ljava/lang/Object;ZLkotlin/jvm/functions/Function0;)V", "hitInMinimumTouchTarget", "distanceFromEdge", "", "(Ljava/lang/Object;FZLkotlin/jvm/functions/Function0;)V", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "isHitInMinimumTouchTargetBetter", "iterator", "", "lastIndexOf", "listIterator", "", "resizeToHitDepth", "siblingHits", "block", "speculativeHit", "subList", "fromIndex", "toIndex", "HitTestResultIterator", "SubList", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes.dex */
public final class HitTestResult<T> implements List<T>, KMappedMarker {
    private int size;
    @NotNull
    private Object[] values = new Object[16];
    @NotNull
    private long[] distanceFromEdgeAndInLayer = new long[16];
    private int hitDepth = -1;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\r\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/HitTestResult$HitTestResultIterator;", "", FirebaseAnalytics.Param.INDEX, "", "minIndex", "maxIndex", "(Landroidx/compose/ui/node/HitTestResult;III)V", "getIndex", "()I", "setIndex", "(I)V", "getMaxIndex", "getMinIndex", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "previous", "previousIndex", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public final class HitTestResultIterator implements ListIterator<T>, KMappedMarker {
        private int index;
        private final int maxIndex;
        private final int minIndex;

        public HitTestResultIterator(HitTestResult this$0, int i2, int i3, int i4) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            HitTestResult.this = this$0;
            this.index = i2;
            this.minIndex = i3;
            this.maxIndex = i4;
        }

        public /* synthetic */ HitTestResultIterator(int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(HitTestResult.this, (i5 & 1) != 0 ? 0 : i2, (i5 & 2) != 0 ? 0 : i3, (i5 & 4) != 0 ? HitTestResult.this.size() : i4);
        }

        @Override // java.util.ListIterator
        public void add(T t2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.maxIndex;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > this.minIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            Object[] objArr = ((HitTestResult) HitTestResult.this).values;
            int i2 = this.index;
            this.index = i2 + 1;
            return (T) objArr[i2];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        @Override // java.util.ListIterator
        public T previous() {
            Object[] objArr = ((HitTestResult) HitTestResult.this).values;
            int i2 = this.index - 1;
            this.index = i2;
            return (T) objArr[i2];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i2) {
            this.index = i2;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\u0016\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096\u0002J\u0015\u0010\u001a\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007¨\u0006 "}, d2 = {"Landroidx/compose/ui/node/HitTestResult$SubList;", "", "minIndex", "", "maxIndex", "(Landroidx/compose/ui/node/HitTestResult;II)V", "getMaxIndex", "()I", "getMinIndex", "size", "getSize", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "get", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes.dex */
    public final class SubList implements List<T>, KMappedMarker {
        private final int maxIndex;
        private final int minIndex;
        public final /* synthetic */ HitTestResult<T> this$0;

        public SubList(HitTestResult this$0, int i2, int i3) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.this$0 = this$0;
            this.minIndex = i2;
            this.maxIndex = i3;
        }

        @Override // java.util.List
        public void add(int i2, T t2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return indexOf(obj) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i2) {
            return (T) ((HitTestResult) this.this$0).values[i2 + this.minIndex];
        }

        public final int getMaxIndex() {
            return this.maxIndex;
        }

        public final int getMinIndex() {
            return this.minIndex;
        }

        public int getSize() {
            return this.maxIndex - this.minIndex;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i2 = this.minIndex;
            int i3 = this.maxIndex;
            if (i2 > i3) {
                return -1;
            }
            while (true) {
                int i4 = i2 + 1;
                if (Intrinsics.areEqual(((HitTestResult) this.this$0).values[i2], obj)) {
                    return i2 - this.minIndex;
                }
                if (i2 == i3) {
                    return -1;
                }
                i2 = i4;
            }
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            HitTestResult<T> hitTestResult = this.this$0;
            int i2 = this.minIndex;
            return new HitTestResultIterator(hitTestResult, i2, i2, this.maxIndex);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i2 = this.maxIndex;
            int i3 = this.minIndex;
            if (i3 > i2) {
                return -1;
            }
            while (true) {
                int i4 = i2 - 1;
                if (Intrinsics.areEqual(((HitTestResult) this.this$0).values[i2], obj)) {
                    return i2 - this.minIndex;
                }
                if (i2 == i3) {
                    return -1;
                }
                i2 = i4;
            }
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator() {
            HitTestResult<T> hitTestResult = this.this$0;
            int i2 = this.minIndex;
            return new HitTestResultIterator(hitTestResult, i2, i2, this.maxIndex);
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator(int i2) {
            HitTestResult<T> hitTestResult = this.this$0;
            int i3 = this.minIndex;
            return new HitTestResultIterator(hitTestResult, i2 + i3, i3, this.maxIndex);
        }

        @Override // java.util.List
        public T remove(int i2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<T> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public T set(int i2, T t2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        public void sort(Comparator<? super T> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        @NotNull
        public List<T> subList(int i2, int i3) {
            HitTestResult<T> hitTestResult = this.this$0;
            int i4 = this.minIndex;
            return new SubList(hitTestResult, i2 + i4, i4 + i3);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.toArray(this, array);
        }
    }

    private final void ensureContainerSize() {
        int i2 = this.hitDepth;
        Object[] objArr = this.values;
        if (i2 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.values = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.distanceFromEdgeAndInLayer, length);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.distanceFromEdgeAndInLayer = copyOf2;
        }
    }

    /* renamed from: findBestHitDistance-ptXAw2c  reason: not valid java name */
    private final long m2863findBestHitDistanceptXAw2c() {
        long DistanceAndInLayer;
        int lastIndex;
        DistanceAndInLayer = HitTestResultKt.DistanceAndInLayer(Float.POSITIVE_INFINITY, false);
        int i2 = this.hitDepth + 1;
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this);
        if (i2 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                long m2854constructorimpl = DistanceAndInLayer.m2854constructorimpl(this.distanceFromEdgeAndInLayer[i2]);
                if (DistanceAndInLayer.m2853compareToS_HNhKs(m2854constructorimpl, DistanceAndInLayer) < 0) {
                    DistanceAndInLayer = m2854constructorimpl;
                }
                if (DistanceAndInLayer.m2857getDistanceimpl(DistanceAndInLayer) < 0.0f && DistanceAndInLayer.m2859isInLayerimpl(DistanceAndInLayer)) {
                    return DistanceAndInLayer;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        return DistanceAndInLayer;
    }

    private final void resizeToHitDepth() {
        int lastIndex;
        int i2 = this.hitDepth + 1;
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this);
        if (i2 <= lastIndex) {
            while (true) {
                int i3 = i2 + 1;
                this.values[i2] = null;
                if (i2 == lastIndex) {
                    break;
                }
                i2 = i3;
            }
        }
        this.size = this.hitDepth + 1;
    }

    public final void acceptHits() {
        this.hitDepth = size() - 1;
    }

    @Override // java.util.List
    public void add(int i2, T t2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        resizeToHitDepth();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public T get(int i2) {
        return (T) this.values[i2];
    }

    public int getSize() {
        return this.size;
    }

    public final boolean hasHit() {
        long m2863findBestHitDistanceptXAw2c = m2863findBestHitDistanceptXAw2c();
        return DistanceAndInLayer.m2857getDistanceimpl(m2863findBestHitDistanceptXAw2c) < 0.0f && DistanceAndInLayer.m2859isInLayerimpl(m2863findBestHitDistanceptXAw2c);
    }

    public final void hit(T t2, boolean z, @NotNull Function0<Unit> childHitTest) {
        Intrinsics.checkNotNullParameter(childHitTest, "childHitTest");
        hitInMinimumTouchTarget(t2, -1.0f, z, childHitTest);
    }

    public final void hitInMinimumTouchTarget(T t2, float f2, boolean z, @NotNull Function0<Unit> childHitTest) {
        long DistanceAndInLayer;
        Intrinsics.checkNotNullParameter(childHitTest, "childHitTest");
        int i2 = this.hitDepth;
        this.hitDepth = i2 + 1;
        ensureContainerSize();
        Object[] objArr = this.values;
        int i3 = this.hitDepth;
        objArr[i3] = t2;
        long[] jArr = this.distanceFromEdgeAndInLayer;
        DistanceAndInLayer = HitTestResultKt.DistanceAndInLayer(f2, z);
        jArr[i3] = DistanceAndInLayer;
        resizeToHitDepth();
        childHitTest.invoke();
        this.hitDepth = i2;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int lastIndex;
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this);
        if (lastIndex < 0) {
            return -1;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (Intrinsics.areEqual(this.values[i2], obj)) {
                return i2;
            }
            if (i2 == lastIndex) {
                return -1;
            }
            i2 = i3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isHitInMinimumTouchTargetBetter(float f2, boolean z) {
        int lastIndex;
        long DistanceAndInLayer;
        int i2 = this.hitDepth;
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this);
        if (i2 == lastIndex) {
            return true;
        }
        DistanceAndInLayer = HitTestResultKt.DistanceAndInLayer(f2, z);
        return DistanceAndInLayer.m2853compareToS_HNhKs(m2863findBestHitDistanceptXAw2c(), DistanceAndInLayer) > 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new HitTestResultIterator(0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        int lastIndex;
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this);
        if (lastIndex < 0) {
            return -1;
        }
        while (true) {
            int i2 = lastIndex - 1;
            if (Intrinsics.areEqual(this.values[lastIndex], obj)) {
                return lastIndex;
            }
            if (i2 < 0) {
                return -1;
            }
            lastIndex = i2;
        }
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return new HitTestResultIterator(0, 0, 0, 7, null);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator(int i2) {
        return new HitTestResultIterator(i2, 0, 0, 6, null);
    }

    @Override // java.util.List
    public T remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public T set(int i2, T t2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void siblingHits(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int i2 = this.hitDepth;
        block.invoke();
        this.hitDepth = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void speculativeHit(T t2, float f2, boolean z, @NotNull Function0<Unit> childHitTest) {
        int lastIndex;
        int lastIndex2;
        int lastIndex3;
        int lastIndex4;
        Intrinsics.checkNotNullParameter(childHitTest, "childHitTest");
        int i2 = this.hitDepth;
        lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this);
        if (i2 == lastIndex) {
            hitInMinimumTouchTarget(t2, f2, z, childHitTest);
            int i3 = this.hitDepth + 1;
            lastIndex4 = CollectionsKt__CollectionsKt.getLastIndex(this);
            if (i3 == lastIndex4) {
                resizeToHitDepth();
                return;
            }
            return;
        }
        long m2863findBestHitDistanceptXAw2c = m2863findBestHitDistanceptXAw2c();
        int i4 = this.hitDepth;
        lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(this);
        this.hitDepth = lastIndex2;
        hitInMinimumTouchTarget(t2, f2, z, childHitTest);
        int i5 = this.hitDepth + 1;
        lastIndex3 = CollectionsKt__CollectionsKt.getLastIndex(this);
        if (i5 < lastIndex3 && DistanceAndInLayer.m2853compareToS_HNhKs(m2863findBestHitDistanceptXAw2c, m2863findBestHitDistanceptXAw2c()) > 0) {
            int i6 = this.hitDepth + 1;
            int i7 = i4 + 1;
            Object[] objArr = this.values;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i7, i6, size());
            long[] jArr = this.distanceFromEdgeAndInLayer;
            ArraysKt___ArraysJvmKt.copyInto(jArr, jArr, i7, i6, size());
            this.hitDepth = ((size() + i4) - this.hitDepth) - 1;
        }
        resizeToHitDepth();
        this.hitDepth = i4;
    }

    @Override // java.util.List
    @NotNull
    public List<T> subList(int i2, int i3) {
        return new SubList(this, i2, i3);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }
}
