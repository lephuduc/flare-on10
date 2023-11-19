package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class DoubleVector extends BaseVector {
    public DoubleVector __assign(int i2, ByteBuffer byteBuffer) {
        __reset(i2, 8, byteBuffer);
        return this;
    }

    public double get(int i2) {
        return this.bb.getDouble(__element(i2));
    }
}
