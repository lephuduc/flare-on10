package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class UnionVector extends BaseVector {
    public UnionVector __assign(int i2, int i3, ByteBuffer byteBuffer) {
        __reset(i2, i3, byteBuffer);
        return this;
    }

    public Table get(Table table, int i2) {
        return Table.__union(table, __element(i2), this.bb);
    }
}
