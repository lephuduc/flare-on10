package androidx.collection;

/* loaded from: classes.dex */
public final class CircularArray<E> {
    private int mCapacityBitmask;
    private E[] mElements;
    private int mHead;
    private int mTail;

    public CircularArray() {
        this(8);
    }

    public CircularArray(int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i2 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i2 = Integer.bitCount(i2) != 1 ? Integer.highestOneBit(i2 - 1) << 1 : i2;
        this.mCapacityBitmask = i2 - 1;
        this.mElements = (E[]) new Object[i2];
    }

    private void doubleCapacity() {
        E[] eArr = this.mElements;
        int length = eArr.length;
        int i2 = this.mHead;
        int i3 = length - i2;
        int i4 = length << 1;
        if (i4 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i4];
        System.arraycopy(eArr, i2, eArr2, 0, i3);
        System.arraycopy(this.mElements, 0, eArr2, i3, this.mHead);
        this.mElements = eArr2;
        this.mHead = 0;
        this.mTail = length;
        this.mCapacityBitmask = i4 - 1;
    }

    public void addFirst(E e2) {
        int i2 = (this.mHead - 1) & this.mCapacityBitmask;
        this.mHead = i2;
        this.mElements[i2] = e2;
        if (i2 == this.mTail) {
            doubleCapacity();
        }
    }

    public void addLast(E e2) {
        E[] eArr = this.mElements;
        int i2 = this.mTail;
        eArr[i2] = e2;
        int i3 = this.mCapacityBitmask & (i2 + 1);
        this.mTail = i3;
        if (i3 == this.mHead) {
            doubleCapacity();
        }
    }

    public void clear() {
        removeFromStart(size());
    }

    public E get(int i2) {
        if (i2 < 0 || i2 >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[this.mCapacityBitmask & (this.mHead + i2)];
    }

    public E getFirst() {
        int i2 = this.mHead;
        if (i2 != this.mTail) {
            return this.mElements[i2];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E getLast() {
        int i2 = this.mHead;
        int i3 = this.mTail;
        if (i2 != i3) {
            return this.mElements[this.mCapacityBitmask & (i3 - 1)];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean isEmpty() {
        return this.mHead == this.mTail;
    }

    public E popFirst() {
        int i2 = this.mHead;
        if (i2 != this.mTail) {
            E[] eArr = this.mElements;
            E e2 = eArr[i2];
            eArr[i2] = null;
            this.mHead = (i2 + 1) & this.mCapacityBitmask;
            return e2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E popLast() {
        int i2 = this.mHead;
        int i3 = this.mTail;
        if (i2 != i3) {
            int i4 = this.mCapacityBitmask & (i3 - 1);
            E[] eArr = this.mElements;
            E e2 = eArr[i4];
            eArr[i4] = null;
            this.mTail = i4;
            return e2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void removeFromEnd(int i2) {
        int i3;
        if (i2 <= 0) {
            return;
        }
        if (i2 > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = this.mTail;
        int i5 = i2 < i4 ? i4 - i2 : 0;
        int i6 = i5;
        while (true) {
            i3 = this.mTail;
            if (i6 >= i3) {
                break;
            }
            this.mElements[i6] = null;
            i6++;
        }
        int i7 = i3 - i5;
        int i8 = i2 - i7;
        this.mTail = i3 - i7;
        if (i8 > 0) {
            int length = this.mElements.length;
            this.mTail = length;
            int i9 = length - i8;
            for (int i10 = i9; i10 < this.mTail; i10++) {
                this.mElements[i10] = null;
            }
            this.mTail = i9;
        }
    }

    public void removeFromStart(int i2) {
        if (i2 <= 0) {
            return;
        }
        if (i2 > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.mElements.length;
        int i3 = this.mHead;
        if (i2 < length - i3) {
            length = i3 + i2;
        }
        while (i3 < length) {
            this.mElements[i3] = null;
            i3++;
        }
        int i4 = this.mHead;
        int i5 = length - i4;
        int i6 = i2 - i5;
        this.mHead = this.mCapacityBitmask & (i4 + i5);
        if (i6 > 0) {
            for (int i7 = 0; i7 < i6; i7++) {
                this.mElements[i7] = null;
            }
            this.mHead = i6;
        }
    }

    public int size() {
        return this.mCapacityBitmask & (this.mTail - this.mHead);
    }
}
