package androidx.emoji2.text.flatbuffer;

import java.util.Arrays;
import kotlin.UByte;

/* loaded from: classes.dex */
public class ArrayReadWriteBuf implements ReadWriteBuf {
    private byte[] buffer;
    private int writePos;

    public ArrayReadWriteBuf() {
        this(10);
    }

    public ArrayReadWriteBuf(int i2) {
        this(new byte[i2]);
    }

    public ArrayReadWriteBuf(byte[] bArr) {
        this.buffer = bArr;
        this.writePos = 0;
    }

    public ArrayReadWriteBuf(byte[] bArr, int i2) {
        this.buffer = bArr;
        this.writePos = i2;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte[] data() {
        return this.buffer;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte get(int i2) {
        return this.buffer[i2];
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public boolean getBoolean(int i2) {
        return this.buffer[i2] != 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public double getDouble(int i2) {
        return Double.longBitsToDouble(getLong(i2));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public float getFloat(int i2) {
        return Float.intBitsToFloat(getInt(i2));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public int getInt(int i2) {
        byte[] bArr = this.buffer;
        return (bArr[i2] & UByte.MAX_VALUE) | (bArr[i2 + 3] << 24) | ((bArr[i2 + 2] & UByte.MAX_VALUE) << 16) | ((bArr[i2 + 1] & UByte.MAX_VALUE) << 8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public long getLong(int i2) {
        byte[] bArr = this.buffer;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        return (bArr[i8 + 1] << 56) | (bArr[i2] & 255) | ((bArr[i3] & 255) << 8) | ((bArr[i4] & 255) << 16) | ((bArr[i5] & 255) << 24) | ((bArr[i6] & 255) << 32) | ((bArr[i7] & 255) << 40) | ((255 & bArr[i8]) << 48);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public short getShort(int i2) {
        byte[] bArr = this.buffer;
        return (short) ((bArr[i2] & UByte.MAX_VALUE) | (bArr[i2 + 1] << 8));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public String getString(int i2, int i3) {
        return Utf8Safe.decodeUtf8Array(this.buffer, i2, i3);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf, androidx.emoji2.text.flatbuffer.ReadBuf
    public int limit() {
        return this.writePos;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte b2) {
        set(this.writePos, b2);
        this.writePos++;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte[] bArr, int i2, int i3) {
        set(this.writePos, bArr, i2, i3);
        this.writePos += i3;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putBoolean(boolean z) {
        setBoolean(this.writePos, z);
        this.writePos++;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putDouble(double d2) {
        setDouble(this.writePos, d2);
        this.writePos += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putFloat(float f2) {
        setFloat(this.writePos, f2);
        this.writePos += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putInt(int i2) {
        setInt(this.writePos, i2);
        this.writePos += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putLong(long j2) {
        setLong(this.writePos, j2);
        this.writePos += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putShort(short s2) {
        setShort(this.writePos, s2);
        this.writePos += 2;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public boolean requestCapacity(int i2) {
        byte[] bArr = this.buffer;
        if (bArr.length > i2) {
            return true;
        }
        int length = bArr.length;
        this.buffer = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int i2, byte b2) {
        requestCapacity(i2 + 1);
        this.buffer[i2] = b2;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void set(int i2, byte[] bArr, int i3, int i4) {
        requestCapacity((i4 - i3) + i2);
        System.arraycopy(bArr, i3, this.buffer, i2, i4);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setBoolean(int i2, boolean z) {
        set(i2, z ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setDouble(int i2, double d2) {
        requestCapacity(i2 + 8);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d2);
        int i3 = (int) doubleToRawLongBits;
        byte[] bArr = this.buffer;
        int i4 = i2 + 1;
        bArr[i2] = (byte) (i3 & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i3 >> 8) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i3 >> 16) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((i3 >> 24) & 255);
        int i8 = (int) (doubleToRawLongBits >> 32);
        int i9 = i7 + 1;
        bArr[i7] = (byte) (i8 & 255);
        int i10 = i9 + 1;
        bArr[i9] = (byte) ((i8 >> 8) & 255);
        bArr[i10] = (byte) ((i8 >> 16) & 255);
        bArr[i10 + 1] = (byte) ((i8 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setFloat(int i2, float f2) {
        requestCapacity(i2 + 4);
        int floatToRawIntBits = Float.floatToRawIntBits(f2);
        byte[] bArr = this.buffer;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (floatToRawIntBits & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((floatToRawIntBits >> 8) & 255);
        bArr[i4] = (byte) ((floatToRawIntBits >> 16) & 255);
        bArr[i4 + 1] = (byte) ((floatToRawIntBits >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setInt(int i2, int i3) {
        requestCapacity(i2 + 4);
        byte[] bArr = this.buffer;
        int i4 = i2 + 1;
        bArr[i2] = (byte) (i3 & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i3 >> 8) & 255);
        bArr[i5] = (byte) ((i3 >> 16) & 255);
        bArr[i5 + 1] = (byte) ((i3 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setLong(int i2, long j2) {
        requestCapacity(i2 + 8);
        int i3 = (int) j2;
        byte[] bArr = this.buffer;
        int i4 = i2 + 1;
        bArr[i2] = (byte) (i3 & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i3 >> 8) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i3 >> 16) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((i3 >> 24) & 255);
        int i8 = (int) (j2 >> 32);
        int i9 = i7 + 1;
        bArr[i7] = (byte) (i8 & 255);
        int i10 = i9 + 1;
        bArr[i9] = (byte) ((i8 >> 8) & 255);
        bArr[i10] = (byte) ((i8 >> 16) & 255);
        bArr[i10 + 1] = (byte) ((i8 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void setShort(int i2, short s2) {
        requestCapacity(i2 + 2);
        byte[] bArr = this.buffer;
        bArr[i2] = (byte) (s2 & 255);
        bArr[i2 + 1] = (byte) ((s2 >> 8) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public int writePosition() {
        return this.writePos;
    }
}
