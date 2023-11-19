package androidx.collection;

/* loaded from: classes.dex */
public final class CircularIntArray {
    private int mCapacityBitmask;
    private int[] mElements;
    private int mHead;
    private int mTail;

    public CircularIntArray() {
        this(8);
    }

    public CircularIntArray(int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i2 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i2 = Integer.bitCount(i2) != 1 ? Integer.highestOneBit(i2 - 1) << 1 : i2;
        this.mCapacityBitmask = i2 - 1;
        this.mElements = new int[i2];
    }

    private void doubleCapacity() {
        int[] iArr = this.mElements;
        int length = iArr.length;
        int i2 = this.mHead;
        int i3 = length - i2;
        int i4 = length << 1;
        if (i4 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i4];
        System.arraycopy(iArr, i2, iArr2, 0, i3);
        System.arraycopy(this.mElements, 0, iArr2, i3, this.mHead);
        this.mElements = iArr2;
        this.mHead = 0;
        this.mTail = length;
        this.mCapacityBitmask = i4 - 1;
    }

    public void addFirst(int i2) {
        int i3 = (this.mHead - 1) & this.mCapacityBitmask;
        this.mHead = i3;
        this.mElements[i3] = i2;
        if (i3 == this.mTail) {
            doubleCapacity();
        }
    }

    public void addLast(int i2) {
        int[] iArr = this.mElements;
        int i3 = this.mTail;
        iArr[i3] = i2;
        int i4 = this.mCapacityBitmask & (i3 + 1);
        this.mTail = i4;
        if (i4 == this.mHead) {
            doubleCapacity();
        }
    }

    public void clear() {
        this.mTail = this.mHead;
    }

    public int get(int i2) {
        if (i2 < 0 || i2 >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[this.mCapacityBitmask & (this.mHead + i2)];
    }

    public int getFirst() {
        int i2 = this.mHead;
        if (i2 != this.mTail) {
            return this.mElements[i2];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int getLast() {
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

    public int popFirst() {
        int i2 = this.mHead;
        if (i2 != this.mTail) {
            int i3 = this.mElements[i2];
            this.mHead = (i2 + 1) & this.mCapacityBitmask;
            return i3;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int popLast() {
        int i2 = this.mHead;
        int i3 = this.mTail;
        if (i2 != i3) {
            int i4 = this.mCapacityBitmask & (i3 - 1);
            int i5 = this.mElements[i4];
            this.mTail = i4;
            return i5;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void removeFromEnd(int i2) {
        if (i2 <= 0) {
            return;
        }
        if (i2 > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.mTail = this.mCapacityBitmask & (this.mTail - i2);
    }

    public void removeFromStart(int i2) {
        if (i2 <= 0) {
            return;
        }
        if (i2 > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.mHead = this.mCapacityBitmask & (this.mHead + i2);
    }

    public int size() {
        return this.mCapacityBitmask & (this.mTail - this.mHead);
    }
}
