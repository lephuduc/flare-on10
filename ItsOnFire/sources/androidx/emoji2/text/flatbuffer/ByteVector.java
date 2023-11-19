package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class ByteVector extends BaseVector {
    public ByteVector __assign(int i2, ByteBuffer byteBuffer) {
        __reset(i2, 1, byteBuffer);
        return this;
    }

    public byte get(int i2) {
        return this.bb.get(__element(i2));
    }

    public int getAsUnsigned(int i2) {
        return get(i2) & UByte.MAX_VALUE;
    }
}
