package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class BaseVector {
    public ByteBuffer bb;
    private int element_size;
    private int length;
    private int vector;

    public int __element(int i2) {
        return this.vector + (i2 * this.element_size);
    }

    public void __reset(int i2, int i3, ByteBuffer byteBuffer) {
        this.bb = byteBuffer;
        if (byteBuffer != null) {
            this.vector = i2;
            this.length = byteBuffer.getInt(i2 - 4);
            this.element_size = i3;
            return;
        }
        this.vector = 0;
        this.length = 0;
        this.element_size = 0;
    }

    public int __vector() {
        return this.vector;
    }

    public int length() {
        return this.length;
    }

    public void reset() {
        __reset(0, 0, null);
    }
}
