package androidx.emoji2.text.flatbuffer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.UByte;

/* loaded from: classes.dex */
public class FlatBufferBuilder {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public ByteBuffer bb;
    public ByteBufferFactory bb_factory;
    public boolean finished;
    public boolean force_defaults;
    public int minalign;
    public boolean nested;
    public int num_vtables;
    public int object_start;
    public int space;
    public final Utf8 utf8;
    public int vector_num_elems;
    public int[] vtable;
    public int vtable_in_use;
    public int[] vtables;

    /* loaded from: classes.dex */
    public static class ByteBufferBackedInputStream extends InputStream {
        public ByteBuffer buf;

        public ByteBufferBackedInputStream(ByteBuffer byteBuffer) {
            this.buf = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            try {
                return this.buf.get() & UByte.MAX_VALUE;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class ByteBufferFactory {
        public abstract ByteBuffer newByteBuffer(int i2);

        public void releaseByteBuffer(ByteBuffer byteBuffer) {
        }
    }

    /* loaded from: classes.dex */
    public static final class HeapByteBufferFactory extends ByteBufferFactory {
        public static final HeapByteBufferFactory INSTANCE = new HeapByteBufferFactory();

        @Override // androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory
        public ByteBuffer newByteBuffer(int i2) {
            return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public FlatBufferBuilder() {
        this(1024);
    }

    public FlatBufferBuilder(int i2) {
        this(i2, HeapByteBufferFactory.INSTANCE, null, Utf8.getDefault());
    }

    public FlatBufferBuilder(int i2, ByteBufferFactory byteBufferFactory) {
        this(i2, byteBufferFactory, null, Utf8.getDefault());
    }

    public FlatBufferBuilder(int i2, ByteBufferFactory byteBufferFactory, ByteBuffer byteBuffer, Utf8 utf8) {
        this.minalign = 1;
        this.vtable = null;
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.vtables = new int[16];
        this.num_vtables = 0;
        this.vector_num_elems = 0;
        this.force_defaults = false;
        i2 = i2 <= 0 ? 1 : i2;
        this.bb_factory = byteBufferFactory;
        if (byteBuffer != null) {
            this.bb = byteBuffer;
            byteBuffer.clear();
            this.bb.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.bb = byteBufferFactory.newByteBuffer(i2);
        }
        this.utf8 = utf8;
        this.space = this.bb.capacity();
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer) {
        this(byteBuffer, new HeapByteBufferFactory());
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        this(byteBuffer.capacity(), byteBufferFactory, byteBuffer, Utf8.getDefault());
    }

    @Deprecated
    private int dataStart() {
        finished();
        return this.space;
    }

    public static ByteBuffer growByteBuffer(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        int capacity = byteBuffer.capacity();
        if (((-1073741824) & capacity) == 0) {
            int i2 = capacity == 0 ? 1 : capacity << 1;
            byteBuffer.position(0);
            ByteBuffer newByteBuffer = byteBufferFactory.newByteBuffer(i2);
            newByteBuffer.position(newByteBuffer.clear().capacity() - capacity);
            newByteBuffer.put(byteBuffer);
            return newByteBuffer;
        }
        throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
    }

    public static boolean isFieldPresent(Table table, int i2) {
        return table.__offset(i2) != 0;
    }

    public void Nested(int i2) {
        if (i2 != offset()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void addBoolean(int i2, boolean z, boolean z2) {
        if (this.force_defaults || z != z2) {
            addBoolean(z);
            slot(i2);
        }
    }

    public void addBoolean(boolean z) {
        prep(1, 0);
        putBoolean(z);
    }

    public void addByte(byte b2) {
        prep(1, 0);
        putByte(b2);
    }

    public void addByte(int i2, byte b2, int i3) {
        if (this.force_defaults || b2 != i3) {
            addByte(b2);
            slot(i2);
        }
    }

    public void addDouble(double d2) {
        prep(8, 0);
        putDouble(d2);
    }

    public void addDouble(int i2, double d2, double d3) {
        if (this.force_defaults || d2 != d3) {
            addDouble(d2);
            slot(i2);
        }
    }

    public void addFloat(float f2) {
        prep(4, 0);
        putFloat(f2);
    }

    public void addFloat(int i2, float f2, double d2) {
        if (this.force_defaults || f2 != d2) {
            addFloat(f2);
            slot(i2);
        }
    }

    public void addInt(int i2) {
        prep(4, 0);
        putInt(i2);
    }

    public void addInt(int i2, int i3, int i4) {
        if (this.force_defaults || i3 != i4) {
            addInt(i3);
            slot(i2);
        }
    }

    public void addLong(int i2, long j2, long j3) {
        if (this.force_defaults || j2 != j3) {
            addLong(j2);
            slot(i2);
        }
    }

    public void addLong(long j2) {
        prep(8, 0);
        putLong(j2);
    }

    public void addOffset(int i2) {
        prep(4, 0);
        putInt((offset() - i2) + 4);
    }

    public void addOffset(int i2, int i3, int i4) {
        if (this.force_defaults || i3 != i4) {
            addOffset(i3);
            slot(i2);
        }
    }

    public void addShort(int i2, short s2, int i3) {
        if (this.force_defaults || s2 != i3) {
            addShort(s2);
            slot(i2);
        }
    }

    public void addShort(short s2) {
        prep(2, 0);
        putShort(s2);
    }

    public void addStruct(int i2, int i3, int i4) {
        if (i3 != i4) {
            Nested(i3);
            slot(i2);
        }
    }

    public void clear() {
        this.space = this.bb.capacity();
        this.bb.clear();
        this.minalign = 1;
        while (true) {
            int i2 = this.vtable_in_use;
            if (i2 <= 0) {
                this.vtable_in_use = 0;
                this.nested = false;
                this.finished = false;
                this.object_start = 0;
                this.num_vtables = 0;
                this.vector_num_elems = 0;
                return;
            }
            int[] iArr = this.vtable;
            int i3 = i2 - 1;
            this.vtable_in_use = i3;
            iArr[i3] = 0;
        }
    }

    public int createByteVector(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        startVector(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.bb;
        int i2 = this.space - remaining;
        this.space = i2;
        byteBuffer2.position(i2);
        this.bb.put(byteBuffer);
        return endVector();
    }

    public int createByteVector(byte[] bArr) {
        int length = bArr.length;
        startVector(1, length, 1);
        ByteBuffer byteBuffer = this.bb;
        int i2 = this.space - length;
        this.space = i2;
        byteBuffer.position(i2);
        this.bb.put(bArr);
        return endVector();
    }

    public int createByteVector(byte[] bArr, int i2, int i3) {
        startVector(1, i3, 1);
        ByteBuffer byteBuffer = this.bb;
        int i4 = this.space - i3;
        this.space = i4;
        byteBuffer.position(i4);
        this.bb.put(bArr, i2, i3);
        return endVector();
    }

    public <T extends Table> int createSortedVectorOfTables(T t2, int[] iArr) {
        t2.sortTables(iArr, this.bb);
        return createVectorOfTables(iArr);
    }

    public int createString(CharSequence charSequence) {
        int encodedLength = this.utf8.encodedLength(charSequence);
        addByte((byte) 0);
        startVector(1, encodedLength, 1);
        ByteBuffer byteBuffer = this.bb;
        int i2 = this.space - encodedLength;
        this.space = i2;
        byteBuffer.position(i2);
        this.utf8.encodeUtf8(charSequence, this.bb);
        return endVector();
    }

    public int createString(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        addByte((byte) 0);
        startVector(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.bb;
        int i2 = this.space - remaining;
        this.space = i2;
        byteBuffer2.position(i2);
        this.bb.put(byteBuffer);
        return endVector();
    }

    public ByteBuffer createUnintializedVector(int i2, int i3, int i4) {
        int i5 = i2 * i3;
        startVector(i2, i3, i4);
        ByteBuffer byteBuffer = this.bb;
        int i6 = this.space - i5;
        this.space = i6;
        byteBuffer.position(i6);
        ByteBuffer order = this.bb.slice().order(ByteOrder.LITTLE_ENDIAN);
        order.limit(i5);
        return order;
    }

    public int createVectorOfTables(int[] iArr) {
        notNested();
        startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            addOffset(iArr[length]);
        }
        return endVector();
    }

    public ByteBuffer dataBuffer() {
        finished();
        return this.bb;
    }

    public int endTable() {
        int i2;
        if (this.vtable == null || !this.nested) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        addInt(0);
        int offset = offset();
        int i3 = this.vtable_in_use - 1;
        while (i3 >= 0 && this.vtable[i3] == 0) {
            i3--;
        }
        int i4 = i3 + 1;
        while (i3 >= 0) {
            int i5 = this.vtable[i3];
            addShort((short) (i5 != 0 ? offset - i5 : 0));
            i3--;
        }
        addShort((short) (offset - this.object_start));
        addShort((short) ((i4 + 2) * 2));
        int i6 = 0;
        loop2: while (true) {
            if (i6 >= this.num_vtables) {
                i2 = 0;
                break;
            }
            int capacity = this.bb.capacity() - this.vtables[i6];
            int i7 = this.space;
            short s2 = this.bb.getShort(capacity);
            if (s2 == this.bb.getShort(i7)) {
                for (int i8 = 2; i8 < s2; i8 += 2) {
                    if (this.bb.getShort(capacity + i8) != this.bb.getShort(i7 + i8)) {
                        break;
                    }
                }
                i2 = this.vtables[i6];
                break loop2;
            }
            i6++;
        }
        if (i2 != 0) {
            int capacity2 = this.bb.capacity() - offset;
            this.space = capacity2;
            this.bb.putInt(capacity2, i2 - offset);
        } else {
            int i9 = this.num_vtables;
            int[] iArr = this.vtables;
            if (i9 == iArr.length) {
                this.vtables = Arrays.copyOf(iArr, i9 * 2);
            }
            int[] iArr2 = this.vtables;
            int i10 = this.num_vtables;
            this.num_vtables = i10 + 1;
            iArr2[i10] = offset();
            ByteBuffer byteBuffer = this.bb;
            byteBuffer.putInt(byteBuffer.capacity() - offset, offset() - offset);
        }
        this.nested = false;
        return offset;
    }

    public int endVector() {
        if (this.nested) {
            this.nested = false;
            putInt(this.vector_num_elems);
            return offset();
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    public void finish(int i2) {
        finish(i2, false);
    }

    public void finish(int i2, String str) {
        finish(i2, str, false);
    }

    public void finish(int i2, String str, boolean z) {
        prep(this.minalign, (z ? 4 : 0) + 8);
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i3 = 3; i3 >= 0; i3--) {
            addByte((byte) str.charAt(i3));
        }
        finish(i2, z);
    }

    public void finish(int i2, boolean z) {
        prep(this.minalign, (z ? 4 : 0) + 4);
        addOffset(i2);
        if (z) {
            addInt(this.bb.capacity() - this.space);
        }
        this.bb.position(this.space);
        this.finished = true;
    }

    public void finishSizePrefixed(int i2) {
        finish(i2, true);
    }

    public void finishSizePrefixed(int i2, String str) {
        finish(i2, str, true);
    }

    public void finished() {
        if (!this.finished) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public FlatBufferBuilder forceDefaults(boolean z) {
        this.force_defaults = z;
        return this;
    }

    public FlatBufferBuilder init(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        this.bb_factory = byteBufferFactory;
        this.bb = byteBuffer;
        byteBuffer.clear();
        this.bb.order(ByteOrder.LITTLE_ENDIAN);
        this.minalign = 1;
        this.space = this.bb.capacity();
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.object_start = 0;
        this.num_vtables = 0;
        this.vector_num_elems = 0;
        return this;
    }

    public void notNested() {
        if (this.nested) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int offset() {
        return this.bb.capacity() - this.space;
    }

    public void pad(int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBuffer = this.bb;
            int i4 = this.space - 1;
            this.space = i4;
            byteBuffer.put(i4, (byte) 0);
        }
    }

    public void prep(int i2, int i3) {
        if (i2 > this.minalign) {
            this.minalign = i2;
        }
        int i4 = ((~((this.bb.capacity() - this.space) + i3)) + 1) & (i2 - 1);
        while (this.space < i4 + i2 + i3) {
            int capacity = this.bb.capacity();
            ByteBuffer byteBuffer = this.bb;
            ByteBuffer growByteBuffer = growByteBuffer(byteBuffer, this.bb_factory);
            this.bb = growByteBuffer;
            if (byteBuffer != growByteBuffer) {
                this.bb_factory.releaseByteBuffer(byteBuffer);
            }
            this.space += this.bb.capacity() - capacity;
        }
        pad(i4);
    }

    public void putBoolean(boolean z) {
        ByteBuffer byteBuffer = this.bb;
        int i2 = this.space - 1;
        this.space = i2;
        byteBuffer.put(i2, z ? (byte) 1 : (byte) 0);
    }

    public void putByte(byte b2) {
        ByteBuffer byteBuffer = this.bb;
        int i2 = this.space - 1;
        this.space = i2;
        byteBuffer.put(i2, b2);
    }

    public void putDouble(double d2) {
        ByteBuffer byteBuffer = this.bb;
        int i2 = this.space - 8;
        this.space = i2;
        byteBuffer.putDouble(i2, d2);
    }

    public void putFloat(float f2) {
        ByteBuffer byteBuffer = this.bb;
        int i2 = this.space - 4;
        this.space = i2;
        byteBuffer.putFloat(i2, f2);
    }

    public void putInt(int i2) {
        ByteBuffer byteBuffer = this.bb;
        int i3 = this.space - 4;
        this.space = i3;
        byteBuffer.putInt(i3, i2);
    }

    public void putLong(long j2) {
        ByteBuffer byteBuffer = this.bb;
        int i2 = this.space - 8;
        this.space = i2;
        byteBuffer.putLong(i2, j2);
    }

    public void putShort(short s2) {
        ByteBuffer byteBuffer = this.bb;
        int i2 = this.space - 2;
        this.space = i2;
        byteBuffer.putShort(i2, s2);
    }

    public void required(int i2, int i3) {
        int capacity = this.bb.capacity() - i2;
        if (this.bb.getShort((capacity - this.bb.getInt(capacity)) + i3) != 0) {
            return;
        }
        throw new AssertionError("FlatBuffers: field " + i3 + " must be set");
    }

    public byte[] sizedByteArray() {
        return sizedByteArray(this.space, this.bb.capacity() - this.space);
    }

    public byte[] sizedByteArray(int i2, int i3) {
        finished();
        byte[] bArr = new byte[i3];
        this.bb.position(i2);
        this.bb.get(bArr);
        return bArr;
    }

    public InputStream sizedInputStream() {
        finished();
        ByteBuffer duplicate = this.bb.duplicate();
        duplicate.position(this.space);
        duplicate.limit(this.bb.capacity());
        return new ByteBufferBackedInputStream(duplicate);
    }

    public void slot(int i2) {
        this.vtable[i2] = offset();
    }

    public void startTable(int i2) {
        notNested();
        int[] iArr = this.vtable;
        if (iArr == null || iArr.length < i2) {
            this.vtable = new int[i2];
        }
        this.vtable_in_use = i2;
        Arrays.fill(this.vtable, 0, i2, 0);
        this.nested = true;
        this.object_start = offset();
    }

    public void startVector(int i2, int i3, int i4) {
        notNested();
        this.vector_num_elems = i3;
        int i5 = i2 * i3;
        prep(4, i5);
        prep(i4, i5);
        this.nested = true;
    }
}
