package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class Struct {
    public ByteBuffer bb;
    public int bb_pos;

    public void __reset() {
        __reset(0, null);
    }

    public void __reset(int i2, ByteBuffer byteBuffer) {
        this.bb = byteBuffer;
        if (byteBuffer == null) {
            i2 = 0;
        }
        this.bb_pos = i2;
    }
}
