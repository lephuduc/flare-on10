package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class IntVector extends BaseVector {
    public IntVector __assign(int i2, ByteBuffer byteBuffer) {
        __reset(i2, 4, byteBuffer);
        return this;
    }

    public int get(int i2) {
        return this.bb.getInt(__element(i2));
    }

    public long getAsUnsigned(int i2) {
        return get(i2) & 4294967295L;
    }
}
