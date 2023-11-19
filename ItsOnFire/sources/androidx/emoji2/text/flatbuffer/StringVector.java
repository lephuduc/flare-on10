package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class StringVector extends BaseVector {
    private Utf8 utf8 = Utf8.getDefault();

    public StringVector __assign(int i2, int i3, ByteBuffer byteBuffer) {
        __reset(i2, i3, byteBuffer);
        return this;
    }

    public String get(int i2) {
        return Table.__string(__element(i2), this.bb, this.utf8);
    }
}
